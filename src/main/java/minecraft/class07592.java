package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class class07592<T> {
   private final Optional<Integer> N;
   private final class00610<T> y;
   private final List<class07599<T>> L;

   private long L(long var1) {
      return this.N.isPresent() ? Math.floorMod(var1, this.N.get()) : var1;
   }

   class07592(class07606<T> var1, Optional<Integer> var2, class00610<T> var3) {
      super();
      this.N = var2;
      this.y = var3;
      this.L = N(var1, var2);
   }

   private class07599<T> y(long var1) {
      for (class07599 class07599 : this.L) {
         if (var1 < class07599.i()) {
            return class07599;
         }
      }

      return this.L.getLast();
   }

   public T N(long var1) {
      long i = this.L(var1);
      class07599 class07599 = this.y(i);
      if (i <= class07599.L()) {
         return (T)class07599.y();
      } else if (i >= class07599.i()) {
         return (T)class07599.u();
      } else {
         float f = (float)(i - class07599.L()) / (class07599.i() - class07599.L());
         float f1 = class07599.N().apply(f);
         return this.y.apply(f1, (T)class07599.y(), (T)class07599.u());
      }
   }

   private static <T> void N(class07606<T> var0, List<class07581<T>> var1, List<class07599<T>> var2) {
      for (int i = 0; i < var1.size() - 1; i++) {
         class07581 class07581x = (class07581)var1.get(i);
         class07581 class07581x = (class07581)var1.get(i + 1);
         var2.add(new class07599(var0, class07581x, class07581x.N(), class07581x, class07581x.N()));
      }
   }

   private static <T> List<class07599<T>> N(class07606<T> var0, Optional<Integer> var1) {
      List list = var0.N();
      if (list.size() == 1) {
         Object object = ((class07581)list.getFirst()).y();
         return List.of(new class07599<>(class07586.L, (T)object, 0, (T)object, 0));
      } else {
         ArrayList arraylist = new ArrayList();
         if (var1.isPresent()) {
            class07581 class07581x = (class07581)list.getFirst();
            class07581 class07581x = (class07581)list.getLast();
            arraylist.add(new class07599(var0, class07581x, class07581x.N() - (Integer)var1.get(), class07581x, class07581x.N()));
            N(var0, list, arraylist);
            arraylist.add(new class07599(var0, class07581x, class07581x.N(), class07581x, class07581x.N() + (Integer)var1.get()));
         } else {
            N(var0, list, arraylist);
         }

         return List.copyOf(arraylist);
      }
   }
}
