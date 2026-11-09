package minecraft;

public class class04044 extends class05848 {
   private static final int N = 11993298;
   private static final int y = 14614777;
   private static final float L = 0.7176471F;
   private static final float u = 0.0F;
   private static final float i = 0.8235294F;
   private static final float R = 0.8745098F;
   private static final float M = 0.0F;
   private static final float B = 0.9764706F;
   private boolean Z;
   private final class06143 z;

   class04044(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06143 var14) {
      super(var1, var2, var4, var6, var14.method_74304());
      this.field_28786 = 0.96F;
      this.field_3852 = var8;
      this.field_3869 = var10;
      this.field_3850 = var12;
      this.field_62633 = class04995.N(this.field_3840, 0.7176471F, 0.8745098F);
      this.field_62634 = class04995.N(this.field_3840, 0.0F, 0.0F);
      this.field_62635 = class04995.N(this.field_3840, 0.8235294F, 0.9764706F);
      this.field_17867 *= 0.75F;
      this.field_3847 = (int)(20.0 / (this.field_3840.z() * 0.8 + 0.2));
      this.Z = false;
      this.field_3862 = false;
      this.z = var14;
      this.method_74306(var14);
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3866++ >= this.field_3847) {
         this.method_3085();
      } else {
         this.method_74306(this.z);
         if (this.field_3845) {
            this.field_3869 = 0.0;
            this.Z = true;
         }

         if (this.Z) {
            this.field_3869 += 0.002;
         }

         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         if (this.field_3854 == this.field_3838) {
            this.field_3852 *= 1.1;
            this.field_3850 *= 1.1;
         }

         this.field_3852 = this.field_3852 * this.field_28786;
         this.field_3850 = this.field_3850 * this.field_28786;
         if (this.Z) {
            this.field_3869 = this.field_3869 * this.field_28786;
         }
      }
   }

   @Override
   public float method_18132(float var1) {
      return this.field_17867 * class04995.N((this.field_3866 + var1) / this.field_3847 * 32.0F, 0.0F, 1.0F);
   }
}
