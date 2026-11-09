package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class01044 extends class00955 {
   public class01044(Schema var1, boolean var2) {
      super(var1, var2, "Remove Golem Gossip Fix", class06962.o, "minecraft:villager");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), class01044::N);
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      return var0.update("Gossips", var1 -> var0.createList(var1.asStream().filter(var0xx -> !var0xx.get("Type").asString("").equals("golem"))));
   }
}
