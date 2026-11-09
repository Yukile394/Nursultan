package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class class03731 {
   private static final String N = N("");

   public static String L(String var0) {
      if (!var0.isEmpty() && !var0.equals("null")) {
         char c0 = var0.charAt(0);
         char c1 = var0.charAt(var0.length() - 1);
         if (c0 == '"' && c1 == '"' || c0 == '{' && c1 == '}' || c0 == '[' && c1 == ']') {
            try {
               JsonElement jsonelement = class08314.N(var0);
               if (jsonelement.isJsonPrimitive()) {
                  return N(jsonelement.getAsString());
               }

               return class05001.i(jsonelement);
            } catch (JsonParseException jsonparseexception) {
            }
         }

         return N(var0);
      } else {
         return N;
      }
   }

   public class03731() {
      super();
   }

   public static Optional<String> u(String var0) {
      try {
         JsonElement jsonelement = class08314.N(var0);
         if (jsonelement.isJsonObject()) {
            JsonElement jsonelement1 = jsonelement.getAsJsonObject().get("translate");
            if (jsonelement1 != null && jsonelement1.isJsonPrimitive()) {
               return Optional.of(jsonelement1.getAsString());
            }
         }
      } catch (JsonParseException jsonparseexception) {
      }

      return Optional.empty();
   }

   public static <T> Dynamic<T> y(DynamicOps<T> var0, String var1) {
      String s = y(var1);
      return new Dynamic(var0, var0.createString(s));
   }

   public static String y(String var0) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("translate", var0);
      return class05001.i(jsonobject);
   }

   public static String N(String var0) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("text", var0);
      return class05001.i(jsonobject);
   }

   public static boolean N(Dynamic<?> var0) {
      return var0.asString().result().filter(var0x -> {
         try {
            class08326.N(var0x);
            return true;
         } catch (JsonParseException jsonparseexception) {
            return false;
         }
      }).isPresent();
   }

   public static <T> Dynamic<T> N(DynamicOps<T> var0, String var1) {
      String s = N(var1);
      return new Dynamic(var0, var0.createString(s));
   }

   public static <T> Dynamic<T> N(DynamicOps<T> var0) {
      return new Dynamic(var0, var0.createString(N));
   }
}
