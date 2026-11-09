package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class class08613 extends class00622 {
   public class08613(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         true,
         class06962.g,
         () -> DSL.optional(
            DSL.field(
               "equipment",
               DSL.optionalFields(
                  new Pair[]{
                     Pair.of("mainhand", class06962.l.in(var1)),
                     Pair.of("offhand", class06962.l.in(var1)),
                     Pair.of("feet", class06962.l.in(var1)),
                     Pair.of("legs", class06962.l.in(var1)),
                     Pair.of("chest", class06962.l.in(var1)),
                     Pair.of("head", class06962.l.in(var1)),
                     Pair.of("body", class06962.l.in(var1)),
                     Pair.of("saddle", class06962.l.in(var1))
                  }
               )
            )
         )
      );
   }
}
