package minecraft;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;

class class04582 implements class04573<Float> {
   @Override
   public float L() {
      return Float.POSITIVE_INFINITY;
   }

   class04582(Float2FloatFunction var1) {
      super();
      this.N = var1;
   }

   @Override
   public float y() {
      return Float.NEGATIVE_INFINITY;
   }

   public float N(Float var1) {
      return (Float)this.N.apply(var1);
   }
}
