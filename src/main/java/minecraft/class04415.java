package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.LongStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04415 extends DataFix {
   private static final Logger N = LogUtils.getLogger();
   private static final Map<String, class04429> y = ImmutableMap.builder()
      .put(
         "mineshaft",
         class04429.N(
            Map.of(List.of("minecraft:badlands", "minecraft:eroded_badlands", "minecraft:wooded_badlands"), "minecraft:mineshaft_mesa"), "minecraft:mineshaft"
         )
      )
      .put("shipwreck", class04429.N(Map.of(List.of("minecraft:beach", "minecraft:snowy_beach"), "minecraft:shipwreck_beached"), "minecraft:shipwreck"))
      .put(
         "ocean_ruin",
         class04429.N(
            Map.of(List.of("minecraft:warm_ocean", "minecraft:lukewarm_ocean", "minecraft:deep_lukewarm_ocean"), "minecraft:ocean_ruin_warm"),
            "minecraft:ocean_ruin_cold"
         )
      )
      .put(
         "village",
         class04429.N(
            Map.of(
               List.of("minecraft:desert"),
               "minecraft:village_desert",
               List.of("minecraft:savanna"),
               "minecraft:village_savanna",
               List.of("minecraft:snowy_plains"),
               "minecraft:village_snowy",
               List.of("minecraft:taiga"),
               "minecraft:village_taiga"
            ),
            "minecraft:village_plains"
         )
      )
      .put(
         "ruined_portal",
         class04429.N(
            Map.of(
               List.of("minecraft:desert"),
               "minecraft:ruined_portal_desert",
               List.of(
                  "minecraft:badlands",
                  "minecraft:eroded_badlands",
                  "minecraft:wooded_badlands",
                  "minecraft:windswept_hills",
                  "minecraft:windswept_forest",
                  "minecraft:windswept_gravelly_hills",
                  "minecraft:savanna_plateau",
                  "minecraft:windswept_savanna",
                  "minecraft:stony_shore",
                  "minecraft:meadow",
                  "minecraft:frozen_peaks",
                  "minecraft:jagged_peaks",
                  "minecraft:stony_peaks",
                  "minecraft:snowy_slopes"
               ),
               "minecraft:ruined_portal_mountain",
               List.of("minecraft:bamboo_jungle", "minecraft:jungle", "minecraft:sparse_jungle"),
               "minecraft:ruined_portal_jungle",
               List.of(
                  "minecraft:deep_frozen_ocean",
                  "minecraft:deep_cold_ocean",
                  "minecraft:deep_ocean",
                  "minecraft:deep_lukewarm_ocean",
                  "minecraft:frozen_ocean",
                  "minecraft:ocean",
                  "minecraft:cold_ocean",
                  "minecraft:lukewarm_ocean",
                  "minecraft:warm_ocean"
               ),
               "minecraft:ruined_portal_ocean"
            ),
            "minecraft:ruined_portal"
         )
      )
      .put("pillager_outpost", class04429.N("minecraft:pillager_outpost"))
      .put("mansion", class04429.N("minecraft:mansion"))
      .put("jungle_pyramid", class04429.N("minecraft:jungle_pyramid"))
      .put("desert_pyramid", class04429.N("minecraft:desert_pyramid"))
      .put("igloo", class04429.N("minecraft:igloo"))
      .put("swamp_hut", class04429.N("minecraft:swamp_hut"))
      .put("stronghold", class04429.N("minecraft:stronghold"))
      .put("monument", class04429.N("minecraft:monument"))
      .put("fortress", class04429.N("minecraft:fortress"))
      .put("endcity", class04429.N("minecraft:end_city"))
      .put("buried_treasure", class04429.N("minecraft:buried_treasure"))
      .put("nether_fossil", class04429.N("minecraft:nether_fossil"))
      .put("bastion_remnant", class04429.N("minecraft:bastion_remnant"))
      .build();

   @Nullable
   private Dynamic<?> L(Dynamic<?> var1, Dynamic<?> var2) {
      String s = var1.asString("UNKNOWN").toLowerCase(Locale.ROOT);
      class04429 class04429 = y.get(s);
      if (class04429 == null) {
         return null;
      } else {
         String s1 = class04429.y();
         if (!class04429.N().isEmpty()) {
            Optional<String> optional = this.N(var2, class04429);
            if (optional.isPresent()) {
               s1 = optional.get();
            }
         }

         return var2.createString(s1);
      }
   }

   public class04415(Schema var1) {
      super(var1, false);
   }

   private Dynamic<?> y(Dynamic<?> var1, Dynamic<?> var2) {
      Map map = var1.getMapValues().result().orElse(Map.of());
      HashMap hashmap = Maps.newHashMap();
      map.forEach(
         (var3x, var4x) -> {
            if (var4x.asLongStream().count() != 0L) {
               Dynamic<?> dynamic = this.L((Dynamic<?>)var3x, var2);
               if (dynamic == null) {
                  N.warn("Encountered unknown structure in datafixer: {}", var3x.asString("<missing key>"));
               } else {
                  hashmap.compute(
                     dynamic, (var1xx, var2xx) -> var2xx == null ? var4x : var4x.createLongList(LongStream.concat(var2xx.asLongStream(), var4x.asLongStream()))
                  );
               }
            }
         }
      );
      return var2.createMap(hashmap);
   }

   private Dynamic<?> N(Dynamic<?> var1, Dynamic<?> var2) {
      Map map = var1.getMapValues().result().orElse(Map.of());
      HashMap hashmap = Maps.newHashMap();
      map.forEach((var3x, var4x) -> {
         if (!var4x.get("id").asString("INVALID").equals("INVALID")) {
            Dynamic<?> dynamic = this.L((Dynamic<?>)var3x, var2);
            if (dynamic == null) {
               N.warn("Encountered unknown structure in datafixer: {}", var3x.asString("<missing key>"));
            } else {
               hashmap.computeIfAbsent(dynamic, var2xx -> var4x.set("id", dynamic));
            }
         }
      });
      return var2.createMap(hashmap);
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      return var1.update("structures", var2 -> var2.update("starts", var2x -> this.N(var2x, var1)).update("References", var2x -> this.y(var2x, var1)));
   }

   private Optional<String> N(Dynamic<?> var1, class04429 var2) {
      Object2IntArrayMap object2intarraymap = new Object2IntArrayMap();
      var1.get("sections").asList(Function.identity()).forEach(var2x -> var2x.get("biomes").get("palette").asList(Function.identity()).forEach(var2xx -> {
         String s = var2.N().get(var2xx.asString(""));
         if (s != null) {
            object2intarraymap.mergeInt(s, 1, Integer::sum);
         }
      }));
      return object2intarraymap.object2IntEntrySet().stream().max(Comparator.comparingInt(Entry::getIntValue)).map(java.util.Map.Entry::getKey);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.u);
      Type<?> type1 = this.getInputSchema().getType(class06962.u);
      return this.writeFixAndRead("StucturesToConfiguredStructures", type, type1, this::N);
   }
}
