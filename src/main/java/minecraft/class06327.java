package minecraft;

public record class06327(
   class01423 pose, class07311 renderType, class08887 model, float r, float g, float b, int lightCoords, int overlayCoords, int outlineColor
) {
   public class08887 L() {
      return this.model;
   }

   public int M() {
      return this.lightCoords;
   }

   public class06327(class01423 pose, class07311 renderType, class08887 model, float r, float g, float b, int lightCoords, int overlayCoords, int outlineColor) {
      super();
      this.pose = pose;
      this.renderType = renderType;
      this.model = model;
      this.r = r;
      this.g = g;
      this.b = b;
      this.lightCoords = lightCoords;
      this.overlayCoords = overlayCoords;
      this.outlineColor = outlineColor;
   }

   public int B() {
      return this.overlayCoords;
   }

   public int Z() {
      return this.outlineColor;
   }

   public float i() {
      return this.g;
   }

   public float u() {
      return this.r;
   }

   public class07311 y() {
      return this.renderType;
   }

   public class01423 N() {
      return this.pose;
   }

   public float R() {
      return this.b;
   }
}
