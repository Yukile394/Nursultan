package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class02658 extends DataFix {
   public class02658(Schema var1) {
      super(var1, false);
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.Y);
      return this.writeFixAndRead("EmptyItemInVillagerTradeFix", type, type, var0 -> {
         Dynamic dynamic = var0.get("buyB").orElseEmptyMap();
         String s = class00622.N(dynamic.get("id").asString("minecraft:air"));
         int i = dynamic.get("count").asInt(0);
         return !s.equals("minecraft:air") && i != 0 ? var0 : var0.remove("buyB");
      });
   }
}
