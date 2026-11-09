package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Map;

public class class03293 extends DataFix {
   public class03293(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.A);
      OpticFinder opticfinder = type.findField("dimensions");
      return this.fixTypeEverywhereTyped(
         "WorldGenSettingsDisallowOldCustomWorldsFix_" + this.getOutputSchema().getVersionKey(), type, var1x -> var1x.updateTyped(opticfinder, var0x -> {
            var0x.write().map(var0xx -> var0xx.getMapValues().map(var0xxx -> {
               var0xxx.forEach((var0xxxx, var1xx) -> {
                  if (var1xx.get("type").asString().result().isEmpty()) {
                     throw new class03140("Unable load old custom worlds.");
                  }
               });
               return var0xxx;
            }));
            return var0x;
         })
      );
   }
}
