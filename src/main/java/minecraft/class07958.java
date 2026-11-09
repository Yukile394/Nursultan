package minecraft;

import java.util.EnumSet;

public class class07958 extends class07473 {
   private final class07453 N;

   @Override
   public void L() {
      this.N.f().W();
      this.N.B(true);
   }

   public class07958(class07453 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
   }

   @Override
   public void u() {
      this.N.B(false);
   }

   @Override
   public boolean y() {
      return this.N.NJ();
   }

   @Override
   public boolean N() {
      boolean flag = this.N.NJ();
      if (!flag && !this.N.NQ()) {
         return false;
      } else if (this.N.method_5799()) {
         return false;
      } else if (!this.N.method_24828()) {
         return false;
      } else {
         class07438 class07438 = this.N.L_();
         if (class07438 == null || class07438.method_73183() != this.N.method_73183()) {
            return true;
         } else {
            return this.N.method_5858(class07438) < 144.0 && class07438.method_6065() != null ? false : flag;
         }
      }
   }
}
