package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class06697 extends Schema {
   public class06697(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      map.remove("EntityHorse");
      var1.register(map, "Horse", () -> DSL.optionalFields("ArmorItem", class06962.l.in(var1), "SaddleItem", class06962.l.in(var1)));
      var1.register(map, "Donkey", () -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var1)), "SaddleItem", class06962.l.in(var1)));
      var1.register(map, "Mule", () -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var1)), "SaddleItem", class06962.l.in(var1)));
      var1.register(map, "ZombieHorse", () -> DSL.optionalFields("SaddleItem", class06962.l.in(var1)));
      var1.register(map, "SkeletonHorse", () -> DSL.optionalFields("SaddleItem", class06962.l.in(var1)));
      return map;
   }
}
