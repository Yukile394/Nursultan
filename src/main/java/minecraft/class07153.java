package minecraft;

import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class07153 extends class04882 {
   private static final Predicate<class07049> R = var0 -> !(var0 instanceof class07153) && var0.method_5805();
   private static final Predicate<class07049> M = var0 -> R.test(var0) && !var0.method_5864().equals(class07078.B);
   private static final Predicate<class07438> B = var0 -> !(var0 instanceof class07153) && var0.method_5805() && var0.method_66247();
   private static final double Z = 0.3;
   private static final double W = 0.35;
   private static final int T = 8356754;
   private static final float b = 0.57254905F;
   private static final float X = 0.5137255F;
   private static final float a = 0.49803922F;
   public static final int N = 10;
   public static final int y = 40;
   private static final int p = 0;
   private static final int F = 0;
   private static final int A = 0;
   private int f = 0;
   private int C = 0;
   private int S = 0;

   private void L(class07049 var1) {
      double d0 = var1.method_23317() - this.method_23317();
      double d1 = var1.method_23321() - this.method_23321();
      double d2 = Math.max(d0 * d0 + d1 * d1, 0.001);
      var1.method_5762(d0 / d2 * 4.0, 0.2, d1 / d2 * 4.0);
   }

   public static class05300 M() {
      return class07150.Y()
         .N(class05298.n, 100.0)
         .N(class05298.l, 0.3)
         .N(class05298.b, 0.75)
         .N(class05298.u, 12.0)
         .N(class05298.i, 1.5)
         .N(class05298.P, 32.0)
         .N(class05298.O, 1.0);
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.lf, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("AttackTick", this.f);
      var1.N("StunTick", this.C);
      var1.N("RoarTick", this.S);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.f = var1.N("AttackTick", 0);
      this.C = var1.N("StunTick", 0);
      this.S = var1.N("RoarTick", 0);
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 4) {
         this.f = 10;
         this.method_5783(class04909.la, 1.0F, 1.0F);
      } else if (var1 == 39) {
         this.C = 40;
      } else if (var1 == 69) {
         this.NJ();
         this.G();
      }

      super.method_5711(var1);
   }

   public class07153(class07078<? extends class07153> var1, class07299 var2) {
      super(var1, var2);
      this.J = 20;
      this.N(class04425.field_6, 0.0F);
   }

   public int B() {
      return this.f;
   }

   @Nullable
   @Override
   protected class04891 s() {
      return class04909.lX;
   }

   private void n() {
      if (this.field_5974.y(6) == 0) {
         double d0 = this.method_23317()
            - this.method_17681() * Math.sin(super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 * (float) (Math.PI / 180.0))
            + (this.field_5974.U() * 0.6 - 0.3);
         double d1 = this.method_23318() + this.method_17682() - 0.3;
         double d2 = this.method_23321()
            + this.method_17681() * Math.cos(super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 * (float) (Math.PI / 180.0))
            + (this.field_5974.U() * 0.6 - 0.3);
         this.method_73183().method_8406(class02329.N(class07107.t, 0.49803922F, 0.5137255F, 0.57254905F), d0, d1, d2, 0.0, 0.0, 0.0);
      }
   }

   public int m() {
      return this.S;
   }

   private void t() {
      if (this.method_5805() && this.method_73183() instanceof class04782 class04782) {
         Predicate predicate = class04782.method_64395().N(class07305.I) ? R : M;

         for (class07438 class07438 : this.method_73183().N(class07438.class, this.method_5829().M(4.0), predicate)) {
            if (!(class07438 instanceof class00675)) {
               class07438.method_64397(class04782, this.method_48923().y((class07438)this), 6.0F);
            }

            if (!(class07438 instanceof class08036)) {
               this.L(class07438);
            }
         }

         this.method_32876(class01194.n);
         class04782.method_8421(this, (byte)69);
      }
   }

   @Override
   public boolean v() {
      return false;
   }

   @Override
   protected void r() {
      boolean flag = !(this.method_5642() instanceof class07079) || this.method_5642().method_5864().N(class01217.L);
      boolean flag1 = !(this.method_5854() instanceof class00250);
      this.e.N(class07430.field_18405, flag);
      this.e.N(class07430.field_18407, flag && flag1);
      this.e.N(class07430.field_18406, flag);
      this.e.N(class07430.field_18408, flag);
   }

   @Override
   protected class00734 y(double var1) {
      return super.y(var1).R(0.05, 0.0, 0.05);
   }

   @Override
   public class04891 E() {
      return class04909.lp;
   }

   @Override
   public boolean N(class05487 var1) {
      return !var1.u(this.method_5829());
   }

   @Override
   public void N(class04782 var1, int var2, boolean var3) {
   }

   public int W() {
      return this.C;
   }

   private void G() {
      for (class07438 class07438 : this.method_73183().N(class07438.class, this.method_5829().M(4.0), B)) {
         this.L(class07438);
      }
   }

   @Override
   public int NR() {
      return 45;
   }

   @Override
   protected void l_() {
      super.l_();
      this.e.N(0, new class07427(this));
      this.e.N(4, new class07999(this, 1.0, true));
      this.e.N(5, new class07957(this, 0.4));
      this.e.N(6, new class07962(this, class08036.class, 6.0F));
      this.e.N(10, new class07962(this, class07079.class, 8.0F));
      this.H.N(2, new class07989(this, class04882.class).N());
      this.H.N(3, new class07952<>(this, class08036.class, true));
      this.H.N(4, new class07952<>(this, class06171.class, true, (var0, var1) -> !var0.method_6109()));
      this.H.N(4, new class07952<>(this, class07625.class, true));
   }

   private void NJ() {
      class06889 class06889 = this.method_5829().R();

      for (int i = 0; i < 40; i++) {
         double d0 = this.field_5974.E() * 0.2;
         double d1 = this.field_5974.E() * 0.2;
         double d2 = this.field_5974.E() * 0.2;
         this.method_73183().method_8406(class07107.NR, class06889.M, class06889.B, class06889.Z, d0, d1, d2);
      }
   }

   @Override
   public boolean method_6057(class07049 var1) {
      return this.C <= 0 && this.S <= 0 ? super.method_6057(var1) : false;
   }

   @Override
   public class04891 method_6002() {
      return class04909.lF;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.method_5805()) {
         if (this.method_6062()) {
            this.method_5996(class05298.l).N(0.0);
         } else {
            double d0 = this.T() != null ? 0.35 : 0.3;
            double d1 = this.method_5996(class05298.l).y();
            this.method_5996(class05298.l).N(class04995.u(0.1, d1, d0));
         }

         if (this.method_73183() instanceof class04782 class04782 && this.field_5976 && class04782.method_64395().N(class07305.I)) {
            boolean flag = false;
            class00734 class00734 = this.method_5829().M(0.2);

            for (class07209 class07209 : class07209.method_10094(
               class04995.N(class00734.N),
               class04995.N(class00734.y),
               class04995.N(class00734.L),
               class04995.N(class00734.u),
               class04995.N(class00734.i),
               class04995.N(class00734.R)
            )) {
               if (class04782.method_8320(class07209).i() instanceof class07131) {
                  flag = class04782.N(class07209, true, this) || flag;
               }
            }

            if (!flag && this.method_24828()) {
               this.method_6043();
            }
         }

         if (this.S > 0) {
            this.S--;
            if (this.S == 10) {
               this.t();
            }
         }

         if (this.f > 0) {
            this.f--;
         }

         if (this.C > 0) {
            this.C--;
            this.n();
            if (this.C == 0) {
               this.method_5783(class04909.lS, 1.0F, 1.0F);
               this.S = 20;
            }
         }
      }
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      this.f = 10;
      var1.method_8421(this, (byte)4);
      this.method_5783(class04909.la, 1.0F, 1.0F);
      return super.method_6121(var1, var2);
   }

   @Override
   public void method_6060(class07438 var1) {
      if (this.S == 0) {
         if (this.field_5974.U() < 0.5) {
            this.C = 40;
            this.method_5783(class04909.lC, 1.0F, 1.0F);
            this.method_73183().method_8421(this, (byte)39);
            var1.method_5697(this);
         } else {
            this.L(var1);
         }

         var1.field_6037 = true;
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.lA;
   }

   @Override
   public boolean method_6062() {
      return super.method_6062() || this.f > 0 || this.C > 0 || this.S > 0;
   }
}
