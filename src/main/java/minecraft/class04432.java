package minecraft;

public class class04432 {
   public class04432() {
      super();
   }

   public static class04142<class07438> N(class00891 var0) {
      return class04137.N_42(
         var1 -> var1.group(var1.L(class05378.s), var1.y(class05378.m), var1.y(class05378.r))
            .apply(
               var1,
               (var1x, var2, var3) -> (var2x, var3x, var4) -> {
                  if (!var3x.method_5799() && var3x.method_24828()) {
                     class07209 class07209xx = var3x.method_24515().method_10074();

                     for (class07211 class07211 : class07221.field_11062) {
                        class07209 class07209x = class07209xx.method_10093(class07211);
                        if (var2x.method_8320(class07209x).M(var2x, class07209x).method_20538(class07211.field_11036).method_1110()
                           && var2x.method_8316(class07209x).y(class04684.L)) {
                           class07209 class07209xx = class07209x.method_10084();
                           if (var2x.method_8320(class07209xx).P()) {
                              class00500 class00500 = var0.W();
                              var2x.method_8652(class07209xx, class00500, 3);
                              var2x.N(class01194.Z, class07209xx, class01164.N(var3x, class00500));
                              var2x.method_43129(null, var3x, class04909.EO, class04911.field_15245, 1.0F, 1.0F);
                              var3.y();
                              return true;
                           }
                        }
                     }

                     return true;
                  } else {
                     return false;
                  }
               }
            )
      );
   }
}
