package minecraft;

import com.mojang.serialization.Codec;

public class class05594 extends class06391<class06212> {
   public class05594(Codec<class06212> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06212> var1) {
      boolean flag = false;
      class06069 class06069 = var1.u();
      class05974 class05974 = var1.y();
      class07209 class07209xx = var1.i();
      class06212 class06212 = (class06212)var1.R();
      int i = class06069.y(8) - class06069.y(8);
      int j = class06069.y(8) - class06069.y(8);
      int k = class05974.method_8624(class07830.field_13200, class07209xx.method_10263() + i, class07209xx.method_10260() + j);
      class07209 class07209x = new class07209(class07209xx.method_10263() + i, k, class07209xx.method_10260() + j);
      if (class05974.method_8320(class07209x).N(class00869.K)) {
         boolean flag1 = class06069.U() < class06212.y;
         class00500 class00500x = flag1 ? class00869.yo.W() : class00869.yJ.W();
         if (class00500x.N(class05974, class07209x)) {
            if (flag1) {
               class00500 class00500x = class00500x.y(class07749.u, class08059.field_12609);
               class07209 class07209xx = class07209x.method_10084();
               if (class05974.method_8320(class07209xx).N(class00869.K)) {
                  class05974.method_8652(class07209x, class00500x, 2);
                  class05974.method_8652(class07209xx, class00500x, 2);
               }
            } else {
               class05974.method_8652(class07209x, class00500x, 2);
            }

            flag = true;
         }
      }

      return flag;
   }
}
