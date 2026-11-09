package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class02107 extends DataFix {
   public class02107(Schema var1) {
      super(var1, false);
   }

   private static String N(String var0) {
      return switch (var0) {
         case "0" -> "false";
         case "1", "2" -> "true";
         default -> var0;
      };
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsAmbientOcclusionFix",
         this.getInputSchema().getType(class06962.R),
         var0 -> var0.update(
            DSL.remainderFinder(),
            var0x -> (Dynamic)DataFixUtils.orElse(var0x.get("ao").asString().map(var1 -> var0x.set("ao", var0x.createString(N(var1)))).result(), var0x)
         )
      );
   }
}
