package minecraft;

public class class04418 extends class05848 {
   private final class06143 N;

   public class04418(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06143 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var14.method_74304());
      this.field_28786 = 0.96F;
      this.N = var14;
      float f = 2.5F;
      this.field_3852 *= 0.1F;
      this.field_3869 *= 0.1F;
      this.field_3850 *= 0.1F;
      this.field_3852 += var8;
      this.field_3869 += var10;
      this.field_3850 += var12;
      float f1 = 1.0F - this.field_3840.z() * 0.3F;
      this.field_62633 = f1;
      this.field_62634 = f1;
      this.field_62635 = f1;
      this.field_17867 *= 1.875F;
      int i = (int)(8.0 / (this.field_3840.z() * 0.8 + 0.3));
      this.field_3847 = (int)Math.max(i * 2.5F, 1.0F);
      this.field_3862 = false;
      this.method_74306(var14);
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      if (!this.field_3843) {
         this.method_74306(this.N);
         class08036 class08036 = this.field_3851.N(this.field_3874, this.field_3854, this.field_3871, 2.0, false);
         if (class08036 != null) {
            double d0 = class08036.method_23318();
            if (this.field_3854 > d0) {
               this.field_3854 = this.field_3854 + (d0 - this.field_3854) * 0.2;
               this.field_3869 = this.field_3869 + (class08036.method_18798().B - this.field_3869) * 0.2;
               this.method_3063(this.field_3874, this.field_3854, this.field_3871);
            }
         }
      }
   }

   @Override
   public float method_18132(float var1) {
      return this.field_17867 * class04995.N((this.field_3866 + var1) / this.field_3847 * 32.0F, 0.0F, 1.0F);
   }
}
