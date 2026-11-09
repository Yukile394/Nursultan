package minecraft;

import org.jspecify.annotations.Nullable;

public class class05445 {
   public class05445() {
      super();
   }

   @Nullable
   public static class06889 N(class07475 var0, int var1, int var2, double var3, double var5, float var7, int var8, int var9) {
      boolean flag = class05459.N(var0, var1);
      return class05464.N(
         var0,
         () -> {
            class07209 class07209x = class05464.N(var0.method_59922(), 0.0, var1, var2, 0, var3, var5, var7);
            if (class07209x == null) {
               return null;
            } else {
               class07209 class07209x = class05456.N(var0, var1, flag, class07209x);
               if (class07209x == null) {
                  return null;
               } else {
                  class07209x = class05464.N(
                     class07209x, var0.method_59922().y(var8 - var9 + 1) + var9, var0.method_73183().method_31600(), var1xx -> class05459.L(var0, var1xx)
                  );
                  return !class05459.N(var0, class07209x) && !class05459.y(var0, class07209x) ? class07209x : null;
               }
            }
         }
      );
   }
}
