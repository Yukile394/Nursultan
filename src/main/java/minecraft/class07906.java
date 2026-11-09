package minecraft;

import Nursultan.class10858;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Objects;
import java.util.function.Function;

public abstract class class07906 extends DataFix {
   private final String N;

   public class07906(Schema var1, String var2) {
      super(var1, false);
      this.N = var2;
   }

   public static DataFix N(Schema var0, String var1, Function<String, String> var2) {
      return new class10858(var0, var1, var2);
   }

   protected abstract String N(String var1);

   public TypeRewriteRule makeRule() {
      Type type = DSL.named(class06962.K.typeName(), class00622.N());
      if (!Objects.equals(this.getInputSchema().getType(class06962.K), type)) {
         throw new IllegalStateException("item name type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.N, type, var1x -> var1xx -> var1xx.mapSecond(this::N));
      }
   }
}
