package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;

public class class06630 extends DataFix {
   private final String N;
   private final TypeReference y;
   private final String L;
   private final String[] u;
   private final Function<Dynamic<?>, Dynamic<?>> i;

   public class06630(Schema var1, TypeReference var2, String var3, Function<Dynamic<?>, Dynamic<?>> var4, String... var5) {
      super(var1, false);
      this.N = "Adding field `" + var3 + "` to type `" + var2.typeName().toLowerCase(Locale.ROOT) + "`";
      this.y = var2;
      this.L = var3;
      this.u = var5;
      this.i = var4;
   }

   private Dynamic<?> N(Dynamic<?> var1, int var2) {
      if (var2 >= this.u.length) {
         return var1.set(this.L, this.i.apply(var1));
      } else {
         Optional optional = var1.get(this.u[var2]).result();
         return optional.isEmpty() ? var1 : this.N((Dynamic<?>)optional.get(), var2 + 1);
      }
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.N,
         this.getInputSchema().getType(this.y),
         this.getOutputSchema().getType(this.y),
         var1 -> var1.update(DSL.remainderFinder(), var1x -> this.N(var1x, 0))
      );
   }
}
