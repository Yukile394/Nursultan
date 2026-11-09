package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class07608 extends class00622 {
   public class07608(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map map = super.registerEntities(var1);
      var1.registerSimple(map, "minecraft:egg");
      var1.registerSimple(map, "minecraft:ender_pearl");
      var1.registerSimple(map, "minecraft:fireball");
      var1.register(map, "minecraft:potion", var1x -> DSL.optionalFields("Potion", class06962.l.in(var1)));
      var1.registerSimple(map, "minecraft:small_fireball");
      var1.registerSimple(map, "minecraft:snowball");
      var1.registerSimple(map, "minecraft:wither_skull");
      var1.registerSimple(map, "minecraft:xp_bottle");
      var1.register(map, "minecraft:arrow", () -> DSL.optionalFields("inBlockState", class06962.d.in(var1)));
      var1.register(map, "minecraft:enderman", () -> DSL.optionalFields("carriedBlockState", class06962.d.in(var1)));
      var1.register(map, "minecraft:falling_block", () -> DSL.optionalFields("BlockState", class06962.d.in(var1), "TileEntityData", class06962.G.in(var1)));
      var1.register(map, "minecraft:spectral_arrow", () -> DSL.optionalFields("inBlockState", class06962.d.in(var1)));
      var1.register(map, "minecraft:chest_minecart", () -> DSL.optionalFields("DisplayState", class06962.d.in(var1), "Items", DSL.list(class06962.l.in(var1))));
      var1.register(
         map, "minecraft:commandblock_minecart", () -> DSL.optionalFields("DisplayState", class06962.d.in(var1), "LastOutput", class06962.O.in(var1))
      );
      var1.register(map, "minecraft:furnace_minecart", () -> DSL.optionalFields("DisplayState", class06962.d.in(var1)));
      var1.register(map, "minecraft:hopper_minecart", () -> DSL.optionalFields("DisplayState", class06962.d.in(var1), "Items", DSL.list(class06962.l.in(var1))));
      var1.register(map, "minecraft:minecart", () -> DSL.optionalFields("DisplayState", class06962.d.in(var1)));
      var1.register(map, "minecraft:spawner_minecart", () -> DSL.optionalFields("DisplayState", class06962.d.in(var1), class06962.e.in(var1)));
      var1.register(map, "minecraft:tnt_minecart", () -> DSL.optionalFields("DisplayState", class06962.d.in(var1)));
      return map;
   }
}
