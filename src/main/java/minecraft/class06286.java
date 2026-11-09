package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class06286 {
   public class06286() {
      super();
   }

   public static boolean N(class04782 var0, class07438 var1, class07209 var2) {
      return var0.N_17(var2) && var0.N(class07830.field_13197, var2).method_10264() <= var1.method_23318();
   }

   @Nullable
   private static class06889 N(class04782 var0, class07438 var1) {
      class06069 class06069 = var1.method_59922();
      class07209 class07209x = var1.method_24515();

      for (int i = 0; i < 10; i++) {
         class07209 class07209x = class07209x.method_10069(class06069.y(20) - 10, class06069.y(6) - 3, class06069.y(20) - 10);
         if (N(var0, var1, class07209x)) {
            return class06889.L(class07209x);
         }
      }

      return null;
   }

   public static class04119<class07438> N(float var0) {
      return class04137.N_42(var1 -> var1.group(var1.L(class05378.m)).apply(var1, var1x -> (var2, var3, var4) -> {
         if (var2.N_17(var3.method_24515())) {
            return false;
         } else {
            Optional.ofNullable(N(var2, var3)).ifPresent(var2x -> var1x.N(new class05352(var2x, var0, 0)));
            return true;
         }
      }));
   }
}
