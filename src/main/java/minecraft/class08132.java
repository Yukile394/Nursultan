package minecraft;

import org.joml.Matrix4f;

public class class08132 {
   private static final int N = 24;
   private static final float y = 0.05F;

   public class08132() {
      super();
   }

   private static void N(
      class01391 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, boolean var9, class08804 var10
   ) {
      float f = var8 / 24.0F;
      int i = (int)class04995.B(f, var10.u, var10.i);
      int j = (int)class04995.B(f, var10.R, var10.M);
      int k = class03042.N(i, j);
      float f1 = var8 % 2 == (var9 ? 1 : 0) ? 0.7F : 1.0F;
      float f2 = 0.5F * f1;
      float f3 = 0.4F * f1;
      float f4 = 0.3F * f1;
      float f5 = var2 * f;
      float f6;
      if (var10.B) {
         f6 = var3 > 0.0F ? var3 * f * f : var3 - var3 * (1.0F - f) * (1.0F - f);
      } else {
         f6 = var3 * f;
      }

      float f7 = var4 * f;
      var0.N(var1, f5 - var6, f6 + var5, f7 + var7).method_22915(f2, f3, f4, 1.0F).method_60803(k);
      var0.N(var1, f5 + var6, f6 + 0.05F - var5, f7 - var7).method_22915(f2, f3, f4, 1.0F).method_60803(k);
   }

   private static void N(Matrix4f var0, class01407 var1, class08804 var2) {
      float f = (float)(var2.L.M - var2.y.M);
      float f1 = (float)(var2.L.B - var2.y.B);
      float f2 = (float)(var2.L.Z - var2.y.Z);
      float f3 = class04995.B(f * f + f2 * f2) * 0.05F / 2.0F;
      float f4 = f2 * f3;
      float f5 = f * f3;
      var0.translate((float)var2.N.M, (float)var2.N.B, (float)var2.N.Z);
      class01391 class01391 = var1.method_73477(class06851.u());

      for (int i = 0; i <= 24; i++) {
         N(class01391, var0, f, f1, f2, 0.05F, f4, f5, i, false, var2);
      }

      for (int j = 24; j >= 0; j--) {
         N(class01391, var0, f, f1, f2, 0.0F, f4, f5, j, true, var2);
      }
   }

   public void N(class07937 var1, class01422 var2) {
      for (class08146 class08146 : var1.i()) {
         N(class08146.N(), var2, class08146.y());
      }
   }
}
