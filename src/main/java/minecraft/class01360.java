package minecraft;

public class class01360 extends class04416 {
   public class01360(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
      this.field_17867 *= 1.5F;
      this.field_3847 = (int)(this.field_3840.z() * 2.0F) + 60;
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3866++ >= this.field_3847) {
         this.method_3085();
      } else {
         float f = (float)this.field_3866 / this.field_3847;
         this.field_3874 = this.field_3874 + this.field_3852 * f;
         this.field_3854 = this.field_3854 + this.field_3869 * f;
         this.field_3871 = this.field_3871 + this.field_3850 * f;
      }
   }

   @Override
   public float method_18132(float var1) {
      float f = 1.0F - (this.field_3866 + var1) / (this.field_3847 * 1.5F);
      return this.field_17867 * f;
   }
}
