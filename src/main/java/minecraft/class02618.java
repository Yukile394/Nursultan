package minecraft;

public class class02618 extends class02840<class00680, class08268, class03095> {
   private static final class01894 N = class01894.y("textures/entity/wither/wither_invulnerable.png");
   private static final class01894 i = class01894.y("textures/entity/wither/wither.png");

   public class02618(class04832 var1) {
      super(var1, new class03095(var1.N(class04802.iU)), 1.0F);
      this.N(new class08477(this, var1.R()));
   }

   public class08268 method_55269() {
      return new class08268();
   }

   public class01894 N(class08268 var1) {
      int ix = class04995.y(var1.L);
      return ix > 0 && (ix > 80 || ix / 5 % 2 != 1) ? N : i;
   }

   protected void y(class08268 var1, class01421 var2) {
      float f = 2.0F;
      if (var1.L > 0.0F) {
         f -= var1.L / 220.0F * 0.5F;
      }

      var2.y(f, f, f);
   }

   public void method_62354(class00680 var1, class08268 var2, float var3) {
      super.method_62354(var1, var2, var3);
      int ix = var1.m();
      var2.L = ix > 0 ? ix - var3 : 0.0F;
      System.arraycopy(var1.W(), 0, var2.N, 0, var2.N.length);
      System.arraycopy(var1.E(), 0, var2.y, 0, var2.y.length);
      var2.u = var1.v();
   }

   protected int method_24087(class00680 var1, class07209 var2) {
      return 15;
   }
}
