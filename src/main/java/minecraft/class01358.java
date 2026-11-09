package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class class01358 extends class00955 {
   public class01358(Schema var1, String var2) {
      super(var1, false, "Gossip for for " + var2, class06962.o, var2);
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var0 -> var0.update(
            "Gossips",
            var0x -> (Dynamic)DataFixUtils.orElse(
               var0x.asStreamOpt()
                  .result()
                  .map(var0xx -> var0xx.map(var0xxx -> (Dynamic)class01350.L((Dynamic<?>)var0xxx, "Target", "Target").orElse((Dynamic<?>)var0xxx)))
                  .map(var0x::createList),
               var0x
            )
         )
      );
   }
}
