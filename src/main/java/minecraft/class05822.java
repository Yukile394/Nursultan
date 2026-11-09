package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Objects;

public class class05822 extends DataFix {
   public class05822(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.q);
      Type type1 = this.getOutputSchema().getType(class06962.q);
      Type type2 = DSL.named(class06962.q.typeName(), DSL.or(DSL.intType(), class00622.N()));
      Type type3 = DSL.named(class06962.q.typeName(), class00622.N());
      if (Objects.equals(type, type2) && Objects.equals(type1, type3)) {
         return this.fixTypeEverywhere(
            "BlockNameFlatteningFix",
            type2,
            type3,
            var0 -> var0x -> var0x.mapSecond(var0xx -> (String)var0xx.map(class05803::N, var0xxx -> class05803.N(class00622.N(var0xxx))))
         );
      } else {
         throw new IllegalStateException("Expected and actual types don't match.");
      }
   }
}
