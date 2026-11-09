package minecraft;

import org.jspecify.annotations.Nullable;

public class class05444 {
   public class05444() {
      super();
   }

   @Nullable
   public static class06889 N(class07475 var0, int var1, int var2, int var3, double var4, double var6, double var8) {
      boolean flag = class05459.N(var0, var1);
      return class05464.N(var0, () -> N(var0, var1, var2, var3, var4, var6, var8, flag));
   }

   @Nullable
   public static class07209 N(class07475 var0, int var1, int var2, int var3, double var4, double var6, double var8, boolean var10) {
      class07209 class07209x = class05464.N(var0.method_59922(), 0.0, var1, var2, var3, var4, var6, var8);
      if (class07209x == null) {
         return null;
      } else {
         class07209 class07209x = class05464.N(var0, var1, var0.method_59922(), class07209x);
         if (!class05459.N(class07209x, var0) && !class05459.N(var10, var0, class07209x)) {
            class07209x = class05464.N(class07209x, var0.method_73183().method_31600(), var1x -> class05459.L(var0, var1x));
            return class05459.y(var0, class07209x) ? null : class07209x;
         } else {
            return null;
         }
      }
   }
}
