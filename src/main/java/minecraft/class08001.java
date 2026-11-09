package minecraft;

import java.util.EnumSet;

class class08001 extends class07473 {
   public class08001(class08042 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public void i() {
      class07209 class07209x = this.N.E();
      if (class07209x == null) {
         class07209x = this.N.method_24515();
      }

      for (int i = 0; i < 3; i++) {
         class07209 class07209x = class07209x.method_10069(class08042.i(this.N).y(15) - 7, class08042.R(this.N).y(11) - 5, class08042.M(this.N).y(15) - 7);
         if (this.N.method_73183().R(class07209x)) {
            class08042.B(this.N).N(class07209x.method_10263() + 0.5, class07209x.method_10264() + 0.5, class07209x.method_10260() + 0.5, 0.25);
            if (this.N.T() == null) {
               this.N.p().N(class07209x.method_10263() + 0.5, class07209x.method_10264() + 0.5, class07209x.method_10260() + 0.5, 180.0F, 20.0F);
            }
            break;
         }
      }
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean N() {
      return !this.N.F().y() && class08042.u(this.N).y(y(7)) == 0;
   }
}
