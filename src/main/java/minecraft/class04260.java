package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DataResult.Error;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class class04260 extends DataFix {
   final String N;
   final Map<String, String> y;

   public class04260(Schema var1, String var2, Map<String, String> var3) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      var1 = this.N(var1, "Enchantments");
      return this.N(var1, "StoredEnchantments");
   }

   private Dynamic<?> N(Dynamic<?> var1, String var2) {
      return var1.update(
         var2,
         var1x -> (Dynamic)var1x.asStreamOpt()
            .map(
               var1xx -> var1xx.map(
                  var1xxx -> var1xxx.update(
                     "id",
                     var2x -> (Dynamic)var2x.asString()
                        .map(var2xx -> var1xxx.createString(this.y.getOrDefault(class00622.N(var2xx), var2xx)))
                        .mapOrElse(Function.identity(), var1xxxxx -> var2x)
                  )
               )
            )
            .map(var1x::createList)
            .mapOrElse(Function.identity(), var1xx -> var1x)
      );
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.l);
      OpticFinder opticfinder = type.findField("tag");
      return this.fixTypeEverywhereTyped(this.N, type, var2x -> var2x.updateTyped(opticfinder, var1xx -> var1xx.update(DSL.remainderFinder(), this::N)));
   }
}
