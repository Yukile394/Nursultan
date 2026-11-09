package minecraft;

public class class03533 extends class01342 {
   public class03533(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public void method_3069(double var1, double var3, double var5) {
      this.method_3067(this.method_3064().u(var1, var3, var5));
      this.method_3072();
   }

   @Override
   public int method_3068(float var1) {
      float f = (this.field_3866 + var1) / this.field_3847;
      f = class04995.N(f, 0.0F, 1.0F);
      int i = super.method_3068(var1);
      int j = i & 0xFF;
      int k = i >> 16 & 0xFF;
      j += (int)(f * 15.0F * 16.0F);
      if (j > 240) {
         j = 240;
      }

      return j | k << 16;
   }

   @Override
   public float method_18132(float var1) {
      float f = (this.field_3866 + var1) / this.field_3847;
      return this.field_17867 * (1.0F - f * f * 0.5F);
   }
}
