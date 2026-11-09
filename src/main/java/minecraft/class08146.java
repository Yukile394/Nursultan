package minecraft;

import org.joml.Matrix4f;

public record class08146(Matrix4f pose, class08804 leashState) {
   public class08146(Matrix4f pose, class08804 leashState) {
      super();
      this.pose = pose;
      this.leashState = leashState;
   }

   public class08804 y() {
      return this.leashState;
   }

   public Matrix4f N() {
      return this.pose;
   }
}
