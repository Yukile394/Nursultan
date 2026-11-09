package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class03601 extends DataFix {
   private final String N;
   private final Set<String> y;

   public class03601(Schema var1, String var2, Set<String> var3) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      List list = var1.get("removed_features").asStream().collect(Collectors.toCollection(ArrayList::new));
      Dynamic dynamic = var1.update(
         "enabled_features", var3x -> (Dynamic)DataFixUtils.orElse(var3x.asStreamOpt().result().map(var3xx -> var3xx.filter(var3xxx -> {
            Optional optional = var3xxx.asString().result();
            if (optional.isEmpty()) {
               return true;
            } else {
               boolean flag = this.y.contains(optional.get());
               if (flag) {
                  list.add(var1.createString((String)optional.get()));
               }

               return !flag;
            }
         })).map(var1::createList), var3x)
      );
      if (!list.isEmpty()) {
         dynamic = dynamic.set("removed_features", var1.createList(list.stream()));
      }

      return dynamic;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(this.N, this.getInputSchema().getType(class06962.y), var1 -> var1.update(DSL.remainderFinder(), this::N));
   }
}
