package minecraft;

public class class02577 extends class06249<class08278, class04817> {
   private static final class01894 N = class01894.y("textures/entity/zombie/drowned_outer_layer.png");
   private final class04817 y;
   private final class04817 L;

   public class02577(class06252<class08278, class04817> var1, class01140 var2) {
      super(var1);
      this.y = new class04817(var2.N(class04802.NA));
      this.L = new class04817(var2.N(class04802.Np));
   }

   public void N(class01421 var1, class01237 var2, int var3, class08278 var4, float var5, float var6) {
      N(var4.NB ? this.L : this.y, N, var1, var2, var3, var4, -1, 1);
   }
}
