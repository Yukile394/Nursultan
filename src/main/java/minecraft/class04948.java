package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04948 extends class05105 {
   private static final Logger M = LogUtils.getLogger();
   public final String N;
   public final Instant y;
   public final long L;
   public boolean u;
   public final Map<String, String> i;
   public final Map<String, String> R = new HashMap<>();

   private class04948(String var1, Instant var2, long var3, Map<String, String> var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.i = var5;
   }

   public ZonedDateTime N() {
      return ZonedDateTime.ofInstant(this.y, ZoneId.systemDefault());
   }

   @Nullable
   public static class04948 N(JsonElement var0) {
      JsonObject jsonobject = var0.getAsJsonObject();

      try {
         String s = class04719.N("backupId", jsonobject, "");
         Instant instant = class04719.y("lastModifiedDate", jsonobject);
         long ix = class04719.N("size", jsonobject, 0L);
         HashMap hashmap = new HashMap();
         if (jsonobject.has("metadata")) {
            for (Entry entry : jsonobject.getAsJsonObject("metadata").entrySet()) {
               if (!((JsonElement)entry.getValue()).isJsonNull()) {
                  hashmap.put((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
               }
            }
         }

         return new class04948(s, instant, ix, hashmap);
      } catch (Exception exception) {
         M.error("Could not parse Backup", exception);
         return null;
      }
   }
}
