package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08353 extends class00955 {
   public class08353(Schema var1, String var2) {
      super(var1, false, "BlockEntityFurnaceBurnTimeFix" + var2, class06962.G, var2);
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      var1 = var1.renameField("CookTime", "cooking_time_spent");
      var1 = var1.renameField("CookTimeTotal", "cooking_total_time");
      var1 = var1.renameField("BurnTime", "lit_time_remaining");
      return var1.setFieldIfPresent("lit_total_time", var1.get("lit_time_remaining").result());
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
