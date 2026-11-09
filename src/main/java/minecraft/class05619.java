package minecraft;

import com.mojang.serialization.Codec;

public class class05619 extends class06391<class01630> {
   public class05619(Codec<class01630> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class01630> var1) {
      int i = 0;
      class06069 class06069 = var1.u();
      class05974 class05974 = var1.y();
      class07209 class07209x = var1.i();
      int j = ((class01630)var1.R()).N().N(class06069);

      for (int k = 0; k < j; k++) {
         int l = class06069.y(8) - class06069.y(8);
         int i1 = class06069.y(8) - class06069.y(8);
         int j1 = class05974.method_8624(class07830.field_13200, class07209x.method_10263() + l, class07209x.method_10260() + i1);
         class07209 class07209x = new class07209(class07209x.method_10263() + l, j1, class07209x.method_10260() + i1);
         class00500 class00500 = class00869.mA.W().y(class06996.L, class06069.y(4) + 1);
         if (class05974.method_8320(class07209x).N(class00869.K) && class00500.N(class05974, class07209x)) {
            class05974.method_8652(class07209x, class00500, 2);
            i++;
         }
      }

      return i > 0;
   }
}
