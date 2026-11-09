package minecraft;

import com.mojang.serialization.Codec;

public class class06397 extends class06391<class06225> {
   public class06397(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      class07209 class07209 = var1.i();
      float f = class06069.y(3) + 4.0F;

      for (int i = 0; f > 0.5F; i--) {
         for (int j = class04995.y(-f); j <= class04995.u(f); j++) {
            for (int k = class04995.y(-f); k <= class04995.u(f); k++) {
               if (j * j + k * k <= (f + 1.0F) * (f + 1.0F)) {
                  this.N(class05974, class07209.method_10069(j, i, k), class00869.MP.W());
               }
            }
         }

         f -= class06069.y(2) + 0.5F;
      }

      return true;
   }
}
