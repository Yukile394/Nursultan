package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;

public class class03517 extends DataFix {
   public class03517(Schema var1) {
      super(var1, false);
   }

   private static Dynamic<?> N(Dynamic<?> var0, int var1, int var2, Optional<? extends Dynamic<?>> var3, String var4) {
      if (var3.isPresent()) {
         List list = ((Dynamic)var3.get()).asStream().filter(var2x -> {
            int i = var2x.get("x").asInt(0);
            int j = var2x.get("z").asInt(0);
            int k = Math.abs(var1 - (i >> 4));
            int l = Math.abs(var2 - (j >> 4));
            return (k != 0 || l != 0) && k <= 1 && l <= 1;
         }).toList();
         if (!list.isEmpty()) {
            var0 = var0.set("UpgradeData", var0.get("UpgradeData").orElseEmptyMap().set(var4, var0.createList(list.stream())));
         }
      }

      return var0;
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.u);
      OpticFinder opticfinder = type.findField("block_ticks");
      return this.fixTypeEverywhereTyped("Handle ticks saved in the wrong chunk", type, var1x -> {
         Optional optional = var1x.getOptionalTyped(opticfinder);
         Optional optional1 = optional.isPresent() ? ((Typed)optional.get()).write().result() : Optional.empty();
         return var1x.update(DSL.remainderFinder(), var1xx -> {
            int i = var1xx.get("xPos").asInt(0);
            int j = var1xx.get("zPos").asInt(0);
            Optional optional2 = var1xx.get("fluid_ticks").get().result();
            var1xx = N(var1xx, i, j, optional1, "neighbor_block_ticks");
            return N(var1xx, i, j, optional2, "neighbor_fluid_ticks");
         });
      });
   }
}
