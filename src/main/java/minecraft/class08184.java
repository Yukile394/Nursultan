package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08184 extends DataFix {
   private final String N;
   private final String y;
   private final String L;
   private final String u;

   public class08184(Schema var1, String var2, String var3, String var4, String var5) {
      super(var1, true);
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
   }

   private String N(String var1) {
      return switch (var1) {
         case "2" -> this.u;
         case "0" -> this.y;
         default -> this.L;
      };
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "graphicsMode split to " + this.N,
         this.getInputSchema().getType(class06962.R),
         var1 -> var1.update(
            DSL.remainderFinder(),
            var1x -> (Dynamic)DataFixUtils.orElseGet(
               var1x.get("graphicsMode").asString().map(var2 -> var1x.set(this.N, var1x.createString(this.N(var2)))).result(),
               () -> var1x.set(this.N, var1x.createString(this.L))
            )
         )
      );
   }
}
