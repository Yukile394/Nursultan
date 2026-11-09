package minecraft;

import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public interface class07135 {
   ToIntFunction<String> y = class07536.N(new Object2IntOpenHashMap(), var0 -> {
      y(var0, null);
      var0.put("type", 0);
      var0.put("parent", 1);
      var0.defaultReturnValue(2);
      N(var0, null);
   });
   Comparator<String> L = Comparator.comparingInt(y).thenComparing(var0 -> (String)var0);
   Logger u = LogUtils.getLogger();

   private static void y(Object2IntOpenHashMap var0, CallbackInfo var1) {
      var0.put("fabric:load_conditions", -100);
   }

   private static void N(Object2IntOpenHashMap var0, CallbackInfo var1) {
      var0.put("fabric:load_conditions", -100);
      var0.put("fabric:type", 0);
   }

   static <T> CompletableFuture<?> N(class04476 var0, class01929 var1, Codec<T> var2, T var3, Path var4) {
      class03519 class03519 = var1.N(JsonOps.INSTANCE);
      return N(var0, class03519, var2, var3, var4);
   }

   static <T, E> CompletableFuture<?> N(class04476 var0, Function<E, JsonElement> var1, Function<T, Path> var2, Map<T, E> var3) {
      return CompletableFuture.allOf(var3.entrySet().stream().map(var3x -> {
         Path path = (Path)var2.apply(var3x.getKey());
         JsonElement jsonelement = (JsonElement)var1.apply(var3x.getValue());
         return N(var0, jsonelement, path);
      }).toArray(CompletableFuture[]::new));
   }

   static <T, E> CompletableFuture<?> N(class04476 var0, Codec<E> var1, Function<T, Path> var2, Map<T, E> var3) {
      return N(var0, (Function<Object, JsonElement>)(var1x -> (JsonElement)var1.encodeStart(JsonOps.INSTANCE, var1x).getOrThrow()), var2, var3);
   }

   static <T> CompletableFuture<?> N(class04476 var0, Codec<T> var1, class01997 var2, Map<class01894, T> var3) {
      return N(var0, var1, var2::N, var3);
   }

   static CompletableFuture<?> N(class04476 var0, JsonElement var1, Path var2) {
      return CompletableFuture.runAsync(() -> {
         try {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            HashingOutputStream hashingoutputstream = new HashingOutputStream(Hashing.sha1(), bytearrayoutputstream);
            JsonWriter jsonwriter = new JsonWriter(new OutputStreamWriter(hashingoutputstream, StandardCharsets.UTF_8));

            try {
               jsonwriter.setSerializeNulls(false);
               jsonwriter.setIndent("  ");
               class05001.N(jsonwriter, var1, L);
            } catch (Throwable throwable1) {
               try {
                  jsonwriter.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }

               throw throwable1;
            }

            jsonwriter.close();
            var0.method_43346(var2, bytearrayoutputstream.toByteArray(), hashingoutputstream.hash());
         } catch (IOException ioexception) {
            u.error("Failed to save file to {}", var2, ioexception);
         }
      }, class07536.B().N("saveStable"));
   }

   private static <T> CompletableFuture<?> N(class04476 var0, DynamicOps<JsonElement> var1, Codec<T> var2, T var3, Path var4) {
      JsonElement jsonelement = (JsonElement)var2.encodeStart(var1, var3).getOrThrow();
      return N(var0, jsonelement, var4);
   }

   static <T> CompletableFuture<?> N(class04476 var0, Codec<T> var1, T var2, Path var3) {
      return N(var0, JsonOps.INSTANCE, var1, var2, var3);
   }

   String method_10321();

   CompletableFuture<?> method_10319(class04476 var1);
}
