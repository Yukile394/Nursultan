package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class class01746 extends class01733 {
   private static <T> Dynamic<T> L(Dynamic<T> var0) {
      return var0.set("block_state", var0.createMap(Map.of(var0.createString("Name"), var0.createString("minecraft:tnt"))));
   }

   public class01746(Schema var1) {
      super(var1, true, "PrimedTnt BlockState fixer", class06962.o, "minecraft:tnt");
   }

   private static <T> Dynamic<T> y(Dynamic<T> var0) {
      Optional optional = var0.get("Fuse").get().result();
      return optional.isPresent() ? var0.set("fuse", (Dynamic)optional.get()) : var0;
   }

   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      return y(L(var1));
   }
}
