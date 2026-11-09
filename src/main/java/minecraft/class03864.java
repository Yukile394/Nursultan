package minecraft;

public class class03864 extends class05848 {
   public class03864(class03448 var1, double var2, double var4, double var6, class08388 var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var8);
      this.field_3844 = 0.75F;
      this.field_28786 = 0.999F;
      this.field_3852 *= 0.8F;
      this.field_3869 *= 0.8F;
      this.field_3850 *= 0.8F;
      this.field_3869 = this.field_3840.z() * 0.4F + 0.05F;
      this.field_17867 = this.field_17867 * (this.field_3840.z() * 2.0F + 0.2F);
      this.field_3847 = (int)(16.0 / (this.field_3840.z() * 0.8 + 0.2));
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public int method_3068(float var1) {
      int i = super.method_3068(var1);
      short short1 = 240;
      int j = i >> 16 & 0xFF;
      return 240 | j << 16;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      if (!this.field_3843) {
         float f = (float)this.field_3866 / this.field_3847;
         if (this.field_3840.z() > f) {
            this.field_3851.method_8406(class07107.NZ, this.field_3874, this.field_3854, this.field_3871, this.field_3852, this.field_3869, this.field_3850);
         }
      }
   }

   @Override
   public float method_18132(float var1) {
      float f = (this.field_3866 + var1) / this.field_3847;
      return this.field_17867 * (1.0F - f * f);
   }
}
