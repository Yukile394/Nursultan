package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class00006 extends class00622 {
   public class00006(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      this.register(map, "minecraft:hanging_sign", () -> class08339.N(var1));
      return map;
   }
}
