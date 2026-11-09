package minecraft;

import com.mojang.serialization.Codec;

public class class04756 extends class06391<class06225> {
   public class04756(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      class07218 class07218x = new class07218();
      class07218 class07218x = new class07218();

      for (int i = 0; i < 16; i++) {
         for (int j = 0; j < 16; j++) {
            int k = class07209.method_10263() + i;
            int l = class07209.method_10260() + j;
            int i1 = class05974.method_8624(class07830.field_13197, k, l);
            class07218x.N(k, i1, l);
            class07218x.N(class07218x).N(class07211.field_11033, 1);
            class00780 class00780 = class05974.i(class07218x).N();
            if (class00780.N(class05974, class07218x, false)) {
               class05974.method_8652(class07218x, class00869.iT.W(), 2);
            }

            if (class00780.y(class05974, class07218x)) {
               class05974.method_8652(class07218x, class00869.is.W(), 2);
               class00500 class00500 = class05974.method_8320(class07218x);
               if (class00500.y(class06994.L)) {
                  class05974.method_8652(class07218x, class00500.y(class06994.L, true), 2);
               }
            }
         }
      }

      return true;
   }
}
