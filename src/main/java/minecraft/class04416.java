package minecraft;

public class class04416 extends class05848 {
   private final double N;
   private final double y;
   private final double L;

   public class04416(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      super(var1, var2, var4, var6, var14);
      this.field_3852 = var8;
      this.field_3869 = var10;
      this.field_3850 = var12;
      this.field_3874 = var2;
      this.field_3854 = var4;
      this.field_3871 = var6;
      this.N = this.field_3874;
      this.y = this.field_3854;
      this.L = this.field_3871;
      this.field_17867 = 0.1F * (this.field_3840.z() * 0.2F + 0.5F);
      float f = this.field_3840.z() * 0.6F + 0.4F;
      this.field_62633 = f * 0.9F;
      this.field_62634 = f * 0.3F;
      this.field_62635 = f;
      this.field_3847 = (int)(this.field_3840.z() * 10.0F) + 40;
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
      int i = super.method_3068(var1);
      float f = (float)this.field_3866 / this.field_3847;
      f *= f;
      f *= f;
      int j = i & 0xFF;
      int k = i >> 16 & 0xFF;
      k += (int)(f * 15.0F * 16.0F);
      if (k > 240) {
         k = 240;
      }

      return j | k << 16;
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3866++ >= this.field_3847) {
         this.method_3085();
      } else {
         float f = (float)this.field_3866 / this.field_3847;
         float f1 = -f + f * f * 2.0F;
         float f2 = 1.0F - f1;
         this.field_3874 = this.N + this.field_3852 * f2;
         this.field_3854 = this.y + this.field_3869 * f2 + (1.0F - f);
         this.field_3871 = this.L + this.field_3850 * f2;
      }
   }

   @Override
   public float method_18132(float var1) {
      float f = (this.field_3866 + var1) / this.field_3847;
      f = 1.0F - f;
      f *= f;
      f = 1.0F - f;
      return this.field_17867 * f;
   }
}
