package minecraft;

import org.joml.Vector3f;
import org.joml.Vector4f;

public class class02566 {
   private static final int N = 1024;
   private static final short[] y = class07536.N(new short[256], var0 -> {
      for (int i = 0; i < var0.length; i++) {
         float f = i / 255.0F;
         var0[i] = (short)Math.round(i(f) * 1023.0F);
      }
   });
   private static final byte[] L = class07536.N(new byte[1024], var0 -> {
      for (int i = 0; i < var0.length; i++) {
         float f = i / 1023.0F;
         var0[i] = (byte)Math.round(R(f) * 255.0F);
      }
   });

   public static int L(int var0) {
      return var0 >> 16 & 0xFF;
   }

   private static int L(int var0, int var1, int var2, int var3) {
      int i = (y[var0] + y[var1] + y[var2] + y[var3]) / 4;
      return L[i] & 0xFF;
   }

   public static int L(int var0, int var1) {
      return y(y(var0), Math.max(L(var0) - L(var1), 0), Math.max(u(var0) - u(var1), 0), Math.max(i(var0) - i(var1), 0));
   }

   public static int L(float var0) {
      return u(var0) << 24;
   }

   public static int L(int var0, float var1) {
      int i = L(var0);
      int j = u(var0);
      int k = i(var0);
      int l = y(var0);
      int i1 = Math.max(Math.max(i, j), k);
      int j1 = Math.min(Math.min(i, j), k);
      float f = i1 - j1;
      float f1;
      if (i1 != 0) {
         f1 = f / i1;
      } else {
         f1 = 0.0F;
      }

      float f2;
      if (f1 == 0.0F) {
         f2 = 0.0F;
      } else {
         float f3 = (i1 - i) / f;
         float f4 = (i1 - j) / f;
         float f5 = (i1 - k) / f;
         if (i == i1) {
            f2 = f5 - f4;
         } else if (j == i1) {
            f2 = 2.0F + f3 - f5;
         } else {
            f2 = 4.0F + f4 - f3;
         }

         f2 /= 6.0F;
         if (f2 < 0.0F) {
            f2++;
         }
      }

      if (f1 == 0.0F) {
         i = j = k = Math.round(var1 * 255.0F);
         return y(l, i, j, k);
      } else {
         float f8 = (f2 - (float)Math.floor(f2)) * 6.0F;
         float f9 = f8 - (float)Math.floor(f8);
         float f10 = var1 * (1.0F - f1);
         float f6 = var1 * (1.0F - f1 * f9);
         float f7 = var1 * (1.0F - f1 * (1.0F - f9));
         switch ((int)f8) {
            case 0:
               i = Math.round(var1 * 255.0F);
               j = Math.round(f7 * 255.0F);
               k = Math.round(f10 * 255.0F);
               break;
            case 1:
               i = Math.round(f6 * 255.0F);
               j = Math.round(var1 * 255.0F);
               k = Math.round(f10 * 255.0F);
               break;
            case 2:
               i = Math.round(f10 * 255.0F);
               j = Math.round(var1 * 255.0F);
               k = Math.round(f7 * 255.0F);
               break;
            case 3:
               i = Math.round(f10 * 255.0F);
               j = Math.round(f6 * 255.0F);
               k = Math.round(var1 * 255.0F);
               break;
            case 4:
               i = Math.round(f7 * 255.0F);
               j = Math.round(f10 * 255.0F);
               k = Math.round(var1 * 255.0F);
               break;
            case 5:
               i = Math.round(var1 * 255.0F);
               j = Math.round(f10 * 255.0F);
               k = Math.round(f6 * 255.0F);
         }

         return y(l, i, j, k);
      }
   }

   public static int M(int var0) {
      return var0 | 0xFF000000;
   }

   public static int M(int var0, int var1) {
      return y((y(var0) + y(var1)) / 2, (L(var0) + L(var1)) / 2, (u(var0) + u(var1)) / 2, (i(var0) + i(var1)) / 2);
   }

   public static float P(int var0) {
      return j(u(var0));
   }

   public static int T(int var0) {
      return var0 & -16711936 | (var0 & 0xFF0000) >> 16 | (var0 & 0xFF) << 16;
   }

   public class02566() {
      super();
   }

   public static int B(int var0) {
      return var0 & 16777215;
   }

   public static int Z(int var0) {
      return var0 << 24 | 16777215;
   }

   public static int i(int var0, int var1) {
      int i = y(var0);
      int j = y(var1);
      if (j == 255) {
         return var1;
      } else if (j == 0) {
         return var0;
      } else {
         int k = j + i * (255 - j) / 255;
         return y(k, u(k, j, L(var0), L(var1)), u(k, j, u(var0), u(var1)), u(k, j, i(var0), i(var1)));
      }
   }

   public static int i(int var0) {
      return var0 & 0xFF;
   }

   private static float i(float var0) {
      return var0 >= 0.04045F ? (float)Math.pow((var0 + 0.055) / 1.055, 2.4) : var0 / 12.92F;
   }

