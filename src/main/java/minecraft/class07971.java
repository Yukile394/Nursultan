package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class07971 extends class07473 {
   private final class07475 N;
   @Nullable
   private class07438 y;
   private double L;
   private double u;
   private double i;
   private final double R;
   private final float M;

   @Override
   public void L() {
      this.N.f().N(this.L, this.u, this.i, this.R);
   }

   public class07971(class07475 var1, double var2, float var4) {
      super();
      this.N = var1;
      this.R = var2;
      this.M = var4;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public void u() {
      this.y = null;
   }

   @Override
   public boolean y() {
      return !this.N.f().U() && this.y.method_5805() && this.y.method_5858(this.N) < this.M * this.M;
   }

   @Override
   public boolean N() {
      this.y = this.N.T();
      if (this.y == null) {
         return false;
      } else if (this.y.method_5858(this.N) > this.M * this.M) {
         return false;
      } else {
         class06889 class06889 = class05475.N(this.N, 16, 7, this.y.method_73189(), (float) (Math.PI / 2));
         if (class06889 == null) {
            return false;
         } else {
            this.L = class06889.M;
            this.u = class06889.B;
            this.i = class06889.Z;
            return true;
         }
      }
   }
}
