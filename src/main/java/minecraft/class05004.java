package minecraft;

class class05004 {
   private static final long N = 20L;
   private static final long y = 20L;
   private static final long L = 10L;
   private int u;
   private int i;
   private long R;
   private long M;

   public class05004(int var1) {
      super();
      this.i = var1;
      this.u = var1;
   }

   public boolean N(long var1) {
      return this.M > var1 && (this.M - var1) % 6L >= 3L;
   }

   public int N() {
      return this.i;
   }

   public void N(int var1, long var2) {
      if (var1 != this.u) {
         long ix = var1 < this.u ? 20L : 10L;
         this.M = var2 + ix;
         this.u = var1;
         this.R = var2;
      }

      if (var2 - this.R > 20L) {
         this.i = var1;
      }
   }
}
