package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class08357 extends class00622 {
   public class08357(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         true,
         class06962.O,
         () -> DSL.or(
            DSL.or(DSL.constType(DSL.string()), DSL.list(class06962.O.in(var1))),
            DSL.optionalFields(
               "extra",
               DSL.list(class06962.O.in(var1)),
               "separator",
               class06962.O.in(var1),
               "hover_event",
               DSL.taggedChoice(
                  "action",
                  DSL.string(),
                  Map.of(
                     "show_text",
                     DSL.optionalFields("value", class06962.O.in(var1)),
                     "show_item",
                     class06962.l.in(var1),
                     "show_entity",
                     DSL.optionalFields("id", class06962.I.in(var1), "name", class06962.O.in(var1))
                  )
               )
            )
         )
      );
   }
}
