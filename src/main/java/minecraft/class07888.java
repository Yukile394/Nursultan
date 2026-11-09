package minecraft;

import org.jspecify.annotations.Nullable;

public class class07888 extends class07649 implements class05310, class07172 {
   private static final class02131<Byte> N = class03289.N(class07888.class, class02154.N);
   private static final byte y = 16;
   private static final boolean L = true;

   public static class05300 M() {
      return class07079.H().N(class05298.n, 4.0).N(class05298.l, 0.2F);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, (byte)16);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Pumpkin", this.B());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("Pumpkin", true));
   }

   public class07888(class07078<? extends class07888> var1, class07299 var2) {
      super(var1, var2);
   }

   public boolean B() {
      return (this.field_6011.N(N) & 16) != 0;
   }

   @Nullable
   @Override
   protected class04891 s() {
      return class04909.YS;
   }

   @Override
   public boolean d() {
      return this.method_5805() && this.B();
   }

   @Override
   public void N(class07438 var1, float var2) {
      double d0 = var1.method_23317() - this.method_23317();
      double d1 = var1.method_23320() - 1.1F;
      double d2 = var1.method_23321() - this.method_23321();
      double d3 = Math.sqrt(d0 * d0 + d2 * d2) * 0.2F;
      if (this.method_73183() instanceof class04782 class04782) {
         class06584 class06584 = new class06584(class06570.jP);
         class08005.N(new class08045(class04782, this, class06584), class04782, class06584, var8 -> var8.N(d0, d1 + d3 - var8.method_23318(), d2, 1.6F, 12.0F));
      }

      this.method_5783(class04909.Yh, 1.0F, 0.4F / (this.method_59922().z() * 0.4F + 0.8F));
   }

   public void N(boolean var1) {
      byte b0 = this.field_6011.N(N);
      if (var1) {
         this.field_6011.N(N, (byte)(b0 | 16));
      } else {
         this.field_6011.N(N, (byte)(b0 & -17));
      }
   }

   @Override
   public void N(class04782 var1, class04911 var2, class06584 var3) {
      var1.method_43129(null, this, class04909.Yr, var2, 1.0F, 1.0F);
      this.N(false);
      this.method_61419(var1, class06273.yN, var3, (var1x, var2x) -> this.method_5699(var1x, var2x, this.method_5751()));
   }

   @Override
   protected class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (class06584.N(class06570.vr) && this.d()) {
         if (this.method_73183() instanceof class04782 class04782) {
            this.N(class04782, class04911.field_15248, class06584);
            this.method_32875(class01194.H, var1);
            class06584.N(1, var1, var2.N());
         }

         return class07082.N;
      } else {
         return class07082.i;
      }
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.75F * this.method_5751(), this.method_17681() * 0.4F);
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07984(this, 1.25, 20, 10.0F));
      this.e.N(2, new class07957(this, 1.0, 1.0000001E-5F));
      this.e.N(3, new class07962(this, class08036.class, 6.0F));
      this.e.N(4, new class07956(this));
      this.H.N(1, new class07952<>(this, class07079.class, 10, true, false, (var0, var1) -> var0 instanceof class07542));
   }

   @Nullable
   @Override
   public class04891 method_6002() {
      return class04909.Yx;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.method_73183() instanceof class04782 class04782) {
         if (class04782.method_75728().N(class00608.V, this.method_73189())) {
            this.method_64397(class04782, this.method_48923().u(), 1.0F);
         }

         if (!class04782.method_64395().N(class07305.I)) {
            return;
         }

         class00500 class00500 = class00869.is.W();

         for (int i = 0; i < 4; i++) {
            int j = class04995.N(this.method_23317() + (i % 2 * 2 - 1) * 0.25F);
            int k = class04995.N(this.method_23318());
            int l = class04995.N(this.method_23321() + (i / 2 % 2 * 2 - 1) * 0.25F);
            class07209 class07209 = new class07209(j, k, l);
            if (this.method_73183().method_8320(class07209).P() && class00500.N((class05487)this.method_73183(), class07209)) {
               this.method_73183().method_8501(class07209, class00500);
               this.method_73183().N(class01194.Z, class07209, class01164.N(this, class00500));
            }
         }
      }
   }

   @Override
   public boolean method_29503() {
      return true;
   }

   @Nullable
   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.YD;
   }
}
