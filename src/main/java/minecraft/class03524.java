package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class03524 extends class00955 {
   public class03524(Schema var1, boolean var2) {
      super(var1, var2, "WeaponSmithChestLootTableFix", class06962.G, "minecraft:chest");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var0 -> var0.get("LootTable").asString("").equals("minecraft:chests/village_blacksmith")
            ? var0.set("LootTable", var0.createString("minecraft:chests/village/village_weaponsmith"))
            : var0
      );
   }
}
