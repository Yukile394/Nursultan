package minecraft;

import net.irisshaders.iris.Iris;

class class04302 extends class04404 {
   private boolean y;
   private boolean L;
   private final class04410 u;
   private float i;
   private float R;
   private float M;
   private boolean B;

   class04302(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class04410 var14, class06143 var15) {
      super(var1, var2, var4, var6, var15, 0.1F);
      this.field_3852 = var8;
      this.field_3869 = var10;
      this.field_3850 = var12;
      this.u = var14;
      this.field_17867 *= 0.75F;
      this.field_3847 = 48 + this.field_3840.y(12);
      this.method_74306(var15);
   }

   public void y(boolean var1) {
      this.L = var1;
   }

   public void N(boolean var1) {
      this.y = var1;
   }

   @Override
   public class05846 method_74255() {
      return Iris.IS_FOOL ? class05846.N : class05846.L;
   }

   @Override
   public void method_3074(class00965 var1, class05363 var2, float var3) {
      if (!this.L || this.field_3866 < this.field_3847 / 3 || (this.field_3866 + this.field_3847) / 3 % 2 == 0) {
         super.method_3074(var1, var2, var3);
      }
   }

   @Override
   public void method_3070() {
      super.method_3070();
      if (this.y && this.field_3866 < this.field_3847 / 2 && (this.field_3866 + this.field_3847) % 2 == 0) {
         class04302 class04302 = new class04302(this.field_3851, this.field_3874, this.field_3854, this.field_3871, 0.0, 0.0, 0.0, this.u, this.N);
         class04302.method_74308(0.99F);
         class04302.method_74305(this.field_62633, this.field_62634, this.field_62635);
         class04302.field_3866 = class04302.field_3847 / 2;
         if (this.B) {
            class04302.B = true;
            class04302.i = this.i;
            class04302.R = this.R;
            class04302.M = this.M;
         }

         class04302.L = this.L;
         this.u.N(class04302);
      }
   }
}
