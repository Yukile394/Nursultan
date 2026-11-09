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

public class class02606 extends DataFix {
   public class02606(Schema var1) {
      super(var1, false);
   }

   private Typed<?> N(Typed<?> var1, OpticFinder<?> var2, OpticFinder<?> var3, OpticFinder<Pair<String, String>> var4) {
      return var1.updateTyped(
         var2,
         var2x -> var2x.getOptionalTyped(var3)
               .flatMap(var1xx -> var1xx.getOptional(var4))
               .<String>map(Pair::getSecond)
               .flatMap(class03731::u)
               .filter(var0x -> var0x.equals("block.minecraft.ominous_banner"))
               .isPresent()
            ? var2x.updateTyped(var3, var1xx -> var1xx.set(var4, Pair.of(class06962.O.typeName(), class03731.y("block.minecraft.ominous_banner"))))
               .update(DSL.remainderFinder(), var0x -> var0x.set("minecraft:rarity", var0x.createString("uncommon")))
            : var2x
      );
   }

   public TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.G);
      Type<?> type1 = this.getInputSchema().getType(class06962.l);
      TaggedChoiceType taggedchoicetype = this.getInputSchema().findChoiceType(class06962.G);
      OpticFinder<Pair<String, String>> opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      OpticFinder<?> opticfinder1 = type.findField("components");
      OpticFinder<?> opticfinder2 = type1.findField("components");
      OpticFinder<?> opticfinder3 = opticfinder1.type().findField("minecraft:item_name");
      OpticFinder opticfinder4 = DSL.typeFinder(this.getInputSchema().getType(class06962.O));
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(
            "Ominous Banner block entity common rarity to uncommon rarity fix",
            type,
            var5x -> ((Pair)var5x.get(taggedchoicetype.finder())).getFirst().equals("minecraft:banner")
               ? this.N(var5x, opticfinder1, opticfinder3, opticfinder4)
               : var5x
         ),
         this.fixTypeEverywhereTyped(
            "Ominous Banner item stack common rarity to uncommon rarity fix",
            type1,
            var5x -> var5x.getOptional(opticfinder).<String>map(Pair::getSecond).orElse("").equals("minecraft:white_banner")
               ? this.N(var5x, opticfinder2, opticfinder3, opticfinder4)
               : var5x
         )
      );
   }
}
