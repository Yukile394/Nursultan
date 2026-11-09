package minecraft;

public class class02740 extends class06249<class08482, class06071> {
   public class02740(class06252<class08482, class06071> var1) {
      super(var1);
   }

   public void N(class01421 var1, class01237 var2, int var3, class08482 var4, float var5, float var6) {
      class08898 class08898 = var4.J;
      if (!class08898.i() && var4.M && !var4.R) {
         float f = -0.6F;
         float f1 = 1.4F;
         if (var4.i) {
            f -= 0.2F * class04995.m(var4.P * 0.6F) + 0.2F;
            f1 -= 0.09F * class04995.m(var4.P * 0.6F);
         }

         var1.N();
         var1.N(0.1F, f1, f);
         class08898.N(var1, var2, var3, class01384.u, var4.l);
         var1.y();
      }
   }
}
