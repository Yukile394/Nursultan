package minecraft;

public class class03209 extends class05848 {
   public class03209(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      super(var1, var2, var4, var6, var14);
      this.field_3844 = -0.125F;
      this.field_28786 = 0.85F;
      this.method_3080(0.02F, 0.02F);
      this.field_17867 = this.field_17867 * (this.field_3840.z() * 0.6F + 0.2F);
      this.field_3852 = var8 * 0.2F + (this.field_3840.z() * 2.0F - 1.0F) * 0.02F;
      this.field_3869 = var10 * 0.2F + (this.field_3840.z() * 2.0F - 1.0F) * 0.02F;
      this.field_3850 = var12 * 0.2F + (this.field_3840.z() * 2.0F - 1.0F) * 0.02F;
      this.field_3847 = (int)(40.0 / (this.field_3840.z() * 0.8 + 0.2));
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      if (!this.field_3843 && !this.field_3851.method_8316(class07209.method_49637(this.field_3874, this.field_3854, this.field_3871)).N(class01231.N)) {
         this.method_3085();
      }
   }
}
