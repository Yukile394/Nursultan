package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class class05797 extends class00955 {
   public class05797(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityBlockStateFix", class06962.G, "minecraft:piston");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      Type<?> type = this.getOutputSchema().getChoiceType(class06962.G, "minecraft:piston");
      Type<?> type1 = type.findFieldType("blockState");
      OpticFinder opticfinder = DSL.fieldFinder("blockState", type1);
      Dynamic<?> dynamic = (Dynamic<?>)var1.get(DSL.remainderFinder());
      int i = dynamic.get("blockId").asInt(0);
      dynamic = dynamic.remove("blockId");
      int j = dynamic.get("blockData").asInt(0) & 15;
      dynamic = dynamic.remove("blockData");
      Dynamic<?> dynamic1 = class05803.y(i << 4 | j);
      return ((Typed)type.pointTyped(var1.getOps()).orElseThrow(() -> new IllegalStateException("Could not create new piston block entity.")))
         .set(DSL.remainderFinder(), dynamic)
         .set(
            opticfinder,
            (Typed)((Pair)type1.readTyped(dynamic1).result().orElseThrow(() -> new IllegalStateException("Could not parse newly created block state tag.")))
               .getFirst()
         );
   }
}
