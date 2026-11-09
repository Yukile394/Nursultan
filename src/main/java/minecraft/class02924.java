package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class02924 extends class00622 {
   public class02924(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      var1.register(map, "minecraft:trader_llama", var1x -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var1)), "SaddleItem", class06962.l.in(var1)));
      return map;
   }
}
