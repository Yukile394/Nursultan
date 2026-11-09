package minecraft;

public class class02621 extends class05848 {
   private final double N;
   private final double y;
   private final double L;
   private final int u;
   private final int i;

   class02621(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, int var14, int var15, class08388 var16) {
      super(var1, var2, var4, var6, var16);
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
      this.field_3862 = false;
      this.field_3847 = (int)(this.field_3840.z() * 5.0F) + 25;
      this.u = var14;
      this.i = var15;
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public void method_3069(double var1, double var3, double var5) {
   }

   @Override
   public int method_3068(float var1) {
      return 240;
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
         float f1 = 1.0F - f;
         this.field_3874 = this.N + this.field_3852 * f1;
         this.field_3854 = this.y + this.field_3869 * f1;
         this.field_3871 = this.L + this.field_3850 * f1;
         int ix = class02566.N(f, this.u, this.i);
         this.method_74305(class02566.L(ix) / 255.0F, class02566.u(ix) / 255.0F, class02566.i(ix) / 255.0F);
         this.method_74308(class02566.y(ix) / 255.0F);
      }
   }
}
