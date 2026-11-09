package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class03233 extends class00622 {
   public class03233(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         true,
         class06962.e,
         () -> DSL.optionalFields(
            "SpawnPotentials",
            DSL.list(DSL.fields("data", DSL.fields("entity", class06962.J.in(var1)))),
            "SpawnData",
            DSL.fields("entity", class06962.J.in(var1))
         )
      );
   }
}
