package minecraft;

import java.util.Optional;
import java.util.function.Function;

public class class05773 {
   public class05773() {
      super();
   }

   public static class04119<class07475> y(class05378<? extends class07049> var0, float var1, int var2, boolean var3) {
      return N(var0, var1, var2, var3, class07049::method_73189);
   }

   private static <T> class04119<class07475> N(class05378<T> var0, float var1, int var2, boolean var3, Function<T, class06889> var4) {
      return class04137.N_42(var5 -> var5.group(var5.N(class05378.m), var5.y(var0)).apply(var5, (var5x, var6) -> (var7, var8, var9) -> {
         Optional optional = var5.N(var5x);
         if (optional.isPresent() && !var3) {
            return false;
         } else {
            class06889 class06889xxxx = var8.method_73189();
            class06889 class06889x = (class06889)var4.apply(var5.y(var6));
            if (!class06889xxxx.N((class00737)class06889x, (double)var2)) {
               return false;
            } else {
               if (optional.isPresent() && ((class05352)optional.get()).y() == var1) {
                  class06889 class06889xx = ((class05352)optional.get()).N().N().u(class06889xxxx);
                  class06889 class06889xxx = class06889x.u(class06889xxxx);
                  if (class06889xx.y(class06889xxx) < 0.0) {
                     return false;
                  }
               }

               for (int i = 0; i < 10; i++) {
                  class06889 class06889xx = class05456.y(var8, 16, 7, class06889x);
                  if (class06889xx != null) {
                     var5x.N(new class05352(class06889xx, var1, 0));
                     break;
                  }
               }

               return true;
            }
         }
      }));
   }

   public static class04142<class07475> N(class05378<class07209> var0, float var1, int var2, boolean var3) {
      return N(var0, var1, var2, var3, class06889::L);
   }
}
