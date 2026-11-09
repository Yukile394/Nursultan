package minecraft;

import java.util.EnumSet;

public class class07959 extends class07473 {
   private final class07862 N;
   private final double y;
   private double L;
   private double u;
   private double i;

   @Override
   public void L() {
      this.N.f().N(this.L, this.u, this.i, this.y);
   }

   public class07959(class07862 var1, double var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public void i() {
      if (!this.N.I() && this.N.method_59922().y(this.N(50)) == 0) {
         class07049 class07049 = this.N.method_31483();
         if (class07049 == null) {
            return;
         }

         if (class07049 instanceof class08036 class08036) {
            int ix = this.N.Ng();
            int j = this.N.NV();
            if (j > 0 && this.N.method_59922().y(j) < ix) {
               this.N.u(class08036);
               return;
            }

            this.N.z(5);
         }

         this.N.method_5772();
         this.N.NC();
         this.N.method_73183().method_8421(this.N, (byte)6);
      }
   }

   @Override
   public boolean y() {
      return !this.N.I() && !this.N.f().U() && this.N.method_5782();
   }

   @Override
   public boolean N() {
      if (!this.N.B() && !this.N.I() && this.N.method_5782()) {
         class06889 class06889 = class05475.N(this.N, 5, 4);
         if (class06889 == null) {
            return false;
         } else {
            this.L = class06889.M;
            this.u = class06889.B;
            this.i = class06889.Z;
            return true;
         }
      } else {
         return false;
      }
   }
}
