package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class class02496 implements class07135 {
   private final class01996 N;
   private final CompletableFuture<class01929> i;

   public class02496(class01996 var1, CompletableFuture<class01929> var2) {
      super();
      this.N = var1;
      this.i = var2;
   }

   @Override
   public String method_10321() {
      return "Item List";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      Path path = this.N.method_45972(class02024.field_39369).resolve("items.json");
      return this.i
         .thenCompose(
            var2x -> {
               JsonObject jsonobject = new JsonObject();
               class03519 class03519 = var2x.N(JsonOps.INSTANCE);
               var2x.y(class04227.F)
                  .z()
                  .forEach(
                     var2xx -> {
                        JsonObject jsonobject1 = new JsonObject();
                        jsonobject1.add(
                           "components",
                           (JsonElement)class02695.y
                              .encodeStart(class03519, var2xx.N().R())
                              .getOrThrow(var0xx -> new IllegalStateException("Failed to encode components: " + var0xx))
                        );
                        jsonobject.add(var2xx.M(), jsonobject1);
                     }
                  );
               return class07135.N(var1, jsonobject, path);
            }
         );
   }
}
