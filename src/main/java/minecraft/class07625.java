package minecraft;

import org.jspecify.annotations.Nullable;

public class class07625 extends class07649 implements class01279 {
   protected static final class02131<Byte> N = class03289.N(class07625.class, class02154.N);
   private static final int y = 25;
   private static final boolean L = false;
   private int u;
   private int i;
   private static final class02135 R = class01517.N(20, 39);
   private long M;
   @Nullable
   private class08372<class07438> B;

   public void M(boolean var1) {
      byte b0 = this.field_6011.N(N);
      if (var1) {
         this.field_6011.N(N, (byte)(b0 | 1));
      } else {
         this.field_6011.N(N, (byte)(b0 & -2));
      }
   }

   public static class05300 M() {
      return class07079.H().N(class05298.n, 100.0).N(class05298.l, 0.25).N(class05298.b, 1.0).N(class05298.u, 15.0).N(class05298.O, 1.0);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, (byte)0);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      class02842 class02842 = this.m();
      boolean flag = super.method_64397(var1, var2, var3);
      if (flag && this.m() != class02842) {
         this.method_5783(class04909.sv, 1.0F, 1.0F);
      }

      return flag;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.sl, 1.0F, 1.0F);
   }

   @Override
   public boolean method_27298() {
      return this.method_18798().z() > 2.5000003E-7F && this.field_5974.y(5) == 0;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("PlayerCreated", this.t());
      this.N(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.M(var1.N("PlayerCreated", false));
      this.N(this.method_73183(), var1);
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 4) {
         this.u = 10;
         this.method_5783(class04909.sj, 1.0F, 1.0F);
      } else if (var1 == 11) {
         this.i = 400;
      } else if (var1 == 34) {
         this.i = 0;
      } else {
         super.method_5711(var1);
      }
   }

   public class07625(class07078<? extends class07625> var1, class07299 var2) {
      super(var1, var2);
   }

   public int n() {
      return this.i;
   }

   public class02842 m() {
      return class02812.N.N(this.method_6032() / this.method_6063());
   }

   public boolean t() {
      return (this.field_6011.N(N) & 1) != 0;
   }

   public int v() {
      return this.u;
   }

   @Override
   public long E() {
      return this.M;
   }

   public void N(boolean var1) {
      if (var1) {
         this.i = 400;
         this.method_73183().method_8421(this, (byte)11);
      } else {
         this.i = 0;
         this.method_73183().method_8421(this, (byte)34);
      }
   }

   @Override
   public boolean N(class05487 var1) {
      class07209 class07209xx = this.method_24515();
      class07209 class07209x = class07209xx.method_10074();
      if (!var1.method_8320(class07209x).y(var1, class07209x, this)) {
         return false;
      } else {
         for (int ix = 1; ix < 3; ix++) {
            class07209 class07209xx = class07209xx.method_10086(ix);
            class00500 class00500 = var1.method_8320(class07209xx);
            if (!class00803.N(var1, class07209xx, class00500, class00500.Y(), class07078.Nn)) {
               return false;
            }
         }

         return class00803.N(var1, class07209xx, var1.method_8320(class07209xx), class04684.N.M(), class07078.Nn) && var1.method_8606(this);
      }
   }

   @Override
   protected class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (!class06584.N(class06570.TM)) {
         return class07082.i;
      } else {
         float f = this.method_6032();
         this.method_6025(25.0F);
         if (this.method_6032() == f) {
            return class07082.i;
         } else {
            float f1 = 1.0F + (this.field_5974.z() - this.field_5974.z()) * 0.2F;
            this.method_5783(class04909.sG, 1.0F, f1);
            class06584.N(1, var1);
            return class07082.N;
         }
      }
   }

   @Override
   public void N(long var1) {
      this.M = var1;
   }

   @Override
   public void N(@Nullable class08372<class07438> var1) {
      this.B = var1;
   }

   @Nullable
   @Override
   public class08372<class07438> W() {
      return this.B;
   }

   private float G() {
      return (float)this.method_45325(class05298.u);
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.875F * this.method_5751(), this.method_17681() * 0.4F);
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07999(this, 1.0, true));
      this.e.N(2, new class07971(this, 0.9, 32.0F));
      this.e.N(2, new class05696(this, 0.6, false));
      this.e.N(4, new class05192(this, 0.6));
      this.e.N(5, new class07995(this));
      this.e.N(7, new class07962(this, class08036.class, 6.0F));
      this.e.N(8, new class07956(this));
      this.H.N(1, new class07975(this));
      this.H.N(2, new class07989(this));
      this.H.N(3, new class07952<>(this, class08036.class, 10, true, false, this::N));
      this.H.N(3, new class07952<>(this, class07079.class, 5, false, false, (var0, var1) -> var0 instanceof class07542 && !(var0 instanceof class07550)));
      this.H.N(4, new class01251<>(this, false));
   }

   @Override
   public void method_6087(class07049 var1) {
      if (var1 instanceof class07542 && !(var1 instanceof class07550) && this.method_59922().y(20) == 0) {
         this.y((class07438)var1);
      }

      super.method_6087(var1);
   }

   @Override
   public class04891 method_6002() {
      return class04909.sn;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.u > 0) {
         this.u--;
      }

      if (this.i > 0) {
         this.i--;
      }

      if (!this.method_73183().method_8608()) {
         this.N((class04782)this.method_73183(), true);
      }
   }

   @Override
   public int method_6130(int var1) {
      return var1;
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      this.u = 10;
      var1.method_8421(this, (byte)4);
      float f = this.G();
      float f1 = (int)f > 0 ? f / 2.0F + this.field_5974.y((int)f) : f;
      class07072 class07072 = this.method_48923().y((class07438)this);
      boolean flag = var2.method_64397(var1, class07072, f1);
      if (flag) {
         double d0 = var2 instanceof class07438 class07438 ? class07438.method_45325(class05298.b) : 0.0;
         double d1 = Math.max(0.0, 1.0 - d0);
         var2.method_18799(var2.method_18798().y(0.0, 0.4F * d1, 0.0));
         class07323.N(var1, var2, class07072);
      }

      this.method_5783(class04909.sj, 1.0F, 1.0F);
      return flag;
   }

   @Override
   public void method_6078(class07072 var1) {
      super.method_6078(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.st;
   }

   @Override
   public boolean method_5973(class07078<?> var1) {
      if (this.t() && var1 == class07078.Ly) {
         return false;
      } else {
         return var1 == class07078.q ? false : super.method_5973(var1);
      }
   }

   @Override
   public void W_() {
      this.y(R.N(this.field_5974));
   }
}
