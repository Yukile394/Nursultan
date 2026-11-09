package minecraft;

import org.jspecify.annotations.Nullable;

public class class07881 extends class07633 implements class05310 {
   private static final int N = 40;
   private static final class02131<Byte> y = class03289.N(class07881.class, class02154.N);
   private static final class06563 L = class06563.field_7952;
   private static final boolean u = false;
   private int i;
   private class07465 R;

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.Nr);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(y, (byte)0);
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.wl, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Sheared", this.m());
      var1.N("Color", class06563.field_56666, this.W());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.Nr ? method_66651(var1, this.W()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("Sheared", false));
      this.N(var1.<class06563>N("Color", class06563.field_56666).orElse(L));
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 10) {
         this.i = 40;
      } else {
         super.method_5711(var1);
      }
   }

   public class07881(class07078<? extends class07881> var1, class07299 var2) {
      super(var1, var2);
   }

   public static class05300 B() {
      return class07633.Ne().N(class05298.n, 8.0).N(class05298.l, 0.23F);
   }

   public float i(float var1) {
      if (this.i > 4 && this.i <= 36) {
         float f = (this.i - 4 - var1) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * class04995.m(f * 28.7F);
      } else {
         return this.i > 0 ? (float) (Math.PI / 5) : this.method_61414(var1) * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public void x() {
      super.x();
      this.N(false);
      if (this.method_6109()) {
         this.L(60);
      }
   }

   @Override
   protected class04891 s() {
      return class04909.wv;
   }

   @Override
   public boolean d() {
      return this.method_5805() && !this.m() && !this.method_6109();
   }

   public boolean m() {
      return (this.field_6011.N(y) & 16) != 0;
   }

   public float u(float var1) {
      if (this.i <= 0) {
         return 0.0F;
      } else if (this.i >= 4 && this.i <= 36) {
         return 1.0F;
      } else {
         return this.i < 4 ? (this.i - var1) / 4.0F : -(this.i - 40 - var1) / 4.0F;
      }
   }

   public void N(boolean var1) {
      byte b0 = this.field_6011.N(y);
      if (var1) {
         this.field_6011.N(y, (byte)(b0 | 16));
      } else {
         this.field_6011.N(y, (byte)(b0 & -17));
      }
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      this.N(N(var1, this.method_24515()));
      return super.N(var1, var2, var3, var4);
   }

   public static class06563 N(class01001 var0, class07209 var1) {
      return class08416.N(var0.i(var1), var0.method_8409());
   }

   @Nullable
   public class07881 y(class04782 var1, class07077 var2) {
      class07881 class07881 = class07078.yz.N(var1, class06113.field_16466);
      if (class07881 != null) {
         class06563 class06563x = this.W();
         class06563 class06563x = ((class07881)var2).W();
         class07881.N(class06563.N(var1, class06563x, class06563x));
      }

      return class07881;
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (class06584.N(class06570.vr)) {
         if (this.method_73183() instanceof class04782 class04782 && this.d()) {
            this.N(class04782, class04911.field_15248, class06584);
            this.method_32875(class01194.H, var1);
            class06584.N(1, var1, var2.N());
            return class07082.y;
         } else {
            return class07082.L;
         }
      } else {
         return super.N(var1, var2);
      }
   }

   public void N(class06563 var1) {
      byte b0 = this.field_6011.N(y);
      this.field_6011.N(y, (byte)(b0 & 240 | var1.N() & 15));
   }

   @Override
   protected void N(class04782 var1) {
      this.i = this.R.M();
      super.N(var1);
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.NJ);
   }

   @Override
   public void N(class04782 var1, class04911 var2, class06584 var3) {
      var1.method_43129(null, this, class04909.wG, var2, 1.0F, 1.0F);
      this.method_61419(
         var1,
         class06273.yy,
         var3,
         (var1x, var2x) -> {
            for (int ix = 0; ix < var2x.c(); ix++) {
               class00717 class00717 = this.method_5699(var1x, var2x.L(1), 1.0F);
               if (class00717 != null) {
                  class00717.method_18799(
                     class00717.method_18798()
                        .y((this.field_5974.z() - this.field_5974.z()) * 0.1F, this.field_5974.z() * 0.05F, (this.field_5974.z() - this.field_5974.z()) * 0.1F)
                  );
               }
            }
         }
      );
      this.N(true);
   }

   public class06563 W() {
      return class06563.N(this.field_6011.N(y) & 15);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.Nr) {
         this.N(method_66651(class02484.Nr, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   protected void l_() {
      this.R = new class07465(this);
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07993(this, 1.25));
      this.e.N(2, new class07434(this, 1.0));
      this.e.N(3, new class07960(this, 1.1, var0 -> var0.N(class01226.NJ), false));
      this.e.N(4, new class07459(this, 1.1));
      this.e.N(5, this.R);
      this.e.N(6, new class07957(this, 1.0));
      this.e.N(7, new class07962(this, class08036.class, 6.0F));
      this.e.N(8, new class07956(this));
   }

   @Override
   public class04891 method_6002() {
      return class04909.wn;
   }

   @Override
   public void method_6007() {
      if (this.method_73183().method_8608()) {
         this.i = Math.max(0, this.i - 1);
      }

      super.method_6007();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.wt;
   }
}
