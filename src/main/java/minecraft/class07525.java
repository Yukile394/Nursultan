package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class07525 extends class07150 implements class01279 {
   private static final class01894 N = class01894.y("attacking");
   private static final class07471 y = new class07471(N, 0.15F, class07463.field_6328);
   private static final int L = 400;
   private static final int u = 600;
   private static final class02131<Optional<class00500>> i = class03289.N(class07525.class, class02154.z);
   private static final class02131<Boolean> R = class03289.N(class07525.class, class02154.U);
   private static final class02131<Boolean> M = class03289.N(class07525.class, class02154.U);
   private int B = Integer.MIN_VALUE;
   private int Z;
   private static final class02135 W = class01517.N(20, 39);
   private long T;
   @Nullable
   private class08372<class07438> b;

   boolean L(class07049 var1) {
      class06889 class06889 = new class06889(
         this.method_23317() - var1.method_23317(), this.method_23323(0.5) - var1.method_23320(), this.method_23321() - var1.method_23321()
      );
      class06889 = class06889.u();
      double d0 = 16.0;
      double d1 = this.method_23317() + (this.field_5974.U() - 0.5) * 8.0 - class06889.M * 16.0;
      double d2 = this.method_23318() + (this.field_5974.y(16) - 8) - class06889.B * 16.0;
      double d3 = this.method_23321() + (this.field_5974.U() - 0.5) * 8.0 - class06889.Z * 16.0;
      return this.N(d1, d2, d3);
   }

   public static class05300 M() {
      return class07150.Y().N(class05298.n, 40.0).N(class05298.l, 0.3F).N(class05298.u, 7.0).N(class05298.P, 64.0).N(class05298.O, 1.0);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (R.equals(var1) && this.G() && this.method_73183().method_8608()) {
         this.m();
      }

      super.method_5674(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(i, Optional.empty());
      var1.N(R, false);
      var1.N(M, false);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_5679(var1, var2)) {
         return false;
      } else {
         class07486 class07486x = var2.L() instanceof class07486 class07486x ? class07486x : null;
         if (!var2.N(class03696.z) && class07486x == null) {
            boolean flag1 = super.method_64397(var1, var2, var3);
            if (!(var2.u() instanceof class07438) && this.field_5974.y(10) != 0) {
               this.v();
            }

            return flag1;
         } else {
            boolean flag = class07486x != null && this.N(var1, var2, class07486x, var3);

            for (int ix = 0; ix < 64; ix++) {
               if (this.v()) {
                  return true;
               }
            }

            return flag;
         }
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      class00500 class00500 = this.n();
      if (class00500 != null) {
         var1.N("carriedBlockState", class00500.N, class00500);
      }

      this.N(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class00500>N("carriedBlockState", class00500.N).filter(var0 -> !var0.P()).orElse(null));
      this.N(this.method_73183(), var1);
   }

   public class07525(class07078<? extends class07525> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_18, -1.0F);
   }

   @Override
   protected class04891 s() {
      return this.t() ? class04909.zC : class04909.zF;
   }

   @Nullable
   public class00500 n() {
      return this.field_6011.N(i).orElse(null);
   }

   @Override
   public void l() {
      this.field_6011.N(M, true);
   }

   public void m() {
      if (this.field_6012 >= this.B + 400) {
         this.B = this.field_6012;
         if (!this.method_5701()) {
            this.method_73183()
               .method_8486(this.method_23317(), this.method_23320(), this.method_23321(), class04909.zS, this.method_5634(), 2.5F, 1.0F, false);
         }
      }
   }

   public boolean t() {
      return this.field_6011.N(R);
   }

   protected boolean v() {
      if (!this.method_73183().method_8608() && this.method_5805()) {
         double d0 = this.method_23317() + (this.field_5974.U() - 0.5) * 64.0;
         double d1 = this.method_23318() + (this.field_5974.y(64) - 32);
         double d2 = this.method_23321() + (this.field_5974.U() - 0.5) * 64.0;
         return this.N(d0, d1, d2);
      } else {
         return false;
      }
   }

   @Override
   public void y(@Nullable class07438 var1) {
      super.y(var1);
      class07469 class07469 = this.method_5996(class05298.l);
      if (var1 == null) {
         this.Z = 0;
         this.field_6011.N(R, false);
         this.field_6011.N(M, false);
         class07469.L(N);
      } else {
         this.Z = this.field_6012;
         this.field_6011.N(R, true);
         if (!class07469.y(N)) {
            class07469.y(y);
         }
      }
   }

   @Override
   public long E() {
      return this.T;
   }

   @Override
   public void N(@Nullable class08372<class07438> var1) {
      this.b = var1;
   }

   public void N(@Nullable class00500 var1) {
      this.field_6011.N(i, Optional.ofNullable(var1));
   }

   private boolean N(class04782 var1, class07072 var2, class07486 var3, float var4) {
      return var3.L().a_(class02484.h, class06517.N).N(class06506.N) ? super.method_64397(var1, var2, var4) : false;
   }

   @Override
   protected void N(class04782 var1) {
      if (var1.method_8530() && this.field_6012 >= this.Z + 600) {
         float f = this.method_5718();
         if (f > 0.5F && var1.N_17(this.method_24515()) && this.field_5974.z() * 30.0F < (f - 0.4F) * 2.0F) {
            this.y(null);
            this.v();
         }
      }

      super.N(var1);
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return 0.0F;
   }

   boolean N(class08036 var1) {
      return !class07438.staticFields_7212a028292fd3c078969e3ee4c71d9e8_5.test(var1)
         ? false
         : this.method_64619(var1, 0.025, true, false, new double[]{this.method_23320()});
   }

   @Override
   public void N(long var1) {
      this.T = var1;
   }

   private boolean N(double var1, double var3, double var5) {
      class07218 class07218 = new class07218(var1, var3, var5);

      while (class07218.method_10264() > this.method_73183().method_31607() && !this.method_73183().method_8320(class07218).M()) {
         class07218.N(class07211.field_11033);
      }

      class00500 class00500 = this.method_73183().method_8320(class07218);
      boolean flag = class00500.M();
      boolean flag1 = class00500.Y().N(class01231.N);
      if (flag && !flag1) {
         class06889 class06889 = this.method_73189();
         boolean flag2 = this.method_6082(var1, var3, var5, true);
         if (flag2) {
            this.method_73183().method_32888(class01194.F, class06889, class01164.N(this));
            if (!this.method_5701()) {
               this.method_73183().method_43128(null, this.field_6014, this.field_6036, this.field_5969, class04909.zx, this.method_5634(), 1.0F, 1.0F);
               this.method_5783(class04909.zx, 1.0F, 1.0F);
            }
         }

         return flag2;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public class08372<class07438> W() {
      return this.b;
   }

   @Override
   public boolean Nu() {
      return super.Nu() || this.n() != null;
   }

   @Override
   public boolean G() {
      return this.field_6011.N(M);
   }

   @Override
   protected void l_() {
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07527(this));
      this.e.N(2, new class07999(this, 1.0, false));
      this.e.N(7, new class07957(this, 1.0, 0.0F));
      this.e.N(8, new class07962(this, class08036.class, 8.0F));
      this.e.N(8, new class07956(this));
      this.e.N(10, new class07526(this));
      this.e.N(11, new class07558(this));
      this.H.N(1, new class07556(this, this::N));
      this.H.N(2, new class07989(this));
      this.H.N(3, new class07952<>(this, class07560.class, true, false));
      this.H.N(4, new class01251<>(this, false));
   }

   @Override
   public class04891 method_6002() {
      return class04909.zA;
   }

   @Override
   public void method_6007() {
      if (this.method_73183().method_8608()) {
         for (int ix = 0; ix < 2; ix++) {
            this.method_73183()
               .method_8406(
                  class07107.NM,
                  this.method_23322(0.5),
                  this.method_23319() - 0.25,
                  this.method_23325(0.5),
                  (this.field_5974.U() - 0.5) * 2.0,
                  -this.field_5974.U(),
                  (this.field_5974.U() - 0.5) * 2.0
               );
         }
      }

      super.fields_6212a028292fd3c078969e3ee4c71d9e8_4 = false;
      if (!this.method_73183().method_8608()) {
         this.N((class04782)this.method_73183(), true);
      }

      super.method_6007();
   }

   @Override
   public boolean method_29503() {
      return true;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.zf;
   }

   @Override
   public void method_6099(class04782 var1, class07072 var2, boolean var3) {
      super.method_6099(var1, var2, var3);
      class00500 class00500 = this.n();
      if (class00500 != null) {
         class06584 class06584x = new class06584(class06570.Ta);
         class07323.N(class06584x, var1.method_30349(), class02251.M, var1.method_8404(this.method_24515()), this.method_59922());
         class04160 class04160 = new class04160((class04782)this.method_73183())
            .N(class06551.B, this.method_73189())
            .N(class06551.U, class06584x)
            .y(class06551.N, this);

         for (class06584 class06584x : class00500.N(class04160)) {
            this.method_5775(var1, class06584x);
         }
      }
   }

   @Override
   public void W_() {
      this.y(W.N(this.field_5974));
   }
}
