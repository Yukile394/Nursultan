package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Supplier;

public class class08586 extends class00622 {
   public class08586(int var1, Schema var2) {
      super(var1, var2);
   }

   private static TypeTemplate y(Schema var0) {
      TypeTemplate typetemplate = DSL.optionalFields("blocks", DSL.or(class06962.q.in(var0), DSL.list(class06962.q.in(var0))));
      return DSL.or(typetemplate, DSL.list(typetemplate));
   }

   public static SequencedMap<String, Supplier<TypeTemplate>> N(Schema var0) {
      SequencedMap sequencedmap = class08274.N(var0);
      sequencedmap.put("minecraft:can_place_on", (Supplier<>)() -> y(var0));
      sequencedmap.put("minecraft:can_break", (Supplier<>)() -> y(var0));
      return sequencedmap;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(true, class06962.k, () -> DSL.optionalFieldsLazy(N(var1)));
   }
}
