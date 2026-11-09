package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class03500 extends DataFix {
   public class03500(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.u);
      OpticFinder opticfinder = type.findField("sections");
      return this.fixTypeEverywhereTyped("ChunkDeleteLightFix for " + this.getOutputSchema().getVersionKey(), type, var1x -> {
         var1x = var1x.update(DSL.remainderFinder(), var0x -> var0x.remove("isLightOn"));
         return var1x.updateTyped(opticfinder, var0x -> var0x.update(DSL.remainderFinder(), var0xx -> var0xx.remove("BlockLight").remove("SkyLight")));
      });
   }
}
