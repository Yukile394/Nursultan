package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;

public class class03625 extends DataFix {
   private final String N;
   private final String y;
   private final UnaryOperator<String> L;

   public class03625(Schema var1, String var2, String var3, UnaryOperator<String> var4) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      return var1.update(
         this.y,
         var1x -> var1x.update(
            "criteria",
            var1xx -> var1xx.updateMapValues(
               var1xxx -> var1xxx.mapFirst(
                  var1xxxx -> (Dynamic)DataFixUtils.orElse(var1xxxx.asString().map(var2 -> var1xxxx.createString(this.L.apply(var2))).result(), var1xxxx)
               )
            )
         )
      );
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(this.N, this.getInputSchema().getType(class06962.j), var1 -> var1.update(DSL.remainderFinder(), this::N));
   }
}
