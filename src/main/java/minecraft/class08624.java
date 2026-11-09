package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08624 extends DataFix {
   private final TypeReference N;

   public class08624(Schema var1, TypeReference var2) {
      super(var1, false);
      this.N = var2;
   }

   private static Typed<?> N(Typed<?> var0) {
      return var0.update(
         DSL.remainderFinder(), var0x -> var0x.renameAndFixField("FallDistance", "fall_distance", var0xx -> var0xx.createDouble(var0xx.asFloat(0.0F)))
      );
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityFallDistanceFloatToDoubleFixFor" + this.N.typeName(), this.getOutputSchema().getType(this.N), class08624::N);
   }
}
