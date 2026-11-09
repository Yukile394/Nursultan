package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class03603 extends class00622 {
   public class03603(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(var1);
      map.put("minecraft:brushable_block", map.remove("minecraft:suspicious_sand"));
      var1.registerSimple(map, "minecraft:calibrated_sculk_sensor");
      return map;
   }
}
