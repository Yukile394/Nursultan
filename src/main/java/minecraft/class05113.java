package minecraft;

public class class05113 {
   private volatile long N;
   private volatile long y;
   private long L = class07536.L();
   private long u;
   private long i;

   public long L() {
      return this.N;
   }

   public void M() {
      long ix = class07536.L();
      long j = ix - this.L;
      if (j >= 1000L) {
         long k = this.N;
         this.i = 1000L * (k - this.u) / j;
         this.u = k;
         this.L = ix;
      }
   }

   public class05113() {
      super();
   }

   public long B() {
      return this.i;
   }

   public boolean i() {
      return this.N >= this.y;
   }

   public boolean u() {
      return this.N > 0L;
   }

   public void y(long var1) {
      this.N = var1;
   }

   public long y() {
      return this.y;
   }

   public void N(long var1) {
      this.y = var1;
   }

   public void N() {
      this.N = 0L;
      this.L = class07536.L();
      this.u = 0L;
      this.i = 0L;
   }

   public double R() {
      return Math.min((double)this.L() / this.y(), 1.0);
   }
}
