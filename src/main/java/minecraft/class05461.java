package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jspecify.annotations.Nullable;

public class class05461 extends class02593 {
   private static final String B = "v1/chat";
   final URL N;
   final class05479 y;
   final URL L;
   final class05479 u;
   private final String Z;

   private class05461(URL var1, class02571 var2, URL var3, class05479 var4, URL var5, class05479 var6, String var7, class02588 var8, ExecutorService var9) {
      super(var1, var2, var8, var9);
      this.N = var3;
      this.y = var4;
      this.L = var5;
      this.u = var6;
      this.Z = var7;
   }

   private void y(JsonObject var1, URL var2) throws IOException {
      try (InputStream inputstream = this.N(var1, var2).getInputStream()) {
         this.N(inputstream);
      }
   }

   @Override
   protected class06068 N(String var1, class02588 var2, JsonObject var3) {
      if (class05001.N(var3, "response", false)) {
         return class06068.N(var1);
      } else if (class05001.N(var3, "hashed", null) == null) {
         return class06068.y(var1);
      } else {
         JsonArray jsonarray = class05001.t(var3, "hashes");
         class03055 class03055 = this.N(var1, jsonarray, var2);
         return new class06068(var1, class03055);
      }
   }

   @Nullable
   public static class02593 N(String var0) {
      try {
         JsonObject jsonobject = class05001.N(var0);
         URI uri = new URI(class05001.Z(jsonobject, "apiServer"));
         String s = class05001.Z(jsonobject, "apiKey");
         if (s.isEmpty()) {
            throw new IllegalArgumentException("Missing API key");
         } else {
            int i = class05001.N(jsonobject, "ruleId", 1);
            String s1 = class05001.N(jsonobject, "serverId", "");
            String s2 = class05001.N(jsonobject, "roomId", "Java:Chat");
            int j = class05001.N(jsonobject, "hashesToDrop", -1);
            int k = class05001.N(jsonobject, "maxConcurrentRequests", 7);
            JsonObject jsonobject1 = class05001.N(jsonobject, "endpoints", null);
            String s3 = N(jsonobject1, "chat", "v1/chat");
            boolean flag = s3.equals("v1/chat");
            URL url = uri.resolve("/" + s3).toURL();
            URL url1 = N(uri, jsonobject1, "join", "v1/join");
            URL url2 = N(uri, jsonobject1, "leave", "v1/leave");
            class05479 class05479 = var2x -> {
               JsonObject jsonobjectx = new JsonObject();
               jsonobjectx.addProperty("server", s1);
               jsonobjectx.addProperty("room", s2);
               jsonobjectx.addProperty("user_id", var2x.id().toString());
               jsonobjectx.addProperty("user_display_name", var2x.name());
               return jsonobjectx;
            };
            class02571 class02571;
            if (flag) {
               class02571 = (var3x, var4x) -> {
                  JsonObject jsonobjectx = new JsonObject();
                  jsonobjectx.addProperty("rule", i);
                  jsonobjectx.addProperty("server", s1);
                  jsonobjectx.addProperty("room", s2);
                  jsonobjectx.addProperty("player", var3x.id().toString());
                  jsonobjectx.addProperty("player_display_name", var3x.name());
                  jsonobjectx.addProperty("text", var4x);
                  jsonobjectx.addProperty("language", "*");
                  return jsonobjectx;
               };
            } else {
               String s4 = String.valueOf(i);
               class02571 = (var3x, var4x) -> {
                  JsonObject jsonobjectx = new JsonObject();
                  jsonobjectx.addProperty("rule_id", s4);
                  jsonobjectx.addProperty("category", s1);
                  jsonobjectx.addProperty("subcategory", s2);
                  jsonobjectx.addProperty("user_id", var3x.id().toString());
                  jsonobjectx.addProperty("user_display_name", var3x.name());
                  jsonobjectx.addProperty("text", var4x);
                  jsonobjectx.addProperty("language", "*");
                  return jsonobjectx;
               };
            }

            class02588 class02588 = class02588.y(j);
            ExecutorService executorservice = N(k);
            String s5 = Base64.getEncoder().encodeToString(s.getBytes(StandardCharsets.US_ASCII));
            return new class05461(url, class02571, url1, class05479, url2, class05479, s5, class02588, executorservice);
         }
      } catch (Exception exception) {
         i.warn("Failed to parse chat filter config {}", var0, exception);
         return null;
      }
   }

   @Override
   public class05477 N(GameProfile var1) {
      return new class05469(this, var1);
   }

   void N(GameProfile var1, URL var2, class05479 var3, Executor var4) {
      var4.execute(() -> {
         JsonObject jsonobject = var3.encode(var1);

         try {
            this.y(jsonobject, var2);
         } catch (Exception exception) {
            i.warn("Failed to send join/leave packet to {} for player {}", new Object[]{var2, var1, exception});
         }
      });
   }

   @Override
   protected void N(HttpURLConnection var1) {
      var1.setRequestProperty("Authorization", "Basic " + this.Z);
   }
}
