package minecraft;

public class class01843 extends class05848 {
   public class01843(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var14);
      this.field_28786 = 0.7F;
      this.field_3844 = 0.5F;
      this.field_3852 *= 0.1F;
      this.field_3869 *= 0.1F;
      this.field_3850 *= 0.1F;
      this.field_3852 += var8 * 0.4;
      this.field_3869 += var10 * 0.4;
      this.field_3850 += var12 * 0.4;
      float f = this.field_3840.z() * 0.3F + 0.6F;
      this.field_62633 = f;
      this.field_62634 = f;
      this.field_62635 = f;
      this.field_17867 *= 0.75F;
      this.field_3847 = Math.max((int)(6.0 / (this.field_3840.z() * 0.8 + 0.6)), 1);
      this.field_3862 = false;
      this.method_3070();
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      this.field_62634 *= 0.96F;
      this.field_62635 *= 0.9F;
   }

   @Override
   public float method_18132(float var1) {
      return this.field_17867 * class04995.N((this.field_3866 + var1) / this.field_3847 * 32.0F, 0.0F, 1.0F);
   }
}
