package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

public class class05719 extends DataFix {
   public class05719(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      HashMap hashmap = Maps.newHashMap();

      for (int i = 0; i < 16; i++) {
         String s = String.valueOf(i);
         Optional optional = var0.get(s).result();
         if (optional.isPresent()) {
            Dynamic dynamic = (Dynamic)optional.get();
            Dynamic dynamic1 = var0.createMap(ImmutableMap.of(var0.createString("Records"), dynamic));
            hashmap.put(var0.createString(Integer.toString(i)), dynamic1);
            var0 = var0.remove(s);
         }
      }

      return var0.set("Sections", var0.createMap(hashmap));
   }

   protected TypeRewriteRule makeRule() {
      Type type = DSL.named(class06962.v.typeName(), DSL.remainderType());
      if (!Objects.equals(type, this.getInputSchema().getType(class06962.v))) {
         throw new IllegalStateException("Poi type is not what was expected.");
      } else {
         return this.fixTypeEverywhere("POI reorganization", type, var0 -> var0x -> var0x.mapSecond(class05719::N));
      }
   }
}
