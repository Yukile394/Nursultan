package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public final class class03197<T> {
   private static final int N = 6;
   private final class03235<T> y;
   private final ThreadLocal<class03211<T>> L = new ThreadLocal<>();

   private static <T> List<class03198<T>> L(List<? extends class03235<T>> var0) {
      ArrayList arraylist = Lists.newArrayList();
      ArrayList arraylist1 = Lists.newArrayList();
      int i = (int)Math.pow(6.0, Math.floor(Math.log(var0.size() - 0.01) / Math.log(6.0)));

      for (class03235 class03235 : var0) {
         arraylist1.add(class03235);
         if (arraylist1.size() >= i) {
            arraylist.add(new class03198(arraylist1));
            arraylist1 = Lists.newArrayList();
         }
      }

      if (!arraylist1.isEmpty()) {
         arraylist.add(new class03198(arraylist1));
      }

      return arraylist;
   }

   private class03197(class03235<T> var1) {
      super();
      this.y = var1;
   }

   static <T> List<class03195> y(List<? extends class03235<T>> var0) {
      if (var0.isEmpty()) {
         throw new IllegalArgumentException("SubTree needs at least one child");
      } else {
         byte b0 = 7;
         ArrayList arraylist = Lists.newArrayList();

         for (int i = 0; i < 7; i++) {
            arraylist.add(null);
         }

         for (class03235 class03235 : var0) {
            for (int j = 0; j < 7; j++) {
               arraylist.set(j, class03235.y[j].y((class03195)arraylist.get(j)));
            }
         }

         return arraylist;
      }
   }

   public T N(class03231 var1, class03200<T> var2) {
      long[] along = var1.N();
      class03211 class03211 = this.y.N(along, this.L.get(), var2);
      this.L.set(class03211);
      return class03211.N;
   }

   public static <T> class03197<T> N(List<Pair<class03229, T>> var0) {
      if (var0.isEmpty()) {
         throw new IllegalArgumentException("Need at least one value to build the search tree.");
      } else {
         int i = ((class03229)((Pair)var0.get(0)).getFirst()).N().size();
         if (i != 7) {
            throw new IllegalStateException("Expecting parameter space to be 7, got " + i);
         } else {
            List list = var0.stream()
               .map(var0x -> new class03211<>((class03229)var0x.getFirst(), var0x.getSecond()))
               .collect(Collectors.toCollection(ArrayList::new));
            return new class03197<>(N(i, list));
         }
      }
   }

   private static <T> class03235<T> N(int var0, List<? extends class03235<T>> var1) {
      if (var1.isEmpty()) {
         throw new IllegalStateException("Need at least one child to build a node");
      } else if (var1.size() == 1) {
         return (class03235<T>)var1.get(0);
      } else if (var1.size() <= 6) {
         var1.sort(Comparator.comparingLong(var1x -> {
            long ix = 0L;

            for (int jx = 0; jx < var0; jx++) {
               class03195 class03195 = var1x.y[jx];
               ix += Math.abs((class03195.N() + class03195.y()) / 2L);
            }

            return ix;
         }));
         return new class03198<>(var1);
      } else {
         long i = Long.MAX_VALUE;
         int j = -1;
         List list = null;

         for (int k = 0; k < var0; k++) {
            N(var1, var0, k, false);
            List list1 = L(var1);
            long l = 0L;

            for (class03198 class03198 : list1) {
               l += N(class03198.y);
            }

            if (i > l) {
               i = l;
               j = k;
               list = list1;
            }
         }

         N(list, var0, j, true);
         return new class03198<>(list.stream().map(var1x -> N(var0, Arrays.asList(var1x.N))).collect(Collectors.toList()));
      }
   }

   private static <T> void N(List<? extends class03235<T>> var0, int var1, int var2, boolean var3) {
      Comparator comparator = N(var2, var3);

      for (int i = 1; i < var1; i++) {
         comparator = comparator.thenComparing(N((var2 + i) % var1, var3));
      }

      var0.sort(comparator);
   }

   private static <T> Comparator<class03235<T>> N(int var0, boolean var1) {
      return Comparator.comparingLong(var2 -> {
         class03195 class03195 = var2.y[var0];
         long i = (class03195.N() + class03195.y()) / 2L;
         return var1 ? Math.abs(i) : i;
      });
   }

   private static long N(class03195[] var0) {
      long i = 0L;

      for (class03195 class03195 : var0) {
         i += Math.abs(class03195.y() - class03195.N());
      }

      return i;
   }
}
