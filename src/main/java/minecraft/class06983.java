package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.IntStream;

public class class06983 extends DataFix {
   public class06983(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "WorldSpawnDataFix",
         this.getInputSchema().getType(class06962.N),
         var0 -> var0.update(
            DSL.remainderFinder(),
            var0x -> {
               int i = var0x.get("SpawnX").asInt(0);
               int j = var0x.get("SpawnY").asInt(0);
               int k = var0x.get("SpawnZ").asInt(0);
               float f = var0x.get("SpawnAngle").asFloat(0.0F);
               Dynamic dynamic = var0x.emptyMap()
                  .set("dimension", var0x.createString("minecraft:overworld"))
                  .set("pos", var0x.createIntList(IntStream.of(i, j, k)))
                  .set("yaw", var0x.createFloat(f))
                  .set("pitch", var0x.createFloat(0.0F));
               var0x = var0x.remove("SpawnX").remove("SpawnY").remove("SpawnZ").remove("SpawnAngle");
               return var0x.set("spawn", dynamic);
            }
         )
      );
   }
}
