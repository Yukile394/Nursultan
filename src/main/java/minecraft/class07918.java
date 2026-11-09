package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import org.jspecify.annotations.Nullable;

public enum class07918 {
   field_62300(-32700, "Parse error"),
   field_62301(-32600, "Invalid Request"),
   field_62302(-32601, "Method not found"),
   field_62303(-32602, "Invalid params"),
   field_62304(-32603, "Internal error");

   private final int field_62305;
   private final String field_62306;

   private class07918(int var3, String var4) {
      this.field_62305 = var3;
      this.field_62306 = var4;
   }

   public JsonObject N(JsonElement var1) {
      return class07916.N(var1, this.field_62306, this.field_62305, null);
   }

   public JsonObject N(JsonElement var1, String var2) {
      return class07916.N(var1, this.field_62306, this.field_62305, var2);
   }

   public JsonObject N(@Nullable String var1) {
      return class07916.N(JsonNull.INSTANCE, this.field_62306, this.field_62305, var1);
   }
}
