package minecraft;

import org.jspecify.annotations.Nullable;

public class class05473 {
   public class05473() {
      super();
   }

   @Nullable
   public static class06889 N(class07475 var0, int var1, int var2, int var3, class06889 var4, double var5) {
      class06889 class06889 = var4.N(var0.method_23317(), var0.method_23318(), var0.method_23321());
      boolean flag = class05459.N(var0, var1);
      return class05464.N(var0, () -> {
         class07209 class07209 = class05444.N(var0, var1, var2, var3, class06889.M, class06889.Z, var5, flag);
         return class07209 != null && !class05459.N(var0, class07209) ? class07209 : null;
      });
   }
}
