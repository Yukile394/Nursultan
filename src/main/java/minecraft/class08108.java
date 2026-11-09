package minecraft;

import org.joml.Vector3f;

public record class08108<S>(class08107<S> modelSubmit, class07311 renderType, Vector3f position) {
   public Vector3f L() {
      return this.position;
   }

   public class08108(class08107<S> modelSubmit, class07311 renderType, Vector3f position) {
      this.modelSubmit = modelSubmit;
      this.renderType = renderType;
      this.position = position;
   }

   public class07311 y() {
      return this.renderType;
   }

   public class08107<S> N() {
      return this.modelSubmit;
   }
}
