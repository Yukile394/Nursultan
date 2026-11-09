package minecraft;

import com.mojang.serialization.Codec;

public class class03863 extends class06391<class06225> {
   public class03863(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class07209 class07209x = var1.i();
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      if (class07209x.method_10264() > class05974.method_8615() - 1) {
         return false;
      } else if (!class05974.method_8320(class07209x).N(class00869.K) && !class05974.method_8320(class07209x.method_10074()).N(class00869.K)) {
         return false;
      } else {
         boolean flag = false;

         for (class07211 class07211x : class07211.values()) {
            if (class07211x != class07211.field_11033 && class05974.method_8320(class07209x.method_10093(class07211x)).N(class00869.zn)) {
               flag = true;
               break;
            }
         }

         if (!flag) {
            return false;
         } else {
            class05974.method_8652(class07209x, class00869.mf.W(), 2);

            for (int i = 0; i < 200; i++) {
               int j = class06069.y(5) - class06069.y(6);
               int k = 3;
               if (j < 2) {
                  k += j / 2;
               }

               if (k >= 1) {
                  class07209 class07209x = class07209x.method_10069(class06069.y(k) - class06069.y(k), j, class06069.y(k) - class06069.y(k));
                  class00500 class00500 = class05974.method_8320(class07209x);
                  if (class00500.P() || class00500.N(class00869.K) || class00500.N(class00869.zn) || class00500.N(class00869.iT)) {
                     for (class07211 class07211x : class07211.values()) {
                        if (class05974.method_8320(class07209x.method_10093(class07211x)).N(class00869.mf)) {
                           class05974.method_8652(class07209x, class00869.mf.W(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
