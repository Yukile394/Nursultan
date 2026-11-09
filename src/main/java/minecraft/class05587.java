package minecraft;

import com.mojang.serialization.Codec;

public class class05587 extends class06391<class05602> {
   public class05587(Codec<class05602> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class05602> var1) {
      class06069 class06069 = var1.u();
      class05602 class05602 = (class05602)var1.R();
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      class08088 class08088 = var1.L();
      int i = class06069.y(class05602.y.y());
      return class05602.y.N(i).N().N(class05974, class08088, class06069, class07209);
   }
}
