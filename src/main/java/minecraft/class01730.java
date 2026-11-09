package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;

public class class01730 extends DataFix {
   private static final String N = "WorldGenSettings";
   private static final List<String> y = List.of(
      "RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest"
   );

   public class01730(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "LevelLegacyWorldGenSettingsFix", this.getInputSchema().getType(class06962.N), var0 -> var0.update(DSL.remainderFinder(), var0x -> {
            Dynamic dynamic = var0x.get("WorldGenSettings").orElseEmptyMap();

            for (String s : y) {
               Optional optional = var0x.get(s).result();
               if (optional.isPresent()) {
                  var0x = var0x.remove(s);
                  dynamic = dynamic.set(s, (Dynamic)optional.get());
               }
            }

            return var0x.set("WorldGenSettings", dynamic);
         })
      );
   }
}
