package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class00582 extends Schema {
   public class00582(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         true,
         class06962.g,
         () -> DSL.and(
            DSL.optional(DSL.field("ArmorItems", DSL.list(class06962.l.in(var1)))),
            new TypeTemplate[]{
               DSL.optional(DSL.field("HandItems", DSL.list(class06962.l.in(var1)))),
               DSL.optional(DSL.field("body_armor_item", class06962.l.in(var1))),
               DSL.optional(DSL.field("saddle", class06962.l.in(var1)))
            }
         )
      );
   }
}
