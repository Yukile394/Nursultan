package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class02906 extends class00622 {
   public class02906(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static TypeTemplate N(Schema var0) {
      return DSL.optionalFields("inBlockState", class06962.d.in(var0), "item", class06962.l.in(var0), "weapon", class06962.l.in(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> map = super.registerEntities(var1);
      var1.register(map, "minecraft:spectral_arrow", () -> N(var1));
      var1.register(map, "minecraft:arrow", () -> N(var1));
      return map;
   }
}
