package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;

public class class07919 extends DataFix {
   public class07919(Schema var1) {
      super(var1, false);
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.l);
      Type type1 = this.getInputSchema().getType(class06962.O);
      OpticFinder opticfinder = type.findField("tag");
      OpticFinder opticfinder1 = opticfinder.type().findField("display");
      OpticFinder opticfinder2 = opticfinder1.type().findField("Name");
      OpticFinder opticfinder3 = DSL.typeFinder(type1);
      return this.fixTypeEverywhereTyped(
         "ItemCustomNameToComponentFix",
         type,
         var4x -> var4x.updateTyped(
            opticfinder,
            var3xx -> var3xx.updateTyped(
               opticfinder1,
               var2xxx -> var2xxx.updateTyped(opticfinder2, var1xxxx -> var1xxxx.update(opticfinder3, var0xxxx -> var0xxxx.mapSecond(class03731::N)))
            )
         )
      );
   }
}
