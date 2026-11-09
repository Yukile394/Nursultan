package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Supplier;

public class class08274 extends class00622 {
   public class08274(int var1, Schema var2) {
      super(var1, var2);
   }

   public static SequencedMap<String, Supplier<TypeTemplate>> N(Schema var0) {
      SequencedMap sequencedmap = class02844.N(var0);
      sequencedmap.remove("minecraft:food");
      sequencedmap.put("minecraft:use_remainder", () -> class06962.l.in(var0));
      sequencedmap.put("minecraft:equippable", () -> DSL.optionalFields("allowed_entities", DSL.or(class06962.I.in(var0), DSL.list(class06962.I.in(var0)))));
      return sequencedmap;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(true, class06962.k, () -> DSL.optionalFieldsLazy(N(var1)));
   }
}
