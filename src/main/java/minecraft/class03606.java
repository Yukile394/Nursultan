package minecraft;

class class03606 extends class03608 {
   private class01894 N;
   private final int y;
   private final int L;

   public class03606(int var1, int var2, int var3, int var4, class01894 var5, int var6, int var7) {
      super(var1, var2, var3, var4);
      this.N = var5;
      this.y = var6;
      this.L = var7;
   }

   @Override
   public void N(class01894 var1) {
      this.N = var1;
   }

   @Override
   protected void method_48579(class01054 var1, int var2, int var3, float var4) {
      var1.N(class08394.Na, this.N, this.method_46426(), this.method_46427(), 0.0F, 0.0F, this.method_25368(), this.method_25364(), this.y, this.L);
   }
}
