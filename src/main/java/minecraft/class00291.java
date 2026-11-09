package minecraft;

public class class00291 extends class05848 {
   private final class06889 N;

   class00291(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class06889 var14, int var15, class08388 var16) {
      super(var1, var2, var4, var6, var8, var10, var12, var16);
      var15 = class02566.N(var15, 0.875F + this.field_3840.z() * 0.25F, 0.875F + this.field_3840.z() * 0.25F, 0.875F + this.field_3840.z() * 0.25F);
      this.field_62633 = class02566.L(var15) / 255.0F;
      this.field_62634 = class02566.u(var15) / 255.0F;
      this.field_62635 = class02566.i(var15) / 255.0F;
      this.field_17867 = 0.26F;
      this.N = var14;
   }

   @Override
   public class05846 method_74255() {
      return class05846.L;
   }

   @Override
   public int method_3068(float var1) {
      return 15728880;
   }

   @Override
   public void method_3070() {
      this.field_3858 = this.field_3874;
      this.field_3838 = this.field_3854;
      this.field_3856 = this.field_3871;
      if (this.field_3866++ >= this.field_3847) {
         this.method_3085();
      } else {
         int i = this.field_3847 - this.field_3866;
         double d0 = 1.0 / i;
         this.field_3874 = class04995.u(d0, this.field_3874, this.N.N());
         this.field_3854 = class04995.u(d0, this.field_3854, this.N.y());
         this.field_3871 = class04995.u(d0, this.field_3871, this.N.L());
      }
   }
}
