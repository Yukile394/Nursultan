package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class class03085 extends DataFix {
   public class03085(Schema var1) {
      super(var1, false);
   }

   private static Dynamic<?> N(Dynamic<?> var0, OptionalDynamic<?> var1) {
      return "minecraft:overworld".equals(var1.get("dimension").asString().result().orElse("")) ? var0 : var0.remove("blending_data");
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getOutputSchema().getType(class06962.u);
      return this.fixTypeEverywhereTyped(
         "BlendingDataRemoveFromNetherEndFix", type, var0 -> var0.update(DSL.remainderFinder(), var0x -> N(var0x, var0x.get("__context")))
      );
   }
}
