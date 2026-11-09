package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class06981 extends DataFix {
   public class06981(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "PlayerRespawnDataFix",
         this.getInputSchema().getType(class06962.L),
         var0 -> var0.update(
            DSL.remainderFinder(),
            var0x -> var0x.update(
               "respawn",
               var0xx -> var0xx.set("dimension", var0xx.createString(var0xx.get("dimension").asString("minecraft:overworld")))
                  .set("yaw", var0xx.createFloat(var0xx.get("angle").asFloat(0.0F)))
                  .set("pitch", var0xx.createFloat(0.0F))
                  .remove("angle")
            )
         )
      );
   }
}
