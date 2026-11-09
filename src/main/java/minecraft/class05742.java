package minecraft;

import java.util.Optional;

public class class05742 {
   public class05742() {
      super();
   }

   public static class04119<class08041> N(class05378<class06289> var0, float var1, int var2, int var3, int var4) {
      return class04137.N_42(
         var5 -> var5.group(var5.N(class05378.I), var5.L(class05378.m), var5.y(var0)).apply(var5, (var6, var7, var8) -> (var9, var10, var11) -> {
            class06289 class06289 = var5.y(var8);
            Optional optional = var5.N(var6);
            if (class06289.N() == var9.method_27983() && (!optional.isPresent() || var9.N() - (Long)optional.get() <= var4)) {
               if (class06289.y().method_19455(var10.method_24515()) > var3) {
                  class06889 class06889 = null;
                  int i = 0;
                  short short1 = 1000;

                  while (class06889 == null || class07209.method_49638(class06889).method_19455(var10.method_24515()) > var3) {
                     class06889 = class05475.N(var10, 15, 7, class06889.L(class06289.y()), (float) (Math.PI / 2));
                     if (++i == 1000) {
                        var10.N(var0);
                        var8.y();
                        var6.N(var11);
                        return true;
                     }
                  }

                  var7.N(new class05352(class06889, var1, var2));
               } else if (class06289.y().method_19455(var10.method_24515()) > var2) {
                  var7.N(new class05352(class06289.y(), var1, var2));
               }
            } else {
               var10.N(var0);
               var8.y();
               var6.N(var11);
            }

            return true;
         })
      );
   }
}
