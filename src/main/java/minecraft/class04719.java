package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.util.UndashedUuid;
import java.time.Instant;
import java.util.UUID;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class04719 {
   public class04719() {
      super();
   }

   public static Instant y(String var0, JsonObject var1) {
      JsonElement jsonelement = var1.get(var0);
      return jsonelement != null ? Instant.ofEpochMilli(Long.parseLong(jsonelement.getAsString())) : Instant.EPOCH;
   }

   @Nullable
   public static <T> T y(String var0, JsonObject var1, Function<JsonObject, T> var2) {
      JsonElement jsonelement = var1.get(var0);
      if (jsonelement == null || jsonelement.isJsonNull()) {
         return null;
      } else if (!jsonelement.isJsonObject()) {
         throw new IllegalStateException("Required property " + var0 + " was not a JsonObject as espected");
      } else {
         return (T)var2.apply(jsonelement.getAsJsonObject());
      }
   }

   public static int N(String var0, JsonObject var1, int var2) {
      JsonElement jsonelement = var1.get(var0);
      if (jsonelement != null) {
         return jsonelement.isJsonNull() ? var2 : jsonelement.getAsInt();
      } else {
         return var2;
      }
   }

   public static long N(String var0, JsonObject var1, long var2) {
      JsonElement jsonelement = var1.get(var0);
      if (jsonelement != null) {
         return jsonelement.isJsonNull() ? var2 : jsonelement.getAsLong();
      } else {
         return var2;
      }
   }

   public static boolean N(String var0, JsonObject var1, boolean var2) {
      JsonElement jsonelement = var1.get(var0);
      if (jsonelement != null) {
         return jsonelement.isJsonNull() ? var2 : jsonelement.getAsBoolean();
      } else {
         return var2;
      }
   }

   @Nullable
   public static UUID N(String var0, JsonObject var1, @Nullable UUID var2) {
      String s = N(var0, var1, null);
      return s == null ? var2 : UndashedUuid.fromStringLenient(s);
   }

   public static <T> T N(String var0, JsonObject var1, Function<JsonObject, T> var2) {
      JsonElement jsonelement = var1.get(var0);
      if (jsonelement == null || jsonelement.isJsonNull()) {
         throw new IllegalStateException("Missing required property: " + var0);
      } else if (!jsonelement.isJsonObject()) {
         throw new IllegalStateException("Required property " + var0 + " was not a JsonObject as espected");
      } else {
         return (T)var2.apply(jsonelement.getAsJsonObject());
      }
   }

   @Nullable
   public static String N(String var0, JsonObject var1, @Nullable String var2) {
      JsonElement jsonelement = var1.get(var0);
      if (jsonelement != null) {
         return jsonelement.isJsonNull() ? var2 : jsonelement.getAsString();
      } else {
         return var2;
      }
   }

   public static String N(String var0, JsonObject var1) {
      String s = N(var0, var1, null);
      if (s == null) {
         throw new IllegalStateException("Missing required property: " + var0);
      } else {
         return s;
      }
   }
}
