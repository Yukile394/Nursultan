package minecraft;

import com.mojang.serialization.Codec;

public class class04035 extends class06391<class04055> {
   public class04035(Codec<class04055> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class04055> var1) {
      class05974 class05974 = var1.y();
      class04055 class04055 = (class04055)var1.R();
      class06069 class06069 = var1.u();
      int i = class04055.N().size();
      int[] aint = new int[i];
      int j = 0;

      for (int k = 0; k < i; k++) {
         aint[k] = class04055.N().get(k).N().N(class06069);
         j += aint[k];
      }

      if (j == 0) {
         return false;
      } else {
         class07218 class07218 = var1.i().method_25503();
         class07218 class07218x = class07218.method_25503().N(class04055.y());

         for (int l = 0; l < j; l++) {
            if (!class04055.L().test(class05974, class07218x)) {
               N(aint, j, l, class04055.i());
               break;
            }

            class07218x.N(class04055.y());
         }

         for (int k1 = 0; k1 < i; k1++) {
            int i1 = aint[k1];
            if (i1 != 0) {
               class04031 class04031 = class04055.N().get(k1);

               for (int j1 = 0; j1 < i1; j1++) {
                  class05974.method_8652(class07218, class04031.y().N(class06069, class07218), 2);
                  class07218.N(class04055.y());
               }
            }
         }

         return true;
      }
   }

   private static void N(int[] var0, int var1, int var2, boolean var3) {
      int i = var1 - var2;
      int j = var3 ? 1 : -1;
      int k = var3 ? 0 : var0.length - 1;
      int l = var3 ? var0.length : -1;

      for (int i1 = k; i1 != l && i > 0; i1 += j) {
         int j1 = Math.min(var0[i1], i);
         i -= j1;
         var0[i1] -= j1;
      }
   }
}
