package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class07584 extends DataFix {
   public class07584(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsMusicToastFix",
         this.getInputSchema().getType(class06962.R),
         var0 -> var0.update(
            DSL.remainderFinder(),
            var0x -> var0x.renameAndFixField(
               "showNowPlayingToast", "musicToast", var1 -> var0x.createString(var1.asString("false").equals("false") ? "never" : "pause_and_toast")
            )
         )
      );
   }
}
