package minecraft;

public class class03650 extends class04404 {
   public class03650(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06143 var14) {
      super(var1, var2, var4, var6, var14, 1.25F);
      this.field_28786 = 0.6F;
      this.field_3852 = var8;
      this.field_3869 = var10;
      this.field_3850 = var12;
      this.field_17867 *= 0.75F;
      this.field_3847 = 60 + this.field_3840.y(12);
      this.method_74306(var14);
      if (this.field_3840.y(4) == 0) {
         this.method_74305(0.6F + this.field_3840.z() * 0.2F, 0.6F + this.field_3840.z() * 0.3F, this.field_3840.z() * 0.2F);
      } else {
         this.method_74305(0.1F + this.field_3840.z() * 0.2F, 0.4F + this.field_3840.z() * 0.3F, this.field_3840.z() * 0.2F);
      }
   }
}
