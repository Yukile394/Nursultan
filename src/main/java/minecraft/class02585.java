package minecraft;

import java.util.List;

public record class02585(class06889 force, double torque) {
   static class02585 N = new class02585(class06889.L, 0.0);

   public class02585(class06889 force, double torque) {
      this.force = force;
      this.torque = torque;
   }

   public double y() {
      return this.torque;
   }

   static class02585 N(List<class02585> var0) {
      if (var0.isEmpty()) {
         return N;
      } else {
         double d0 = 0.0;
         double d1 = 0.0;
         double d2 = 0.0;
         double d3 = 0.0;

         for (class02585 class02585 : var0) {
            class06889 class06889 = class02585.force;
            d0 += class06889.M;
            d1 += class06889.B;
            d2 += class06889.Z;
            d3 += class02585.torque;
         }

         return new class02585(new class06889(d0, d1, d2), d3);
      }
   }

   public class06889 N() {
      return this.force;
   }

   public class02585 N(double var1) {
      return new class02585(this.force.L(var1), this.torque * var1);
   }

   static double N(class06889 var0, class06889 var1) {
      return var0.Z * var1.M - var0.M * var1.Z;
   }
}
