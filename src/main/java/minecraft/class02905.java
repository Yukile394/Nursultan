package minecraft;

public class class02905 extends class04507<class07513, class08276> {
   private static final class01894 N = class01894.y("textures/entity/wither/wither_invulnerable.png");
   private static final class01894 y = class01894.y("textures/entity/wither/wither.png");
   private final class04384 L;

   public class02905(class04832 var1) {
      super(var1);
      this.L = new class04384(var1.N(class04802.is));
   }

   public class08276 method_55269() {
      return new class08276();
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04792.N().N("head", class04822.L().N(0, 35).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), class04838.N);
      return class04806.N(class04792, 64, 64);
   }

   public void method_62354(class07513 var1, class08276 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.M();
      var2.y.N = 0.0F;
      var2.y.y = var1.method_61415(var3);
      var2.y.L = var1.method_61414(var3);
   }

   protected int method_24087(class07513 var1, class07209 var2) {
      return 15;
   }

   public void method_3936(class08276 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.y(-1.0F, -1.0F, 1.0F);
      var3.N(this.L, var1.y, var2, this.L.method_23500(this.N(var1)), var1.G, class01384.u, var1.l, null);
      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }

   private class01894 N(class08276 var1) {
      return var1.N ? N : y;
   }
}
