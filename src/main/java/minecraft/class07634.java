package minecraft;

import java.util.EnumSet;
import java.util.List;

class class07634 extends class07473 {
   private int y;

   @Override
   public void L() {
      if (this.N.method_6118(class07085.field_6173).R()) {
         List<class00717> list = this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class07637::N);
         if (!list.isEmpty()) {
            this.N.f().N(list.getFirst(), 1.2F);
         }
      } else {
         this.N.NJ();
      }

      this.y = 0;
   }

   public class07634(class07637 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public void i() {
      if (!this.N.m() && !this.N.method_6118(class07085.field_6173).R()) {
         this.N.NJ();
      }
   }

   @Override
   public void u() {
      class06584 class06584 = this.N.method_6118(class07085.field_6173);
      if (!class06584.R()) {
         this.N.method_5775(N_18(this.N.method_73183()), class06584);
         this.N.method_5673(class07085.field_6173, class06584.E);
         int i = this.N.Q() ? class07637.M(this.N).y(50) + 10 : class07637.B(this.N).y(150) + 10;
         this.y = this.N.field_6012 + i * 20;
      }

      this.N.N(false);
   }

   @Override
   public boolean y() {
      return !this.N.method_5799() && (this.N.Q() || class07637.i(this.N).y(y(600)) != 1) ? class07637.R(this.N).y(y(2000)) != 1 : false;
   }

   @Override
   public boolean N() {
      if (this.y > this.N.field_6012 || this.N.method_6109() || this.N.method_5799() || !this.N.No() || this.N.B() > 0) {
         return false;
      } else {
         return !this.N.method_6118(class07085.field_6173).R()
            ? true
            : !this.N.method_73183().N(class00717.class, this.N.method_5829().L(6.0, 6.0, 6.0), class07637::N).isEmpty();
      }
   }
}
