package minecraft;

import org.apache.commons.lang3.tuple.Triple;
import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class class02054 {
   private static final float N = 3.0F + 2.0F * Math.sqrt(2.0F);
   private static final class03585 y = class03585.N((float) (java.lang.Math.PI / 4));

   public static boolean L(Matrix4fc var0) {
      return N(var0, 16);
   }

   private class02054() {
      super();
   }

   public static boolean y(Matrix4fc var0) {
      return N(var0, 8);
   }

   private static boolean y(Matrix4fc var0, int var1) {
      return (var0.properties() & var1) != 0;
   }

   public static boolean N(Matrix4fc var0, int var1) {
      if (y(var0, var1)) {
         return true;
      } else if (var0 instanceof Matrix4f) {
         ((Matrix4f)var0).determineProperties();
         return y(var0, var1);
      } else {
         return false;
      }
   }

   public static boolean N(Matrix4fc var0) {
      return N(var0, 4);
   }

   public static Triple<Quaternionf, Vector3f, Quaternionf> N(Matrix3f var0) {
      Matrix3f matrix3f = new Matrix3f(var0);
      matrix3f.transpose();
      matrix3f.mul(var0);
      Quaternionf quaternionf = N(matrix3f, 5);
      float f = matrix3f.m00;
      float f1 = matrix3f.m11;
      boolean flag = f < 1.0E-6;
      boolean flag1 = f1 < 1.0E-6;
      Matrix3f matrix3f1 = var0.rotate(quaternionf);
      Quaternionf quaternionf1 = new Quaternionf();
      Quaternionf quaternionf2 = new Quaternionf();
      class03585 class03585;
      if (flag) {
         class03585 = N(matrix3f1.m11, -matrix3f1.m10);
      } else {
         class03585 = N(matrix3f1.m00, matrix3f1.m01);
      }

      Quaternionf quaternionf3 = class03585.L(quaternionf2);
      Matrix3f matrix3f2 = class03585.L(matrix3f);
      quaternionf1.mul(quaternionf3);
      matrix3f2.transpose().mul(matrix3f1);
      if (flag) {
         class03585 = N(matrix3f2.m22, -matrix3f2.m20);
      } else {
         class03585 = N(matrix3f2.m00, matrix3f2.m02);
      }

      class03585 = class03585.N();
      Quaternionf quaternionf4 = class03585.y(quaternionf2);
      Matrix3f matrix3f3 = class03585.y(matrix3f1);
      quaternionf1.mul(quaternionf4);
      matrix3f3.transpose().mul(matrix3f2);
      if (flag1) {
         class03585 = N(matrix3f3.m22, -matrix3f3.m21);
      } else {
         class03585 = N(matrix3f3.m11, matrix3f3.m12);
      }

      Quaternionf quaternionf5 = class03585.N(quaternionf2);
      Matrix3f matrix3f4 = class03585.N(matrix3f2);
      quaternionf1.mul(quaternionf5);
      matrix3f4.transpose().mul(matrix3f3);
      Vector3f vector3f = new Vector3f(matrix3f4.m00, matrix3f4.m11, matrix3f4.m22);
      return Triple.of(quaternionf1, vector3f, quaternionf.conjugate());
   }

   public static Matrix4f N(Matrix4f var0, float var1) {
      return var0.set(
         var0.m00() * var1,
         var0.m01() * var1,
         var0.m02() * var1,
         var0.m03() * var1,
         var0.m10() * var1,
         var0.m11() * var1,
         var0.m12() * var1,
         var0.m13() * var1,
         var0.m20() * var1,
         var0.m21() * var1,
         var0.m22() * var1,
         var0.m23() * var1,
         var0.m30() * var1,
         var0.m31() * var1,
         var0.m32() * var1,
         var0.m33() * var1
      );
   }

   private static void N(Matrix3f var0, Matrix3f var1) {
      var0.mul(var1);
      var1.transpose();
      var1.mul(var0);
      var0.set(var1);
   }

   private static void N(Matrix3f var0, Matrix3f var1, Quaternionf var2, Quaternionf var3) {
      if (var0.m01 * var0.m01 + var0.m10 * var0.m10 > 1.0E-6F) {
         class03585 class03585xx = N(var0.m00, 0.5F * (var0.m01 + var0.m10), var0.m11);
         Quaternionf quaternionf = class03585xx.L(var2);
         var3.mul(quaternionf);
         class03585xx.L(var1);
         N(var0, var1);
      }

      if (var0.m02 * var0.m02 + var0.m20 * var0.m20 > 1.0E-6F) {
         class03585 class03585x = N(var0.m00, 0.5F * (var0.m02 + var0.m20), var0.m22).N();
         Quaternionf quaternionf1 = class03585x.y(var2);
         var3.mul(quaternionf1);
         class03585x.y(var1);
         N(var0, var1);
      }

      if (var0.m12 * var0.m12 + var0.m21 * var0.m21 > 1.0E-6F) {
         class03585 class03585 = N(var0.m11, 0.5F * (var0.m12 + var0.m21), var0.m22);
         Quaternionf quaternionf2 = class03585.N(var2);
         var3.mul(quaternionf2);
         class03585.N(var1);
         N(var0, var1);
      }
   }

   public static Quaternionf N(Matrix3f var0, int var1) {
      Quaternionf quaternionf = new Quaternionf();
      Matrix3f matrix3f = new Matrix3f();
      Quaternionf quaternionf1 = new Quaternionf();

      for (int i = 0; i < var1; i++) {
         N(var0, matrix3f, quaternionf1, quaternionf);
      }

      quaternionf.normalize();
      return quaternionf;
   }

   private static class03585 N(float var0, float var1, float var2) {
      float f = 2.0F * (var0 - var2);
      return N * var1 * var1 < f * f ? class03585.N(var1, f) : y;
   }

   private static class03585 N(float var0, float var1) {
      float f = (float)java.lang.Math.hypot(var0, var1);
      float f1 = f > 1.0E-6F ? var1 : 0.0F;
      float f2 = Math.abs(var0) + Math.max(f, 1.0E-6F);
      if (var0 < 0.0F) {
         float f3 = f1;
         f1 = f2;
         f2 = f3;
      }

      return class03585.N(f1, f2);
   }
}
