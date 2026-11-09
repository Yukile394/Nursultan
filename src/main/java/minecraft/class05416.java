package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class class05416 implements class08819 {
   private final class01894 N;

   public class05416(class01894 var1) {
      super();
      this.N = var1;
   }

   public JsonElement get() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("parent", this.N.toString());
      return jsonobject;
   }
}
