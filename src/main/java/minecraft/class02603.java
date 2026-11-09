package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class class02603 {
   private static Logger N = LoggerFactory.getLogger("minecraft.class02603");
   private static final class03069 y = class03069.N("blockstates");

   public class02603() {
      super();
   }

   public static CompletableFuture<class02572> N(class01089 var0, Executor var1) {
      Function function = class08541.N();
      return CompletableFuture.<Map>supplyAsync(() -> y.y(var0), var1).thenCompose(var2x -> {
         ArrayList arraylist = new ArrayList(var2x.size());

         for (Entry entry : var2x.entrySet()) {
            arraylist.add(CompletableFuture.supplyAsync(() -> {
               class01894 class01894 = y.y((class01894)entry.getKey());
               class00507 class00507 = (class00507)function.apply(class01894);
               if (class00507 == null) {
                  N.debug("Discovered unknown block state definition {}, ignoring", class01894);
                  return null;
               } else {
                  List list = (List)entry.getValue();
                  ArrayList arraylistx = new ArrayList(list.size());

                  for (class01079 class01079 : list) {
                     try (BufferedReader bufferedreader = class01079.method_43039()) {
                        JsonElement jsonelement = class08326.N(bufferedreader);
                        class04127 class04127 = (class04127)class04127.y.parse(JsonOps.INSTANCE, jsonelement).getOrThrow(JsonParseException::new);
                        arraylistx.add(new class02608(class01079.method_14480(), class04127));
                     } catch (Exception exception1) {
                        N.error("Failed to load blockstate definition {} from pack {}", new Object[]{class01894, class01079.method_14480(), exception1});
                     }
                  }

                  try {
                     return N(class01894, class00507, arraylistx);
                  } catch (Exception exception) {
                     N.error("Failed to load blockstate definition {}", class01894, exception);
                     return null;
                  }
               }
            }, var1));
         }

         return class07536.L(arraylist).thenApply(var0xx -> {
            IdentityHashMap identityhashmap = new IdentityHashMap();

            for (class02572 class02572 : var0xx) {
               if (class02572 != null) {
                  identityhashmap.putAll(class02572.N());
               }
            }

            return new class02572(identityhashmap);
         });
      });
   }

   private static class02572 N(class01894 var0, class00507<class00891, class00500> var1, List<class02608> var2) {
      IdentityHashMap identityhashmap = new IdentityHashMap();

      for (class02608 class02608 : var2) {
         identityhashmap.putAll(class02608.y().N(var1, () -> var0 + "/" + class02608.N()));
      }

      return new class02572(identityhashmap);
   }
}
