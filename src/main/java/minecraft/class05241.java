package minecraft;

import com.mojang.serialization.Codec;

public class class05241 extends class06391<class01458> {
   public class05241(Codec<class01458> var1) {
      super(var1);
   }

   private void N(class07284 var1, class07209 var2, class06069 var3, class01458 var4) {
      if (var1.R(var2) && this.N(var1, var2, var3)) {
         var1.method_8652(var2, var4.y.N(var3, var2), 260);
      }
   }

   private boolean N(class07284 var1, class07209 var2, class06069 var3) {
      class07209 class07209 = var2.method_10074();
      class00500 class00500 = var1.method_8320(class07209);
      return class00500.N(class00869.Ek) ? var3.Z() : class00500.L(var1, class07209, class07211.field_11036);
   }

   @Override
   public boolean N(class06058<class01458> var1) {
      class07209 class07209x = var1.i();
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      class01458 class01458 = (class01458)var1.R();
      if (class07209x.method_10264() < class05974.method_31607() + 5) {
         return false;
      } else {
         int i = 2 + class06069.y(2);
         int j = 2 + class06069.y(2);

         for (class07209 class07209x : class07209.method_10097(class07209x.method_10069(-i, 0, -j), class07209x.method_10069(i, 1, j))) {
            int k = class07209x.method_10263() - class07209x.method_10263();
            int l = class07209x.method_10260() - class07209x.method_10260();
            if (k * k + l * l <= class06069.z() * 10.0F - class06069.z() * 6.0F) {
               this.N(class05974, class07209x, class06069, class01458);
            } else if (class06069.z() < 0.031) {
               this.N(class05974, class07209x, class06069, class01458);
            }
         }

         return true;
      }
   }
}
