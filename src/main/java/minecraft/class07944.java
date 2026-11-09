package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class07944 extends DataFix {
   public class07944(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      Optional optional = var1.get("Heightmaps").result();
      if (optional.isEmpty()) {
         return var1;
      } else {
         Dynamic dynamic = (Dynamic)optional.get();
         Optional optional1 = dynamic.get("LIQUID").result();
         if (optional1.isPresent()) {
            dynamic = dynamic.remove("LIQUID");
            dynamic = dynamic.set("WORLD_SURFACE_WG", (Dynamic)optional1.get());
         }

         Optional optional2 = dynamic.get("SOLID").result();
         if (optional2.isPresent()) {
            dynamic = dynamic.remove("SOLID");
            dynamic = dynamic.set("OCEAN_FLOOR_WG", (Dynamic)optional2.get());
            dynamic = dynamic.set("OCEAN_FLOOR", (Dynamic)optional2.get());
         }

         Optional optional3 = dynamic.get("LIGHT").result();
         if (optional3.isPresent()) {
            dynamic = dynamic.remove("LIGHT");
            dynamic = dynamic.set("LIGHT_BLOCKING", (Dynamic)optional3.get());
         }

         Optional optional4 = dynamic.get("RAIN").result();
         if (optional4.isPresent()) {
            dynamic = dynamic.remove("RAIN");
            dynamic = dynamic.set("MOTION_BLOCKING", (Dynamic)optional4.get());
            dynamic = dynamic.set("MOTION_BLOCKING_NO_LEAVES", (Dynamic)optional4.get());
         }

         return var1.set("Heightmaps", dynamic);
      }
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.u);
      OpticFinder opticfinder = type.findField("Level");
      return this.fixTypeEverywhereTyped(
         "HeightmapRenamingFix", type, var2x -> var2x.updateTyped(opticfinder, var1xx -> var1xx.update(DSL.remainderFinder(), this::N))
      );
   }
}
