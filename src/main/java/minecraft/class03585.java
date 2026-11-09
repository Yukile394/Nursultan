package minecraft;

import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Quaternionf;

public record class03585(float sinHalf, float cosHalf) {
   public Quaternionf L(Quaternionf var1) {
      return var1.set(0.0F, 0.0F, this.sinHalf, this.cosHalf);
   }

   public Matrix3f L(Matrix3f var1) {
      var1.m02 = 0.0F;
      var1.m12 = 0.0F;
      var1.m20 = 0.0F;
      var1.m21 = 0.0F;
      float f = this.y();
      float f1 = this.L();
      var1.m00 = f;
      var1.m11 = f;
      var1.m01 = f1;
      var1.m10 = -f1;
      var1.m22 = 1.0F;
      return var1;
   }

   public float L() {
      return 2.0F * this.sinHalf * this.cosHalf;
   }

   public class03585(float sinHalf, float cosHalf) {
      this.sinHalf = sinHalf;
      this.cosHalf = cosHalf;
   }

   public float i() {
      return this.cosHalf;
   }

   public float u() {
      return this.sinHalf;
   }

   public Matrix3f y(Matrix3f var1) {
      var1.m01 = 0.0F;
      var1.m10 = 0.0F;
      var1.m12 = 0.0F;
      var1.m21 = 0.0F;
      float f = this.y();
      float f1 = this.L();
      var1.m00 = f;
      var1.m22 = f;
      var1.m02 = -f1;
      var1.m20 = f1;
      var1.m11 = 1.0F;
      return var1;
   }

   public Quaternionf y(Quaternionf var1) {
      return var1.set(0.0F, this.sinHalf, 0.0F, this.cosHalf);
   }

   public float y() {
      return this.cosHalf * this.cosHalf - this.sinHalf * this.sinHalf;
   }

   public Quaternionf N(Quaternionf var1) {
      return var1.set(this.sinHalf, 0.0F, 0.0F, this.cosHalf);
   }

   public class03585 N() {
      return new class03585(-this.sinHalf, this.cosHalf);
   }

   public Matrix3f N(Matrix3f var1) {
      var1.m01 = 0.0F;
      var1.m02 = 0.0F;
      var1.m10 = 0.0F;
      var1.m20 = 0.0F;
      float f = this.y();
      float f1 = this.L();
      var1.m11 = f;
      var1.m22 = f;
      var1.m12 = f1;
      var1.m21 = -f1;
      var1.m00 = 1.0F;
      return var1;
   }

   public static class03585 N(float var0) {
      float f = Math.sin(var0 / 2.0F);
      float f1 = Math.cosFromSin(f, var0 / 2.0F);
      return new class03585(f, f1);
   }

   public static class03585 N(float var0, float var1) {
      float f = Math.invsqrt(var0 * var0 + var1 * var1);
      return new class03585(f * var0, f * var1);
   }
}
