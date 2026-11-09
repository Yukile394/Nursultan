package minecraft;

import java.util.EnumSet;

public class class07982 extends class07473 {
   private final class07079 N;
   private class07438 y;
   private final float L;

   @Override
   public void L() {
      class06889 class06889x = this.N.method_18798();
      class06889 class06889x = new class06889(this.y.method_23317() - this.N.method_23317(), 0.0, this.y.method_23321() - this.N.method_23321());
      if (class06889x.B() > 1.0E-7) {
         class06889x = class06889x.u().L(0.4).i(class06889x.L(0.2));
      }

      this.N.method_18800(class06889x.M, this.L, class06889x.Z);
   }

   public class07982(class07079 var1, float var2) {
      super();
      this.N = var1;
      this.L = var2;
      this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
   }

   @Override
   public boolean y() {
      return !this.N.method_24828();
   }

   @Override
   public boolean N() {
      if (this.N.method_42148()) {
         return false;
      } else {
         this.y = this.N.T();
         if (this.y == null) {
            return false;
         } else {
            double d0 = this.N.method_5858(this.y);
            if (d0 < 4.0 || d0 > 16.0) {
               return false;
            } else {
               return !this.N.method_24828() ? false : this.N.method_59922().y(y(5)) == 0;
            }
         }
      }
   }
}
