package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class class01799 {
   public static final class05946<class05281> N = class01019.N("trial_chambers/chamber/end");
   public static final class05946<class05281> y = class01019.N("trial_chambers/hallway/fallback");
   public static final List<class03129> L = ImmutableList.builder()
      .add(
         class03129.N(
            class04540.<List<class03129>>y()
               .N(List.of(class03129.N(N("contents/ranged"), N("ranged/skeleton")), class03129.N(N("contents/slow_ranged"), N("slow_ranged/skeleton"))))
               .N(List.of(class03129.N(N("contents/ranged"), N("ranged/stray")), class03129.N(N("contents/slow_ranged"), N("slow_ranged/stray"))))
               .N(
                  List.of(
                     class03129.N(N("contents/ranged"), N("ranged/poison_skeleton")), class03129.N(N("contents/slow_ranged"), N("slow_ranged/poison_skeleton"))
                  )
               )
               .N()
         )
      )
      .add(class03129.N(N("contents/melee"), class04540.<String>y().N(N("melee/zombie")).N(N("melee/husk")).N(N("melee/spider")).N()))
      .add(
         class03129.N(
            N("contents/small_melee"),
            class04540.<String>y().N(N("small_melee/slime")).N(N("small_melee/cave_spider")).N(N("small_melee/silverfish")).N(N("small_melee/baby_zombie")).N()
         )
      )
      .build();

   public class01799() {
      super();
   }

   public static String N(String var0) {
      return "trial_chambers/spawner/" + var0;
   }

   public static void N(class04116<class05281> var0) {
      class02055 class02055 = var0.N(class04227.yv);
      class03529 class03529xx = class02055.y(class01019.N);
      class03529 class03529x = class02055.y(y);
      class03529 class03529xx = var0.N(class04227.yT).y(class01027.c);
      var0.N(
         N,
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/corridor/end_1", class03529xx), 1), Pair.of(class05248.y("trial_chambers/corridor/end_2", class03529xx), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/chamber/entrance_cap",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/chamber/entrance_cap", class03529xx), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/chambers/end",
         new class05281(
            class03529x,
            List.of(
               Pair.of(class05248.y("trial_chambers/chamber/chamber_1", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/chamber/assembly", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/chamber/eruption", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted", class03529xx), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/corridor",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/corridor/second_plate"), 1),
               Pair.of(class05248.y("trial_chambers/intersection/intersection_1", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/intersection/intersection_2", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/intersection/intersection_3", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/corridor/first_plate"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/atrium_1", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/corridor/entrance_1", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/corridor/entrance_2", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/corridor/entrance_3", class03529xx), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/chamber/addon",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/chamber/addon/full_stacked_walkway"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/addon/full_stacked_walkway_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/addon/full_corner_column"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/addon/grate_bridge"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/addon/hanging_platform"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/addon/short_grate_platform"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/addon/short_platform"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/addon/lower_staircase_down"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/addon/walkway_with_bridge_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/addon/c1_breeze"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/chamber/assembly",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/chamber/assembly/full_column"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/cover_1"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/cover_2"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/cover_3"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/cover_4"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/cover_5"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/cover_6"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/cover_7"), 5),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/platform_1"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/spawner_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/hanging_1"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/hanging_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/hanging_3"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/hanging_4"), 2),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/hanging_5"), 4),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/left_staircase_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/left_staircase_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/left_staircase_3"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/right_staircase_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/right_staircase_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/assembly/right_staircase_3"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/chamber/eruption",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/chamber/eruption/center_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/eruption/breeze_slice_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/eruption/slice_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/eruption/slice_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/eruption/slice_3"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/eruption/quadrant_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/eruption/quadrant_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/eruption/quadrant_3"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/eruption/quadrant_4"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/eruption/quadrant_5"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/chamber/slanted",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/chamber/slanted/center"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/hallway_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/hallway_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/hallway_3"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/quadrant_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/quadrant_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/quadrant_3"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/quadrant_4"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/ramp_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/ramp_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/ramp_3"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/ramp_4"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/ominous_upper_arm_1"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/chamber/pedestal",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/chamber/pedestal/center_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/pedestal/slice_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/pedestal/slice_2"), 3),
               Pair.of(class05248.y("trial_chambers/chamber/pedestal/slice_3"), 3),
               Pair.of(class05248.y("trial_chambers/chamber/pedestal/slice_4"), 3),
               Pair.of(class05248.y("trial_chambers/chamber/pedestal/slice_5"), 3),
               Pair.of(class05248.y("trial_chambers/chamber/pedestal/ominous_slice_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/pedestal/quadrant_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/pedestal/quadrant_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/pedestal/quadrant_3"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/quadrant_1"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/quadrant_2"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/quadrant_3"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/slanted/quadrant_4"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/corridor/slices",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/corridor/straight_1", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/corridor/straight_2", class03529xx), 2),
               Pair.of(class05248.y("trial_chambers/corridor/straight_3", class03529xx), 2),
               Pair.of(class05248.y("trial_chambers/corridor/straight_4", class03529xx), 2),
               Pair.of(class05248.y("trial_chambers/corridor/straight_5", class03529xx), 2),
               Pair.of(class05248.y("trial_chambers/corridor/straight_6", class03529xx), 2),
               Pair.of(class05248.y("trial_chambers/corridor/straight_7", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/corridor/straight_8", class03529xx), 2)
            ),
            class05246.field_16687
         )
      );
      var0.N(
         y,
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/hallway/rubble"), 1),
               Pair.of(class05248.y("trial_chambers/hallway/rubble_chamber"), 1),
               Pair.of(class05248.y("trial_chambers/hallway/rubble_thin"), 1),
               Pair.of(class05248.y("trial_chambers/hallway/rubble_chamber_thin"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/hallway",
         new class05281(
            class03529x,
            List.of(
               Pair.of(class05248.y("trial_chambers/hallway/corridor_connector_1"), 1),
               Pair.of(class05248.y("trial_chambers/hallway/upper_hallway_connector", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/lower_hallway_connector", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/rubble"), 1),
               Pair.of(class05248.y("trial_chambers/chamber/chamber_1", class03529xx), 150),
               Pair.of(class05248.y("trial_chambers/chamber/chamber_2", class03529xx), 150),
               Pair.of(class05248.y("trial_chambers/chamber/chamber_4", class03529xx), 150),
               Pair.of(class05248.y("trial_chambers/chamber/chamber_8", class03529xx), 150),
               Pair.of(class05248.y("trial_chambers/chamber/assembly", class03529xx), 150),
               Pair.of(class05248.y("trial_chambers/chamber/eruption", class03529xx), 150),
               Pair.of(class05248.y("trial_chambers/chamber/slanted", class03529xx), 150),
               Pair.of(class05248.y("trial_chambers/chamber/pedestal", class03529xx), 150),
               Pair.of(class05248.y("trial_chambers/hallway/rubble_chamber", class03529xx), 10),
               Pair.of(class05248.y("trial_chambers/hallway/rubble_chamber_thin", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/cache_1", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/left_corner", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/right_corner", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/corner_staircase", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/corner_staircase_down", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/long_straight_staircase", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/long_straight_staircase_down", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/straight", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/straight_staircase", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/straight_staircase_down", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/trapped_staircase", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/encounter_1", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/encounter_2", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/encounter_3", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/encounter_4", class03529xx), 1),
               Pair.of(class05248.y("trial_chambers/hallway/encounter_5", class03529xx), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/corridors/addon/lower",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.Z(), 8),
               Pair.of(class05248.y("trial_chambers/corridor/addon/staircase"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/addon/wall"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/addon/ladder_to_middle"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/addon/arrow_dispenser"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/addon/bridge_lower"), 2)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/corridors/addon/middle",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.Z(), 8),
               Pair.of(class05248.y("trial_chambers/corridor/addon/open_walkway"), 2),
               Pair.of(class05248.y("trial_chambers/corridor/addon/walled_walkway"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/corridors/addon/middle_upper",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.Z(), 6),
               Pair.of(class05248.y("trial_chambers/corridor/addon/open_walkway_upper"), 2),
               Pair.of(class05248.y("trial_chambers/corridor/addon/chandelier_upper"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/addon/decoration_upper"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/addon/head_upper"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/addon/reward_upper"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/atrium",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/corridor/atrium/bogged_relief"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/atrium/breeze_relief"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/atrium/spiral_relief"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/atrium/spider_relief"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/atrium/grand_staircase_1"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/atrium/grand_staircase_2"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/atrium/grand_staircase_3"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/decor",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.Z(), 22),
               Pair.of(class05248.y("trial_chambers/decor/empty_pot"), 2),
               Pair.of(class05248.y("trial_chambers/decor/dead_bush_pot"), 2),
               Pair.of(class05248.y("trial_chambers/decor/undecorated_pot"), 10),
               Pair.of(class05248.y("trial_chambers/decor/flow_pot"), 1),
               Pair.of(class05248.y("trial_chambers/decor/guster_pot"), 1),
               Pair.of(class05248.y("trial_chambers/decor/scrape_pot"), 1),
               Pair.of(class05248.y("trial_chambers/decor/candle_1"), 1),
               Pair.of(class05248.y("trial_chambers/decor/candle_2"), 1),
               Pair.of(class05248.y("trial_chambers/decor/candle_3"), 1),
               Pair.of(class05248.y("trial_chambers/decor/candle_4"), 1),
               Pair.of(class05248.y("trial_chambers/decor/barrel"), 2)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/decor/disposal",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/decor/disposal"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/decor/bed",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/decor/white_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/light_gray_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/gray_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/black_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/brown_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/red_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/orange_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/yellow_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/lime_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/green_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/cyan_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/light_blue_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/blue_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/purple_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/magenta_bed"), 3),
               Pair.of(class05248.y("trial_chambers/decor/pink_bed"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/entrance",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/corridor/addon/display_1"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/addon/display_2"), 1),
               Pair.of(class05248.y("trial_chambers/corridor/addon/display_3"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/decor/chamber",
         new class05281(
            class03529xx, List.of(Pair.of(class05248.Z(), 4), Pair.of(class05248.y("trial_chambers/decor/undecorated_pot"), 1)), class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/reward/all",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/reward/vault"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/reward/ominous_vault",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/reward/ominous_vault"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/reward/contents/default",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/reward/vault"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/chests/supply",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/chests/connectors/supply"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/chests/contents/supply",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/chests/supply"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/spawner/ranged",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/spawner/connectors/ranged"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/spawner/slow_ranged",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/spawner/connectors/slow_ranged"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/spawner/melee",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/spawner/connectors/melee"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/spawner/small_melee",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/spawner/connectors/small_melee"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/spawner/breeze",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/spawner/connectors/breeze"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/spawner/all",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.y("trial_chambers/spawner/connectors/ranged"), 1),
               Pair.of(class05248.y("trial_chambers/spawner/connectors/melee"), 1),
               Pair.of(class05248.y("trial_chambers/spawner/connectors/small_melee"), 1)
            ),
            class05246.field_16687
         )
      );
      class01019.N(
         var0,
         "trial_chambers/spawner/contents/breeze",
         new class05281(class03529xx, List.of(Pair.of(class05248.y("trial_chambers/spawner/breeze/breeze"), 1)), class05246.field_16687)
      );
      class01019.N(
         var0,
         "trial_chambers/dispensers/chamber",
         new class05281(
            class03529xx,
            List.of(
               Pair.of(class05248.Z(), 1),
               Pair.of(class05248.y("trial_chambers/dispensers/chamber"), 1),
               Pair.of(class05248.y("trial_chambers/dispensers/wall_dispenser"), 1),
               Pair.of(class05248.y("trial_chambers/dispensers/floor_dispenser"), 1)
            ),
            class05246.field_16687
         )
      );
      class03109.N(var0, class03529xx, L);
   }
}
