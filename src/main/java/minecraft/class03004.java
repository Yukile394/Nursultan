package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class03004 extends class00622 {
   public class03004(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         class06962.u,
         () -> DSL.optionalFields(
            "entities",
            DSL.list(class06962.J.in(var1)),
            "block_entities",
            DSL.list(DSL.or(class06962.G.in(var1), DSL.remainder())),
            "block_ticks",
            DSL.list(DSL.fields("i", class06962.q.in(var1))),
            "sections",
            DSL.list(
               DSL.optionalFields(
                  "biomes",
                  DSL.optionalFields("palette", DSL.list(class06962.p.in(var1))),
                  "block_states",
                  DSL.optionalFields("palette", DSL.list(class06962.d.in(var1)))
               )
            ),
            "structures",
            DSL.optionalFields("starts", DSL.compoundList(class06962.H.in(var1)))
         )
      );
   }
}
