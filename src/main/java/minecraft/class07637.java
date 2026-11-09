package minecraft;

import Nursultan.class10714;
import Nursultan.class10775;
import Nursultan.class10776;
import Nursultan.class10778;
import Nursultan.class10780;
import Nursultan.class10781;
import org.jspecify.annotations.Nullable;

public class class07637 extends class07633 {
   private static final class02131<Integer> M = class03289.N(class07637.class, class02154.y);
   private static final class02131<Integer> B = class03289.N(class07637.class, class02154.y);
   private static final class02131<Integer> Z = class03289.N(class07637.class, class02154.y);
   private static final class02131<Byte> X = class03289.N(class07637.class, class02154.N);
   private static final class02131<Byte> p = class03289.N(class07637.class, class02154.N);
   private static final class02131<Byte> F = class03289.N(class07637.class, class02154.N);
   static final class01328 N = class01328.y().N(8.0);
   private static final class01325 A = class07078.NC.E().N(0.5F).N(class03810.N().N(class03831.field_47743, 0.0F, 0.40625F, 0.0F));
   private static final int f = 2;
   private static final int C = 4;
   private static final int S = 8;
   private static final int x = 16;
   private static final int D = 5;
   public static final int y = 32;
   private static final int h = 32;
   boolean L;
   boolean u;
   public int i;
   private class06889 r;
   private float NN;
   private float Ny;
   private float NL;
   private float NE;
   private float NW;
   private float Nm;
   class07646 R;

   public static class05300 w() {
      return class07633.Ne().N(class05298.l, 0.15F).N(class05298.u, 6.0);
   }

   @Override
   public boolean Nl() {
      return this.Y() == class07645.field_6789;
   }

   public boolean No() {
      return !this.v() && !this.Ng() && !this.n() && !this.d() && !this.m();
   }

   public void M(boolean var1) {
      this.y(16, var1);
   }

   public boolean Q() {
      return this.Y() == class07645.field_6794;
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(M, 0);
      var1.N(B, 0);
      var1.N(X, (byte)0);
      var1.N(p, (byte)0);
      var1.N(F, (byte)0);
      var1.N(Z, 0);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.I()) {
         if (this.method_73183().method_8546() && !this.method_5799()) {
            this.N(true);
            this.B(false);
         } else if (!this.n()) {
            this.N(false);
         }
      }

      class07438 class07438 = this.T();
      if (class07438 == null) {
         this.L = false;
         this.u = false;
      }

      if (this.B() > 0) {
         if (class07438 != null) {
            this.N(class07438, 90.0F, 90.0F);
         }

         if (this.B() == 29 || this.B() == 14) {
            this.method_5783(class04909.tu, 1.0F, 1.0F);
         }

         this.N(this.B() - 1);
      }

      if (this.W()) {
         this.y(this.t() + 1);
         if (this.t() > 20) {
            this.Z(false);
            this.NC();
         } else if (this.t() == 1) {
            this.method_5783(class04909.nD, 1.0F, 1.0F);
         }
      }

      if (this.d()) {
         this.Nf();
      } else {
         this.i = 0;
      }

      if (this.m()) {
         this.method_36457(0.0F);
      }

