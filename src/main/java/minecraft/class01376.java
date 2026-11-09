package minecraft;

public final class class01376 implements class01820 {
   private final int N;
   private final class00500[] y;

   public class01376(int var1, class00500[] var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public class00500 N(int var1) {
      int i = var1 - this.N;
      return i >= 0 && i < this.y.length ? this.y[i] : class00869.N.W();
   }

   @Override
   public void N(int var1, class00500 var2) {
      int i = var1 - this.N;
      if (i >= 0 && i < this.y.length) {
         this.y[i] = var2;
      } else {
         throw new IllegalArgumentException("Outside of column height: " + var1);
      }
   }
}
