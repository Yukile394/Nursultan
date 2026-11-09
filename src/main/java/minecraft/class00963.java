package minecraft;

record class00963(class06271<class06244> model, class01421 poseStack, class07311 renderType, int color) {

   public class07311 L() {
      return this.renderType;
   }

   private class00963(class06271<class06244> model, class01421 poseStack, class07311 renderType, int color) {
      this.model = model;
      this.poseStack = poseStack;
      this.renderType = renderType;
      this.color = color;
   }

   public int u() {
      return this.color;
   }

   public class01421 y() {
      return this.poseStack;
   }

   public static class00963 N(class06597 var0, class05363 var1, float var2) {
      float f = (var0.field_3866 + var2) / var0.field_3847;
      int i = class02566.N(0.05F + 0.5F * class04995.m(f * (float) Math.PI), 1.0F, 1.0F, 1.0F);
      class01421 class01421 = new class01421();
      class01421.N();
      class01421.N(var1.M());
      class01421.N(class02058.y.N(60.0F - 150.0F * f));
      float f1 = 0.42553192F;
      class01421.y(0.42553192F, -0.42553192F, -0.42553192F);
      class01421.N(0.0F, -0.56F, 3.5F);
      return new class00963(var0.N, class01421, var0.y, i);
   }

   public class06271<class06244> N() {
      return this.model;
   }
}
