package minecraft;

public class class05546 extends class02650<class05574> {
   private static final class01894 N = class01894.y("textures/entity/squid/glow_squid.png");

   public class05546(class04832 var1, class04388 var2, class04388 var3) {
      super(var1, var2, var3);
   }

   @Override
   public class01894 N(class08255 var1) {
      return N;
   }

   protected int method_24087(class05574 var1, class07209 var2) {
      int i = (int)class04995.y(1.0F - var1.v() / 10.0F, 0.0F, 15.0F);
      return i == 15 ? 15 : Math.max(i, super.method_24087(var1, var2));
   }
}
