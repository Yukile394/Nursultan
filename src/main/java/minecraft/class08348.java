package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08348 extends class00955 {
   public class08348(Schema var1) {
      super(var1, false, "AreaEffectCloudDurationScaleFix", class06962.o, "minecraft:area_effect_cloud");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.set("potion_duration_scale", var0.createFloat(0.25F)));
   }
}
