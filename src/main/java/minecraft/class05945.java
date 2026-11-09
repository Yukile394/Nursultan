package minecraft;

import org.apache.commons.lang3.Validate;

public class class05945 {
   private static final int N = 6;
   private final long[] y;
   private final int L;
   private final long u;
   private final int i;

   public class05945(int var1, int var2) {
      this(var1, var2, new long[class04995.i(var2 * var1, 64) / 64]);
   }

   public class05945(int var1, int var2, long[] var3) {
      super();
      Validate.inclusiveBetween(1L, 32L, var1);
      this.i = var2;
      this.L = var1;
      this.y = var3;
      this.u = (1L << var1) - 1L;
      int ix = class04995.i(var2 * var1, 64) / 64;
      if (var3.length != ix) {
         throw new IllegalArgumentException("Invalid length given for storage, got: " + var3.length + " but expected: " + ix);
      }
   }

   public int y() {
      return this.L;
   }

   public void N(int var1, int var2) {
      Validate.inclusiveBetween(0L, this.i - 1, var1);
      Validate.inclusiveBetween(0L, this.u, var2);
      int ix = var1 * this.L;
      int j = ix >> 6;
      int k = (var1 + 1) * this.L - 1 >> 6;
      int l = ix ^ j << 6;
      this.y[j] = this.y[j] & ~(this.u << l) | (var2 & this.u) << l;
      if (j != k) {
         int i1 = 64 - l;
         int j1 = this.L - i1;
         this.y[k] = this.y[k] >>> j1 << j1 | (var2 & this.u) >> i1;
      }
   }

   public long[] N() {
      return this.y;
   }

   public int N(int var1) {
      Validate.inclusiveBetween(0L, this.i - 1, var1);
      int ix = var1 * this.L;
      int j = ix >> 6;
      int k = (var1 + 1) * this.L - 1 >> 6;
      int l = ix ^ j << 6;
      if (j == k) {
         return (int)(this.y[j] >>> l & this.u);
      } else {
         int i1 = 64 - l;
         return (int)((this.y[j] >>> l | this.y[k] << i1) & this.u);
      }
   }
}
