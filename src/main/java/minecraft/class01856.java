package minecraft;

import com.google.common.collect.Streams;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class class01856 extends DataFix {
   private final String N;

   public class01856(Schema var1, String var2) {
      super(var1, false);
      this.N = var2;
   }

   private static <T> Dynamic<T> y(Dynamic<T> var0) {
      Optional optional = var0.get("filtered_messages").asStreamOpt().result();
      if (optional.isEmpty()) {
         return var0;
      } else {
         Dynamic dynamic = class03731.N(var0.getOps());
         List list = var0.get("messages").asStreamOpt().result().orElse(Stream.of()).toList();
         List list1 = Streams.mapWithIndex((Stream)optional.get(), (var2x, var3x) -> {
            Dynamic dynamic1 = var3x < list.size() ? (Dynamic)list.get((int)var3x) : dynamic;
            return var2x.equals(dynamic) ? dynamic1 : var2x;
         }).toList();
         return list1.equals(list) ? var0.remove("filtered_messages") : var0.set("filtered_messages", var0.createList(list1.stream()));
      }
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      var1 = var1.update("front_text", class01856::y);
      var1 = var1.update("back_text", class01856::y);

      for (String s : class03569.N) {
         var1 = var1.remove(s);
      }

      return var1;
   }

   public TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.G);
      Type<?> type1 = this.getInputSchema().getChoiceType(class06962.G, this.N);
      OpticFinder opticfinder = DSL.namedChoice(this.N, type1);
      return this.fixTypeEverywhereTyped(
         "DropInvalidSignDataFix for " + this.N,
         type,
         var3x -> var3x.updateTyped(
            opticfinder,
            type1,
            var2xx -> ((Dynamic)var2xx.get(DSL.remainderFinder())).get("_filtered_correct").asBoolean(false)
               ? var2xx.update(DSL.remainderFinder(), var0 -> var0.remove("_filtered_correct"))
               : class07536.N(var2xx, type1, this::N)
         )
      );
   }
}
