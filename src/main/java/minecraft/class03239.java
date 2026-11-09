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

public class class03239 extends DataFix {
   private static final Set<String> N = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");

   private Dynamic<?> L(Dynamic<?> var1) {
      var1 = var1.update("Effects", this::y);
      var1 = var1.update("ActiveEffects", this::y);
      return var1.update("CustomPotionEffects", this::y);
   }

   public class03239(Schema var1) {
      super(var1, false);
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      return var1.createList(var1.asStream().map(this::N));
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      return var1.update("FactorCalculationData", var1x -> {
         int i = var1x.get("effect_changed_timestamp").asInt(-1);
         var1x = var1x.remove("effect_changed_timestamp");
         int j = var1.get("Duration").asInt(-1);
         int k = i - j;
         return var1x.set("ticks_active", var1x.createInt(k));
      });
   }

   protected TypeRewriteRule makeRule() {
      Schema schema = this.getInputSchema();
      Type<?> type = this.getInputSchema().getType(class06962.l);
      OpticFinder<Pair<String, String>> opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      OpticFinder<?> opticfinder1 = type.findField("tag");
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped("EffectDurationEntity", schema.getType(class06962.o), var1x -> var1x.update(DSL.remainderFinder(), this::L)),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped("EffectDurationPlayer", schema.getType(class06962.L), var1x -> var1x.update(DSL.remainderFinder(), this::L)),
            this.fixTypeEverywhereTyped("EffectDurationItem", type, var3x -> {
               if (var3x.getOptional(opticfinder).filter(var0 -> N.contains(var0.getSecond())).isPresent()) {
                  Optional optional = var3x.getOptionalTyped(opticfinder1);
                  if (optional.isPresent()) {
                     Dynamic<?> dynamic = (Dynamic<?>)((Typed)optional.get()).get(DSL.remainderFinder());
                     Typed<?> typed = ((Typed)optional.get()).set(DSL.remainderFinder(), dynamic.update("CustomPotionEffects", this::y));
                     return var3x.set(opticfinder1, typed);
                  }
               }

               return var3x;
            })
         }
      );
   }
}
