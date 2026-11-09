package minecraft;

class class05861 implements class00947 {
   final int N;
   final int y;
   final float L;
   final float u;
   private final class05247 M;
   final int i;

   class05861(class05852 var1, float var2, float var3, int var4, int var5, float var6, int var7) {
      super();
      this.R = var1;
      this.N = var4;
      this.y = var5;
      this.M = class05247.N(var6 / var1.N);
      this.L = var2 / var1.N;
      this.u = var3 / var1.N;
      this.i = var7;
   }

   @Override
   public class05247 N() {
      return this.M;
   }

   @Override
   public class07948 N(class00912 var1) {
      return var1.N(this.M, new class05840(this));
   }
}
