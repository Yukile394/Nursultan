package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;

public class class03513 extends DataFix {
   private final String N;
   private final UnaryOperator<String> y;

   public class03513(Schema var1, String var2, UnaryOperator<String> var3) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      return (Dynamic<T>)DataFixUtils.orElse(var1.asString().result().map(class00622::N).map(this.y).map(var1::createString), var1);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.N,
         this.getInputSchema().getType(class06962.u),
         var1 -> var1.update(
            DSL.remainderFinder(), var1x -> var1x.update("Status", this::N).update("below_zero_retrogen", var1xx -> var1xx.update("target_status", this::N))
         )
      );
   }
}
