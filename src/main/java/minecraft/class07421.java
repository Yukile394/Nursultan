package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class class07421 implements class07135 {
   private final Path N;

   public class07421(class01996 var1) {
      super();
      this.N = var1.method_45972(class02024.field_39369).resolve("json-rpc-api-schema.json");
   }

   @Override
   public String method_10321() {
      return "Json RPC API schema";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      class07420 class07420 = class07410.N(class07389.L());
      return class07135.N(var1, (JsonElement)class07420.N.codec().encodeStart(JsonOps.INSTANCE, class07420).getOrThrow(), this.N);
   }
}
