package minecraft;

import java.util.Optional;

public class class05755 {
   private static final int N = 10;
   private static final int y = 7;

   public class05755() {
      super();
   }

   public static class04119<class07475> N(float var0, int var1, int var2) {
      return class04137.N_42(var3 -> var3.group(var3.L(class05378.m)).apply(var3, var3x -> (var4, var5, var6) -> {
         class07209 class07209 = var5.method_24515();
         class06889 class06889;
         if (var4.method_19500(class07209)) {
            class06889 = class05456.N(var5, var1, var2);
         } else {
            class01296 class01296x = class01296.N(class07209);
            class01296 class01296x = class06293.N(var4, class01296x, 2);
            if (class01296x != class01296x) {
               class06889 = class05475.N(var5, var1, var2, class06889.L(class01296x.U()), (float) (Math.PI / 2));
            } else {
               class06889 = class05456.N(var5, var1, var2);
            }
         }

         var3x.N(Optional.ofNullable(class06889).map(var1xxxx -> new class05352(var1xxxx, var0, 0)));
         return true;
      }));
   }

   public static class04119<class07475> N(float var0) {
      return N(var0, 10, 7);
   }
}
