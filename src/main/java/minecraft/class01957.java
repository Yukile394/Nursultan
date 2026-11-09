package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class01957 extends class00622 {
   public class01957(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      var1.register(map, "minecraft:decorated_pot", () -> DSL.optionalFields("shards", DSL.list(class06962.K.in(var1)), "item", class06962.l.in(var1)));
      var1.register(map, "minecraft:suspicious_sand", () -> DSL.optionalFields("item", class06962.l.in(var1)));
      return map;
   }
}
