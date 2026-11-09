package minecraft;

import java.util.EnumSet;

class class08032 extends class07473 {
   @Override
   public void L() {
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         class06889 class06889 = class07438.method_33571();
         class08042.y(this.N).N(class06889.M, class06889.B, class06889.Z, 1.0);
      }

      this.N.N(true);
      this.N.method_5783(class04909.gB, 1.0F, 1.0F);
   }

   public class08032(class08042 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         if (this.N.method_5829().L(class07438.method_5829())) {
            this.N.method_6121(N_18(this.N.method_73183()), class07438);
            this.N.N(false);
         } else if (this.N.method_5858(class07438) < 9.0) {
            class06889 class06889 = class07438.method_33571();
            class08042.L(this.N).N(class06889.M, class06889.B, class06889.Z, 1.0);
         }
      }
   }

   @Override
   public void u() {
      this.N.N(false);
   }

   @Override
   public boolean y() {
      return this.N.F().y() && this.N.W() && this.N.T() != null && this.N.T().method_5805();
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.T();
      return class07438 != null && class07438.method_5805() && !this.N.F().y() && class08042.N(this.N).y(y(7)) == 0
         ? this.N.method_5858(class07438) > 4.0
         : false;
   }
}
