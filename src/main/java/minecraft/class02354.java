package minecraft;

public class class02354 extends class02795<class07879, class08481, class04528> {
   private static final class01894 N = class01894.y("textures/entity/rabbit/brown.png");
   private static final class01894 i = class01894.y("textures/entity/rabbit/white.png");
   private static final class01894 R = class01894.y("textures/entity/rabbit/black.png");
   private static final class01894 M = class01894.y("textures/entity/rabbit/gold.png");
   private static final class01894 B = class01894.y("textures/entity/rabbit/salt.png");
   private static final class01894 Z = class01894.y("textures/entity/rabbit/white_splotched.png");
   private static final class01894 z = class01894.y("textures/entity/rabbit/toast.png");
   private static final class01894 U = class01894.y("textures/entity/rabbit/caerbannog.png");

   public class02354(class04832 var1) {
      super(var1, new class04528(var1.N(class04802.LF)), new class04528(var1.N(class04802.LA)), 0.3F);
   }

   public class08481 method_55269() {
      return new class08481();
   }

   public void method_62354(class07879 var1, class08481 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.u(var3);
      var2.y = N(var1, "Toast");
      var2.L = var1.v();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class01894 N(class08481 var1) {
      if (var1.y) {
         return z;
      } else {
         return switch (var1.L) {
            case field_41561 -> N;
            case field_41562 -> i;
            case field_41563 -> R;
            case field_41565 -> M;
            case field_41566 -> B;
            case field_41564 -> Z;
            case field_41567 -> U;
         };
      }
   }
}
