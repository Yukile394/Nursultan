package minecraft;

public class class01764 extends class04507<class07057, class08457> {
   private static final class01894 N = class01894.y("textures/entity/experience_orb.png");
   private static final class07311 y = class06851.Z(N);

   public class01764(class04832 var1) {
      super(var1);
      this.field_4673 = 0.15F;
      this.field_4672 = 0.75F;
   }

   protected int method_24087(class07057 var1, class07209 var2) {
      return class04995.N(super.method_24087(var1, var2) + 7, 0, 15);
   }

   public void method_62354(class07057 var1, class08457 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.y();
   }

   public class08457 method_55269() {
      return new class08457();
   }

   private static void N(class01391 var0, class01423 var1, float var2, float var3, int var4, int var5, int var6, float var7, float var8, int var9) {
      var0.N(var1, var2, var3, 0.0F)
         .method_1336(var4, var5, var6, 128)
         .method_22913(var7, var8)
         .method_22922(class01384.u)
         .method_60803(var9)
         .y(var1, 0.0F, 1.0F, 0.0F);
   }

   public void method_3936(class08457 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      int i = var1.N;
      float f = (i % 4 * 16 + 0) / 64.0F;
      float f1 = (i % 4 * 16 + 16) / 64.0F;
      float f2 = (i / 4 * 16 + 0) / 64.0F;
      float f3 = (i / 4 * 16 + 16) / 64.0F;
      float f4 = 1.0F;
      float f5 = 0.5F;
      float f6 = 0.25F;
      float f7 = 255.0F;
      float f8 = var1.P / 2.0F;
      int j = (int)((class04995.m(f8 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      short short1 = 255;
      int k = (int)((class04995.m(f8 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
      var2.N(0.0F, 0.1F, 0.0F);
      var2.N(var4.i);
      float f9 = 0.3F;
      var2.y(0.3F, 0.3F, 0.3F);
      var3.N(var2, y, (var7x, var8x) -> {
         N(var8x, var7x, -0.5F, -0.25F, j, 255, k, f, f3, var1.G);
         N(var8x, var7x, 0.5F, -0.25F, j, 255, k, f1, f3, var1.G);
         N(var8x, var7x, 0.5F, 0.75F, j, 255, k, f1, f2, var1.G);
         N(var8x, var7x, -0.5F, 0.75F, j, 255, k, f, f2, var1.G);
      });
      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }
}
