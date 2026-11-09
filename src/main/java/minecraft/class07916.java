package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class07916 {
   public static final String N = "2.0";
   public static final String y = "1.3.2";

   @Nullable
   public static JsonElement L(JsonObject var0) {
      return var0.get("params");
   }

   public class07916() {
      super();
   }

   @Nullable
   public static JsonObject i(JsonObject var0) {
      return class05001.N(var0, "error", null);
   }

   @Nullable
   public static JsonElement u(JsonObject var0) {
      return var0.get("result");
   }

   @Nullable
   public static String y(JsonObject var0) {
      return class05001.N(var0, "method", null);
   }

   public static JsonObject N(JsonElement var0, JsonElement var1) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("jsonrpc", "2.0");
      jsonobject.add("id", var0);
      jsonobject.add("result", var1);
      return jsonobject;
   }

   @Nullable
   public static JsonElement N(JsonObject var0) {
      return var0.get("id");
   }

   public static JsonObject N(@Nullable Integer var0, class01894 var1, List<JsonElement> var2) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("jsonrpc", "2.0");
      if (var0 != null) {
         jsonobject.addProperty("id", var0);
      }

      jsonobject.addProperty("method", var1.toString());
      if (!var2.isEmpty()) {
         JsonArray jsonarray = new JsonArray(var2.size());

         for (JsonElement jsonelement : var2) {
            jsonarray.add(jsonelement);
         }

         jsonobject.add("params", jsonarray);
      }

      return jsonobject;
   }

   public static JsonObject N(JsonElement var0, String var1, int var2, @Nullable String var3) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("jsonrpc", "2.0");
      jsonobject.add("id", var0);
      JsonObject jsonobject1 = new JsonObject();
      jsonobject1.addProperty("code", var2);
      jsonobject1.addProperty("message", var1);
      if (var3 != null && !var3.isBlank()) {
         jsonobject1.addProperty("data", var3);
      }

      jsonobject.add("error", jsonobject1);
      return jsonobject;
   }
}