      this.Np();
      this.NK();
      this.NF();
      this.NA();
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      this.N(false);
      return super.method_64397(var1, var2, var3);
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.tL, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("MainGene", class07645.field_41673, this.G());
      var1.N("HiddenGene", class07645.field_41673, this.l());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class07645>N("MainGene", class07645.field_41673).orElse(class07645.field_6788));
      this.y(var1.<class07645>N("HiddenGene", class07645.field_41673).orElse(class07645.field_6788));
   }

   public class07637(class07078<? extends class07637> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class10778(this);
      if (!this.method_6109()) {
         this.L(true);
      }
   }

   public int B() {
      return this.field_6011.N(M);
   }

   private void B(int var1) {
      this.field_6011.N(Z, var1);
   }

   public void B(boolean var1) {
      this.field_6011.N(Z, var1 ? 1 : 0);
   }

   public boolean I() {
      return this.Y() == class07645.field_6795;
   }

   public void Z(boolean var1) {
      this.y(2, var1);
      if (!var1) {
         this.y(0);
      }
   }

   private boolean Z(int var1) {
      return (this.field_6011.N(F) & var1) != 0;
   }

   public float i(float var1) {
      return class04995.B(var1, this.NE, this.NL);
   }

   @Nullable
   @Override
   protected class04891 s() {
      if (this.Nl()) {
         return class04909.ti;
      } else {
         return this.I() ? class04909.tR : class04909.nr;
      }
   }

   public boolean n() {
      return this.field_6011.N(Z) > 0;
   }

   public class07645 l() {
      return class07645.N(this.field_6011.N(p));
   }

   public boolean d() {
      return this.Z(4);
   }

   public boolean m() {
      return this.Z(8);
   }

   public boolean o() {
      return this.Y() == class07645.field_6791;
   }

   public int t() {
      return this.field_6011.N(B);
   }

   @Override
   public boolean g() {
      return false;
   }

   public boolean v() {
      return this.Z(16);
   }

   public void z(boolean var1) {
      this.y(4, var1);
   }

   public float u(float var1) {
      return class04995.B(var1, this.Ny, this.NN);
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      class07637 class07637x = class07078.NC.N(var1, class06113.field_16466);
      if (class07637x != null) {
         if (var2 instanceof class07637 class07637x) {
            class07637x.N(this, class07637x);
         }

         class07637x.NI();
      }

      return class07637x;
   }

   public void y(class07645 var1) {
      if (var1.N() > 6) {
         var1 = class07645.N(this.field_5974);
      }

      this.field_6011.N(p, (byte)var1.N());
   }

   public void y(int var1) {
      this.field_6011.N(B, var1);
   }

   private void y(int var1, boolean var2) {
      byte b0 = this.field_6011.N(F);
      if (var2) {
         this.field_6011.N(F, (byte)(b0 | var1));
      } else {
         this.field_6011.N(F, (byte)(b0 & ~var1));
      }
   }

   @Override
   protected void N(class04782 var1, class00717 var2) {
      if (this.method_6118(class07085.field_6173).R() && N(var2)) {
         this.method_29499(var2);
         class06584 class06584 = var2.N();
         this.method_5673(class07085.field_6173, class06584);
         this.N(class07085.field_6173);
         this.method_6103(var2, class06584.c());
         var2.method_31472();
      }
   }

   public static boolean N(class00717 var0) {
      return var0.N().N(class01226.Nr) && var0.method_5805() && !var0.R();
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      this.N(class07645.N(class06069));
      this.y(class07645.N(class06069));
      this.NI();
      if (var4 == null) {
         var4 = new class10714(0.2F);
      }

      return super.N(var1, var2, var3, (class07446)var4);
   }

   public void N(int var1) {
      this.field_6011.N(M, var1);
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.Nh);
   }

   public void N(class07637 var1, @Nullable class07637 var2) {
      if (var2 == null) {
         if (this.field_5974.Z()) {
            this.N(var1.NS());
            this.y(class07645.N(this.field_5974));
         } else {
            this.N(class07645.N(this.field_5974));
            this.y(var1.NS());
         }
      } else if (this.field_5974.Z()) {
         this.N(var1.NS());
         this.y(var2.NS());
      } else {
         this.N(var2.NS());
         this.y(var1.NS());
      }

      if (this.field_5974.y(32) == 0) {
         this.N(class07645.N(this.field_5974));
      }

      if (this.field_5974.y(32) == 0) {
         this.y(class07645.N(this.field_5974));
      }
   }

   public void N(boolean var1) {
      this.y(8, var1);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584x = var1.method_5998(var2);
      if (this.Ng()) {
         return class07082.i;
      } else if (this.v()) {
         this.M(false);
         return class07082.N;
      } else if (this.N(class06584x)) {
         if (this.T() != null) {
            this.L = true;
         }

         if (this.method_6109()) {
            this.N(var1, var2, class06584x);
            this.N((int)(-this.K() / 20 * 0.1F), true);
         } else if (!this.method_73183().method_8608() && this.K() == 0 && this.T_()) {
            this.N(var1, var2, class06584x);
            this.i(var1);
         } else {
            if (!(this.method_73183() instanceof class04782 class04782) || this.m() || this.method_5799()) {
               return class07082.i;
            }

            this.NJ();
            this.B(true);
            class06584 class06584x = this.method_6118(class07085.field_6173);
            if (!class06584x.R() && !var1.method_56992()) {
               this.method_5775(class04782, class06584x);
            }

            this.method_5673(class07085.field_6173, new class06584(class06584x.B(), 1));
            this.N(var1, var2, class06584x);
         }

         return class07082.y;
      } else {
         return class07082.i;
      }
   }

   public void N(class07645 var1) {
      if (var1.N() > 6) {
         var1 = class07645.N(this.field_5974);
      }

      this.field_6011.N(X, (byte)var1.N());
   }

   private void NA() {
      this.Nm = this.NW;
      if (this.d()) {
         this.NW = Math.min(1.0F, this.NW + 0.15F);
      } else {
         this.NW = Math.max(0.0F, this.NW - 0.19F);
      }
   }

   public boolean W() {
      return this.Z(2);
   }

   public float R(float var1) {
      return class04995.B(var1, this.Nm, this.NW);
   }

   public class07645 G() {
      return class07645.N(this.field_6011.N(X));
   }

   public class07645 Y() {
      return class07645.N(this.G(), this.l());
   }

   public boolean NO() {
      return this.Y() == class07645.field_6793;
   }

   @Override
   protected void l_() {
      this.e.N(0, new class07427(this));
      this.e.N(2, new class10781(this, 2.0));
      this.e.N(2, new class07620(this, 1.0));
      this.e.N(3, new class10780(this, 1.2F, true));
      this.e.N(4, new class07960(this, 1.0, var0 -> var0.N(class01226.Nh), false));
      this.e.N(6, new class10775<>(this, class08036.class, 8.0F, 2.0, 2.0));
      this.e.N(6, new class10775<>(this, class07150.class, 4.0F, 2.0, 2.0));
      this.e.N(7, new class07634(this));
      this.e.N(8, new class10776(this));
      this.e.N(8, new class07630(this));
      this.R = new class07646(this, class08036.class, 6.0F);
      this.e.N(9, this.R);
      this.e.N(10, new class07956(this));
      this.e.N(12, new class07619(this));
      this.e.N(13, new class07459(this, 1.25));
      this.e.N(14, new class07957(this, 1.0));
      this.H.N(1, new class07647(this).N(new Class[0]));
   }

   public boolean NQ() {
      return this.Y() == class07645.field_6792;
   }

   private void NK() {
      if (!this.n() && this.m() && !this.Ng() && !this.method_6118(class07085.field_6173).R() && this.field_5974.y(80) == 1) {
         this.B(true);
      } else if (this.method_6118(class07085.field_6173).R() || !this.m()) {
         this.B(false);
      }

      if (this.n()) {
         this.NV();
         if (!this.method_73183().method_8608() && this.Nq() > 80 && this.field_5974.y(20) == 1) {
            if (this.Nq() > 100 && this.method_6118(class07085.field_6173).N(class01226.Nr)) {
               if (!this.method_73183().method_8608()) {
                  this.method_5673(class07085.field_6173, class06584.E);
                  this.method_32876(class01194.W);
               }

               this.N(false);
            }

            this.B(false);
            return;
         }

         this.B(this.Nq() + 1);
      }
   }

   private void Nf() {
      this.i++;
      if (this.i > 32) {
         this.z(false);
      } else {
         if (!this.method_73183().method_8608()) {
            class06889 class06889 = this.method_18798();
            if (this.i == 1) {
               float fx = this.method_36454() * (float) (Math.PI / 180.0);
               float f1 = this.method_6109() ? 0.1F : 0.2F;
               this.r = new class06889(class06889.M + -class04995.m(fx) * f1, 0.0, class06889.Z + class04995.P(fx) * f1);
               this.method_18799(this.r.y(0.0, 0.27, 0.0));
            } else if (this.i != 7.0F && this.i != 15.0F && this.i != 23.0F) {
               this.method_18800(this.r.M, class06889.B, this.r.Z);
            } else {
               this.method_18800(0.0, this.method_24828() ? 0.27 : class06889.B, 0.0);
            }
         }
      }
   }

   private class07645 NS() {
      return this.field_5974.Z() ? this.G() : this.l();
   }

   private void Np() {
      this.Ny = this.NN;
      if (this.m()) {
         this.NN = Math.min(1.0F, this.NN + 0.15F);
      } else {
         this.NN = Math.max(0.0F, this.NN - 0.19F);
      }
   }

   private void NF() {
      this.NE = this.NL;
      if (this.v()) {
         this.NL = Math.min(1.0F, this.NL + 0.15F);
      } else {
         this.NL = Math.max(0.0F, this.NL - 0.19F);
      }
   }

   public boolean Ng() {
      return this.I() && this.method_73183().method_8546();
   }

   void NJ() {
      if (!this.method_5799()) {
         this.N(0.0F);
         this.f().W();
         this.N(true);
      }
   }

   public void NI() {
      if (this.NO()) {
         this.method_5996(class05298.n).N(10.0);
      }

      if (this.Q()) {
         this.method_5996(class05298.l).N(0.07F);
      }
   }

   private void NV() {
      if (this.Nq() % 5 == 0) {
         this.method_5783(class04909.ty, 0.5F + 0.5F * this.field_5974.y(2), (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F);

         for (int ix = 0; ix < 6; ix++) {
            class06889 class06889x = new class06889((this.field_5974.z() - 0.5) * 0.1, this.field_5974.z() * 0.1 + 0.1, (this.field_5974.z() - 0.5) * 0.1);
            class06889x = class06889x.N(-this.method_36455() * (float) (Math.PI / 180.0));
            class06889x = class06889x.y(-this.method_36454() * (float) (Math.PI / 180.0));
            double d0 = -this.field_5974.z() * 0.6 - 0.3;
            class06889 class06889x = new class06889((this.field_5974.z() - 0.5) * 0.8, d0, 1.0 + (this.field_5974.z() - 0.5) * 0.4);
            class06889x = class06889x.y(-super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 * (float) (Math.PI / 180.0));
            class06889x = class06889x.y(this.method_23317(), this.method_23320() + 1.0, this.method_23321());
            this.method_73183()
               .method_8406(
                  new class07092(class07107.S, this.method_6118(class07085.field_6173)),
                  class06889x.M,
                  class06889x.B,
                  class06889x.Z,
                  class06889x.M,
                  class06889x.B + 0.05,
                  class06889x.Z
               );
         }
      }
   }

   private int Nq() {
      return this.field_6011.N(Z);
   }

   private void NC() {
      class06889 class06889 = this.method_18798();
      class07299 class07299 = this.method_73183();
      class07299.method_8406(
         class07107.NU,
         this.method_23317() - (this.method_17681() + 1.0F) * 0.5 * class04995.m(super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 * (float) (Math.PI / 180.0)),
         this.method_23320() - 0.1F,
         this.method_23321() + (this.method_17681() + 1.0F) * 0.5 * class04995.P(super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 * (float) (Math.PI / 180.0)),
         class06889.M,
         0.0,
         class06889.Z
      );
      this.method_5783(class04909.nh, 1.0F, 1.0F);

      for (class07637 class07637 : class07299.N(class07637.class, this.method_5829().M(10.0))) {
         if (!class07637.method_6109() && class07637.method_24828() && !class07637.method_5799() && class07637.No()) {
            class07637.method_6043();
         }
      }

      if (this.method_73183() instanceof class04782 class04782 && class04782.method_64395().N(class07305.O)) {
         this.method_64169(class04782, class06273.No, this::method_5775);
      }
   }

   @Nullable
   @Override
   public class04891 method_6002() {
      return class04909.tN;
   }

   @Override
   public void method_59928() {
      this.method_5783(class04909.tB, 1.0F, 1.0F);
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? A : super.method_55694(var1);
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      if (!this.Nl()) {
         this.u = true;
      }

      return super.method_6121(var1, var2);
   }

   @Override
   public boolean method_63626(class07085 var1) {
      return var1 == class07085.field_6173 && this.method_5936();
   }

   @Nullable
   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.tM;
   }
}
