package minecraft;

public abstract class class01342 extends class05848 {
   protected class01342(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
      this.field_28786 = 0.96F;
      this.field_3852 = this.field_3852 * 0.01F + var8;
      this.field_3869 = this.field_3869 * 0.01F + var10;
      this.field_3850 = this.field_3850 * 0.01F + var12;
      this.field_3874 = this.field_3874 + (this.field_3840.z() - this.field_3840.z()) * 0.05F;
      this.field_3854 = this.field_3854 + (this.field_3840.z() - this.field_3840.z()) * 0.05F;
      this.field_3871 = this.field_3871 + (this.field_3840.z() - this.field_3840.z()) * 0.05F;
      this.field_3847 = (int)(8.0 / (this.field_3840.z() * 0.8 + 0.2)) + 4;
   }
}
