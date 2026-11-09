package minecraft;

import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public record class08244(List<String> removed, Map<String, String> renamed) {
   private static final Logger i = LogUtils.getLogger();
   public static final class08244 N = new class08244(List.of(), Map.of());
   public static final Codec<class08244> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.listOf().fieldOf("removed").forGetter(class08244::y),
            Codec.unboundedMap(Codec.STRING, Codec.STRING).fieldOf("renamed").forGetter(class08244::L)
         )
         .apply(var0, class08244::new)
   );

   public Map<String, String> L() {
      return this.renamed;
   }

   public class08244(List<String> removed, Map<String, String> renamed) {
      this.removed = removed;
      this.renamed = renamed;
   }

   public List<String> y() {
      return this.removed;
   }

   public static class08244 N() {
      return N("/assets/minecraft/lang/deprecated.json");
   }

   public void N(Map<String, String> var1) {
      for (String s : this.removed) {
         var1.remove(s);
      }

      this.renamed.forEach((var1x, var2) -> {
         String s1 = (String)var1.remove(var1x);
         if (s1 == null) {
            i.warn("Missing translation key for rename: {}", var1x);
            var1.remove(var2);
         } else {
            var1.put(var2, s1);
         }
      });
   }

   public static class08244 N(InputStream var0) {
      JsonElement jsonelement = class08326.N(new InputStreamReader(var0, StandardCharsets.UTF_8));
      return (class08244)y.parse(JsonOps.INSTANCE, jsonelement)
         .getOrThrow(var0x -> new IllegalStateException("Failed to parse deprecated language data: " + var0x));
   }

   public static class08244 N(String var0) {
      try (InputStream inputstream = class07018.class.getResourceAsStream(var0)) {
         return inputstream != null ? N(inputstream) : N;
      } catch (Exception exception) {
         i.error("Failed to read {}", var0, exception);
         return N;
      }
   }
}
