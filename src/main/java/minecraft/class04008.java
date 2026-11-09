package minecraft;

public class class04008 extends class05848 {
   public class04008(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
      float f = this.field_3840.z() * 0.1F + 0.2F;
      this.field_62633 = f;
      this.field_62634 = f;
      this.field_62635 = f;
      this.method_3080(0.02F, 0.02F);
      this.field_17867 = this.field_17867 * (this.field_3840.z() * 0.6F + 0.5F);
      this.field_3852 *= 0.02F;
      this.field_3869 *= 0.02F;
      this.field_3850 *= 0.02F;
      this.field_3847 = (int)(20.0 / (this.field_3840.z() * 0.8 + 0.2));
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public void method_3069(double var1, double var3, double var5) {
      this.method_3067(this.method_3064().u(var1, var3, var5));
      this.method_3072();
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3847-- <= 0) {
         this.method_3085();
      } else {
         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         this.field_3852 *= 0.99;
         this.field_3869 *= 0.99;
         this.field_3850 *= 0.99;
      }
   }
}
