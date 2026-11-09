package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class06811 extends Schema {
   public class06811(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         class06962.L,
         () -> DSL.optionalFields(
            "RootVehicle",
            DSL.optionalFields("Entity", class06962.J.in(var1)),
            "ender_pearls",
            DSL.list(class06962.J.in(var1)),
            "Inventory",
            DSL.list(class06962.l.in(var1)),
            "EnderItems",
            DSL.list(class06962.l.in(var1))
         )
      );
      var1.registerType(true, class06962.J, () -> DSL.optionalFields("Passengers", DSL.list(class06962.J.in(var1)), class06962.o.in(var1)));
   }
}
