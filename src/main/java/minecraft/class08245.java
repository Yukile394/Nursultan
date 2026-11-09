package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08245 extends class00955 {
   private static final String L = "CanPickUpLoot";

   public class08245(Schema var1) {
      super(var1, true, "Villager CanPickUpLoot default value", class06962.o, "Villager");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), class08245::N);
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      return var0.set("CanPickUpLoot", var0.createBoolean(true));
   }
}
