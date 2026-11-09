package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class00300 extends class00955 {
   public class00300(Schema var1) {
      super(var1, false, "EntitySalmonSizeFix", class06962.o, "minecraft:salmon");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(), var0 -> var0.get("type").asString("medium").equals("large") ? var0 : var0.set("type", var0.createString("medium"))
      );
   }
}
