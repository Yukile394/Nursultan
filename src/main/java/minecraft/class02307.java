package minecraft;

import org.joml.Matrix4f;

public class class02307 extends class04507<class00672, class08488> {
   public class02307(class04832 var1) {
      super(var1);
   }

   private class07311 y() {
      return null;
   }

   public void method_3936(class08488 var1, class01421 var2, class01237 var3, class06959 var4) {
      float[] afloat = new float[8];
      float[] afloat1 = new float[8];
      float f = 0.0F;
      float f1 = 0.0F;
      class06069 class06069 = class06069.y(var1.N);

      for (int i = 7; i >= 0; i--) {
         afloat[i] = f;
         afloat1[i] = f1;
         f += class06069.y(11) - 5;
         f1 += class06069.y(11) - 5;
      }

      float f2 = f;
      float f3 = f1;
      var3.N(var2, class06851.E(), (var5x, var6x) -> {
         Matrix4f matrix4f = var5x.N();

         for (int ix = 0; ix < 4; ix++) {
            class06069 class06069x = class06069.y(var1.N);

            for (int j = 0; j < 3; j++) {
               int k = 7;
               int l = 0;
               if (j > 0) {
                  k = 7 - j;
               }

               if (j > 0) {
                  l = k - 2;
               }

               float fx = afloat[k] - f2;
               float f1x = afloat1[k] - f3;

               for (int i1 = k; i1 >= l; i1--) {
                  float f2x = fx;
                  float f3x = f1x;
                  if (j == 0) {
                     fx += class06069x.y(11) - 5;
                     f1x += class06069x.y(11) - 5;
                  } else {
                     fx += class06069x.y(31) - 15;
                     f1x += class06069x.y(31) - 15;
                  }

                  float f4 = 0.5F;
                  float f5 = 0.45F;
                  float f6 = 0.45F;
                  float f7 = 0.5F;
                  float f8 = 0.1F + ix * 0.2F;
                  if (j == 0) {
                     f8 *= i1 * 0.1F + 1.0F;
                  }

                  float f9 = 0.1F + ix * 0.2F;
                  if (j == 0) {
                     f9 *= (i1 - 1.0F) * 0.1F + 1.0F;
                  }

                  N(matrix4f, var6x, fx, f1x, i1, f2x, f3x, 0.45F, 0.45F, 0.5F, f8, f9, false, false, true, false);
                  N(matrix4f, var6x, fx, f1x, i1, f2x, f3x, 0.45F, 0.45F, 0.5F, f8, f9, true, false, true, true);
                  N(matrix4f, var6x, fx, f1x, i1, f2x, f3x, 0.45F, 0.45F, 0.5F, f8, f9, true, true, false, true);
                  N(matrix4f, var6x, fx, f1x, i1, f2x, f3x, 0.45F, 0.45F, 0.5F, f8, f9, false, true, false, false);
               }
            }
         }
      });
   }

   protected boolean method_62406(class00672 var1) {
      return false;
   }

   public void method_62354(class00672 var1, class08488 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.N;
   }

   public class08488 method_55269() {
      return new class08488();
   }

   private static void N(
      Matrix4f var0,
      class01391 var1,
      float var2,
      float var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15
   ) {
      var1.N(var0, var2 + (var12 ? var11 : -var11), (float)(var4 * 16), var3 + (var13 ? var11 : -var11)).method_22915(var7, var8, var9, 0.3F);
      var1.N(var0, var5 + (var12 ? var10 : -var10), (float)((var4 + 1) * 16), var6 + (var13 ? var10 : -var10)).method_22915(var7, var8, var9, 0.3F);
      var1.N(var0, var5 + (var14 ? var10 : -var10), (float)((var4 + 1) * 16), var6 + (var15 ? var10 : -var10)).method_22915(var7, var8, var9, 0.3F);
      var1.N(var0, var2 + (var14 ? var11 : -var11), (float)(var4 * 16), var3 + (var15 ? var11 : -var11)).method_22915(var7, var8, var9, 0.3F);
   }
}
