package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class03596 {
   private static final String N = "translationKey";
   private static final String y = "args";
   private final String L;
   @Nullable
   private final String[] u;

   private class03596(String var1, @Nullable String[] var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   @Override
   public String toString() {
      return this.L;
   }

   public class00392 N(class00392 var1) {
      return Objects.requireNonNullElse(this.N(), var1);
   }

   public static class03596 N(JsonObject var0) {
      String s = class04719.N("translationKey", var0);
      JsonElement jsonelement = var0.get("args");
      String[] astring;
      if (jsonelement != null && !jsonelement.isJsonNull()) {
         JsonArray jsonarray = jsonelement.getAsJsonArray();
         astring = new String[jsonarray.size()];

         for (int i = 0; i < jsonarray.size(); i++) {
            astring[i] = jsonarray.get(i).getAsString();
         }
      } else {
         astring = null;
      }

      return new class03596(s, astring);
   }

   @Nullable
   public class00392 N() {
      if (!class08392.N(this.L)) {
         return null;
      } else {
         return this.u == null ? class00392.L(this.L) : class00392.N(this.L, this.u);
      }
   }
}
