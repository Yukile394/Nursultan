package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class class04996 extends DataFix {
   public class04996(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      return this.fixTypeEverywhereTyped("BedItemColorFix", this.getInputSchema().getType(class06962.l), var1x -> {
         Optional optional = var1x.getOptional(opticfinder);
         if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:bed")) {
            Dynamic dynamic = (Dynamic)var1x.get(DSL.remainderFinder());
            if (dynamic.get("Damage").asInt(0) == 0) {
               return var1x.set(DSL.remainderFinder(), dynamic.set("Damage", dynamic.createShort((short)14)));
            }
         }

         return var1x;
      });
   }
}
