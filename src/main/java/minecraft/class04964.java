package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;

public record class04964(Set<String> ops) {
   private static final Logger y = LogUtils.getLogger();

   public class04964(Set<String> ops) {
      super();
      this.ops = ops;
   }

   public Set<String> N() {
      return this.ops;
   }

   public static class04964 N(String var0) {
      HashSet hashset = new HashSet();

      try {
         JsonObject jsonobject = class08314.N(var0).getAsJsonObject();
         JsonElement jsonelement = jsonobject.get("ops");
         if (jsonelement.isJsonArray()) {
            for (JsonElement jsonelement1 : jsonelement.getAsJsonArray()) {
               hashset.add(jsonelement1.getAsString());
            }
         }
      } catch (Exception exception) {
         y.error("Could not parse Ops", exception);
      }

      return new class04964(hashset);
   }
}
