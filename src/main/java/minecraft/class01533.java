package minecraft;

public abstract class class01533 extends class05848 {
   private final class06143 N;

   protected class01533(
      class03448 var1,
      double var2,
      double var4,
      double var6,
      float var8,
      float var9,
      float var10,
      double var11,
      double var13,
      double var15,
      float var17,
      class06143 var18,
      float var19,
      int var20,
      float var21,
      boolean var22
   ) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var18.method_74304());
      this.field_28786 = 0.96F;
      this.field_3844 = var21;
      this.field_28787 = true;
      this.N = var18;
      this.field_3852 *= var8;
      this.field_3869 *= var9;
      this.field_3850 *= var10;
      this.field_3852 += var11;
      this.field_3869 += var13;
      this.field_3850 += var15;
      float f = this.field_3840.z() * var19;
      this.field_62633 = f;
      this.field_62634 = f;
      this.field_62635 = f;
      this.field_17867 *= 0.75F * var17;
      this.field_3847 = (int)(var20 / (this.field_3840.z() * 0.8 + 0.2) * var17);
      this.field_3847 = Math.max(this.field_3847, 1);
      this.method_74306(var18);
      this.field_3862 = var22;
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
