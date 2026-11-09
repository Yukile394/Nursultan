package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public abstract class class08347 extends DataFix {
   private final String N;

   public class08347(Schema var1, String var2) {
      super(var1, false);
      this.N = var2;
   }

   protected abstract <T> Dynamic<T> N(String var1, Dynamic<T> var2);

   protected abstract boolean N(String var1);

   private Dynamic<?> N(Dynamic<?> var1) {
      Optional optional = var1.get("Name").asString().result().map(class00622::N);
      return optional.isPresent() && this.N((String)optional.get()) ? var1.update("Properties", var2x -> this.N((String)optional.get(), var2x)) : var1;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(this.N, this.getInputSchema().getType(class06962.d), var1 -> var1.update(DSL.remainderFinder(), this::N));
   }
}
