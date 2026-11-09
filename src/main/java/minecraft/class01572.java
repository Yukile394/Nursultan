package minecraft;

import com.mojang.serialization.Codec;

public class class01572 extends class06391<class06225> {
   public class01572(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class07209 class07209x = var1.i();
      class06069 class06069 = var1.u();
      class05974 class05974 = var1.y();

      while (class05974.R(class07209x) && class07209x.method_10264() > class05974.method_31607() + 2) {
         class07209x = class07209x.method_10074();
      }

      if (!class05974.method_8320(class07209x).N(class00869.ib)) {
         return false;
      } else {
         class07209x = class07209x.method_10086(class06069.y(4));
         int i = class06069.y(4) + 7;
         int j = i / 4 + class06069.y(2);
         if (j > 1 && class06069.y(60) == 0) {
            class07209x = class07209x.method_10086(10 + class06069.y(30));
         }

         for (int k = 0; k < i; k++) {
            float f = (1.0F - (float)k / i) * j;
            int l = class04995.u(f);

            for (int i1 = -l; i1 <= l; i1++) {
               float f1 = class04995.N(i1) - 0.25F;

               for (int j1 = -l; j1 <= l; j1++) {
                  float f2 = class04995.N(j1) - 0.25F;
                  if ((i1 == 0 && j1 == 0 || !(f1 * f1 + f2 * f2 > f * f)) && (i1 != -l && i1 != l && j1 != -l && j1 != l || !(class06069.z() > 0.75F))) {
                     class00500 class00500x = class05974.method_8320(class07209x.method_10069(i1, k, j1));
                     if (class00500x.P() || y(class00500x) || class00500x.N(class00869.ib) || class00500x.N(class00869.iT)) {
                        this.N(class05974, class07209x.method_10069(i1, k, j1), class00869.zn.W());
                     }

                     if (k != 0 && l > 1) {
                        class00500x = class05974.method_8320(class07209x.method_10069(i1, -k, j1));
                        if (class00500x.P() || y(class00500x) || class00500x.N(class00869.ib) || class00500x.N(class00869.iT)) {
                           this.N(class05974, class07209x.method_10069(i1, -k, j1), class00869.zn.W());
                        }
                     }
                  }
               }
            }
         }

         int k1 = j - 1;
         if (k1 < 0) {
            k1 = 0;
         } else if (k1 > 1) {
            k1 = 1;
         }

         for (int l1 = -k1; l1 <= k1; l1++) {
            for (int i2 = -k1; i2 <= k1; i2++) {
               class07209 class07209x = class07209x.method_10069(l1, -1, i2);
               int j2 = 50;
               if (Math.abs(l1) == 1 && Math.abs(i2) == 1) {
                  j2 = class06069.y(5);
               }

               while (class07209x.method_10264() > 50) {
                  class00500 class00500x = class05974.method_8320(class07209x);
                  if (!class00500x.P() && !y(class00500x) && !class00500x.N(class00869.ib) && !class00500x.N(class00869.iT) && !class00500x.N(class00869.zn)) {
                     break;
                  }

                  this.N(class05974, class07209x, class00869.zn.W());
                  class07209x = class07209x.method_10074();
                  if (--j2 <= 0) {
                     class07209x = class07209x.method_10087(class06069.y(5) + 1);
                     j2 = class06069.y(5);
                  }
               }
            }
         }

         return true;
      }
   }
}
