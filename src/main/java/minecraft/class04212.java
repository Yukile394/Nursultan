package minecraft;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public class class04212 implements JsonDeserializer<class04237> {
   private String L(JsonObject var1) {
      return class05001.N(var1, "parent", "");
   }

   public class04212() {
      super();
   }

   private class08814 y(JsonObject var1) {
      return var1.has("textures") ? class08838.N(class05001.n(var1, "textures")) : class08814.y;
   }

   public class04237 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject jsonobject = var1.getAsJsonObject();
      class08534 class08534 = this.N(var3, jsonobject);
      String s = this.L(jsonobject);
      class08814 class08814 = this.y(jsonobject);
      Boolean obool = this.N(jsonobject);
      class03702 class03702 = null;
      if (jsonobject.has("display")) {
         JsonObject jsonobject1 = class05001.n(jsonobject, "display");
         class03702 = (class03702)var3.deserialize(jsonobject1, class03702.class);
      }

      class00140 class00140 = null;
      if (jsonobject.has("gui_light")) {
         class00140 = class00140.N(class05001.Z(jsonobject, "gui_light"));
      }

      class01894 class01894 = s.isEmpty() ? null : class01894.N(s);
      return new class04237(class08534, class00140, obool, class03702, class08814, class01894);
   }

   @Nullable
   protected class08534 N(JsonDeserializationContext var1, JsonObject var2) {
      if (!var2.has("elements")) {
         return null;
      } else {
         ArrayList arraylist = new ArrayList();

         for (JsonElement jsonelement : class05001.t(var2, "elements")) {
            arraylist.add((class02081)var1.deserialize(jsonelement, class02081.class));
         }

         return new class08505(arraylist);
      }
   }

   @Nullable
   protected Boolean N(JsonObject var1) {
      return var1.has("ambientocclusion") ? class05001.U(var1, "ambientocclusion") : null;
   }
}
