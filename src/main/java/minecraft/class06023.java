package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class06023 extends class00622 {
   public class06023(int var1, Schema var2) {
      super(var1, var2);
   }

   private static void N(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(
         var1,
         var2,
         () -> DSL.optionalFields(
            "Items",
            DSL.list(class06962.l.in(var0)),
            "CustomName",
            class06962.O.in(var0),
            "RecipesUsed",
            DSL.compoundList(class06962.a.in(var0), DSL.constType(DSL.intType()))
         )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      N(var1, map, "minecraft:furnace");
      N(var1, map, "minecraft:smoker");
      N(var1, map, "minecraft:blast_furnace");
      return map;
   }
}
