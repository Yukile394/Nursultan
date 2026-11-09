package minecraft;

class class07546 extends class07145 {
   @Override
   protected int M() {
      return 40;
   }

   class07546(class07538 var1) {
      super(var1);
      this.N = var1;
   }

   @Override
   protected int Z() {
      return 100;
   }

   @Override
   protected void U() {
      class07438 class07438 = this.N.T();
      double d0 = Math.min(class07438.method_23318(), this.N.method_23318());
      double d1 = Math.max(class07438.method_23318(), this.N.method_23318()) + 1.0;
      float f = (float)class04995.u(class07438.method_23321() - this.N.method_23321(), class07438.method_23317() - this.N.method_23317());
      if (this.N.method_5858(class07438) < 9.0) {
         for (int i = 0; i < 5; i++) {
            float f1 = f + i * (float) Math.PI * 0.4F;
            this.N(this.N.method_23317() + class04995.P(f1) * 1.5, this.N.method_23321() + class04995.m(f1) * 1.5, d0, d1, f1, 0);
         }

         for (int k = 0; k < 8; k++) {
            float f2 = f + k * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
            this.N(this.N.method_23317() + class04995.P(f2) * 2.5, this.N.method_23321() + class04995.m(f2) * 2.5, d0, d1, f2, 3);
         }
      } else {
         for (int l = 0; l < 16; l++) {
            double d2 = 1.25 * (l + 1);
            int j = 1 * l;
            this.N(this.N.method_23317() + class04995.P(f) * d2, this.N.method_23321() + class04995.m(f) * d2, d0, d1, f, j);
         }
      }
   }

   @Override
   protected class04891 E() {
      return class04909.UE;
   }

   private void N(double var1, double var3, double var5, double var7, float var9, int var10) {
      class07209 class07209x = class07209.method_49637(var1, var7, var3);
      boolean flag = false;
      double d0 = 0.0;

      do {
         class07209 class07209x = class07209x.method_10074();
         if (this.N.method_73183().method_8320(class07209x).L(this.N.method_73183(), class07209x, class07211.field_11036)) {
            if (!this.N.method_73183().R(class07209x)) {
               class00494 class00494 = this.N.method_73183().method_8320(class07209x).M(this.N.method_73183(), class07209x);
               if (!class00494.method_1110()) {
                  d0 = class00494.method_1105(class07185.field_11052);
               }
            }

            flag = true;
            break;
         }

         class07209x = class07209x.method_10074();
      } while (class07209x.method_10264() >= class04995.N(var5) - 1);

      if (flag) {
         this.N.method_73183().method_8649(new class08009(this.N.method_73183(), var1, class07209x.method_10264() + d0, var3, var9, var10, this.N));
         this.N.method_73183().method_32888(class01194.v, new class06889(var1, class07209x.method_10264() + d0, var3), class01164.N(this.N));
      }
   }

   @Override
   protected class07156 W() {
      return class07156.field_7380;
   }
}
