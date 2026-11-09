package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class06814 extends DataFix {
   public class06814(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "WorldBorderWarningTimeFix",
         this.getInputSchema().getType(class06962.b),
         this.getOutputSchema().getType(class06962.b),
         var0 -> var0.update("data", var0x -> var0x.update("warning_time", var1 -> var0x.createInt(var1.asInt(15) * 20)))
      );
   }
}
