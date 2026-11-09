package minecraft;

import com.mojang.serialization.Codec;

public class class01536 extends class06391<class06225> {
   public class01536(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      int i = 0;
      class05974 class05974 = var1.y();
      class07209 class07209xx = var1.i();
      class06069 class06069 = var1.u();
      int j = class05974.method_8624(class07830.field_13200, class07209xx.method_10263(), class07209xx.method_10260());
      class07209 class07209x = new class07209(class07209xx.method_10263(), j, class07209xx.method_10260());
      if (class05974.method_8320(class07209x).N(class00869.K)) {
         class00500 class00500x = class00869.Wh.W();
         class00500 class00500x = class00869.Wr.W();
         int k = 1 + class06069.y(10);

         for (int l = 0; l <= k; l++) {
            if (class05974.method_8320(class07209x).N(class00869.K)
               && class05974.method_8320(class07209x.method_10084()).N(class00869.K)
               && class00500x.N(class05974, class07209x)) {
               if (l == k) {
                  class05974.method_8652(class07209x, class00500x.y(class07110.i, class06069.y(4) + 20), 2);
                  i++;
               } else {
                  class05974.method_8652(class07209x, class00500x, 2);
               }
            } else if (l > 0) {
               class07209 class07209xx = class07209x.method_10074();
               if (class00500x.N(class05974, class07209xx) && !class05974.method_8320(class07209xx.method_10074()).N(class00869.Wh)) {
                  class05974.method_8652(class07209xx, class00500x.y(class07110.i, class06069.y(4) + 20), 2);
                  i++;
               }
               break;
            }

            class07209x = class07209x.method_10084();
         }
      }

      return i > 0;
   }
}
