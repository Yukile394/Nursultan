package minecraft;

public class class08528 extends class06249<class08442, class04535> {
   private static final class01894 N = class01894.y("textures/entity/sheep/sheep_wool_undercoat.png");
   private final class06078<class08442> y;
   private final class06078<class08442> L;

   public class08528(class06252<class08442, class04535> var1, class01140 var2) {
      super(var1);
      this.y = new class04539(var2.N(class04802.uy));
      this.L = new class04539(var2.N(class04802.uL));
   }

   public void N(class01421 var1, class01237 var2, int var3, class08442 var4, float var5, float var6) {
      if (!var4.v && (var4.i || var4.u != class06563.field_7952)) {
         N(var4.NB ? this.L : this.y, N, var1, var2, var3, var4, var4.N(), 1);
      }
   }
}
