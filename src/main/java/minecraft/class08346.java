package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;

public class class08346 extends DataFix {
   private final String N;
   private final TypeReference y;

   public class08346(Schema var1, String var2, TypeReference var3) {
      super(var1, false);
      this.N = var2;
      this.y = var3;
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(this.y);
      OpticFinder opticfinder = type.findField("DisplayName");
      OpticFinder opticfinder1 = DSL.typeFinder(this.getInputSchema().getType(class06962.O));
      return this.fixTypeEverywhereTyped(
         this.N, type, var2x -> var2x.updateTyped(opticfinder, var1xx -> var1xx.update(opticfinder1, var0xx -> var0xx.mapSecond(class03731::N)))
      );
   }
}
