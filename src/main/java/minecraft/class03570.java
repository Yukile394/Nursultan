package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class03570 extends class00955 {
   public class03570(Schema var1) {
      super(var1, false, "EntityBrushableBlockFieldsRenameFix", class06962.G, "minecraft:brushable_block");
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      return var1.renameField("loot_table", "LootTable").renameField("loot_table_seed", "LootTableSeed");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
