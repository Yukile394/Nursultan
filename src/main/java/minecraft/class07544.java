package minecraft;

class class07544 extends class07145 {
   private final class01328 i;

   @Override
   protected int M() {
      return 100;
   }

   class07544(class07538 var1) {
      super(var1);
      this.N = var1;
      this.i = class01328.y().N(16.0).u().i();
   }

   @Override
   protected int Z() {
      return 340;
   }

   @Override
   protected void U() {
      class04782 class04782 = (class04782)this.N.method_73183();
      class00502 class00502 = this.N.method_5781();

      for (int ix = 0; ix < 3; ix++) {
         class07209 class07209 = this.N.method_24515().method_10069(-2 + class07538.y(this.N).y(5), 1, -2 + class07538.L(this.N).y(5));
         class08042 class08042 = class07078.yV.N(this.N.method_73183(), class06113.field_16471);
         if (class08042 != null) {
            class08042.method_5725(class07209, 0.0F, 0.0F);
            class08042.N(class04782, class04782.method_8404(class07209), class06113.field_16471, null);
            class08042.N(this.N);
            class08042.N(class07209);
            class08042.N(20 * (30 + class07538.u(this.N).y(90)));
            if (class00502 != null) {
               class04782.method_14170().N(class08042.method_5820(), class00502);
            }

            class04782.y(class08042);
            class04782.N(class01194.v, class07209, class01164.N(this.N));
         }
      }
   }

   @Override
   protected class04891 E() {
      return class04909.UW;
   }

   @Override
   public boolean N() {
      if (!super.N()) {
         return false;
      } else {
         int ix = N_18(this.N.method_73183()).N(class08042.class, this.i, this.N, this.N.method_5829().M(16.0)).size();
         return class07538.N(this.N).y(8) + 1 > ix;
      }
   }

   @Override
   protected class07156 W() {
      return class07156.field_7379;
   }
}
