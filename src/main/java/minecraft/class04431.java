package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class class04431 extends DataFix {
   private final String N;
   private static final Set<String> y = Set.of("minecraft:empty", "minecraft:structure_starts", "minecraft:structure_references", "minecraft:biomes");

   public class04431(Schema var1) {
      super(var1, false);
      this.N = "Blending Data Fix v" + var1.getVersionKey();
   }

   private static Dynamic<?> N(Dynamic<?> var0, int var1, int var2) {
      return var0.set(
         "blending_data",
         var0.createMap(
            Map.of(
               var0.createString("min_section"),
               var0.createInt(class01296.N(var2)),
               var0.createString("max_section"),
               var0.createInt(class01296.N(var2 + var1))
            )
         )
      );
   }

   private static Dynamic<?> N(Dynamic<?> var0, OptionalDynamic<?> var1) {
      var0 = var0.remove("blending_data");
      boolean flag = "minecraft:overworld".equals(var1.get("dimension").asString().result().orElse(""));
      Optional optional = var0.get("Status").result();
      if (flag && optional.isPresent()) {
         String s = class00622.N(((Dynamic)optional.get()).asString("empty"));
         Optional optional1 = var0.get("below_zero_retrogen").result();
         if (!y.contains(s)) {
            var0 = N(var0, 384, -64);
         } else if (optional1.isPresent()) {
            String s1 = class00622.N(((Dynamic)optional1.get()).get("target_status").asString("empty"));
            if (!y.contains(s1)) {
               var0 = N(var0, 256, 0);
            }
         }
      }

      return var0;
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getOutputSchema().getType(class06962.u);
      return this.fixTypeEverywhereTyped(this.N, type, var0 -> var0.update(DSL.remainderFinder(), var0x -> N(var0x, var0x.get("__context"))));
   }
}
