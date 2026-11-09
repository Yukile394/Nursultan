package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class04679 extends class00622 {
   public class04679(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void N(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> class08380.N(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      N(var1, map, "minecraft:barrel");
      N(var1, map, "minecraft:smoker");
      N(var1, map, "minecraft:blast_furnace");
      var1.register(map, "minecraft:lectern", var1x -> DSL.optionalFields("Book", class06962.l.in(var1)));
      var1.registerSimple(map, "minecraft:bell");
      return map;
   }
}
