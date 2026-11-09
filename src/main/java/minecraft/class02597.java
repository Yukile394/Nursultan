package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class02597 extends DataFix {
   public class02597(Schema var1) {
      super(var1, false);
   }

   private static Typed<?> N(Typed<?> var0) {
      return var0.update(DSL.remainderFinder(), var0x -> {
         Dynamic dynamic = var0x;
         Optional optional = var0x.get("CarvingMasks").result();
         if (optional.isPresent()) {
            Optional optional1 = ((Dynamic)optional.get()).get("AIR").result();
            if (optional1.isPresent()) {
               dynamic = var0x.set("carving_mask", (Dynamic)optional1.get());
            }
         }

         return dynamic.remove("CarvingMasks");
      });
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("CarvingStepRemoveFix", this.getInputSchema().getType(class06962.u), class02597::N);
   }
}
