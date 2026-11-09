package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class class02161 extends class01733 {
   public class02161(Schema var1) {
      super(var1, true, "Trial Spawner config tag fixer", class06962.G, "minecraft:trial_spawner");
   }

   private static <T> Dynamic<T> y(Dynamic<T> var0) {
      List list = List.of(
         "spawn_range",
         "total_mobs",
         "simultaneous_mobs",
         "total_mobs_added_per_player",
         "simultaneous_mobs_added_per_player",
         "ticks_between_spawn",
         "spawn_potentials",
         "loot_tables_to_eject",
         "items_to_drop_when_ominous"
      );
      HashMap hashmap = new HashMap(list.size());

      for (String s : list) {
         Optional optional = var0.get(s).get().result();
         if (optional.isPresent()) {
            hashmap.put(var0.createString(s), (Dynamic)optional.get());
            var0 = var0.remove(s);
         }
      }

      return hashmap.isEmpty() ? var0 : var0.set("normal_config", var0.createMap(hashmap));
   }

   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      return y(var1);
   }
}
