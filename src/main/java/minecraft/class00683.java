package minecraft;

import Nursultan.class09384;
import Nursultan.class09386;
import org.jspecify.annotations.Nullable;

public class class00683 extends class07877 implements class07172 {
   private static final int C = 5;
   private static final class02131<Integer> S = class03289.N(class00683.class, class02154.y);
   private static final class02131<Integer> x = class03289.N(class00683.class, class02154.y);
   private static final class01325 D = class07078.NQ.E().N(class03810.N().N(class03831.field_47743, 0.0F, class07078.NQ.U() - 0.8125F, -0.3F)).N(0.5F);
   public boolean f;
   @Nullable
   private class00683 h;
   @Nullable
   private class00683 r;

   @Override
   protected double NY() {
      return 2.0;
   }

   @Override
   protected boolean L(class08036 var1, class06584 var2) {
      byte b0 = 0;
      byte b1 = 0;
      float fx = 0.0F;
      boolean flag = false;
      if (var2.N(class06570.bL)) {
         b0 = 10;
         b1 = 3;
         fx = 2.0F;
      } else if (var2.N(class00869.zy.B())) {
         b0 = 90;
         b1 = 6;
         fx = 10.0F;
         if (this.I() && this.K() == 0 && this.T_()) {
            flag = true;
            this.i(var1);
         }
      }

      if (this.method_6032() < this.method_6063() && fx > 0.0F) {
         this.method_6025(fx);
         flag = true;
      }

      if (this.method_6109() && b0 > 0) {
         this.method_73183().method_8406(class07107.F, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), 0.0, 0.0, 0.0);
         if (!this.method_73183().method_8608()) {
            this.L(b0);
            flag = true;
         }
      }

      if (b1 > 0 && (flag || !this.I()) && this.Ng() < this.NV() && !this.method_73183().method_8608()) {
         this.z(b1);
         flag = true;
      }

      if (flag && !this.method_5701() && this.G() != null) {
         this.method_73183()
            .method_43128(
               null,
               this.method_23317(),
               this.method_23318(),
               this.method_23321(),
               this.G(),
               this.method_5634(),
               1.0F,
               1.0F + (this.field_5974.z() - this.field_5974.z()) * 0.2F
            );
      }

