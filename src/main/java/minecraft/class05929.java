package minecraft;

import com.mojang.blaze3d.platform.TextureUtil;

public class class05929 {
   private static final String N = "item/";
   private static final float y = 0.5F;
   private static final float L = 0.3F;

   private class05929() {
      super();
   }

   public static class08280[] N(class01894 var0, class08280[] var1, int var2, class06846 var3, float var4) {
      if (var3 == class06846.field_64076) {
         var3 = N(var1[0]) ? class06846.field_64078 : class06846.field_64077;
      }

      if (var1.length == 1 && !var0.N().startsWith("item/")) {
         if (var3 == class06846.field_64078 || var3 == class06846.field_64079) {
            TextureUtil.solidify(var1[0]);
         } else if (var3 == class06846.field_64080) {
            TextureUtil.fillEmptyAreasWithDarkColor(var1[0]);
         }
      }

      if (var2 + 1 <= var1.length) {
         return var1;
      } else {
         class08280[] aclass08280 = new class08280[var2 + 1];
         aclass08280[0] = var1[0];
         boolean flag = var3 == class06846.field_64078 || var3 == class06846.field_64079 || var3 == class06846.field_64080;
         float f = var3 == class06846.field_64079 ? 0.3F : 0.5F;
         float f1 = flag ? N(var1[0], f, 1.0F) : 0.0F;

         for (int i = 1; i <= var2; i++) {
            if (i < var1.length) {
               aclass08280[i] = var1[i];
            } else {
               class08280 class08280x = aclass08280[i - 1];
               class08280 class08280x = new class08280(class08280x.N() >> 1, class08280x.y() >> 1, false);
               int j = class08280x.N();
               int k = class08280x.y();

               for (int l = 0; l < j; l++) {
                  for (int i1 = 0; i1 < k; i1++) {
                     int j1 = class08280x.N(l * 2 + 0, i1 * 2 + 0);
                     int k1 = class08280x.N(l * 2 + 1, i1 * 2 + 0);
                     int l1 = class08280x.N(l * 2 + 0, i1 * 2 + 1);
                     int i2 = class08280x.N(l * 2 + 1, i1 * 2 + 1);
                     int j2;
                     if (var3 == class06846.field_64080) {
                        j2 = N(j1, k1, l1, i2);
                     } else {
                        j2 = class02566.N(j1, k1, l1, i2);
                     }

                     class08280x.y(l, i1, j2);
                  }
               }

               aclass08280[i] = class08280x;
            }

            if (flag) {
               N(aclass08280[i], f1, f, var4);
            }
         }

         return aclass08280;
      }
   }

   private static boolean N(class08280 var0) {
      for (int i = 0; i < var0.N(); i++) {
         for (int j = 0; j < var0.y(); j++) {
            if (class02566.y(var0.N(i, j)) == 0) {
               return true;
            }
         }
      }

      return false;
   }

   private static int N(int var0, int var1, int var2, int var3) {
      float f = 0.0F;
      float f1 = 0.0F;
      float f2 = 0.0F;
      float f3 = 0.0F;
      if (class02566.y(var0) != 0) {
         f += class02566.N(class02566.y(var0));
         f1 += class02566.N(class02566.L(var0));
         f2 += class02566.N(class02566.u(var0));
         f3 += class02566.N(class02566.i(var0));
      }

      if (class02566.y(var1) != 0) {
         f += class02566.N(class02566.y(var1));
         f1 += class02566.N(class02566.L(var1));
         f2 += class02566.N(class02566.u(var1));
         f3 += class02566.N(class02566.i(var1));
      }

      if (class02566.y(var2) != 0) {
         f += class02566.N(class02566.y(var2));
         f1 += class02566.N(class02566.L(var2));
         f2 += class02566.N(class02566.u(var2));
         f3 += class02566.N(class02566.i(var2));
      }

      if (class02566.y(var3) != 0) {
         f += class02566.N(class02566.y(var3));
         f1 += class02566.N(class02566.L(var3));
         f2 += class02566.N(class02566.u(var3));
         f3 += class02566.N(class02566.i(var3));
      }

      f /= 4.0F;
      f1 /= 4.0F;
      f2 /= 4.0F;
      f3 /= 4.0F;
      return class02566.y(class02566.N(f), class02566.N(f1), class02566.N(f2), class02566.N(f3));
   }

   private static void N(class08280 var0, float var1, float var2, float var3) {
      float f = 0.0F;
      float f1 = 4.0F;
      float f2 = 1.0F;
      float f3 = 1.0F;
      float f4 = Float.MAX_VALUE;
      int i = var0.N();
      int j = var0.y();

      for (int k = 0; k < 5; k++) {
         float f5 = N(var0, var2, f2);
         float f6 = Math.abs(f5 - var1);
         if (f6 < f4) {
            f4 = f6;
            f3 = f2;
         }

         if (f5 < var1) {
            f = f2;
         } else {
            if (!(f5 > var1)) {
               break;
            }

            f1 = f2;
         }

         f2 = (f + f1) * 0.5F;
      }

      for (int l = 0; l < j; l++) {
         for (int i1 = 0; i1 < i; i1++) {
            int j1 = var0.N(i1, l);
            float f7 = class02566.W(j1);
            f7 = f7 * f3 + var3 + 0.025F;
            f7 = Math.clamp(f7, 0.0F, 1.0F);
            var0.y(i1, l, class02566.N(f7, j1));
         }
      }
   }

   private static float N(class08280 var0, float var1, float var2) {
      int i = var0.N();
      int j = var0.y();
      float f = 0.0F;
      byte b0 = 4;

      for (int k = 0; k < j - 1; k++) {
         for (int l = 0; l < i - 1; l++) {
            float f1 = Math.clamp(class02566.W(var0.N(l, k)) * var2, 0.0F, 1.0F);
            float f2 = Math.clamp(class02566.W(var0.N(l + 1, k)) * var2, 0.0F, 1.0F);
            float f3 = Math.clamp(class02566.W(var0.N(l, k + 1)) * var2, 0.0F, 1.0F);
            float f4 = Math.clamp(class02566.W(var0.N(l + 1, k + 1)) * var2, 0.0F, 1.0F);
            float f5 = 0.0F;

            for (int i1 = 0; i1 < 4; i1++) {
               float f6 = (i1 + 0.5F) / 4.0F;

               for (int j1 = 0; j1 < 4; j1++) {
                  float f7 = (j1 + 0.5F) / 4.0F;
                  if (f1 * (1.0F - f7) * (1.0F - f6) + f2 * f7 * (1.0F - f6) + f3 * (1.0F - f7) * f6 + f4 * f7 * f6 > var1) {
                     f5++;
                  }
               }
            }

            f += f5 / 16.0F;
         }
      }

      return f / ((i - 1) * (j - 1));
   }
}
