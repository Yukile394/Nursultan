package minecraft;

import org.joml.Math;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public record class04120(Vector3fc origin, class04122 value, boolean rescale, Matrix4fc transform) {
   public boolean L() {
      return this.rescale;
   }

   public class04120(Vector3fc var1, class04122 var2, boolean var3) {
      this(var1, var2, var3, N(var2, var3));
   }

   public class04120(Vector3fc origin, class04122 value, boolean rescale, Matrix4fc transform) {
      this.origin = origin;
      this.value = value;
      this.rescale = rescale;
      this.transform = transform;
   }

   public Matrix4fc u() {
      return this.transform;
   }

   public class04122 y() {
      return this.value;
   }

   private static float N(Matrix4fc var0, class07185 var1, Vector3f var2) {
      Vector3f vector3f = var2.set(var1.u().m());
      Vector3f vector3f1 = var0.transformDirection(vector3f);
      float f = Math.abs(vector3f1.x);
      float f1 = Math.abs(vector3f1.y);
      float f2 = Math.abs(vector3f1.z);
      float f3 = Math.max(Math.max(f, f1), f2);
      return 1.0F / f3;
   }

   private static Matrix4f N(class04122 var0, boolean var1) {
      Matrix4f matrix4f = var0.N();
      if (var1 && !class02054.N(matrix4f)) {
         Vector3fc vector3fc = N(matrix4f);
         matrix4f.scale(vector3fc);
      }

      return matrix4f;
   }

   private static Vector3fc N(Matrix4fc var0) {
      Vector3f vector3f = new Vector3f();
      float f = N(var0, class07185.field_11048, vector3f);
      float f1 = N(var0, class07185.field_11052, vector3f);
      float f2 = N(var0, class07185.field_11051, vector3f);
      return vector3f.set(f, f1, f2);
   }

   public Vector3fc N() {
      return this.origin;
   }
}
