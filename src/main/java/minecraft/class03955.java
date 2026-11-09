package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class03955 extends class00955 {
   public class03955(Schema var1) {
      super(var1, false, "EntityGoatMissingStateFix", class06962.o, "minecraft:goat");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.set("HasLeftHorn", var0.createBoolean(true)).set("HasRightHorn", var0.createBoolean(true)));
   }
}
