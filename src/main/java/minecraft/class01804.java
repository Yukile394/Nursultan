package minecraft;

public class class01804 extends class05848 {
   private final class06143 N;
   private static final int y = 8;

   protected class01804(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14, class06143 var15) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var15.method_74304());
      this.N = var15;
      this.field_28786 = 0.96F;
      this.field_3844 = -0.1F;
      this.field_28787 = true;
      this.field_3852 *= 0.0;
      this.field_3869 *= 0.9;
      this.field_3850 *= 0.0;
      this.field_3852 += var8;
      this.field_3869 += var10;
      this.field_3850 += var12;
      this.field_17867 *= 0.75F * var14;
      this.field_3847 = (int)(8.0F / class04995.y(this.field_3840, 0.5F, 1.0F) * var14);
      this.field_3847 = Math.max(this.field_3847, 1);
      this.method_74306(var15);
      this.field_3862 = true;
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public class05863 method_55245() {
      return class05863.y;
   }

   @Override
   public int method_3068(float var1) {
      return 240;
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
