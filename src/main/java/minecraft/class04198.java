package minecraft;

import java.util.Objects;
import org.joml.GeometryUtils;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class04198 {
   private static final Vector3fc N = new Vector3f(0.5F, 0.5F, 0.5F);

   public class04198() {
      super();
   }

   private static float y(float var0) {
      return var0 + 0.5F;
   }

   private static int N(Vector3fc[] var0, int var1, float var2, float var3, float var4) {
      for (int i = var1; i < 4; i++) {
         Vector3fc vector3fc = var0[i];
         if (var2 == vector3fc.x() && var3 == vector3fc.y() && var4 == vector3fc.z()) {
            return i;
         }
      }

      return -1;
   }

   private static void N(Vector3fc[] var0, long[] var1, class07211 var2) {
      float f = 999.0F;
      float f1 = 999.0F;
      float f2 = 999.0F;
      float f3 = -999.0F;
      float f4 = -999.0F;
      float f5 = -999.0F;

      for (int i = 0; i < 4; i++) {
         Vector3fc vector3fc = var0[i];
         float f6 = vector3fc.x();
         float f7 = vector3fc.y();
         float f8 = vector3fc.z();
         if (f6 < f) {
            f = f6;
         }

         if (f7 < f1) {
            f1 = f7;
         }

         if (f8 < f2) {
            f2 = f8;
         }

         if (f6 > f3) {
            f3 = f6;
         }

         if (f7 > f4) {
            f4 = f7;
         }

         if (f8 > f5) {
            f5 = f8;
         }
      }

      class03941 class03941 = class03941.N(var2);

      for (int k = 0; k < 4; k++) {
         class03920 class03920 = class03941.N(k);
         float f10 = class03920.N().N(f, f1, f2, f3, f4, f5);
         float f11 = class03920.y().N(f, f1, f2, f3, f4, f5);
         float f9 = class03920.L().N(f, f1, f2, f3, f4, f5);
         int j = N(var0, k, f10, f11, f9);
         if (j == -1) {
            throw new IllegalStateException("Can't find vertex to swap");
         }

         if (j != k) {
            N(var0, j, k);
            N(var1, j, k);
         }
      }
   }

   @Nullable
   private static class07211 N(Vector3f var0) {
      if (!var0.isFinite()) {
         return null;
      } else {
         class07211 class07211x = null;
         float f = 0.0F;

         for (class07211 class07211x : class07211.values()) {
            float f1 = var0.dot(class07211x.m());
            if (f1 >= 0.0F && f1 > f) {
               f = f1;
               class07211x = class07211x;
            }
         }

         return class07211x;
      }
   }

   @Nullable
   private static class07211 N(Vector3fc[] var0) {
      Vector3f vector3f = new Vector3f();
      GeometryUtils.normal(var0[0], var0[1], var0[2], vector3f);
      return N(vector3f);
   }

   private static void N(Vector3fc[] var0, int var1, int var2) {
      Vector3fc vector3fc = var0[var1];
      var0[var1] = var0[var2];
      var0[var2] = vector3fc;
   }

   private static void N(long[] var0, int var1, int var2) {
      long i = var0[var1];
      var0[var1] = var0[var2];
      var0[var2] = i;
   }

   public static class02022 N(
      class02012 var0,
      Vector3fc var1,
      Vector3fc var2,
      class02067 var3,
      class08388 var4,
      class07211 var5,
      class04673 var6,
      @Nullable class04120 var7,
      boolean var8,
      int var9
   ) {
      class02052 class02052 = var3.u();
      if (class02052 == null) {
         class02052 = N(var1, var2, var5);
      }

      Matrix4fc matrix4fc = var6.method_68012(var5);
      Vector3fc[] avector3fc = new Vector3fc[4];
      long[] along = new long[4];
      class03941 class03941 = class03941.N(var5);

      for (int i = 0; i < 4; i++) {
         N(i, class03941, class02052, var3.i(), matrix4fc, var1, var2, var4, var6.method_3509(), var7, avector3fc, along, var0);
      }

      class07211 class07211 = N(avector3fc);
      if (var7 == null && class07211 != null) {
         N(avector3fc, along, class07211);
      }

      return new class02022(
         avector3fc[0],
         avector3fc[1],
         avector3fc[2],
         avector3fc[3],
         along[0],
         along[1],
         along[2],
         along[3],
         var3.y(),
         Objects.requireNonNullElse(class07211, class07211.field_11036),
         var4,
         var8,
         var9
      );
   }

   private static void N(
      int var0,
      class03941 var1,
      class02052 var2,
      class08511 var3,
      Matrix4fc var4,
      Vector3fc var5,
      Vector3fc var6,
      class08388 var7,
      class01404 var8,
      @Nullable class04120 var9,
      Vector3fc[] var10,
      long[] var11,
      class02012 var12
   ) {
      Vector3f vector3f = var1.N(var0).N(var5, var6).div(16.0F);
      if (var9 != null) {
         N(vector3f, var9.N(), var9.u());
      }

      if (var8 != class01404.N()) {
         N(vector3f, N, var8.L());
      }

      float f = class02067.N(var2, var3, var0);
      float f1 = class02067.y(var2, var3, var0);
      float f2;
      float f3;
      if (class02054.N(var4)) {
         f3 = f;
         f2 = f1;
      } else {
         Vector3f vector3f1 = var4.transformPosition(new Vector3f(N(f), N(f1), 0.0F));
         f3 = y(vector3f1.x);
         f2 = y(vector3f1.y);
      }

      var10[var0] = var12.N(vector3f);
      var11[var0] = class04809.N(var7.method_4580(f3), var7.method_4570(f2));
   }

   private static float N(float var0) {
      return var0 - 0.5F;
   }

   private static void N(Vector3f var0, Vector3fc var1, Matrix4fc var2) {
      var0.sub(var1);
      var2.transformPosition(var0);
      var0.add(var1);
   }

   static class02052 N(Vector3fc var0, Vector3fc var1, class07211 var2) {
      return switch (var2) {
         case field_11033 -> new class02052(var0.x(), 16.0F - var1.z(), var1.x(), 16.0F - var0.z());
         case field_11036 -> new class02052(var0.x(), var0.z(), var1.x(), var1.z());
         case field_11043 -> new class02052(16.0F - var1.x(), 16.0F - var1.y(), 16.0F - var0.x(), 16.0F - var0.y());
         case field_11035 -> new class02052(var0.x(), 16.0F - var1.y(), var1.x(), 16.0F - var0.y());
         case field_11039 -> new class02052(var0.z(), 16.0F - var1.y(), var1.z(), 16.0F - var0.y());
         case field_11034 -> new class02052(16.0F - var1.z(), 16.0F - var1.y(), 16.0F - var0.z(), 16.0F - var0.y());
      };
   }
}
