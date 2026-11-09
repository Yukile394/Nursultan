package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class03687 extends class00622 {
   public class03687(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      var1.register(map, "minecraft:item_display", var1x -> DSL.optionalFields("item", class06962.l.in(var1)));
      var1.register(map, "minecraft:block_display", var1x -> DSL.optionalFields("block_state", class06962.d.in(var1)));
      var1.register(map, "minecraft:text_display", () -> DSL.optionalFields("text", class06962.O.in(var1)));
      return map;
   }
}
