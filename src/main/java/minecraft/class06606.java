package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class06606 extends DataFix {
   public class06606(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.l);
      OpticFinder opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      OpticFinder opticfinder1 = type.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemWaterPotionFix",
         type,
         var2x -> {
            Optional optional = var2x.getOptional(opticfinder);
            if (optional.isPresent()) {
               String s = (String)((Pair)optional.get()).getSecond();
               if ("minecraft:potion".equals(s)
                  || "minecraft:splash_potion".equals(s)
                  || "minecraft:lingering_potion".equals(s)
                  || "minecraft:tipped_arrow".equals(s)) {
                  Typed typed = var2x.getOrCreateTyped(opticfinder1);
                  Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
                  if (dynamic.get("Potion").asString().result().isEmpty()) {
                     dynamic = dynamic.set("Potion", dynamic.createString("minecraft:water"));
                  }

                  return var2x.set(opticfinder1, typed.set(DSL.remainderFinder(), dynamic));
               }
            }

            return var2x;
         }
      );
   }
}
