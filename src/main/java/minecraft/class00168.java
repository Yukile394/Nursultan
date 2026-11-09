package minecraft;

public record class00168(
   double x0, double y0, double z0, double x1, double y1, double z1, float offsetX, float offsetY, float offsetZ, float red, float green, float blue
) {
   public double L() {
      return this.z0;
   }

   public float M() {
      return this.offsetX;
   }

   public class00168(double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15) {
      this(var1, var3, var5, var7, var9, var11, 0.0F, 0.0F, 0.0F, var13, var14, var15);
   }

   public class00168(
      double x0, double y0, double z0, double x1, double y1, double z1, float offsetX, float offsetY, float offsetZ, float red, float green, float blue
   ) {
      super();
      this.x0 = x0;
      this.y0 = y0;
      this.z0 = z0;
      this.x1 = x1;
      this.y1 = y1;
      this.z1 = z1;
      this.offsetX = offsetX;
      this.offsetY = offsetY;
      this.offsetZ = offsetZ;
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public float B() {
      return this.offsetY;
   }

   public float Z() {
      return this.offsetZ;
   }

   public double i() {
      return this.y1;
   }

   public float U() {
      return this.green;
   }

   public float z() {
      return this.red;
   }

   public double u() {
      return this.x1;
   }

   public double y() {
      return this.y0;
   }

   public float E() {
      return this.blue;
   }

   public double N() {
      return this.x0;
   }

   public double R() {
      return this.z1;
   }
}
