package minecraft;

import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;

public class class03121 {
   public class03121() {
      super();
   }

   private static List N() {
      return DynamicRegistries.getDynamicRegistries();
   }

   public static CompletableFuture<class04144> N(CompletableFuture<class01929> var0, class02061 var1) {
      return var0.thenApply(
         var1x -> {
            class01022 class01022 = class01042.N(class04206.NF);
            class01794 class01794 = new class01794();
            N().forEach(var1xx -> var1xx.N(class01794::N));
            class04144 class04144 = var1.N(class01022, var1x, class01794);
            class01929 class01929 = class04144.N();
            Optional optional = class01929.method_46759(class04227.NA);
            Optional optional1 = class01929.method_46759(class04227.ys);
            if (optional.isPresent() || optional1.isPresent()) {
               class04105.N(
                  (class02055<class04336>)DataFixUtils.orElseGet(optional1, () -> var1x.y(class04227.ys)),
                  (class01905<class00780>)DataFixUtils.orElseGet(optional, () -> var1x.y(class04227.NA))
               );
            }

            return class04144;
         }
      );
   }
}
