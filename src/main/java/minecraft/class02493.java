package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class02493 extends class00955 {
   public class02493(Schema var1) {
      super(var1, false, "PlayerHeadBlockProfileFix", class06962.G, "minecraft:skull");
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      Optional optional = var1.get("SkullOwner").result();
      Optional optional1 = var1.get("ExtraType").result();
      Optional optional2 = optional.or(() -> optional1);
      if (optional2.isEmpty()) {
         return var1;
      } else {
         var1 = var1.remove("SkullOwner").remove("ExtraType");
         return var1.set("profile", class02849.N((Dynamic<?>)optional2.get()));
      }
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
