package minecraft;

import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public interface class01391 {
   default class01391 y(class01423 var1, Vector3f var2) {
      return this.y(var1, var2.x(), var2.y(), var2.z());
   }

   default class01391 y(class01423 var1, float var2, float var3, float var4) {
      Matrix3f matrix3f = var1.y();
      float f = MatrixHelper.transformNormalX(matrix3f, var2, var3, var4);
      float f1 = MatrixHelper.transformNormalY(matrix3f, var2, var3, var4);
      float f2 = MatrixHelper.transformNormalZ(matrix3f, var2, var3, var4);
      if (!var1.N) {
         float f3 = Math.invsqrt(Math.fma(f, f, Math.fma(f1, f1, f2 * f2)));
         f *= f3;
         f1 *= f3;
         f2 *= f3;
      }

      return this.method_22914(f, f1, f2);
   }

   default void N(float var1, float var2, float var3, int var4, float var5, float var6, int var7, int var8, float var9, float var10, float var11) {
      this.method_22912(var1, var2, var3);
      this.method_39415(var4);
      this.method_22913(var5, var6);
      this.method_22922(var7);
      this.method_60803(var8);
      this.method_22914(var9, var10, var11);
   }

   default class01391 N(class01423 var1, Vector3f var2) {
      return this.N(var1, var2.x(), var2.y(), var2.z());
   }

   default class01391 N_26(Vector3fc var1) {
      return this.method_22912(var1.x(), var1.y(), var1.z());
   }

   default void N(class01423 var1, class02022 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9) {
      Vector3fc vector3fc = var2.U().m();
      Matrix4f matrix4f = var1.N();
      Vector3f vector3f = var1.N(vector3fc, new Vector3f());
      int i = var2.m();

      for (int j = 0; j < 4; j++) {
         Vector3fc vector3fc1 = var2.N(j);
         long k = var2.y(j);
         float f = var3[j];
         int l = class02566.N(var7, f * var4, f * var5, f * var6);
         int i1 = class03042.y(var8[j], i);
         Vector3f vector3f1 = matrix4f.transformPosition(vector3fc1, new Vector3f());
         float f1 = class04809.N(k);
         float f2 = class04809.y(k);
         this.N(vector3f1.x(), vector3f1.y(), vector3f1.z(), l, f1, f2, var9, i1, vector3f.x(), vector3f.y(), vector3f.z());
      }
   }

   default void N(class01423 var1, class02022 var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      this.N(var1, var2, new float[]{1.0F, 1.0F, 1.0F, 1.0F}, var3, var4, var5, var6, new int[]{var7, var7, var7, var7}, var8);
   }

   default class01391 N(Matrix4fc var1, float var2, float var3, float var4) {
      float f = MatrixHelper.transformPositionX(var1, var2, var3, var4);
      float f1 = MatrixHelper.transformPositionY(var1, var2, var3, var4);
      float f2 = MatrixHelper.transformPositionZ(var1, var2, var3, var4);
      return this.method_22912(f, f1, f2);
   }

   default class01391 N(Matrix3x2fc var1, float var2, float var3) {
      Vector2f vector2f = var1.transformPosition(var2, var3, new Vector2f());
      return this.method_22912(vector2f.x(), vector2f.y(), 0.0F);
   }

   default class01391 N(class01423 var1, float var2, float var3, float var4) {
      return this.N(var1.N(), var2, var3, var4);
   }

   class01391 method_1336(int var1, int var2, int var3, int var4);

   default class01391 method_22915(float var1, float var2, float var3, float var4) {
      return this.method_1336((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   default class01391 method_22922(int var1) {
      return this.method_60796(var1 & 65535, var1 >> 16 & 65535);
   }

   default class01391 method_60803(int var1) {
      return this.method_22921(var1 & 65535, var1 >> 16 & 65535);
   }

   class01391 method_22913(float var1, float var2);

   class01391 method_22912(float var1, float var2, float var3);

   class01391 method_39415(int var1);

   class01391 method_22914(float var1, float var2, float var3);

   class01391 method_60796(int var1, int var2);

   class01391 method_22921(int var1, int var2);

   class01391 method_75298(float var1);
}
