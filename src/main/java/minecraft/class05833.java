package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class class05833 extends class00955 {
   public class05833(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityJukeboxFix", class06962.G, "minecraft:jukebox");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      Type<?> type = this.getInputSchema().getChoiceType(class06962.G, "minecraft:jukebox").findFieldType("RecordItem");
      OpticFinder opticfinder = DSL.fieldFinder("RecordItem", type);
      Dynamic<?> dynamic = (Dynamic<?>)var1.get(DSL.remainderFinder());
      int i = dynamic.get("Record").asInt(0);
      if (i > 0) {
         dynamic.remove("Record");
         String s = class06612.N(class07939.N(i), 0);
         if (s != null) {
            Dynamic<?> dynamic1 = dynamic.emptyMap();
            dynamic1 = dynamic1.set("id", dynamic1.createString(s));
            dynamic1 = dynamic1.set("Count", dynamic1.createByte((byte)1));
            return var1.set(
                  opticfinder,
                  (Typed)((Pair)type.readTyped(dynamic1).result().orElseThrow(() -> new IllegalStateException("Could not create record item stack.")))
                     .getFirst()
               )
               .set(DSL.remainderFinder(), dynamic);
         }
      }

      return var1;
   }
}
