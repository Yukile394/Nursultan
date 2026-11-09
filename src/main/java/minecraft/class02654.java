package minecraft;

public class class02654 extends class03739<class08037, class08254> {
   public static final class01894 N = class01894.y("textures/entity/projectiles/arrow.png");
   public static final class01894 y = class01894.y("textures/entity/projectiles/tipped_arrow.png");

   public class02654(class04832 var1) {
      super(var1);
   }

   protected class01894 N(class08254 var1) {
      return var1.N ? y : N;
   }

   public class08254 method_55269() {
      return new class08254();
   }

   public void method_62354(class08037 var1, class08254 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.m() > 0;
   }
}
