package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class08339 extends class00622 {
   public class08339(int var1, Schema var2) {
      super(var1, var2);
   }

   public static TypeTemplate N(Schema var0) {
      return DSL.optionalFields(
         "front_text",
         DSL.optionalFields("messages", DSL.list(class06962.O.in(var0)), "filtered_messages", DSL.list(class06962.O.in(var0))),
         "back_text",
         DSL.optionalFields("messages", DSL.list(class06962.O.in(var0)), "filtered_messages", DSL.list(class06962.O.in(var0)))
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      this.register(map, "minecraft:sign", () -> N(var1));
      return map;
   }
}
