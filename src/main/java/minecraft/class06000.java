package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class class06000 extends DataFix {
   private final String N;
   private final Function<String, String> y;

   public class06000(Schema var1, boolean var2, String var3, Function<String, String> var4) {
      super(var1, var2);
      this.N = var3;
      this.y = var4;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.N, this.getInputSchema().getType(class06962.j), var1 -> var1.update(DSL.remainderFinder(), var1x -> var1x.updateMapValues(var2 -> {
            String s = ((Dynamic)var2.getFirst()).asString("");
            return var2.mapFirst(var3x -> var1x.createString(this.y.apply(s)));
         }))
      );
   }
}
