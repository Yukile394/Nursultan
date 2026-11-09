package minecraft;

import java.util.EnumSet;

class class07161 extends class07473 {
   private final class07162 N;

   public class07161(class07162 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
      var1.f().N(true);
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      if (this.N.method_59922().z() < 0.8F) {
         this.N.A().y();
      }

      class07458 class07458 = this.N.F();
      if (class07458 instanceof class07143) {
         ((class07143)class07458).N(1.2);
      }
   }

   @Override
   public boolean N() {
      return (this.N.method_5799() || this.N.method_5771()) && this.N.F() instanceof class07143;
   }
}
