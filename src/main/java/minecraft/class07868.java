package minecraft;

class class07868 extends class07969 {
   private static final int M = 1200;
   private final class07872 B;

   class07868(class07872 var1, double var2) {
      super(var1, var1.method_6109() ? 2.0 : var2, 24);
      this.B = var1;
      this.R = -1;
   }

   @Override
   public boolean y() {
      return !this.B.method_5799() && this.u <= 1200 && this.N(this.B.method_73183(), this.i);
   }

   @Override
   public boolean E() {
      return this.u % 160 == 0;
   }

   @Override
   protected boolean N(class05487 var1, class07209 var2) {
      return var1.method_8320(var2).N(class00869.K);
   }

   @Override
   public boolean N() {
      if (this.B.method_6109() && !this.B.method_5799()) {
         return super.N();
      } else {
         return !this.B.i && !this.B.method_5799() && !this.B.B() ? super.N() : false;
      }
   }
}
