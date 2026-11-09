package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class06713 extends Schema {
   public class06713(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      var1.register(map, "ZombieVillager", var1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(class06962.Y.in(var1)))));
      var1.registerSimple(map, "Husk");
      return map;
   }
}
