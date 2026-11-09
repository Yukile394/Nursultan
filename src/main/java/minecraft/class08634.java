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
import java.util.Set;

public class class08634 extends DataFix {
   private static final Set<String> N = Set.of(
      "minecraft:horse",
      "minecraft:skeleton_horse",
      "minecraft:zombie_horse",
      "minecraft:donkey",
      "minecraft:mule",
      "minecraft:camel",
      "minecraft:llama",
      "minecraft:trader_llama"
   );
   private static final Set<String> y = Set.of("minecraft:pig", "minecraft:strider");
   private static final String L = "Saddle";
   private static final String u = "saddle";

   private static Dynamic<?> L(Dynamic<?> var0) {
      Dynamic dynamic = var0.get("drop_chances").orElseEmptyMap().set("saddle", var0.createFloat(2.0F));
      return var0.set("drop_chances", dynamic);
   }

   public class08634(Schema var1) {
      super(var1, true);
   }

   private static Dynamic<?> y(Dynamic<?> var0) {
      boolean flag = var0.get("Saddle").asBoolean(false);
      var0 = var0.remove("Saddle");
      if (!flag) {
         return var0;
      } else {
         Dynamic dynamic = var0.emptyMap().set("id", var0.createString("minecraft:saddle")).set("count", var0.createInt(1));
         return L(var0.set("saddle", dynamic));
      }
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      return var0.get("SaddleItem").result().isEmpty() ? var0 : L(var0.renameField("SaddleItem", "saddle"));
   }

   protected TypeRewriteRule makeRule() {
      OpticFinder opticfinder = DSL.typeFinder(this.getInputSchema().findChoiceType(class06962.o));
      Type<?> type = this.getInputSchema().getType(class06962.o);
      Type<?> type1 = this.getOutputSchema().getType(class06962.o);
      Type<?> type2 = class02269.N(type, type, type1);
      return this.fixTypeEverywhereTyped("SaddleEquipmentSlotFix", type, type1, var3x -> {
         String s = var3x.getOptional(opticfinder).<String>map(Pair::getFirst).map(class00622::N).orElse("");
         Typed typed = class02269.N(type2, var3x);
         if (N.contains(s)) {
            return class07536.N(typed, type1, class08634::N);
         } else {
            return y.contains(s) ? class07536.N(typed, type1, class08634::y) : class02269.N(type1, var3x);
         }
      });
   }
}
