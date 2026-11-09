package minecraft;

public interface class08535 {
   static int N(double var0, double var2, int[] var4, int var5) {
      var2 *= var0;
      int i = (int)((1.0 - var0) * 255.0);
      int j = (int)((1.0 - var2) * 255.0) << 8 | i;
      return j >= var4.length ? var5 : var4[j];
   }
}
