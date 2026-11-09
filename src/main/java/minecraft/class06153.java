package minecraft;

public class class06153 {
   public static final int N = 0;
   public static final int y = 1;
   public static final int L = 2;
   public static final int u = 3;
   private final int i;
   private final int R;
   private final int M;
   private final int B;
   private final int Z;
   private final int z;
   private final int U;
   private int E;
   private int W;
   private int m;
   private int P;

   public int L() {
      return this.R + this.m;
   }

   public class06153(int var1, int var2, int var3, int var4, int var5, int var6) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var3;
      this.B = var4 - var1 + 1;
      this.Z = var5 - var2 + 1;
      this.z = var6 - var3 + 1;
      this.U = this.B * this.Z * this.z;
   }

   public int i() {
      int ix = 0;
      if (this.W == 0 || this.W == this.B - 1) {
         ix++;
      }

      if (this.m == 0 || this.m == this.Z - 1) {
         ix++;
      }

      if (this.P == 0 || this.P == this.z - 1) {
         ix++;
      }

      return ix;
   }

   public int u() {
      return this.M + this.P;
   }

   public int y() {
      return this.i + this.W;
   }

   public boolean N() {
      if (this.E == this.U) {
         return false;
      } else {
         this.W = this.E % this.B;
         int ix = this.E / this.B;
         this.m = ix % this.Z;
         this.P = ix / this.Z;
         this.E++;
         return true;
      }
   }
}
