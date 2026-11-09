package minecraft;

import java.util.EnumSet;

class class07139 extends class07473 {
   private final class07162 N;
   private float y;
   private int L;

   public class07139(class07162 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18406));
   }

   @Override
   public void i() {
      if (--this.L <= 0) {
         this.L = this.N(40 + this.N.method_59922().y(60));
         this.y = this.N.method_59922().y(360);
      }

      class07458 class07458 = this.N.F();
      if (class07458 instanceof class07143) {
         ((class07143)class07458).N(this.y, false);
      }
   }

   @Override
   public boolean N() {
      return this.N.T() == null
         && (this.N.method_24828() || this.N.method_5799() || this.N.method_5771() || this.N.method_6059(class07047.d))
         && this.N.F() instanceof class07143;
   }
}
