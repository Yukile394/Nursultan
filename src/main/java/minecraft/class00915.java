package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.function.Supplier;

public class class00915 extends class08147 {
   private final Supplier<Type<?>> y = Suppliers.memoize(() -> this.getOutputSchema().getChoiceType(class06962.o, "ZombieVillager"));

   public class00915(Schema var1) {
      super("EntityZombieSplitFix", var1, true);
   }

   private Typed<?> N(Typed<?> var1, int var2) {
      return class07536.N(var1, this.y.get(), var1x -> var1x.set("Profession", var1x.createInt(var2)));
   }

   @Override
   protected Pair<String, Typed<?>> N(String var1, Typed<?> var2) {
      if (!var1.equals("Zombie")) {
         return Pair.of(var1, var2);
      } else {
         int i = ((Dynamic)var2.getOptional(DSL.remainderFinder()).orElseThrow()).get("ZombieType").asInt(0);
         String s;
         Typed<?> typed;
         switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
               s = "ZombieVillager";
               typed = this.N(var2, i - 1);
               break;
            case 6:
               s = "Husk";
               typed = var2;
               break;
            default:
               s = "Zombie";
               typed = var2;
         }

         return Pair.of(s, typed.update(DSL.remainderFinder(), var0 -> var0.remove("ZombieType")));
      }
   }
}
