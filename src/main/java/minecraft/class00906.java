package minecraft;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

class class00906 implements class06029<class00379, Float2FloatFunction> {
   class00906(class07274 var1) {
      super();
      this.N = var1;
   }

   public Float2FloatFunction N(class00379 var1, class00379 var2) {
      return var2x -> Math.max(var1.N(var2x), var2.N(var2x));
   }

   public Float2FloatFunction y() {
      return this.N::N;
   }

   public Float2FloatFunction N(class00379 var1) {
      return var1::N;
   }
}
