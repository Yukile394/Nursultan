package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class00244 extends class00622 {
   public class00244(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> map = super.registerBlockEntities(var1);
      this.registerSimple(map, "minecraft:creaking_heart");
      return map;
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> map = super.registerEntities(var1);
      var1.registerSimple(map, "minecraft:creaking");
      var1.registerSimple(map, "minecraft:creaking_transient");
      return map;
   }
}
