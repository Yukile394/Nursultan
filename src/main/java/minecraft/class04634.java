package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class04634 extends class00622 {
   public class04634(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void N(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.registerSimple(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      var1.register(map, "minecraft:beehive", () -> DSL.optionalFields("Bees", DSL.list(DSL.optionalFields("EntityData", class06962.J.in(var1)))));
      return map;
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      N(var1, map, "minecraft:bee");
      N(var1, map, "minecraft:bee_stinger");
      return map;
   }
}
