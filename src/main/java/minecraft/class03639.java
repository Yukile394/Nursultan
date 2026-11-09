package minecraft;

public class class03639 extends class05848 {
   private final class06143 N;

   public class03639(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06143 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0, var14.method_74304());
      this.N = var14;
      this.field_3852 *= 0.3F;
      this.field_3869 = this.field_3840.z() * 0.2F + 0.1F;
      this.field_3850 *= 0.3F;
      this.method_3080(0.01F, 0.01F);
      this.field_3847 = (int)(8.0 / (this.field_3840.z() * 0.8 + 0.2));
      this.method_74306(var14);
      this.field_3844 = 0.0F;
      this.field_3852 = var8;
      this.field_3869 = var10;
      this.field_3850 = var12;
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
      int i = 60 - this.field_3847;
      if (this.field_3847-- <= 0) {
         this.method_3085();
      } else {
         this.field_3869 = this.field_3869 - this.field_3844;
         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         this.field_3852 *= 0.98F;
         this.field_3869 *= 0.98F;
         this.field_3850 *= 0.98F;
         float f = i * 0.001F;
         this.method_3080(f, f);
         this.method_74307(this.N.method_18138(i % 4, 4));
      }
   }
}
