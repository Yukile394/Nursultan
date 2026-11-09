package minecraft;

import org.joml.Matrix4f;

public record class08142(Matrix4f pose, float x, float y, class00392 text, int lightCoords, int color, int backgroundColor, double distanceToCameraSq) {
   public float L() {
      return this.y;
   }

   public int M() {
      return this.backgroundColor;
   }

   public class08142(Matrix4f pose, float x, float y, class00392 text, int lightCoords, int color, int backgroundColor, double distanceToCameraSq) {
      this.pose = pose;
      this.x = x;
      this.y = y;
      this.text = text;
      this.lightCoords = lightCoords;
      this.color = color;
      this.backgroundColor = backgroundColor;
      this.distanceToCameraSq = distanceToCameraSq;
   }

   public double B() {
      return this.distanceToCameraSq;
   }

   public int i() {
      return this.lightCoords;
   }

   public class00392 u() {
      return this.text;
   }

   public float y() {
      return this.x;
   }

   public Matrix4f N() {
      return this.pose;
   }

   public int R() {
      return this.color;
   }
}
