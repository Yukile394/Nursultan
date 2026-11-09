package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;

public class class05215 extends class00955 {
   public class05215(Schema var1) {
      super(var1, false, "EntityShulkerRotationFix", class06962.o, "minecraft:shulker");
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      List list = var1.get("Rotation").asList(var0 -> var0.asDouble(180.0));
      if (!list.isEmpty()) {
         list.set(0, (Double)list.get(0) - 180.0);
         return var1.set("Rotation", var1.createList(list.stream().map(var1::createDouble)));
      } else {
         return var1;
      }
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
