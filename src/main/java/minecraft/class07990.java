package minecraft;

import java.util.EnumSet;

public class class07990 extends class07473 {
   private final class06171 N;

   @Override
   public void L() {
      this.N.f().W();
   }

   public class07990(class06171 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
   }

   @Override
   public void u() {
      this.N.N(null);
   }

   @Override
   public boolean N() {
      if (!this.N.method_5805()) {
         return false;
      } else if (this.N.method_5799()) {
         return false;
      } else if (!this.N.method_24828()) {
         return false;
      } else if (this.N.field_6037) {
         return false;
      } else {
         class08036 class08036 = this.N.N();
         return class08036 == null ? false : !(this.N.method_5858(class08036) > 16.0);
      }
   }
}
