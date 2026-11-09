package minecraft;

import Nursultan.class10714;
import Nursultan.class10847;
import com.google.common.collect.UnmodifiableIterator;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.DoubleSupplier;
import java.util.function.IntUnaryOperator;
import org.jspecify.annotations.Nullable;

public abstract class class07862 extends class07633 implements class02145, class03969, class07431 {
   public static final int N = 499;
   public static final int y = 500;
   public static final double L = 0.15;
   private static final float f = (float)y(() -> 0.0);
   private static final float C = (float)y(() -> 1.0);
   private static final float S = (float)N(() -> 0.0);
   private static final float x = (float)N(() -> 1.0);
   private static final float D = N_85(var0 -> 0);
   private static final float h = N_85(var0 -> var0 - 1);
   private static final float r = 0.25F;
   private static final float NN = 0.5F;
   private static final class01317 Ny = (var0, var1) -> var0 instanceof class07862 && ((class07862)var0).NO();
   private static final class01328 NL = class01328.y().N(16.0).u().N(Ny);
   private static final class02131<Byte> NE = class03289.N(class07862.class, class02154.N);
   private static final int NW = 2;
   private static final int Nm = 8;
   private static final int NP = 16;
   private static final int Ns = 32;
   private static final int NT = 64;
   public static final int u = 3;
   private static final int Nb = 0;
   private static final boolean Nj = false;
   private static final boolean Nv = false;
   private static final boolean Nn = false;
   private int Nt;
   private int NG;
   private int Nl;
   public int i;
   public int R;
   protected class07075 M;
   protected int B = 0;
   protected float Z;
   protected boolean X;
   private float Nd;
   private float Nw;
   private float Nk;
   public float p;
   private float NY;
   private float NQ;
   protected boolean F = true;
   protected int A;
   @Nullable
   private class08372<class07438> NO;

   protected boolean L(class08036 var1, class06584 var2) {
      boolean flag = false;
      float fx = 0.0F;
      short short1 = 0;
      byte b0 = 0;
      if (var2.N(class06570.bL)) {
         fx = 2.0F;
         short1 = 20;
         b0 = 3;
      } else if (var2.N(class06570.vg)) {
         fx = 1.0F;
         short1 = 30;
         b0 = 3;
      } else if (var2.N(class00869.zy.B())) {
         fx = 20.0F;
         short1 = 180;
      } else if (var2.N(class06570.sS)) {
         fx = 3.0F;
         short1 = 60;
         b0 = 3;
      } else if (var2.N(class06570.uX)) {
         fx = 3.0F;
         short1 = 0;
         b0 = 3;
      } else if (var2.N(class06570.Gb)) {
         fx = 3.0F;
         short1 = 60;
         b0 = 3;
      } else if (var2.N(class06570.GG)) {
         fx = 4.0F;
         short1 = 60;
         b0 = 5;
         if (!this.method_73183().method_8608() && this.I() && this.K() == 0 && !this.NX()) {
            flag = true;
            this.i(var1);
         }
      } else if (var2.N(class06570.bV) || var2.N(class06570.be)) {
         fx = 10.0F;
         short1 = 240;
         b0 = 10;
         if (!this.method_73183().method_8608() && this.I() && this.K() == 0 && !this.NX()) {
            flag = true;
            this.i(var1);
         }
      }

      if (this.method_6032() < this.method_6063() && fx > 0.0F) {
         this.method_6025(fx);
         flag = true;
      }

      if (this.method_6109() && short1 > 0) {
         this.method_73183().method_8406(class07107.F, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), 0.0, 0.0, 0.0);
         if (!this.method_73183().method_8608()) {
            this.L(short1);
            flag = true;
         }
      }

      if (b0 > 0 && (flag || !this.I()) && this.Ng() < this.NV() && !this.method_73183().method_8608()) {
         this.z(b0);
         flag = true;
      }

      if (flag) {
         this.W();
         this.method_32876(class01194.W);
      }

