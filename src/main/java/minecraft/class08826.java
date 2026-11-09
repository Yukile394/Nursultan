package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class08826 extends DataFix {
   public class08826(Schema var1) {
      super(var1, true);
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.k);
      OpticFinder opticfinder = type.findField("minecraft:equippable");
      return this.fixTypeEverywhereTyped(
         "equippable asset rename fix",
         type,
         var1x -> var1x.updateTyped(opticfinder, var0x -> var0x.update(DSL.remainderFinder(), var0xx -> var0xx.renameField("model", "asset_id")))
      );
   }
}
