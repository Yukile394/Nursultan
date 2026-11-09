package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class06242 extends class00955 {
   public class06242(Schema var1, boolean var2) {
      super(var1, var2, "CatTypeFix", class06962.o, "minecraft:cat");
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      return var1.get("CatType").asInt(0) == 9 ? var1.set("CatType", var1.createInt(10)) : var1;
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
