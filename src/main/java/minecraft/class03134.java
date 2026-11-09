package minecraft;

public class class03134 extends class04507<class08028, class08800> {
   private static final class01894 N = class01894.y("textures/entity/enderdragon/dragon_fireball.png");
   private static final class07311 y = class06851.M(N);

   public class03134(class04832 var1) {
      super(var1);
   }

   private static void N(class01391 var0, class01423 var1, int var2, float var3, int var4, int var5, int var6) {
      var0.N(var1, var3 - 0.5F, var4 - 0.25F, 0.0F)
         .method_39415(-1)
         .method_22913(var5, var6)
         .method_22922(class01384.u)
         .method_60803(var2)
         .y(var1, 0.0F, 1.0F, 0.0F);
   }

   protected int method_24087(class08028 var1, class07209 var2) {
      return 15;
   }

   @Override
   public void method_3936(class08800 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.y(2.0F, 2.0F, 2.0F);
      var2.N(var4.i);
      var3.N(var2, y, (var1x, var2x) -> {
         N(var2x, var1x, var1.G, 0.0F, 0, 0, 1);
         N(var2x, var1x, var1.G, 1.0F, 0, 1, 1);
         N(var2x, var1x, var1.G, 1.0F, 1, 1, 0);
         N(var2x, var1x, var1.G, 0.0F, 1, 0, 0);
      });
      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }

   @Override
   public class08800 method_55269() {
      return new class08800();
   }
}