      return flag;
   }

   protected void L(class04782 var1) {
      if (this.NO() && this.method_6109() && !this.o()) {
         class07438 class07438 = var1.N(class07862.class, NL, this, this.method_23317(), this.method_23318(), this.method_23321(), this.method_5829().M(16.0));
         if (class07438 != null && this.method_5858(class07438) > 4.0) {
            this.V.N(class07438, 0);
         }
      }
   }

   protected void No() {
      class07075 class07075 = this.M;
      this.M = new class07075(this.NJ());
      if (class07075 != null) {
         int ix = Math.min(class07075.method_5439(), this.M.method_5439());

         for (int j = 0; j < ix; j++) {
            class06584 class06584 = class07075.method_5438(j);
            if (!class06584.R()) {
               this.M.method_5447(j, class06584.t());
            }
         }
      }
   }

   public void M(boolean var1) {
      this.y(2, var1);
   }

   protected void Q() {
      this.e.N(0, new class07427(this));
      this.e.N(3, new class07960(this, 1.25, var0 -> var0.N(class01226.Ne), false));
   }

   @Override
   public class06889 method_24829(class07438 var1) {
      class06889 class06889xxx = method_24826(
         this.method_17681(), var1.method_17681(), this.method_36454() + (var1.method_6068() == class07070.field_6183 ? 90.0F : -90.0F)
      );
      class06889 class06889x = this.N(class06889xxx, var1);
      if (class06889x != null) {
         return class06889x;
      } else {
         class06889 class06889xx = method_24826(
            this.method_17681(), var1.method_17681(), this.method_36454() + (var1.method_6068() == class07070.field_6182 ? 90.0F : -90.0F)
         );
         class06889 class06889xxx = this.N(class06889xx, var1);
         return class06889xxx != null ? class06889xxx : this.method_73189();
      }
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      int ix = var1 - 500;
      return ix >= 0 && ix < this.M.method_5439() ? this.M.method_32318(ix) : super.method_32318(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(NE, (byte)0);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.NG > 0 && ++this.NG > 30) {
         this.NG = 0;
         this.y(64, false);
      }

      if (this.Nl > 0 && --this.Nl <= 0) {
         this.NF();
      }

      if (this.i > 0 && ++this.i > 8) {
         this.i = 0;
      }

      if (this.R > 0) {
         this.R++;
         if (this.R > 300) {
            this.R = 0;
         }
      }

      this.Nw = this.Nd;
      if (this.o()) {
         this.Nd = this.Nd + ((1.0F - this.Nd) * 0.4F + 0.05F);
         if (this.Nd > 1.0F) {
            this.Nd = 1.0F;
         }
      } else {
         this.Nd = this.Nd + ((0.0F - this.Nd) * 0.4F - 0.05F);
         if (this.Nd < 0.0F) {
            this.Nd = 0.0F;
         }
      }

      this.p = this.Nk;
      if (this.NQ()) {
         this.Nd = 0.0F;
         this.Nw = this.Nd;
         this.Nk = this.Nk + ((1.0F - this.Nk) * 0.4F + 0.05F);
         if (this.Nk > 1.0F) {
            this.Nk = 1.0F;
         }
      } else {
         this.X = false;
         this.Nk = this.Nk + ((0.8F * this.Nk * this.Nk * this.Nk - this.Nk) * 0.6F - 0.05F);
         if (this.Nk < 0.0F) {
            this.Nk = 0.0F;
         }
      }

      this.NQ = this.NY;
      if (this.B(64)) {
         this.NY = this.NY + ((1.0F - this.NY) * 0.7F + 0.05F);
         if (this.NY > 1.0F) {
            this.NY = 1.0F;
         }
      } else {
         this.NY = this.NY + ((0.0F - this.NY) * 0.7F - 0.05F);
         if (this.NY < 0.0F) {
            this.NY = 0.0F;
         }
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      boolean flag = super.method_64397(var1, var2, var3);
      if (flag && this.field_5974.y(3) == 0) {
         this.Nf();
      }

      return flag;
   }

   @Override
   public boolean method_5747(double var1, float var3, class07072 var4) {
      if (var1 > 1.0) {
         this.method_5783(class04909.PX, 0.4F, 1.0F);
      }

      int ix = this.method_23329(var1, var3);
      if (ix <= 0) {
         return false;
      } else {
         this.method_64419(var4, ix);
         this.method_67345(var1, var3, var4);
         this.method_23328();
         return true;
      }
   }

   @Nullable
   @Override
   public class07438 method_5642() {
      if (this.Nz()) {
         class07049 class07049 = this.method_31483();
         if (class07049 instanceof class08036) {
            return (class08036)class07049;
         }
      }

      return super.method_5642();
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      if (!var2.T()) {
         class00500 class00500 = this.method_73183().method_8320(var1.method_10084());
         class07752 class07752 = var2.O();
         if (class00500.N(class00869.is)) {
            class07752 = class00500.O();
         }

         if (this.method_5782() && this.F) {
            this.A++;
            if (this.A > 5 && this.A % 3 == 0) {
               this.N(class07752);
            } else if (this.A <= 5) {
               this.method_5783(class04909.PF, class07752.N() * 0.15F, class07752.y());
            }
         } else if (this.y(class07752)) {
            this.method_5783(class04909.PF, class07752.N() * 0.15F, class07752.y());
         } else {
            this.method_5783(class04909.Pp, class07752.N() * 0.15F, class07752.y());
         }
      }
   }

   @Override
   public boolean method_5810() {
      return !this.method_5782();
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("EatingHaystack", this.o());
      var1.N("Bred", this.NO());
      var1.N("Temper", this.Ng());
      var1.N("Tame", this.I());
      class08372.N(this.NO, var1, "Owner");
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.Z(var1.N("EatingHaystack", false));
      this.B(var1.N("Bred", false));
      this.Z(var1.N("Temper", 0));
      this.M(var1.N("Tame", false));
      this.NO = class08372.N(var1, "Owner", this.method_73183());
   }

   @Override
   protected class06889 method_52533(class07049 var1, class01325 var2, float var3) {
      return super.method_52533(var1, var2, var3)
         .i(new class06889(0.0, 0.15 * this.p * var3, -0.7 * this.p * var3).y(-this.method_36454() * (float) (Math.PI / 180.0)));
   }

   @Override
   public void method_5865(class07049 var1, class07067 var2) {
      super.method_5865(var1, var2);
      if (var1 instanceof class07438) {
         ((class07438)var1).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = super.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      }
   }

   @Override
   protected void method_5627(class07049 var1) {
      super.method_5627(var1);
      float f1 = this.method_5695(0.0F);
      float fx = this.method_5705(0.0F);
      if (this.y(var1, fx, f1)) {
         var1.method_60608(fx, f1);
      }
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 7) {
         this.z(true);
      } else if (var1 == 6) {
         this.z(false);
      } else {
         super.method_5711(var1);
      }
   }

   public class07862(class07078<? extends class07862> var1, class07299 var2) {
      super(var1, var2);
      this.No();
   }

   public void B(boolean var1) {
      this.y(8, var1);
   }

   protected boolean B(int var1) {
      return (this.field_6011.N(NE) & var1) != 0;
   }

   public boolean B() {
      return false;
   }

   public boolean I() {
      return this.B(2);
   }

   public void Z(int var1) {
      this.B = var1;
   }

   public void Z(boolean var1) {
      this.y(16, var1);
   }

   public float i(float var1) {
      return class04995.B(var1, this.p, this.Nk);
   }

   private void l() {
      if (!this.method_73183().method_8608()) {
         this.NG = 1;
         this.y(64, true);
      }
   }

   @Override
   public boolean m() {
      return this.Nz();
   }

   public boolean o() {
      return this.B(16);
   }

   @Override
   public void t() {
   }

   private void v() {
      this.i = 1;
   }

   public void U(int var1) {
      this.Z(false);
      this.y(32, true);
      this.Nl = var1;
   }

   public int z(int var1) {
      int ix = class04995.N(this.Ng() + var1, 0, this.NV());
      this.Z(ix);
      return ix;
   }

   protected void z(boolean var1) {
      class07134 class07134 = var1 ? class07107.f : class07107.NZ;

      for (int ix = 0; ix < 7; ix++) {
         double d0 = this.field_5974.E() * 0.02;
         double d1 = this.field_5974.E() * 0.02;
         double d2 = this.field_5974.E() * 0.02;
         this.method_73183().method_8406(class07134, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d0, d1, d2);
      }
   }

   public class07109 u(class07438 var1) {
      return new class07109(var1.method_36455() * 0.5F, var1.method_36454());
   }

   public boolean u(class08036 var1) {
      this.N((class07438)var1);
      this.M(true);
      if (var1 instanceof class04770) {
         class06912.d.N((class04770)var1, this);
      }

      this.method_73183().method_8421(this, (byte)7);
      return true;
   }

   public float u(float var1) {
      return class04995.B(var1, this.Nw, this.Nd);
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return null;
   }

   private boolean y(class07049 var1, float var2, float var3) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_7);
   }

   protected static double y(DoubleSupplier var0) {
      return (0.45F + var0.getAsDouble() * 0.3 + var0.getAsDouble() * 0.3 + var0.getAsDouble() * 0.3) * 0.25;
   }

   private boolean y(class07752 var1) {
      return var1 == class07752.y || var1 == class07752.Nx || var1 == class07752.Y || var1 == class07752.ND || var1 == class07752.NS;
   }

   @Override
   public void y(int var1) {
      this.X = true;
      this.Nf();
      this.Y();
   }

   protected void y(int var1, boolean var2) {
      byte b0 = this.field_6011.N(NE);
      if (var2) {
         this.field_6011.N(NE, (byte)(b0 | var1));
      } else {
         this.field_6011.N(NE, (byte)(b0 & ~var1));
      }
   }

   public class07082 y(class08036 var1, class06584 var2) {
      boolean flag = this.N(this, var1, var2);
      if (flag) {
         var2.N(1, var1);
      }

      return (class07082)(!flag && !this.method_73183().method_8608() ? class07082.i : class07082.y);
   }

   protected void y(class08036 var1) {
      this.Z(false);
      this.NF();
      if (!this.method_73183().method_8608()) {
         var1.method_36456(this.method_36454());
         var1.method_36457(this.method_36455());
         var1.method_5804(this);
      }
   }

   @Override
   public void N(int var1) {
      if (this.Nz()) {
         if (var1 < 0) {
            var1 = 0;
         } else {
            this.X = true;
            this.Nf();
         }

         this.Z = this.d_(var1);
      }
   }

   protected void N(float var1, class06889 var2) {
      double d0 = this.method_56994(var1);
      class06889 class06889 = this.method_18798();
      this.method_18800(class06889.M, d0, class06889.Z);
      this.field_64356 = true;
      if (var2.Z > 0.0) {
         float fx = class04995.m(this.method_36454() * (float) (Math.PI / 180.0));
         float f1 = class04995.P(this.method_36454() * (float) (Math.PI / 180.0));
         this.method_18799(this.method_18798().y(-0.4F * fx * var1, 0.0, 0.4F * f1 * var1));
      }
   }

   protected void N(class07077 var1, class07862 var2) {
      this.N(var1, var2, class05298.n, D, h);
      this.N(var1, var2, class05298.T, S, x);
      this.N(var1, var2, class05298.l, f, C);
   }

   @Override
   public boolean N(class07633 var1) {
      return false;
   }

   private void N(class07077 var1, class07862 var2, class03556<class07468> var3, double var4, double var6) {
      double d0 = N(this.method_45326(var3), var1.method_45326(var3), var4, var6, this.field_5974);
      var2.method_5996(var3).N(d0);
   }

   static double N(double var0, double var2, double var4, double var6, class06069 var8) {
      if (var6 <= var4) {
         throw new IllegalArgumentException("Incorrect range for an attribute");
      } else {
         var0 = class04995.N(var0, var4, var6);
         var2 = class04995.N(var2, var4, var6);
         double d0 = 0.15 * (var6 - var4);
         double d1 = Math.abs(var0 - var2) + d0 * 2.0;
         double d2 = (var0 + var2) / 2.0;
         double d3 = (var8.U() + var8.U() + var8.U()) / 3.0 - 0.5;
         double d4 = d2 + d1 * d3;
         if (d4 > var6) {
            double d6 = d4 - var6;
            return var6 - d6;
         } else if (d4 < var4) {
            double d5 = var4 - d4;
            return var4 + d5;
         } else {
            return d4;
         }
      }
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var4 == null) {
         var4 = new class10714(0.2F);
      }

      this.N(var1.method_8409());
      return super.N(var1, var2, var3, (class07446)var4);
   }

   public boolean N(class06695 var1) {
      return this.M != var1;
   }

   public void N(@Nullable class07438 var1) {
      this.NO = class08372.N(var1);
   }

   private boolean N(class07862 var1, class08036 var2, class06584 var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2) || this.L(var2, var3);
   }

   public void N(class08036 var1, class06584 var2) {
      if (this.method_63623(var2, class07085.field_48824)) {
         this.u(var2.y(1, var1));
      }
   }

   protected static float N_85(IntUnaryOperator var0) {
      return 15.0F + var0.applyAsInt(8) + var0.applyAsInt(9);
   }

   protected static double N(DoubleSupplier var0) {
      return 0.4F + var0.getAsDouble() * 0.2 + var0.getAsDouble() * 0.2 + var0.getAsDouble() * 0.2;
   }

   @Nullable
   private class06889 N(class06889 var1, class07438 var2) {
      double d0 = this.method_23317() + var1.M;
      double d1 = this.method_5829().y;
      double d2 = this.method_23321() + var1.Z;
      class07218 class07218 = new class07218();
      UnmodifiableIterator<class01312> unmodifiableiterator = var2.method_24831().iterator();

      while (unmodifiableiterator.hasNext()) {
         class01312 class01312 = (class01312)unmodifiableiterator.next();
         class07218.N(d0, d1, d2);
         double d3 = this.method_5829().i + 0.75;

         do {
            double d4 = this.method_73183().L(class07218);
            if (class07218.method_10264() + d4 > d3) {
               break;
            }

            if (class05188.N(d4)) {
               class00734 class00734 = var2.method_24833(class01312);
               class06889 class06889 = new class06889(d0, class07218.method_10264() + d4, d2);
               if (class05188.N(this.method_73183(), var2, class00734.L(class06889))) {
                  var2.method_18380(class01312);
                  return class06889;
               }
            }

            class07218.N(class07211.field_11036);
         } while (!(class07218.method_10264() < d3));
      }

      return null;
   }

   protected void N(class06069 var1) {
   }

   protected void N(class07752 var1) {
      this.method_5783(class04909.Pe, var1.N() * 0.15F, var1.y());
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.NK);
   }

   @Override
   public void N(class08036 var1) {
      if (!this.method_73183().method_8608() && (!this.method_5782() || this.method_5626(var1)) && this.I()) {
         var1.method_7291(this, this.M);
      }
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      if (this.method_5782() || this.method_6109()) {
         return super.N(var1, var2);
      } else if (this.I() && var1.method_21823()) {
         this.N(var1);
         return class07082.N;
      } else {
         class06584 class06584 = var1.method_5998(var2);
         if (!class06584.R()) {
            class07082 class07082 = class06584.N(var1, this, var2);
            if (class07082.N()) {
               return class07082;
            }

            if (this.method_63623(class06584, class07085.field_48824) && !this.NU()) {
               this.N(var1, class06584);
               return class07082.N;
            }
         }

         this.y(var1);
         return class07082.N;
      }
   }

   @Nullable
   public class04891 NA() {
      return this.s();
   }

   private void W() {
      this.l();
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
   }

   public float R(float var1) {
      return class04995.B(var1, this.NQ, this.NY);
   }

   @Nullable
   protected class04891 G() {
      return null;
   }

   public void Y() {
      this.method_5783(class04909.Pc, 0.4F, 1.0F);
   }

   public boolean NO() {
      return this.B(8);
   }

   @Override
   public boolean aa_() {
      return true;
   }

   @Override
   public class06889[] ab_() {
      return class02607.N(this, 0.04, 0.52, 0.23, 0.87);
   }

   @Override
   public int m_() {
      return 400;
   }

   @Override
   protected void l_() {
      this.e.N(1, new class10847(this, 1.2));
      this.e.N(1, new class07959(this, 1.2));
      this.e.N(2, new class07434(this, 1.0, class07862.class));
      this.e.N(4, new class07459(this, 1.0));
      this.e.N(6, new class07957(this, 0.7));
      this.e.N(7, new class07962(this, class08036.class, 6.0F));
      this.e.N(8, new class07956(this));
      if (this.Nq()) {
         this.e.N(9, new class02961(this));
      }

      this.Q();
   }

   @Override
   public int n_() {
      return 6;
   }

   public int N_() {
      return 0;
   }

   public int Nx() {
      return this.m_();
   }

   public boolean NQ() {
      return this.B(32);
   }

   public static class05300 NK() {
      return class07633.Ne().N(class05298.T, 0.7).N(class05298.n, 53.0).N(class05298.l, 0.225F).N(class05298.O, 1.0).N(class05298.w, 6.0).N(class05298.W, 0.5);
   }

   @Override
   public void o_() {
      super.o_();
      if (this.o()) {
         this.Z(false);
      }
   }

   public void Nf() {
      if (this.Nq() && (this.method_6034() || !this.method_73183().method_8608())) {
         this.U(20);
      }
   }

   protected boolean NS() {
      return !this.method_5782() && !this.method_5765() && this.I() && !this.method_6109() && this.method_6032() >= this.method_6063() && this.NX();
   }

   public boolean Np() {
      return true;
   }

   public void NF() {
      this.y(32, false);
      this.Nl = 0;
   }

   public int Ng() {
      return this.B;
   }

   public final int NJ() {
      return class07610.N(this.N_());
   }

   @Nullable
   @Override
   public class08372<class07438> NI() {
      return this.NO;
   }

   public int NV() {
      return 100;
   }

   protected boolean Nq() {
      return true;
   }

   public void NC() {
      if (!this.NQ() && !this.method_73183().method_8608()) {
         this.Nf();
         this.method_56078(this.M_());
      }
   }

   @Override
   public void method_16078(class04782 var1) {
      super.method_16078(var1);
      if (this.M != null) {
         for (int ix = 0; ix < this.M.method_5439(); ix++) {
            class06584 class06584 = this.M.method_5438(ix);
            if (!class06584.R() && !class07323.N(class06584, class02523.g)) {
               this.method_5775(var1, class06584);
            }
         }
      }
   }

   @Override
   public float method_49485(class08036 var1) {
      return (float)this.method_45325(class05298.l);
   }

   @Override
   public float method_6107() {
      return 0.8F;
   }

   @Override
   public void method_6007() {
      if (this.field_5974.y(200) == 0) {
         this.v();
      }

      super.method_6007();
      if (this.method_73183() instanceof class04782 class04782 && this.method_5805()) {
         if (this.field_5974.y(900) == 0 && super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 == 0) {
            this.method_6025(1.0F);
         }

         if (this.Np()) {
            if (!this.o() && !this.method_5782() && this.field_5974.y(300) == 0 && class04782.method_8320(this.method_24515().method_10074()).N(class00869.Z)) {
               this.Z(true);
            }

            if (this.o() && ++this.Nt > 50) {
               this.Nt = 0;
               this.Z(false);
            }
         }

         this.L(class04782);
      }
   }

   @Override
   public void method_49481(class08036 var1, class06889 var2) {
      super.method_49481(var1, var2);
      class07109 class07109 = this.u((class07438)var1);
      this.method_5710(class07109.U, class07109.z);
      float fx = this.method_36454();
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = fx;
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = fx;
      this.field_5982 = fx;
      if (this.method_66247()) {
         if (var2.Z <= 0.0) {
            this.A = 0;
         }

         if (this.method_24828()) {
            if (this.Z > 0.0F && !this.method_70673()) {
               this.N(this.Z, var2);
            }

            this.Z = 0.0F;
         }
      }
   }

   @Override
   public boolean method_63626(class07085 var1) {
      return (var1 == class07085.field_48824 || var1 == class07085.field_55946) && this.I() || super.method_63626(var1);
   }

   @Override
   public boolean method_6101() {
      return false;
   }

   @Override
   public class03556<class04891> method_66667(class07085 var1, class06584 var2, class08725 var3) {
      return (class03556<class04891>)(var1 == class07085.field_55946 ? class04909.Pa : super.method_66667(var1, var2, var3));
   }

   @Override
   public class06889 method_49482(class08036 var1, class06889 var2) {
      if (this.method_24828() && this.Z == 0.0F && this.NQ() && !this.X) {
         return class06889.L;
      } else {
         float fx = var1.fields_7212a028292fd3c078969e3ee4c71d9e8_0 * 0.5F;
         float f1 = var1.fields_7212a028292fd3c078969e3ee4c71d9e8_2;
         if (f1 <= 0.0F) {
            f1 *= 0.25F;
         }

         return new class06889(fx, 0.0, f1);
      }
   }

   @Override
   public boolean method_56991(class07085 var1) {
      return var1 != class07085.field_55946 ? super.method_56991(var1) : this.method_5805() && !this.method_6109() && this.I();
   }

   @Override
   public boolean method_6062() {
      return super.method_6062() && this.method_5782() && this.Nz() || this.o() || this.NQ();
   }

   @Nullable
   protected class04891 M_() {
      return null;
   }
}
