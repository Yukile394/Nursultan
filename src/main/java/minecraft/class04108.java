package minecraft;

import org.joml.Matrix4f;

public record class04108(float x, float y, float z) implements class04122 {
   public float L() {
      return this.y;
   }

   public class04108(float x, float y, float z) {
      super();
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public float u() {
      return this.z;
   }

   public float y() {
      return this.x;
   }

   @Override
   public Matrix4f N() {
      return new Matrix4f().rotationZYX(this.z * (float) (Math.PI / 180.0), this.y * (float) (Math.PI / 180.0), this.x * (float) (Math.PI / 180.0));
   }
}
