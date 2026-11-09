package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Function;

public class class06717 extends DataFix {
   public class06717(Schema var1) {
      super(var1, false);
   }

   private Typed<?> N(OpticFinder<Pair<String, String>> var1, Typed<?> var2) {
      return var2.update(var1, var0 -> var0.mapSecond(var0x -> Objects.equals(var0x, "minecraft:carved_pumpkin") ? "minecraft:pumpkin" : var0x));
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.Y);
      OpticFinder opticfinder = type.findField("buy");
      OpticFinder opticfinder1 = type.findField("buyB");
      OpticFinder opticfinder2 = type.findField("sell");
      OpticFinder opticfinder3 = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      Function function = var2x -> this.N(opticfinder3, var2x);
      return this.fixTypeEverywhereTyped(
         "Villager trade fix", type, var4x -> var4x.updateTyped(opticfinder, function).updateTyped(opticfinder1, function).updateTyped(opticfinder2, function)
      );
   }
}
