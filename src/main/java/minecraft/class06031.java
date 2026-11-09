package minecraft;

import org.joml.Quaternionf;

public record class06031(class01423 pose, class08800 entityRenderState, Quaternionf rotation) {
   public Quaternionf L() {
      return this.rotation;
   }

   public class06031(class01423 pose, class08800 entityRenderState, Quaternionf rotation) {
      super();
      this.pose = pose;
      this.entityRenderState = entityRenderState;
      this.rotation = rotation;
   }

   public class08800 y() {
      return this.entityRenderState;
   }

   public class01423 N() {
      return this.pose;
   }
}
