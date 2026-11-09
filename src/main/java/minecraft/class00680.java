package minecraft;

import Nursultan.class09383;
import com.google.common.collect.ImmutableList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class00680 extends class07150 implements class07172 {
   private static final class02131<Integer> N = class03289.N(class00680.class, class02154.y);
   private static final class02131<Integer> y = class03289.N(class00680.class, class02154.y);
   private static final class02131<Integer> L = class03289.N(class00680.class, class02154.y);
   private static final List<class02131<Integer>> u = ImmutableList.of(N, y, L);
   private static final class02131<Integer> i = class03289.N(class00680.class, class02154.y);
   private static final int R = 220;
   private static final int M = 0;
   private final float[] B = new float[2];
   private final float[] Z = new float[2];
   private final float[] W = new float[2];
   private final float[] T = new float[2];
   private final int[] b = new int[2];
   private final int[] X = new int[2];
   private int a;
   private final class04774 p = (class04774)new class04774(this.method_5476(), class06685.field_5783, class06702.field_5795).N(true);
   private static final class01317 F = (var0, var1) -> !var0.method_5864().N(class01217.w) && var0.method_6102();
   private static final class01328 A = class01328.N().N(20.0).N(F);

   private double L(int var1) {
      if (var1 <= 0) {
         return this.method_23317();
      } else {
         float f = class04995.P((super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 + 180 * (var1 - 1)) * (float) (Math.PI / 180.0));
         return this.method_23317() + f * 1.3 * this.method_55693();
      }
   }

   public void M() {
      this.N(220);
      this.p.N(0.0F);
      this.method_6033(this.method_6063() / 3.0F);
   }

   @Override
   public void method_5837(class04770 var1) {
      super.method_5837(var1);
      this.p.N(var1);
   }

   @Override
   public void method_5742(class04770 var1) {
      super.method_5742(var1);
      this.p.y(var1);
   }

   @Override
   public void method_5982() {
      if (this.method_73183().y() == class07086.field_5801 && !this.method_5864().b()) {
         this.method_31472();
      } else {
         super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
      }
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, 0);
      var1.N(y, 0);
      var1.N(L, 0);
      var1.N(i, 0);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_5679(var1, var2)) {
         return false;
      } else if (var2.N(class03696.v) || var2.u() instanceof class00680) {
         return false;
      } else if (this.m() > 0 && !var2.N(class03696.u)) {
         return false;
      } else {
         if (this.v()) {
            class07049 class07049x = var2.L();
            if (class07049x instanceof class08007 || class07049x instanceof class04499) {
               return false;
            }
         }

         class07049 class07049 = var2.u();
         if (class07049 != null && class07049.method_5864().N(class01217.w)) {
            return false;
         } else {
            if (this.a <= 0) {
               this.a = 20;
            }

            for (int ix = 0; ix < this.X.length; ix++) {
               this.X[ix] = this.X[ix] + 3;
            }

            return super.method_64397(var1, var2, var3);
         }
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Invul", this.m());
   }

   @Override
   public void method_5665(@Nullable class00392 var1) {
      super.method_5665(var1);
      this.p.N(this.method_5476());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("Invul", 0));
      if (this.method_16914()) {
         this.p.N(this.method_5476());
      }
   }

   @Override
   protected boolean method_5860(class07049 var1) {
      return false;
   }

   @Override
   public boolean method_5822(boolean var1) {
      return false;
   }

   @Override
   public void method_5844(class00500 var1, class06889 var2) {
   }

   public class00680(class07078<? extends class00680> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class07460(this, 10, false);
      this.method_6033(this.method_6063());
      this.J = 50;
   }

   public static class05300 B() {
      return class07150.Y().N(class05298.n, 300.0).N(class05298.l, 0.6F).N(class05298.m, 0.6F).N(class05298.P, 40.0).N(class05298.y, 4.0);
   }

   private double i(int var1) {
      if (var1 <= 0) {
         return this.method_23321();
      } else {
         float f = class04995.m((super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 + 180 * (var1 - 1)) * (float) (Math.PI / 180.0));
         return this.method_23321() + f * 1.3 * this.method_55693();
      }
   }

   @Override
   protected class04891 s() {
      return class04909.IA;
   }

   public int m() {
      return this.field_6011.N(i);
   }

   public boolean v() {
      return this.method_6032() <= this.method_6063() / 2.0F;
   }

   private double u(int var1) {
      float f = var1 <= 0 ? 3.0F : 2.2F;
      return this.method_23318() + f * this.method_55693();
   }

   public int y(int var1) {
      return this.field_6011.N(u.get(var1));
   }

   public float[] E() {
      return this.Z;
   }

   public void N(int var1) {
      this.field_6011.N(i, var1);
   }

   public static boolean N(class00500 var0) {
      return !var0.P() && !var0.N(class01210.NA);
   }

   private float N(float var1, float var2, float var3) {
      float f = class04995.R(var2 - var1);
      if (f > var3) {
         f = var3;
      }

      if (f < -var3) {
         f = -var3;
      }

      return var1 + f;
   }

   @Override
   protected class07623 N(class07299 var1) {
      class07991 class07991 = new class07991(this, var1);
      class07991.y(false);
      class07991.N(true);
      return class07991;
   }

   public void N(int var1, int var2) {
      this.field_6011.N(u.get(var1), var2);
   }

   @Override
   protected void N(class04782 var1) {
      if (this.m() > 0) {
         int j = this.m() - 1;
         this.p.N(1.0F - j / 220.0F);
         if (j <= 0) {
            var1.method_8537(this, this.method_23317(), this.method_23320(), this.method_23321(), 7.0F, false, class07328.field_40890);
            if (!this.method_5701()) {
               var1.method_8474(1023, this.method_24515(), 0);
            }
         }

         this.N(j);
         if (this.field_6012 % 10 == 0) {
            this.method_6025(10.0F);
         }
      } else {
         super.N(var1);

         for (int ix = 1; ix < 3; ix++) {
            if (this.field_6012 >= this.b[ix - 1]) {
               this.b[ix - 1] = this.field_6012 + 10 + this.field_5974.y(10);
               if ((var1.y() == class07086.field_5802 || var1.y() == class07086.field_5807) && this.X[ix - 1]++ > 15) {
                  float f = 10.0F;
                  float var4 = 5.0F;
                  double var5 = class04995.N(this.field_5974, this.method_23317() - 10.0, this.method_23317() + 10.0);
                  double d1 = class04995.N(this.field_5974, this.method_23318() - 5.0, this.method_23318() + 5.0);
                  double d2 = class04995.N(this.field_5974, this.method_23321() - 10.0, this.method_23321() + 10.0);
                  this.N(ix + 1, var5, d1, d2, true);
                  this.X[ix - 1] = 0;
               }

               int k = this.y(ix);
               if (k > 0) {
                  class07438 class07438x = (class07438)var1.method_8469(k);
                  if (class07438x != null && this.method_18395(class07438x) && !(this.method_5858(class07438x) > 900.0) && this.method_6057(class07438x)) {
                     this.N(ix + 1, class07438x);
                     this.b[ix - 1] = this.field_6012 + 40 + this.field_5974.y(20);
                     this.X[ix - 1] = 0;
                  } else {
                     this.N(ix, 0);
                  }
               } else {
                  List<class07438> list = var1.N(class07438.class, A, this, this.method_5829().L(20.0, 8.0, 20.0));
                  if (!list.isEmpty()) {
                     class07438 class07438 = list.get(this.field_5974.y(list.size()));
                     this.N(ix, class07438.method_5628());
                  }
               }
            }
         }

         if (this.T() != null) {
            this.N(0, this.T().method_5628());
         } else {
            this.N(0, 0);
         }

         if (this.a > 0) {
            this.a--;
            if (this.a == 0 && var1.method_64395().N(class07305.I)) {
               boolean flag = false;
               int l = class04995.y(this.method_17681() / 2.0F + 1.0F);
               int i1 = class04995.y(this.method_17682());

               for (class07209 class07209 : class07209.method_10094(
                  this.method_31477() - l,
                  this.method_31478(),
                  this.method_31479() - l,
                  this.method_31477() + l,
                  this.method_31478() + i1,
                  this.method_31479() + l
               )) {
                  class00500 class00500 = var1.method_8320(class07209);
                  if (N(class00500)) {
                     flag = var1.N(class07209, true, this) || flag;
                  }
               }

               if (flag) {
                  var1.method_8444(null, 1022, this.method_24515(), 0);
               }
            }
         }

         if (this.field_6012 % 20 == 0) {
            this.method_6025(1.0F);
         }

         this.p.N(this.method_6032() / this.method_6063());
      }
   }

   private void N(int var1, double var2, double var4, double var6, boolean var8) {
      if (!this.method_5701()) {
         this.method_73183().method_8444(null, 1024, this.method_24515(), 0);
      }

      double d0 = this.L(var1);
      double d1 = this.u(var1);
      double d2 = this.i(var1);
      double d3 = var2 - d0;
      double d4 = var4 - d1;
      double d5 = var6 - d2;
      class06889 class06889 = new class06889(d3, d4, d5);
      class07513 class07513 = new class07513(this.method_73183(), this, class06889.u());
      class07513.L(this);
      if (var8) {
         class07513.y(true);
      }

      class07513.method_5814(d0, d1, d2);
      this.method_73183().method_8649(class07513);
   }

   @Override
   public void N(class07438 var1, float var2) {
      this.N(0, var1);
   }

   private void N(int var1, class07438 var2) {
      this.N(var1, var2.method_23317(), var2.method_23318() + var2.method_5751() * 0.5, var2.method_23321(), var1 == 0 && this.field_5974.z() < 0.001F);
   }

   public float[] W() {
      return this.B;
   }

   @Override
   protected void l_() {
      this.e.N(0, new class09383(this));
      this.e.N(2, new class07984(this, 1.0, 40, 20.0F));
      this.e.N(5, new class07977(this, 1.0));
      this.e.N(6, new class07962(this, class08036.class, 8.0F));
      this.e.N(7, new class07956(this));
      this.H.N(1, new class07989(this));
      this.H.N(2, new class07952<>(this, class07438.class, 0, false, false, F));
   }

   @Override
   public boolean method_6049(class07055 var1) {
      return var1.N(class07047.v) ? false : super.method_6049(var1);
   }

   @Override
   public class04891 method_6002() {
      return class04909.IC;
   }

   @Override
   public void method_6007() {
      class06889 class06889x = this.method_18798().u(1.0, 0.6, 1.0);
      if (!this.method_73183().method_8608() && this.y(0) > 0) {
         class07049 class07049x = this.method_73183().method_8469(this.y(0));
         if (class07049x != null) {
            double d0 = class06889x.B;
            if (this.method_23318() < class07049x.method_23318() || !this.v() && this.method_23318() < class07049x.method_23318() + 5.0) {
               d0 = Math.max(0.0, d0);
               d0 += 0.3 - d0 * 0.6F;
            }

            class06889x = new class06889(class06889x.M, d0, class06889x.Z);
            class06889 class06889x = new class06889(class07049x.method_23317() - this.method_23317(), 0.0, class07049x.method_23321() - this.method_23321());
            if (class06889x.z() > 9.0) {
               class06889 class06889xx = class06889x.u();
               class06889x = class06889x.y(class06889xx.M * 0.3 - class06889x.M * 0.6, 0.0, class06889xx.Z * 0.3 - class06889x.Z * 0.6);
            }
         }
      }

      this.method_18799(class06889x);
      if (class06889x.z() > 0.05) {
         this.method_36456((float)class04995.u(class06889x.Z, class06889x.M) * (180.0F / (float)Math.PI) - 90.0F);
      }

      super.method_6007();

      for (int ix = 0; ix < 2; ix++) {
         this.T[ix] = this.Z[ix];
         this.W[ix] = this.B[ix];
      }

      for (int j = 0; j < 2; j++) {
         int k = this.y(j + 1);
         class07049 class07049 = null;
         if (k > 0) {
            class07049 = this.method_73183().method_8469(k);
         }

         if (class07049 != null) {
            double d9 = this.L(j + 1);
            double d1 = this.u(j + 1);
            double d3 = this.i(j + 1);
            double d4 = class07049.method_23317() - d9;
            double d5 = class07049.method_23320() - d1;
            double d6 = class07049.method_23321() - d3;
            double d7 = Math.sqrt(d4 * d4 + d6 * d6);
            float f1 = (float)(class04995.u(d6, d4) * 180.0F / (float)Math.PI) - 90.0F;
            float f2 = (float)(-(class04995.u(d5, d7) * 180.0F / (float)Math.PI));
            this.B[j] = this.N(this.B[j], f2, 40.0F);
            this.Z[j] = this.N(this.Z[j], f1, 10.0F);
         } else {
            this.Z[j] = this.N(this.Z[j], super.fields_4212a028292fd3c078969e3ee4c71d9e8_0, 10.0F);
         }
      }

      boolean flag = this.v();

      for (int l = 0; l < 3; l++) {
         double d8 = this.L(l);
         double d10 = this.u(l);
         double d2 = this.i(l);
         float f = 0.3F * this.method_55693();
         this.method_73183()
            .method_8406(class07107.NZ, d8 + this.field_5974.E() * f, d10 + this.field_5974.E() * f, d2 + this.field_5974.E() * f, 0.0, 0.0, 0.0);
         if (flag && this.method_73183().field_9229.y(4) == 0) {
            this.method_73183()
               .method_8406(
                  class02329.N(class07107.t, 0.7F, 0.7F, 0.5F),
                  d8 + this.field_5974.E() * f,
                  d10 + this.field_5974.E() * f,
                  d2 + this.field_5974.E() * f,
                  0.0,
                  0.0,
                  0.0
               );
         }
      }

      if (this.m() > 0) {
         float f3 = 3.3F * this.method_55693();

         for (int i1 = 0; i1 < 3; i1++) {
            this.method_73183()
               .method_8406(
                  class02329.N(class07107.t, 0.7F, 0.7F, 0.9F),
                  this.method_23317() + this.field_5974.E(),
                  this.method_23318() + this.field_5974.z() * f3,
                  this.method_23321() + this.field_5974.E(),
                  0.0,
                  0.0,
                  0.0
               );
         }
      }
   }

   @Override
   public boolean method_37222(class07055 var1, @Nullable class07049 var2) {
      return false;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.IS;
   }

   @Override
   public void method_6099(class04782 var1, class07072 var2, boolean var3) {
      super.method_6099(var1, var2, var3);
      class00717 class00717 = this.method_5706(var1, class06570.Gg);
      if (class00717 != null) {
         class00717.B();
      }
   }
}
