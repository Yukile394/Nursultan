package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class class05832 extends DataFix {
   private static final Set<String> N = Set.of(
      "minecraft:beacon",
      "minecraft:banner",
      "minecraft:brewing_stand",
      "minecraft:chest",
      "minecraft:trapped_chest",
      "minecraft:dispenser",
      "minecraft:dropper",
      "minecraft:enchanting_table",
      "minecraft:furnace",
      "minecraft:hopper",
      "minecraft:shulker_box"
   );

   public class05832(Schema var1) {
      super(var1, true);
   }

   public static <T> Dynamic<T> N(Dynamic<T> var0) {
      String s = var0.get("CustomName").asString("");
      return s.isEmpty() ? var0.remove("CustomName") : var0.set("CustomName", class03731.N(var0.getOps(), s));
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<String> opticfinder = DSL.fieldFinder("id", class00622.N());
      Type<?> type = this.getInputSchema().getType(class06962.G);
      Type<?> type1 = this.getOutputSchema().getType(class06962.G);
      Type<?> type2 = class02269.N(type, type, type1);
      return this.fixTypeEverywhereTyped(
         "BlockEntityCustomNameToComponentFix",
         type,
         type1,
         var3x -> {
            Optional optional = var3x.getOptional(opticfinder);
            return optional.isPresent() && !N.contains(optional.get())
               ? class02269.N(type1, var3x)
               : class07536.N(class02269.N(type2, var3x), type1, class05832::N);
         }
      );
   }
}