      return flag;
   }

   @Override
   protected void L(class04782 var1) {
      if (!this.yi() && this.method_6109()) {
         super.L(var1);
      }
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NS);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(S, 0);
      var1.N(x, 0);
   }

   @Override
   public boolean method_5747(double var1, float var3, class07072 var4) {
      int i = this.method_23329(var1, var3);
      if (i <= 0) {
         return false;
      } else {
         if (var1 >= 6.0) {
            this.method_64419(var4, i);
            this.method_67345(var1, var3, var4);
         }

         this.method_23328();
         return true;
      }
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.Ts, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Variant", class00704.field_56660, this.yN());
      var1.N("Strength", this.Nh());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.NS ? method_66651(var1, this.yN()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      this.E(var1.N("Strength", 0));
      super.method_5749(var1);
      this.N(var1.<class00704>N("Variant", class00704.field_56660).orElse(class00704.field_57635));
   }

   @Override
   protected class06889 method_52533(class07049 var1, class01325 var2, float var3) {
      return method_55665(this, var1, var2.u());
   }

   public class00683(class07078<? extends class00683> var1, class07299 var2) {
      super(var1, var2);
      this.f().N(40.0F);
   }

   private void i(class07438 var1) {
      class08021 class08021 = new class08021(this.method_73183(), this);
      double d0 = var1.method_23317() - this.method_23317();
      double d1 = var1.method_23323(0.3333333333333333) - class08021.method_23318();
      double d2 = var1.method_23321() - this.method_23321();
      double d3 = Math.sqrt(d0 * d0 + d2 * d2) * 0.2F;
      if (this.method_73183() instanceof class04782 class04782) {
         class08005.N(class08021, class04782, class06584.E, d0, d1 + d3, d2, 1.5F, 10.0F);
      }

      if (!this.method_5701()) {
         this.method_73183()
            .method_43128(
               null,
               this.method_23317(),
               this.method_23318(),
               this.method_23321(),
               class04909.TP,
               this.method_5634(),
               1.0F,
               1.0F + (this.field_5974.z() - this.field_5974.z()) * 0.2F
            );
      }

      this.f = true;
   }

   @Override
   protected class04891 s() {
      return class04909.TZ;
   }

   @Override
   protected void l() {
      this.method_5783(class04909.TU, 1.0F, (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F);
   }

   public void U(boolean var1) {
      this.f = var1;
   }

   private void y(class06069 var1) {
      int i = var1.z() < 0.04F ? 5 : 3;
      this.E(1 + var1.y(i));
   }

   private void E(int var1) {
      this.field_6011.N(S, Math.max(1, Math.min(5, var1)));
   }

   private void N(class00704 var1) {
      this.field_6011.N(x, var1.field_41592);
   }

   @Override
   public boolean N(class07633 var1) {
      return var1 != this && var1 instanceof class00683 && this.NS() && ((class00683)var1).NS();
   }

   @Nullable
   public class00683 y(class04782 var1, class07077 var2) {
      class00683 class00683x = this.yy();
      if (class00683x != null) {
         this.N(var2, class00683x);
         class00683 class00683x = (class00683)var2;
         int i = this.field_5974.y(Math.max(this.Nh(), class00683x.Nh())) + 1;
         if (this.field_5974.z() < 0.03F) {
            i++;
         }

         class00683x.E(i);
         class00683x.N(this.field_5974.Z() ? this.yN() : class00683x.yN());
      }

      return class00683x;
   }

   public void N(class00683 var1) {
      this.h = var1;
      this.h.r = this;
   }

   @Override
   public void N(class07438 var1, float var2) {
      this.i(var1);
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.NS);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      this.y(class06069);
      class00704 class00704;
      if (var4 instanceof class09384) {
         class00704 = ((class09384)var4).N;
      } else {
         class00704 = class07536.N((class00704[])class00704.values(), class06069);
         var4 = new class09384(class00704);
      }

      this.N(class00704);
      return super.N(var1, var2, var3, (class07446)var4);
   }

   public boolean yi() {
      return this.h != null;
   }

   public boolean yu() {
      return this.r != null;
   }

   public boolean ND() {
      return false;
   }

   @Override
   protected class04891 G() {
      return class04909.TW;
   }

   @Nullable
   public class00683 yR() {
      return this.h;
   }

   @Override
   public boolean aa_() {
      return false;
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.75 * this.method_5751(), this.method_17681() * 0.5);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.NS) {
         this.N(method_66651(class02484.NS, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   protected void l_() {
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07959(this, 1.2));
      this.e.N(2, new class07951(this, 2.1F));
      this.e.N(3, new class07984(this, 1.25, 40, 20.0F));
      this.e.N(3, new class07993(this, 1.2));
      this.e.N(4, new class07434(this, 1.0));
      this.e.N(5, new class07960(this, 1.25, var0 -> var0.N(class01226.Nx), false));
      this.e.N(6, new class07459(this, 1.0));
      this.e.N(7, new class07957(this, 0.7));
      this.e.N(8, new class07962(this, class08036.class, 6.0F));
      this.e.N(9, new class07956(this));
      this.H.N(1, new class09386(this));
      this.H.N(2, new class00718(this));
   }

   @Override
   public int N_() {
      return this.v() ? this.Nh() : 0;
   }

   public static class05300 Nr() {
      return W();
   }

   public int Nh() {
      return this.field_6011.N(S);
   }

   public void yL() {
      if (this.h != null) {
         this.h.r = null;
      }

      this.h = null;
   }

   @Nullable
   protected class00683 yy() {
      return class07078.NQ.N(this.method_73183(), class06113.field_16466);
   }

   @Override
   public boolean Np() {
      return false;
   }

   public class00704 yN() {
      return class00704.N(this.field_6011.N(x));
   }

   @Override
   public int NV() {
      return 30;
   }

   @Override
   protected boolean Nq() {
      return false;
   }

   @Override
   public class04891 method_6002() {
      return class04909.TE;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? D : super.method_55694(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Tm;
   }

   @Override
   public boolean method_56991(class07085 var1) {
      return true;
   }

   @Override
   public boolean method_6062() {
      return this.method_29504() || this.o();
   }

   @Override
   protected class04891 M_() {
      return class04909.Tz;
   }
}
