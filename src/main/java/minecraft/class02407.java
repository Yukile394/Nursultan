package minecraft;

public class class02407 extends class06249<class08473, class04390> {
   private final class04390 N;

   public class02407(class06252<class08473, class04390> var1, class01140 var2) {
      super(var1);
      this.N = new class04390(var2.N(class04802.uT));
   }

   public void N(class01421 var1, class01237 var2, int var3, class08473 var4, float var5, float var6) {
      boolean flag = var4.y() && var4.v;
      if (!var4.v || flag) {
         int i = class02294.N(var4, 0.0F);
         if (flag) {
            var2.N(1).N(this.N, var4, var1, class06851.j(class02180.N), var3, i, -1, null, var4.l, null);
         } else {
            var2.N(1).N(this.N, var4, var1, class06851.z(class02180.N), var3, i, -1, null, var4.l, null);
         }
      }
   }
}
