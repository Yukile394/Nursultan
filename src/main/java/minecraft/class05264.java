package minecraft;

import com.google.gson.JsonObject;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.util.Map;
import java.util.Optional;

record class05264(JsonObject generatorSettings, String levelType) {
   private static final Map<String, class05946<class04382>> L = Map.of("default", class05964.N, "largebiomes", class05964.L);

   class05264(JsonObject generatorSettings, String levelType) {
      this.generatorSettings = generatorSettings;
      this.levelType = levelType;
   }

   public String y() {
      return this.levelType;
   }

   public class03764 N(class01929 var1) {
      class01921 class01921 = var1.y(class04227.yO);
      class03529 class03529 = class01921.N(class05964.N)
         .or(() -> class01921.z().findAny())
         .orElseThrow(() -> new IllegalStateException("Invalid datapack contents: can't find default preset"));
      class03556 class03556 = Optional.ofNullable(class01894.L(this.levelType))
         .map(var0 -> class05946.N(class04227.yO, var0))
         .or(() -> Optional.ofNullable(L.get(this.levelType)))
         .flatMap(class01921::N)
         .orElseGet(() -> {
            class05270.N.warn("Failed to parse level-type {}, defaulting to {}", this.levelType, class03529.B().N());
            return class03529;
         });
      class03764 class03764 = ((class04382)class03556.N()).N();
      if (class03556.N(class05964.y)) {
         class03519 class03519 = var1.N(JsonOps.INSTANCE);
         Optional<class01584> optional = class01584.N.parse(new Dynamic(class03519, this.N())).resultOrPartial(class05270.N::error);
         if (optional.isPresent()) {
            return class03764.N(var1, new class07850(optional.get()));
         }
      }

      return class03764;
   }

   public JsonObject N() {
      return this.generatorSettings;
   }
}
