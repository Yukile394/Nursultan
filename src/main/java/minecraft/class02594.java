package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class02594 implements class07135 {
   private final class01996 N;

   public class02594(class01996 var1) {
      super();
      this.N = var1;
   }

   private JsonElement N() {
      JsonObject jsonobject = new JsonObject();
      Stream.of(class04263.N, class04290.L, class04290.N, class04279.L, class04279.N, class02868.L, class02868.N, class04266.L, class04266.y)
         .map(class04246::N)
         .collect(Collectors.groupingBy(class04262::N))
         .forEach((var1x, var2) -> {
            JsonObject jsonobjectx = new JsonObject();
            jsonobject.add(var1x.N(), jsonobjectx);
            var2.forEach(var1xx -> {
               JsonObject jsonobject1 = new JsonObject();
               jsonobjectx.add(var1xx.y().y(), jsonobject1);
               var1xx.N((var1xxx, var2x) -> {
                  JsonObject jsonobjectxx = new JsonObject();
                  jsonobjectxx.addProperty("protocol_id", var2x);
                  jsonobject1.add(var1xxx.y().toString(), jsonobjectxx);
               });
            });
         });
      return jsonobject;
   }

   @Override
   public String method_10321() {
      return "Packet Report";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      Path path = this.N.method_45972(class02024.field_39369).resolve("packets.json");
      return class07135.N(var1, this.N(), path);
   }
}
