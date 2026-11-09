package minecraft;

public class class05504 extends class02795<class04626, class08801, class05486> {
   private static final class01894 N = class01894.y("textures/entity/bee/bee_angry.png");
   private static final class01894 i = class01894.y("textures/entity/bee/bee_angry_nectar.png");
   private static final class01894 R = class01894.y("textures/entity/bee/bee.png");
   private static final class01894 M = class01894.y("textures/entity/bee/bee_nectar.png");

   public class05504(class04832 var1) {
      super(var1, new class05486(var1.N(class04802.t)), new class05486(var1.N(class04802.G)), 0.4F);
   }

   public class08801 method_55269() {
      return new class08801();
   }

   public void method_62354(class04626 var1, class08801 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.u(var3);
      var2.y = !var1.NJ();
      var2.L = var1.method_24828() && var1.method_18798().B() < 1.0E-7;
      var2.u = var1.P_();
      var2.i = var1.NI();
   }

   public class01894 N(class08801 var1) {
      if (var1.u) {
         return var1.i ? i : N;
      } else {
         return var1.i ? M : R;
      }
   }
}
