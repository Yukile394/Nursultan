package minecraft;

public class class04019 {
   public final class06069 N;
   private double y;
   private boolean L;

   public class04019(class06069 var1) {
      super();
      this.N = var1;
   }

   public double y() {
      if (this.L) {
         this.L = false;
         return this.y;
      } else {
         double d0;
         double d1;
         double d2;
         do {
            d0 = 2.0 * this.N.U() - 1.0;
            d1 = 2.0 * this.N.U() - 1.0;
            d2 = class04995.E(d0) + class04995.E(d1);
         } while (d2 >= 1.0 || d2 == 0.0);

         double d3 = Math.sqrt(-2.0 * Math.log(d2) / d2);
         this.y = d1 * d3;
         this.L = true;
         return d0 * d3;
      }
   }

   public void N() {
      this.L = false;
   }
}
