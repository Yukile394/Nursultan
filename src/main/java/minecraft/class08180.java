package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class class08180 extends DataFix {
   public class08180(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "DebugProfileOverlayReferenceFix",
         this.getInputSchema().getType(class06962.t),
         var0 -> var0.update(
            DSL.remainderFinder(),
            var0x -> var0x.update(
               "custom",
               var0xx -> var0xx.updateMapValues(
                  var0xxx -> var0xxx.mapSecond(var0xxxx -> var0xxxx.asString("").equals("inF3") ? var0xxxx.createString("inOverlay") : var0xxxx)
               )
            )
         )
      );
   }
}
