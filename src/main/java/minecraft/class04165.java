package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class04165 extends DataFix {
   public class04165(Schema var1) {
      super(var1, false);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      return var0.update("ExitPortalLocation", class02269::N);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "LegacyDragonFightFix", this.getInputSchema().getType(class06962.N), var0 -> var0.update(DSL.remainderFinder(), var0x -> {
            if (var0x.get("DragonFight").result().isPresent()) {
               return var0x;
            } else {
               Dynamic dynamic = var0x.get("DimensionData").get("1").get("DragonFight").orElseEmptyMap();
               return var0x.set("DragonFight", N(dynamic));
            }
         })
      );
   }
}
