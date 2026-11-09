package minecraft;

public class class02543 extends class01430<class08786, class04816> {
   private static final class01894 N = class01894.y("textures/entity/creeper/creeper_armor.png");
   private final class04816 y;

   public class02543(class06252<class08786, class04816> var1, class01140 var2) {
      super(var1);
      this.y = new class04816(var2.N(class04802.Nd));
   }

   protected class04816 L() {
      return this.y;
   }

   @Override
   protected class01894 N() {
      return N;
   }

   protected boolean N(class08786 var1) {
      return var1.y;
   }

   @Override
   protected float N(float var1) {
      return var1 * 0.01F;
   }
}
