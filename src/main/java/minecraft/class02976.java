package minecraft;

import Nursultan.class10084;
import Nursultan.class10086;
import Nursultan.class10088;
import com.mojang.serialization.Dynamic;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.jspecify.annotations.Nullable;

public class class02976 extends class07862 {
   public static final float f = 0.45F;
   public static final int C = 55;
   public static final int S = 30;
   private static final float NE = 0.1F;
   private static final float NW = 1.4285F;
   private static final float Nm = 22.2222F;
   private static final int NP = 5;
   private static final int Ns = 40;
   private static final int NT = 52;
   private static final int Nb = 80;
   private static final float Nj = 1.43F;
   private static final long Nv = 0L;
   public static final class02131<Boolean> x = class03289.N(class02976.class, class02154.U);
   public static final class02131<Long> D = class03289.N(class02976.class, class02154.L);
   public final class04396 h = new class04396();
   public final class04396 r = new class04396();
   public final class04396 NN = new class04396();
   public final class04396 Ny = new class04396();
   public final class04396 NL = new class04396();
   private static final class01325 Nn = class01325.y(class07078.t.z(), class07078.t.U() - 1.43F).y(0.845F);
   private int Nt = 0;
   private int NG = 0;

   protected class03529<class04891> w() {
      return class04909.ii;
   }

   private void L(class07049 var1) {
      var1.method_5636(this.method_36454());
      float fx = var1.method_36454();
      float f1 = class04995.R(fx - this.method_36454());
      float f2 = class04995.N(f1, -160.0F, 160.0F);
      var1.field_5982 += f2 - f1;
      float f3 = fx + f2 - f1;
      var1.method_36456(f3);
      var1.method_5847(f3);
   }

