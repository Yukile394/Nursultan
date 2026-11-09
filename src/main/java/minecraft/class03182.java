package minecraft;

public class class03182 extends class05848 {
   private final float N;
   private final class06143 y;

   public class03182(class03448 var1, double var2, double var4, double var6, float var8, float var9, float var10, class06143 var11) {
      super(var1, var2, var4, var6, var11.method_74304());
      this.y = var11;
      this.field_62633 = var8;
      this.field_62634 = var9;
      this.field_62635 = var10;
      float f = 0.9F;
      this.field_17867 *= 0.67499995F;
      int i = (int)(32.0 / (this.field_3840.z() * 0.8 + 0.2));
      this.field_3847 = (int)Math.max(i * 0.9F, 1.0F);
      this.method_74306(var11);
      this.N = (this.field_3840.z() - 0.5F) * 0.1F;
      this.field_62637 = this.field_3840.z() * (float) (Math.PI * 2);
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
         this.method_74306(this.y);
         this.field_62638 = this.field_62637;
         this.field_62637 = this.field_62637 + (float) Math.PI * this.N * 2.0F;
         if (this.field_3845) {
            this.field_62638 = this.field_62637 = 0.0F;
         }

         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         this.field_3869 -= 0.003F;
         this.field_3869 = Math.max(this.field_3869, -0.14F);
      }
   }

   @Override
   public float method_18132(float var1) {
      return this.field_17867 * class04995.N((this.field_3866 + var1) / this.field_3847 * 32.0F, 0.0F, 1.0F);
   }
}
