package minecraft;

public class class02881 extends class02840<class07140, class08473, class05569> {
   private static final class01894 N = class01894.y("textures/entity/slime/magmacube.png");

   public class02881(class04832 var1) {
      super(var1, new class05569(var1.N(class04802.yF)), 0.25F);
   }

   public class08473 method_55269() {
      return new class08473();
   }

   protected float u(class08473 var1) {
      return var1.y * 0.25F;
   }

   public class01894 N(class08473 var1) {
      return N;
   }

   public void method_62354(class07140 var1, class08473 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = class04995.B(var3, var1.R, var1.i);
      var2.y = var1.t();
   }

   protected void y(class08473 var1, class01421 var2) {
      int i = var1.y;
      float f = var1.N / (i * 0.5F + 1.0F);
      float f1 = 1.0F / (f + 1.0F);
      var2.y(f1 * i, 1.0F / f1 * i, f1 * i);
   }

   protected int method_24087(class07140 var1, class07209 var2) {
      return 15;
   }
}
