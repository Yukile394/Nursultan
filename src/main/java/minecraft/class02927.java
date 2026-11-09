package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class class02927 extends DataFix {
   public class02927(Schema var1) {
      super(var1, true);
   }

   private static <T> Function<Typed<?>, Typed<?>> N(String var0, Type<?> var1, Type<T> var2) {
      return var2x -> var2x.updateTyped(var0x, var2, var1xx -> class07536.N(var1xx, var2, UnaryOperator.identity()));
   }

   private Function<Typed<?>, Typed<?>> N(String var1) {
      Type<?> type = this.getInputSchema().getChoiceType(class06962.o, var1);
      Type<?> type1 = this.getOutputSchema().getChoiceType(class06962.o, var1);
      return N(var1, type, type1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.o);
      Type<?> type1 = this.getOutputSchema().getType(class06962.o);
      return this.fixTypeEverywhereTyped("Fix Arrow stored weapon", type, type1, class02269.N(this.N("minecraft:arrow"), this.N("minecraft:spectral_arrow")));
   }
}
