package minecraft;

import java.util.List;
import org.joml.Matrix4f;

public record class08130(Matrix4f pose, float radius, List<class08453> pieces) {
   public List<class08453> L() {
      return this.pieces;
   }

   public class08130(Matrix4f pose, float radius, List<class08453> pieces) {
      super();
      this.pose = pose;
      this.radius = radius;
      this.pieces = pieces;
   }

   public float y() {
      return this.radius;
   }

   public Matrix4f N() {
      return this.pose;
   }
}
