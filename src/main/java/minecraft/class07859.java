package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class07859 extends class00622 {
   public class07859(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> map = super.registerEntities(var1);
      map.put("minecraft:cod", map.remove("minecraft:cod_mob"));
      map.put("minecraft:salmon", map.remove("minecraft:salmon_mob"));
      return map;
   }
}
