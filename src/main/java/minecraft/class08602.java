package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class08602 extends class00622 {
   public class08602(int var1, Schema var2) {
      super(var1, var2);
   }

   private static TypeTemplate N(Schema var0) {
      return DSL.optionalFields("Items", DSL.list(class06962.l.in(var0)));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> map = super.registerEntities(var1);
      var1.register(map, "minecraft:llama", var1x -> N(var1));
      var1.register(map, "minecraft:trader_llama", var1x -> N(var1));
      var1.register(map, "minecraft:donkey", var1x -> N(var1));
      var1.register(map, "minecraft:mule", var1x -> N(var1));
      var1.registerSimple(map, "minecraft:horse");
      var1.registerSimple(map, "minecraft:skeleton_horse");
      var1.registerSimple(map, "minecraft:zombie_horse");
      return map;
   }
}
