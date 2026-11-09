package minecraft;

import com.mojang.serialization.Codec;

public class class03147 extends class06391<class03967> {
   public class03147(Codec<class03967> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class03967> var1) {
      class07209 class07209x = var1.i();
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();

      class03967 class03967;
      for (class03967 = (class03967)var1.R(); class07209x.method_10264() > class05974.method_31607() + 3; class07209x = class07209x.method_10074()) {
         if (!class05974.R(class07209x.method_10074())) {
            class00500 class00500 = class05974.method_8320(class07209x.method_10074());
            if (y(class00500) || N(class00500)) {
               break;
            }
         }
      }

      if (class07209x.method_10264() <= class05974.method_31607() + 3) {
         return false;
      } else {
         for (int l = 0; l < 3; l++) {
            int i = class06069.y(2);
            int j = class06069.y(2);
            int k = class06069.y(2);
            float f = (i + j + k) * 0.333F + 0.5F;

            for (class07209 class07209x : class07209.method_10097(class07209x.method_10069(-i, -j, -k), class07209x.method_10069(i, j, k))) {
               if (class07209x.method_10262(class07209x) <= f * f) {
                  class05974.method_8652(class07209x, class03967.y, 3);
               }
            }

            class07209x = class07209x.method_10069(-1 + class06069.y(2), -class06069.y(2), -1 + class06069.y(2));
         }

         return true;
      }
   }
}
