package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class class02166 extends DataFix {
   private static final Set<String> N = Set.of(
      "filled_map.buried_treasure",
      "filled_map.explorer_jungle",
      "filled_map.explorer_swamp",
      "filled_map.mansion",
      "filled_map.monument",
      "filled_map.trial_chambers",
      "filled_map.village_desert",
      "filled_map.village_plains",
      "filled_map.village_savanna",
      "filled_map.village_snowy",
      "filled_map.village_taiga"
   );

   public class02166(Schema var1) {
      super(var1, false);
   }

   private static <T> Typed<T> y(Typed<T> var0) {
      return N(var0, var0x -> var0x.equals("block.minecraft.ominous_banner"));
   }

   private static <T> Typed<T> N(Typed<T> var0, Predicate<String> var1) {
      return class07536.N(
         var0,
         var0.getType(),
         var1x -> var1x.get("minecraft:custom_name").asString().result().flatMap(class03731::u).filter(var1).isPresent()
            ? var1x.renameField("minecraft:custom_name", "minecraft:item_name")
            : var1x
      );
   }

   private static <T> Typed<T> N(Typed<T> var0) {
      return N(var0, N::contains);
   }

   public final TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.l);
      OpticFinder<Pair<String, String>> opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      OpticFinder<?> opticfinder1 = type.findField("components");
      return this.fixTypeEverywhereTyped("ItemStack custom_name to item_name component fix", type, var2x -> {
         Optional optional = var2x.getOptional(opticfinder).map(Pair::getSecond);
         if (optional.filter(var0x -> var0x.equals("minecraft:white_banner")).isPresent()) {
            return var2x.updateTyped(opticfinder1, class02166::y);
         } else {
            return optional.filter(var0x -> var0x.equals("minecraft:filled_map")).isPresent() ? var2x.updateTyped(opticfinder1, class02166::N) : var2x;
         }
      });
   }
}
