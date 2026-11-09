package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class02832 extends class01733 {
   public class02832(Schema var1) {
      super(var1, false, "TippedArrowPotionToItemFix", class06962.o, "minecraft:arrow");
   }

   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      Optional optional = var1.get("Potion").result();
      Optional optional1 = var1.get("custom_potion_effects").result();
      Optional optional2 = var1.get("Color").result();
      return optional.isEmpty() && optional1.isEmpty() && optional2.isEmpty()
         ? var1
         : var1.remove("Potion").remove("custom_potion_effects").remove("Color").update("item", var3x -> {
            Dynamic dynamic = var3x.get("tag").orElseEmptyMap();
            if (optional.isPresent()) {
               dynamic = dynamic.set("Potion", (Dynamic)optional.get());
            }

            if (optional1.isPresent()) {
               dynamic = dynamic.set("custom_potion_effects", (Dynamic)optional1.get());
            }

            if (optional2.isPresent()) {
               dynamic = dynamic.set("CustomPotionColor", (Dynamic)optional2.get());
            }

            return var3x.set("tag", dynamic);
         });
   }
}
