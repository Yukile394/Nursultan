package minecraft;

import com.mojang.serialization.Codec;

public class class01580 extends class06391<class06225> {
   public class01580(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209x = var1.i();
      class06069 class06069 = var1.u();
      if (!class05974.R(class07209x)) {
         return false;
      } else {
         class00500 class00500 = class05974.method_8320(class07209x.method_10084());
         if (!class00500.N(class00869.id) && !class00500.N(class00869.iY) && !class00500.N(class00869.Tb)) {
            return false;
         } else {
            class05974.method_8652(class07209x, class00869.io.W(), 2);

            for (int i = 0; i < 1500; i++) {
               class07209 class07209x = class07209x.method_10069(class06069.y(8) - class06069.y(8), -class06069.y(12), class06069.y(8) - class06069.y(8));
               if (class05974.method_8320(class07209x).P()) {
                  int j = 0;

                  for (class07211 class07211 : class07211.values()) {
                     if (class05974.method_8320(class07209x.method_10093(class07211)).N(class00869.io)) {
                        j++;
                     }

                     if (j > 1) {
                        break;
                     }
                  }

                  if (j == 1) {
                     class05974.method_8652(class07209x, class00869.io.W(), 2);
                  }
               }
            }

            return true;
         }
      }
   }
}
