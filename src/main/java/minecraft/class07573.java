package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class07573 extends class00622 {
   public class07573(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(var1);
      map.remove("minecraft:flower_pot");
      map.remove("minecraft:noteblock");
      return map;
   }
}
