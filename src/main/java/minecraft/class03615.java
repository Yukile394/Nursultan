package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class03615 extends class00622 {
   public class03615(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      var1.register(
         map,
         "minecraft:allay",
         () -> DSL.optionalFields(
            "Inventory", DSL.list(class06962.l.in(var1)), "listener", DSL.optionalFields("event", DSL.optionalFields("game_event", class06962.V.in(var1)))
         )
      );
      return map;
   }
}
