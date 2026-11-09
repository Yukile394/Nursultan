package minecraft;

public class class03637 extends class02840<class03630, class02805, class03629> {
   private static final class01894 N = class01894.y("textures/entity/allay/allay.png");

   public class03637(class04832 var1) {
      super(var1, new class03629(var1.N(class04802.L)), 0.4F);
      this.N(new class02758<>(this));
   }

   public class02805 method_55269() {
      return new class02805();
   }

   public class01894 N(class02805 var1) {
      return N;
   }

   public void method_62354(class03630 var1, class02805 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class08827.N(var1, var2, this.L, var3);
      var2.N = var1.E();
      var2.y = var1.W();
      var2.L = var1.i(var3);
      var2.u = var1.u(var3);
   }

   protected int method_24087(class03630 var1, class07209 var2) {
      return 15;
   }
}
