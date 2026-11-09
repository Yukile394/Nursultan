package minecraft;

public class class02639 extends class02840<class08042, class08261, class03856> {
   private static final class01894 N = class01894.y("textures/entity/illager/vex.png");
   private static final class01894 i = class01894.y("textures/entity/illager/vex_charging.png");

   public class02639(class04832 var1) {
      super(var1, new class03856(var1.N(class04802.uC)), 0.3F);
      this.N(new class02758<>(this));
   }

   public class08261 method_55269() {
      return new class08261();
   }

   protected int method_24087(class08042 var1, class07209 var2) {
      return 15;
   }

   public class01894 N(class08261 var1) {
      return var1.N ? i : N;
   }

   public void method_62354(class08042 var1, class08261 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class08827.N(var1, var2, this.L, var3);
      var2.N = var1.W();
   }
}
