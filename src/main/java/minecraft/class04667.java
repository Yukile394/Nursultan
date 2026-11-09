package minecraft;

public class class04667 extends class06249<class08796, class04660> {
   private static final class01894 N = class01894.y("textures/entity/cat/cat_collar.png");
   private final class04660 y;
   private final class04660 L;

   public class04667(class06252<class08796, class04660> var1, class01140 var2) {
      super(var1);
      this.y = new class04660(var2.N(class04802.f));
      this.L = new class04660(var2.N(class04802.A));
   }

   public void N(class01421 var1, class01237 var2, int var3, class08796 var4, float var5, float var6) {
      class06563 class06563 = var4.L;
      if (class06563 != null) {
         int i = class06563.L();
         N(var4.NB ? this.L : this.y, N, var1, var2, var3, var4, i, 1);
      }
   }
}
