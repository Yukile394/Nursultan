package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class05224 extends class00955 {
   private static final double L = 16.0;
   private static final double u = 48.0;

   public class05224(Schema var1) {
      super(var1, false, "Villager Follow Range Fix", class06962.o, "minecraft:villager");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), class05224::N);
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      return var0.update(
         "Attributes",
         var1 -> var0.createList(
            var1.asStream()
               .map(
                  var0xx -> var0xx.get("Name").asString("").equals("generic.follow_range") && var0xx.get("Base").asDouble(0.0) == 16.0
                     ? var0xx.set("Base", var0xx.createDouble(48.0))
                     : var0xx
               )
         )
      );
   }
}
