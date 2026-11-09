package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class05825 extends class00955 {
   public class05825(Schema var1, boolean var2) {
      super(var1, var2, "EntityArmorStandSilentFix", class06962.o, "ArmorStand");
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      return var1.get("Silent").asBoolean(false) && !var1.get("Marker").asBoolean(false) ? var1.remove("Silent") : var1;
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
