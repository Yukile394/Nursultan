package minecraft;

import com.mojang.serialization.Codec;

public class class05618 extends class06391<class05629> {
   public class05618(Codec<class05629> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class05629> var1) {
      class05629 class05629 = (class05629)var1.R();
      class06069 class06069 = var1.u();
      class05974 class05974 = var1.y();
      class08088 class08088 = var1.L();
      class07209 class07209 = var1.i();

      for (class04747 class04747 : class05629.y) {
         if (class06069.z() < class04747.L) {
            return class04747.N(class05974, class08088, class06069, class07209);
         }
      }

      return class05629.L.N().N(class05974, class08088, class06069, class07209);
   }
}
