package minecraft;

public class class05860 extends class05848 {
   class05860(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, boolean var14, class08388 var15) {
      super(var1, var2, var4, var6, var15);
      this.method_3087(3.0F);
      this.method_3080(0.25F, 0.25F);
      if (var14) {
         this.field_3847 = this.field_3840.y(50) + 280;
      } else {
         this.field_3847 = this.field_3840.y(50) + 80;
      }

      this.field_3844 = 3.0E-6F;
      this.field_3852 = var8;
      this.field_3869 = var10 + this.field_3840.z() / 500.0F;
      this.field_3850 = var12;
   }

   @Override
   public class05846 method_74255() {
      return class05846.u;
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3866++ < this.field_3847 && !(this.field_62636 <= 0.0F)) {
         this.field_3852 = this.field_3852 + this.field_3840.z() / 5000.0F * (this.field_3840.Z() ? 1 : -1);
         this.field_3850 = this.field_3850 + this.field_3840.z() / 5000.0F * (this.field_3840.Z() ? 1 : -1);
         this.field_3869 = this.field_3869 - this.field_3844;
         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         if (this.field_3866 >= this.field_3847 - 60 && this.field_62636 > 0.01F) {
            this.field_62636 -= 0.015F;
         }
      } else {
         this.method_3085();
      }
   }
}
