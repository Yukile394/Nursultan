package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08708 extends class02479 {
   public class08708(Schema var1) {
      super(var1, "FireResistantToDamageResistantComponentFix", "minecraft:fire_resistant", "minecraft:damage_resistant");
   }

   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      return var1.emptyMap().set("types", var1.createString("#minecraft:is_fire"));
   }
}
