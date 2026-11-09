package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class05788 extends class00955 {
   public class05788(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityShulkerBoxColorFix", class06962.G, "minecraft:shulker_box");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.remove("Color"));
   }
}
