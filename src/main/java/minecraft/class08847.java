package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class08847 extends DataFix {
   public class08847(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "BlockEntityLockToComponentFix", this.getInputSchema().getType(class06962.G), var0 -> var0.update(DSL.remainderFinder(), var0x -> {
            Optional optional = var0x.get("lock").result();
            if (optional.isEmpty()) {
               return var0x;
            } else {
               Dynamic dynamic = class08822.y((Dynamic)optional.get());
               return dynamic != null ? var0x.set("lock", dynamic) : var0x.remove("lock");
            }
         })
      );
   }
}
