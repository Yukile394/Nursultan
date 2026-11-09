package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class08380 extends class00622 {
   public class08380(int var1, Schema var2) {
      super(var1, var2);
   }

   public static TypeTemplate y(Schema var0) {
      return DSL.optionalFields("CustomName", class06962.O.in(var0));
   }

   public static TypeTemplate N(Schema var0) {
      return DSL.optionalFields("Items", DSL.list(class06962.l.in(var0)), "CustomName", class06962.O.in(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map map = super.registerBlockEntities(var1);
      var1.register(map, "minecraft:beacon", () -> y(var1));
      var1.register(map, "minecraft:banner", () -> y(var1));
      var1.register(map, "minecraft:brewing_stand", () -> N(var1));
      var1.register(map, "minecraft:chest", () -> N(var1));
      var1.register(map, "minecraft:trapped_chest", () -> N(var1));
      var1.register(map, "minecraft:dispenser", () -> N(var1));
      var1.register(map, "minecraft:dropper", () -> N(var1));
      var1.register(map, "minecraft:enchanting_table", () -> y(var1));
      var1.register(map, "minecraft:furnace", () -> N(var1));
      var1.register(map, "minecraft:hopper", () -> N(var1));
      var1.register(map, "minecraft:shulker_box", () -> N(var1));
      return map;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         true,
         class06962.o,
         () -> DSL.and(class06962.g.in(var1), DSL.optionalFields("CustomName", class06962.O.in(var1), DSL.taggedChoiceLazy("id", N(), var2)))
      );
   }
}
