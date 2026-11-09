package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class class05020 extends class00955 {
   public class05020(Schema var1, boolean var2) {
      super(var1, var2, "BlockEntityBannerColorFix", class06962.G, "minecraft:banner");
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      var1 = var1.update("Base", var0 -> var0.createInt(15 - var0.asInt(0)));
      return var1.update(
         "Patterns",
         var0 -> (Dynamic)DataFixUtils.orElse(
            var0.asStreamOpt()
               .map(var0x -> var0x.map(var0xx -> var0xx.update("Color", var0xxx -> var0xxx.createInt(15 - var0xxx.asInt(0)))))
               .map(var0::createList)
               .result(),
            var0
         )
      );
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
