package minecraft;

public abstract class class08031 extends class08005 {
   private static final float N = 12.25F;

   @Override
   public void method_5773() {
      this.u();
      this.method_56990();
      this.y();
      class07089 class07089 = class08038.N(this, this::N);
      class06889 class06889;
      if (class07089.N() != class07113.field_1333) {
         class06889 = class07089.y();
      } else {
         class06889 = this.method_73189().i(this.method_18798());
      }

      this.method_33574(class06889);
      this.T();
      this.method_61409();
      super.method_5773();
      if (class07089.N() != class07113.field_1333 && this.method_5805()) {
         this.y(class07089);
      }
   }

   @Override
   protected double method_7490() {
      return 0.03;
   }

   @Override
   public boolean method_5640(double var1) {
      if (this.field_6012 < 2 && var1 < 12.25) {
         return false;
      } else {
         double d0 = this.method_5829().N() * 4.0;
         if (Double.isNaN(d0)) {
            d0 = 4.0;
         }

         d0 *= 64.0;
         return var1 < d0 * d0;
      }
   }

   @Override
   public boolean method_5822(boolean var1) {
      return true;
   }

   protected class08031(class07078<? extends class08031> var1, class07299 var2) {
      super(var1, var2);
   }

   protected class08031(class07078<? extends class08031> var1, double var2, double var4, double var6, class07299 var8) {
      this(var1, var8);
      this.method_5814(var2, var4, var6);
   }

   private void u() {
      if (this.field_5953) {
         for (class07209 class07209 : class07209.method_62671(this.method_5829())) {
            class00500 class00500 = this.method_73183().method_8320(class07209);
            if (class00500.N(class00869.PN)) {
               class00500.N(this.method_73183(), class07209, this, class08400.N, true);
            }
         }
      }
   }

   private void y() {
      class06889 class06889x = this.method_18798();
      class06889 class06889x = this.method_73189();
      float f;
      if (this.method_5799()) {
         for (int i = 0; i < 4; i++) {
            float f1 = 0.25F;
            this.method_73183()
               .method_8406(
                  class07107.u,
                  class06889x.M - class06889x.M * 0.25,
                  class06889x.B - class06889x.B * 0.25,
                  class06889x.Z - class06889x.Z * 0.25,
                  class06889x.M,
                  class06889x.B,
                  class06889x.Z
               );
         }

         f = 0.8F;
      } else {
         f = 0.99F;
      }

      this.method_18799(class06889x.L((double)f));
   }
}
