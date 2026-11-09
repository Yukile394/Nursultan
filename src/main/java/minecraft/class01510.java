package minecraft;

import java.util.function.BiPredicate;

public class class01510 {
   public class01510() {
      super();
   }

   private static boolean N(class07438 var0, class07049 var1, int var2) {
      return var1.method_5805() && var1.method_24516(var0, var2) && var1.method_73183() == var0.method_73183();
   }

   public static <E extends class07438> class04142<E> N(int var0, BiPredicate<E, class07049> var1) {
      return class04137.N_42(var2 -> var2.group(var2.N(class05378.v)).apply(var2, var3 -> (var4, var5, var6) -> {
         class07049 class07049xx = var5.method_5854();
         class07049 class07049x = var2.<class07049>N(var3).orElse(null);
         if (class07049xx == null && class07049x == null) {
            return false;
         } else {
            class07049 class07049xx = class07049xx == null ? class07049x : class07049xx;
            if (N(var5, class07049xx, var0) && !var1.test(var5, class07049xx)) {
               return false;
            } else {
               var5.method_5848();
               var3.y();
               return true;
            }
         }
      }));
   }
}
