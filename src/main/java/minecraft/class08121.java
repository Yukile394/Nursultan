package minecraft;

import org.joml.Matrix4f;

public record class08121(Matrix4f pose, class07942 movingBlockRenderState) {
   public class08121(Matrix4f pose, class07942 movingBlockRenderState) {
      this.pose = pose;
      this.movingBlockRenderState = movingBlockRenderState;
   }

   public class07942 y() {
      return this.movingBlockRenderState;
   }

   public Matrix4f N() {
      return this.pose;
   }
}
