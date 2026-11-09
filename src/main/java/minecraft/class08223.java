package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import org.slf4j.Logger;

public class class08223 extends class00955 {
   private static final Logger L = LogUtils.getLogger();

   public class08223(Schema var1) {
      super(var1, false, "TrialSpawnerConfigInRegistryFix", class06962.G, "minecraft:trial_spawner");
   }

   public Dynamic<?> N(Dynamic<class07709> var1) {
      Optional optional = var1.get("normal_config").result();
      if (optional.isEmpty()) {
         return var1;
      } else {
         Optional optional1 = var1.get("ominous_config").result();
         if (optional1.isEmpty()) {
            return var1;
         } else {
            class01894 class01894 = class08203.N.get(Pair.of((Dynamic)optional.get(), (Dynamic)optional1.get()));
            return class01894 == null
               ? var1
               : var1.set("normal_config", var1.createString(class01894.M("/normal").toString()))
                  .set("ominous_config", var1.createString(class01894.M("/ominous").toString()));
         }
      }
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), var1x -> {
         DynamicOps dynamicops = var1x.getOps();
         return this.N(var1x.convert(class07713.N)).convert(dynamicops);
      });
   }
}
