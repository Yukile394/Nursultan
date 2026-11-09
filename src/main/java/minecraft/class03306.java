package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class03306 extends DataFix {
   private final String N;
   private final boolean y;
   private final String L;
   private final TypeReference u;

   public class03306(Schema var1, TypeReference var2, String var3, boolean var4) {
      super(var1, true);
      this.y = var4;
      this.L = var3;
      this.N = "AddFlagIfNotPresentFix_" + this.L + "=" + this.y + " for " + var1.getVersionKey();
      this.u = var2;
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(this.u);
      return this.fixTypeEverywhereTyped(
         this.N,
         type,
         var1x -> var1x.update(
            DSL.remainderFinder(),
            var1xx -> var1xx.set(this.L, (Dynamic)DataFixUtils.orElseGet(var1xx.get(this.L).result(), () -> var1xx.createBoolean(this.y)))
         )
      );
   }
}
