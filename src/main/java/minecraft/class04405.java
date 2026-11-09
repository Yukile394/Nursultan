package minecraft;

public class class04405 extends class05848 {
   class04405(class03448 var1, double var2, double var4, double var6, double var8, class08388 var10) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var10);
      this.field_28786 = 0.66F;
      this.field_28787 = true;
      this.field_3852 *= 0.01F;
      this.field_3869 *= 0.01F;
      this.field_3850 *= 0.01F;
      this.field_3869 += 0.2;
      this.field_62633 = Math.max(0.0F, class04995.m(((float)var8 + 0.0F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.field_62634 = Math.max(0.0F, class04995.m(((float)var8 + 0.33333334F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.field_62635 = Math.max(0.0F, class04995.m(((float)var8 + 0.6666667F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.field_17867 *= 1.5F;
      this.field_3847 = 6;
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
