package minecraft;

import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class class07106 implements class07135 {
   private final class01996 N;
   private final CompletableFuture<class01929> i;

   public class07106(class01996 var1, CompletableFuture<class01929> var2) {
      super();
      this.N = var1;
      this.i = var2;
   }

   @Override
   public String method_10321() {
      return "Block List";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      Path path = this.N.method_45972(class02024.field_39369).resolve("blocks.json");
      return this.i
         .thenCompose(
            var2x -> {
               JsonObject jsonobject = new JsonObject();
               class03519 class03519 = var2x.N(JsonOps.INSTANCE);
               var2x.y(class04227.Z)
                  .z()
                  .forEach(
                     var2xx -> {
                        JsonObject jsonobject1 = new JsonObject();
                        class00507<class00891, class00500> class00507 = var2xx.N().E();
                        if (!class00507.u().isEmpty()) {
                           JsonObject jsonobject2 = new JsonObject();

                           for (class08092<?> class08092 : class00507.u()) {
                              JsonArray jsonarray = new JsonArray();

                              for (Comparable var10 : class08092.N()) {
                                 jsonarray.add(class07536.N(class08092, var10));
                              }

                              jsonobject2.add(class08092.R(), jsonarray);
                           }

                           jsonobject1.add("properties", jsonobject2);
                        }

                        JsonArray jsonarray1 = new JsonArray();
                        UnmodifiableIterator unmodifiableiterator = class00507.N().iterator();

                        while (unmodifiableiterator.hasNext()) {
                           class00500 class00500 = (class00500)unmodifiableiterator.next();
                           JsonObject jsonobject3 = new JsonObject();
                           JsonObject jsonobject4 = new JsonObject();

                           for (class08092<?> class08092 : class00507.u()) {
                              jsonobject4.addProperty(class08092.R(), class07536.N(class08092, class00500.L(class08092)));
                           }

                           if (!jsonobject4.isEmpty()) {
                              jsonobject3.add("properties", jsonobject4);
                           }

                           jsonobject3.addProperty("id", class00891.W(class00500));
                           if (class00500 == var2xx.N().W()) {
                              jsonobject3.addProperty("default", true);
                           }

                           jsonarray1.add(jsonobject3);
                        }

                        jsonobject1.add("states", jsonarray1);
                        String s = var2xx.M();
                        JsonElement jsonelement = (JsonElement)class03705.N
                           .codec()
                           .encodeStart(class03519, var2xx.N())
                           .getOrThrow(var1xxx -> new AssertionError("Failed to serialize block " + s + " (is type registered in BlockTypes?): " + var1xxx));
                        jsonobject1.add("definition", jsonelement);
                        jsonobject.add(s, jsonobject1);
                     }
                  );
               return class07135.N(var1, jsonobject, path);
            }
         );
   }
}