   @Override
   protected boolean L(class08036 var1, class06584 var2) {
      if (!this.N(var2)) {
         return false;
      } else {
         boolean flag = this.method_6032() < this.method_6063();
         if (flag) {
            this.method_6025(2.0F);
         }

         boolean flag1 = this.I() && this.K() == 0 && this.T_();
         if (flag1) {
            this.i(var1);
         }

         boolean flag2 = this.method_6109();
         if (flag2) {
            this.method_73183().method_8406(class07107.F, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), 0.0, 0.0, 0.0);
            if (!this.method_73183().method_8608()) {
               this.L(10);
            }
         }

         if (!flag && !flag1 && !flag2) {
            return false;
         } else {
            if (!this.method_5701()) {
               class04891 class04891 = this.G();
               if (class04891 != null) {
                  this.method_73183()
                     .method_43128(
                        null,
                        this.method_23317(),
                        this.method_23318(),
                        this.method_23321(),
                        class04891,
                        this.method_5634(),
                        1.0F,
                        1.0F + (this.field_5974.z() - this.field_5974.z()) * 0.2F
                     );
               }
            }

            this.method_32876(class01194.W);
            return true;
         }
      }
   }

   @Override
   public class06889 M(float var1) {
      class01325 class01325 = this.method_18377(this.method_18376());
      float fx = this.method_17825();
      return new class06889(0.0, this.N(true, var1, class01325, fx) - 0.2F * fx, class01325.N() * 0.56F);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (!this.field_5953 && x.equals(var1)) {
         this.Nt = this.Nt == 0 ? 55 : this.Nt;
      }

      super.method_5674(var1);
   }

   @Override
   public boolean method_48155() {
      return true;
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(x, false);
      var1.N(D, 0L);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.Nr() && this.Nt < 50 && (this.method_24828() || this.method_52535() || this.method_5765())) {
         this.N(false);
      }

      if (this.Nt > 0) {
         this.Nt--;
         if (this.Nt == 0) {
            this.method_73183().method_8396(null, this.method_24515(), this.v(), class04911.field_15254, 1.0F, 1.0F);
         }
      }

      if (this.method_73183().method_8608()) {
         this.ym();
      }

      if (this.Nh()) {
         this.NM();
      }

      if (this.yy() && this.method_5799()) {
         this.yM();
      }
   }

   @Override
   public void method_5644(class07049 var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20) && this.method_5642() != var1) {
         this.L(var1);
      }
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      if (var2.N(class01210.yQ)) {
         this.method_5783(class04909.iZ, 1.0F, 1.0F);
      } else {
         this.method_5783(class04909.iB, 1.0F, 1.0F);
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("LastPoseTick", this.field_6011.N(D).longValue());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      long i = var1.N("LastPoseTick", 0L);
      if (i < 0L) {
         this.method_18380(class01312.field_40118);
      }

      this.N(i);
   }

   @Override
   protected class06889 method_52533(class07049 var1, class01325 var2, float var3) {
      boolean flag = Math.max(this.method_5685().indexOf(var1), 0) == 0;
      float fx = 0.5F;
      float f1 = (float)(this.method_31481() ? 0.01F : this.N(flag, 0.0F, var2, var3));
      if (this.method_5685().size() > 1) {
         if (!flag) {
            fx = -0.7F;
         }

         if (var1 instanceof class07633) {
            fx += 0.2F;
         }
      }

      return new class06889(0.0, f1, fx * var3).y(-this.method_36454() * (float) (Math.PI / 180.0));
   }

   @Override
   protected boolean method_5818(class07049 var1) {
      return this.method_5685().size() <= 2;
   }

   @Override
   protected void method_5865(class07049 var1, class07067 var2) {
      super.method_5865(var1, var2);
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20)) {
         this.L(var1);
      }
   }

   public class02976(class07078<? extends class02976> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class10086(this);
      this.o = new class10088(this);
      class07655 class07655 = (class07655)this.f();
      class07655.N(true);
      class07655.u(true);
   }

   @Override
   public boolean I() {
      return true;
   }

   @Override
   protected class04891 s() {
      return class04909.uh;
   }

   @Override
   public int n() {
      return this.Nt;
   }

   protected class04891 l() {
      return class04909.iM;
   }

   protected class04891 d() {
      return class04909.iR;
   }

   @Override
   public boolean m() {
      return !this.Nh() && super.m();
   }

   @Override
   public void t() {
   }

   protected class04891 v() {
      return class04909.iN;
   }

   @Override
   protected class07109 u(class07438 var1) {
      return this.Nh() ? new class07109(this.method_36455(), this.method_36454()) : super.u(var1);
   }

   @Override
   public void y(int var1) {
      this.method_56078(this.W());
      this.method_32876(class01194.n);
      this.N(true);
   }

   private void y(long var1) {
      this.N(Math.max(0L, var1 - 52L - 1L));
   }

   @Override
   public void N(class08036 var1) {
      if (!this.method_73183().method_8608()) {
         var1.method_7291(this, this.M);
      }
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("camelBrain");
      ((class01289<class02976>)this.method_18868()).N(var1, this);
      class04643.L();
      class04643.N("camelActivityUpdate");
      class02954.N(this);
      class04643.L();
      super.N(var1);
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.Na);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (var1.method_21823() && !this.method_6109()) {
         this.N(var1);
         return class07082.N;
      } else {
         class07082 class07082 = class06584.N(var1, this, var2);
         if (class07082.N()) {
            return class07082;
         } else if (this.N(class06584)) {
            return this.y(var1, class06584);
         } else {
            if (this.method_5685().size() < 2 && !this.method_6109()) {
               this.y(var1);
            }

            return this.ys();
         }
      }
   }

   @Nullable
   public class02976 N(class04782 var1, class07077 var2) {
      return class07078.t.N(var1, class06113.field_16466);
   }

   public final double N(boolean var1, float var2, class01325 var3, float var4) {
      double d0 = var3.y() - 0.375F * var4;
      float fx = var4 * 1.43F;
      float f1 = fx - var4 * 0.2F;
      float f2 = fx - f1;
      boolean flag = this.yu();
      boolean flag1 = this.yy();
      if (flag) {
         int i = flag1 ? 40 : 52;
         int j;
         float f3;
         if (flag1) {
            j = 28;
            f3 = var1 ? 0.5F : 0.1F;
         } else {
            j = var1 ? 24 : 32;
            f3 = var1 ? 0.6F : 0.35F;
         }

         float f4 = class04995.N((float)this.yB() + var2, 0.0F, (float)i);
         boolean flag2 = f4 < j;
         float f5 = flag2 ? f4 / j : (f4 - j) / (i - j);
         float f6 = fx - f3 * f1;
         d0 += flag1 ? class04995.B(f5, flag2 ? fx : f6, flag2 ? f6 : f2) : class04995.B(f5, flag2 ? f2 - fx : f2 - f6, flag2 ? f2 - f6 : 0.0F);
      }

      if (flag1 && !flag) {
         d0 += f2;
      }

      return d0;
   }

   public void N(long var1) {
      this.field_6011.N(D, var1);
   }

   public static boolean N(class07078<class02976> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8320(var3.method_10074()).N(class01210.Ll) && N(var1, var3);
   }

   public void N(boolean var1) {
      this.field_6011.N(x, var1);
   }

   @Override
   protected void N(float var1, class06889 var2) {
      double d0 = this.method_6106();
      this.method_45319(
         this.method_5720().u(1.0, 0.0, 1.0).u().L(22.2222F * var1 * this.method_45325(class05298.l) * this.method_23326()).y(0.0, 1.4285F * var1 * d0, 0.0)
      );
      this.Nt = 55;
      this.N(true);
      this.field_64356 = true;
   }

   @Override
   public void N(int var1) {
      if (this.Nz() && this.Nt <= 0 && this.method_24828()) {
         super.N(var1);
      }
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class02954.N(this, var1.method_8409());
      this.y(var1.method_8410().N());
      return super.N(var1, var2, var3, var4);
   }

   @Override
   public boolean N(class07633 var1) {
      return var1 != this && var1 instanceof class02976 class02976 && this.NS() && class02976.NS();
   }

   public void yi() {
      if (!this.yy()) {
         this.method_56078(this.d());
         this.method_18380(class01312.field_40118);
         this.method_32876(class01194.n);
         this.N(-this.method_73183().N());
      }
   }

   protected class04891 W() {
      return class04909.ur;
   }

   public boolean yu() {
      return this.yB() < (this.yy() ? 40 : 52);
   }

   public static class05300 ND() {
      return NK().N(class05298.n, 32.0).N(class05298.l, 0.09F).N(class05298.T, 0.42F).N(class05298.O, 1.5);
   }

   private boolean yP() {
      return this.yy() && this.yB() < 40L && this.yB() >= 0L;
   }

   public void yM() {
      this.method_18380(class01312.field_18076);
      this.method_32876(class01194.n);
      this.y(this.method_73183().N());
   }

   public long yB() {
      return this.method_73183().N() - Math.abs(this.field_6011.N(D));
   }

   @Override
   protected class04891 G() {
      return class04909.iL;
   }

   @Override
   public int NR() {
      return 30;
   }

   public void yR() {
      if (this.yy()) {
         this.method_56078(this.l());
         this.method_18380(class01312.field_18076);
         this.method_32876(class01194.n);
         this.N(this.method_73183().N());
      }
   }

   private class07041 ys() {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_9) ? class07082.N : class07082.L;
   }

   @Override
   public class06889[] ab_() {
      return class02607.N(this, 0.02, 0.48, 0.25, 0.82);
   }

   @Override
   protected class07472 Z_() {
      return new class10084(this, this);
   }

   @Override
   protected void l_() {
   }

   public boolean Nr() {
      return this.field_6011.N(x);
   }

   public boolean Nh() {
      return this.yy() || this.yu();
   }

   @Override
   public void o_() {
      super.o_();
      if (this.yy() && !this.yu() && this.yN()) {
         this.yR();
      }
   }

   public boolean yL() {
      return this.yB() < 0L != this.yy();
   }

   public boolean yy() {
      return this.field_6011.N(D) < 0L;
   }

   private void ym() {
      if (this.NG <= 0) {
         this.NG = this.field_5974.y(40) + 80;
         this.Ny.N(this.field_6012);
      } else {
         this.NG--;
      }

      if (this.yL()) {
         this.NN.N();
         this.NL.N();
         if (this.yP()) {
            this.h.y(this.field_6012);
            this.r.N();
         } else {
            this.h.N();
            this.r.y(this.field_6012);
         }
      } else {
         this.h.N();
         this.r.N();
         this.NL.N(this.Nr(), this.field_6012);
         this.NN.N(this.yu() && this.yB() >= 0L, this.field_6012);
      }
   }

   public boolean yN() {
      return this.method_52542(this.yy() ? class01312.field_18076 : class01312.field_40118);
   }

   @Override
   protected boolean Nq() {
      return false;
   }

   @Override
   public class05781<class02976> method_28306() {
      return class02954.N();
   }

   @Override
   public float method_49485(class08036 var1) {
      float fx = var1.method_5624() && this.n() == 0 ? 0.1F : 0.0F;
      return (float)this.method_45325(class05298.l) + fx;
   }

   @Override
   public class04891 method_6002() {
      return class04909.iy;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return var1 == class01312.field_40118 ? Nn.N(this.method_17825()) : super.method_55694(var1);
   }

   @Override
   public void method_48565(float var1) {
      float fx;
      if (this.method_18376() == class01312.field_18076 && !this.NL.y()) {
         fx = Math.min(var1 * 6.0F, 1.0F);
      } else {
         fx = 0.0F;
      }

      super.fields_3212a028292fd3c078969e3ee4c71d9e8_3.N(fx, 0.2F, this.method_6109() ? 3.0F : 1.0F);
   }

   @Override
   public float method_17825() {
      return this.method_6109() ? 0.45F : 1.0F;
   }

   @Override
   public void method_6074(class04782 var1, class07072 var2, float var3) {
      this.yM();
      super.method_6074(var1, var2, var3);
   }

   @Override
   public void method_6091(class06889 var1) {
      if (this.Nh() && this.method_24828()) {
         this.method_18799(this.method_18798().u(0.0, 1.0, 0.0));
         var1 = var1.u(0.0, 1.0, 0.0);
      }

      super.method_6091(var1);
   }

   @Override
   public void method_49481(class08036 var1, class06889 var2) {
      super.method_49481(var1, var2);
      if (var1.fields_7212a028292fd3c078969e3ee4c71d9e8_2 > 0.0F && this.yy() && !this.yu()) {
         this.yR();
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.iu;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class02954.N(this.method_28306().N(var1));
   }

   @Override
   public class03556<class04891> method_66667(class07085 var1, class06584 var2, class08725 var3) {
      return (class03556<class04891>)(var1 == class07085.field_55946 ? this.w() : super.method_66667(var1, var2, var3));
   }

   @Override
   public class06889 method_49482(class08036 var1, class06889 var2) {
      return this.Nh() ? class06889.L : super.method_49482(var1, var2);
   }
}
