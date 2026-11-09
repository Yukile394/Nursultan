package minecraft;

public class class05777 {
   private static final int N = 40;
   private static final int y = 80;
   private static final int L = 400;
   private final class06069 u;
   private long i;
   private long R;
   private int M;

   public boolean L(long var1) {
      return var1 >= this.R;
   }

   class05777(class06069 var1, long var2) {
      super();
      this.u = var1;
      this.N(var2);
   }

   @Override
   public String toString() {
      return "RetryMarker{, previousAttemptAt=" + this.i + ", nextScheduledAttemptAt=" + this.R + ", currentDelay=" + this.M + "}";
   }

   public boolean y(long var1) {
      return var1 - this.i < 400L;
   }

   public void N(long var1) {
      this.i = var1;
      int ix = this.M + this.u.y(40) + 40;
      this.M = Math.min(ix, 400);
      this.R = var1 + this.M;
   }
}
