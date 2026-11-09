package minecraft;

public class class02714 extends class02840<class07654, class08450, class06079> {
   private static final class01894 N = class01894.y("textures/entity/parrot/parrot_red_blue.png");
   private static final class01894 i = class01894.y("textures/entity/parrot/parrot_blue.png");
   private static final class01894 R = class01894.y("textures/entity/parrot/parrot_green.png");
   private static final class01894 M = class01894.y("textures/entity/parrot/parrot_yellow_blue.png");
   private static final class01894 B = class01894.y("textures/entity/parrot/parrot_grey.png");

   public class02714(class04832 var1) {
      super(var1, new class06079(var1.N(class04802.LT)), 0.3F);
   }

   public class08450 method_55269() {
      return new class08450();
   }

   public class01894 N(class08450 var1) {
      return N(var1.N);
   }

   public void method_62354(class07654 var1, class08450 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.m();
      float f = class04995.B(var3, var1.i, var1.y);
      float f1 = class04995.B(var3, var1.u, var1.L);
      var2.y = (class04995.m(f) + 1.0F) * f1;
      var2.L = class06079.N(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class01894 N(class07648 var0) {
      return switch (var0) {
         case field_41550 -> N;
         case field_41551 -> i;
         case field_41552 -> R;
         case field_41553 -> M;
         case field_41554 -> B;
      };
   }
}
