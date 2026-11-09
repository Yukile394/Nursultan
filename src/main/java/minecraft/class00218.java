package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import java.util.function.Supplier;

public class class00218 extends class08147 {
   private final Supplier<class00228> y = Suppliers.memoize(
      () -> {
         OpticFinder opticfinder = class02269.N(
               this.getInputSchema().getChoiceType(class06962.o, "minecraft:potion"),
               this.getInputSchema().getType(class06962.o),
               this.getOutputSchema().getType(class06962.o)
            )
            .findField("Item");
         OpticFinder opticfinder1 = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
         return new class00228(opticfinder, opticfinder1);
      }
   );

   public class00218(Schema var1) {
      super("ThrownPotionSplitFix", var1, true);
   }

   @Override
   protected Pair<String, Typed<?>> N(String var1, Typed<?> var2) {
      if (!var1.equals("minecraft:potion")) {
         return Pair.of(var1, var2);
      } else {
         String s = this.y.get().N(var2);
         return "minecraft:lingering_potion".equals(s) ? Pair.of("minecraft:lingering_potion", var2) : Pair.of("minecraft:splash_potion", var2);
      }
   }
}
