package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class04888 extends DataFix {
   public class04888(Schema var1, boolean var2) {
      super(var1, var2);
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.u);
      Type type1 = type.findFieldType("Level");
      OpticFinder opticfinder = DSL.fieldFinder("Level", type1);
      return this.fixTypeEverywhereTyped(
         "ChunkLightRemoveFix",
         type,
         this.getOutputSchema().getType(class06962.u),
         var1x -> var1x.updateTyped(opticfinder, var0x -> var0x.update(DSL.remainderFinder(), var0xx -> var0xx.remove("isLightOn")))
      );
   }
}
