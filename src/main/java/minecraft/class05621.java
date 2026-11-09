package minecraft;

import com.mojang.serialization.Codec;

public class class05621 extends class06391<class05591> {
   public class05621(Codec<class05591> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class05591> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();

      for (class06209 class06209 : ((class05591)var1.R()).y) {
         if (class06209.y.N(class05974.method_8320(class07209), var1.u())) {
            class05974.method_8652(class07209, class06209.L, 2);
            break;
         }
      }

      return true;
   }
}
