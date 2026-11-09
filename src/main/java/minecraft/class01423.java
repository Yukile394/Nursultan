package minecraft;

import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class class01423 {
   private final Matrix4f y = new Matrix4f();
   private final Matrix3f L = new Matrix3f();
   public boolean N = true;

   public void L() {
      this.y.identity();
      this.L.identity();
      this.N = true;
   }

   public class01423() {
      super();
   }

   private void i() {
      this.L.set(this.y).invert().transpose();
      this.N = false;
   }

   public class01423 u() {
      class01423 class01423 = new class01423();
      class01423.N(this);
      return class01423;
   }

   public void y(float var1, float var2, float var3) {
      this.y.scale(var1, var2, var3);
      if (Math.abs(var1) == Math.abs(var2) && Math.abs(var2) == Math.abs(var3)) {
         if (var1 < 0.0F || var2 < 0.0F || var3 < 0.0F) {
            this.L.scale(Math.signum(var1), Math.signum(var2), Math.signum(var3));
         }
      } else {
         this.L.scale(1.0F / var1, 1.0F / var2, 1.0F / var3);
         this.N = false;
      }
   }

   public Matrix3f y() {
      return this.L;
   }

   public void N(Quaternionfc var1, float var2, float var3, float var4) {
      this.y.rotateAround(var1, var2, var3, var4);
      this.L.rotate(var1);
   }

   public void N(class01423 var1) {
      this.y.set(var1.y);
      this.L.set(var1.L);
      this.N = var1.N;
   }

   public void N(Matrix4fc var1) {
      this.y.mul(var1);
      if (!class02054.y(var1)) {
         if (class02054.L(var1)) {
            this.L.mul(new Matrix3f(var1));
         } else {
            this.i();
         }
      }
   }

   public Matrix4f N(float var1, float var2, float var3) {
      return this.y.translate(var1, var2, var3);
   }

   public Vector3f N(Vector3fc var1, Vector3f var2) {
      return this.N(var1.x(), var1.y(), var1.z(), var2);
   }

   public Vector3f N(float var1, float var2, float var3, Vector3f var4) {
      Vector3f vector3f = this.L.transform(var1, var2, var3, var4);
      return this.N ? vector3f : vector3f.normalize();
   }

   public Matrix4f N() {
      return this.y;
   }

   public void N(Quaternionfc var1) {
      this.y.rotate(var1);
      this.L.rotate(var1);
   }
}
