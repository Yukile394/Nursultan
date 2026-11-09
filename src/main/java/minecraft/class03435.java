package minecraft;

import Nursultan.class10285;
import java.util.Arrays;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.jspecify.annotations.Nullable;

public class class03435 implements class03460 {
   private static final int N = 10;
   private static final int y = 9;
   private static final int L = 10;
   private static final int u = 6;
   private static final int i = 3;
   private static final int R = 6;
   private static final int M = 16;
   private static final int B = 12;
   private static final int Z = 16;
   private static final int z = 4;
   private static final int U = 4;
   private static final int E = 11;
   private static final double W = N(class04995.Z(10), class04995.Z(12));
   private static final int m = -5;
   private static final int P = 1;
   private static final int s = -5;
   private static final int T = 0;
   private static final int b = -1;
   private static final int j = 0;
   private static final int v = 1;
   private static final int n = 1;
   private static final int t = 1;
   private final class01837 G;
   private final class03877 l;
   private final class03877 d;
   private final class03877 w;
   private final class03877 k;
   private final class01818 Y;
   private final class03430[] Q;
   private final long[] O;
   private final class03421 g;
   private final class03877 I;
   private final class03877 J;
   private boolean o;
   private final int q;
   private final int K;
   private final int V;
   private final int e;
   private final int H;
   private final int c;
   private static final int[][] X = new int[][]{
      {0, 0}, {-2, -1}, {-1, -1}, {0, -1}, {1, -1}, {-3, 0}, {-2, 0}, {-1, 0}, {1, 0}, {-2, 1}, {-1, 1}, {0, 1}, {1, 1}
   };

   private static int L(int var0, int var1) {
      return var0 * 12 + var1;
   }

   private static int L(int var0) {
      return var0 >> 4;
   }

   class03435(class01837 var1, class07321 var2, class03866 var3, class01818 var4, int var5, int var6, class03421 var7) {
      super();
      this.G = var1;
      this.l = var3.N();
      this.d = var3.y();
      this.w = var3.L();
      this.k = var3.u();
      this.I = var3.B();
      this.J = var3.Z();
      this.Y = var4;
      this.K = N(var2.i() + -5) + 0;
      this.g = var7;
      int ix = N(var2.M() + -5) + 1;
      this.H = ix - this.K + 1;
      this.V = y(var5 + 1) + -1;
      int jx = y(var5 + var6 + 1) + 1 - this.V + 1;
      this.e = L(var2.R() + -5) + 0;
      int kx = L(var2.B() + -5) + 1;
      this.c = kx - this.e + 1;
      int lx = this.H * jx * this.c;
      this.Q = new class03430[lx];
      this.O = new long[lx];
      Arrays.fill(this.O, Long.MAX_VALUE);
      int i1 = y(this.i(var1.N(y(this.K, 0), u(this.e, 0), y(ix, 9), u(kx, 9))) + 12) - -1;
      this.q = L(i1, 11) - 1;
   }

   private int i(int var1) {
      return var1 + 8;
   }

   private static int u(int var0, int var1) {
      return (var0 << 4) + var1;
   }

   private class03430 u(int var1) {
      class03430 class03430x = this.Q[var1];
      if (class03430x != null) {
         return class03430x;
      } else {
         long ix = this.O[var1];
         class03430 class03430x = this.y(class07209.method_10061(ix), class07209.method_10071(ix), class07209.method_10083(ix));
         this.Q[var1] = class03430x;
         return class03430x;
      }
   }

   private class03430 y(int var1, int var2, int var3) {
      class03430 class03430x = this.g.computeFluid(var1, var2, var3);
      int ix = Integer.MAX_VALUE;
      int jx = var2 + 12;
      int kx = var2 - 12;
      boolean flag = false;

      for (int[] aint : X) {
         int lx = var1 + class01296.L(aint[0]);
         int i1 = var3 + class01296.L(aint[1]);
         int j1 = this.G.N(lx, i1);
         int k1 = this.i(j1);
         boolean flag1 = aint[0] == 0 && aint[1] == 0;
         if (flag1 && kx > k1) {
            return class03430x;
         }

         boolean flag2 = jx > k1;
         if (flag2 || flag1) {
            class03430 class03430x = this.g.computeFluid(lx, k1, i1);
            if (!class03430x.N(k1).P()) {
               if (flag1) {
                  flag = true;
               }

               if (flag2) {
                  return class03430x;
               }
            }
         }

         ix = Math.min(ix, j1);
      }

      int l1 = this.N(var1, var2, var3, class03430x, ix, flag);
      return new class03430(l1, this.N(var1, var2, var3, class03430x, l1));
   }

