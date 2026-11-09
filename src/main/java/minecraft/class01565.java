package minecraft;

import com.mojang.serialization.Codec;

public class class01565 extends class01469 {
   public class01565(Codec<class01466> var1) {
      super(var1);
   }

   @Override
   protected void N(class07284 var1, class06069 var2, class07209 var3, int var4, class07218 var5, class01466 var6) {
      for (int i = var4 - 3; i <= var4; i++) {
         int j = i < var4 ? var6.u : var6.u - 1;
         int k = var6.u - 2;

         for (int l = -j; l <= j; l++) {
            for (int i1 = -j; i1 <= j; i1++) {
               boolean flag = l == -j;
               boolean flag1 = l == j;
               boolean flag2 = i1 == -j;
               boolean flag3 = i1 == j;
               boolean flag4 = flag || flag1;
               boolean flag5 = flag2 || flag3;
               if (i >= var4 || flag4 != flag5) {
                  var5.N(var3, l, i, i1);
                  class00500 class00500 = var6.y.N(var2, var3);
                  if (class00500.y(class00746.i)
                     && class00500.y(class00746.L)
                     && class00500.y(class00746.y)
                     && class00500.y(class00746.u)
                     && class00500.y(class00746.R)) {
                     class00500 = class00500.y(class00746.R, i >= var4 - 1)
                        .y(class00746.i, l < -k)
                        .y(class00746.L, l > k)
                        .y(class00746.y, i1 < -k)
                        .y(class00746.u, i1 > k);
                  }

                  this.N(var1, var5, class00500);
               }
            }
         }
      }
   }

   @Override
   protected int N(int var1, int var2, int var3, int var4) {
      int i = 0;
      if (var4 < var2 && var4 >= var2 - 3) {
         i = var3;
      } else if (var4 == var2) {
         i = var3;
      }

      return i;
   }
}
