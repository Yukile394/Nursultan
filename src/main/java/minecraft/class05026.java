package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;

class class05026 extends DataFix {
   class05026(Schema var1, boolean var2) {
      super(var1, var2);
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.o);
      OpticFinder opticfinder = DSL.fieldFinder("id", class00622.N());
      OpticFinder opticfinder1 = type.findField("CustomName");
      OpticFinder opticfinder2 = DSL.typeFinder(this.getInputSchema().getType(class06962.O));
      return this.fixTypeEverywhereTyped(
         "Command block minecart custom name fix",
         type,
         var3x -> {
            String s = var3x.getOptional(opticfinder).orElse("");
            return !"minecraft:commandblock_minecart".equals(s)
               ? var3x
               : var3x.updateTyped(opticfinder1, var1xx -> var1xx.update(opticfinder2, var0xx -> var0xx.mapSecond(class03731::N)));
         }
      );
   }
}
