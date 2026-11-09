package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class02810 extends class00955 {
   public class02810(Schema var1) {
      super(var1, false, "AreaEffectCloudPotionFix", class06962.o, "minecraft:area_effect_cloud");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      Optional optional = var1.get("Color").result();
      Optional optional1 = var1.get("effects").result();
      Optional optional2 = var1.get("Potion").result();
      var1 = var1.remove("Color").remove("effects").remove("Potion");
      if (optional.isEmpty() && optional1.isEmpty() && optional2.isEmpty()) {
         return var1;
      } else {
         Dynamic dynamic = var1.emptyMap();
         if (optional.isPresent()) {
            dynamic = dynamic.set("custom_color", (Dynamic)optional.get());
         }

         if (optional1.isPresent()) {
            dynamic = dynamic.set("custom_effects", (Dynamic)optional1.get());
         }

         if (optional2.isPresent()) {
            dynamic = dynamic.set("potion", (Dynamic)optional2.get());
         }

         return var1.set("potion_contents", dynamic);
      }
   }
}
