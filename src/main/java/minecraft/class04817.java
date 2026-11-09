package minecraft;

public class class04817 extends class03089<class08278> {
   public class04817(class01686 var1) {
      super(var1);
   }

   @Override
   public void method_2819(class08278 var1) {
      super.method_2819(var1);
      if (var1.NV == class01180.field_63542) {
         this.U.i = this.U.i * 0.5F - (float) Math.PI;
         this.U.R = 0.0F;
      }

      if (var1.No == class01180.field_63542) {
         this.z.i = this.z.i * 0.5F - (float) Math.PI;
         this.z.R = 0.0F;
      }

      float f = var1.L;
      if (f > 0.0F) {
         this.z.i = class04995.z(f, this.z.i, (float) (-Math.PI * 4.0 / 5.0)) + f * 0.35F * class04995.m(0.1F * var1.P);
         this.U.i = class04995.z(f, this.U.i, (float) (-Math.PI * 4.0 / 5.0)) - f * 0.35F * class04995.m(0.1F * var1.P);
         this.z.M = class04995.z(f, this.z.M, -0.15F);
         this.U.M = class04995.z(f, this.U.M, 0.15F);
         this.W.i = this.W.i - f * 0.55F * class04995.m(0.1F * var1.P);
         this.E.i = this.E.i + f * 0.55F * class04995.m(0.1F * var1.P);
         this.M.i = 0.0F;
      }
   }

   public static class04806 N(class04834 var0) {
      class04792 class04792 = class01188.N(var0, 0.0F);
      class04839 class04839 = class04792.N();
      class04839.N("left_arm", class04822.L().N(32, 48).N(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0), class04838.N(5.0F, 2.0F, 0.0F));
      class04839.N("left_leg", class04822.L().N(16, 48).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var0), class04838.N(1.9F, 12.0F, 0.0F));
      return class04806.N(class04792, 64, 64);
   }
}
