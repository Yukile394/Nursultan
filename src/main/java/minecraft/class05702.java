package minecraft;

import com.mojang.serialization.Codec;

public class class05702 extends class06391<class05718> {
   public class05702(Codec<class05718> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class05718> var1) {
      class07209 class07209 = var1.i();
      class05718 class05718 = (class05718)var1.R();
      class05974 class05974 = var1.y();
      class07218 class07218 = new class07218();

      for (int i = 0; i < 16; i++) {
         for (int j = 0; j < 16; j++) {
            int k = class07209.method_10263() + i;
            int l = class07209.method_10260() + j;
            int i1 = class05974.method_31607() + class05718.y;
            class07218.N(k, i1, l);
            if (class05974.method_8320(class07218).P()) {
               class05974.method_8652(class07218, class05718.L, 2);
            }
         }
      }

      return true;
   }
}
