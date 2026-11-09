package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08110 extends class00955 {
   public class08110(Schema var1, boolean var2) {
      super(var1, var2, "EntityShulkerColorFix", class06962.o, "minecraft:shulker");
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      return var1.get("Color").map(Dynamic::asNumber).result().isEmpty() ? var1.set("Color", var1.createByte((byte)10)) : var1;
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
