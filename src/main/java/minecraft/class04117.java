package minecraft;

import com.mojang.datafixers.util.Function3;

class class04117<E, R> implements class04140<E, R> {
   class04117(class04128 var1, class04140 var2, class04140 var3, class04140 var4, class04140 var5) {
      super();
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
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
            Object object2 = this.L.N(var1, var2, var3);
            if (object2 == null) {
               return null;
            } else {
               Function3 function3 = (Function3)this.u.N(var1, var2, var3);
               return (R)(function3 == null ? null : function3.apply(object, object1, object2));
            }
         }
      }
   }

   @Override
   public String N() {
      return this.u.N() + " * " + this.N.N() + " * " + this.y.N() + " * " + this.L.N();
   }
}
