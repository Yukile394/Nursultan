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
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import java.util.function.Function;

public class class03031 extends DataFix {
   public class03031(Schema var1) {
      super(var1, true);
   }

   private static <A> Typed<?> N(Typed<?> var0, String var1, String var2, Type<A> var3) {
      Type type = DSL.optional(DSL.field(var1, var3));
      Type type1 = DSL.optional(DSL.field(var2, var3));
      return var0.update(type.finder(), type1, Function.identity());
   }

   private static Typed<?> N(Typed<?> var0, String var1, String var2) {
      return N(var0, var1, var2, var0.getType().findFieldType(var1)).update(DSL.remainderFinder(), var1x -> var1x.remove(var1));
   }

   private static <T> Dynamic<T> N(Typed<?> var0, Dynamic<T> var1) {
      DynamicOps dynamicops = var1.getOps();
      Dynamic dynamic = ((Dynamic)var0.get(DSL.remainderFinder())).convert(dynamicops);
      return dynamicops.getMap(var1.getValue())
         .flatMap(var2x -> dynamicops.mergeToMap(dynamic.getValue(), var2x))
         .result()
         .map(var1x -> new Dynamic(dynamicops, var1x))
         .orElse(var1);
   }

   private static <A> Typed<Pair<String, A>> N(Typed<A> var0) {
      return new Typed(DSL.named("chunk", var0.getType()), var0.getOps(), Pair.of("chunk", var0.getValue()));
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.u);
      OpticFinder<?> opticfinder = type.findField("Level");
      OpticFinder<?> opticfinder1 = opticfinder.type().findField("Structures");
      Type<?> type1 = this.getOutputSchema().getType(class06962.u);
      Type<?> type2 = type1.findFieldType("structures");
      return this.fixTypeEverywhereTyped("Chunk Renames; purge Level-tag", type, type1, var3x -> {
         Typed typed = var3x.getTyped(opticfinder);
         Typed<?> typed1 = N(typed);
         typed1 = typed1.set(DSL.remainderFinder(), N(var3x, (Dynamic)typed.get(DSL.remainderFinder())));
         typed1 = N(typed1, "TileEntities", "block_entities");
         typed1 = N(typed1, "TileTicks", "block_ticks");
         typed1 = N(typed1, "Entities", "entities");
         typed1 = N(typed1, "Sections", "sections");
         typed1 = typed1.updateTyped(opticfinder1, type2, var0x -> N(var0x, "Starts", "starts"));
         typed1 = N(typed1, "Structures", "structures");
         return typed1.update(DSL.remainderFinder(), var0x -> var0x.remove("Level"));
      });
   }
}
