package minecraft;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class class03698 implements JsonDeserializer<class03702> {
   public class03698() {
      super();
   }

   public class03702 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject jsonobject = var1.getAsJsonObject();
      class03265 class03265xxxxxxxx = this.N(var3, jsonobject, class03662.field_4320);
      class03265 class03265x = this.N(var3, jsonobject, class03662.field_4323);
      if (class03265x == class03265.N) {
         class03265x = class03265xxxxxxxx;
      }

      class03265 class03265xx = this.N(var3, jsonobject, class03662.field_4322);
      class03265 class03265xxx = this.N(var3, jsonobject, class03662.field_4321);
      if (class03265xxx == class03265.N) {
         class03265xxx = class03265xx;
      }

      class03265 class03265xxxx = this.N(var3, jsonobject, class03662.field_4316);
      class03265 class03265xxxxx = this.N(var3, jsonobject, class03662.field_4317);
      class03265 class03265xxxxxx = this.N(var3, jsonobject, class03662.field_4318);
      class03265 class03265xxxxxxx = this.N(var3, jsonobject, class03662.field_4319);
      class03265 class03265xxxxxxxx = this.N(var3, jsonobject, class03662.field_61988);
      return new class03702(
         class03265x, class03265xxxxxxxx, class03265xxx, class03265xx, class03265xxxx, class03265xxxxx, class03265xxxxxx, class03265xxxxxxx, class03265xxxxxxxx
      );
   }

   private class03265 N(JsonDeserializationContext var1, JsonObject var2, class03662 var3) {
      String s = var3.method_15434();
      return var2.has(s) ? (class03265)var1.deserialize(var2.get(s), class03265.class) : class03265.N;
   }
}
