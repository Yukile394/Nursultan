package minecraft;

public class class01775 extends class06249<class08797, class01803> {
   private static final class01894 N = class01894.y("textures/entity/breeze/breeze_wind.png");
   private final class01803 y;

   public class01775(class06252<class08797, class01803> var1, class01140 var2) {
      super(var1);
      this.y = new class01803(var2.N(class04802.q));
   }

   public void N(class01421 var1, class01237 var2, int var3, class08797 var4, float var5, float var6) {
      class07311 class07311 = class06851.N(N, this.N(var4.P) % 1.0F, 0.0F);
      var2.N(1).N(this.y, var4, var1, class07311, var3, class01384.u, -1, null, var4.l, null);
   }

   private float N(float var1) {
      return var1 * 0.02F;
   }
}
