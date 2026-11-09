package minecraft;

import java.util.function.ToIntFunction;

public interface class05568 {
   class00494 N = class00891.y(14.0, 0.0, 16.0);
   class06667 x_ = class06665.y;

   static class07082 N(class07049 var0, class00500 var1, class07299 var2, class07209 var3) {
      if (var1.L(x_)) {
         if (var2 instanceof class04782 class04782) {
            class00891.N(class04782, class06273.Ne, var1, var2.method_8321(var3), null, var0, (var1x, var2x) -> class00891.N_21(var1x, var3, var2x));
            float f = class04995.y(class04782.field_9229, 0.8F, 1.2F);
            class04782.method_8396(null, var3, class04909.iI, class04911.field_15245, 1.0F, f);
            class00500 class00500 = var1.y(x_, false);
            class04782.method_8652(var3, class00500, 2);
            class04782.N(class01194.L, var3, class01164.N(var0, class00500));
         }

         return class07082.N;
      } else {
         return class07082.i;
      }
   }

   static boolean j_(class00500 var0) {
      return var0.y(x_) && var0.L(x_);
   }

   static ToIntFunction<class00500> e_(int var0) {
      return var1 -> var1.L(class06665.y) ? var0 : 0;
   }
}
