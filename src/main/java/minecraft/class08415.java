package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class class08415 extends class00622 {
   public class08415(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         class06962.L,
         () -> DSL.and(
            class06962.g.in(var1),
            DSL.optionalFields(
               new Pair[]{
                  Pair.of("RootVehicle", DSL.optionalFields("Entity", class06962.J.in(var1))),
                  Pair.of("ender_pearls", DSL.list(class06962.J.in(var1))),
                  Pair.of("Inventory", DSL.list(class06962.l.in(var1))),
                  Pair.of("EnderItems", DSL.list(class06962.l.in(var1))),
                  Pair.of("ShoulderEntityLeft", class06962.J.in(var1)),
                  Pair.of("ShoulderEntityRight", class06962.J.in(var1)),
                  Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(class06962.a.in(var1)), "toBeDisplayed", DSL.list(class06962.a.in(var1))))
               }
            )
         )
      );
   }
}
