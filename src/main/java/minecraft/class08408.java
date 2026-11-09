package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.Map;

public class class08408 extends DataFix {
   private static final Map<Integer, String> N = Map.of(100, "feet", 101, "legs", 102, "chest", 103, "head", -106, "offhand");

   public class08408(Schema var1) {
      super(var1, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getTypeRaw(class06962.L);
      Type<?> type1 = this.getOutputSchema().getTypeRaw(class06962.L);
      return this.writeFixAndRead("Player Equipment Fix", type, type1, var0 -> {
         HashMap hashmap = new HashMap();
         var0 = var0.update("Inventory", var1x -> var1x.createList(var1x.asStream().filter(var2xx -> {
            int i = var2xx.get("Slot").asInt(-1);
            String s = N.get(i);
            if (s != null) {
               hashmap.put(var1x.createString(s), var2xx.remove("Slot"));
            }

            return s == null;
         })));
         return var0.set("equipment", var0.createMap(hashmap));
      });
   }
}
