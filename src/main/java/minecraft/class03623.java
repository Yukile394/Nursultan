package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Objects;
import java.util.function.UnaryOperator;

public class class03623 extends DataFix {
   private final String N;
   private final TypeReference y;
   private final UnaryOperator<String> L;

   public class03623(Schema var1, String var2, TypeReference var3, UnaryOperator<String> var4) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   protected TypeRewriteRule makeRule() {
      Type type = DSL.named(this.y.typeName(), class00622.N());
      if (!Objects.equals(type, this.getInputSchema().getType(this.y))) {
         throw new IllegalStateException("\"" + this.y.typeName() + "\" is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.N, type, var1x -> var1xx -> var1xx.mapSecond(this.L));
      }
   }
}
