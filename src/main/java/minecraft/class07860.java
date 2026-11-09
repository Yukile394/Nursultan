package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class07860 extends class00622 {
   public class07860(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> map = super.registerEntities(var1);
      map.put("minecraft:pufferfish", map.remove("minecraft:puffer_fish"));
      return map;
   }
}
