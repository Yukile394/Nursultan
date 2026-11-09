package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class class05321 extends DataFix {
   private final String N;
   private final UnaryOperator<String> y;

   public class05321(Schema var1, String var2, UnaryOperator<String> var3) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
   }

   private Typed<?> y(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var1x -> var1x.update(
            "Attributes",
            var1xx -> (Dynamic)DataFixUtils.orElse(
               var1xx.asStreamOpt().result().map(var1xxx -> var1xxx.map(var1xxxx -> var1xxxx.update("Name", this::N))).map(var1xx::createList), var1xx
            )
         )
      );
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      return (Dynamic<?>)DataFixUtils.orElse(var1.asString().result().map(this.y).map(var1::createString), var1);
   }

   private Typed<?> N(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var1x -> var1x.update(
            "AttributeModifiers",
            var1xx -> (Dynamic)DataFixUtils.orElse(
               var1xx.asStreamOpt().result().map(var1xxx -> var1xxx.map(var1xxxx -> var1xxxx.update("AttributeName", this::N))).map(var1xx::createList), var1xx
            )
         )
      );
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.l);
      OpticFinder opticfinder = type.findField("tag");
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(this.N + " (ItemStack)", type, var2x -> var2x.updateTyped(opticfinder, this::N)),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped(this.N + " (Entity)", this.getInputSchema().getType(class06962.o), this::y),
            this.fixTypeEverywhereTyped(this.N + " (Player)", this.getInputSchema().getType(class06962.L), this::y)
         }
      );
   }
}
