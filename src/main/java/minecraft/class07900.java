package minecraft;

class class07900 extends class07473 {
   private static final float y = 3.0F;
   private static final float L = 5.0F;
   private static final float u = 10.0F;
   private int i;

   @Override
   public void L() {
      this.i = 0;
   }

   class07900(class07883 var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      this.i++;
      class07438 class07438 = this.N.method_6065();
      if (class07438 != null) {
         class06889 class06889 = new class06889(
            this.N.method_23317() - class07438.method_23317(),
            this.N.method_23318() - class07438.method_23318(),
            this.N.method_23321() - class07438.method_23321()
         );
         class00500 class00500 = this.N
            .method_73183()
            .method_8320(
               class07209.method_49637(this.N.method_23317() + class06889.M, this.N.method_23318() + class06889.B, this.N.method_23321() + class06889.Z)
            );
         if (this.N
               .method_73183()
               .method_8316(
                  class07209.method_49637(this.N.method_23317() + class06889.M, this.N.method_23318() + class06889.B, this.N.method_23321() + class06889.Z)
               )
               .N(class01231.N)
            || class00500.P()) {
            double d0 = class06889.M();
            if (d0 > 0.0) {
               class06889.u();
               double d1 = 3.0;
               if (d0 > 5.0) {
                  d1 -= (d0 - 5.0) / 5.0;
               }

               if (d1 > 0.0) {
                  class06889 = class06889.L(d1);
               }
            }

            if (class00500.P()) {
               class06889 = class06889.N(0.0, class06889.B, 0.0);
            }

            this.N.Z = new class06889(class06889.M / 20.0, class06889.B / 20.0, class06889.Z / 20.0);
         }

         if (this.i % 10 == 5) {
            this.N.method_73183().method_8406(class07107.u, this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.method_6065();
      return this.N.method_5799() && class07438 != null ? this.N.method_5858(class07438) < 100.0 : false;
   }
}
