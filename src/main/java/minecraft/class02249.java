package minecraft;

public class class02249 extends class06249<class08798, class03114> {
   public class02249(class06252<class08798, class03114> var1) {
      super(var1);
   }

   public void N(class01421 var1, class01237 var2, int var3, class08798 var4, float var5, float var6) {
      class08898 class08898 = var4.J;
      if (!class08898.i()) {
         var1.N();
         float f = 1.0F;
         float f1 = -1.0F;
         float f2 = class04995.L(var4.h) / 60.0F;
         if (var4.h < 0.0F) {
            var1.N(0.0F, 1.0F - f2 * 0.5F, -1.0F + f2 * 0.5F);
         } else {
            var1.N(0.0F, 1.0F + f2 * 0.8F, -1.0F + f2 * 0.2F);
         }

         class08898.N(var1, var2, var3, class01384.u, var4.l);
         var1.y();
      }
   }
}
