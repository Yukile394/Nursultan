package minecraft;

public record class08453(float relativeX, float relativeY, float relativeZ, class00494 shapeBelow, float alpha) {
   public float L() {
      return this.relativeZ;
   }

   public class08453(float relativeX, float relativeY, float relativeZ, class00494 shapeBelow, float alpha) {
      super();
      this.relativeX = relativeX;
      this.relativeY = relativeY;
      this.relativeZ = relativeZ;
      this.shapeBelow = shapeBelow;
      this.alpha = alpha;
   }

   public float i() {
      return this.alpha;
   }

   public class00494 u() {
      return this.shapeBelow;
   }

   public float y() {
      return this.relativeY;
   }

   public float N() {
      return this.relativeX;
   }
}
