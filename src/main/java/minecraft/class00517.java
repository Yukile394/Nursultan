package minecraft;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class class00517<O, S extends class00522<O, S>> {
   private final O N;
   private final Map<String, class08092<?>> y = Maps.newHashMap();

   public class00517(O var1) {
      super();
      this.N = (O)var1;
   }

   public class00507<O, S> N(Function<O, S> var1, class06647<O, S> var2) {
      return new class00507<>(var1, this.N, var2, this.y);
   }

   private <T extends Comparable<T>> void N(class08092<T> var1) {
      String s = var1.R();
      if (!class00507.N.matcher(s).matches()) {
         throw new IllegalArgumentException(this.N + " has invalidly named property: " + s);
      } else {
         List list = var1.N();
         if (list.size() <= 1) {
            throw new IllegalArgumentException(this.N + " attempted use property " + s + " with <= 1 possible values");
         } else {
            for (Comparable comparable : list) {
               String s1 = var1.y((T)comparable);
               if (!class00507.N.matcher(s1).matches()) {
                  throw new IllegalArgumentException(this.N + " has property: " + s + " with invalidly named value: " + s1);
               }
            }

            if (this.y.containsKey(s)) {
               throw new IllegalArgumentException(this.N + " has duplicate property: " + s);
            }
         }
      }
   }

   public class00517<O, S> N(class08092<?>... var1) {
      for (class08092 class08092 : var1) {
         this.N(class08092);
         this.y.put(class08092.R(), class08092);
      }

      return this;
   }
}
