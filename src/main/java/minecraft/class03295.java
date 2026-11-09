package minecraft;

import java.util.Locale;

record class03295(String dimensionName, double x, double y, double z, float yRot, float xRot) {
   public double L() {
      return this.x;
   }

   public float M() {
      return this.xRot;
   }

   class03295(String dimensionName, double x, double y, double z, float yRot, float xRot) {
      super();
      this.dimensionName = dimensionName;
      this.x = x;
      this.y = y;
      this.z = z;
      this.yRot = yRot;
      this.xRot = xRot;
   }

   public double i() {
      return this.z;
   }

   public double u() {
      return this.y;
   }

   public String y() {
      return this.dimensionName;
   }

   String N() {
      return String.format(Locale.ROOT, "t %s %.2f %.2f %.2f %.2f %.2f\n", this.dimensionName, this.x, this.y, this.z, this.yRot, this.xRot);
   }

   public float R() {
      return this.yRot;
   }
}
