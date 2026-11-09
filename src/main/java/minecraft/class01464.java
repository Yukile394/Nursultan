package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class class01464 extends class01474 {
   public static final MapCodec<class01464> N = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(class01464::new, var0 -> var0.L);
   private final float L;

   public class01464(float var1) {
      super();
      this.L = var1;
   }

   @Override
   protected class05930<?> N() {
      return class05930.y;
   }

   private static void N(class07209 var0, class06667 var1, class05894 var2) {
      var2.N(var0, var1);
      int i = 4;

      for (class07209 class07209 = var0.method_10074(); var2.N(class07209) && i > 0; i--) {
         var2.N(class07209, var1);
         class07209 = class07209.method_10074();
      }
   }

   @Override
   public void N(class05894 var1) {
      class06069 class06069 = var1.y();
      var1.u().forEach(var3 -> {
         if (class06069.z() < this.L) {
            class07209 class07209xxx = var3.method_10067();
            if (var1.N(class07209xxx)) {
               N(class07209xxx, class00659.u, var1);
            }
         }

         if (class06069.z() < this.L) {
            class07209 class07209xx = var3.method_10078();
            if (var1.N(class07209xx)) {
               N(class07209xx, class00659.R, var1);
            }
         }

         if (class06069.z() < this.L) {
            class07209 class07209x = var3.method_10095();
            if (var1.N(class07209x)) {
               N(class07209x, class00659.i, var1);
            }
         }

         if (class06069.z() < this.L) {
            class07209 class07209 = var3.method_10072();
            if (var1.N(class07209)) {
               N(class07209, class00659.L, var1);
            }
         }
      });
   }
}
