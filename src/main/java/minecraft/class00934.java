package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class class00934 extends DataFix {
   private static boolean L(Dynamic<?> var0) {
      return var0.get("id").asString("").equals("Iglu");
   }

   public class00934(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <T> Dynamic<T> y(Dynamic<T> var0) {
      return var0.asStreamOpt().map(var0x -> var0x.filter(var0xx -> !L((Dynamic<?>)var0xx))).map(var0::createList).result().orElse(var0);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      return var0.get("Children").asStreamOpt().map(var0x -> var0x.allMatch(class00934::L)).result().orElse(false)
         ? var0.set("id", var0.createString("Igloo")).remove("Children")
         : var0.update("Children", class00934::y);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.H);
      return this.fixTypeEverywhereTyped("IglooMetadataRemovalFix", type, var0 -> var0.update(DSL.remainderFinder(), class00934::N));
   }
}
