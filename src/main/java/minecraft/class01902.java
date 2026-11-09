package minecraft;

public class class01902 extends class05848 {
   class01902(class03448 var1, double var2, double var4, double var6, class08388 var8) {
      super(var1, var2, var4 - 0.125, var6, var8);
      this.method_3080(0.01F, 0.01F);
      this.field_17867 = this.field_17867 * (this.field_3840.z() * 0.6F + 0.2F);
      this.field_3847 = (int)(16.0 / (this.field_3840.z() * 0.8 + 0.2));
      this.field_3862 = false;
      this.field_28786 = 1.0F;
      this.field_3844 = 0.0F;
   }

   class01902(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      super(var1, var2, var4 - 0.125, var6, var8, var10, var12, var14);
      this.method_3080(0.01F, 0.01F);
      this.field_17867 = this.field_17867 * (this.field_3840.z() * 0.6F + 0.6F);
      this.field_3847 = (int)(16.0 / (this.field_3840.z() * 0.8 + 0.2));
      this.field_3862 = false;
      this.field_28786 = 1.0F;
      this.field_3844 = 0.0F;
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }
}
