package minecraft;

public abstract class class01669 {
   protected static final int N = 60;
   protected static final int y = 1;
   protected final class01590 L;
   protected final class02276 u;

   protected void L(class01054 var1, int var2, int var3, int var4) {
   }

   protected class01669(class01590 var1, class02276 var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   protected void u(class01054 var1, int var2, int var3, int var4) {
   }

   protected void y(class01054 var1, int var2, int var3, int var4) {
      long i = this.u.N(var4);
      int j = this.y((double)i);
      int k = this.N(i);
      var1.N(var3, var2 - j, var3 + 1, var2, k);
   }

   protected long y(int var1) {
      return this.u.N(var1);
   }

   protected abstract int y(double var1);

   protected abstract String N(double var1);

   public int N(int var1) {
      return Math.min(this.u.L() + 2, var1);
   }

   protected abstract int N(long var1);

   protected int N(double var1, double var3, int var5, double var6, int var8, double var9, int var11) {
      var1 = class04995.N(var1, var3, var9);
      return var1 < var6 ? class02566.N((float)((var1 - var3) / (var6 - var3)), var5, var8) : class02566.N((float)((var1 - var6) / (var9 - var6)), var8, var11);
   }

   protected void N(class01054 var1, int var2, int var3, int var4) {
      this.y(var1, var2, var3, var4);
      this.L(var1, var2, var3, var4);
   }

   public void N(class01054 var1, int var2, int var3) {
      int i = var1.y();
      var1.N(var2, i - 60, var2 + var3, i, -1873784752);
      long j = 0L;
      long k = 2147483647L;
      long l = -2147483648L;
      int i1 = Math.max(0, this.u.L() - (var3 - 2));
      int j1 = this.u.u() - i1;

      for (int k1 = 0; k1 < j1; k1++) {
         int l1 = var2 + k1 + 1;
         int i2 = i1 + k1;
         long j2 = this.y(i2);
         k = Math.min(k, j2);
         l = Math.max(l, j2);
         j += j2;
         this.N(var1, i, l1, i2);
      }

      var1.N(var2, var2 + var3 - 1, i - 60, -1);
      var1.N(var2, var2 + var3 - 1, i - 1, -1);
      var1.y(var2, i - 60, i, -1);
      var1.y(var2 + var3 - 1, i - 60, i, -1);
      if (j1 > 0) {
         String s = this.N((double)k) + " min";
         String s1 = this.N((double)j / j1) + " avg";
         String s2 = this.N((double)l) + " max";
         var1.y(this.L, s, var2 + 2, i - 60 - 9, -2039584);
         var1.N(this.L, s1, var2 + var3 / 2, i - 60 - 9, -2039584);
         var1.y(this.L, s2, var2 + var3 - this.L.y(s2) - 2, i - 60 - 9, -2039584);
      }

      this.u(var1, var2, var3, i);
   }

   public int N() {
      return 60 + 9;
   }

   protected void N(class01054 var1, String var2, int var3, int var4) {
      var1.N(var3, var4, var3 + this.L.y(var2) + 1, var4 + 9, -1873784752);
      var1.N(this.L, var2, var3 + 1, var4 + 1, -2039584, false);
   }
}
