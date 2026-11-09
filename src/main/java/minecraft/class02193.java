package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class class02193 extends DataFix {
   public class02193(Schema var1) {
      super(var1, false);
   }

   private Typed<?> N(Typed<?> var1, OpticFinder<Pair<String, String>> var2, OpticFinder<?> var3) {
      Optional optional = var1.getOptionalTyped(var3).flatMap(var1x -> var1x.getOptional(var2).map(Pair::getSecond));
      return optional.flatMap(class03731::u).filter(var0 -> var0.equals("block.minecraft.ominous_banner")).isPresent()
         ? class07536.N(
            var1,
            var1.getType(),
            var1x -> {
               Dynamic dynamic = var1x.createMap(
                  Map.of(
                     var1x.createString("minecraft:item_name"),
                     var1x.createString((String)optional.get()),
                     var1x.createString("minecraft:hide_additional_tooltip"),
                     var1x.emptyMap()
                  )
               );
               return var1x.set("components", dynamic).remove("CustomName");
            }
         )
         : var1;
   }

   public TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.G);
      TaggedChoiceType taggedchoicetype = this.getInputSchema().findChoiceType(class06962.G);
      OpticFinder<?> opticfinder = type.findField("CustomName");
      OpticFinder opticfinder1 = DSL.typeFinder(this.getInputSchema().getType(class06962.O));
      return this.fixTypeEverywhereTyped(
         "Banner entity custom_name to item_name component fix",
         type,
         var4x -> ((Pair)var4x.get(taggedchoicetype.finder())).getFirst().equals("minecraft:banner") ? this.N(var4x, opticfinder1, opticfinder) : var4x
      );
   }
}