   private static int y(int var0) {
      return Math.floorDiv(var0, 12);
   }

   private static int y(int var0, int var1) {
      return (var0 << 4) + var1;
   }

   private static double N(int var0, int var1) {
      double d0 = 25.0;
      return 1.0 - (var1 - var0) / 25.0;
   }

   private int N(int var1, int var2, int var3, class03430 var4, int var5, boolean var6) {
      class10285 class10285 = new class10285(var1, var2, var3);
      double d0;
      double d1;
      if (class01835.N(this.I, this.J, class10285)) {
         d0 = -1.0;
         d1 = -1.0;
      } else {
         int ix = var5 + 8 - var2;
         byte b0 = 64;
         double d2 = var6 ? class04995.N((double)ix, 0.0, 64.0, 1.0, 0.0) : 0.0;
         double d3 = class04995.N(this.d.N(class10285), -1.0, 1.0);
         double d4 = class04995.y(d2, 1.0, 0.0, -0.3, 0.8);
         double d5 = class04995.y(d2, 1.0, 0.0, -0.8, 0.4);
         d0 = d3 - d5;
         d1 = d3 - d4;
      }

      int jx;
      if (d1 > 0.0) {
         jx = var4.N();
      } else if (d0 > 0.0) {
         jx = this.N(var1, var2, var3, var5);
      } else {
         jx = class07376.M;
      }

      return jx;
   }

   private int N(int var1, int var2, int var3, int var4) {
      byte b0 = 16;
      byte b1 = 40;
      int ix = Math.floorDiv(var1, 16);
      int jx = Math.floorDiv(var2, 40);
      int kx = Math.floorDiv(var3, 16);
      int lx = jx * 40 + 20;
      byte b2 = 10;
      int i1 = class04995.N(this.w.N(new class10285(ix, jx, kx)) * 10.0, 3);
      int j1 = lx + i1;
      return Math.min(var4, j1);
   }

   private class00500 N(int var1, int var2, int var3, class03430 var4, int var5) {
      class00500 class00500 = var4.y();
      if (var5 <= -10 && var5 != class07376.M && var4.y() != class00869.V.W()) {
         byte b0 = 64;
         byte b1 = 40;
         int ix = Math.floorDiv(var1, 64);
         int jx = Math.floorDiv(var2, 40);
         int kx = Math.floorDiv(var3, 64);
         if (Math.abs(this.k.N(new class10285(ix, jx, kx))) > 0.3) {
            class00500 = class00869.V.W();
         }
      }

      return class00500;
   }

   @Override
   public boolean N() {
      return this.o;
   }

