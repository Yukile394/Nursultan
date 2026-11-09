package minecraft;

import com.mojang.serialization.Codec;

public class class01447 extends class06391<class01478> {
   public class01447(Codec<class01478> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class01478> var1) {
      class01478 class01478 = (class01478)var1.R();
      class06069 class06069 = var1.u();
      class07209 class07209 = var1.i();
      class05974 class05974 = var1.y();
      int i = 0;
      class07218 class07218 = new class07218();
      int j = class01478.y() + 1;
      int k = class01478.L() + 1;

      for (int l = 0; l < class01478.N(); l++) {
         class07218.N(class07209, class06069.y(j) - class06069.y(j), class06069.y(k) - class06069.y(k), class06069.y(j) - class06069.y(j));
         if (class01478.i().N().N(class05974, var1.L(), class06069, class07218)) {
            i++;
         }
      }

      return i > 0;
   }
}
