package minecraft;

import java.util.EnumSet;

public class class07427 extends class07473 {
   private final class07079 N;

   public class07427(class07079 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18407));
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
   }

   @Override
   public boolean N() {
      return this.N.method_5799() && this.N.method_5861(class01231.N) > this.N.method_29241() || this.N.method_5771();
   }
}
