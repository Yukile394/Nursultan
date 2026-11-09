package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class01349 extends class01350 {
   public class01349(Schema var1) {
      super(var1, class06962.L);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "PlayerUUIDFix",
         this.getInputSchema().getType(this.N),
         var0 -> {
            OpticFinder opticfinder = var0.getType().findField("RootVehicle");
            return var0.updateTyped(
                  opticfinder, opticfinder.type(), var0x -> var0x.update(DSL.remainderFinder(), var0xx -> L(var0xx, "Attach", "Attach").orElse(var0xx))
               )
               .update(DSL.remainderFinder(), var0x -> class01367.L(class01367.y(var0x)));
         }
      );
   }
}
