package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.stream.Stream;

public class class08807 extends DataFix {
   public class08807(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.k);
      return this.fixTypeEverywhereTyped(
         "Custom Model Data expansion", type, var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.update("minecraft:custom_model_data", var0xx -> {
            float f = var0xx.asNumber(0.0F).floatValue();
            return var0xx.createMap(Map.of(var0xx.createString("floats"), var0xx.createList(Stream.of(var0xx.createFloat(f)))));
         }))
      );
   }
}
