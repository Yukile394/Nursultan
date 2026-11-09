package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08189 extends DataFix {
   public class08189(Schema var1) {
      super(var1, true);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "graphicsPreset set to \"custom\"",
         this.getInputSchema().getType(class06962.R),
         var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.set("graphicsPreset", var0x.createString("custom")))
      );
   }
}
