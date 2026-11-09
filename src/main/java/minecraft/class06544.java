package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class06544 extends class00622 {
   public class06544(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void N(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.registerSimple(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      N(var1, map, "minecraft:turtle");
      N(var1, map, "minecraft:cod_mob");
      N(var1, map, "minecraft:tropical_fish");
      N(var1, map, "minecraft:salmon_mob");
      N(var1, map, "minecraft:puffer_fish");
      N(var1, map, "minecraft:phantom");
      N(var1, map, "minecraft:dolphin");
      N(var1, map, "minecraft:drowned");
      var1.register(map, "minecraft:trident", var1x -> DSL.optionalFields("inBlockState", class06962.d.in(var1), "Trident", class06962.l.in(var1)));
      return map;
   }
}
