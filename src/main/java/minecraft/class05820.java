package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class class05820 extends DataFix {
   public class05820(Schema var1, boolean var2) {
      super(var1, var2);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.u);
      Type<?> type1 = type.findFieldType("Level");
      OpticFinder opticfinder = DSL.fieldFinder("Level", type1);
      return this.fixTypeEverywhereTyped(
         "ChunkStatusFix", type, this.getOutputSchema().getType(class06962.u), var1x -> var1x.updateTyped(opticfinder, var0x -> {
            Dynamic<?> dynamic = (Dynamic<?>)var0x.get(DSL.remainderFinder());
            if (Objects.equals(dynamic.get("Status").asString("empty"), "postprocessed")) {
               dynamic = dynamic.set("Status", dynamic.createString("fullchunk"));
            }

            return var0x.set(DSL.remainderFinder(), dynamic);
         })
      );
   }
}
