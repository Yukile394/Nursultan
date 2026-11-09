package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class00922 extends class00955 {
   private static final int L = 6;

   public class00922(Schema var1, boolean var2) {
      super(var1, var2, "EntityZombieVillagerTypeFix", class06962.o, "Zombie");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }

   private int N(int var1) {
      return var1 >= 0 && var1 < 6 ? var1 : -1;
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      if (var1.get("IsVillager").asBoolean(false)) {
         if (var1.get("ZombieType").result().isEmpty()) {
            int i = this.N(var1.get("VillagerProfession").asInt(-1));
            if (i == -1) {
               i = this.N(class06069.u().y(6));
            }

            var1 = var1.set("ZombieType", var1.createInt(i));
         }

         var1 = var1.remove("IsVillager");
      }

      return var1;
   }
}
