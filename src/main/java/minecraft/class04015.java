package minecraft;

public class class04015 extends class04404 {
   class04015(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, int var14, class06143 var15) {
      super(var1, var2, var4, var6, var15, 0.0F);
      this.field_28786 = 0.92F;
      this.field_17867 = 0.5F;
      this.method_74308(1.0F);
      this.method_74305(class02566.m(var14), class02566.P(var14), class02566.s(var14));
      this.field_3847 = (int)(this.field_17867 * 12.0F / (this.field_3840.z() * 0.8F + 0.2F));
      this.method_74306(var15);
      this.field_3862 = false;
      this.field_3852 = var8;
      this.field_3869 = var10;
      this.field_3850 = var12;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      if (!this.field_3843) {
         this.method_74306(this.N);
         if (this.field_3866 > this.field_3847 / 2) {
            this.method_74308(1.0F - ((float)this.field_3866 - this.field_3847 / 2) / this.field_3847);
         }

         if (this.field_3851.method_8320(class07209.method_49637(this.field_3874, this.field_3854, this.field_3871)).P()) {
            this.field_3869 -= 0.0074F;
         }
      }
   }
}
