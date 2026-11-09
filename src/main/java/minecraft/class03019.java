package minecraft;

import Nursultan.class10090;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class class03019 {
   private static final class00500 N = class00869.ZN.W();
   private static final class00500 y = class00869.Zy.W();
   private static final class00500 L = class00869.zj.W();
   private static final class00500 u = class00869.Zi.W();
   private static final class00500 i = class00869.ZW.W();
   private static final class00500 R = class00869.ZP.W();
   private static final class00500 M = class00869.ZZ.W();
   private static final class00500 B = class00869.zn.W();
   private static final class00500 Z = class00869.ib.W();
   private final class00500 z;
   private final int U;
   private final class00500[] E;
   private final class05041 W;
   private final class05041 m;
   private final class05041 P;
   private final class05041 s;
   private final class05041 T;
   private final class05041 b;
   private final class05041 j;
   private final class01818 v;
   private final class05041 n;
   private final class05041 t;

   public class03019(class04084 var1, class00500 var2, int var3, class01818 var4) {
      super();
      this.z = var2;
      this.U = var3;
      this.v = var4;
      this.W = var1.N(class03008.a);
      this.E = N(var4.N(class01894.y("clay_bands")));
      this.n = var1.N(class03008.c);
      this.t = var1.N(class03008.X);
      this.m = var1.N(class03008.p);
      this.P = var1.N(class03008.F);
      this.s = var1.N(class03008.A);
      this.T = var1.N(class03008.f);
      this.b = var1.N(class03008.C);
      this.j = var1.N(class03008.S);
   }

   protected double y(int var1, int var2) {
      return this.t.N(var1, 0.0, var2);
   }

   private static void N(class06069 var0, class00500[] var1, int var2, class00500 var3) {
      int ix = var0.N(6, 15);

      for (int jx = 0; jx < ix; jx++) {
         int k = var2 + var0.y(3);
         int l = var0.y(var1.length);

         for (int i1 = 0; l + i1 < var1.length && i1 < k; i1++) {
            var1[l + i1] = var3;
         }
      }
   }

   private static class00500[] N(class06069 var0) {
      class00500[] aclass00500 = new class00500[192];
      Arrays.fill(aclass00500, L);

      for (int k = 0; k < aclass00500.length; k++) {
         k += var0.y(5) + 1;
         if (k < aclass00500.length) {
            aclass00500[k] = y;
         }
      }

      N(var0, aclass00500, 1, u);
      N(var0, aclass00500, 2, i);
      N(var0, aclass00500, 1, R);
      int l = var0.N(9, 15);
      int ix = 0;

      for (int jx = 0; ix < l && jx < aclass00500.length; jx += var0.y(16) + 4) {
         aclass00500[jx] = N;
         if (jx - 1 > 0 && var0.Z()) {
            aclass00500[jx - 1] = M;
         }

         if (jx + 1 < aclass00500.length && var0.Z()) {
            aclass00500[jx + 1] = M;
         }

         ix++;
      }

      return aclass00500;
   }

   private void N(int var1, class00780 var2, class01820 var3, class07218 var4, int var5, int var6, int var7) {
      double d0 = 1.28;
      double d1 = Math.min(Math.abs(this.j.N(var5, 0.0, var6) * 8.25), this.T.N(var5 * 1.28, 0.0, var6 * 1.28) * 15.0);
      if (!(d1 <= 1.8)) {
         double d3 = 1.17;
         double d4 = 1.5;
         double d5 = Math.abs(this.b.N(var5 * 1.17, 0.0, var6 * 1.17) * 1.5);
         double d6 = Math.min(d1 * d1 * 1.2, Math.ceil(d5 * 40.0) + 14.0);
         if (var2.u(var4.N(var5, this.U, var6), this.U)) {
            d6 -= 2.0;
         }

         double d2;
         if (d6 > 2.0) {
            d2 = this.U - d6 - 7.0;
            d6 += this.U;
         } else {
            d6 = 0.0;
            d2 = 0.0;
         }

         double d7 = d6;
         class06069 class06069 = this.v.N(var5, 0, var6);
         int ix = 2 + class06069.y(4);
         int jx = this.U + 18 + class06069.y(10);
         int k = 0;

         for (int l = Math.max(var7, (int)d6 + 1); l >= var1; l--) {
            if (var3.N(l).P() && l < (int)d7 && class06069.U() > 0.01
               || var3.N(l).N(class00869.K) && l > (int)d2 && l < this.U && d2 != 0.0 && class06069.U() > 0.15) {
               if (k <= ix && l > jx) {
                  var3.N(l, Z);
                  k++;
               } else {
                  var3.N(l, B);
               }
            }
         }
      }
   }

   public class00500 N(int var1, int var2, int var3) {
      int ix = (int)Math.round(this.W.N(var1, 0.0, var3) * 4.0);
      return this.E[(var2 + ix + this.E.length) % this.E.length];
   }

   @Deprecated
   public Optional<class00500> N(
      class03028 var1, class06080 var2, Function<class07209, class03556<class00780>> var3, class08050 var4, class01837 var5, class07209 var6, boolean var7
   ) {
      class04039 class04039 = new class04039(this, var2.y(), var4, var5, var3, var2.N().L(class04227.NA), var2);
      class03003 class03003 = var1.apply(class04039);
      int ix = var6.method_10263();
      int jx = var6.method_10264();
      int k = var6.method_10260();
      class04039.N(ix, k);
      class04039.N(1, 1, var7 ? jx + 1 : Integer.MIN_VALUE, ix, jx, k);
      return Optional.ofNullable(class03003.tryApply(ix, jx, k));
   }

   protected int N(int var1, int var2) {
      return (int)(this.n.N(var1, 0.0, var2) * 2.75 + 3.0 + this.v.N(var1, 0, var2).U() * 0.25);
   }

   private boolean N(class00500 var1) {
      return !var1.P() && var1.Y().W();
   }

   public int N() {
      return this.U;
   }

   public void N(
      class04084 var1, class05517 var2, class00751<class00780> var3, boolean var4, class06057 var5, class08050 var6, class01837 var7, class03028 var8
   ) {
      class07218 class07218 = new class07218();
      class07321 class07321 = var6.R();
      int ix = class07321.i();
      int jx = class07321.R();
      class10090 class10090 = new class10090(this, var6, class07218, class07321);
      class04039 class04039 = new class04039(this, var1, var6, var7, var2::N, var3, var5);
      class03003 class03003 = var8.apply(class04039);
      class07218 class07218x = new class07218();

      for (int k = 0; k < 16; k++) {
         for (int l = 0; l < 16; l++) {
            int i1 = ix + k;
            int j1 = jx + l;
            int k1 = var6.N(class07830.field_13194, k, l) + 1;
            class07218.method_20787(i1).method_20788(j1);
            class03556<class00780> class03556 = var2.N(class07218x.N(i1, var4 ? 0 : k1, j1));
            if (class03556.N(class00795.Q)) {
               this.N(class10090, i1, j1, k1, var6);
            }

            int l1 = var6.N(class07830.field_13194, k, l) + 1;
            class04039.N(i1, j1);
            int i2 = 0;
            int j2 = Integer.MIN_VALUE;
            int k2 = Integer.MAX_VALUE;
            int l2 = var6.method_31607();

            for (int i3 = l1; i3 >= l2; i3--) {
               class00500 class00500x = class10090.N(i3);
               if (class00500x.P()) {
                  i2 = 0;
                  j2 = Integer.MIN_VALUE;
               } else if (!class00500x.Y().W()) {
                  if (j2 == Integer.MIN_VALUE) {
                     j2 = i3 + 1;
                  }
               } else {
                  if (k2 >= i3) {
                     k2 = class07376.M;

                     for (int j3 = i3 - 1; j3 >= l2 - 1; j3--) {
                        class00500 class00500x = class10090.N(j3);
                        if (!this.N(class00500x)) {
                           k2 = j3 + 1;
                           break;
                        }
                     }
                  }

                  i2++;
                  int k3 = i3 - k2 + 1;
                  class04039.N(i2, k3, j2, i1, i3, j1);
                  if (class00500x == this.z) {
                     class00500 class00500x = class03003.tryApply(i1, i3, j1);
                     if (class00500x != null) {
                        class10090.N(i3, class00500x);
                     }
                  }
               }
            }

            if (class03556.N(class00795.D) || class03556.N(class00795.h)) {
               this.N(class04039.L(), class03556.N(), class10090, class07218x, i1, j1, k1);
            }
         }
      }
   }

   private void N(class01820 var1, int var2, int var3, int var4, class05474 var5) {
      double d0 = 0.2;
      double d1 = Math.min(Math.abs(this.s.N(var2, 0.0, var3) * 8.25), this.m.N(var2 * 0.2, 0.0, var3 * 0.2) * 15.0);
      if (!(d1 <= 0.0)) {
         double d2 = 0.75;
         double d3 = 1.5;
         double d4 = Math.abs(this.P.N(var2 * 0.75, 0.0, var3 * 0.75) * 1.5);
         int ix = class04995.N(64.0 + Math.min(d1 * d1 * 2.5, Math.ceil(d4 * 50.0) + 24.0));
         if (var4 <= ix) {
            for (int jx = ix; jx >= var5.method_31607(); jx--) {
               class00500 class00500 = var1.N(jx);
               if (class00500.N(this.z.i())) {
                  break;
               }

               if (class00500.N(class00869.K)) {
                  return;
               }
            }

            for (int k = ix; k >= var5.method_31607() && var1.N(k).P(); k--) {
               var1.N(k, this.z);
            }
         }
      }
   }
}
