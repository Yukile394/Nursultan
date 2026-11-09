package minecraft;

import com.mojang.serialization.Codec;

public class class05981 extends class06391<class04316> {
   public class05981(Codec<class04316> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class04316> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209x = var1.i();
      class00500 class00500x = class05974.method_8320(class07209x.method_10074());
      class04316 class04316 = (class04316)var1.R();
      class06069 class06069 = var1.u();
      if (!class00500x.N(class01210.Nr)) {
         return false;
      } else {
         int i = class07209x.method_10264();
         if (i >= class05974.method_31607() + 1 && i + 1 <= class05974.method_31600()) {
            int j = 0;

            for (int k = 0; k < class04316.u * class04316.u; k++) {
               class07209 class07209x = class07209x.method_10069(
                  class06069.y(class04316.u) - class06069.y(class04316.u),
                  class06069.y(class04316.i) - class06069.y(class04316.i),
                  class06069.y(class04316.u) - class06069.y(class04316.u)
               );
               class00500 class00500x = class04316.y.N(class06069, class07209x);
               if (class05974.R(class07209x) && class07209x.method_10264() > class05974.method_31607() && class00500x.N(class05974, class07209x)) {
                  class05974.method_8652(class07209x, class00500x, 2);
                  j++;
               }
            }

            return j > 0;
         } else {
            return false;
         }
      }
   }
}
