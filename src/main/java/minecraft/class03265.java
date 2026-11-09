package minecraft;

import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public record class03265(Vector3fc rotation, Vector3fc translation, Vector3fc scale) {
   public static final class03265 N = new class03265(new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F));

   public Vector3fc L() {
      return this.scale;
   }

   public class03265(Vector3fc rotation, Vector3fc translation, Vector3fc scale) {
      super();
      this.rotation = rotation;
      this.translation = translation;
      this.scale = scale;
   }

   public Vector3fc y() {
      return this.translation;
   }

   public void N(boolean var1, class01423 var2) {
      if (this == N) {
         var2.N(-0.5F, -0.5F, -0.5F);
      } else {
         float f;
         float f1;
         float f2;
         if (var1) {
            f = -this.translation.x();
            f1 = -this.rotation.y();
            f2 = -this.rotation.z();
         } else {
            f = this.translation.x();
            f1 = this.rotation.y();
            f2 = this.rotation.z();
         }

         var2.N(f, this.translation.y(), this.translation.z());
         var2.N(new Quaternionf().rotationXYZ(this.rotation.x() * (float) (Math.PI / 180.0), f1 * (float) (Math.PI / 180.0), f2 * (float) (Math.PI / 180.0)));
         var2.y(this.scale.x(), this.scale.y(), this.scale.z());
         var2.N(-0.5F, -0.5F, -0.5F);
      }
   }

   public Vector3fc N() {
      return this.rotation;
   }
}
