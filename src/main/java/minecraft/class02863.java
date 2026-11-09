package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class02863 extends class00622 {
   public class02863(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      var1.register(
         map,
         "minecraft:vault",
         () -> DSL.optionalFields(
            "config",
            DSL.optionalFields("key_item", class06962.l.in(var1)),
            "server_data",
            DSL.optionalFields("items_to_eject", DSL.list(class06962.l.in(var1))),
            "shared_data",
            DSL.optionalFields("display_item", class06962.l.in(var1))
         )
      );
      return map;
   }
}
