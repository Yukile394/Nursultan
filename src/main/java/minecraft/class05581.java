package minecraft;

public class class05581 extends class07458 {
   private static final float N = 10.0F;
   private static final float W = 60.0F;
   private final int m;
   private final int P;
   private final float s;
   private final float T;
   private final boolean b;

   public class05581(class07079 var1, int var2, int var3, float var4, float var5, boolean var6) {
      super(var1);
      this.m = var2;
      this.P = var3;
      this.s = var4;
      this.T = var5;
      this.b = var6;
   }

   @Override
   public void N() {
      if (this.b && this.i.method_5799()) {
         this.i.method_18799(this.i.method_18798().y(0.0, 0.005, 0.0));
      }

      if (this.E == class07435.field_6378 && !this.i.f().U()) {
         double d0 = this.R - this.i.method_23317();
         double d1 = this.M - this.i.method_23318();
         double d2 = this.B - this.i.method_23321();
         if (d0 * d0 + d1 * d1 + d2 * d2 < 2.5000003E-7F) {
            this.i.N(0.0F);
         } else {
            float f = (float)(class04995.u(d2, d0) * 180.0F / (float)Math.PI) - 90.0F;
            this.i.method_36456(this.y(this.i.method_36454(), f, this.P));
            this.i.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.i.method_36454();
            this.i.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = this.i.method_36454();
            float f1 = (float)(this.Z * this.i.method_45325(class05298.l));
            if (this.i.method_5799()) {
               this.i.method_6125(f1 * this.s);
               double d3 = Math.sqrt(d0 * d0 + d2 * d2);
               if (Math.abs(d1) > 1.0E-5F || Math.abs(d3) > 1.0E-5F) {
                  float f3 = -((float)(class04995.u(d1, d3) * 180.0F / (float)Math.PI));
                  f3 = class04995.N(class04995.R(f3), (float)(-this.m), (float)this.m);
                  this.i.method_36457(this.N(this.i.method_36455(), f3, 5.0F));
               }

               float f6 = class04995.P(this.i.method_36455() * (float) (Math.PI / 180.0));
               float f4 = class04995.m(this.i.method_36455() * (float) (Math.PI / 180.0));
               this.i.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = f6 * f1;
               this.i.fields_7212a028292fd3c078969e3ee4c71d9e8_1 = -f4 * f1;
            } else {
               float f5 = Math.abs(class04995.R(this.i.method_36454() - f));
               float f2 = N(f5);
               this.i.method_6125(f1 * this.T * f2);
            }
         }
      } else {
         this.i.method_6125(0.0F);
         this.i.L(0.0F);
         this.i.y(0.0F);
         this.i.N(0.0F);
      }
   }

   private static float N(float var0) {
      return 1.0F - class04995.N((var0 - 10.0F) / 50.0F, 0.0F, 1.0F);
   }
}
