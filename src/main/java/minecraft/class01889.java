package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class01889 extends DataFix {
   public class01889(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "RandomSequenceSettingsFix",
         this.getInputSchema().getType(class06962.m),
         var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.update("data", var0xx -> var0xx.emptyMap().set("sequences", var0xx)))
      );
   }
}
