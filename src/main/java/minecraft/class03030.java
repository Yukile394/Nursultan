package minecraft;

public class class03030 extends class05848 {
   private final class06143 N;

   public class03030(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06143 var14) {
      super(var1, var2, var4, var6, var14.method_74304());
      this.field_3844 = -0.1F;
      this.field_28786 = 0.9F;
      this.N = var14;
      this.field_3852 = var8 + (this.field_3840.z() * 2.0F - 1.0F) * 0.05F;
      this.field_3869 = var10 + (this.field_3840.z() * 2.0F - 1.0F) * 0.05F;
      this.field_3850 = var12 + (this.field_3840.z() * 2.0F - 1.0F) * 0.05F;
      float f = this.field_3840.z() * 0.3F + 0.7F;
      this.field_62633 = f;
      this.field_62634 = f;
      this.field_62635 = f;
      this.field_17867 = 0.1F * (this.field_3840.z() * this.field_3840.z() * 6.0F + 1.0F);
      this.field_3847 = (int)(16.0 / (this.field_3840.z() * 0.8 + 0.2)) + 2;
      this.method_74306(var14);
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public void method_3070() {
      super.method_3070();
      this.method_74306(this.N);
   }
}
