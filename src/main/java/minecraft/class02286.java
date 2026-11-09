package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.serialization.Dynamic;

public class class02286 extends DataFix {
   public class02286(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.U);
      OpticFinder opticfinder = type.findField("data");
      OpticFinder opticfinder1 = opticfinder.type().findField("banners");
      OpticFinder opticfinder2 = DSL.typeFinder(((ListType)opticfinder1.type()).getElement());
      return this.fixTypeEverywhereTyped(
         "MapBannerBlockPosFormatFix",
         type,
         var3x -> var3x.updateTyped(
            opticfinder,
            var2xx -> var2xx.updateTyped(
               opticfinder1,
               var1xxx -> var1xxx.updateTyped(opticfinder2, var0xxx -> var0xxx.update(DSL.remainderFinder(), var0xxxx -> var0xxxx.update("Pos", class02269::N)))
            )
         )
      );
   }
}
