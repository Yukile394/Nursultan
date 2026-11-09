package minecraft;

public class class05567 implements class04417<class07134> {
   private static final double N = 0.01;
   private final class06143 y;

   public class05567(class06143 var1) {
      super();
      this.y = var1;
   }

   public class04406 method_3090(
      class07134 var1, class03448 var2, double var3, double var5, double var7, double var9, double var11, double var13, class06069 var15
   ) {
      class05571 class05571 = new class05571(var2, var3, var5, var7, 0.0, 0.0, 0.0, this.y);
      class05571.method_74305(1.0F, 0.9F, 1.0F);
      class05571.method_34753(var9 * 0.01 / 2.0, var11 * 0.01, var13 * 0.01 / 2.0);
      byte b0 = 10;
      byte b1 = 40;
      class05571.method_3077(var15.y(30) + 10);
      return class05571;
   }
}
