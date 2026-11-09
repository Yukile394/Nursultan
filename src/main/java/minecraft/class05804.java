package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class05804 extends class00955 {
   public class05804(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityKeepPacked", class06962.G, "DUMMY");
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      return var0.set("keepPacked", var0.createBoolean(true));
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), class05804::N);
   }
}
