package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class class02569 extends DataFix {
   private final String N;
   private final UnaryOperator<String> y;

   public class02569(Schema var1, String var2, UnaryOperator<String> var3) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
   }

   private Typed<?> y(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var1x -> var1x.update(
            "attributes",
            var1xx -> (Dynamic)DataFixUtils.orElse(var1xx.asStreamOpt().result().map(var1xxx -> var1xxx.map(this::N)).map(var1xx::createList), var1xx)
         )
      );
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      return class02269.N(var1, "type", this.y);
   }

   private Typed<?> N(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var1x -> var1x.update(
            "minecraft:attribute_modifiers",
            var1xx -> var1xx.update(
               "modifiers",
               var1xxx -> (Dynamic)DataFixUtils.orElse(var1xxx.asStreamOpt().result().map(var1xxxx -> var1xxxx.map(this::y)).map(var1xxx::createList), var1xxx)
            )
         )
      );
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      return class02269.N((Dynamic<?>)var1, "id", this.y);
   }

   protected TypeRewriteRule makeRule() {
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(this.N + " (Components)", this.getInputSchema().getType(class06962.k), this::N),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped(this.N + " (Entity)", this.getInputSchema().getType(class06962.o), this::y),
            this.fixTypeEverywhereTyped(this.N + " (Player)", this.getInputSchema().getType(class06962.L), this::y)
         }
      );
   }
}
