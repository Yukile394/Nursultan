package minecraft;

import com.mojang.serialization.JsonOps;
import com.mojang.serialization.DataResult.Error;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class class00361 {
   private static Logger N = LoggerFactory.getLogger("minecraft.class00361");
   private static final class03069 y = class03069.N("items");

   public class00361() {
      super();
   }

   public static CompletableFuture<class00370> N(class01089 var0, Executor var1) {
      class01022 class01022 = class03785.N().N();
      return CompletableFuture.<Map>supplyAsync(() -> y.N(var0), var1)
         .thenCompose(
            var2x -> {
               ArrayList arraylist = new ArrayList(var2x.size());
               var2x.forEach(
                  (var3x, var4) -> arraylist.add(
                     CompletableFuture.supplyAsync(
                        () -> {
                           class01894 class01894 = y.y(var3x);

                           try {
                              class08352 class08352;
                              try (BufferedReader bufferedreader = var4.method_43039()) {
                                 class00191 class00191 = new class00191(class01022);
                                 class03519 class03519 = class00191.N(JsonOps.INSTANCE);
                                 class08839 class08839 = class08839.N
                                    .parse(class03519, class08326.N(bufferedreader))
                                    .ifError(
                                       var2xxxx -> N.error(
                                          "Couldn't parse item model '{}' from pack '{}': {}",
                                          new Object[]{class01894, var4.method_14480(), var2xxxx.message()}
                                       )
                                    )
                                    .result()
                                    .map(var1xxxx -> class00191.y() ? var1xxxx.N(class00191.N()) : var1xxxx)
                                    .orElse(null);
                                 class08352 = new class08352(class01894, class08839);
                              }

                              return class08352;
                           } catch (Exception exception) {
                              N.error("Failed to open item model {} from pack '{}'", new Object[]{var3x, var4.method_14480(), exception});
                              return new class08352(class01894, null);
                           }
                        },
                        var1
                     )
                  )
               );
               return class07536.L(arraylist).thenApply(var0xx -> {
                  HashMap hashmap = new HashMap();

                  for (class08352 class08352 : var0xx) {
                     if (class08352.y() != null) {
                        hashmap.put(class08352.N(), class08352.y());
                     }
                  }

                  return new class00370(hashmap);
               });
            }
         );
   }
}
