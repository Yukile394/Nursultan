package minecraft;

import org.joml.Vector3fc;

public record class07604(Vector3fc forwardVector) {
   public class07604(Vector3fc forwardVector) {
      this.forwardVector = forwardVector;
   }

   public Vector3fc N() {
      return this.forwardVector;
   }
}
