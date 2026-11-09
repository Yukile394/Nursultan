package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import org.jspecify.annotations.Nullable;

public class class02047 implements JsonDeserializer<class02067> {
   private static final int N = -1;
   private static final int y = 0;

   @Nullable
   private static class07211 L(JsonObject var0) {
      return class07211.N(class05001.N(var0, "cullface", ""));
   }

   public class02047() {
      super();
   }

   @Nullable
   private static class02052 i(JsonObject var0) {
      if (!var0.has("uv")) {
         return null;
      } else {
         JsonArray jsonarray = class05001.t(var0, "uv");
         if (jsonarray.size() != 4) {
            throw new JsonParseException("Expected 4 uv values, found: " + jsonarray.size());
         } else {
            float f = class05001.i(jsonarray.get(0), "minU");
            float f1 = class05001.i(jsonarray.get(1), "minV");
            float f2 = class05001.i(jsonarray.get(2), "maxU");
            float f3 = class05001.i(jsonarray.get(3), "maxV");
            return new class02052(f, f1, f2, f3);
         }
      }
   }

   private static class08511 u(JsonObject var0) {
      return class08511.N(class05001.N(var0, "rotation", 0));
   }

   private static String y(JsonObject var0) {
      return class05001.Z(var0, "texture");
   }

   public class02067 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject jsonobject = var1.getAsJsonObject();
      class07211 class07211 = L(jsonobject);
      int i = N(jsonobject);
      String s = y(jsonobject);
      class02052 class02052 = i(jsonobject);
      class08511 class08511 = u(jsonobject);
      return new class02067(class07211, i, s, class02052, class08511);
   }

   private static int N(JsonObject var0) {
      return class05001.N(var0, "tintindex", -1);
   }
}
