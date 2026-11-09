package minecraft;

import java.util.function.ToDoubleFunction;
import org.jspecify.annotations.Nullable;

public class class05456 {
   public class05456() {
      super();
   }

   @Nullable
   public static class06889 y(class07475 var0, int var1, int var2, class06889 var3) {
      return N(var0, 0.0, var1, var2, var3);
   }

   @Nullable
   public static class07209 N(class07475 var0, class07209 var1) {
      var1 = class05464.N(var1, var0.method_73183().method_31600(), var1x -> class05459.L(var0, var1x));
      return !class05459.N(var0, var1) && !class05459.y(var0, var1) ? var1 : null;
   }

   @Nullable
   public static class07209 N(class07475 var0, double var1, boolean var3, class07209 var4) {
      class07209 class07209 = class05464.N(var0, var1, var0.method_59922(), var4);
      return !class05459.N(class07209, var0) && !class05459.N(var3, var0, class07209) && !class05459.N(var0.f(), class07209) ? class07209 : null;
   }

   @Nullable
   public static class06889 N(class07475 var0, int var1, int var2) {
      return N(var0, var1, var2, var0::u);
   }

   @Nullable
   public static class06889 N(class07475 var0, int var1, int var2, ToDoubleFunction<class07209> var3) {
      boolean flag = class05459.N(var0, var1);
      return class05464.N(() -> {
         class07209 class07209x = class05464.N(var0.method_59922(), var1, var2);
         class07209 class07209x = N(var0, var1, flag, class07209x);
         return class07209x == null ? null : N(var0, class07209x);
      }, var3);
   }

   @Nullable
   public static class06889 N(class07475 var0, int var1, int var2, class06889 var3) {
      class06889 class06889 = var3.N(var0.method_23317(), var0.method_23318(), var0.method_23321());
      boolean flag = class05459.N(var0, var1);
      return N(var0, 0.0, var1, var2, class06889, flag);
   }

   @Nullable
   public static class06889 N(class07475 var0, double var1, double var3, int var5, class06889 var6) {
      class06889 class06889 = var0.method_73189().u(var6);
      if (class06889.M() == 0.0) {
         class06889 = new class06889(var0.method_59922().U() - 0.5, 0.0, var0.method_59922().U() - 0.5);
      }

      boolean flag = class05459.N(var0, var3);
      return N(var0, var1, var3, var5, class06889, flag);
   }

   @Nullable
   private static class06889 N(class07475 var0, double var1, double var3, int var5, class06889 var6, boolean var7) {
      return class05464.N(var0, () -> {
         class07209 class07209x = class05464.N(var0.method_59922(), var1, var3, var5, 0, var6.M, var6.Z, (float) (Math.PI / 2));
         if (class07209x == null) {
            return null;
         } else {
            class07209 class07209x = N(var0, var3, var7, class07209x);
            return class07209x == null ? null : N(var0, class07209x);
         }
      });
   }
}
