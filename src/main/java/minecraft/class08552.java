package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class08552 extends class00622 {
   public class08552(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> map = super.registerEntities(var1);
      map.remove("minecraft:potion");
      var1.register(map, "minecraft:splash_potion", () -> DSL.optionalFields("Item", class06962.l.in(var1)));
      var1.register(map, "minecraft:lingering_potion", () -> DSL.optionalFields("Item", class06962.l.in(var1)));
      return map;
   }
}
