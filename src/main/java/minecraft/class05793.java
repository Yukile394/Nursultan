package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class05793 extends class00955 {
   public class05793(Schema var1, boolean var2) {
      super(var1, var2, "Colorless shulker entity fix", class06962.o, "minecraft:shulker");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.get("Color").asInt(0) == 10 ? var0.set("Color", var0.createByte((byte)16)) : var0);
   }
}
