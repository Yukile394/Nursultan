package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class06539 extends class00622 {
   public class06539(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      map.put("DUMMY", DSL::remainder);
      return map;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         class06962.u,
         () -> DSL.fields(
            "Level",
            DSL.optionalFields(
               "Entities",
               DSL.list(class06962.J.in(var1)),
               "TileEntities",
               DSL.list(DSL.or(class06962.G.in(var1), DSL.remainder())),
               "TileTicks",
               DSL.list(DSL.fields("i", class06962.q.in(var1))),
               "Sections",
               DSL.list(DSL.optionalFields("Palette", DSL.list(class06962.d.in(var1)))),
               "Structures",
               DSL.optionalFields("Starts", DSL.compoundList(class06962.H.in(var1)))
            )
         )
      );
   }
}
