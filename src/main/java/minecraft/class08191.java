package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08191 extends DataFix {
   public class08191(Schema var1) {
      super(var1, true);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      return "true".equals(var0.asString("true")) ? var0.createString("1") : var0.createString("0");
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "fancyGraphics to graphicsMode",
         this.getInputSchema().getType(class06962.R),
         var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.renameAndFixField("fancyGraphics", "graphicsMode", class08191::N))
      );
   }
}
