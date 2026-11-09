package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

final class class04164 {
   final Map<class07321, String> N;
   final CompletableFuture<Map<class07321, String>> y;

   class04164(class04172 var1, class08337 var2, double var3, double var5) {
      super();
      class03448 class03448 = (class03448)var1.N.T_3;
      class05946<class07299> class05946 = class03448.method_27983();
      int i = class01296.N(var3);
      int j = class01296.N(var5);
      Builder builder = ImmutableMap.builder();
      class01688 class01688 = class03448.method_8398();

      for (int k = i - 12; k <= i + 12; k++) {
         for (int l = j - 12; l <= j + 12; l++) {
            class07321 class07321 = new class07321(k, l);
            String s = "";
            class00570 class00570 = class01688.N(k, l, false);
            s = s + "Client: ";
            if (class00570 == null) {
               s = s + "0n/a\n";
            } else {
               s = s + (class00570.O() ? " E" : "");
               s = s + "\n";
            }

            builder.put(class07321, s);
         }
      }

      this.N = builder.build();
      this.y = var2.N(() -> {
         class04782 class04782 = var2.N(class05946);
         if (class04782 == null) {
            return ImmutableMap.of();
         } else {
            Builder builder1 = ImmutableMap.builder();
            class04751 class04751 = class04782.method_14178();

            for (int i1 = i - 12; i1 <= i + 12; i1++) {
               for (int j1 = j - 12; j1 <= j + 12; j1++) {
                  class07321 class07321x = new class07321(i1, j1);
                  builder1.put(class07321x, "Server: " + class04751.N(class07321x));
               }
            }

            return builder1.build();
         }
      });
   }
}
