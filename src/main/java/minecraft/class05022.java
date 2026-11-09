package minecraft;

public class class05022 {
   protected static final int[][] N = new int[][]{
      {1, 1, 0},
      {-1, 1, 0},
      {1, -1, 0},
      {-1, -1, 0},
      {1, 0, 1},
      {-1, 0, 1},
      {1, 0, -1},
      {-1, 0, -1},
      {0, 1, 1},
      {0, -1, 1},
      {0, 1, -1},
      {0, -1, -1},
      {1, 1, 0},
      {0, -1, 1},
      {-1, 1, 0},
      {0, -1, -1}
   };
   private static final double i = Math.sqrt(3.0);
   private static final double R = 0.5 * (i - 1.0);
   private static final double M = (3.0 - i) / 6.0;
   private final int[] B = new int[512];
   public final double y;
   public final double L;
   public final double u;

   public class05022(class06069 var1) {
      super();
      this.y = var1.U() * 256.0;
      this.L = var1.U() * 256.0;
      this.u = var1.U() * 256.0;
      int ix = 0;

      while (ix < 256) {
         this.B[ix] = ix++;
      }

      for (int l = 0; l < 256; l++) {
         int j = var1.y(256 - l);
         int k = this.B[l];
         this.B[l] = this.B[j + l];
         this.B[j + l] = k;
      }
   }

   private double N(int var1, double var2, double var4, double var6, double var8) {
      double d1 = var8 - var2 * var2 - var4 * var4 - var6 * var6;
      double d0;
      if (d1 < 0.0) {
         d0 = 0.0;
      } else {
         d1 *= d1;
         d0 = d1 * d1 * N(N[var1], var2, var4, var6);
      }

      return d0;
   }

   public double N(double var1, double var3, double var5) {
      double d0 = 0.3333333333333333;
      double d1 = (var1 + var3 + var5) * 0.3333333333333333;
      int ix = class04995.N(var1 + d1);
      int j = class04995.N(var3 + d1);
      int k = class04995.N(var5 + d1);
      double d2 = 0.16666666666666666;
      double d3 = (ix + j + k) * 0.16666666666666666;
      double d4 = ix - d3;
      double d5 = j - d3;
      double d6 = k - d3;
      double d7 = var1 - d4;
      double d8 = var3 - d5;
      double d9 = var5 - d6;
      byte b0;
      byte b1;
      byte b2;
      byte b3;
      byte b4;
      byte b5;
      if (d7 >= d8) {
         if (d8 >= d9) {
            b0 = 1;
            b1 = 0;
            b2 = 0;
            b3 = 1;
            b4 = 1;
            b5 = 0;
         } else if (d7 >= d9) {
            b0 = 1;
            b1 = 0;
            b2 = 0;
            b3 = 1;
            b4 = 0;
            b5 = 1;
         } else {
            b0 = 0;
            b1 = 0;
            b2 = 1;
            b3 = 1;
            b4 = 0;
            b5 = 1;
         }
      } else if (d8 < d9) {
         b0 = 0;
         b1 = 0;
         b2 = 1;
         b3 = 0;
         b4 = 1;
         b5 = 1;
      } else if (d7 < d9) {
         b0 = 0;
         b1 = 1;
         b2 = 0;
         b3 = 0;
         b4 = 1;
         b5 = 1;
      } else {
         b0 = 0;
         b1 = 1;
         b2 = 0;
         b3 = 1;
         b4 = 1;
         b5 = 0;
      }

      double d10 = d7 - b0 + 0.16666666666666666;
      double d11 = d8 - b1 + 0.16666666666666666;
      double d12 = d9 - b2 + 0.16666666666666666;
      double d13 = d7 - b3 + 0.3333333333333333;
      double d14 = d8 - b4 + 0.3333333333333333;
      double d15 = d9 - b5 + 0.3333333333333333;
      double d16 = d7 - 1.0 + 0.5;
      double d17 = d8 - 1.0 + 0.5;
      double d18 = d9 - 1.0 + 0.5;
      int l = ix & 0xFF;
      int i1 = j & 0xFF;
      int j1 = k & 0xFF;
      int k1 = this.N(l + this.N(i1 + this.N(j1))) % 12;
      int l1 = this.N(l + b0 + this.N(i1 + b1 + this.N(j1 + b2))) % 12;
      int i2 = this.N(l + b3 + this.N(i1 + b4 + this.N(j1 + b5))) % 12;
      int j2 = this.N(l + 1 + this.N(i1 + 1 + this.N(j1 + 1))) % 12;
      double d19 = this.N(k1, d7, d8, d9, 0.6);
      double d20 = this.N(l1, d10, d11, d12, 0.6);
      double d21 = this.N(i2, d13, d14, d15, 0.6);
      double d22 = this.N(j2, d16, d17, d18, 0.6);
      return 32.0 * (d19 + d20 + d21 + d22);
   }

   public double N(double var1, double var3) {
      double d0 = (var1 + var3) * R;
      int ix = class04995.N(var1 + d0);
      int j = class04995.N(var3 + d0);
      double d1 = (ix + j) * M;
      double d2 = ix - d1;
      double d3 = j - d1;
      double d4 = var1 - d2;
      double d5 = var3 - d3;
      byte b0;
      byte b1;
      if (d4 > d5) {
         b0 = 1;
         b1 = 0;
      } else {
         b0 = 0;
         b1 = 1;
      }

      double d6 = d4 - b0 + M;
      double d7 = d5 - b1 + M;
      double d8 = d4 - 1.0 + 2.0 * M;
      double d9 = d5 - 1.0 + 2.0 * M;
      int k = ix & 0xFF;
      int l = j & 0xFF;
      int i1 = this.N(k + this.N(l)) % 12;
      int j1 = this.N(k + b0 + this.N(l + b1)) % 12;
      int k1 = this.N(k + 1 + this.N(l + 1)) % 12;
      double d10 = this.N(i1, d4, d5, 0.0, 0.5);
      double d11 = this.N(j1, d6, d7, 0.0, 0.5);
      double d12 = this.N(k1, d8, d9, 0.0, 0.5);
      return 70.0 * (d10 + d11 + d12);
   }

   private int N(int var1) {
      return this.B[var1 & 0xFF];
   }

   protected static double N(int[] var0, double var1, double var3, double var5) {
      return var0[0] * var1 + var0[1] * var3 + var0[2] * var5;
   }
}
