package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import org.jspecify.annotations.Nullable;

public class class08154 extends class02479 {
   public class08154(Schema var1) {
      super(var1, "TridentAnimationFix", "minecraft:consumable");
   }

   @Nullable
   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      return var1.update("animation", var0 -> {
         String s = var0.asString().result().orElse("");
         return "spear".equals(s) ? var0.createString("trident") : var0;
      });
   }
}
