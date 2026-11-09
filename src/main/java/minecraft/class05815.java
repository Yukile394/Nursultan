package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class class05815 extends class08147 {
   public class05815(Schema var1) {
      super("EntityMinecartIdentifiersFix", var1, true);
   }

   @Override
   protected Pair<String, Typed<?>> N(String var1, Typed<?> var2) {
      if (!var1.equals("Minecart")) {
         return Pair.of(var1, var2);
      } else {
         String s = switch (((Dynamic)var2.getOrCreate(DSL.remainderFinder())).get("Type").asInt(0)) {
            case 1 -> "MinecartChest";
            case 2 -> "MinecartFurnace";
            default -> "MinecartRideable";
         };
         Type<?> type = (Type<?>)this.getOutputSchema().findChoiceType(class06962.o).types().get(s);
         return Pair.of(s, class07536.N(var2, type, var0 -> var0.remove("Type")));
      }
   }
}
