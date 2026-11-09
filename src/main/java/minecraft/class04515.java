package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class04515 extends class00622 {
   public class04515(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      var1.register(
         map,
         "minecraft:trial_spawner",
         () -> DSL.optionalFields(
            "spawn_potentials",
            DSL.list(DSL.fields("data", DSL.fields("entity", class06962.J.in(var1)))),
            "spawn_data",
            DSL.fields("entity", class06962.J.in(var1))
         )
      );
      return map;
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      var1.registerSimple(map, "minecraft:breeze");
      var1.registerSimple(map, "minecraft:wind_charge");
      var1.registerSimple(map, "minecraft:breeze_wind_charge");
      return map;
   }
}
