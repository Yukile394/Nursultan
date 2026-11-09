package minecraft;

import Nursultan.class09047;
import Nursultan.class09048;
import Nursultan.class09049;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00032 extends class07633 {
   public static final float N = 0.2375F;
   public static final int y = 16;
   public static final int L = 32;
   public static final int u = 64;
   public static final int i = 16;
   public static final int R = 20;
   public static final int M = 600;
   public static final int B = 4;
   private static final int X = 60;
   private static final int p = 10;
   public static final float Z = 2.0F;
   private int F = 0;
   private int A;
   private static final class02131<Boolean> f = class03289.N(class00032.class, class02154.U);
   private static final class02131<Boolean> C = class03289.N(class00032.class, class02154.U);
   private static final float S = 1.0F;

   private void w() {
      this.field_6011.N(C, this.A > 0);
   }

   @Override
   protected void M() {
      if (this.method_6109()) {
         this.t();
      } else {
         this.n();
      }

      super.M();
   }

   @Override
   public class06889 method_24829(class07438 var1) {
      return new class06889(this.method_23317(), this.method_5829().i, this.method_23321());
   }

   @Override
   public boolean method_70986() {
      return true;
   }

   @Override
   public class06889[] method_70985() {
      return class02607.N(this, -0.03125, 0.4375, 0.46875, 0.03125);
   }

   @Override
   public void method_70980(class02607 var1) {
      if (var1.aa_()) {
         this.F = 5;
      }
   }

   @Override
   public boolean method_70987() {
      return !this.method_6109();
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(f, false);
      var1.N(C, false);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (!this.method_73183().method_8608()) {
         if (this.F > 0) {
            this.F--;
         }

         this.N(this.F > 0);
         if (this.A > 0) {
            if (this.field_6012 > 60) {
               this.A--;
            }

            this.N(this.A);
         }

         if (this.Y()) {
            this.N(10);
         }
      }
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15254;
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
   }

   @Nullable
   @Override
   public class07438 method_5642() {
      class07049 class07049 = this.method_31483();
      return (class07438)(this.NU() && !this.v() && class07049 instanceof class08036 ? (class08036)class07049 : super.method_5642());
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("still_timeout", this.A);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("still_timeout", 0));
   }

   @Override
   public boolean method_30948(@Nullable class07049 var1) {
      if (!this.method_6109() && this.method_5805()) {
         if (this.method_73183().method_8608() && var1 instanceof class08036 && var1.method_73189().B >= this.method_5829().i) {
            return true;
         } else {
            return this.method_5782() && var1 instanceof class00032 ? true : this.v();
         }
      } else {
         return false;
      }
   }

   @Override
   protected void method_5793(class07049 var1) {
      super.method_5793(var1);
      if (!this.method_73183().method_8608()) {
         this.N(10);
      }

      if (!this.method_5782()) {
         this.Nb();
         this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.Pz, this.method_5634(), 1.0F, 1.0F);
      }
   }

   @Override
   protected boolean method_5818(class07049 var1) {
      return this.method_5685().size() < 4;
   }

   @Override
   protected void method_5627(class07049 var1) {
      if (!this.method_5782()) {
         this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.PU, this.method_5634(), 1.0F, 1.0F);
      }

      super.method_5627(var1);
      if (!this.method_73183().method_8608()) {
         if (!this.Y()) {
            this.N(0);
         } else if (this.A > 10) {
            this.N(10);
         }
      }
   }

   public class00032(class07078<? extends class00032> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class07547(this, true, this::v);
      this.o = new class00029(this);
   }

   public static class05300 B() {
      return class07633.Ne().N(class05298.n, 20.0).N(class05298.J, 16.0).N(class05298.m, 0.05).N(class05298.l, 0.05).N(class05298.P, 16.0).N(class05298.z, 8.0);
   }

   @Override
   protected class04891 s() {
      return this.method_6109() ? class04909.Wi : class04909.md;
   }

   private void n() {
      this.q = new class07547(this, true, this::v);
      this.o = new class00029(this);
      this.V = this.N(this.method_73183());
      if (this.method_73183() instanceof class04782 class04782) {
         this.N(var0 -> true);
         this.l_();
         super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.y(class04782, this);
         super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.y();
      }

      this.N(null);
   }

   private void l() {
      if (!this.g_() && !this.method_5782()) {
         int ix = this.G();
         if (!this.Nj() || !this.Ns().method_19771(this.method_24515(), ix + 16) || ix != this.NT()) {
            this.N(this.method_24515(), ix);
         }
      }
   }

   private void d() {
      if (this.method_73183() instanceof class04782 class04782
         && this.method_5805()
         && super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 == 0
         && this.method_6063() != this.method_6032()) {
         boolean flag = this.method_70668() || class04782.method_70745(this.method_24515()) != class00801.field_9384;
         if (this.field_6012 % (flag ? 20 : 600) == 0) {
            this.method_6025(1.0F);
         }
      }
   }

   public boolean m() {
      return this.field_6011.N(C);
   }

   private void t() {
      this.q = new class07460(this, 180, true);
      this.o = new class07442(this);
      this.V = this.y(this.method_73183());
      this.N(0);
      this.N(var0 -> true);
      this.y(null);
   }

   public boolean v() {
      return this.m() || this.A > 0;
   }

   private void y(CallbackInfo var1) {
      this.lithium$updateNavigationRegistration();
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return class07078.NZ.N(var1, class06113.field_16466);
   }

   private class07623 y(class07299 var1) {
      return new class09049(this, var1);
   }

   @Override
   protected void N(class04782 var1) {
      if (this.method_6109()) {
         class04643 class04643 = class08700.N();
         class04643.N("happyGhastBrain");
         super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(var1, this);
         class04643.L();
         class04643.N("happyGhastActivityUpdate");
         class00008.N(this);
         class04643.L();
      }

      this.l();
      super.N(var1);
   }

   private void N(int var1) {
      if (this.A <= 0 && var1 > 0 && this.method_73183() instanceof class04782 class04782) {
         this.method_43391(this.method_23317(), this.method_23318(), this.method_23321());
         class04782.method_14178().L.N(this, class00269.N(this));
      }

      this.A = var1;
      this.w();
   }

   private void N(boolean var1) {
      this.field_6011.N(f, var1);
   }

   private void N(class08036 var1) {
      if (!this.method_73183().method_8608()) {
         var1.method_5804(this);
      }
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      if (!var2.R(var1)) {
         return 0.0F;
      } else {
         return var2.R(var1.method_10074()) && !var2.R(var1.method_10087(2)) ? 10.0F : 5.0F;
      }
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      if (this.method_6109()) {
         return super.N(var1, var2);
      } else {
         class06584 class06584 = var1.method_5998(var2);
         if (!class06584.R()) {
            class07082 class07082 = class06584.N(var1, this, var2);
            if (class07082.N()) {
               return class07082;
            }
         }

         if (this.NU() && !var1.method_21823()) {
            this.N(var1);
            return class07082.N;
         } else {
            return super.N(var1, var2);
         }
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.Nc);
   }

   protected class07109 N(class07438 var1) {
      return new class07109(var1.method_36455() * 0.5F, var1.method_36454());
   }

   private void N(CallbackInfo var1) {
      this.lithium$updateNavigationRegistration();
   }

   public boolean W() {
      return this.field_6011.N(f);
   }

   private int G() {
      return !this.method_6109() && this.method_6118(class07085.field_48824).R() ? 64 : 32;
   }

   private boolean Y() {
      class00734 class00734x = this.method_5829();
      class00734 class00734x = new class00734(
         class00734x.N - 1.0, class00734x.i - 1.0E-5F, class00734x.L - 1.0, class00734x.u + 1.0, class00734x.i + class00734x.L() / 2.0, class00734x.R + 1.0
      );

      for (class08036 class08036 : this.method_73183().method_18456()) {
         if (!class08036.method_7325()) {
            class07049 class07049 = class08036.method_5668();
            if (!(class07049 instanceof class00032) && class00734x.u(class07049.method_73189())) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public class06889 ac_() {
      return class06889.L;
   }

   @Override
   public int m_() {
      int ix = super.m_();
      return this.method_5782() ? ix * 6 : ix;
   }

   @Override
   protected class07472 Z_() {
      return new class09048(this);
   }

   @Override
   protected void l_() {
      this.e.N(3, new class09047(this));
      this.e.N(4, new class07970(this, 1.0, var1 -> !this.NU() && !this.method_6109() ? var1.N(class01226.NX) : var1.N(class01226.Nc), false, 7.0));
      this.e.N(5, new class07535(this, 16));
   }

   @Override
   public int n_() {
      return 1;
   }

   @Override
   public double p_() {
      return 16.0;
   }

   @Override
   public void o_() {
      super.o_();
      this.F().M();
   }

   @Override
   public double q_() {
      return 10.0;
   }

   @Override
   public float method_56077(float var1) {
      return Math.min(var1, 1.0F);
   }

   @Override
   public class05781<class00032> method_28306() {
      return class00008.N();
   }

   @Override
   public class04891 method_6002() {
      return this.method_6109() ? class04909.WR : class04909.mw;
   }

   @Override
   public float method_6107() {
      return this.method_6109() ? 1.0F : 4.0F;
   }

   @Override
   public void method_6007() {
      if (!this.method_73183().method_8608()) {
         this.method_70669(this.v());
      }

      super.method_6007();
      this.d();
   }

   @Override
   public float method_17825() {
      return this.method_6109() ? 0.2375F : 1.0F;
   }

   @Override
   public void method_6091(class06889 var1) {
      float fx = (float)this.method_45325(class05298.m) * 5.0F / 3.0F;
      this.method_70671(var1, fx, fx, fx);
   }

   @Override
   public boolean method_6094() {
      return this.method_6109() ? true : super.method_6094();
   }

   @Override
   public void method_49481(class08036 var1, class06889 var2) {
      super.method_49481(var1, var2);
      class07109 class07109 = this.N((class07438)var1);
      float fx = this.method_36454();
      float f1 = class04995.R(class07109.U - fx);
      float f2 = 0.08F;
      fx += f1 * 0.08F;
      this.method_5710(fx, class07109.z);
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = fx;
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = fx;
      this.field_5982 = fx;
   }

   @Override
   public boolean method_63626(class07085 var1) {
      return var1 == class07085.field_48824;
   }

   @Override
   public boolean method_6101() {
      return false;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.method_6109() ? class04909.WM : class04909.mk;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class00008.N(this.method_28306().N(var1));
   }

   @Override
   public float method_6017() {
      return 1.0F;
   }

   @Override
   public class06889 method_49482(class08036 var1, class06889 var2) {
      float fx = var1.fields_7212a028292fd3c078969e3ee4c71d9e8_0;
      float f1 = 0.0F;
      float f2 = 0.0F;
      if (var1.fields_7212a028292fd3c078969e3ee4c71d9e8_2 != 0.0F) {
         float f3 = class04995.P(var1.method_36455() * (float) (Math.PI / 180.0));
         float f4 = -class04995.m(var1.method_36455() * (float) (Math.PI / 180.0));
         if (var1.fields_7212a028292fd3c078969e3ee4c71d9e8_2 < 0.0F) {
            f3 *= -0.5F;
            f4 *= -0.5F;
         }

         f2 = f4;
         f1 = f3;
      }

      if (var1.method_70673()) {
         f2 += 0.5F;
      }

      return new class06889(fx, f2, f1).L(3.9F * this.method_45325(class05298.m));
   }

   @Override
   public boolean method_56991(class07085 var1) {
      return var1 != class07085.field_48824 ? super.method_56991(var1) : this.method_5805() && !this.method_6109();
   }

   @Override
   public boolean T_() {
      return false;
   }

   @Override
   protected boolean k_() {
      return false;
   }
}
