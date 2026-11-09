package minecraft;

import com.mojang.serialization.Codec;

public class class01552 extends class01469 {
   public class01552(Codec<class01466> var1) {
      super(var1);
   }

   @Override
   protected void N(class07284 var1, class06069 var2, class07209 var3, int var4, class07218 var5, class01466 var6) {
      int i = var6.u;

      for (int j = -i; j <= i; j++) {
         for (int k = -i; k <= i; k++) {
            boolean flag = j == -i;
            boolean flag1 = j == i;
            boolean flag2 = k == -i;
            boolean flag3 = k == i;
            boolean flag4 = flag || flag1;
            boolean flag5 = flag2 || flag3;
            if (!flag4 || !flag5) {
               var5.N(var3, j, var4, k);
               boolean flag6 = flag || flag5 && j == 1 - i;
               boolean flag7 = flag1 || flag5 && j == i - 1;
               boolean flag8 = flag2 || flag4 && k == 1 - i;
               boolean flag9 = flag3 || flag4 && k == i - 1;
               class00500 class00500 = var6.y.N(var2, var3);
               if (class00500.y(class00746.i) && class00500.y(class00746.L) && class00500.y(class00746.y) && class00500.y(class00746.u)) {
                  class00500 = class00500.y(class00746.i, flag6).y(class00746.L, flag7).y(class00746.y, flag8).y(class00746.u, flag9);
               }

               this.N(var1, var5, class00500);
            }
         }
      }
   }

   @Override
   protected int N(int var1, int var2, int var3, int var4) {
      return var4 <= 3 ? 0 : var3;
   }
}
