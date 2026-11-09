package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class04394 extends class00622 {
   public class04394(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(var1);
      var1.registerSimple(map, "minecraft:sculk_catalyst");
      return map;
   }
}
