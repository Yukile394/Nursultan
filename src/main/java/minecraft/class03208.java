package minecraft;

import java.util.function.Function;

class class03208<C2> implements class04573<C2> {
   @Override
   public float L() {
      return this.N.L();
   }

   class03208(class04573 var1, class04573 var2, Function var3) {
      super();
      this.N = var2;
      this.L = var3;
   }

   @Override
   public float y() {
      return this.N.y();
   }

   @Override
   public float N(C2 var1) {
      return this.N.N(this.L.apply(var1));
   }
}
