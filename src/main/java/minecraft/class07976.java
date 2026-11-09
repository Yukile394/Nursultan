package minecraft;

import java.util.EnumSet;

public class class07976 extends class07473 {
   private final class07475 N;
   private double y;
   private double L;
   private double u;
   private final double i;

   @Override
   public void L() {
      this.N.f().N(this.y, this.L, this.u, this.i);
   }

   public class07976(class07475 var1, double var2) {
      super();
      this.N = var1;
      this.i = var2;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public boolean y() {
      return !this.N.f().U();
   }

   @Override
   public boolean N() {
      if (this.N.NP()) {
         return false;
      } else {
         class06889 class06889 = class05475.N(this.N, 16, 7, class06889.L(this.N.Ns()), (float) (Math.PI / 2));
         if (class06889 == null) {
            return false;
         } else {
            this.y = class06889.M;
            this.L = class06889.B;
            this.u = class06889.Z;
            return true;
         }
      }
   }
}
