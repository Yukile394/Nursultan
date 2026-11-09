package minecraft;

public class class08395 extends class05848 {
   private static final float N = 0.3F;
   private static final float y = 0.1F;
   private static final float L = 0.5F;
   private static final float u = 0.3F;
   private static final int i = 200;
   private static final int R = 300;

   public class08395(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
      this.field_28787 = true;
      this.field_28786 = 0.96F;
      this.field_17867 *= 0.75F;
      this.field_3869 *= 0.8F;
      this.field_3852 *= 0.8F;
      this.field_3850 *= 0.8F;
   }

   private float N(float var1) {
      return class04995.N(var1 / this.field_3847, 0.0F, 1.0F);
   }

   private static float N(float var0, float var1, float var2) {
      if (var0 >= 1.0F - var1) {
         return (1.0F - var0) / var1;
      } else {
         return var0 <= var2 ? var0 / var2 : 1.0F;
      }
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public int method_3068(float var1) {
      return (int)(255.0F * N(this.N(this.field_3866 + var1), 0.1F, 0.3F));
   }

   @Override
   public void method_3070() {
      super.method_3070();
      if (!this.field_3851.method_8320(class07209.method_49637(this.field_3874, this.field_3854, this.field_3871)).P()) {
         this.method_3085();
      } else {
         this.method_74308(N(this.N(this.field_3866), 0.3F, 0.5F));
         if (this.field_3840.z() > 0.95F || this.field_3866 == 1) {
            this.method_34753(-0.05F + 0.1F * this.field_3840.z(), -0.05F + 0.1F * this.field_3840.z(), -0.05F + 0.1F * this.field_3840.z());
         }
      }
   }
}
