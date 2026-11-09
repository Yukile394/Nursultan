package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Objects;
import java.util.stream.Stream;

public abstract class class01482 extends DataFix {
   private final String N;

   private <T> Dynamic<T> L(Dynamic<T> var1) {
      return (Dynamic<T>)DataFixUtils.orElse(var1.asStreamOpt().result().map(var2 -> var1.createList(this.N((Stream<Dynamic<T>>)var2))), var1);
   }

   public class01482(Schema var1, String var2) {
      super(var1, false);
      this.N = var2;
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      return var1.update("Records", this::L);
   }

   protected abstract <T> Stream<Dynamic<T>> N(Stream<Dynamic<T>> var1);

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      return var1.update("Sections", var1x -> var1x.updateMapValues(var1xx -> var1xx.mapSecond(this::y)));
   }

   protected TypeRewriteRule makeRule() {
      Type type = DSL.named(class06962.v.typeName(), DSL.remainderType());
      if (!Objects.equals(type, this.getInputSchema().getType(class06962.v))) {
         throw new IllegalStateException("Poi type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.N, type, var1x -> var1xx -> var1xx.mapSecond(this::N));
      }
   }
}
