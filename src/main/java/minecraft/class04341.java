package minecraft;

import org.joml.Vector3fc;

public record class04341(float timestamp, Vector3fc preTarget, Vector3fc postTarget, class04342 interpolation) {
   public Vector3fc L() {
      return this.postTarget;
   }

   public class04341(float var1, Vector3fc var2, class04342 var3) {
      this(var1, var2, var2, var3);
   }

   public class04341(float timestamp, Vector3fc preTarget, Vector3fc postTarget, class04342 interpolation) {
      this.timestamp = timestamp;
      this.preTarget = preTarget;
      this.postTarget = postTarget;
      this.interpolation = interpolation;
   }

   public class04342 u() {
      return this.interpolation;
   }

   public Vector3fc y() {
      return this.preTarget;
   }

   public float N() {
      return this.timestamp;
   }
}
