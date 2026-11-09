package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class02218 extends DataFix {
   public class02218(Schema var1) {
      super(var1, false);
   }

   private int N(String var1) {
      try {
         return Math.round(Float.parseFloat(var1) * 10.0F);
      } catch (NumberFormatException numberformatexception) {
         return 5;
      }
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsMenuBlurrinessFix",
         this.getInputSchema().getType(class06962.R),
         var1 -> var1.update(DSL.remainderFinder(), var1x -> var1x.update("menuBackgroundBlurriness", var1xx -> {
            int i = this.N(var1xx.asString("0.5"));
            return var1xx.createString(String.valueOf(i));
         }))
      );
   }
}
