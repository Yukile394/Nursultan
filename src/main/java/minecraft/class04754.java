package minecraft;

import com.mojang.serialization.Codec;

public class class04754 extends class06391<class01470> {
   public class04754(Codec<class01470> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class01470> var1) {
      class01470 class01470 = (class01470)var1.R();
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      if (!class05974.method_8320(class07209.method_10084()).N(class01470.M)) {
         return false;
      } else if (class01470.L && !class05974.method_8320(class07209.method_10074()).N(class01470.M)) {
         return false;
      } else {
         class00500 class00500 = class05974.method_8320(class07209);
         if (!class00500.P() && !class00500.N(class01470.M)) {
            return false;
         } else {
            int i = 0;
            int j = 0;
            if (class05974.method_8320(class07209.method_10067()).N(class01470.M)) {
               j++;
            }

            if (class05974.method_8320(class07209.method_10078()).N(class01470.M)) {
               j++;
            }

            if (class05974.method_8320(class07209.method_10095()).N(class01470.M)) {
               j++;
            }

            if (class05974.method_8320(class07209.method_10072()).N(class01470.M)) {
               j++;
            }

            if (class05974.method_8320(class07209.method_10074()).N(class01470.M)) {
               j++;
            }

            int k = 0;
            if (class05974.R(class07209.method_10067())) {
               k++;
            }

            if (class05974.R(class07209.method_10078())) {
               k++;
            }

            if (class05974.R(class07209.method_10095())) {
               k++;
            }

            if (class05974.R(class07209.method_10072())) {
               k++;
            }

            if (class05974.R(class07209.method_10074())) {
               k++;
            }

            if (j == class01470.u && k == class01470.i) {
               class05974.method_8652(class07209, class01470.y.B(), 2);
               class05974.N(class07209, class01470.y.N(), 0);
               i++;
            }

            return i > 0;
         }
      }
   }
}
