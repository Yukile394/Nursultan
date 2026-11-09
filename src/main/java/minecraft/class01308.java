package minecraft;

import java.util.EnumSet;
import java.util.List;

class class01308 extends class07473 {
   @Override
   public void L() {
      List<class00717> list = this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class06165.u);
      if (!list.isEmpty()) {
         this.N.f().N(list.get(0), 1.2F);
      }
   }

   public class01308(class06165 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public void i() {
      List<class00717> list = this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class06165.u);
      if (this.N.method_6118(class07085.field_6173).R() && !list.isEmpty()) {
         this.N.f().N(list.get(0), 1.2F);
      }
   }

   @Override
   public boolean N() {
      if (!this.N.method_6118(class07085.field_6173).R()) {
         return false;
      } else if (this.N.T() != null || this.N.method_6065() != null) {
         return false;
      } else if (!this.N.Q()) {
         return false;
      } else {
         return this.N.method_59922().y(y(10)) != 0
            ? false
            : !this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class06165.u).isEmpty()
               && this.N.method_6118(class07085.field_6173).R();
      }
   }
}
