package minecraft;

import org.joml.Matrix4f;
import org.joml.Vector3fc;

public record class04136(class07185 axis, float angle) implements class04122 {
   public float L() {
      return this.angle;
   }

   public class04136(class07185 axis, float angle) {
      this.axis = axis;
      this.angle = angle;
   }

   public class07185 y() {
      return this.axis;
   }

   @Override
   public Matrix4f N() {
      Matrix4f matrix4f = new Matrix4f();
      if (this.angle == 0.0F) {
         return matrix4f;
      } else {
         Vector3fc vector3fc = this.axis.u().m();
         matrix4f.rotation(this.angle * (float) (Math.PI / 180.0), vector3fc);
         return matrix4f;
      }
   }
}
