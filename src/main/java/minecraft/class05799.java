package minecraft;

import Nursultan.class10538;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public abstract class class05799 extends DataFix {
   private final String N;

   public class05799(Schema var1, String var2) {
      super(var1, false);
      this.N = var2;
   }

   private String y(String var1) {
      int i = var1.indexOf(91);
      int j = var1.indexOf(123);
      int k = var1.length();
      if (i > 0) {
         k = i;
      }

      if (j > 0) {
         k = Math.min(k, j);
      }

      String s = var1.substring(0, k);
      return this.N(s) + var1.substring(k);
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      Optional<String> optional = var1.get("Name").asString().result();
      return optional.isPresent() ? var1.set("Name", var1.createString(this.N(optional.get()))) : var1;
   }

   protected abstract String N(String var1);

   public static DataFix N(Schema var0, String var1, Function<String, String> var2) {
      return new class10538(var0, var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.q);
      Type<Pair<String, String>> type1 = DSL.named(class06962.q.typeName(), class00622.N());
      if (!Objects.equals(type, type1)) {
         throw new IllegalStateException("block type is not what was expected.");
      } else {
         TypeRewriteRule typerewriterule = this.fixTypeEverywhere(this.N + " for block", type1, var1x -> var1xx -> var1xx.mapSecond(this::N));
         TypeRewriteRule typerewriterule1 = this.fixTypeEverywhereTyped(
            this.N + " for block_state", this.getInputSchema().getType(class06962.d), var1x -> var1x.update(DSL.remainderFinder(), this::N)
         );
         TypeRewriteRule typerewriterule2 = this.fixTypeEverywhereTyped(
            this.N + " for flat_block_state",
            this.getInputSchema().getType(class06962.w),
            var1x -> var1x.update(
               DSL.remainderFinder(), var1xx -> (Dynamic)DataFixUtils.orElse(var1xx.asString().result().map(this::y).map(var1xx::createString), var1xx)
            )
         );
         return TypeRewriteRule.seq(typerewriterule, new TypeRewriteRule[]{typerewriterule1, typerewriterule2});
      }
   }
}
