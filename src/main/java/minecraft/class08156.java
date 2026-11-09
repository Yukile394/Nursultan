package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class08156 extends class07453 implements class03969, class07431 {
   public static final int N = 500;
   public static final int y = 3;
   public static final int L = 16;
   public static final int u = 32;
   public static final int i = 8;
   private static final int p = 60;
   private static final int F = 40;
   private static final double A = 0.9;
   private static final float f = 0.011F;
   private static final float C = 0.0325F;
   private static final float S = 0.02F;
   private static final class02131<Boolean> x = class03289.N(class08156.class, class02154.U);
   private static final int D = 40;
   private static final int h = 5;
   private static final float r = 1.2F;
   private static final float NN = 0.5F;
   private int Ny = 0;
   protected float R;
   protected class07075 M;
   private static final double NL = 0.8;
   private static final double NE = 1.1;
   private static final double NW = 0.25;
   private static final double Nm = 2.0;
   private static final float NP = 0.15F;
   private static final float Ns = 1.0F;

   protected void w() {
      class07075 class07075 = this.M;
      this.M = new class07075(this.d());
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

   protected boolean Q() {
      return this.method_18868().N(class05378.NW) || this.method_18868().N(class05378.s);
   }

   @Override
   public boolean method_5675() {
      return false;
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      int ix = var1 - 500;
      return ix >= 0 && ix < this.M.method_5439() ? this.M.method_32318(ix) : super.method_32318(var1);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (!this.field_5953 && x.equals(var1)) {
         this.Ny = this.Ny == 0 ? 40 : this.Ny;
      }

      super.method_5674(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(x, false);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (!this.method_73183().method_8608()) {
         this.y(this.method_73183());
      }

      if (this.v() && this.Ny < 35) {
         this.N(false);
      }

      if (this.Ny > 0) {
         this.Ny--;
         if (this.Ny == 0) {
            this.method_56078(this.l());
         }
      }

      if (this.method_5799()) {
         this.o();
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      boolean flag = super.method_64397(var1, var2, var3);
      if (flag && var2.u() instanceof class07438 class07438) {
         class08185.N(var1, this, class07438);
      }

      return flag;
   }

   @Nullable
   @Override
   public class07438 method_5642() {
      class07049 class07049 = this.method_31483();
      return (class07438)(this.Nz() && class07049 instanceof class08036 ? (class08036)class07049 : super.method_5642());
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      this.NW();
      return super.method_5688(var1, var2);
   }

   @Override
   protected boolean method_5818(class07049 var1) {
      return !this.method_5782();
   }

   public class08156(class07078<? extends class08156> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class05581(this, 85, 10, 0.011F, 0.0F, true);
      this.o = new class07450(this, 10);
      this.N(class04425.field_18, 0.0F);
      this.w();
   }

   public static class05300 B() {
      return class07633.Ne().N(class05298.n, 15.0).N(class05298.l, 1.0).N(class05298.u, 3.0).N(class05298.b, 0.3F);
   }

   private int I() {
      return !this.method_6109() && this.method_6118(class07085.field_55946).R() ? 32 : 16;
   }

   @Override
   public int n() {
      return this.Ny;
   }

   @Nullable
   protected class04891 l() {
      return null;
   }

   public final int d() {
      return class07610.N(this.k());
   }

   @Override
   public boolean m() {
      return this.Nz();
   }

   private void o() {
      double d0 = this.method_18798().M();
      double d1 = class04995.N(d0 * 2.0, 0.15F, 1.0);
      if (this.field_5974.z() < d1) {
         float fx = this.method_36454();
         float f1 = class04995.N(this.method_36455(), -10.0F, 10.0F);
         class06889 class06889 = this.method_5631(f1, fx);
         double d2 = this.field_5974.U() * 0.8 * (1.0 + d0);
         double d3 = (this.field_5974.z() - 0.5) * d2;
         double d4 = (this.field_5974.z() - 0.5) * d2;
         double d5 = (this.field_5974.z() - 0.5) * d2;
         this.method_73183()
            .method_8406(
               class07107.u,
               this.method_23317() - class06889.M * 1.1,
               this.method_23318() - class06889.B + 0.25,
               this.method_23321() - class06889.Z * 1.1,
               d3,
               d4,
               d5
            );
      }
   }

   public int k() {
      return 0;
   }

   @Override
   public void t() {
   }

   public boolean v() {
      return this.field_6011.N(x);
   }

   @Override
   public void y(int var1) {
      this.method_56078(this.G());
      this.method_32876(class01194.n);
      this.N(true);
   }

   protected void y(class08036 var1) {
      if (!this.method_73183().method_8608()) {
         var1.method_5804(this);
         if (!this.method_5782()) {
            this.Nb();
         }
      }
   }

   private void y(class07299 var1) {
      if (this.method_31483() instanceof class08036 class08036) {
         boolean flag = class08036.method_6059(class07047.c);
         boolean flag1 = var1.N() % 40L == 0L;
         if (!flag || flag1) {
            class08036.method_6092(new class07055(class07047.c, 60, 0, true, true, true));
         }
      }
   }

   @Override
   public boolean N(double var1) {
      return true;
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class07639(this, var1);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (this.method_6109()) {
         return super.N(var1, var2);
      } else if (this.NQ() && var1.method_21823()) {
         this.N(var1);
         return class07082.N;
      } else {
         if (!class06584.R()) {
            if (!this.method_73183().method_8608() && !this.NQ() && this.N(class06584)) {
               this.N(var1, var2, class06584);
               this.R(var1);
               return class07082.y;
            }

            if (this.N(class06584) && this.method_6032() < this.method_6063()) {
               class05349 class05349 = class06584.method_58694(class02484.d);
               this.method_6025(class05349 != null ? 2 * class05349.N() : 1.0F);
               this.N(var1, var2, class06584);
               this.O();
               return class07082.N;
            }

            class07082 class07082 = class06584.N(var1, this, var2);
            if (class07082.N()) {
               return class07082;
            }
         }

         if (this.NQ() && !var1.method_21823() && !this.N(class06584)) {
            this.y(var1);
            return class07082.N;
         } else {
            return super.N(var1, var2);
         }
      }
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return 0.0F;
   }

   @Override
   public boolean N(class06584 var1) {
      return !this.NQ() && !this.method_6109() ? var1.N(class01226.yU) : var1.N(class01226.yz);
   }

   protected class07109 N(class07438 var1) {
      return new class07109(var1.method_36455() * 0.5F, var1.method_36454());
   }

   public boolean N(class06695 var1) {
      return this.M != var1;
   }

   @Override
   protected void N(class08036 var1, class07050 var2, class06584 var3) {
      if (var3.N(class01226.yZ)) {
         var1.method_6122(var2, class05970.N(var3, var1, new class06584(class06570.jE)));
      } else {
         super.N(var1, var2, var3);
      }
   }

   @Override
   public void N(class08036 var1) {
      if (!this.method_73183().method_8608() && (!this.method_5782() || this.method_5626(var1)) && this.NQ()) {
         var1.method_76575(this, this.M);
      }
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      class08185.N(this, class06069);
      return super.N(var1, var2, var3, var4);
   }

   @Override
   public boolean N(class05487 var1) {
      return var1.method_8606(this);
   }

   @Override
   public void N(class04782 var1) {
      this.W();
      super.N(var1);
   }

   public void N(boolean var1) {
      this.field_6011.N(x, var1);
   }

   @Override
   public void N(int var1) {
      if (this.Nz() && this.Ny <= 0) {
         this.R = this.d_(var1);
      }
   }

   protected void N(float var1, class08036 var2) {
      this.method_45319(var2.method_5720().L((this.method_5799() ? 1.2F : 0.5F) * var1 * this.method_45325(class05298.l) * this.method_23326()));
      this.Ny = 40;
      this.N(true);
      this.field_64356 = true;
   }

   public static boolean N(class07078<? extends class08156> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      int ix = var1.method_8615();
      int j = ix - 25;
      return var3.method_10264() >= j
         && var3.method_10264() <= ix - 5
         && var1.method_8316(var3.method_10074()).N(class01231.N)
         && var1.method_8320(var3.method_10084()).N(class00869.K);
   }

   @Override
   protected void W() {
      if (!this.g_() && !this.method_5782() && this.NQ()) {
         int ix = this.I();
         if (!this.Nj() || !this.Ns().method_19771(this.method_24515(), ix + 8) || ix != this.NT()) {
            this.N(this.method_24515(), ix);
         }
      }
   }

   private void R(class08036 var1) {
      if (this.field_5974.y(3) == 0) {
         this.u(var1);
         this.V.W();
         this.method_73183().method_8421(this, (byte)7);
      } else {
         this.method_73183().method_8421(this, (byte)6);
      }

      this.O();
   }

   @Nullable
   protected class04891 G() {
      return null;
   }

   protected boolean Y() {
      return this.method_31483() instanceof class07079;
   }

   @Override
   public boolean method_6049(class07055 var1) {
      return var1.L() == class07047.j ? false : super.method_6049(var1);
   }

   @Override
   public float method_49485(class08036 var1) {
      return this.method_5799() ? 0.0325F * (float)this.method_45325(class05298.l) : 0.02F * (float)this.method_45325(class05298.l);
   }

   @Override
   public void method_49481(class08036 var1, class06889 var2) {
      super.method_49481(var1, var2);
      class07109 class07109 = this.N((class07438)var1);
      float fx = this.method_36454();
      float f1 = class04995.R(class07109.U - fx);
      float f2 = 0.5F;
      fx += f1 * 0.5F;
      this.method_5710(fx, class07109.z);
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = fx;
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = fx;
      this.field_5982 = fx;
      if (this.method_66247()) {
         if (this.R > 0.0F && !this.method_70673()) {
            this.N(this.R, var1);
         }

         this.R = 0.0F;
      }
   }

   @Override
   public boolean method_63626(class07085 var1) {
      return var1 == class07085.field_48824 || var1 == class07085.field_55946 || super.method_63626(var1);
   }

   @Override
   public class03556<class04891> method_66667(class07085 var1, class06584 var2, class08725 var3) {
      if (var1 == class07085.field_55946 && this.method_5869()) {
         return class04909.oG;
      } else {
         return (class03556<class04891>)(var1 == class07085.field_55946 ? class04909.ol : super.method_66667(var1, var2, var3));
      }
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

      return new class06889(fx, f2, f1);
   }

   @Override
   public boolean method_56991(class07085 var1) {
      return var1 != class07085.field_55946 && var1 != class07085.field_48824
         ? super.method_56991(var1)
         : this.method_5805() && !this.method_6109() && this.NQ();
   }

   @Override
   public void method_76087(class06889 var1, double var2, boolean var4, double var5) {
      float fx = this.method_6029();
      this.method_5724(fx, var1);
      this.method_5784(class07451.field_6308, this.method_18798());
      this.method_18799(this.method_18798().L(0.9));
   }
}
