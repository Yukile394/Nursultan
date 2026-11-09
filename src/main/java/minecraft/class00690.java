package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00690 extends class07079 implements class07542 {
   private static final Logger T = LogUtils.getLogger();
   public static final class02131<Integer> N = class03289.N(class00690.class, class02154.y);
   private static final class01328 b = class01328.N().N(64.0);
   private static final int c = 200;
   private static final int X = 400;
   private static final float a = 0.25F;
   private static final String p = "DragonDeathTime";
   private static final String F = "DragonPhase";
   private static final int A = 0;
   public final class02765 y = new class02765();
   private final class00695[] f;
   public final class00695 L;
   private final class00695 C;
   public final class00695 u;
   private final class00695 S;
   private final class00695 x;
   private final class00695 D;
   private final class00695 h;
   private final class00695 r;
   public float i;
   public float R;
   public boolean M;
   public int B = 0;
   public float Z;
   @Nullable
   public class00676 W;
   @Nullable
   private class07856 NN;
   private class07209 Ny = class07209.field_10980;
   private final class00684 NL;
   private int NE = 100;
   private float NW;
   private final class01763[] Nm = new class01763[24];
   private final int[] NP = new int[24];
   private final class05334 Ns = new class05334();

   private float L(double var1) {
      return (float)class04995.i(var1);
   }

   public class07209 M() {
      return this.Ny;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (N.equals(var1) && this.method_73183().method_8608()) {
         this.NL.N(class00702.N(this.method_5841().N(N)));
      }

      super.method_5674(var1);
   }

   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      class00695[] aclass00695 = this.E();

      for (int ix = 0; ix < aclass00695.length; ix++) {
         aclass00695[ix].method_5838(ix + var1.N() + 1);
      }
   }

   @Override
   public void method_5982() {
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, class00702.U.y());
   }

   @Override
   public void method_5768(class04782 var1) {
      this.method_5650(class07062.field_26998);
      this.method_32876(class01194.s);
      if (this.NN != null) {
         this.NN.y(this);
         this.NN.N(this);
      }
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15251;
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return this.N(var1, this.u, var2, var3);
   }

   @Override
   public void method_5801() {
      if (this.method_73183().method_8608() && !this.method_5701()) {
         this.method_73183()
            .method_8486(
               this.method_23317(), this.method_23318(), this.method_23321(), class04909.ze, this.method_5634(), 5.0F, 0.8F + this.field_5974.z() * 0.3F, false
            );
      }
   }

   @Override
   public boolean method_5776() {
      float fx = class04995.P(this.R * (float) (Math.PI * 2));
      return class04995.P(this.i * (float) (Math.PI * 2)) <= -0.3F && fx >= -0.3F;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("DragonPhase", this.NL.N().B().y());
      var1.N("DragonDeathTime", this.B);
   }

   @Override
   public boolean method_5863() {
      return false;
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      var1.i("DragonPhase").ifPresent(var1x -> this.NL.N(class00702.N(var1x)));
      this.B = var1.N("DragonDeathTime", 0);
   }

   @Override
   protected boolean method_5860(class07049 var1) {
      return false;
   }

   @Override
   public boolean method_5822(boolean var1) {
      return false;
   }

   public class00690(class07078<? extends class00690> var1, class07299 var2) {
      super(class07078.f, var2);
      this.L = new class00695(this, "head", 1.0F, 1.0F);
      this.C = new class00695(this, "neck", 3.0F, 3.0F);
      this.u = new class00695(this, "body", 5.0F, 3.0F);
      this.S = new class00695(this, "tail", 2.0F, 2.0F);
      this.x = new class00695(this, "tail", 2.0F, 2.0F);
      this.D = new class00695(this, "tail", 2.0F, 2.0F);
      this.h = new class00695(this, "wing", 4.0F, 2.0F);
      this.r = new class00695(this, "wing", 4.0F, 2.0F);
      this.f = new class00695[]{this.L, this.C, this.u, this.S, this.x, this.D, this.h, this.r};
      this.method_6033(this.method_6063());
      this.field_5960 = true;
      this.NL = new class00684(this);
   }

   public static class05300 B() {
      return class07079.H().N(class05298.n, 200.0).N(class05298.z, 16.0);
   }

   public int Z() {
      if (this.Nm[0] == null) {
         for (int ix = 0; ix < 24; ix++) {
            byte b0 = 5;
            int k;
            int l;
            if (ix < 12) {
               k = class04995.y(60.0F * class04995.P(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * ix)));
               l = class04995.y(60.0F * class04995.m(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * ix)));
            } else if (ix < 20) {
               int j = ix - 12;
               k = class04995.y(40.0F * class04995.P(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * j)));
               l = class04995.y(40.0F * class04995.m(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * j)));
               b0 += 10;
            } else {
               int j1 = ix - 20;
               k = class04995.y(20.0F * class04995.P(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * j1)));
               l = class04995.y(20.0F * class04995.m(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * j1)));
            }

            int i1 = Math.max(73, this.method_73183().N(class07830.field_13203, new class07209(k, 0, l)).method_10264() + b0);
            this.Nm[ix] = new class01763(k, i1, l);
         }

         this.NP[0] = 6146;
         this.NP[1] = 8197;
         this.NP[2] = 8202;
         this.NP[3] = 16404;
         this.NP[4] = 32808;
         this.NP[5] = 32848;
         this.NP[6] = 65696;
         this.NP[7] = 131392;
         this.NP[8] = 131712;
         this.NP[9] = 263424;
         this.NP[10] = 526848;
         this.NP[11] = 525313;
         this.NP[12] = 1581057;
         this.NP[13] = 3166214;
         this.NP[14] = 2138120;
         this.NP[15] = 6373424;
         this.NP[16] = 4358208;
         this.NP[17] = 12910976;
         this.NP[18] = 9044480;
         this.NP[19] = 9706496;
         this.NP[20] = 15216640;
         this.NP[21] = 13688832;
         this.NP[22] = 11763712;
         this.NP[23] = 8257536;
      }

      return this.N(this.method_23317(), this.method_23318(), this.method_23321());
   }

   @Override
   protected class04891 s() {
      return class04909.zq;
   }

   private void n() {
      if (this.W != null) {
         if (this.W.method_31481()) {
            this.W = null;
         } else if (this.field_6012 % 10 == 0 && this.method_6032() < this.method_6063()) {
            this.method_6033(this.method_6032() + 1.0F);
         }
      }

      if (this.field_5974.y(10) == 0) {
         List<class00676> list = this.method_73183().N(class00676.class, this.method_5829().M(32.0));
         class00676 class00676x = null;
         double d0 = Double.MAX_VALUE;

         for (class00676 class00676x : list) {
            double d1 = class00676x.method_5858(this);
            if (d1 < d0) {
               d0 = d1;
               class00676x = class00676x;
            }
         }

         this.W = class00676x;
      }
   }

   @Nullable
   public class07856 m() {
      return this.NN;
   }

   private float v() {
      if (this.NL.N().N()) {
         return -1.0F;
      } else {
         class02753 class02753x = this.y.N(5);
         class02753 class02753x = this.y.N(0);
         return (float)(class02753x.N() - class02753x.N());
      }
   }

   public class06889 u(float var1) {
      class00699 class00699 = this.NL.N();
      class00702<? extends class00699> class00702 = class00699.B();
      class06889 class06889;
      if (class00702 == class00702.u || class00702 == class00702.i) {
         class07209 class07209 = this.method_73183().N(class07830.field_13203, class06403.N(this.Ny));
         float f5 = Math.max((float)Math.sqrt(class07209.method_19770(this.method_73189())) / 4.0F, 1.0F);
         float f2 = 6.0F / f5;
         float f3 = this.method_36455();
         float f4 = 1.5F;
         this.method_36457(-f2 * 1.5F * 5.0F);
         class06889 = this.method_5828(var1);
         this.method_36457(f3);
      } else if (class00699.N()) {
         float fx = this.method_36455();
         float f1 = 1.5F;
         this.method_36457(-45.0F);
         class06889 = this.method_5828(var1);
         this.method_36457(fx);
      } else {
         class06889 = this.method_5828(var1);
      }

      return class06889;
   }

   private void y(class04782 var1, List<class07049> var2) {
      for (class07049 class07049 : var2) {
         if (class07049 instanceof class07438) {
            class07072 class07072 = this.method_48923().y((class07438)this);
            class07049.method_64397(var1, class07072, 10.0F);
            class07323.N(var1, class07049, class07072);
         }
      }
   }

   public class00695[] E() {
      return this.f;
   }

   public void N(class07856 var1) {
      this.NN = var1;
   }

   @Nullable
   public class00143 N(int var1, int var2, @Nullable class01763 var3) {
      for (int ix = 0; ix < 24; ix++) {
         class01763 class01763xxxxx = this.Nm[ix];
         class01763xxxxx.Z = false;
         class01763xxxxx.M = 0.0F;
         class01763xxxxx.i = 0.0F;
         class01763xxxxx.R = 0.0F;
         class01763xxxxx.B = null;
         class01763xxxxx.u = -1;
      }

      class01763 class01763x = this.Nm[var1];
      class01763 class01763x = this.Nm[var2];
      class01763x.i = 0.0F;
      class01763x.R = class01763x.N(class01763x);
      class01763x.M = class01763x.R;
      this.Ns.N();
      this.Ns.N(class01763x);
      class01763 class01763xx = class01763x;
      byte b0 = 0;
      if (this.NN == null || this.NN.i() == 0) {
         b0 = 12;
      }

      while (!this.Ns.i()) {
         class01763 class01763xxx = this.Ns.L();
         if (class01763xxx.equals(class01763x)) {
            if (var3 != null) {
               var3.B = class01763x;
               class01763x = var3;
            }

            return this.N(class01763x, class01763x);
         }

         if (class01763xxx.N(class01763x) < class01763xx.N(class01763x)) {
            class01763xx = class01763xxx;
         }

         class01763xxx.Z = true;
         int j = 0;

         for (int k = 0; k < 24; k++) {
            if (this.Nm[k] == class01763xxx) {
               j = k;
               break;
            }
         }

         for (int l = b0; l < 24; l++) {
            if ((this.NP[j] & 1 << l) > 0) {
               class01763 class01763xxxx = this.Nm[l];
               if (!class01763xxxx.Z) {
                  float fx = class01763xxx.i + class01763xxx.N(class01763xxxx);
                  if (!class01763xxxx.R() || fx < class01763xxxx.i) {
                     class01763xxxx.B = class01763xxx;
                     class01763xxxx.i = fx;
                     class01763xxxx.R = class01763xxxx.N(class01763x);
                     if (class01763xxxx.R()) {
                        this.Ns.N(class01763xxxx, class01763xxxx.i + class01763xxxx.R);
                     } else {
                        class01763xxxx.M = class01763xxxx.i + class01763xxxx.R;
                        this.Ns.N(class01763xxxx);
                     }
                  }
               }
            }
         }
      }

      if (class01763xx == class01763x) {
         return null;
      } else {
         T.debug("Failed to find path from {} to {}", var1, var2);
         if (var3 != null) {
            var3.B = class01763xx;
            class01763xx = var3;
         }

         return this.N(class01763x, class01763xx);
      }
   }

   public void N(class07209 var1) {
      this.Ny = var1;
   }

   public void N(class04782 var1, class00676 var2, class07209 var3, class07072 var4) {
      if (!(var4.u() instanceof class08036 class08036)) {
         class08036 = var1.N(b, var3.method_10263(), var3.method_10264(), var3.method_10260());
      }

      if (var2 == this.W) {
         this.N(var1, this.L, this.method_48923().u(var2, class08036), 10.0F);
      }

      this.NL.N().N(var2, var3, var4, class08036);
   }

   private boolean N(class04782 var1, class00734 var2) {
      int ix = class04995.N(var2.N);
      int j = class04995.N(var2.y);
      int k = class04995.N(var2.L);
      int l = class04995.N(var2.u);
      int i1 = class04995.N(var2.i);
      int j1 = class04995.N(var2.R);
      boolean flag = false;
      boolean flag1 = false;

      for (int k1 = ix; k1 <= l; k1++) {
         for (int l1 = j; l1 <= i1; l1++) {
            for (int i2 = k; i2 <= j1; i2++) {
               class07209 class07209x = new class07209(k1, l1, i2);
               class00500 class00500 = var1.method_8320(class07209x);
               if (!class00500.P() && !class00500.N(class01210.NF)) {
                  if (var1.method_64395().N(class07305.I) && !class00500.N(class01210.Np)) {
                     flag1 = var1.method_8650(class07209x, false) || flag1;
                  } else {
                     flag = true;
                  }
               }
            }
         }
      }

      if (flag1) {
         class07209 class07209 = new class07209(ix + this.field_5974.y(l - ix + 1), j + this.field_5974.y(i1 - j + 1), k + this.field_5974.y(j1 - k + 1));
         var1.N(2008, class07209, 0);
      }

      return flag;
   }

   protected void N(class04782 var1, class07072 var2, float var3) {
      super.method_64397(var1, var2, var3);
   }

   public int N(double var1, double var3, double var5) {
      float fx = 10000.0F;
      int ix = 0;
      class01763 class01763 = new class01763(class04995.N(var1), class04995.N(var3), class04995.N(var5));
      byte b0 = 0;
      if (this.NN == null || this.NN.i() == 0) {
         b0 = 12;
      }

      for (int j = b0; j < 24; j++) {
         if (this.Nm[j] != null) {
            float f1 = this.Nm[j].L(class01763);
            if (f1 < fx) {
               fx = f1;
               ix = j;
            }
         }
      }

      return ix;
   }

   public boolean N(class04782 var1, class00695 var2, class07072 var3, float var4) {
      if (this.NL.N().B() == class00702.z) {
         return false;
      } else {
         var4 = this.NL.N().N(var3, var4);
         if (var2 != this.L) {
            var4 = var4 / 4.0F + Math.min(var4, 1.0F);
         }

         if (var4 < 0.01F) {
            return false;
         } else {
            if (var3.u() instanceof class08036 || var3.N(class03696.d)) {
               float fx = this.method_6032();
               this.N(var1, var3, var4);
               if (this.method_29504() && !this.NL.N().N()) {
                  this.method_6033(1.0F);
                  this.NL.N(class00702.z);
               }

               if (this.NL.N().N()) {
                  this.NW = this.NW + fx - this.method_6032();
                  if (this.NW > 0.25F * this.method_6063()) {
                     this.NW = 0.0F;
                     this.NL.N(class00702.i);
                  }
               }
            }

            return true;
         }
      }
   }

   private void N(class00695 var1, double var2, double var4, double var6) {
      var1.method_5814(this.method_23317() + var2, this.method_23318() + var4, this.method_23321() + var6);
   }

   private class00143 N(class01763 var1, class01763 var2) {
      ArrayList arraylist = Lists.newArrayList();
      class01763 class01763 = var2;
      arraylist.add(0, var2);

      while (class01763.B != null) {
         class01763 = class01763.B;
         arraylist.add(0, class01763);
      }

      return new class00143(arraylist, new class07209(var2.N, var2.y, var2.L), true);
   }

   private void N(class04782 var1, List<class07049> var2) {
      double d0 = (this.u.method_5829().N + this.u.method_5829().u) / 2.0;
      double d1 = (this.u.method_5829().L + this.u.method_5829().R) / 2.0;

      for (class07049 class07049 : var2) {
         if (class07049 instanceof class07438 class07438) {
            double d2 = class07049.method_23317() - d0;
            double d3 = class07049.method_23321() - d1;
            double d4 = Math.max(d2 * d2 + d3 * d3, 0.1);
            class07049.method_5762(d2 / d4 * 4.0, 0.2F, d3 / d4 * 4.0);
            if (!this.NL.N().N() && class07438.method_6117() < class07049.field_6012 - 2) {
               class07072 class07072 = this.method_48923().y((class07438)this);
               class07049.method_64397(var1, class07072, 5.0F);
               class07323.N(var1, class07049, class07072);
            }
         }
      }
   }

   public class00684 W() {
      return this.NL;
   }

   @Override
   public float method_56077(float var1) {
      return 1.0F;
   }

   @Override
   public float method_6107() {
      return 5.0F;
   }

   @Override
   public void method_6007() {
      this.method_33573();
      if (this.method_73183().method_8608()) {
         this.method_6033(this.method_6032());
         if (!this.method_5701() && !this.NL.N().N() && --this.NE < 0) {
            this.method_73183()
               .method_8486(
                  this.method_23317(),
                  this.method_23318(),
                  this.method_23321(),
                  class04909.zH,
                  this.method_5634(),
                  2.5F,
                  0.8F + this.field_5974.z() * 0.3F,
                  false
               );
            this.NE = 200 + this.field_5974.y(200);
         }
      }

      if (this.NN == null && this.method_73183() instanceof class04782 class04782) {
         class07856 class07856 = class04782.method_29198();
         if (class07856 != null && this.method_5667().equals(class07856.Z())) {
            this.NN = class07856;
         }
      }

      this.i = this.R;
      if (this.method_29504()) {
         float f6 = (this.field_5974.z() - 0.5F) * 8.0F;
         float f8 = (this.field_5974.z() - 0.5F) * 4.0F;
         float f9 = (this.field_5974.z() - 0.5F) * 8.0F;
         this.method_73183().method_8406(class07107.l, this.method_23317() + f6, this.method_23318() + 2.0 + f8, this.method_23321() + f9, 0.0, 0.0, 0.0);
      } else {
         this.n();
         class06889 class06889 = this.method_18798();
         float f7 = 0.2F / ((float)class06889.Z() * 10.0F + 1.0F);
         f7 *= (float)Math.pow(2.0, class06889.B);
         if (this.NL.N().N()) {
            this.R += 0.1F;
         } else if (this.M) {
            this.R += f7 * 0.5F;
         } else {
            this.R += f7;
         }

         this.method_36456(class04995.R(this.method_36454()));
         if (this.Nt()) {
            this.R = 0.5F;
         } else {
            this.y.N(this.method_23318(), this.method_36454());
            if (this.method_73183() instanceof class04782 class04782x) {
               class00699 class00699 = this.NL.N();
               class00699.N(class04782x);
               if (this.NL.N() != class00699) {
                  class00699 = this.NL.N();
                  class00699.N(class04782x);
               }

               class06889 class06889x = class00699.R();
               if (class06889x != null) {
                  double d0 = class06889x.M - this.method_23317();
                  double d1 = class06889x.B - this.method_23318();
                  double d2 = class06889x.Z - this.method_23321();
                  double d3 = d0 * d0 + d1 * d1 + d2 * d2;
                  float f2 = class00699.i();
                  double d4 = Math.sqrt(d0 * d0 + d2 * d2);
                  if (d4 > 0.0) {
                     d1 = class04995.N(d1 / d4, (double)(-f2), (double)f2);
                  }

                  this.method_18799(this.method_18798().y(0.0, d1 * 0.01, 0.0));
                  this.method_36456(class04995.R(this.method_36454()));
                  class06889 class06889xx = class06889x.N(this.method_23317(), this.method_23318(), this.method_23321()).u();
                  class06889 class06889xxx = new class06889(
                        class04995.m(this.method_36454() * (float) (Math.PI / 180.0)),
                        this.method_18798().B,
                        -class04995.P(this.method_36454() * (float) (Math.PI / 180.0))
                     )
                     .u();
                  float f3 = Math.max(((float)class06889xxx.y(class06889xx) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs(d0) > 1.0E-5F || Math.abs(d2) > 1.0E-5F) {
                     float f4 = class04995.N(
                        class04995.R(180.0F - (float)class04995.u(d0, d2) * (180.0F / (float)Math.PI) - this.method_36454()), -50.0F, 50.0F
                     );
                     this.Z *= 0.8F;
                     this.Z = this.Z + f4 * class00699.M();
                     this.method_36456(this.method_36454() + this.Z * 0.1F);
                  }

                  float f20 = (float)(2.0 / (d3 + 1.0));
                  float f5 = 0.06F;
                  this.method_5724(0.06F * (f3 * f20 + (1.0F - f20)), new class06889(0.0, 0.0, -1.0));
                  if (this.M) {
                     this.method_5784(class07451.field_6308, this.method_18798().L(0.8F));
                  } else {
                     this.method_5784(class07451.field_6308, this.method_18798());
                  }

                  class06889 class06889xxxx = this.method_18798().u();
                  double d5 = 0.8 + 0.15 * (class06889xxxx.y(class06889xxx) + 1.0) / 2.0;
                  this.method_18799(this.method_18798().u(d5, 0.91F, d5));
               }
            } else {
               super.fields_7212a028292fd3c078969e3ee4c71d9e8_3.method_66271();
               this.NL.N().y();
            }

            if (!this.method_73183().method_8608()) {
               this.method_61409();
            }

            super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.method_36454();
            class06889[] aclass06889 = new class06889[this.f.length];

            for (int ix = 0; ix < this.f.length; ix++) {
               aclass06889[ix] = new class06889(this.f[ix].method_23317(), this.f[ix].method_23318(), this.f[ix].method_23321());
            }

            float f10 = (float)(this.y.N(5).N() - this.y.N(10).N()) * 10.0F * (float) (Math.PI / 180.0);
            float f11 = class04995.P(f10);
            float f12 = class04995.m(f10);
            float fx = this.method_36454() * (float) (Math.PI / 180.0);
            float f13 = class04995.m(fx);
            float f1 = class04995.P(fx);
            this.N(this.u, f13 * 0.5F, 0.0, -f1 * 0.5F);
            this.N(this.h, f1 * 4.5F, 2.0, f13 * 4.5F);
            this.N(this.r, f1 * -4.5F, 2.0, f13 * -4.5F);
            if (this.method_73183() instanceof class04782 class04782x && super.fields_2212a028292fd3c078969e3ee4c71d9e8_0 == 0) {
               this.N(class04782x, class04782x.method_8333(this, this.h.method_5829().L(4.0, 2.0, 4.0).u(0.0, -2.0, 0.0), class07042.i));
               this.N(class04782x, class04782x.method_8333(this, this.r.method_5829().L(4.0, 2.0, 4.0).u(0.0, -2.0, 0.0), class07042.i));
               this.y(class04782x, class04782x.method_8333(this, this.L.method_5829().M(1.0), class07042.i));
               this.y(class04782x, class04782x.method_8333(this, this.C.method_5829().M(1.0), class07042.i));
            }

            float f14 = class04995.m(this.method_36454() * (float) (Math.PI / 180.0) - this.Z * 0.01F);
            float f15 = class04995.P(this.method_36454() * (float) (Math.PI / 180.0) - this.Z * 0.01F);
            float f16 = this.v();
            this.N(this.L, f14 * 6.5F * f11, f16 + f12 * 6.5F, -f15 * 6.5F * f11);
            this.N(this.C, f14 * 5.5F * f11, f16 + f12 * 5.5F, -f15 * 5.5F * f11);
            class02753 class02753 = this.y.N(5);

            for (int j = 0; j < 3; j++) {
               class00695 class00695 = null;
               if (j == 0) {
                  class00695 = this.S;
               }

               if (j == 1) {
                  class00695 = this.x;
               }

               if (j == 2) {
                  class00695 = this.D;
               }

               class02753 class02753x = this.y.N(12 + j * 2);
               float f17 = this.method_36454() * (float) (Math.PI / 180.0) + this.L(class02753x.y() - class02753.y()) * (float) (Math.PI / 180.0);
               float f18 = class04995.m(f17);
               float f19 = class04995.P(f17);
               float f21 = 1.5F;
               float f22 = (j + 1) * 2.0F;
               this.N(class00695, -(f13 * 1.5F + f18 * f22) * f11, class02753x.N() - class02753.N() - (f22 + 1.5F) * f12 + 1.5, (f1 * 1.5F + f19 * f22) * f11);
            }

            if (this.method_73183() instanceof class04782 class04782x) {
               this.M = this.N(class04782x, this.L.method_5829()) | this.N(class04782x, this.C.method_5829()) | this.N(class04782x, this.u.method_5829());
               if (this.NN != null) {
                  this.NN.y(this);
               }
            }

            for (int k = 0; k < this.f.length; k++) {
               this.f[k].field_6014 = aclass06889[k].M;
               this.f[k].field_6036 = aclass06889[k].B;
               this.f[k].field_5969 = aclass06889[k].Z;
               this.f[k].field_6038 = aclass06889[k].M;
               this.f[k].field_5971 = aclass06889[k].B;
               this.f[k].field_5989 = aclass06889[k].Z;
            }
         }
      }
   }

   @Override
   public boolean method_18395(class07438 var1) {
      return var1.method_33190();
   }

   @Override
   public boolean method_37222(class07055 var1, @Nullable class07049 var2) {
      return false;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.zc;
   }

   @Override
   public void method_6108() {
      if (this.NN != null) {
         this.NN.y(this);
      }

      this.B++;
      if (this.B >= 180 && this.B <= 200) {
         float fx = (this.field_5974.z() - 0.5F) * 8.0F;
         float f1 = (this.field_5974.z() - 0.5F) * 4.0F;
         float f2 = (this.field_5974.z() - 0.5F) * 8.0F;
         this.method_73183().method_8406(class07107.G, this.method_23317() + fx, this.method_23318() + 2.0 + f1, this.method_23321() + f2, 0.0, 0.0, 0.0);
      }

      short short1 = 500;
      if (this.NN != null && !this.NN.R()) {
         short1 = 12000;
      }

      if (this.method_73183() instanceof class04782 class04782x) {
         if (this.B > 150 && this.B % 5 == 0 && class04782x.method_64395().N(class07305.O)) {
            class07057.N(class04782x, this.method_73189(), class04995.y(short1 * 0.08F));
         }

         if (this.B == 1 && !this.method_5701()) {
            class04782x.method_8474(1028, this.method_24515(), 0);
         }
      }

      class06889 class06889 = new class06889(0.0, 0.1F, 0.0);
      this.method_5784(class07451.field_6308, class06889);

      for (class00695 class00695 : this.f) {
         class00695.method_22862();
         class00695.method_33574(class00695.method_73189().i(class06889));
      }

      if (this.B == 200 && this.method_73183() instanceof class04782 class04782) {
         if (class04782.method_64395().N(class07305.O)) {
            class07057.N(class04782, this.method_73189(), class04995.y(short1 * 0.2F));
         }

         if (this.NN != null) {
            this.NN.N(this);
         }

         this.method_5650(class07062.field_26998);
         this.method_32876(class01194.s);
      }
   }
}
