package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class05225 extends class00955 {
   public class05225(Schema var1, boolean var2) {
      super(var1, var2, "StriderGravityFix", class06962.o, "minecraft:strider");
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      return var1.get("NoGravity").asBoolean(false) ? var1.set("NoGravity", var1.createBoolean(false)) : var1;
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
