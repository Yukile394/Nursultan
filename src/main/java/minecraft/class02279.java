package minecraft;

public class class02279 extends class04507<class00700, class08800> {
   private static final class01894 N = class01894.y("textures/entity/lead_knot.png");
   private final class05575 y;

   public class02279(class04832 var1) {
      super(var1);
      this.y = new class05575(var1.N(class04802.ye));
   }

   @Override
   public void method_3936(class08800 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.y(-1.0F, -1.0F, 1.0F);
      var3.N(this.y, var1, var2, this.y.method_23500(N), var1.G, class01384.u, var1.l, null);
      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }

   @Override
   public class08800 method_55269() {
      return new class08800();
   }
}
