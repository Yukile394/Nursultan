package minecraft;

public class class06602 {
   private class06889 N = class06889.L;
   private float y;
   private float L;
   private double u;
   private double i;
   private double R;
   private double M;
   private double B;
   private double Z;
   private float z;
   private float U;

   public double L(float var1) {
      return class04995.u((double)var1, this.B, this.i);
   }

   public float M(float var1) {
      float f = this.y - this.L;
      return -(this.y + f * var1);
   }

   public class06602() {
      super();
   }

   public float B(float var1) {
      return class04995.B(var1, this.L, this.y);
   }

   public void i(float var1) {
      this.U = this.z;
      this.z = this.z + (var1 - this.z) * 0.4F;
   }

   public double u(float var1) {
      return class04995.u((double)var1, this.Z, this.R);
   }

   public void y() {
      this.U = this.z;
      this.z = 0.0F;
   }

   public double y(float var1) {
      return class04995.u((double)var1, this.M, this.u);
   }

   public class06889 N() {
      return this.N;
   }

   public void N(class06889 var1, class06889 var2) {
      this.L = this.y;
      this.N = var2;
      this.N(var1);
   }

   private void N(class06889 var1) {
      this.M = this.u;
      this.B = this.i;
      this.Z = this.R;
      double d0 = var1.N() - this.u;
      double d1 = var1.y() - this.i;
      double d2 = var1.L() - this.R;
      double d3 = 10.0;
      if (!(d0 > 10.0) && !(d0 < -10.0)) {
         this.u += d0 * 0.25;
      } else {
         this.u = var1.N();
         this.M = this.u;
      }

      if (!(d1 > 10.0) && !(d1 < -10.0)) {
         this.i += d1 * 0.25;
      } else {
         this.i = var1.y();
         this.B = this.i;
      }

      if (!(d2 > 10.0) && !(d2 < -10.0)) {
         this.R += d2 * 0.25;
      } else {
         this.R = var1.L();
         this.Z = this.R;
      }
   }

   public void N(float var1) {
      this.y += var1;
   }

   public float R(float var1) {
      return class04995.B(var1, this.U, this.z);
   }
}
