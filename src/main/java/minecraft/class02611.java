package minecraft;

import com.mojang.serialization.Codec;

public class class02611 extends class06391<class06225> {
   public class02611(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      N(var1.y(), var1.i(), false);
      return true;
   }

   public static void N(class01001 var0, class07209 var1, boolean var2) {
      class07218 class07218x = var1.method_25503();

      for (int i = -2; i <= 2; i++) {
         for (int j = -2; j <= 2; j++) {
            for (int k = -1; k < 3; k++) {
               class07218 class07218x = class07218x.N(var1).y(j, k, i);
               class00891 class00891 = k == -1 ? class00869.LV : class00869.N;
               if (!var0.method_8320(class07218x).N(class00891)) {
                  if (var2) {
                     var0.N(class07218x, true, null);
                  }

                  var0.method_8652(class07218x, class00891.W(), 3);
               }
            }
         }
      }
   }
}
