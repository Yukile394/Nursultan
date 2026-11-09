package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class08622 extends class00622 {
   public class08622(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      var1.registerSimple(map, "minecraft:test_block");
      var1.register(
         map,
         "minecraft:test_instance_block",
         () -> DSL.optionalFields(
            "data", DSL.optionalFields("error_message", class06962.O.in(var1)), "errors", DSL.list(DSL.optionalFields("text", class06962.O.in(var1)))
         )
      );
      return map;
   }
}
