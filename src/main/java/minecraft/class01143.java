package minecraft;

public record class01143(class01423 pose, class00500 state, int lightCoords, int overlayCoords, int outlineColor) {
   public int L() {
      return this.lightCoords;
   }

   public class01143(class01423 pose, class00500 state, int lightCoords, int overlayCoords, int outlineColor) {
      this.pose = pose;
      this.state = state;
      this.lightCoords = lightCoords;
      this.overlayCoords = overlayCoords;
      this.outlineColor = outlineColor;
   }

   public int i() {
      return this.outlineColor;
   }

   public int u() {
      return this.overlayCoords;
   }

   public class00500 y() {
      return this.state;
   }

   public class01423 N() {
      return this.pose;
   }
}
