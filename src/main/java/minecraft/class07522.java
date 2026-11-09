package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

class class07522 extends class07473 {
   private final class07475 N;
   private double y;
   private double L;
   private double u;
   private final double i;
   private final class07299 R;

   @Override
   public void L() {
      this.N.f().N(this.y, this.L, this.u, this.i);
   }

   @Nullable
   private class06889 M() {
      class06069 class06069 = this.N.method_59922();
      class07209 class07209x = this.N.method_24515();

      for (int ix = 0; ix < 10; ix++) {
         class07209 class07209x = class07209x.method_10069(class06069.y(20) - 10, 2 - class06069.y(8), class06069.y(20) - 10);
         if (this.R.method_8320(class07209x).N(class00869.K)) {
            return class06889.L(class07209x);
         }
      }

      return null;
   }

   public class07522(class07475 var1, double var2) {
      super();
      this.N = var1;
      this.i = var2;
      this.R = var1.method_73183();
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public boolean y() {
      return !this.N.f().U();
   }

   @Override
   public boolean N() {
      if (!this.R.method_8530()) {
         return false;
      } else if (this.N.method_5799()) {
         return false;
      } else {
         class06889 class06889 = this.M();
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
