package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class05223 extends DataFix {
   public class05223(Schema var1) {
      super(var1, false);
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      return !var1.get("Name").asString().result().filter("minecraft:redstone_wire"::equals).isPresent()
         ? var1
         : var1.update(
            "Properties",
            var0 -> {
               String s = var0.get("east").asString("none");
               String s1 = var0.get("west").asString("none");
               String s2 = var0.get("north").asString("none");
               String s3 = var0.get("south").asString("none");
               boolean flag = N(s) || N(s1);
               boolean flag1 = N(s2) || N(s3);
               String s4 = !N(s) && !flag1 ? "side" : s;
               String s5 = !N(s1) && !flag1 ? "side" : s1;
               String s6 = !N(s2) && !flag ? "side" : s2;
               String s7 = !N(s3) && !flag ? "side" : s3;
               return var0.update("east", var1x -> var1x.createString(s4))
                  .update("west", var1x -> var1x.createString(s5))
                  .update("north", var1x -> var1x.createString(s6))
                  .update("south", var1x -> var1x.createString(s7));
            }
         );
   }

   private static boolean N(String var0) {
      return !"none".equals(var0);
   }

   protected TypeRewriteRule makeRule() {
      Schema schema = this.getInputSchema();
      return this.fixTypeEverywhereTyped("RedstoneConnectionsFix", schema.getType(class06962.d), var1x -> var1x.update(DSL.remainderFinder(), this::N));
   }
}
