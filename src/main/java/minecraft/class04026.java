package minecraft;

public class class04026 extends class05848 {
   private final double N;
   private final double y;
   private final double L;
   private final boolean u;
   private final class04395 i;

   public class04026(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      this(var1, var2, var4, var6, var8, var10, var12, false, class04395.N, var14);
   }

   class04026(
      class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, boolean var14, class04395 var15, class08388 var16
   ) {
      super(var1, var2, var4, var6, var16);
      this.u = var14;
      this.i = var15;
      this.method_74308(var15.y());
      this.field_3852 = var8;
      this.field_3869 = var10;
      this.field_3850 = var12;
      this.N = var2;
      this.y = var4;
      this.L = var6;
      this.field_3858 = var2 + var8;
      this.field_3838 = var4 + var10;
      this.field_3856 = var6 + var12;
      this.field_3874 = this.field_3858;
      this.field_3854 = this.field_3838;
      this.field_3871 = this.field_3856;
      this.field_17867 = 0.1F * (this.field_3840.z() * 0.5F + 0.2F);
      float f = this.field_3840.z() * 0.6F + 0.4F;
      this.field_62633 = 0.9F * f;
      this.field_62634 = 0.9F * f;
      this.field_62635 = f;
      this.field_3862 = false;
      this.field_3847 = (int)(this.field_3840.z() * 10.0F) + 30;
   }

   @Override
   public class05846 method_74255() {
      return this.i.N() ? class05846.L : class05846.u;
   }

   @Override
   public void method_3074(class00965 var1, class05363 var2, float var3) {
      this.method_74308(this.i.N(this.field_3866, this.field_3847, var3));
      super.method_3074(var1, var2, var3);
   }

   @Override
   public void method_3069(double var1, double var3, double var5) {
      this.method_3067(this.method_3064().u(var1, var3, var5));
      this.method_3072();
   }

   @Override
   public int method_3068(float var1) {
      if (this.u) {
         return 240;
      } else {
         int ix = super.method_3068(var1);
         float f = (float)this.field_3866 / this.field_3847;
         f *= f;
         f *= f;
         int j = ix & 0xFF;
         int k = ix >> 16 & 0xFF;
         k += (int)(f * 15.0F * 16.0F);
         if (k > 240) {
            k = 240;
         }

         return j | k << 16;
      }
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3866++ >= this.field_3847) {
         this.method_3085();
      } else {
         float f = (float)this.field_3866 / this.field_3847;
         f = 1.0F - f;
         float f1 = 1.0F - f;
         f1 *= f1;
         f1 *= f1;
         this.field_3874 = this.N + this.field_3852 * f;
         this.field_3854 = this.y + this.field_3869 * f - f1 * 1.2F;
         this.field_3871 = this.L + this.field_3850 * f;
      }
   }
}
