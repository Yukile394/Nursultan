package minecraft;

import org.jspecify.annotations.Nullable;

public class class05475 {
   public class05475() {
      super();
   }

   @Nullable
   private static class07209 N(class07475 var0, int var1, boolean var2, class07209 var3) {
      class07209 class07209 = class05464.N(var0, var1, var0.method_59922(), var3);
      return !class05459.N(class07209, var0) && !class05459.N(var2, var0, class07209) && !class05459.N(var0.f(), class07209) && !class05459.y(var0, class07209)
         ? class07209
         : null;
   }

   @Nullable
   public static class06889 N(class07475 var0, int var1, int var2, class06889 var3) {
      class06889 class06889 = var0.method_73189().u(var3);
      boolean flag = class05459.N(var0, var1);
      return class05464.N(var0, () -> {
         class07209 class07209 = class05464.N(var0.method_59922(), 0.0, var1, var2, 0, class06889.M, class06889.Z, (float) (Math.PI / 2));
         return class07209 == null ? null : N(var0, var1, flag, class07209);
      });
   }

   @Nullable
   public static class06889 N(class07475 var0, int var1, int var2, class06889 var3, double var4) {
      class06889 class06889 = var3.N(var0.method_23317(), var0.method_23318(), var0.method_23321());
      boolean flag = class05459.N(var0, var1);
      return class05464.N(var0, () -> {
         class07209 class07209 = class05464.N(var0.method_59922(), 0.0, var1, var2, 0, class06889.M, class06889.Z, var4);
         return class07209 == null ? null : N(var0, var1, flag, class07209);
      });
   }

   @Nullable
   public static class06889 N(class07475 var0, int var1, int var2) {
      boolean flag = class05459.N(var0, var1);
      return class05464.N(var0, () -> {
         class07209 class07209 = class05464.N(var0.method_59922(), var1, var2);
         return N(var0, var1, flag, class07209);
      });
   }
}
