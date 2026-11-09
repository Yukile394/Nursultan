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
import java.util.Objects;
import java.util.Optional;

public class class07399 extends DataFix {
   public class07399(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.l);
      OpticFinder opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      OpticFinder opticfinder1 = type.findField("tag");
      return this.fixTypeEverywhereTyped("ItemInstanceMapIdFix", type, var2x -> {
         Optional optional = var2x.getOptional(opticfinder);
         if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:filled_map")) {
            Dynamic dynamic = (Dynamic)var2x.get(DSL.remainderFinder());
            Typed typed = var2x.getOrCreateTyped(opticfinder1);
            Dynamic dynamic1 = (Dynamic)typed.get(DSL.remainderFinder());
            dynamic1 = dynamic1.set("map", dynamic1.createInt(dynamic.get("Damage").asInt(0)));
            return var2x.set(opticfinder1, typed.set(DSL.remainderFinder(), dynamic1));
         } else {
            return var2x;
         }
      });
   }
}
