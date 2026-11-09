package minecraft;

public class class08477 extends class01430<class08268, class03095> {
   private static final class01894 N = class01894.y("textures/entity/wither/wither_armor.png");
   private final class03095 y;

   public class08477(class06252<class08268, class03095> var1, class01140 var2) {
      super(var1);
      this.y = new class03095(var2.N(class04802.iE));
   }

   protected class03095 L() {
      return this.y;
   }

   @Override
   protected class01894 N() {
      return N;
   }

   protected boolean N(class08268 var1) {
      return var1.u;
   }

   @Override
   protected float N(float var1) {
      return class04995.P(var1 * 0.02F) * 3.0F;
   }
}
