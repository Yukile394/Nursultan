package minecraft;

import java.util.EnumSet;

class class08010 extends class07466 {
   @Override
   public void L() {
      super.L();
      this.u.method_16826(0);
   }

   public class08010(class07079 var1) {
      super(var1, 6, class08011.N);
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public boolean y() {
      return ((class08011)this.u).NQ() && super.y();
   }

   @Override
   public boolean N() {
      class08011 class08011 = (class08011)this.u;
      return class08011.NQ() && class08011.N(class08011).y(y(10)) == 0 && super.N();
   }
}
