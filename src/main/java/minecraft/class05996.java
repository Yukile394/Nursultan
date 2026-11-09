package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Set;

public class class05996 extends DataFix {
   private static final Set<String> N = ImmutableSet.of(
      "minecraft:andesite_wall",
      "minecraft:brick_wall",
      "minecraft:cobblestone_wall",
      "minecraft:diorite_wall",
      "minecraft:end_stone_brick_wall",
      "minecraft:granite_wall",
      new String[]{
         "minecraft:mossy_cobblestone_wall",
         "minecraft:mossy_stone_brick_wall",
         "minecraft:nether_brick_wall",
         "minecraft:prismarine_wall",
         "minecraft:red_nether_brick_wall",
         "minecraft:red_sandstone_wall",
         "minecraft:sandstone_wall",
         "minecraft:stone_brick_wall"
      }
   );

   public class05996(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      return !var0.get("Name").asString().result().filter(N::contains).isPresent() ? var0 : var0.update("Properties", var0x -> {
         Dynamic dynamic = N(var0x, "east");
         dynamic = N(dynamic, "west");
         dynamic = N(dynamic, "north");
         return N(dynamic, "south");
      });
   }

   private static String N(String var0) {
      return "true".equals(var0) ? "low" : "none";
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0, String var1) {
      return var0.update(var1, var0x -> (Dynamic)DataFixUtils.orElse(var0x.asString().result().map(class05996::N).map(var0x::createString), var0x));
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "WallPropertyFix", this.getInputSchema().getType(class06962.d), var0 -> var0.update(DSL.remainderFinder(), class05996::N)
      );
   }
}
