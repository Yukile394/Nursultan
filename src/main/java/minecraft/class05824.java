package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class class05824 extends class08147 {
   public class05824(Schema var1, boolean var2) {
      super("EntityHorseSplitFix", var1, var2);
   }

   @Override
   protected Pair<String, Typed<?>> N(String var1, Typed<?> var2) {
      if (Objects.equals("EntityHorse", var1)) {
         String s = switch (((Dynamic)var2.get(DSL.remainderFinder())).get("Type").asInt(0)) {
            case 1 -> "Donkey";
            case 2 -> "Mule";
            case 3 -> "ZombieHorse";
            case 4 -> "SkeletonHorse";
            default -> "Horse";
         };
         Type<?> type = (Type<?>)this.getOutputSchema().findChoiceType(class06962.o).types().get(s);
         return Pair.of(s, class07536.N(var2, type, var0 -> var0.remove("Type")));
      } else {
         return Pair.of(var1, var2);
      }
   }
}
