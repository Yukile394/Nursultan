package minecraft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class class02003<T> {
   private final List<T> N;
   private final List<class01022> y;
   private final class01022 L;

   public class01022 L(T var1) {
      int i = this.u((T)var1);
      return this.N(i, this.y.size());
   }

   public class02003(List<T> var1) {
      this(var1, class07536.N(() -> {
         class01022[] aclass01022 = new class01022[var1.size()];
         Arrays.fill(aclass01022, class01042.y);
         return Arrays.asList(aclass01022);
      }));
   }

   private class02003(List<T> var1, List<class01022> var2) {
      super();
      this.N = List.copyOf(var1);
      this.y = List.copyOf(var2);
      this.L = new class01014(N(var2.stream())).method_40316();
   }

   private int u(T var1) {
      int i = this.N.indexOf(var1);
      if (i == -1) {
         throw new IllegalStateException("Can't find " + var1 + " inside " + this.N);
      } else {
         return i;
      }
   }

   public class01022 y(T var1) {
      int i = this.u((T)var1);
      return this.N(0, i);
   }

   private static Map<class05946<? extends class00751<?>>, class00751<?>> N(Stream<? extends class01042> var0) {
      HashMap hashmap = new HashMap();
      var0.forEach(var1x -> var1x.method_40311().forEach(var1xx -> {
         if (hashmap.put(var1xx.N(), var1xx.y()) != null) {
            throw new IllegalStateException("Duplicated registry " + var1xx.N());
         }
      }));
      return hashmap;
   }

   public class01022 N() {
      return this.L;
   }

   public class01022 N(T var1) {
      int i = this.u((T)var1);
      return this.y.get(i);
   }

   private class01022 N(int var1, int var2) {
      return new class01014(N(this.y.subList(var1, var2).stream())).method_40316();
   }

   public class02003<T> N(T var1, class01022... var2) {
      return this.N((T)var1, Arrays.asList(var2));
   }

   public class02003<T> N(T var1, List<class01022> var2) {
      int i = this.u((T)var1);
      if (var2.size() > this.y.size() - i) {
         throw new IllegalStateException("Too many values to replace");
      } else {
         ArrayList arraylist = new ArrayList();

         for (int j = 0; j < i; j++) {
            arraylist.add(this.y.get(j));
         }

         arraylist.addAll(var2);

         while (arraylist.size() < this.y.size()) {
            arraylist.add(class01042.y);
         }

         return new class02003<>(this.N, arraylist);
      }
   }
}
