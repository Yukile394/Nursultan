package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;

public class class05572 extends class06391<class05583> {
   private static boolean L(class00500 var0) {
      return var0.P() || var0.N(class00869.K);
   }

   public class05572(Codec<class05583> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class05583> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      class06069 class06069 = var1.u();
      class05583 class05583 = (class05583)var1.R();
      if (!L(class05974.method_8320(class07209))) {
         return false;
      } else {
         List<class07211> list = class05583.N(class06069);
         if (N(class05974, class07209, class05974.method_8320(class07209), class05583, class06069, list)) {
            return true;
         } else {
            class07218 class07218 = class07209.method_25503();

            for (class07211 class07211 : list) {
               class07218.N(class07209);
               List<class07211> list1 = class05583.N(class06069, class07211.b());

               for (int i = 0; i < class05583.L; i++) {
                  class07218.N(class07209, class07211);
                  class00500 class00500 = class05974.method_8320(class07218);
                  if (!L(class00500) && !class00500.N(class05583.y)) {
                     break;
                  }

                  if (N(class05974, class07218, class00500, class05583, class06069, list1)) {
                     return true;
                  }
               }
            }

            return false;
         }
      }
   }

   public static boolean N(class05974 var0, class07209 var1, class00500 var2, class05583 var3, class06069 var4, List<class07211> var5) {
      class07218 class07218 = var1.method_25503();

      for (class07211 class07211 : var5) {
         if (var0.method_8320(class07218.N(var1, class07211)).N(var3.Z)) {
            class00500 class00500 = var3.y.y(var2, var0, var1, class07211);
            if (class00500 == null) {
               return false;
            }

            var0.method_8652(var1, class00500, 3);
            var0.method_8500(var1).u(var1);
            if (var4.z() < var3.B) {
               var3.y.y().N(class00500, var0, var1, class07211, var4, true);
            }

            return true;
         }
      }

      return false;
   }
}
