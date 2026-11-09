package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class05466 extends DataFix {
   public class05466(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      if (var0.get("Name").asString().result().equals(Optional.of("minecraft:cauldron"))) {
         return var0.get("Properties").orElseEmptyMap().get("level").asString("0").equals("0")
            ? var0.remove("Properties")
            : var0.set("Name", var0.createString("minecraft:water_cauldron"));
      } else {
         return var0;
      }
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "cauldron_rename_fix", this.getInputSchema().getType(class06962.d), var0 -> var0.update(DSL.remainderFinder(), class05466::N)
      );
   }
}
