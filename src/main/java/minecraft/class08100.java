package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08100 extends class00955 {
   public class08100(Schema var1) {
      super(var1, false, "CopperGolemWeatherStateFix", class06962.o, "minecraft:copper_golem");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var0 -> var0.update("weather_state", class08100::N));
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      return switch (var0.asInt(0)) {
         case 1 -> var0.createString("exposed");
         case 2 -> var0.createString("weathered");
         case 3 -> var0.createString("oxidized");
         default -> var0.createString("unaffected");
      };
   }
}
