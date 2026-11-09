package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class04399 extends DataFix {
   public class04399(Schema var1) {
      super(var1, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.u);
      OpticFinder<?> opticfinder = type.findField("sections");
      return this.fixTypeEverywhereTyped(
         "ChunkDeleteIgnoredLightDataFix",
         type,
         var1x -> !((Dynamic)var1x.get(DSL.remainderFinder())).get("isLightOn").asBoolean(false)
            ? var1x.updateTyped(opticfinder, var0x -> var0x.update(DSL.remainderFinder(), var0xx -> var0xx.remove("BlockLight").remove("SkyLight")))
            : var1x
      );
   }
}
