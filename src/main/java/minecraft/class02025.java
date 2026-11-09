package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class class02025 implements class07135 {
   private final class01996 N;
   private final Map<String, Supplier<JsonElement>> i = new HashMap<>();

   public class02025(class01996 var1) {
      super();
      this.N = var1;
   }

   public static class02025 N(class01996 var0, class00392 var1) {
      return new class02025(var0).N(class01612.y, new class01612(var1, class05257.N.method_70592(class01603.field_14190).N()));
   }

   public <T> class02025 N(class02968<T> var1, T var2) {
      this.i.put(var1.N(), () -> ((JsonElement)var1.y().encodeStart(JsonOps.INSTANCE, var2).getOrThrow(IllegalArgumentException::new)).getAsJsonObject());
      return this;
   }

   public static class02025 N(class01996 var0, class00392 var1, class03767 var2) {
      return N(var0, var1).N(class02974.N, new class02974(var2));
   }

   @Override
   public String method_10321() {
      return "Pack Metadata";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      JsonObject jsonobject = new JsonObject();
      this.i.forEach((var1x, var2x) -> jsonobject.add(var1x, var2x.get()));
      return class07135.N(var1, jsonobject, this.N.method_45971().resolve("pack.mcmeta"));
   }
}
