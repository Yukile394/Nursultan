package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class01288 extends DataFix {
   public class01288(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private double N(String var1) {
      try {
         return (0.9 * Double.parseDouble(var1) + 0.1) / 2.0;
      } catch (NumberFormatException numberformatexception) {
         return 0.5;
      }
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsAddTextBackgroundFix",
         this.getInputSchema().getType(class06962.R),
         var1 -> var1.update(DSL.remainderFinder(), var1x -> (Dynamic)DataFixUtils.orElse(var1x.get("chatOpacity").asString().map(var2 -> {
            double d0 = this.N(var2);
            return var1x.set("textBackgroundOpacity", var1x.createString(String.valueOf(d0)));
         }).result(), var1x))
      );
   }
}
