package minecraft;

public class class03183 extends class05848 {
   public class03183(class03448 var1, double var2, double var4, double var6, class08388 var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var8);
      this.field_28787 = true;
      this.field_28786 = 0.86F;
      this.field_3852 *= 0.01F;
      this.field_3869 *= 0.01F;
      this.field_3850 *= 0.01F;
      this.field_3869 += 0.1;
      this.field_17867 *= 1.5F;
      this.field_3847 = 16;
      this.field_3862 = false;
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public float method_18132(float var1) {
      return this.field_17867 * class04995.N((this.field_3866 + var1) / this.field_3847 * 32.0F, 0.0F, 1.0F);
   }
}
