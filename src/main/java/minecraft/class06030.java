package minecraft;

public class class06030 {
   private final long[] N;
   private int y;
   private int L;

   public class06030(int var1) {
      super();
      this.N = new long[var1];
   }

   public long N(long var1) {
      if (this.y < this.N.length) {
         this.y++;
      }

      this.N[this.L] = var1;
      this.L = (this.L + 1) % this.N.length;
      long i = Long.MAX_VALUE;
      long j = Long.MIN_VALUE;
      long k = 0L;

      for (int l = 0; l < this.y; l++) {
         long i1 = this.N[l];
         k += i1;
         i = Math.min(i, i1);
         j = Math.max(j, i1);
      }

      if (this.y > 2) {
         k -= i + j;
         return k / (this.y - 2);
      } else {
         return k > 0L ? this.y / k : 0L;
      }
   }
}
