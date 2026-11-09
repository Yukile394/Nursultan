package minecraft;

public class class00066<M extends class08684> extends class06249<class08670, M> {
   private final class07311 N;
   private final class08684 y;
   private final class08684 L;

   public class00066(class06252<class08670, M> var1, class01140 var2, class01894 var3) {
      super(var1);
      this.N = class06851.M(var3);
      this.y = new class08684(var2.N(class04802.yj));
      this.L = new class08684(var2.N(class04802.yv));
   }

   public void N(class01421 var1, class01237 var2, int var3, class08670 var4, float var5, float var6) {
      if (var4.L && var4.N.N(class01226.NH)) {
         class08684 class08684 = var4.NB ? this.L : this.y;
         var2.N(class08684, var4, var1, this.N, var3, class01384.u, var4.l, null);
      }
   }
}
