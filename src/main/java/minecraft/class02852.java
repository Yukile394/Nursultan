package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class02852 extends class00622 {
   public class02852(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      var1.register(map, "minecraft:beehive", () -> DSL.optionalFields("bees", DSL.list(DSL.optionalFields("entity_data", class06962.J.in(var1)))));
      return map;
   }
}
