package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class02821 extends DataFix {
   public class02821(Schema var1) {
      super(var1, false);
   }

   public TypeRewriteRule makeRule() {
      OpticFinder opticfinder = DSL.typeFinder(this.getInputSchema().getType(class06962.l));
      return this.fixTypeEverywhereTyped(
         "EmptyItemInHotbarFix", this.getInputSchema().getType(class06962.i), var1x -> var1x.update(opticfinder, var0x -> var0x.mapSecond(var0xx -> {
            Optional optional = ((Either)var0xx.getFirst()).left().map(Pair::getSecond);
            Dynamic dynamic = (Dynamic)((Pair)var0xx.getSecond()).getSecond();
            boolean flag = optional.isEmpty() || ((String)optional.get()).equals("minecraft:air");
            boolean flag1 = dynamic.get("Count").asInt(0) <= 0;
            return !flag && !flag1 ? var0xx : Pair.of(Either.right(Unit.INSTANCE), Pair.of(Either.right(Unit.INSTANCE), dynamic.emptyMap()));
         }))
      );
   }
}
