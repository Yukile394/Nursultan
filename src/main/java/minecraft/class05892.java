package minecraft;

import com.mojang.serialization.MapCodec;

public class class05892 extends class01474 {
   public static final MapCodec<class05892> N = MapCodec.unit(() -> class05892.L);
   public static final class05892 L = new class05892();

   public class05892() {
      super();
   }

   @Override
   public void N(class05894 var1) {
      class06069 class06069 = var1.y();
      var1.L().forEach(var2x -> {
         if (class06069.y(3) > 0) {
            class07209 class07209xxx = var2x.method_10067();
            if (var1.N(class07209xxx)) {
               var1.N(class07209xxx, class00659.u);
            }
         }

         if (class06069.y(3) > 0) {
            class07209 class07209xx = var2x.method_10078();
            if (var1.N(class07209xx)) {
               var1.N(class07209xx, class00659.R);
            }
         }

         if (class06069.y(3) > 0) {
            class07209 class07209x = var2x.method_10095();
            if (var1.N(class07209x)) {
               var1.N(class07209x, class00659.i);
            }
         }

         if (class06069.y(3) > 0) {
            class07209 class07209 = var2x.method_10072();
            if (var1.N(class07209)) {
               var1.N(class07209, class00659.L);
            }
         }
      });
   }

   @Override
   protected class05930<?> N() {
      return class05930.N;
   }
}
