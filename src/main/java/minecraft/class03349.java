package minecraft;

public class class03349 extends class05848 {
   private static final float N = 0.0025F;
   private static final int y = 300;
   private static final int L = 300;
   private float u = (float)Math.toRadians(this.field_3840.Z() ? -30.0 : 30.0);
   private final float i = (float)Math.toRadians(this.field_3840.Z() ? -5.0 : 5.0);
   private final float R;
   private final boolean M;
   private final boolean B;
   private final double Z;
   private final double z;
   private final double U;

   protected class03349(
      class03448 var1, double var2, double var4, double var6, class08388 var8, float var9, float var10, boolean var11, boolean var12, float var13, float var14
   ) {
      super(var1, var2, var4, var6, var8);
      this.R = var10;
      this.M = var11;
      this.B = var12;
      this.field_3847 = 300;
      this.field_3844 = var9 * 1.2F * 0.0025F;
      float f = var13 * (this.field_3840.Z() ? 0.05F : 0.075F);
      this.field_17867 = f;
      this.method_3080(f, f);
      this.field_28786 = 1.0F;
      this.field_3869 = -var14;
      float f1 = this.field_3840.z();
      this.Z = Math.cos(Math.toRadians(f1 * 60.0F)) * this.R;
      this.z = Math.sin(Math.toRadians(f1 * 60.0F)) * this.R;
      this.U = Math.toRadians(1000.0F + f1 * 3000.0F);
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
      if (this.field_3847-- <= 0) {
         this.method_3085();
      }

      if (!this.field_3843) {
         float f = Math.min((300 - this.field_3847) / 300.0F, 1.0F);
         double d0 = 0.0;
         double d1 = 0.0;
         if (this.B) {
            d0 += this.Z * Math.pow(f, 1.25);
            d1 += this.z * Math.pow(f, 1.25);
         }

         if (this.M) {
            d0 += f * Math.cos(f * this.U) * this.R;
            d1 += f * Math.sin(f * this.U) * this.R;
         }

         this.field_3852 += d0 * 0.0025F;
         this.field_3850 += d1 * 0.0025F;
         this.field_3869 = this.field_3869 - this.field_3844;
         this.u = this.u + this.i / 20.0F;
         this.field_62638 = this.field_62637;
         this.field_62637 = this.field_62637 + this.u / 20.0F;
         this.method_3069(this.field_3852, this.field_3869, this.field_3850);
         if (this.field_3845 || this.field_3847 < 299 && (this.field_3852 == 0.0 || this.field_3850 == 0.0)) {
            this.method_3085();
         }

         if (!this.field_3843) {
            this.field_3852 = this.field_3852 * this.field_28786;
            this.field_3869 = this.field_3869 * this.field_28786;
            this.field_3850 = this.field_3850 * this.field_28786;
         }
      }
   }
}
