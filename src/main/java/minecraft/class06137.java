package minecraft;

import Nursultan.class10558;

abstract class class06137 extends class07473 {
   private final class01328 y;

   protected boolean M() {
      class07209 class07209 = class07209.method_49637(this.N.method_23317(), this.N.method_5829().i, this.N.method_23321());
      return !this.N.method_73183().N_17(class07209) && this.N.u(class07209) >= 0.0F;
   }

   class06137(class06165 var1) {
      super();
      this.N = var1;
      this.y = class01328.N().N(12.0).u().N(new class10558(this.N));
   }

   protected boolean Z() {
      return !N_18(this.N.method_73183()).N(class07438.class, this.y, this.N, this.N.method_5829().L(12.0, 6.0, 12.0)).isEmpty();
   }
}
