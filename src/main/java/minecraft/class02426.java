package minecraft;

public class class02426 extends class06249<class08442, class04535> {
   private static final class01894 N = class01894.y("textures/entity/sheep/sheep_wool.png");
   private final class06078<class08442> y;
   private final class06078<class08442> L;

   public class02426(class06252<class08442, class04535> var1, class01140 var2) {
      super(var1);
      this.y = new class04539(var2.N(class04802.uN));
      this.L = new class04539(var2.N(class04802.Lr));
   }

   public void N(class01421 var1, class01237 var2, int var3, class08442 var4, float var5, float var6) {
      if (!var4.L) {
         class06078<class08442> class06078 = var4.NB ? this.L : this.y;
         if (var4.v) {
            if (var4.y()) {
               var2.N(class06078, var4, var1, class06851.j(N), var3, class02294.N(var4, 0.0F), -16777216, null, var4.l, null);
            }
         } else {
            N(class06078, N, var1, var2, var3, var4, var4.N(), 0);
         }
      }
   }
}
