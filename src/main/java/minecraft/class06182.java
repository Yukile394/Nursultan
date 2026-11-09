package minecraft;

import java.util.EnumSet;

class class06182 extends class07473 {
   final class06163 N;
   final double y;
   final double L;

   class06182(class06163 var1, class06163 var2, double var3, double var5) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var3;
      this.L = var5;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public void i() {
      class07209 class07209 = this.N.E();
      if (class07209 != null && class06163.y(this.u).U()) {
         if (this.N(class07209, 10.0)) {
            class06889 class06889 = new class06889(
                  class07209.method_10263() - this.N.method_23317(),
                  class07209.method_10264() - this.N.method_23318(),
                  class07209.method_10260() - this.N.method_23321()
               )
               .u()
               .L(10.0)
               .y(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
            class06163.L(this.u).N(class06889.M, class06889.B, class06889.Z, this.L);
         } else {
            class06163.u(this.u).N((double)class07209.method_10263(), (double)class07209.method_10264(), (double)class07209.method_10260(), this.L);
         }
      }
   }

   @Override
   public void u() {
      this.N.N(null);
      class06163.N(this.u).W();
   }

   private boolean N(class07209 var1, double var2) {
      return !var1.method_19769(this.N.method_73189(), var2);
   }

   @Override
   public boolean N() {
      class07209 class07209 = this.N.E();
      return class07209 != null && this.N(class07209, this.y);
   }
}
