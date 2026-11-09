package minecraft;

import java.util.EnumSet;

public class class03559 extends class07473 {
   private final class07079 N;
   private final class07299 y;

   public class03559(class07079 var1, class07299 var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.N_71(EnumSet.of(class07430.field_18407));
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      this.N.A().y();
   }

   @Override
   public boolean N() {
      if ((this.N.field_28628 || this.N.field_27857) && this.N.method_5864().N(class01217.Z)) {
         class07209 class07209 = this.N.method_24515().method_10084();
         class00500 class00500 = this.y.method_8320(class07209);
         return class00500.N(class00869.ba) || class00500.M(this.y, class07209) == class00389.N();
      } else {
         return false;
      }
   }
}
