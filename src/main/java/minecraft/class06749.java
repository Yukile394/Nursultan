package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public class class06749 extends DataFix {
   private final String N;
   private final TypeReference y;

   public class06749(Schema var1, String var2, TypeReference var3) {
      super(var1, true);
      this.N = var2;
      this.y = var3;
   }

   protected TypeRewriteRule makeRule() {
      return this.writeAndRead(this.N, this.getInputSchema().getType(this.y), this.getOutputSchema().getType(this.y));
   }
}
