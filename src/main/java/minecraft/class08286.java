package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.stream.Stream;

public class class08286 extends DataFix {
   public class08286(Schema var1) {
      super(var1, true);
   }

   protected TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "Food to consumable fix",
         this.getInputSchema().getType(class06962.k),
         this.getOutputSchema().getType(class06962.k),
         var0 -> {
            Optional optional = var0.get("minecraft:food").result();
            if (optional.isPresent()) {
               float f = ((Dynamic)optional.get()).get("eat_seconds").asFloat(1.6F);
               Stream stream = ((Dynamic)optional.get())
                  .get("effects")
                  .asStream()
                  .map(
                     var0x -> var0x.emptyMap()
                        .set("type", var0x.createString("minecraft:apply_effects"))
                        .set("effects", var0x.createList(var0x.get("effect").result().stream()))
                        .set("probability", var0x.createFloat(var0x.get("probability").asFloat(1.0F)))
                  );
               var0 = Dynamic.copyField((Dynamic)optional.get(), "using_converts_to", var0, "minecraft:use_remainder");
               var0 = var0.set("minecraft:food", ((Dynamic)optional.get()).remove("eat_seconds").remove("effects").remove("using_converts_to"));
               return var0.set(
                  "minecraft:consumable", var0.emptyMap().set("consume_seconds", var0.createFloat(f)).set("on_consume_effects", var0.createList(stream))
               );
            } else {
               return var0;
            }
         }
      );
   }
}
