package minecraft;

public record class01699(float x, float y, float z, float u, float v) {
   public static final float L = 16.0F;

   public float L() {
      return this.z / 16.0F;
   }

   public float M() {
      return this.u;
   }

   public class01699(float x, float y, float z, float u, float v) {
      this.x = x;
      this.y = y;
      this.z = z;
      this.u = u;
      this.v = v;
   }

   public float B() {
      return this.v;
   }

   public float i() {
      return this.y;
   }

   public float u() {
      return this.x;
   }

   public float y() {
      return this.y / 16.0F;
   }

   public float N() {
      return this.x / 16.0F;
   }

   public class01699 N(float var1, float var2) {
      return new class01699(this.x, this.y, this.z, var1, var2);
   }

   public float R() {
      return this.z;
   }
}
