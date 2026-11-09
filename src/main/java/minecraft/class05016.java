package minecraft;

public class class05016 {
   private double N;
   private double y;
   private double L;

   public class05016() {
      super();
   }

   public double N(double var1, double var3) {
      this.N += var1;
      double d0 = this.N - this.y;
      double d1 = class04995.u(0.5, this.L, d0);
      double d2 = Math.signum(d0);
      if (d2 * d0 > d2 * this.L) {
         d0 = d1;
      }

      this.L = d1;
      this.y += d0 * var3;
      return d0 * var3;
   }

   public void N() {
      this.N = 0.0;
      this.y = 0.0;
      this.L = 0.0;
   }
}
