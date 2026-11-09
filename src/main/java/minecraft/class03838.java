package minecraft;

public class class03838 extends class02840<class07523, class08462, class06379> {
   private static final class01894 N = class01894.y("textures/entity/ghast/ghast.png");
   private static final class01894 i = class01894.y("textures/entity/ghast/ghast_shooting.png");

   public class03838(class04832 var1) {
      super(var1, new class06379(var1.N(class04802.yM)), 1.5F);
   }

   public class08462 method_55269() {
      return new class08462();
   }

   public void method_62354(class07523 var1, class08462 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.M();
   }

   public class01894 N(class08462 var1) {
      return var1.N ? i : N;
   }
}
