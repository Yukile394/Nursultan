package minecraft;

public class class01771 extends class04507<class02260, class08800> {
   private static final class01894 N = class01894.y("textures/entity/projectiles/wind_charge.png");
   private final class01767 y;

   public class01771(class04832 var1) {
      super(var1);
      this.y = new class01767(var1.N(class04802.iZ));
   }

   protected float N(float var1) {
      return var1 * 0.03F;
   }

   @Override
   public void method_3936(class08800 var1, class01421 var2, class01237 var3, class06959 var4) {
      var3.N(this.y, var1, var2, class06851.N(N, this.N(var1.P) % 1.0F, 0.0F), var1.G, class01384.u, var1.l, null);
      super.method_3936(var1, var2, var3, var4);
   }

   @Override
   public class08800 method_55269() {
      return new class08800();
   }
}
