package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class06692 extends class00622 {
   public class06692(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      var1.registerSimple(map, "minecraft:panda");
      var1.register(map, "minecraft:pillager", var1x -> DSL.optionalFields("Inventory", DSL.list(class06962.l.in(var1))));
      return map;
   }
}
