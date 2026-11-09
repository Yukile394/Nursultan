package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Supplier;

public class class02844 extends class00622 {
   public class02844(int var1, Schema var2) {
      super(var1, var2);
   }

   public static SequencedMap<String, Supplier<TypeTemplate>> N(Schema var0) {
      LinkedHashMap linkedhashmap = new LinkedHashMap();
      linkedhashmap.put("minecraft:bees", () -> DSL.list(DSL.optionalFields("entity_data", class06962.J.in(var0))));
      linkedhashmap.put("minecraft:block_entity_data", (Supplier<>)() -> class06962.G.in(var0));
      linkedhashmap.put("minecraft:bundle_contents", (Supplier<>)() -> DSL.list(class06962.l.in(var0)));
      linkedhashmap.put(
         "minecraft:can_break",
         (Supplier<>)() -> DSL.optionalFields(
            "predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(class06962.q.in(var0), DSL.list(class06962.q.in(var0)))))
         )
      );
      linkedhashmap.put(
         "minecraft:can_place_on",
         (Supplier<>)() -> DSL.optionalFields(
            "predicates", DSL.list(DSL.optionalFields("blocks", DSL.or(class06962.q.in(var0), DSL.list(class06962.q.in(var0)))))
         )
      );
      linkedhashmap.put("minecraft:charged_projectiles", (Supplier<>)() -> DSL.list(class06962.l.in(var0)));
      linkedhashmap.put("minecraft:container", () -> DSL.list(DSL.optionalFields("item", class06962.l.in(var0))));
      linkedhashmap.put("minecraft:entity_data", (Supplier<>)() -> class06962.J.in(var0));
      linkedhashmap.put("minecraft:pot_decorations", (Supplier<>)() -> DSL.list(class06962.K.in(var0)));
      linkedhashmap.put("minecraft:food", () -> DSL.optionalFields("using_converts_to", class06962.l.in(var0)));
      linkedhashmap.put("minecraft:custom_name", (Supplier<>)() -> class06962.O.in(var0));
      linkedhashmap.put("minecraft:item_name", (Supplier<>)() -> class06962.O.in(var0));
      linkedhashmap.put("minecraft:lore", (Supplier<>)() -> DSL.list(class06962.O.in(var0)));
      linkedhashmap.put(
         "minecraft:written_book_content",
         () -> DSL.optionalFields(
            "pages", DSL.list(DSL.or(DSL.optionalFields("raw", class06962.O.in(var0), "filtered", class06962.O.in(var0)), class06962.O.in(var0)))
         )
      );
      return linkedhashmap;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(true, class06962.k, () -> DSL.optionalFieldsLazy(N(var1)));
   }
}
