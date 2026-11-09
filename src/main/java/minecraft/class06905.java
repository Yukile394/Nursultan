package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class class06905 implements class07135 {
   private final class01996 N;

   public class06905(class01996 var1) {
      super();
      this.N = var1;
   }

   private static <T> JsonElement N(class00751<T> var0) {
      JsonObject jsonobject = new JsonObject();
      if (var0 instanceof class04241) {
         class01894 class01894 = ((class04241)var0).y();
         jsonobject.addProperty("default", class01894.toString());
      }

      int i = class04206.NF.N(var0);
      jsonobject.addProperty("protocol_id", i);
      JsonObject jsonobject1 = new JsonObject();
      var0.z().forEach(var2x -> {
         Object object = var2x.N();
         int ix = var0.N(object);
         JsonObject jsonobjectx = new JsonObject();
         jsonobjectx.addProperty("protocol_id", ix);
         jsonobject1.add(var2x.B().N().toString(), jsonobjectx);
      });
      jsonobject.add("entries", jsonobject1);
      return jsonobject;
   }

   @Override
   public String method_10321() {
      return "Registry Dump";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      JsonObject jsonobject = new JsonObject();
      class04206.NF.z().forEach(var1x -> jsonobject.add(var1x.B().N().toString(), N((class00751<?>)var1x.N())));
      Path path = this.N.method_45972(class02024.field_39369).resolve("registries.json");
      return class07135.N(var1, jsonobject, path);
   }
}
