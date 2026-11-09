package minecraft;

public class class05402 {
   public class05402() {
      super();
   }

   public static void N(class01686 var0, float var1, float var2) {
      var0.M = var0.M + var2 * (class04995.P(var1 * 0.09F) * 0.05F + 0.05F);
      var0.i = var0.i + var2 * (class04995.m(var1 * 0.067F) * 0.05F);
   }

   public static void N(class01686 var0, class01686 var1, float var2) {
      N(var0, var2, 1.0F);
      N(var1, var2, -1.0F);
   }

   public static <T extends class06751> void N(class01686 var0, class01686 var1, boolean var2, T var3) {
      if (var3.Nc != class08155.field_63400) {
         float f = var3.NX;
         float f1 = (float) -Math.PI / (var2 ? 1.5F : 2.25F);
         float f2 = class04995.m(f * (float) Math.PI);
         float f3 = class04995.m((1.0F - (1.0F - f) * (1.0F - f)) * (float) Math.PI);
         var1.M = 0.0F;
         var1.R = -(0.1F - f2 * 0.6F);
         var1.i = f1;
         var1.i += f2 * 1.2F - f3 * 0.4F;
         var0.M = 0.0F;
         var0.R = 0.1F - f2 * 0.6F;
         var0.i = f1;
         var0.i += f2 * 1.2F - f3 * 0.4F;
      }

      N(var1, var0, var3.P);
   }

   public static void N(class01686 var0, class01686 var1, class07070 var2, float var3, float var4) {
      float f = class04995.m(var3 * (float) Math.PI);
      float f1 = class04995.m((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var0.M = 0.0F;
      var1.M = 0.0F;
      var0.R = (float) (Math.PI / 20);
      var1.R = (float) (-Math.PI / 20);
      if (var2 == class07070.field_6183) {
         var0.i = -1.8849558F + class04995.P(var4 * 0.09F) * 0.15F;
         var1.i = -0.0F + class04995.P(var4 * 0.19F) * 0.5F;
         var0.i += f * 2.2F - f1 * 0.4F;
         var1.i += f * 1.2F - f1 * 0.4F;
      } else {
         var0.i = -0.0F + class04995.P(var4 * 0.19F) * 0.5F;
         var1.i = -1.8849558F + class04995.P(var4 * 0.09F) * 0.15F;
         var0.i += f * 1.2F - f1 * 0.4F;
         var1.i += f * 2.2F - f1 * 0.4F;
      }

      N(var0, var1, var4);
   }

   public static void N(class01686 var0, class01686 var1, float var2, float var3, boolean var4) {
      class01686 class01686x = var4 ? var0 : var1;
      class01686 class01686x = var4 ? var1 : var0;
      class01686x.R = var4 ? -0.8F : 0.8F;
      class01686x.i = -0.97079635F;
      class01686x.i = class01686x.i;
      float f = class04995.N(var3, 0.0F, var2) / var2;
      class01686x.R = class04995.B(f, 0.4F, 0.85F) * (var4 ? 1 : -1);
      class01686x.i = class04995.B(f, class01686x.i, (float) (-Math.PI / 2));
   }

   public static void N(class01686 var0, class01686 var1, class01686 var2, boolean var3) {
      class01686 class01686x = var3 ? var0 : var1;
      class01686 class01686x = var3 ? var1 : var0;
      class01686x.R = (var3 ? -0.3F : 0.3F) + var2.R;
      class01686x.R = (var3 ? 0.6F : -0.6F) + var2.R;
      class01686x.i = (float) (-Math.PI / 2) + var2.i + 0.1F;
      class01686x.i = -1.5F + var2.i;
   }
}
