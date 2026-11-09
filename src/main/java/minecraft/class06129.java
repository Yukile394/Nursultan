package minecraft;

import Nursultan.class10714;
import org.jspecify.annotations.Nullable;

public class class06129 extends class07633 {
   public static final double N = 0.6;
   public static final double y = 0.8;
   public static final double L = 1.33;
   private static final class02131<Boolean> u = class03289.N(class06129.class, class02154.U);
   private static final boolean i = false;
   @Nullable
   private class06117<class08036> R;
   @Nullable
   private class06101 M;

   private void M(boolean var1) {
      class07134 class07134 = class07107.f;
      if (!var1) {
         class07134 = class07107.NZ;
      }

      for (int ix = 0; ix < 7; ix++) {
         double d0 = this.field_5974.E() * 0.02;
         double d1 = this.field_5974.E() * 0.02;
         double d2 = this.field_5974.E() * 0.02;
         this.method_73183().method_8406(class07134, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d0, d1, d2);
      }
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(u, false);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Trusting", this.B());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("Trusting", false));
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 41) {
         this.M(true);
      } else if (var1 == 40) {
         this.M(false);
      } else {
         super.method_5711(var1);
      }
   }

   @Override
   public boolean method_21749() {
      return this.method_18276() || super.method_21749();
   }

   public class06129(class07078<? extends class06129> var1, class07299 var2) {
      super(var1, var2);
      this.m();
   }

   boolean B() {
      return this.field_6011.N(u);
   }

   @Nullable
   @Override
   protected class04891 s() {
      return class04909.nF;
   }

   protected void m() {
      if (this.R == null) {
         this.R = new class06117<>(this, class08036.class, 16.0F, 0.8, 1.33);
      }

      this.e.N(this.R);
      if (!this.B()) {
         this.e.N(4, this.R);
      }
   }

   public static boolean N(class07078<class06129> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var4.y(3) != 0;
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.ND);
   }

   @Nullable
   public class06129 y(class04782 var1, class07077 var2) {
      return class07078.Na.N(var1, class06113.field_16466);
   }

   @Override
   public boolean N(class05487 var1) {
      if (var1.method_8606(this) && !var1.u(this.method_5829())) {
         class07209 class07209 = this.method_24515();
         if (class07209.method_10264() < var1.method_8615()) {
            return false;
         }

         class00500 class00500 = var1.method_8320(class07209.method_10074());
         if (class00500.N(class00869.Z) || class00500.N(class01210.H)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var4 == null) {
         var4 = new class10714(1.0F);
      }

      return super.N(var1, var2, var3, (class07446)var4);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if ((this.M == null || this.M.U()) && !this.B() && this.N(class06584) && var1.method_5858(this) < 9.0) {
         this.N(var1, var2, class06584);
         if (!this.method_73183().method_8608()) {
            if (this.field_5974.y(3) == 0) {
               this.N(true);
               this.M(true);
               this.method_73183().method_8421(this, (byte)41);
            } else {
               this.M(false);
               this.method_73183().method_8421(this, (byte)40);
            }
         }

         return class07082.N;
      } else {
         return super.N(var1, var2);
      }
   }

   @Override
   public boolean N(double var1) {
      return !this.B() && this.field_6012 > 2400;
   }

   @Override
   public void N(class04782 var1) {
      if (this.F().y()) {
         double d0 = this.F().L();
         if (d0 == 0.6) {
            this.method_18380(class01312.field_18081);
            this.method_5728(false);
         } else if (d0 == 1.33) {
            this.method_18380(class01312.field_18076);
            this.method_5728(true);
         } else {
            this.method_18380(class01312.field_18076);
            this.method_5728(false);
         }
      } else {
         this.method_18380(class01312.field_18076);
         this.method_5728(false);
      }
   }

   private void N(boolean var1) {
      this.field_6011.N(u, var1);
      this.m();
   }

   public static class05300 W() {
      return class07633.Ne().N(class05298.n, 10.0).N(class05298.l, 0.3F).N(class05298.u, 3.0);
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.5F * this.method_5751(), this.method_17681() * 0.4F);
   }

   @Override
   public int m_() {
      return 900;
   }

   @Override
   protected void l_() {
      this.M = new class06101(this, 0.6, var0 -> var0.N(class01226.ND), true);
      this.e.N(1, new class07427(this));
      this.e.N(3, this.M);
      this.e.N(7, new class07982(this, 0.3F));
      this.e.N(8, new class07983(this));
      this.e.N(9, new class07434(this, 0.8));
      this.e.N(10, new class07957(this, 0.8, 1.0000001E-5F));
      this.e.N(11, new class07962(this, class08036.class, 10.0F));
      this.H.N(1, new class07952<>(this, class07628.class, false));
      this.H.N(1, new class07952<>(this, class07872.class, 10, false, false, class07872.y));
   }

   @Override
   public class04891 method_6002() {
      return class04909.nA;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.np;
   }
}
