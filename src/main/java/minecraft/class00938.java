package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class00938 extends class00955 {
   public class00938(Schema var1, boolean var2) {
      super(var1, var2, "EntityWolfColorFix", class06962.o, "minecraft:wolf");
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      return var1.update("CollarColor", var0 -> var0.createByte((byte)(15 - var0.asInt(0))));
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
