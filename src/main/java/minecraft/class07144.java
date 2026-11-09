package minecraft;

import Nursultan.class10723;
import java.util.Optional;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class class07144 extends class07649 implements class07542 {
   private static final class01894 i = class01894.y("covered");
   private static final class07471 R = new class07471(i, 20.0, class07463.field_6328);
   protected static final class02131<class07211> N = class03289.N(class07144.class, class02154.T);
   protected static final class02131<Byte> y = class03289.N(class07144.class, class02154.N);
   protected static final class02131<Byte> L = class03289.N(class07144.class, class02154.N);
   private static final int M = 6;
   private static final byte B = 16;
   private static final byte Z = 16;
   private static final int W = 8;
   private static final int T = 8;
   private static final int b = 5;
   private static final float X = 0.05F;
   private static final byte a = 0;
   private static final class07211 p = class07211.field_11033;
   static final Vector3f u = class07536.N(() -> {
      class00753 class00753 = class07211.field_11035.E();
      return new Vector3f(class00753.method_10263(), class00753.method_10264(), class00753.method_10260());
   });
   private static final float F = 3.0F;
   private float A;
   private float f;
   @Nullable
   private class07209 C;
   private int S;
   private static final float x = 1.0F;

   public static class05300 M() {
      return class07079.H().N(class05298.n, 30.0);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (N.equals(var1)) {
         this.method_5857(this.method_33332());
      }

      super.method_5674(var1);
   }

   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = 0.0F;
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = 0.0F;
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.yN);
      super.method_66649(var1);
   }

   @Override
   public void method_5848() {
      super.method_5848();
      if (this.method_73183().method_8608()) {
         this.C = this.method_24515();
      }

      super.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = 0.0F;
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = 0.0F;
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, p);
      var1.N(y, (byte)0);
      var1.N(L, (byte)16);
   }

   @Override
   public void method_5814(double var1, double var3, double var5) {
      class07209 class07209x = this.method_24515();
      if (this.method_5765()) {
         super.method_5814(var1, var3, var5);
      } else {
         super.method_5814(class04995.N(var1) + 0.5, class04995.N(var3 + 0.5), class04995.N(var5) + 0.5);
      }

      if (this.field_6012 != 0) {
         class07209 class07209x = this.method_24515();
         if (!class07209x.equals(class07209x)) {
            this.field_6011.N(y, (byte)0);
            this.field_64356 = true;
            if (this.method_73183().method_8608() && !this.method_5765() && !class07209x.equals(this.C)) {
               this.C = class07209x;
               this.S = 6;
               this.field_6038 = this.method_23317();
               this.field_5971 = this.method_23318();
               this.field_5989 = this.method_23321();
            }
         }
      }
   }

   @Override
   protected class00734 method_65341(class06889 var1) {
      float fx = R(this.f);
      class07211 class07211 = this.E().b();
      return N(this.method_55693(), class07211, fx, var1);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (!this.method_73183().method_8608() && !this.method_5765() && !this.N(this.method_24515(), this.E())) {
         this.v();
      }

      if (this.n()) {
         this.t();
      }

      if (this.method_73183().method_8608()) {
         if (this.S > 0) {
            this.S--;
         } else {
            this.C = null;
         }
      }
   }

   @Override
   public void method_18799(class06889 var1) {
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15251;
   }

   @Override
   public void method_5784(class07451 var1, class06889 var2) {
      if (var1 == class07451.field_6306) {
         this.B();
      } else {
         super.method_5784(var1, var2);
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.G()) {
         class07049 class07049x = var2.L();
         if (class07049x instanceof class08007) {
            return false;
         }
      }

      if (!super.method_64397(var1, var2, var3)) {
         return false;
      } else {
         if (this.method_6032() < this.method_6063() * 0.5 && this.field_5974.y(4) == 0) {
            this.B();
         } else if (var2.N(class03696.z)) {
            class07049 class07049 = var2.L();
            if (class07049 != null && class07049.method_5864() == class07078.yE) {
               this.l();
            }
         }

         return true;
      }
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28630;
   }

   @Override
   public class06889 method_18798() {
      return class06889.L;
   }

   @Override
   public void method_5697(class07049 var1) {
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("AttachFace", class07211.field_57037, this.E());
      var1.N("Peek", this.field_6011.N(y).byteValue());
      var1.N("Color", this.field_6011.N(L).byteValue());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.yN ? method_66651(var1, this.m()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class07211>N("AttachFace", class07211.field_57037).orElse(p));
      this.field_6011.N(y, var1.N("Peek", (byte)0));
      this.field_6011.N(L, var1.N("Color", (byte)16));
   }

   @Override
   public boolean method_30948(@Nullable class07049 var1) {
      return this.method_5805();
   }

   @Override
   public boolean method_5873(class07049 var1, boolean var2, boolean var3) {
      if (this.method_73183().method_8608()) {
         this.C = null;
         this.S = 0;
      }

      this.N(class07211.field_11033);
      return super.method_5873(var1, var2, var3);
   }

   @Override
   public class08382 method_66233() {
      return null;
   }

   public class07144(class07078<? extends class07144> var1, class07299 var2) {
      super(var1, var2);
      this.J = 5;
      this.o = new class07152(this, this);
   }

   protected boolean B() {
      if (!this.Nt() && this.method_5805()) {
         class07209 class07209x = this.method_24515();

         for (int ix = 0; ix < 5; ix++) {
            class07209 class07209x = class07209x.method_10069(
               class04995.y(this.field_5974, -8, 8), class04995.y(this.field_5974, -8, 8), class04995.y(this.field_5974, -8, 8)
            );
            if (class07209x.method_10264() > this.method_73183().method_31607()
               && this.method_73183().R(class07209x)
               && this.method_73183().method_8621().N(class07209x)
               && this.method_73183().method_8587(this, new class00734(class07209x).B(1.0E-6))) {
               class07211 class07211 = this.N(class07209x);
               if (class07211 != null) {
                  this.method_18375();
                  this.N(class07211);
                  this.method_5783(class04909.ku, 1.0F, 1.0F);
                  this.method_5814(class07209x.method_10263() + 0.5, class07209x.method_10264(), class07209x.method_10260() + 0.5);
                  this.method_73183().N(class01194.F, class07209x, class01164.N(this));
                  this.field_6011.N(y, (byte)0);
                  this.y(null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void D() {
      if (!this.G()) {
         super.D();
      }
   }

   @Nullable
   public class06889 i(float var1) {
      if (this.C != null && this.S > 0) {
         double d0 = (this.S - var1) / 6.0;
         d0 *= d0;
         d0 *= this.method_55693();
         class07209 class07209 = this.method_24515();
         double d1 = (class07209.method_10263() - this.C.method_10263()) * d0;
         double d2 = (class07209.method_10264() - this.C.method_10264()) * d0;
         double d3 = (class07209.method_10260() - this.C.method_10260()) * d0;
         return new class06889(-d1, -d2, -d3);
      } else {
         return null;
      }
   }

   @Override
   protected class04891 s() {
      return class04909.wA;
   }

   private boolean n() {
      this.A = this.f;
      float fx = this.d() * 0.01F;
      if (this.f == fx) {
         return false;
      } else {
         if (this.f > fx) {
            this.f = class04995.N(this.f - 0.05F, fx, 1.0F);
         } else {
            this.f = class04995.N(this.f + 0.05F, 0.0F, fx);
         }

         return true;
      }
   }

   private void l() {
      class06889 class06889 = this.method_73189();
      class00734 class00734 = this.method_5829();
      if (!this.G() && this.B()) {
         float fx = (this.method_73183().method_18023(class07078.yU, class00734.M(8.0), class07049::method_5805).size() - 1) / 5.0F;
         if (!(this.method_73183().field_9229.z() < fx)) {
            class07144 class07144 = class07078.yU.N(this.method_73183(), class06113.field_16466);
            if (class07144 != null) {
               class07144.N(this.W());
               class07144.method_29495(class06889);
               this.method_73183().method_8649(class07144);
            }
         }
      }
   }

   private int d() {
      return this.field_6011.N(y);
   }

   @Nullable
   public class06563 m() {
      byte b0 = this.field_6011.N(L);
      return b0 != 16 && b0 <= 15 ? class06563.N(b0) : null;
   }

   private void t() {
      this.method_23311();
      float fx = R(this.f);
      float f1 = R(this.A);
      class07211 class07211 = this.E().b();
      float f2 = (fx - f1) * this.method_55693();
      if (!(f2 <= 0.0F)) {
         for (class07049 class07049 : this.method_73183()
            .method_8333(this, N(this.method_55693(), class07211, f1, fx, this.method_73189()), class07042.R.and(var1x -> !var1x.method_5794(this)))) {
            if (!(class07049 instanceof class07144) && !class07049.field_5960) {
               class07049.method_5784(class07451.field_6309, new class06889(f2 * class07211.P(), f2 * class07211.s(), f2 * class07211.T()));
            }
         }
      }
   }

   private void v() {
      class07211 class07211 = this.N(this.method_24515());
      if (class07211 != null) {
         this.N(class07211);
      } else {
         this.B();
      }
   }

   public float u(float var1) {
      return class04995.B(var1, this.A, this.f);
   }

   private boolean y(class07209 var1) {
      class00500 class00500 = this.method_73183().method_8320(var1);
      return class00500.P() ? false : !class00500.N(class00869.LN) || !var1.equals(this.method_24515());
   }

   public class07211 E() {
      return this.field_6011.N(N);
   }

   private void N(Optional<class06563> var1) {
      this.field_6011.N(L, var1.<Byte>map(var0 -> (byte)var0.N()).orElse((byte)16));
   }

   private void N(class07211 var1) {
      this.field_6011.N(N, var1);
   }

   @Nullable
   protected class07211 N(class07209 var1) {
      for (class07211 class07211 : class07211.values()) {
         if (this.N(var1, class07211)) {
            return class07211;
         }
      }

      return null;
   }

   boolean N(class07209 var1, class07211 var2) {
      if (this.y(var1)) {
         return false;
      } else {
         class07211 class07211 = var2.b();
         if (!this.method_73183().method_24368(var1.method_10093(var2), this, class07211)) {
            return false;
         } else {
            class00734 class00734 = N(this.method_55693(), class07211, 1.0F, var1.method_61082()).B(1.0E-6);
            return this.method_73183().method_8587(this, class00734);
         }
      }
   }

   public static class00734 N(float var0, class07211 var1, float var2, class06889 var3) {
      return N(var0, var1, -1.0F, var2, var3);
   }

   public static class00734 N(float var0, class07211 var1, float var2, float var3, class06889 var4) {
      class00734 class00734 = new class00734(-var0 * 0.5, 0.0, -var0 * 0.5, var0 * 0.5, var0, var0 * 0.5);
      double d0 = Math.max(var2, var3);
      double d1 = Math.min(var2, var3);
      return class00734.y(var1.P() * d0 * var0, var1.s() * d0 * var0, var1.T() * d0 * var0)
         .N(-var1.P() * (1.0 + d1) * var0, -var1.s() * (1.0 + d1) * var0, -var1.T() * (1.0 + d1) * var0)
         .u(var4.M, var4.B, var4.Z);
   }

   void N(int var1) {
      if (!this.method_73183().method_8608()) {
         this.method_5996(class05298.y).L(i);
         if (var1 == 0) {
            this.method_5996(class05298.y).u(R);
            this.method_5783(class04909.wD, 1.0F, 1.0F);
            this.method_32876(class01194.z);
         } else {
            this.method_5783(class04909.ky, 1.0F, 1.0F);
            this.method_32876(class01194.U);
         }
      }

      this.field_6011.N(y, (byte)var1);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      this.method_36456(0.0F);
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = this.method_36454();
      this.method_22862();
      return super.N(var1, var2, var3, var4);
   }

   public Optional<class06563> W() {
      return Optional.ofNullable(this.m());
   }

   private static float R(float var0) {
      return 0.5F - class04995.m((0.5F + var0) * (float) Math.PI) * 0.5F;
   }

   @Override
   public int Ni() {
      return 180;
   }

   private boolean G() {
      return this.d() == 0;
   }

   @Override
   public int NR() {
      return 180;
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.yN) {
         this.N(Optional.of(method_66651(class02484.yN, var2)));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   protected class07472 Z_() {
      return new class10723(this);
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07962(this, class08036.class, 8.0F, 0.02F, true));
      this.e.N(4, new class07170(this));
      this.e.N(7, new class07159(this));
      this.e.N(8, new class07956(this));
      this.H.N(1, new class07989(this, this.getClass()).N());
      this.H.N(2, new class07169(this, this));
      this.H.N(3, new class07181(this));
   }

   @Override
   public float method_56077(float var1) {
      return Math.min(var1, 3.0F);
   }

   @Override
   public class04891 method_6002() {
      return class04909.wh;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.G() ? class04909.kN : class04909.wr;
   }
}
