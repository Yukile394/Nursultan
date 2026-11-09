package minecraft;

import org.jspecify.annotations.Nullable;

public class class07149 extends class07148 implements class07172 {
   private static final int R = 4;
   private static final int M = 3;
   public static final int N = 3;
   private int B;
   private final class06889[][] Z;

   @Override
   public class00703 M() {
      if (this.n()) {
         return class00703.field_7212;
      } else {
         return this.Nl() ? class00703.field_7208 : class00703.field_7207;
      }
   }

   public class07149(class07078<? extends class07149> var1, class07299 var2) {
      super(var1, var2);
      this.J = 5;
      this.Z = new class06889[2][4];

      for (int i = 0; i < 4; i++) {
         this.Z[0][i] = class06889.L;
         this.Z[1][i] = class06889.L;
      }
   }

   public static class05300 B() {
      return class07150.Y().N(class05298.l, 0.5).N(class05298.P, 18.0).N(class05298.n, 32.0);
   }

   @Override
   protected class04891 s() {
      return class04909.su;
   }

   @Override
   protected class04891 m() {
      return class04909.si;
   }

   public class06889[] u(float var1) {
      if (this.B <= 0) {
         return this.Z[1];
      } else {
         double d0 = (this.B - var1) / 3.0F;
         d0 = Math.pow(d0, 0.25);
         class06889[] aclass06889 = new class06889[4];

         for (int i = 0; i < 4; i++) {
            aclass06889[i] = this.Z[1][i].L(1.0 - d0).i(this.Z[0][i].L(d0));
         }

         return aclass06889;
      }
   }

   @Override
   public class04891 E() {
      return class04909.su;
   }

   @Override
   public void N(class07438 var1, float var2) {
      class06584 class06584x = this.method_5998(class08038.N(this, class06570.sx));
      class06584 class06584x = this.method_18808(class06584x);
      class08007 class08007 = class08038.N(this, class06584x, var2, class06584x);
      double d0 = var1.method_23317() - this.method_23317();
      double d1 = var1.method_23323(0.3333333333333333) - class08007.method_23318();
      double d2 = var1.method_23321() - this.method_23321();
      double d3 = Math.sqrt(d0 * d0 + d2 * d2);
      if (this.method_73183() instanceof class04782 class04782) {
         class08005.N(class08007, class04782, class06584x, d0, d1 + d3 * 0.2F, d2, 1.6F, 14 - class04782.y().N() * 4);
      }

      this.method_5783(class04909.kn, 1.0F, 1.0F / (this.method_59922().z() * 0.4F + 0.8F));
   }

   @Override
   public void N(class04782 var1, int var2, boolean var3) {
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      this.method_5673(class07085.field_6173, new class06584(class06570.sx));
      return super.N(var1, var2, var3, var4);
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07163(this));
      this.e.N(3, new class07464<>(this, class00245.class, 8.0F, 1.0, 1.2));
      this.e.N(4, new class07167(this));
      this.e.N(5, new class07179(this));
      this.e.N(6, new class07996<>(this, 0.5, 20, 15.0F));
      this.e.N(8, new class07978(this, 0.6));
      this.e.N(9, new class07962(this, class08036.class, 3.0F, 1.0F));
      this.e.N(10, new class07962(this, class07079.class, 8.0F));
      this.H.N(1, new class07989(this, class04882.class).N());
      this.H.N(2, new class07952<>(this, class08036.class, true).L(300));
      this.H.N(3, new class07952<>(this, class06171.class, false).L(300));
      this.H.N(3, new class07952<>(this, class07625.class, false).L(300));
   }

   @Override
   public class04891 method_6002() {
      return class04909.sR;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.method_73183().method_8608() && this.method_5767()) {
         this.B--;
         if (this.B < 0) {
            this.B = 0;
         }

         if (super.fields_2212a028292fd3c078969e3ee4c71d9e8_0 != 1 && this.field_6012 % 1200 != 0) {
            if (super.fields_2212a028292fd3c078969e3ee4c71d9e8_0 == super.fields_2212a028292fd3c078969e3ee4c71d9e8_1 - 1) {
               this.B = 3;

               for (int j = 0; j < 4; j++) {
                  this.Z[0][j] = this.Z[1][j];
                  this.Z[1][j] = new class06889(0.0, 0.0, 0.0);
               }
            }
         } else {
            this.B = 3;
            float f = -6.0F;
            byte b0 = 13;

            for (int i = 0; i < 4; i++) {
               this.Z[0][i] = this.Z[1][i];
               this.Z[1][i] = new class06889(
                  (-6.0F + this.field_5974.y(13)) * 0.5, Math.max(0, this.field_5974.y(6) - 4), (-6.0F + this.field_5974.y(13)) * 0.5
               );
            }

            for (int k = 0; k < 16; k++) {
               this.method_73183().method_8406(class07107.i, this.method_23322(0.5), this.method_23319(), this.method_23324(0.5), 0.0, 0.0, 0.0);
            }

            this.method_73183()
               .method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.sB, this.method_5634(), 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.sM;
   }
}
