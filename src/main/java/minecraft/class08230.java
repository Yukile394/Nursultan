package minecraft;

public class class08230 {
   private final class08202 y;
   final class07209 N;

   public class08230(class01296 var1, int var2, int var3, int var4) {
      super();
      int i = class04995.L(var2 * 2 + 1);
      int j = var2 * 16;
      class07209 class07209 = var1.z();
      this.N = var1.U();
      int k = class07209.method_10263() - j;
      int l = k + i * 16 - 1;
      int i1 = i >= var3 ? var4 : class07209.method_10264() - j;
      int j1 = i1 + i * 16 - 1;
      int k1 = class07209.method_10260() - j;
      int l1 = k1 + i * 16 - 1;
      this.y = new class08202(this, new class05163(k, i1, k1, l, j1, l1));
   }

   boolean N(double var1, double var3, double var5, double var7, double var9, double var11, int var13) {
      int i = this.N.method_10263();
      int j = this.N.method_10264();
      int k = this.N.method_10260();
      return i > var1 - var13 && i < var7 + var13 && j > var3 - var13 && j < var9 + var13 && k > var5 - var13 && k < var11 + var13;
   }

   public void N(class08239 var1, class01383 var2, int var3) {
      this.y.N(var1, false, var2, 0, var3, true);
   }

   public boolean N(class03345 var1) {
      return this.y.N(var1);
   }
}
