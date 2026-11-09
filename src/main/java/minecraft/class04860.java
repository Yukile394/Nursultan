package minecraft;

public final class class04860 {
   private static final float u = 1.0E-7F;
   private final byte[] i;
   public final double N;
   public final double y;
   public final double L;

   public class04860(class06069 var1) {
      super();
      this.N = var1.U() * 256.0;
      this.y = var1.U() * 256.0;
      this.L = var1.U() * 256.0;
      this.i = new byte[256];

      for (int ix = 0; ix < 256; ix++) {
         this.i[ix] = (byte)ix;
      }

      for (int k = 0; k < 256; k++) {
         int j = var1.y(256 - k);
         byte b0 = this.i[k];
         this.i[k] = this.i[k + j];
         this.i[k + j] = b0;
      }
   }

   private int N(int var1) {
      return this.i[var1 & 0xFF] & 0xFF;
   }

   private double N(int var1, int var2, int var3, double var4, double var6, double var8, double var10) {
      int ix = this.N(var1);
      int j = this.N(var1 + 1);
      int k = this.N(ix + var2);
      int l = this.N(ix + var2 + 1);
      int i1 = this.N(j + var2);
      int j1 = this.N(j + var2 + 1);
      double d0 = N(this.N(k + var3), var4, var6, var8);
      double d1 = N(this.N(i1 + var3), var4 - 1.0, var6, var8);
      double d2 = N(this.N(l + var3), var4, var6 - 1.0, var8);
      double d3 = N(this.N(j1 + var3), var4 - 1.0, var6 - 1.0, var8);
      double d4 = N(this.N(k + var3 + 1), var4, var6, var8 - 1.0);
      double d5 = N(this.N(i1 + var3 + 1), var4 - 1.0, var6, var8 - 1.0);
      double d6 = N(this.N(l + var3 + 1), var4, var6 - 1.0, var8 - 1.0);
      double d7 = N(this.N(j1 + var3 + 1), var4 - 1.0, var6 - 1.0, var8 - 1.0);
      double d8 = class04995.Z(var4);
      double d9 = class04995.Z(var10);
      double d10 = class04995.Z(var8);
      return class04995.N(d8, d9, d10, d0, d1, d2, d3, d4, d5, d6, d7);
   }

   private double N(int var1, int var2, int var3, double var4, double var6, double var8, double[] var10) {
      int ix = this.N(var1);
      int j = this.N(var1 + 1);
      int k = this.N(ix + var2);
      int l = this.N(ix + var2 + 1);
      int i1 = this.N(j + var2);
      int j1 = this.N(j + var2 + 1);
      int k1 = this.N(k + var3);
      int l1 = this.N(i1 + var3);
      int i2 = this.N(l + var3);
      int j2 = this.N(j1 + var3);
      int k2 = this.N(k + var3 + 1);
      int l2 = this.N(i1 + var3 + 1);
      int i3 = this.N(l + var3 + 1);
      int j3 = this.N(j1 + var3 + 1);
      int[] aint = class05022.N[k1 & 15];
      int[] aint1 = class05022.N[l1 & 15];
      int[] aint2 = class05022.N[i2 & 15];
      int[] aint3 = class05022.N[j2 & 15];
      int[] aint4 = class05022.N[k2 & 15];
      int[] aint5 = class05022.N[l2 & 15];
      int[] aint6 = class05022.N[i3 & 15];
      int[] aint7 = class05022.N[j3 & 15];
      double d0 = class05022.N(aint, var4, var6, var8);
      double d1 = class05022.N(aint1, var4 - 1.0, var6, var8);
      double d2 = class05022.N(aint2, var4, var6 - 1.0, var8);
      double d3 = class05022.N(aint3, var4 - 1.0, var6 - 1.0, var8);
      double d4 = class05022.N(aint4, var4, var6, var8 - 1.0);
      double d5 = class05022.N(aint5, var4 - 1.0, var6, var8 - 1.0);
      double d6 = class05022.N(aint6, var4, var6 - 1.0, var8 - 1.0);
      double d7 = class05022.N(aint7, var4 - 1.0, var6 - 1.0, var8 - 1.0);
      double d8 = class04995.Z(var4);
      double d9 = class04995.Z(var6);
      double d10 = class04995.Z(var8);
      double d11 = class04995.N(d8, d9, d10, aint[0], aint1[0], aint2[0], aint3[0], aint4[0], aint5[0], aint6[0], aint7[0]);
      double d12 = class04995.N(d8, d9, d10, aint[1], aint1[1], aint2[1], aint3[1], aint4[1], aint5[1], aint6[1], aint7[1]);
      double d13 = class04995.N(d8, d9, d10, aint[2], aint1[2], aint2[2], aint3[2], aint4[2], aint5[2], aint6[2], aint7[2]);
      double d14 = class04995.N(d9, d10, d1 - d0, d3 - d2, d5 - d4, d7 - d6);
      double d15 = class04995.N(d10, d8, d2 - d0, d6 - d4, d3 - d1, d7 - d5);
      double d16 = class04995.N(d8, d9, d4 - d0, d5 - d1, d6 - d2, d7 - d3);
      double d17 = class04995.z(var4);
      double d18 = class04995.z(var6);
      double d19 = class04995.z(var8);
      double d20 = d11 + d17 * d14;
      double d21 = d12 + d18 * d15;
      double d22 = d13 + d19 * d16;
      var10[0] += d20;
      var10[1] += d21;
      var10[2] += d22;
      return class04995.N(d8, d9, d10, d0, d1, d2, d3, d4, d5, d6, d7);
   }

   public void N(StringBuilder var1) {
      class06038.N(var1, this.N, this.y, this.L, this.i);
   }

   public double N(double var1, double var3, double var5) {
      return this.N(var1, var3, var5, 0.0, 0.0);
   }

   @Deprecated
   public double N(double var1, double var3, double var5, double var7, double var9) {
      double d0 = var1 + this.N;
      double d1 = var3 + this.y;
      double d2 = var5 + this.L;
      int ix = class04995.N(d0);
      int j = class04995.N(d1);
      int k = class04995.N(d2);
      double d3 = d0 - ix;
      double d4 = d1 - j;
      double d5 = d2 - k;
      double d6;
      if (var7 != 0.0) {
         double d7;
         if (var9 >= 0.0 && var9 < d4) {
            d7 = var9;
         } else {
            d7 = d4;
         }

         d6 = class04995.N(d7 / var7 + 1.0E-7F) * var7;
      } else {
         d6 = 0.0;
      }

      return this.N(ix, j, k, d3, d4 - d6, d5, d4);
   }

   public double N(double var1, double var3, double var5, double[] var7) {
      double d0 = var1 + this.N;
      double d1 = var3 + this.y;
      double d2 = var5 + this.L;
      int ix = class04995.N(d0);
      int j = class04995.N(d1);
      int k = class04995.N(d2);
      double d3 = d0 - ix;
      double d4 = d1 - j;
      double d5 = d2 - k;
      return this.N(ix, j, k, d3, d4, d5, var7);
   }

   private static double N(int var0, double var1, double var3, double var5) {
      return class05022.N(class05022.N[var0 & 15], var1, var3, var5);
   }
}
