package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class00446 extends DataFix {
   public class00446(Schema var1) {
      super(var1, false);
   }

   private static String N(String var0) {
      return var0.equals("health") ? "hearts" : "integer";
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.c);
      return this.fixTypeEverywhereTyped("ObjectiveRenderTypeFix", type, var0 -> var0.update(DSL.remainderFinder(), var0x -> {
         if (var0x.get("RenderType").asString().result().isEmpty()) {
            String s = N(var0x.get("CriteriaName").asString(""));
            return var0x.set("RenderType", var0x.createString(s));
         } else {
            return var0x;
         }
      }));
   }
}
