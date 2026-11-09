package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class01245 extends DataFix {
   private final String N;
   private final String y;
   private final String L;

   public class01245(Schema var1, boolean var2, String var3, String var4, String var5) {
      super(var1, var2);
      this.N = var3;
      this.y = var4;
      this.L = var5;
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         this.N, this.getInputSchema().getType(class06962.R), var1 -> var1.update(DSL.remainderFinder(), var1x -> var1x.renameField(this.y, this.L))
      );
   }
}
