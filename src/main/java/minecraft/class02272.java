package minecraft;

public abstract class class02272 implements class01675 {
   protected final long[] N;
   protected final long[] y;

   protected class02272(int var1, long[] var2) {
      super();
      if (var2.length != var1) {
         throw new IllegalArgumentException("defaults have incorrect length of " + var2.length);
      } else {
         this.y = new long[var1];
         this.N = var2;
      }
   }

   protected void y() {
      System.arraycopy(this.N, 0, this.y, 0, this.N.length);
   }

   @Override
   public void N(long var1, int var3) {
      if (var3 >= 1 && var3 < this.y.length) {
         this.y[var3] = var1;
      } else {
         throw new IndexOutOfBoundsException(var3 + " out of bounds for dimensions " + this.y.length);
      }
   }

   protected abstract void N();

   @Override
   public void N(long[] var1) {
      System.arraycopy(var1, 0, this.y, 0, var1.length);
      this.N();
      this.y();
   }

   @Override
   public void N(long var1) {
      this.y[0] = var1;
      this.N();
      this.y();
   }
}
