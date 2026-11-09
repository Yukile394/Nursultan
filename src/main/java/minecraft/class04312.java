package minecraft;

import Nursultan.class10336;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class class04312<T> implements class04298<T> {
   private static final Comparator<class04310<?>> N = (var0, var1) -> class04309.y.compare(var0.y(), var1.y());
   private final LongPredicate y;
   private final Long2ObjectMap<class04310<T>> L = new Long2ObjectOpenHashMap();
   private final Long2LongMap u = class07536.N(new Long2LongOpenHashMap(), var0 -> var0.defaultReturnValue(Long.MAX_VALUE));
   private final Queue<class04310<T>> i = new PriorityQueue<>(N);
   private final Queue<class04309<T>> R = new ArrayDeque<>();
   private final List<class04309<T>> M = new ArrayList<>();
   private final Set<class04309<?>> B = new ObjectOpenCustomHashSet(class04309.L);
   private final BiConsumer<class04310<T>, class04309<T>> Z = (var1x, var2) -> {
      if (var2.equals(var1x.y())) {
         this.y(var2);
      }
   };

   private void L(class04309<T> var1) {
      this.R.add(var1);
   }

   private void L() {
      this.R.clear();
      this.i.clear();
      this.M.clear();
      this.B.clear();
   }

   public class04312(LongPredicate var1) {
      super();
      this.y = var1;
   }

   private void u() {
      if (this.B.isEmpty() && !this.R.isEmpty()) {
         this.B.addAll(this.R);
      }
   }

   private void y() {
      for (class04310 class04310 : this.i) {
         this.y(class04310.y());
      }
   }

   private void y(class04309<T> var1) {
      this.u.put(class07321.N(var1.y()), var1.L());
   }

   @Override
   public boolean y(class07209 var1, T var2) {
      this.u();
      return this.B.contains(class04309.N(var2, var1));
   }

   public void N(class04312<T> var1, class05163 var2, class00753 var3) {
      ArrayList arraylist = new ArrayList();
      Predicate predicate = var1x -> var2.y(var1x.y());
      var1.M.stream().filter(predicate).forEach(arraylist::add);
      var1.R.stream().filter(predicate).forEach(arraylist::add);
      var1.N(var2, (var2x, var4x) -> var4x.u().filter(predicate).forEach(arraylist::add));
      LongSummaryStatistics longsummarystatistics = arraylist.stream().mapToLong(class04309::i).summaryStatistics();
      long ix = longsummarystatistics.getMin();
      long j = longsummarystatistics.getMax();
      arraylist.forEach(var6x -> this.N(new class04309<>((T)var6x.N(), var6x.y().method_10081(var3), var6x.L(), var6x.u(), var6x.i() - ix + j + 1L)));
   }

   @Override
   public int N() {
      return this.L.values().stream().mapToInt(class04334::N).sum();
   }

   public void N(class05163 var1, class00753 var2) {
      this.N(this, var1, var2);
   }

   public void N(long var1, int var3, BiConsumer<class07209, T> var4) {
      class04643 class04643 = class08700.N();
      class04643.N("collect");
      this.N(var1, var3, class04643);
      class04643.y("run");
      class04643.N("ticksToRun", this.R.size());
      this.N(var4);
      class04643.y("cleanup");
      this.L();
      class04643.L();
   }

   private boolean N(int var1) {
      return this.R.size() < var1;
   }

   @Override
   public void N(class04309<T> var1) {
      long ix = class07321.N(var1.y());
      class04310 class04310 = (class04310)this.L.get(ix);
      if (class04310 == null) {
         class07536.y("Trying to schedule tick in not loaded position " + var1.y());
      } else {
         class04310.N(var1);
      }
   }

   private void N(Queue<class04310<T>> var1, class04310<T> var2, long var3, int var5) {
      if (this.N(var5)) {
         class04310 class04310 = (class04310)var1.peek();
         class04309 class04309x = class04310 != null ? class04310.y() : null;

         while (this.N(var5)) {
            class04309 class04309x = var2.y();
            if (class04309x == null || class04309x.L() > var3 || class04309x != null && class04309.y.compare(class04309x, class04309x) > 0) {
               break;
            }

            var2.L();
            this.L(class04309x);
         }
      }
   }

   private void N(long var1, int var3) {
      class04310 class04310;
      while (this.N(var3) && (class04310 = this.i.poll()) != null) {
         class04309 class04309x = class04310.L();
         this.L(class04309x);
         this.N(this.i, class04310, var1, var3);
         class04309 class04309x = class04310.y();
         if (class04309x != null) {
            if (class04309x.L() <= var1 && this.N(var3)) {
               this.i.add(class04310);
            } else {
               this.y(class04309x);
            }
         }
      }
   }

   private void N(long var1) {
      ObjectIterator<Entry> objectiterator = Long2LongMaps.fastIterator(this.u);

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         long ix = entry.getLongKey();
         if (entry.getLongValue() <= var1) {
            class04310 class04310 = (class04310)this.L.get(ix);
            if (class04310 == null) {
               objectiterator.remove();
            } else {
               class04309 class04309 = class04310.y();
               if (class04309 == null) {
                  objectiterator.remove();
               } else if (class04309.L() > var1) {
                  entry.setValue(class04309.L());
               } else if (this.y.test(ix)) {
                  objectiterator.remove();
                  this.i.add(class04310);
               }
            }
         }
      }
   }

   private void N(long var1, int var3, class04643 var4) {
      this.N(var1);
      var4.N("containersToTick", this.i.size());
      this.N(var1, var3);
      this.y();
   }

   public void N(class05163 var1) {
      Predicate predicate = var1x -> var1.y(var1x.y());
      this.N(var1, (var2x, var4) -> {
         class04309 class04309x = var4.y();
         var4.N(predicate);
         class04309 class04309x = var4.y();
         if (class04309x != class04309x) {
            if (class04309x != null) {
               this.y(class04309x);
            } else {
               this.u.remove(var2x);
            }
         }
      });
      this.M.removeIf(predicate);
      this.R.removeIf(predicate);
   }

   private void N(class05163 var1, class10336<T> var2) {
      int ix = class01296.N((double)var1.B());
      int j = class01296.N((double)var1.z());
      int k = class01296.N((double)var1.U());
      int l = class01296.N((double)var1.W());

      for (int i1 = ix; i1 <= k; i1++) {
         for (int j1 = j; j1 <= l; j1++) {
            long k1 = class07321.u(i1, j1);
            class04310 class04310 = (class04310)this.L.get(k1);
            if (class04310 != null) {
               var2.accept(k1, class04310);
            }
         }
      }
   }

   public void N(class07321 var1, class04310<T> var2) {
      long ix = var1.y();
      this.L.put(ix, var2);
      class04309 class04309 = var2.y();
      if (class04309 != null) {
         this.u.put(ix, class04309.L());
      }

      var2.N(this.Z);
   }

   @Override
   public boolean N(class07209 var1, T var2) {
      class04310 class04310 = (class04310)this.L.get(class07321.N(var1));
      return class04310 != null && class04310.N(var1, var2);
   }

   public void N(class07321 var1) {
      long ix = var1.y();
      class04310 class04310 = (class04310)this.L.remove(ix);
      this.u.remove(ix);
      if (class04310 != null) {
         class04310.N(null);
      }
   }

   private void N(BiConsumer<class07209, T> var1) {
      while (!this.R.isEmpty()) {
         class04309 class04309 = this.R.poll();
         if (!this.B.isEmpty()) {
            this.B.remove(class04309);
         }

         this.M.add(class04309);
         var1.accept(class04309.y(), class04309.N());
      }
   }
}
