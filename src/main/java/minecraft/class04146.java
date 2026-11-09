package minecraft;

import java.util.function.Function;

class class04146<E, R> implements class04140<E, R> {
   class04146(class04128 var1, class04140 var2, class04140 var3) {
      super();
      this.N = var2;
      this.y = var3;
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
         Function function = (Function)this.y.N(var1, var2, var3);
         return (R)(function == null ? null : function.apply(object));
      }
   }

   @Override
   public String N() {
      return this.y.N() + " * " + this.N.N();
   }
}
