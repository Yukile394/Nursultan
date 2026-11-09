package minecraft;

import com.mojang.serialization.Codec;

public class class06201 extends class06391<class06189> {
   public class06201(Codec<class06189> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06189> var1) {
      class06069 class06069 = var1.u();
      class06189 class06189 = (class06189)var1.R();
      class05974 class05974 = var1.y();
      class08088 class08088 = var1.L();
      class07209 class07209 = var1.i();
      return (class06069.Z() ? class06189.y : class06189.L).N().N(class05974, class08088, class06069, class07209);
   }
}
