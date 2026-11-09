package minecraft;

public class class01167<T extends class02910> extends class05848 {
   private final class06143 N;

   protected class01167(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, T var14, class06143 var15) {
      super(var1, var2, var4, var6, var8, var10, var12, var15.method_74304());
      this.field_28786 = 0.96F;
      this.field_28787 = true;
      this.N = var15;
      this.field_3852 *= 0.1F;
      this.field_3869 *= 0.1F;
      this.field_3850 *= 0.1F;
      this.field_17867 = this.field_17867 * (0.75F * var14.L());
      int i = (int)(8.0 / (this.field_3840.U() * 0.8 + 0.2));
      this.field_3847 = (int)Math.max(i * var14.L(), 1.0F);
      this.method_74306(var15);
   }

   protected float N(float var1, float var2) {
      return (this.field_3840.z() * 0.2F + 0.8F) * var1 * var2;
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      this.method_74306(this.N);
   }

   @Override
   public float method_18132(float var1) {
      return this.field_17867 * class04995.N((this.field_3866 + var1) / this.field_3847 * 32.0F, 0.0F, 1.0F);
   }
}
