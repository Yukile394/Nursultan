package minecraft;

import java.util.Map;
import java.util.function.Function;

public interface class08614 {
   int u = 1;
   int i = 4;
   class08071 R = class06665.S;

   default double L() {
      return 1.0;
   }

   default class08071 u() {
      return R;
   }

   default Function<class00500, class00494> N(class08064<class07211> var1, class08071 var2) {
      Map map = class00389.L(class00891.N(0.0, 0.0, 0.0, 8.0, this.L(), 8.0));
      return var3x -> {
         class00494 class00494 = class00389.N();
         class07211 class07211 = var3x.L(var1);
         int ix = var3x.L(var2);

         for (int j = 0; j < ix; j++) {
            class00494 = class00389.N(class00494, (class00494)map.get(class07211));
            class07211 = class07211.M();
         }

         return class00494.method_52620();
      };
   }

   default class00500 N(class06942 var1, class00891 var2, class08071 var3, class08064<class07211> var4) {
      class00500 class00500 = var1.method_8045().method_8320(var1.method_8037());
      return class00500.N(var2) ? class00500.y(var3, Math.min(4, class00500.L(var3) + 1)) : var2.W().y(var4, var1.method_8042().b());
   }

   default boolean N(class00500 var1, class06942 var2, class08071 var3) {
      return !var2.method_8046() && var2.method_8041().N(var1.i().B()) && var1.L(var3) < 4;
   }
}
