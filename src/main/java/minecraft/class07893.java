package minecraft;

class class07893 extends class07969 {
   private final class07872 M;

   class07893(class07872 var1, double var2) {
      super(var1, var2, 16);
      this.M = var1;
   }

   @Override
   public void i() {
      super.i();
      class07209 class07209x = this.M.method_24515();
      if (!this.M.method_5799() && this.W()) {
         if (this.M.N < 1) {
            this.M.M(true);
         } else if (this.M.N > this.N(200)) {
            class07299 class07299 = this.M.method_73183();
            class07299.method_8396(null, class07209x, class04909.OI, class04911.field_15245, 0.3F, 0.9F + class07299.field_9229.z() * 0.2F);
            class07209 class07209x = this.i.method_10084();
            class00500 class00500 = class00869.my.W().y(class00628.L, class07872.y(this.M).y(4) + 1);
            class07299.method_8652(class07209x, class00500, 3);
            class07299.N(class01194.Z, class07209x, class01164.N(this.M, class00500));
            this.M.N(false);
            this.M.M(false);
            this.M.M(600);
         }

         if (this.M.W()) {
            this.M.N++;
         }
      }
   }

   @Override
   public boolean y() {
      return super.y() && this.M.B() && this.M.L.method_19769(this.M.method_73189(), 9.0);
   }

   @Override
   public boolean N() {
      return this.M.B() && this.M.L.method_19769(this.M.method_73189(), 9.0) ? super.N() : false;
   }

   @Override
   protected boolean N(class05487 var1, class07209 var2) {
      return !var1.R(var2.method_10084()) ? false : class00628.y(var1, var2);
   }
}
