package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class05810 extends class00955 {
   public class05810(Schema var1, boolean var2) {
      super(var1, var2, "EntityHorseSaddleFix", class06962.o, "EntityHorse");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      OpticFinder<Pair<String, String>> opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      Type<?> type = this.getInputSchema().getTypeRaw(class06962.l);
      OpticFinder opticfinder1 = DSL.fieldFinder("SaddleItem", type);
      Optional optional = var1.getOptionalTyped(opticfinder1);
      Dynamic<?> dynamic = (Dynamic<?>)var1.get(DSL.remainderFinder());
      if (optional.isEmpty() && dynamic.get("Saddle").asBoolean(false)) {
         Typed typed = (Typed)type.pointTyped(var1.getOps()).orElseThrow(IllegalStateException::new);
         typed = typed.set(opticfinder, Pair.of(class06962.K.typeName(), "minecraft:saddle"));
         Dynamic<?> dynamic1 = dynamic.emptyMap();
         dynamic1 = dynamic1.set("Count", dynamic1.createByte((byte)1));
         dynamic1 = dynamic1.set("Damage", dynamic1.createShort((short)0));
         typed = typed.set(DSL.remainderFinder(), dynamic1);
         dynamic.remove("Saddle");
         return var1.set(opticfinder1, typed).set(DSL.remainderFinder(), dynamic);
      } else {
         return var1;
      }
   }
}
