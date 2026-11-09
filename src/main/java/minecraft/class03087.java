package minecraft;

import com.mojang.serialization.Codec;

public class class03087 extends class06391<class06212> {
   private static final class00500 NE = class00869.mx.W().y(class07784.y, 1).y(class07784.L, class06662.field_12469).y(class07784.u, 0);
   private static final class00500 NW = NE.y(class07784.L, class06662.field_12468).y(class07784.u, 1);
   private static final class00500 Nm = NE.y(class07784.L, class06662.field_12468);
   private static final class00500 NP = NE.y(class07784.L, class06662.field_12466);

   public class03087(Codec<class06212> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06212> var1) {
      int i = 0;
      class07209 class07209 = var1.i();
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      class06212 class06212 = (class06212)var1.R();
      class07218 class07218x = class07209.method_25503();
      class07218 class07218x = class07209.method_25503();
      if (class05974.R(class07218x)) {
         if (class00869.mx.W().N(class05974, class07218x)) {
            int j = class06069.y(12) + 5;
            if (class06069.z() < class06212.y) {
               int k = class06069.y(4) + 1;

               for (int l = class07209.method_10263() - k; l <= class07209.method_10263() + k; l++) {
                  for (int i1 = class07209.method_10260() - k; i1 <= class07209.method_10260() + k; i1++) {
                     int j1 = l - class07209.method_10263();
                     int k1 = i1 - class07209.method_10260();
                     if (j1 * j1 + k1 * k1 <= k * k) {
                        class07218x.N(l, class05974.method_8624(class07830.field_13202, l, i1) - 1, i1);
                        if (y(class05974.method_8320(class07218x))) {
                           class05974.method_8652(class07218x, class00869.E.W(), 2);
                        }
                     }
                  }
               }
            }

            for (int l1 = 0; l1 < j && class05974.R(class07218x); l1++) {
               class05974.method_8652(class07218x, NE, 2);
               class07218x.N(class07211.field_11036, 1);
            }

            if (class07218x.method_10264() - class07209.method_10264() >= 3) {
               class05974.method_8652(class07218x, NW, 2);
               class05974.method_8652(class07218x.N(class07211.field_11033, 1), Nm, 2);
               class05974.method_8652(class07218x.N(class07211.field_11033, 1), NP, 2);
            }
         }

         i++;
      }

      return i > 0;
   }
}
