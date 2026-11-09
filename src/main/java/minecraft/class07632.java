package minecraft;

import org.jspecify.annotations.Nullable;

public class class07632 extends class07656 {
   public static final float N = 0.5F;
   public static final float y = 10.0F;
   private static final class02131<Byte> i = class03289.N(class07632.class, class02154.N);
   private static final int R = 1;
   private static final class01328 M = class01328.y().N(4.0);
   private static final byte B = 0;
   public final class04396 L = new class04396();
   public final class04396 u = new class04396();
   @Nullable
   private class07209 Z;

   public static class05300 M() {
      return class07079.H().N(class05298.n, 6.0);
   }

   @Override
   public boolean method_5696() {
      return true;
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(i, (byte)0);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.B()) {
         this.method_18799(class06889.L);
         this.method_23327(this.method_23317(), class04995.N(this.method_23318()) + 1.0 - this.method_17682(), this.method_23321());
      } else {
         this.method_18799(this.method_18798().u(1.0, 0.6, 1.0));
      }

      this.Z();
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_5679(var1, var2)) {
         return false;
      } else {
         if (this.B()) {
            this.N(false);
         }

         return super.method_64397(var1, var2, var3);
      }
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
   }

   @Override
   public boolean method_5776() {
      return !this.B() && this.field_6012 % 10.0F == 0.0F;
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28632;
   }

   @Override
   public boolean method_5810() {
      return false;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("BatFlags", this.field_6011.N(i).byteValue());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.field_6011.N(i, var1.N("BatFlags", (byte)0));
   }

   public class07632(class07078<? extends class07632> var1, class07299 var2) {
      super(var1, var2);
      if (!var2.method_8608()) {
         this.N(true);
      }
   }

   public boolean B() {
      return (this.field_6011.N(i) & 1) != 0;
   }

   private void Z() {
      if (this.B()) {
         this.L.N();
         this.u.y(this.field_6012);
      } else {
         this.u.N();
         this.L.y(this.field_6012);
      }
   }

   @Nullable
   @Override
   public class04891 s() {
      return this.B() && this.field_5974.y(4) != 0 ? null : class04909.yF;
   }

   @Override
   protected void N(class04782 var1) {
      super.N(var1);
      class07209 class07209x = this.method_24515();
      class07209 class07209x = class07209x.method_10084();
      if (this.B()) {
         boolean flag = this.method_5701();
         if (var1.method_8320(class07209x).u(var1, class07209x)) {
            if (this.field_5974.y(200) == 0) {
               super.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = (float)this.field_5974.y(360);
            }

            if (var1.N(M, this) != null) {
               this.N(false);
               if (!flag) {
                  var1.method_8444(null, 1025, class07209x, 0);
               }
            }
         } else {
            this.N(false);
            if (!flag) {
               var1.method_8444(null, 1025, class07209x, 0);
            }
         }
      } else {
         if (this.Z != null && (!var1.R(this.Z) || this.Z.method_10264() <= var1.method_31607())) {
            this.Z = null;
         }

         if (this.Z == null || this.field_5974.y(30) == 0 || this.Z.method_19769(this.method_73189(), 2.0)) {
            this.Z = class07209.method_49637(
               this.method_23317() + this.field_5974.y(7) - this.field_5974.y(7),
               this.method_23318() + this.field_5974.y(6) - 2.0,
               this.method_23321() + this.field_5974.y(7) - this.field_5974.y(7)
            );
         }

         double d2 = this.Z.method_10263() + 0.5 - this.method_23317();
         double d0 = this.Z.method_10264() + 0.1 - this.method_23318();
         double d1 = this.Z.method_10260() + 0.5 - this.method_23321();
         class06889 class06889x = this.method_18798();
         class06889 class06889x = class06889x.y(
            (Math.signum(d2) * 0.5 - class06889x.M) * 0.1F, (Math.signum(d0) * 0.7F - class06889x.B) * 0.1F, (Math.signum(d1) * 0.5 - class06889x.Z) * 0.1F
         );
         this.method_18799(class06889x);
         float f = class04995.R((float)(class04995.u(class06889x.Z, class06889x.M) * 180.0F / (float)Math.PI) - 90.0F - this.method_36454());
         super.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = 0.5F;
         this.method_36456(this.method_36454() + f);
         if (this.field_5974.y(100) == 0 && var1.method_8320(class07209x).u(var1, class07209x)) {
            this.N(true);
         }
      }
   }

   public static boolean N(class07078<class07632> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      if (var3.method_10264() >= var1.N(class07830.field_13202, var3).method_10264()) {
         return false;
      } else if (var4.Z()) {
         return false;
      } else if (var1.U(var3) > var4.y(4)) {
         return false;
      } else {
         return !var1.method_8320(var3.method_10074()).N(class01210.LG) ? false : y(var0, var1, var2, var3, var4);
      }
   }

   public void N(boolean var1) {
      byte b0 = this.field_6011.N(i);
      if (var1) {
         this.field_6011.N(i, (byte)(b0 | 1));
      } else {
         this.field_6011.N(i, (byte)(b0 & -2));
      }
   }

   @Override
   public void method_6087(class07049 var1) {
   }

   @Override
   public class04891 method_6002() {
      return class04909.yA;
   }

   @Override
   public float method_6107() {
      return 0.1F;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.yf;
   }

   @Override
   public float method_6017() {
      return super.method_6017() * 0.95F;
   }

   @Override
   public void method_6070() {
   }
}
