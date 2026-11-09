package minecraft;

import java.util.function.BiFunction;

class class04124<E, R> implements class04140<E, R> {
   class04124(class04128 var1, class04140 var2, class04140 var3, class04140 var4) {
      super();
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Override
   public String toString() {
      return this.N();
   }

   @Override
   public R N(class04782 var1, E var2, long var3) {
      Object object = this.N.N(var1, var2, var3);
      if (object == null) {
         return null;
      } else {
         Object object1 = this.y.N(var1, var2, var3);
         if (object1 == null) {
            return null;
         } else {
            BiFunction bifunction = (BiFunction)this.L.N(var1, var2, var3);
            return (R)(bifunction == null ? null : bifunction.apply(object, object1));
         }
      }
   }

   @Override
   public String N() {
      return this.L.N() + " * " + this.N.N() + " * " + this.y.N();
   }
}
