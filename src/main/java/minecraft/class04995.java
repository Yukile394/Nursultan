package minecraft;

import java.util.Locale;
import java.util.UUID;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import net.caffeinemc.mods.lithium.common.util.math.CompactSineLUT;
import org.apache.commons.lang3.math.Fraction;
import org.apache.commons.lang3.math.NumberUtils;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04995 {
   private static final long E = 61440L;
   private static final long W = 16384L;
   private static final long m = -4611686018427387904L;
   private static final long P = Long.MIN_VALUE;
   public static final float N = (float) Math.PI;
   public static final float y = (float) (Math.PI / 2);
   public static final float L = (float) (Math.PI * 2);
   public static final float u = (float) (Math.PI / 180.0);
   public static final float i = 180.0F / (float)Math.PI;
   public static final float R = 1.0E-5F;
   public static final float M = N(2.0F);
   public static final Vector3f B = new Vector3f(0.0F, 1.0F, 0.0F);
   public static final Vector3f Z = new Vector3f(1.0F, 0.0F, 0.0F);
   public static final Vector3f z = new Vector3f(0.0F, 0.0F, 1.0F);
   private static final int s = 65536;
   private static final int T = 65535;
   private static final int b = 16384;
   private static final double j = 10430.378350470453;
   public static float[] U = class07536.N(new float[65536], var0x -> {
      for (int ixx = 0; ixx < var0x.length; ixx++) {
         var0x[ixx] = (float)Math.sin(ixx / 10430.378350470453);
      }
   });
   private static final class06069 v = class06069.i();
   private static final int[] n = new int[]{
      0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9
   };
   private static final double t = 0.16666666666666666;
   private static final int G = 8;
   private static final int l = 257;
   private static final double d = Double.longBitsToDouble(4805340802404319232L);
   private static final double[] w = new double[257];
   private static final double[] k = new double[257];

   public static float L(class06069 var0, float var1, float var2) {
      return var1 + (float)var0.E() * var2;
   }

   public static float L(float var0, float var1, float var2, float var3, float var4) {
      return B(R(var0, var1, var2), var3, var4);
   }

   public static int L(double var0) {
      int ix = (int)var0;
      return var0 > ix ? ix + 1 : ix;
   }

   public static float L(float var0, float var1, float var2) {
      float f = N(u(var0, var1), -var2, var2);
      return var1 - f;
   }

   public static int L(int var0) {
      int ix = var0 - 1;
      ix |= ix >> 1;
      ix |= ix >> 2;
      ix |= ix >> 4;
      ix |= ix >> 8;
      ix |= ix >> 16;
      return ix + 1;
   }

   public static double L(double var0, double var2, double var4) {
      return (var0 - var2) / (var4 - var2);
   }

   public static int L(int var0, int var1) {
      return Math.floorMod(var0, var1);
   }

   public static IntStream L(int var0, int var1, int var2) {
      return y(var0, var1, var2, 1);
   }

   public static float L(float var0) {
      return Math.abs(var0);
   }

   public static double L(double var0, double var2) {
      return (var0 % var2 + var2) % var2;
   }

   public static float L(float var0, float var1) {
      return (var0 % var1 + var1) % var1;
   }

   public static float M(float var0) {
      return var0 - y(var0);
   }

   public static int M(int var0) {
      return R(var0) - (i(var0) ? 0 : 1);
   }

   public static double M(double var0, double var2, double var4) {
      return Math.sqrt(R(var0, var2, var4));
   }

   public static int M(float var0, float var1, float var2) {
      return N(var0, var1, var2, 0);
   }

   public static double M(double var0) {
      return org.joml.Math.invsqrt(var0);
   }

   public static float M(float var0, float var1) {
      return (float)Math.sqrt(i((double)var0, (double)var1));
   }

   public static float P(double var0) {
      return CompactSineLUT.cos(var0);
   }

   public class04995() {
      super();
   }

   public static int B(int var0) {
      var0 ^= var0 >>> 16;
      var0 *= -2048144789;
      var0 ^= var0 >>> 13;
      var0 *= -1028477387;
      return var0 ^ var0 >>> 16;
   }

   public static float B(float var0) {
      return org.joml.Math.invsqrt(var0);
   }

   public static float B(float var0, float var1, float var2) {
      return var1 + var0 * (var2 - var1);
   }

   @Deprecated
   public static double B(double var0) {
      double d0 = 0.5 * var0;
      long ix = Double.doubleToRawLongBits(var0);
      ix = 6910469410427058090L - (ix >> 1);
      var0 = Double.longBitsToDouble(ix);
      return var0 * (1.5 - d0 * var0 * var0);
   }

   public static float Z(float var0, float var1, float var2) {
      return var1 + var0 * R(var2 - var1);
   }

   public static float Z(float var0) {
      int ix = Float.floatToIntBits(var0);
      ix = 1419967116 - ix / 3;
      float f = Float.intBitsToFloat(ix);
      f = 0.6666667F * f + 1.0F / (3.0F * f * f * var0);
      return 0.6666667F * f + 1.0F / (3.0F * f * f * var0);
   }

   public static double Z(double var0) {
      return var0 * var0 * var0 * (var0 * (var0 * 6.0 - 15.0) + 10.0);
   }

   public static int Z(int var0) {
      return var0 * var0;
   }

   public static double i(double var0, double var2, double var4) {
      return var2 + var0 * i(var4 - var2);
   }

   public static double i(double var0) {
      double d0 = var0 % 360.0;
      if (d0 >= 180.0) {
         d0 -= 360.0;
      }

      if (d0 < -180.0) {
         d0 += 360.0;
      }

      return d0;
   }

   public static int i(int var0, int var1) {
      return R(var0, var1) * var1;
   }

   public static float i(float var0, float var1, float var2) {
      float f = u(var0, var1);
      return u(var0, var0 + f, var2);
   }

   public static float i(float var0, float var1) {
      return L(u(var0, var1));
   }

   public static byte i(float var0) {
      return (byte)y(var0 * 256.0F / 360.0F);
   }

   public static boolean i(int var0) {
      return var0 != 0 && (var0 & var0 - 1) == 0;
   }

   public static double i(double var0, double var2) {
      return var0 * var0 + var2 * var2;
   }

   public static float m(double var0) {
      return CompactSineLUT.sin(var0);
   }

   public static float U(float var0, float var1, float var2) {
      return var0 * var0 + var1 * var1 + var2 * var2;
   }

   public static float U(float var0) {
      return var0 * var0 * var0;
   }

   public static int U(double var0) {
      if (var0 == 0.0) {
         return 0;
      } else {
         return var0 > 0.0 ? 1 : -1;
      }
   }

   public static double z(double var0) {
      return 30.0 * var0 * var0 * (var0 - 1.0) * (var0 - 1.0);
   }

   public static float z(float var0) {
      return var0 * var0;
   }

   public static float z(float var0, float var1, float var2) {
      float f = var2 - var1;

      while (f < (float) -Math.PI) {
         f += (float) (Math.PI * 2);
      }

      while (f >= (float) Math.PI) {
         f -= (float) (Math.PI * 2);
      }

      return var1 + var0 * f;
   }

   public static double u(double var0, double var2, double var4) {
      return var2 + var0 * (var4 - var2);
   }

   public static double u(double var0, double var2) {
      double d0 = var2 * var2 + var0 * var0;
      if (Double.isNaN(d0)) {
         return Double.NaN;
      } else {
         boolean flag = var0 < 0.0;
         if (flag) {
            var0 = -var0;
         }

         boolean flag1 = var2 < 0.0;
         if (flag1) {
            var2 = -var2;
         }

         boolean flag2 = var0 > var2;
         if (flag2) {
            double d1 = var2;
            var2 = var0;
            var0 = d1;
         }

         double d9 = B(d0);
         var2 *= d9;
         var0 *= d9;
         double d2 = d + var0;
         int ix = (int)Double.doubleToRawLongBits(d2);
         double d3 = w[ix];
         double d4 = k[ix];
         double d5 = d2 - d;
         double d6 = var0 * d4 - var2 * d5;
         double d7 = (6.0 + d6 * d6) * d6 * 0.16666666666666666;
         double d8 = d3 + d7;
         if (flag2) {
            d8 = (Math.PI / 2) - d8;
         }

         if (flag1) {
            d8 = Math.PI - d8;
         }

         if (flag) {
            d8 = -d8;
         }

         return d8;
      }
   }

   public static float u(float var0, float var1) {
      return R(var1 - var0);
   }

   public static int u(float var0) {
      int ix = (int)var0;
      return var0 > ix ? ix + 1 : ix;
   }

   public static boolean u(int var0, int var1) {
      return var0 % var1 == 0;
   }

   public static int u(int var0) {
      if (var0 < 0) {
         throw new IllegalArgumentException("itemCount must be greater than or equal to zero");
      } else {
         return L(Math.sqrt(var0));
      }
   }

   public static long u(double var0) {
      long ix = (long)var0;
      return var0 > ix ? ix + 1L : ix;
   }

   public static float u(float var0, float var1, float var2) {
      var2 = L(var2);
      return var0 < var1 ? N(var0 + var2, var0, var1) : N(var0 - var2, var1, var0);
   }

   public static int y(float var0) {
      int ix = (int)var0;
      return var0 < ix ? ix - 1 : ix;
   }

   public static int y(float var0, int var1, int var2) {
      int ix = var2 - var1;
      return var1 + y(var0 * (ix - 1)) + (var0 > 0.0F ? 1 : 0);
   }

   public static IntStream y(int var0, int var1, int var2, int var3) {
      if (var1 > var2) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "upperBound %d expected to be > lowerBound %d", var2, var1));
      } else if (var3 < 1) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "step size expected to be >= 1, was %d", var3));
      } else {
         int ix = N(var0, var1, var2);
         return IntStream.iterate(ix, var3x -> {
            int ixx = Math.abs(ix - var3x);
            return ix - ixx >= var1 || ix + ixx <= var2;
         }, var4x -> {
            boolean flag = var4x <= ix;
            int jx = Math.abs(ix - var4x);
            boolean flag1 = ix + jx + var3 <= var2;
            if (!flag || !flag1) {
               int kx = ix - jx - (flag ? var3 : 0);
               if (kx >= var1) {
                  return kx;
               }
            }

            return ix + jx + var3;
         });
      }
   }

   public static int y(int var0, int var1) {
      return Math.floorDiv(var0, var1);
   }

   public static float y(float var0, float var1, float var2, float var3, float var4) {
      return y(R(var0, var1, var2), var3, var4);
   }

   public static long y(long var0) {
      return var0 * var0;
   }

   public static double y(double var0, double var2, double var4, double var6, double var8) {
      return u(L(var0, var2, var4), var6, var8);
   }

   public static int y(class06069 var0, int var1, int var2) {
      return var0.y(var2 - var1 + 1) + var1;
   }

   public static float y(class06069 var0, float var1, float var2) {
      return var0.z() * (var2 - var1) + var1;
   }

   public static long y(double var0) {
      long ix = (long)var0;
      return var0 < ix ? ix - 1L : ix;
   }

   public static double y(double var0, double var2, double var4) {
      if (var0 < 0.0) {
         return var2;
      } else {
         return var0 > 1.0 ? var4 : u(var0, var2, var4);
      }
   }

   public static boolean y(double var0, double var2) {
      return Math.abs(var2 - var0) < 1.0E-5F;
   }

   public static int y(int var0) {
      int ix = var0 % 360;
      if (ix >= 180) {
         ix -= 360;
      }

      if (ix < -180) {
         ix += 360;
      }

      return ix;
   }

   public static float y(float var0, float var1, float var2) {
      if (var0 < 0.0F) {
         return var1;
      } else {
         return var0 > 1.0F ? var2 : B(var0, var1, var2);
      }
   }

   @Deprecated
   public static long y(int var0, int var1, int var2) {
      long ix = var0 * 3129871 ^ var2 * 116129781L ^ var1;
      ix = ix * ix * 42317861L + ix * 11L;
      return ix >> 16;
   }

   public static boolean y(float var0, float var1) {
      return Math.abs(var1 - var0) < 1.0E-5F;
   }

   public static double E(double var0) {
      return var0 * var0;
   }

   public static double N(double var0, double var2) {
      return Math.max(Math.abs(var0), Math.abs(var2));
   }

   public static int N(double var0) {
      int ix = (int)var0;
      return var0 < ix ? ix - 1 : ix;
   }

   public static int N(int var0, int var1) {
      return Math.max(Math.abs(var0), Math.abs(var1));
   }

   public static float N(long var0) {
      float f = (float)(var0 % 360L);
      if (f >= 180.0F) {
         f -= 360.0F;
      }

      if (f < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   public static float N(byte var0) {
      return var0 * 360 / 256.0F;
   }

   public static int N(int var0) {
      return Math.abs(var0);
   }

   public static float N(float var0, float var1) {
      return Math.max(Math.abs(var0), Math.abs(var1));
   }

   public static float N(float var0) {
      return (float)Math.sqrt(var0);
   }

   public static double N(class06069 var0, double var1, double var3) {
      return var1 >= var3 ? var1 : var0.U() * (var3 - var1) + var1;
   }

   private static void N(CallbackInfo var0) {
      CompactSineLUT.init();
      U = null;
   }

   public static float N(class06069 var0, float var1, float var2) {
      return var1 >= var2 ? var1 : var0.z() * (var2 - var1) + var1;
   }

   public static int N(class06069 var0, int var1, int var2) {
      return var1 >= var2 ? var1 : var0.y(var2 - var1 + 1) + var1;
   }

   public static int N(int var0, int var1, int var2, int var3) {
      return N(var2 - var0, var3 - var1);
   }

   public static int N(double var0, int var2) {
      return N(var0 / var2) * var2;
   }

   public static Quaternionf N(Vector3f var0, Quaternionf var1, Quaternionf var2) {
      float f = var0.dot(var1.x, var1.y, var1.z);
      return var2.set(var0.x * f, var0.y * f, var0.z * f, var1.w).normalize();
   }

   public static int N(Fraction var0, int var1) {
      return var0.getNumerator() * var1 / var0.getDenominator();
   }

   public static float N(float var0, float var1, float var2, float var3, float var4) {
      return 0.5F
         * (
            2.0F * var2
               + (var3 - var1) * var0
               + (2.0F * var1 - 5.0F * var2 + 4.0F * var3 - var4) * var0 * var0
               + (3.0F * var2 - var1 - 3.0F * var3 + var4) * var0 * var0 * var0
         );
   }

   public static double N(
      double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16, double var18, double var20
   ) {
      return u(var4, N(var0, var2, var6, var8, var10, var12), N(var0, var2, var14, var16, var18, var20));
   }

   public static double N(double var0, double var2, double var4, double var6, double var8, double var10) {
      return u(var2, u(var0, var4, var6), u(var0, var8, var10));
   }

   public static class06889 N(double var0, class06889 var2, class06889 var3) {
      return new class06889(u(var0, var2.M, var3.M), u(var0, var2.B, var3.B), u(var0, var2.Z, var3.Z));
   }

   public static float N(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : Math.min(var0, var2);
   }

   public static UUID N() {
      return N(v);
   }

   public static UUID N(class06069 var0) {
      long ix = var0.B() & -61441L | 16384L;
      long jx = var0.B() & 4611686018427387903L | Long.MIN_VALUE;
      return new UUID(ix, jx);
   }

   public static int N(float var0, float var1, float var2, int var3) {
      int ix = (int)(var0 * 6.0F) % 6;
      float f = var0 * 6.0F - ix;
      float f1 = var2 * (1.0F - var1);
      float f2 = var2 * (1.0F - f * var1);
      float f3 = var2 * (1.0F - (1.0F - f) * var1);
      float f4;
      float f5;
      float f6;
      switch (ix) {
         case 0:
            f4 = var2;
            f5 = f3;
            f6 = f1;
            break;
         case 1:
            f4 = f2;
            f5 = var2;
            f6 = f1;
            break;
         case 2:
            f4 = f1;
            f5 = var2;
            f6 = f3;
            break;
         case 3:
            f4 = f1;
            f5 = f2;
            f6 = var2;
            break;
         case 4:
            f4 = f3;
            f5 = f1;
            f6 = var2;
            break;
         case 5:
            f4 = var2;
            f5 = f1;
            f6 = f2;
            break;
         default:
            throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + var0 + ", " + var1 + ", " + var2);
      }

      return class02566.y(var3, N((int)(f4 * 255.0F), 0, 255), N((int)(f5 * 255.0F), 0, 255), N((int)(f6 * 255.0F), 0, 255));
   }

   public static int N(int var0, int var1, int var2) {
      return Math.min(Math.max(var0, var1), var2);
   }

   public static int N(int var0, int var1, IntPredicate var2) {
      int ix = var1 - var0;

      while (ix > 0) {
         int jx = ix / 2;
         int kx = var0 + jx;
         if (var2.test(kx)) {
            ix = jx;
         } else {
            var0 = kx + 1;
            ix -= jx + 1;
         }
      }

      return var0;
   }

   public static int N(float var0, int var1, int var2) {
      return var1 + y(var0 * (var2 - var1));
   }

   public static long N(long var0, long var2, long var4) {
      return Math.min(Math.max(var0, var2), var4);
   }

   public static boolean N(class06889 var0, class06889 var1, class00734 var2) {
      double d0 = (var2.N + var2.u) * 0.5;
      double d1 = (var2.u - var2.N) * 0.5;
      double d2 = var0.M - d0;
      if (Math.abs(d2) > d1 && d2 * var1.M >= 0.0) {
         return false;
      } else {
         double d3 = (var2.y + var2.i) * 0.5;
         double d4 = (var2.i - var2.y) * 0.5;
         double d5 = var0.B - d3;
         if (Math.abs(d5) > d4 && d5 * var1.B >= 0.0) {
            return false;
         } else {
            double d6 = (var2.L + var2.R) * 0.5;
            double d7 = (var2.R - var2.L) * 0.5;
            double d8 = var0.Z - d6;
            if (Math.abs(d8) > d7 && d8 * var1.Z >= 0.0) {
               return false;
            } else {
               double d9 = Math.abs(var1.M);
               double d10 = Math.abs(var1.B);
               double d11 = Math.abs(var1.Z);
               double d12 = var1.B * d8 - var1.Z * d5;
               if (Math.abs(d12) > d4 * d11 + d7 * d10) {
                  return false;
               } else {
                  d12 = var1.Z * d2 - var1.M * d8;
                  if (Math.abs(d12) > d1 * d11 + d7 * d9) {
                     return false;
                  } else {
                     d12 = var1.M * d5 - var1.B * d2;
                     return Math.abs(d12) < d1 * d10 + d4 * d9;
                  }
               }
            }
         }
      }
   }

   public static double N(double var0, double var2, double var4, double var6, double var8) {
      return y(L(var0, var2, var4), var6, var8);
   }

   public static int N(String var0, int var1) {
      return NumberUtils.toInt(var0, var1);
   }

   @Deprecated
   public static long N(class00753 var0) {
      return y(var0.method_10263(), var0.method_10264(), var0.method_10260());
   }

   public static double N(double var0, double var2, double var4) {
      return var0 < var2 ? var2 : Math.min(var0, var4);
   }

   public static double W(double var0) {
      return var0 + (2.0 * class06069.y((long)N(var0 * 3000.0)).U() - 1.0) * 1.0E-7 / 2.0;
   }

   public static int R(int var0, int var1) {
      return -Math.floorDiv(-var0, var1);
   }

   public static double R(double var0, double var2, double var4) {
      return var0 * var0 + var2 * var2 + var4 * var4;
   }

   public static float R(float var0) {
      float f = var0 % 360.0F;
      if (f >= 180.0F) {
         f -= 360.0F;
      }

      if (f < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   public static double R(double var0, double var2) {
      return Math.sqrt(i(var0, var2));
   }

   public static double R(double var0) {
      return var0 - y(var0);
   }

   public static float R(float var0, float var1) {
      return (Math.abs(var0 % var1 - var1 * 0.5F) - var1 * 0.25F) / (var1 * 0.25F);
   }

   public static float R(float var0, float var1, float var2) {
      return (var0 - var1) / (var2 - var1);
   }

   public static int R(int var0) {
      var0 = i(var0) ? var0 : L(var0);
      return n[(int)(var0 * 125613361L >> 27) & 31];
   }

   static {
      for (int ix = 0; ix < 257; ix++) {
         double d0 = ix / 256.0;
         double d1 = Math.asin(d0);
         k[ix] = Math.cos(d1);
         w[ix] = d1;
      }
   }
}
