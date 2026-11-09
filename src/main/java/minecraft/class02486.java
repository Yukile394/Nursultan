package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class02486 extends class02479 {
   public class02486(Schema var1) {
      super(var1, "LodestoneCompassComponentFix", "minecraft:lodestone_target", "minecraft:lodestone_tracker");
   }

   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      Optional optional = var1.get("pos").result();
      Optional optional1 = var1.get("dimension").result();
      var1 = var1.remove("pos").remove("dimension");
      if (optional.isPresent() && optional1.isPresent()) {
         var1 = var1.set("target", var1.emptyMap().set("pos", (Dynamic)optional.get()).set("dimension", (Dynamic)optional1.get()));
      }

      return var1;
   }
}
