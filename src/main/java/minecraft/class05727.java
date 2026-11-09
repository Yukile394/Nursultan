package minecraft;

import java.util.Collections;
import java.util.List;

public class class05727 {
   public class05727() {
      super();
   }

   public static class04142<class07475> N(float var0) {
      return class04137.N_42(
         var1 -> var1.group(var1.L(class05378.m))
            .apply(
               var1,
               var1x -> (var2, var3, var4) -> {
                  if (var2.N_17(var3.method_24515())) {
                     return false;
                  } else {
                     class07209 class07209 = var3.method_24515();
                     List list = class07209.method_20437(class07209.method_10069(-1, -1, -1), class07209.method_10069(1, 1, 1))
                        .map(class07209::method_10062)
                        .collect(class07536.y());
                     Collections.shuffle(list);
                     list.stream()
                        .filter(var1xxx -> !var2.N_17(var1xxx))
                        .filter(var2x -> var2.method_8515(var2x, var3))
                        .filter(var2x -> var2.N(var3))
                        .findFirst()
                        .ifPresent(var2x -> var1x.N(new class05352(var2x, var0, 0)));
                     return true;
                  }
               }
            )
      );
   }
}
