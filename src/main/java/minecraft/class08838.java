package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Map;
import java.util.Map.Entry;
import org.jspecify.annotations.Nullable;

public class class08838 {
   public static final class08838 N = new class08838(Map.of());
   private static final char y = '#';
   private final Map<String, class05913> L;

   class08838(Map<String, class05913> var1) {
      super();
      this.L = var1;
   }

   private static boolean y(String var0) {
      return var0.charAt(0) == '#';
   }

   public static class08814 N(JsonObject var0) {
      class08823 class08823 = new class08823();

      for (Entry entry : var0.entrySet()) {
         N((String)entry.getKey(), ((JsonElement)entry.getValue()).getAsString(), class08823);
      }

      return class08823.N();
   }

   private static void N(String var0, String var1, class08823 var2) {
      if (y(var1)) {
         var2.N(var0, var1.substring(1));
      } else {
         class01894 class01894 = class01894.L(var1);
         if (class01894 == null) {
            throw new JsonParseException(var1 + " is not valid resource location");
         }

         var2.N(var0, new class05913(class00183.N, class01894));
      }
   }

   @Nullable
   public class05913 N(String var1) {
      if (y(var1)) {
         var1 = var1.substring(1);
      }

      return this.L.get(var1);
   }
}
