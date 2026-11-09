package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public abstract class class03952 extends DataFix {
   private final String N;
   private final Predicate<String> y;

   public class03952(Schema var1, String var2, Predicate<String> var3) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
   }

   protected abstract Typed<?> N(Typed<?> var1);

   public static UnaryOperator<Typed<?>> N(Type<?> var0, Predicate<String> var1, UnaryOperator<Typed<?>> var2) {
      OpticFinder opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      OpticFinder opticfinder1 = var0.findField("tag");
      return var4x -> {
         Optional optional = var4x.getOptional(opticfinder);
         return optional.isPresent() && var1.test((String)((Pair)optional.get()).getSecond()) ? var4x.updateTyped(opticfinder1, var2) : var4x;
      };
   }

   public final TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.l);
      return this.fixTypeEverywhereTyped(this.N, type, N(type, this.y, this::N));
   }
}
