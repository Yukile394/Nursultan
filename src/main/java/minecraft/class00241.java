package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class00241 extends DataFix {
   public class00241(Schema var1) {
      super(var1, false);
   }

   private static Typed<?> N(Typed<?> var0) {
      return var0.update(DSL.remainderFinder(), var0x -> var0x.renameAndFixField("Lock", "lock", class00255::y));
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("ContainerBlockEntityLockPredicateFix", this.getInputSchema().findChoiceType(class06962.G), class00241::N);
   }
}
