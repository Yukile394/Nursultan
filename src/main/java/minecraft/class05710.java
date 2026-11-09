package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class05710 extends class00955 {
   public class05710(Schema var1, boolean var2) {
      super(var1, var2, "Zombie Villager XP rebuild", class06962.o, "minecraft:zombie_villager");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> {
         if (var0.get("Xp").asNumber().result().isEmpty()) {
            int i = var0.get("VillagerData").get("level").asInt(1);
            return var0.set("Xp", var0.createInt(class05701.N(i)));
         } else {
            return var0;
         }
      });
   }
}
