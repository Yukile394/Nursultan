package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.DataResult.Error;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class class01035 implements class07135 {
   private final class01996 N;
   private final CompletableFuture<class01929> i;

   public class01035(class01996 var1, CompletableFuture<class01929> var2) {
      super();
      this.i = var2;
      this.N = var1;
   }

   private static <E> CompletableFuture<?> N(Path var0, class04476 var1, DynamicOps<JsonElement> var2, Encoder<E> var3, E var4) {
      return (CompletableFuture<?>)var3.encodeStart(var2, var4)
         .mapOrElse(
            var2x -> class07135.N(var1, var2x, var0),
            var1x -> CompletableFuture.failedFuture(new IllegalStateException("Couldn't generate file '" + var0 + "': " + var1x.message()))
         );
   }

   private <T> Optional<CompletableFuture<?>> N(class04476 var1, class01929 var2, DynamicOps<JsonElement> var3, class02965<T> var4) {
      class05946 class05946 = var4.N();
      return var2.method_46759(class05946)
         .map(
            var5x -> {
               class01997 class01997 = this.N.method_60917(class05946);
               return CompletableFuture.allOf(
                  var5x.z().map(var4xx -> N(class01997.N(var4xx.B().N()), var1, var3, var4.y(), var4xx.N())).toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   @Override
   public String method_10321() {
      return "Registries";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      return this.i
         .thenCompose(
            var2 -> {
               class03519 class03519 = var2.N(JsonOps.INSTANCE);
               return CompletableFuture.allOf(
                  class03078.N.stream().flatMap(var4 -> this.N(var1, var2, class03519, (class02965<?>)var4).stream()).toArray(CompletableFuture[]::new)
               );
            }
         );
   }
}
