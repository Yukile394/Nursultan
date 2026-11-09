package minecraft;

public record class02455(int x, int z, int bottomY, int topY, float uOffset, float vOffset, int lightCoords) {

   public int L() {
      return this.bottomY;
   }

   public int M() {
      return this.lightCoords;
   }

   public class02455(int x, int z, int bottomY, int topY, float uOffset, float vOffset, int lightCoords) {
      this.x = x;
      this.z = z;
      this.bottomY = bottomY;
      this.topY = topY;
      this.uOffset = uOffset;
      this.vOffset = vOffset;
      this.lightCoords = lightCoords;
   }

   public float i() {
      return this.uOffset;
   }

   public int u() {
      return this.topY;
   }

   public int y() {
      return this.z;
   }

   public int N() {
      return this.x;
   }

   public float R() {
      return this.vOffset;
   }
}
