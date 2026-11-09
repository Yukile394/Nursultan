package minecraft;

import com.mojang.serialization.Codec;

public class class05612 extends class06391<class05610> {
   public class05612(Codec<class05610> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class05610> var1) {
      class05610 class05610 = (class05610)var1.R();
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      class00500 class00500 = class05610.N().N(var1.u(), class07209);
      if (class00500.N(class05974, class07209)) {
         if (class00500.i() instanceof class06761) {
            if (!class05974.R(class07209.method_10084())) {
               return false;
            }

            class06761.N(class05974, class00500, class07209, 2);
         } else if (class00500.i() instanceof class00318) {
            class00318.N(class05974, class07209, class05974.method_8409(), 2);
         } else {
            class05974.method_8652(class07209, class00500, 2);
         }

         if (class05610.y()) {
            class05974.N(class07209, class05974.method_8320(class07209).i(), 1);
         }

         return true;
      } else {
         return false;
      }
   }
}