   @Nullable
   @Override
   public class00500 N(class03875 var1, double var2) {
      if (var2 > 0.0) {
         this.o = false;
         return null;
      } else {
         int ix = var1.y();
         int jx = var1.L();
         int kx = var1.u();
         class03430 class03430xx = this.g.computeFluid(ix, jx, kx);
         if (jx > this.q) {
            this.o = false;
            return class03430xx.N(jx);
         } else if (class03430xx.N(jx).N(class00869.V)) {
            this.o = false;
            return class07529.Nd ? class00869.N.W() : class00869.V.W();
         } else {
            int lx = N(ix + -5);
            int i1 = y(jx + 1);
            int j1 = L(kx + -5);
            int k1 = Integer.MAX_VALUE;
            int l1 = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int j2 = Integer.MAX_VALUE;
            int k2 = 0;
            int l2 = 0;
            int i3 = 0;
            int j3 = 0;

            for (int k3 = 0; k3 <= 1; k3++) {
               for (int l3 = -1; l3 <= 1; l3++) {
                  for (int i4 = 0; i4 <= 1; i4++) {
                     int j4 = lx + k3;
                     int k4 = i1 + l3;
                     int l4 = j1 + i4;
                     int i5 = this.N(j4, k4, l4);
                     long k5 = this.O[i5];
                     long j5;
                     if (k5 != Long.MAX_VALUE) {
                        j5 = k5;
                     } else {
                        class06069 class06069 = this.Y.N(j4, k4, l4);
                        j5 = class07209.method_10064(y(j4, class06069.y(10)), L(k4, class06069.y(9)), u(l4, class06069.y(10)));
                        this.O[i5] = j5;
                     }

                     int k6 = class07209.method_10061(j5) - ix;
                     int l5 = class07209.method_10071(j5) - jx;
                     int i6 = class07209.method_10083(j5) - kx;
                     int j6 = k6 * k6 + l5 * l5 + i6 * i6;
                     if (k1 >= j6) {
                        j3 = i3;
                        i3 = l2;
                        l2 = k2;
                        k2 = i5;
                        j2 = i2;
                        i2 = l1;
                        l1 = k1;
                        k1 = j6;
                     } else if (l1 >= j6) {
                        j3 = i3;
                        i3 = l2;
                        l2 = i5;
                        j2 = i2;
                        i2 = l1;
                        l1 = j6;
                     } else if (i2 >= j6) {
                        j3 = i3;
                        i3 = i5;
                        j2 = i2;
                        i2 = j6;
                     } else if (j2 >= j6) {
                        j3 = i5;
                        j2 = j6;
                     }
                  }
               }
            }

            class03430 class03430x = this.u(k2);
            double d1 = N(k1, l1);
            class00500 class00500 = class03430x.N(jx);
            class00500 class00500x = class07529.Nd ? class00869.N.W() : class00500;
            if (d1 <= 0.0) {
               if (d1 >= W) {
                  class03430 class03430xx = this.u(l2);
                  this.o = !class03430x.equals(class03430xx);
               } else {
                  this.o = false;
               }

               return class00500x;
            } else if (class00500.N(class00869.K) && this.g.computeFluid(ix, jx - 1, kx).N(jx - 1).N(class00869.V)) {
               this.o = true;
               return class00500x;
            } else {
               MutableDouble mutabledouble = new MutableDouble(Double.NaN);
               class03430 class03430xx = this.u(l2);
               double d2 = d1 * this.N(var1, mutabledouble, class03430x, class03430xx);
               if (var2 + d2 > 0.0) {
                  this.o = false;
                  return null;
               } else {
                  class03430 class03430xxx = this.u(i3);
                  double d0 = N(k1, i2);
                  if (d0 > 0.0) {
                     double d3 = d1 * d0 * this.N(var1, mutabledouble, class03430x, class03430xxx);
                     if (var2 + d3 > 0.0) {
                        this.o = false;
                        return null;
                     }
                  }

                  double d4 = N(l1, i2);
                  if (d4 > 0.0) {
                     double d5 = d1 * d4 * this.N(var1, mutabledouble, class03430xx, class03430xxx);
                     if (var2 + d5 > 0.0) {
                        this.o = false;
                        return null;
                     }
                  }

                  boolean flag2 = !class03430x.equals(class03430xx);
                  boolean flag = d4 >= W && !class03430xx.equals(class03430xxx);
                  boolean flag1 = d0 >= W && !class03430x.equals(class03430xxx);
                  if (!flag2 && !flag && !flag1) {
                     this.o = d0 >= W && N(k1, j2) >= W && !class03430x.equals(this.u(j3));
                  } else {
                     this.o = true;
                  }

                  return class00500x;
               }
            }
         }
      }
   }

   private int N(int var1, int var2, int var3) {
      int ix = var1 - this.K;
      int jx = var2 - this.V;
      int kx = var3 - this.e;
      return (jx * this.c + kx) * this.H + ix;
   }

   private static int N(int var0) {
      return var0 >> 4;
   }

   private double N(class03875 var1, MutableDouble var2, class03430 var3, class03430 var4) {
      int ix = var1.L();
      class00500 class00500x = var3.N(ix);
      class00500 class00500x = var4.N(ix);
      if ((!class00500x.N(class00869.V) || !class00500x.N(class00869.K)) && (!class00500x.N(class00869.K) || !class00500x.N(class00869.V))) {
         int jx = Math.abs(var3.N() - var4.N());
         if (jx == 0) {
            return 0.0;
         } else {
            double d0 = 0.5 * (var3.N() + var4.N());
            double d1 = ix + 0.5 - d0;
            double d2 = jx / 2.0;
            double d3 = 0.0;
            double d4 = 2.5;
            double d5 = 1.5;
            double d6 = 3.0;
            double d7 = 10.0;
            double d8 = 3.0;
            double d9 = d2 - Math.abs(d1);
            double d10;
            if (d1 > 0.0) {
               double d11 = 0.0 + d9;
               if (d11 > 0.0) {
                  d10 = d11 / 1.5;
               } else {
                  d10 = d11 / 2.5;
               }
            } else {
               double d15 = 3.0 + d9;
               if (d15 > 0.0) {
                  d10 = d15 / 3.0;
               } else {
                  d10 = d15 / 10.0;
               }
            }

            double d16 = 2.0;
            double d12;
            if (!(d10 < -2.0) && !(d10 > 2.0)) {
               double d13 = var2.doubleValue();
               if (Double.isNaN(d13)) {
                  double d14 = this.l.N(var1);
                  var2.setValue(d14);
                  d12 = d14;
               } else {
                  d12 = d13;
               }
            } else {
               d12 = 0.0;
            }

            return 2.0 * (d12 + d10);
         }
      } else {
         return 2.0;
      }
   }
}
