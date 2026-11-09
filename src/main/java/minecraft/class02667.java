package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class class02667 extends DataFix {
   public class02667(Schema var1) {
      super(var1, false);
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      if (var0.get("pickup").result().isPresent()) {
         return var0;
      } else {
         boolean flag = var0.get("player").asBoolean(true);
         return var0.set("pickup", var0.createByte((byte)(flag ? 1 : 0))).remove("player");
      }
   }

   private Typed<?> N(Typed<?> var1, String var2, Function<Dynamic<?>, Dynamic<?>> var3) {
      Type type = this.getInputSchema().getChoiceType(class06962.o, var2);
      Type type1 = this.getOutputSchema().getChoiceType(class06962.o, var2);
      return var1.updateTyped(DSL.namedChoice(var2, type), type1, var1x -> var1x.update(DSL.remainderFinder(), var3));
   }

   private Typed<?> N(Typed<?> var1) {
      var1 = this.N(var1, "minecraft:arrow", class02667::N);
      var1 = this.N(var1, "minecraft:spectral_arrow", class02667::N);
      return this.N(var1, "minecraft:trident", class02667::N);
   }

   protected TypeRewriteRule makeRule() {
      Schema schema = this.getInputSchema();
      return this.fixTypeEverywhereTyped("AbstractArrowPickupFix", schema.getType(class06962.o), this::N);
   }
}