   public static int b(int var0) {
      return T(var0);
   }

   public static float s(int var0) {
      return j(i(var0));
   }

   public static float m(int var0) {
      return j(L(var0));
   }

   private static float j(int var0) {
      return var0 / 255.0F;
   }

   public static Vector3f U(int var0) {
      return new Vector3f(m(var0), P(var0), s(var0));
   }

   public static int z(int var0) {
      return var0 << 24;
   }

   public static int u(float var0) {
      return class04995.y(var0 * 255.0F);
   }

   public static int u(int var0) {
      return var0 >> 8 & 0xFF;
   }

   private static int u(int var0, int var1, int var2, int var3) {
      return (var3 * var1 + var2 * (var0 - var1)) / var0;
   }

   public static int u(int var0, int var1) {
      return y(
         y(var0),
         Math.clamp((long)L(var0) * var1 / 255L, 0, 255),
         Math.clamp((long)u(var0) * var1 / 255L, 0, 255),
         Math.clamp((long)i(var0) * var1 / 255L, 0, 255)
      );
   }

   public static int y(float var0, int var1, int var2) {
      return y(
         class04995.N(var0, y(var1), y(var2)),
         L[class04995.N(var0, y[L(var1)], y[L(var2)])] & 0xFF,
         L[class04995.N(var0, y[u(var1)], y[u(var2)])] & 0xFF,
         L[class04995.N(var0, y[i(var1)], y[i(var2)])] & 0xFF
      );
   }

   public static int y(float var0) {
      return u(var0) << 24 | 16777215;
   }

   public static int y(int var0, float var1) {
      return N(var0, var1, var1, var1);
   }

   public static int y(int var0, int var1) {
      return y(y(var0), Math.min(L(var0) + L(var1), 255), Math.min(u(var0) + u(var1), 255), Math.min(i(var0) + i(var1), 255));
   }

   public static int y(int var0) {
      return var0 >>> 24;
   }

   public static int y(int var0, int var1, int var2, int var3) {
      return (var0 & 0xFF) << 24 | (var1 & 0xFF) << 16 | (var2 & 0xFF) << 8 | var3 & 0xFF;
   }

   public static Vector4f E(int var0) {
      return new Vector4f(m(var0), P(var0), s(var0), W(var0));
   }

   public static int N(int var0, float var1) {
      if (var0 == 0 || var1 <= 0.0F) {
         return 0;
      } else {
         return var1 >= 1.0F ? var0 : N(W(var0) * var1, var0);
      }
   }

   public static int N(int var0, int var1, int var2) {
      return y(255, var0, var1, var2);
   }

   public static float N(int var0) {
      return y[var0] / 1023.0F;
   }

   public static int N(class06889 var0) {
      return N(u((float)var0.N()), u((float)var0.y()), u((float)var0.L()));
   }

   public static int N(int var0, int var1) {
      if (var0 == -1) {
         return var1;
      } else {
         return var1 == -1 ? var0 : y(y(var0) * y(var1) / 255, L(var0) * L(var1) / 255, u(var0) * u(var1) / 255, i(var0) * i(var1) / 255);
      }
   }

   public static int N(int var0, int var1, int var2, int var3) {
      return y(
         (y(var0) + y(var1) + y(var2) + y(var3)) / 4,
         L(L(var0), L(var1), L(var2), L(var3)),
         L(u(var0), u(var1), u(var2), u(var3)),
         L(i(var0), i(var1), i(var2), i(var3))
      );
   }

   public static int N(float var0, int var1, int var2) {
      int i = class04995.N(var0, y(var1), y(var2));
      int j = class04995.N(var0, L(var1), L(var2));
      int k = class04995.N(var0, u(var1), u(var2));
      int l = class04995.N(var0, i(var1), i(var2));
      return y(i, j, k, l);
   }

   public static int N(float var0, int var1) {
      return u(var0) << 24 | var1 & 16777215;
   }

   public static int N(float var0, float var1, float var2, float var3) {
      return y(u(var0), u(var1), u(var2), u(var3));
   }

   public static int N(int var0, float var1, float var2, float var3) {
      return y(
         y(var0),
         Math.clamp((long)((int)(L(var0) * var1)), 0, 255),
         Math.clamp((long)((int)(u(var0) * var2)), 0, 255),
         Math.clamp((long)((int)(i(var0) * var3)), 0, 255)
      );
   }

   public static int N(float var0) {
      return L[class04995.y(var0 * 1023.0F)] & 0xFF;
   }

   public static float W(int var0) {
      return j(y(var0));
   }

   public static int R(int var0, int var1) {
      return var0 << 24 | var1 & 16777215;
   }

   public static int R(int var0) {
      int i = (int)(L(var0) * 0.3F + u(var0) * 0.59F + i(var0) * 0.11F);
      return y(y(var0), i, i, i);
   }

   private static float R(float var0) {
      return var0 >= 0.0031308F ? (float)(1.055 * Math.pow(var0, 0.4166666666666667) - 0.055) : 12.92F * var0;
   }
}
