package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class class08271 implements class07135 {
   private final class01996 i;
   private static final class08269 R = new class08269(true, false, true);
   private static final class08269 M = new class08269(true, true, true);
   private static final class08269 B = new class08269(true, true, false);
   private static final class08269 Z = new class08269(false, true, true);
   private static final Map<class05946<? extends class00751<?>>, class08269> z = Map.of(
      class04227.yV, R, class04227.yK, R, class04227.yJ, M, class04227.yo, M, class04227.yq, M
   );
   private static final Map<String, class08249> U = Map.of(
      "structure",
      new class08249(class08264.field_53708, new class08269(true, false, true)),
      "function",
      new class08249(class08264.field_53709, new class08269(true, true, true))
   );
   static final Codec<class05946<? extends class00751<?>>> N = class01894.N.xmap(class05946::N, class05946::N);

   public class08271(class01996 var1) {
      super();
      this.i = var1;
   }

   private void N(Map<class05946<? extends class00751<?>>, class08269> var1, class05946<? extends class00751<?>> var2, class08269 var3) {
      if (var1.putIfAbsent(var2, var3) != null) {
         throw new IllegalStateException("Duplicate entry for key " + var2.N());
      }
   }

   private Map<class05946<? extends class00751<?>>, class08269> N() {
      HashMap hashmap = new HashMap();
      class04206.NF.forEach(var2 -> this.N(hashmap, var2.i(), Z));
      class03078.N.forEach(var2 -> this.N(hashmap, var2.N(), B));
      class03078.y.forEach(var2 -> this.N(hashmap, var2.N(), B));
      z.forEach((var2, var3) -> this.N(hashmap, (class05946<? extends class00751<?>>)var2, var3));
      return hashmap;
   }

   @Override
   public String method_10321() {
      return "Datapack Structure";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      class08267 class08267 = new class08267(this.N(), U);
      Path path = this.i.method_45972(class02024.field_39369).resolve("datapack.json");
      return class07135.N(var1, (JsonElement)class08267.N.encodeStart(JsonOps.INSTANCE, class08267).getOrThrow(), path);
   }
}
