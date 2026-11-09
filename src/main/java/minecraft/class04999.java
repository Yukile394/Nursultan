package minecraft;

import Nursultan.class10432;
import Nursultan.class10438;
import Nursultan.class10482;
import Nursultan.class10483;
import Nursultan.class10537;
import Nursultan.class10695;
import Nursultan.class10702;
import Nursultan.class10704;
import Nursultan.class10878;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.DataFixerBuilder.Result;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class04999 {
   private static final BiFunction<Integer, Schema, Schema> y = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> L = class00622::new;
   private static final Result u = y();
   public static final int N = 4295;

   private class04999() {
      super();
   }

   private static Result y() {
      DataFixerBuilder datafixerbuilder = new DataFixerBuilder(class07529.y().comp_4026().y());
      N(datafixerbuilder);
      return datafixerbuilder.build();
   }

   private static UnaryOperator<String> y(Map<String, String> var0) {
      return var1 -> var0.getOrDefault(class00622.N(var1), var1);
   }

   public static DataFixer N() {
      return u.fixer();
   }

   private static UnaryOperator<String> N(Map<String, String> var0) {
      return var1 -> var0.getOrDefault(var1, var1);
   }

   private static UnaryOperator<String> N(String var0, String var1) {
      return var2 -> Objects.equals(class00622.N(var2), var0) ? var1 : var2;
   }

   public static CompletableFuture<?> N(Set<TypeReference> var0) {
      if (var0.isEmpty()) {
         return CompletableFuture.completedFuture(null);
      } else {
         ExecutorService executorservice = Executors.newSingleThreadExecutor(
            new ThreadFactoryBuilder().setNameFormat("Datafixer Bootstrap").setDaemon(true).setPriority(1).build()
         );
         return u.optimize(var0, executorservice);
      }
   }

   private static void N(DataFixerBuilder var0) {
      var0.addSchema(99, class06689::new);
      Schema schema = var0.addSchema(100, class00582::new);
      var0.addFixer(new class05812(schema));
      Schema schema1 = var0.addSchema(101, y);
      var0.addFixer(new class08245(schema1));
      Schema schema2 = var0.addSchema(102, class00581::new);
      var0.addFixer(new class07939(schema2, true));
      var0.addFixer(new class07401(schema2, false));
      Schema schema3 = var0.addSchema(105, y);
      var0.addFixer(new class07383(schema3, true));
      Schema schema4 = var0.addSchema(106, class00593::new);
      var0.addFixer(new class00469(schema4, true));
      Schema schema5 = var0.addSchema(107, class06854::new);
      var0.addFixer(new class05815(schema5));
      Schema schema6 = var0.addSchema(108, y);
      var0.addFixer(new class00921(schema6, true));
      Schema schema7 = var0.addSchema(109, y);
      var0.addFixer(new class05807(schema7, true));
      Schema schema8 = var0.addSchema(110, y);
      var0.addFixer(new class05810(schema8, true));
      Schema schema9 = var0.addSchema(111, y);
      var0.addFixer(new class05786(schema9, true));
      Schema schema10 = var0.addSchema(113, y);
      var0.addFixer(new class01483(schema10, true));
      Schema schema11 = var0.addSchema(135, class06811::new);
      var0.addFixer(new class01094(schema11, true));
      Schema schema12 = var0.addSchema(143, class06818::new);
      var0.addFixer(new class00943(schema12, true));
      Schema schema13 = var0.addSchema(147, y);
      var0.addFixer(new class05825(schema13, true));
      Schema schema14 = var0.addSchema(165, y);
      var0.addFixer(new class08756(schema14));
      var0.addFixer(new class08748(schema14));
      Schema schema15 = var0.addSchema(501, class06708::new);
      var0.addFixer(new class05000(schema15, "Add 1.10 entities fix", class06962.o));
      Schema schema16 = var0.addSchema(502, y);
      var0.addFixer(
         class07906.N(
            schema16, "cooked_fished item renamer", var0x -> Objects.equals(class00622.N(var0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : var0x
         )
      );
      var0.addFixer(new class00922(schema16, false));
      Schema schema17 = var0.addSchema(505, y);
      var0.addFixer(new class00472(schema17, false));
      Schema schema18 = var0.addSchema(700, class06707::new);
      var0.addFixer(new class05791(schema18, true));
      Schema schema19 = var0.addSchema(701, class06688::new);
      var0.addFixer(new class08115(schema19, true));
      Schema schema20 = var0.addSchema(702, class06713::new);
      var0.addFixer(new class00915(schema20));
      Schema schema21 = var0.addSchema(703, class06697::new);
      var0.addFixer(new class05824(schema21, true));
      Schema schema22 = var0.addSchema(704, class06714::new);
      var0.addFixer(new class05796(schema22, true));
      Schema schema23 = var0.addSchema(705, class06693::new);
      var0.addFixer(new class05789(schema23, true));
      Schema schema24 = var0.addSchema(804, L);
      var0.addFixer(new class07917(schema24, true));
      Schema schema25 = var0.addSchema(806, L);
      var0.addFixer(new class06606(schema25, false));
      Schema schema26 = var0.addSchema(808, class06694::new);
      var0.addFixer(new class05000(schema26, "added shulker box", class06962.G));
      Schema schema27 = var0.addSchema(808, 1, L);
      var0.addFixer(new class08110(schema27, false));
      Schema schema28 = var0.addSchema(813, L);
      var0.addFixer(new class07386(schema28, false));
      var0.addFixer(new class05788(schema28, false));
      Schema schema29 = var0.addSchema(816, L);
      var0.addFixer(new class06979(schema29, false));
      Schema schema30 = var0.addSchema(820, L);
      var0.addFixer(class07906.N(schema30, "totem item renamer", N("minecraft:totem", "minecraft:totem_of_undying")));
      Schema schema31 = var0.addSchema(1022, class06853::new);
      var0.addFixer(new class06749(schema31, "added shoulder entities to players", class06962.L));
      Schema schema32 = var0.addSchema(1125, class06827::new);
      var0.addFixer(new class05012(schema32, true));
      var0.addFixer(new class04996(schema32, false));
      Schema schema33 = var0.addSchema(1344, L);
      var0.addFixer(new class00445(schema33, false));
      Schema schema34 = var0.addSchema(1446, L);
      var0.addFixer(new class06958(schema34, false));
      Schema schema35 = var0.addSchema(1450, L);
      var0.addFixer(new class05811(schema35, false));
      Schema schema36 = var0.addSchema(1451, class07590::new);
      var0.addFixer(new class05000(schema36, "AddTrappedChestFix", class06962.G));
      Schema schema37 = var0.addSchema(1451, 1, class07598::new);
      var0.addFixer(new class05819(schema37, true));
      Schema schema38 = var0.addSchema(1451, 2, class07580::new);
      var0.addFixer(new class05797(schema38, true));
      Schema schema39 = var0.addSchema(1451, 3, class07608::new);
      var0.addFixer(new class05794(schema39, true));
      var0.addFixer(new class07399(schema39, false));
      Schema schema40 = var0.addSchema(1451, 4, class07596::new);
      var0.addFixer(new class05822(schema40, true));
      var0.addFixer(new class06612(schema40, false));
      Schema schema41 = var0.addSchema(1451, 5, class07573::new);
      var0.addFixer(new class03044(schema41, Set.of("minecraft:noteblock", "minecraft:flower_pot")));
      var0.addFixer(new class06629(schema41, false, "minecraft:spawn_egg"));
      var0.addFixer(new class00938(schema41, false));
      var0.addFixer(new class05020(schema41, false));
      var0.addFixer(new class00993(schema41, false));
      Schema schema42 = var0.addSchema(1451, 6, class06534::new);
      var0.addFixer(new class06757(schema42, true));
      var0.addFixer(new class05833(schema42, false));
      Schema schema43 = var0.addSchema(1451, 7, L);
      var0.addFixer(new class06717(schema43));
      Schema schema44 = var0.addSchema(1456, L);
      var0.addFixer(new class05784(schema44, false));
      Schema schema45 = var0.addSchema(1458, class08380::new);
      var0.addFixer(new class05814(schema45));
      var0.addFixer(new class07919(schema45));
      var0.addFixer(new class05832(schema45));
      Schema schema46 = var0.addSchema(1460, class06536::new);
      var0.addFixer(new class05802(schema46, false));
      Schema schema47 = var0.addSchema(1466, class06539::new);
      var0.addFixer(new class05000(schema47, "Add DUMMY block entity", class06962.G));
      var0.addFixer(new class05792(schema47, true));
      Schema schema48 = var0.addSchema(1470, class06544::new);
      var0.addFixer(new class05000(schema48, "Add 1.13 entities fix", class06962.o));
      Schema schema49 = var0.addSchema(1474, L);
      var0.addFixer(new class05793(schema49, false));
      var0.addFixer(
         class05799.N(
            schema49,
            "Colorless shulker block fixer",
            var0x -> Objects.equals(class00622.N(var0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : var0x
         )
      );
      var0.addFixer(
         class07906.N(
            schema49,
            "Colorless shulker item fixer",
            var0x -> Objects.equals(class00622.N(var0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : var0x
         )
      );
      Schema schema50 = var0.addSchema(1475, L);
      var0.addFixer(
         class05799.N(schema50, "Flowing fixer", y(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava")))
      );
      Schema schema51 = var0.addSchema(1480, L);
      var0.addFixer(class05799.N(schema51, "Rename coral blocks", y(class10878.N)));
      var0.addFixer(class07906.N(schema51, "Rename coral items", y(class10878.N)));
      Schema schema52 = var0.addSchema(1481, class06540::new);
      var0.addFixer(new class05000(schema52, "Add conduit", class06962.G));
      Schema schema53 = var0.addSchema(1483, class07860::new);
      var0.addFixer(new class05831(schema53, true));
      var0.addFixer(class07906.N(schema53, "Rename pufferfish egg item", y(class05831.N)));
      Schema schema54 = var0.addSchema(1484, L);
      var0.addFixer(
         class07906.N(
            schema54,
            "Rename seagrass items",
            y(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      var0.addFixer(
         class05799.N(
            schema54,
            "Rename seagrass blocks",
            y(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      var0.addFixer(new class07944(schema54, false));
      Schema schema55 = var0.addSchema(1486, class07859::new);
      var0.addFixer(new class05805(schema55, true));
      var0.addFixer(class07906.N(schema55, "Rename cod/salmon egg items", y(class05805.y)));
      Schema schema56 = var0.addSchema(1487, L);
      var0.addFixer(
         class07906.N(
            schema56,
            "Rename prismarine_brick(s)_* blocks",
            y(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      var0.addFixer(
         class05799.N(
            schema56,
            "Rename prismarine_brick(s)_* items",
            y(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      Schema schema57 = var0.addSchema(1488, class08344::new);
      var0.addFixer(
         class05799.N(schema57, "Rename kelp/kelptop", y(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant")))
      );
      var0.addFixer(class07906.N(schema57, "Rename kelptop", N("minecraft:kelp_top", "minecraft:kelp")));
      var0.addFixer(new class10482(schema57, true, "Command block block entity custom name fix", class06962.G, "minecraft:command_block"));
      var0.addFixer(new class05026(schema57, false));
      var0.addFixer(new class00934(schema57, false));
      Schema schema58 = var0.addSchema(1490, L);
      var0.addFixer(class05799.N(schema58, "Rename melon_block", N("minecraft:melon_block", "minecraft:melon")));
      var0.addFixer(
         class07906.N(
            schema58,
            "Rename melon_block/melon/speckled_melon",
            y(
               ImmutableMap.of(
                  "minecraft:melon_block",
                  "minecraft:melon",
                  "minecraft:melon",
                  "minecraft:melon_slice",
                  "minecraft:speckled_melon",
                  "minecraft:glistering_melon_slice"
               )
            )
         )
      );
      Schema schema59 = var0.addSchema(1492, L);
      var0.addFixer(new class05816(schema59, false));
      Schema schema60 = var0.addSchema(1494, L);
      var0.addFixer(new class07418(schema60, false));
      Schema schema61 = var0.addSchema(1496, L);
      var0.addFixer(new class06616(schema61, false));
      Schema schema62 = var0.addSchema(1500, L);
      var0.addFixer(new class05804(schema62, false));
      Schema schema63 = var0.addSchema(1501, L);
      var0.addFixer(new class04998(schema63, false));
      Schema schema64 = var0.addSchema(1502, L);
      var0.addFixer(new class03623(schema64, "Recipes fix", class06962.a, y(class10702.N)));
      Schema schema65 = var0.addSchema(1506, L);
      var0.addFixer(new class00989(schema65, false));
      Schema schema66 = var0.addSchema(1510, class07858::new);
      var0.addFixer(class05799.N(schema66, "Block renamening fix", y(class08102.y)));
      var0.addFixer(class07906.N(schema66, "Item renamening fix", y(class08102.L)));
      var0.addFixer(new class03623(schema66, "Recipes renamening fix", class06962.a, y(class10704.N)));
      var0.addFixer(new class08102(schema66, true));
      var0.addFixer(
         new class08176(
            schema66,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema schema67 = var0.addSchema(1514, L);
      var0.addFixer(new class08346(schema67, "ObjectiveDisplayNameFix", class06962.c));
      var0.addFixer(new class08346(schema67, "TeamDisplayNameFix", class06962.X));
      var0.addFixer(new class00446(schema67));
      Schema schema68 = var0.addSchema(1515, L);
      var0.addFixer(class05799.N(schema68, "Rename coral fan blocks", y(class10695.N)));
      Schema schema69 = var0.addSchema(1624, L);
      var0.addFixer(new class06726(schema69, false));
      Schema schema70 = var0.addSchema(1800, class06692::new);
      var0.addFixer(new class05000(schema70, "Added 1.14 mobs fix", class06962.o));
      var0.addFixer(class07906.N(schema70, "Rename dye items", y(class10537.N)));
      Schema schema71 = var0.addSchema(1801, class07857::new);
      var0.addFixer(new class05000(schema71, "Added Illager Beast", class06962.o));
      Schema schema72 = var0.addSchema(1802, L);
      var0.addFixer(
         class05799.N(
            schema72,
            "Rename sign blocks & stone slabs",
            y(
               ImmutableMap.of(
                  "minecraft:stone_slab",
                  "minecraft:smooth_stone_slab",
                  "minecraft:sign",
                  "minecraft:oak_sign",
                  "minecraft:wall_sign",
                  "minecraft:oak_wall_sign"
               )
            )
         )
      );
      var0.addFixer(
         class07906.N(
            schema72,
            "Rename sign item & stone slabs",
            y(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema schema73 = var0.addSchema(1803, L);
      var0.addFixer(new class07935(schema73));
      Schema schema74 = var0.addSchema(1904, class04665::new);
      var0.addFixer(new class05000(schema74, "Added Cats", class06962.o));
      var0.addFixer(new class06115(schema74, false));
      Schema schema75 = var0.addSchema(1905, L);
      var0.addFixer(new class05820(schema75, false));
      Schema schema76 = var0.addSchema(1906, class04679::new);
      var0.addFixer(new class05000(schema76, "Add POI Blocks", class06962.G));
      Schema schema77 = var0.addSchema(1909, class06126::new);
      var0.addFixer(new class05000(schema77, "Add jigsaw", class06962.G));
      Schema schema78 = var0.addSchema(1911, L);
      var0.addFixer(new class05278(schema78, false));
      Schema schema79 = var0.addSchema(1914, L);
      var0.addFixer(new class03524(schema79, false));
      Schema schema80 = var0.addSchema(1917, L);
      var0.addFixer(new class06242(schema80, false));
      Schema schema81 = var0.addSchema(1918, L);
      var0.addFixer(new class05653(schema81, "minecraft:villager"));
      var0.addFixer(new class05653(schema81, "minecraft:zombie_villager"));
      Schema schema82 = var0.addSchema(1920, class06236::new);
      var0.addFixer(new class06259(schema82, false));
      var0.addFixer(new class05000(schema82, "Add campfire", class06962.G));
      Schema schema83 = var0.addSchema(1925, L);
      var0.addFixer(new class06151(schema83));
      Schema schema84 = var0.addSchema(1928, class06181::new);
      var0.addFixer(new class06169(schema84, true));
      var0.addFixer(class07906.N(schema84, "Rename ravager egg item", y(class06169.N)));
      Schema schema85 = var0.addSchema(1929, class06173::new);
      var0.addFixer(new class05000(schema85, "Add Wandering Trader and Trader Llama", class06962.o));
      Schema schema86 = var0.addSchema(1931, class06175::new);
      var0.addFixer(new class05000(schema86, "Added Fox", class06962.o));
      Schema schema87 = var0.addSchema(1936, L);
      var0.addFixer(new class01288(schema87, false));
      Schema schema88 = var0.addSchema(1946, L);
      var0.addFixer(new class05719(schema88, false));
      Schema schema89 = var0.addSchema(1948, L);
      var0.addFixer(new class05694(schema89));
      Schema schema90 = var0.addSchema(1953, L);
      var0.addFixer(new class05689(schema90, false));
      Schema schema91 = var0.addSchema(1955, L);
      var0.addFixer(new class05701(schema91, false));
      var0.addFixer(new class05710(schema91, false));
      Schema schema92 = var0.addSchema(1961, L);
      var0.addFixer(new class04888(schema92, false));
      Schema schema93 = var0.addSchema(1963, L);
      var0.addFixer(new class01044(schema93, false));
      Schema schema94 = var0.addSchema(2100, class04634::new);
      var0.addFixer(new class05000(schema94, "Added Bee and Bee Stinger", class06962.o));
      var0.addFixer(new class05000(schema94, "Add beehive", class06962.G));
      var0.addFixer(new class03623(schema94, "Rename sugar recipe", class06962.a, N("minecraft:sugar", "minecraft:sugar_from_sugar_cane")));
      var0.addFixer(
         new class06000(schema94, false, "Rename sugar recipe advancement", N("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane"))
      );
      Schema schema95 = var0.addSchema(2202, L);
      var0.addFixer(new class05488(schema95, false));
      Schema schema96 = var0.addSchema(2209, L);
      UnaryOperator unaryoperator = N("minecraft:bee_hive", "minecraft:beehive");
      var0.addFixer(class07906.N(schema96, "Rename bee_hive item to beehive", unaryoperator));
      var0.addFixer(new class03963(schema96, "Rename bee_hive poi to beehive", unaryoperator));
      var0.addFixer(class05799.N(schema96, "Rename bee_hive block to beehive", unaryoperator));
      Schema schema97 = var0.addSchema(2211, L);
      var0.addFixer(new class05901(schema97, false));
      Schema schema98 = var0.addSchema(2218, L);
      var0.addFixer(new class05923(schema98, false));
      Schema schema99 = var0.addSchema(2501, class06023::new);
      var0.addFixer(new class06017(schema99, true));
      Schema schema100 = var0.addSchema(2502, class05999::new);
      var0.addFixer(new class05000(schema100, "Added Hoglin", class06962.o));
      Schema schema101 = var0.addSchema(2503, L);
      var0.addFixer(new class05996(schema101, false));
      var0.addFixer(
         new class06000(schema101, false, "Composter category change", N("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter"))
      );
      Schema schema102 = var0.addSchema(2505, class01496::new);
      var0.addFixer(new class05000(schema102, "Added Piglin", class06962.o));
      var0.addFixer(new class01501(schema102, "minecraft:villager"));
      Schema schema103 = var0.addSchema(2508, L);
      var0.addFixer(
         class07906.N(
            schema103,
            "Renamed fungi items to fungus",
            y(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      var0.addFixer(
         class05799.N(
            schema103,
            "Renamed fungi blocks to fungus",
            y(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema schema104 = var0.addSchema(2509, class04988::new);
      var0.addFixer(new class04955(schema104));
      var0.addFixer(class07906.N(schema104, "Rename zombie pigman egg item", y(class04955.N)));
      Schema schema105 = var0.addSchema(2511, L);
      var0.addFixer(new class04962(schema105));
      Schema schema106 = var0.addSchema(2511, 1, class08590::new);
      var0.addFixer(new class00234(schema106, "SplashPotionItemFieldRenameFix", class06962.o, "minecraft:potion"));
      Schema schema107 = var0.addSchema(2514, L);
      var0.addFixer(new class01367(schema107));
      var0.addFixer(new class01336(schema107));
      var0.addFixer(new class01349(schema107));
      var0.addFixer(new class01373(schema107));
      var0.addFixer(new class01357(schema107));
      var0.addFixer(new class01345(schema107));
      Schema schema108 = var0.addSchema(2516, L);
      var0.addFixer(new class01358(schema108, "minecraft:villager"));
      var0.addFixer(new class01358(schema108, "minecraft:zombie_villager"));
      Schema schema109 = var0.addSchema(2518, L);
      var0.addFixer(new class01353(schema109, false));
      var0.addFixer(new class01356(schema109));
      Schema schema110 = var0.addSchema(2519, class01370::new);
      var0.addFixer(new class05000(schema110, "Added Strider", class06962.o));
      Schema schema111 = var0.addSchema(2522, class05331::new);
      var0.addFixer(new class05000(schema111, "Added Zoglin", class06962.o));
      Schema schema112 = var0.addSchema(2523, L);
      var0.addFixer(
         new class05321(
            schema112,
            "Attribute renames",
            N(
               ImmutableMap.builder()
                  .put("generic.maxHealth", "minecraft:generic.max_health")
                  .put("Max Health", "minecraft:generic.max_health")
                  .put("zombie.spawnReinforcements", "minecraft:zombie.spawn_reinforcements")
                  .put("Spawn Reinforcements Chance", "minecraft:zombie.spawn_reinforcements")
                  .put("horse.jumpStrength", "minecraft:horse.jump_strength")
                  .put("Jump Strength", "minecraft:horse.jump_strength")
                  .put("generic.followRange", "minecraft:generic.follow_range")
                  .put("Follow Range", "minecraft:generic.follow_range")
                  .put("generic.knockbackResistance", "minecraft:generic.knockback_resistance")
                  .put("Knockback Resistance", "minecraft:generic.knockback_resistance")
                  .put("generic.movementSpeed", "minecraft:generic.movement_speed")
                  .put("Movement Speed", "minecraft:generic.movement_speed")
                  .put("generic.flyingSpeed", "minecraft:generic.flying_speed")
                  .put("Flying Speed", "minecraft:generic.flying_speed")
                  .put("generic.attackDamage", "minecraft:generic.attack_damage")
                  .put("generic.attackKnockback", "minecraft:generic.attack_knockback")
                  .put("generic.attackSpeed", "minecraft:generic.attack_speed")
                  .put("generic.armorToughness", "minecraft:generic.armor_toughness")
                  .build()
            )
         )
      );
      Schema schema113 = var0.addSchema(2527, L);
      var0.addFixer(new class05067(schema113));
      Schema schema114 = var0.addSchema(2528, L);
      var0.addFixer(
         class07906.N(
            schema114,
            "Rename soul fire torch and soul fire lantern",
            y(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      var0.addFixer(
         class05799.N(
            schema114,
            "Rename soul fire torch and soul fire lantern",
            y(
               ImmutableMap.of(
                  "minecraft:soul_fire_torch",
                  "minecraft:soul_torch",
                  "minecraft:soul_fire_wall_torch",
                  "minecraft:soul_wall_torch",
                  "minecraft:soul_fire_lantern",
                  "minecraft:soul_lantern"
               )
            )
         )
      );
      Schema schema115 = var0.addSchema(2529, L);
      var0.addFixer(new class05225(schema115, false));
      Schema schema116 = var0.addSchema(2531, L);
      var0.addFixer(new class05223(schema116));
      Schema schema117 = var0.addSchema(2533, L);
      var0.addFixer(new class05224(schema117));
      Schema schema118 = var0.addSchema(2535, L);
      var0.addFixer(new class05215(schema118));
      Schema schema119 = var0.addSchema(2537, L);
      var0.addFixer(new class08304(schema119));
      Schema schema120 = var0.addSchema(2538, L);
      var0.addFixer(new class01730(schema120));
      Schema schema121 = var0.addSchema(2550, L);
      var0.addFixer(new class05972(schema121));
      Schema schema122 = var0.addSchema(2551, class05963::new);
      var0.addFixer(new class06749(schema122, "add types to WorldGenData", class06962.A));
      Schema schema123 = var0.addSchema(2552, L);
      var0.addFixer(new class03623(schema123, "Nether biome rename", class06962.p, N("minecraft:nether", "minecraft:nether_wastes")));
      Schema schema124 = var0.addSchema(2553, L);
      var0.addFixer(new class03623(schema124, "Biomes fix", class06962.p, y(class10483.N)));
      Schema schema125 = var0.addSchema(2556, L);
      var0.addFixer(new class08191(schema125));
      Schema schema126 = var0.addSchema(2558, L);
      var0.addFixer(new class01259(schema126, false));
      var0.addFixer(new class01245(schema126, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema schema127 = var0.addSchema(2568, class01275::new);
      var0.addFixer(new class05000(schema127, "Added Piglin Brute", class06962.o));
      Schema schema128 = var0.addSchema(2571, class10438::new);
      var0.addFixer(new class05000(schema128, "Added Goat", class06962.o));
      Schema schema129 = var0.addSchema(2679, L);
      var0.addFixer(new class05466(schema129, false));
      Schema schema130 = var0.addSchema(2680, L);
      var0.addFixer(class07906.N(schema130, "Renamed grass path item to dirt path", N("minecraft:grass_path", "minecraft:dirt_path")));
      var0.addFixer(class05799.N(schema130, "Renamed grass path block to dirt path", N("minecraft:grass_path", "minecraft:dirt_path")));
      Schema schema131 = var0.addSchema(2684, class06377::new);
      var0.addFixer(new class05000(schema131, "Added Sculk Sensor", class06962.G));
      Schema schema132 = var0.addSchema(2686, class01186::new);
      var0.addFixer(new class05000(schema132, "Added Axolotl", class06962.o));
      Schema schema133 = var0.addSchema(2688, class05582::new);
      var0.addFixer(new class05000(schema133, "Added Glow Squid", class06962.o));
      var0.addFixer(new class05000(schema133, "Added Glow Item Frame", class06962.o));
      Schema schema134 = var0.addSchema(2690, L);
      ImmutableMap immutablemap = ImmutableMap.builder()
         .put("minecraft:weathered_copper_block", "minecraft:oxidized_copper_block")
         .put("minecraft:semi_weathered_copper_block", "minecraft:weathered_copper_block")
         .put("minecraft:lightly_weathered_copper_block", "minecraft:exposed_copper_block")
         .put("minecraft:weathered_cut_copper", "minecraft:oxidized_cut_copper")
         .put("minecraft:semi_weathered_cut_copper", "minecraft:weathered_cut_copper")
         .put("minecraft:lightly_weathered_cut_copper", "minecraft:exposed_cut_copper")
         .put("minecraft:weathered_cut_copper_stairs", "minecraft:oxidized_cut_copper_stairs")
         .put("minecraft:semi_weathered_cut_copper_stairs", "minecraft:weathered_cut_copper_stairs")
         .put("minecraft:lightly_weathered_cut_copper_stairs", "minecraft:exposed_cut_copper_stairs")
         .put("minecraft:weathered_cut_copper_slab", "minecraft:oxidized_cut_copper_slab")
         .put("minecraft:semi_weathered_cut_copper_slab", "minecraft:weathered_cut_copper_slab")
         .put("minecraft:lightly_weathered_cut_copper_slab", "minecraft:exposed_cut_copper_slab")
         .put("minecraft:waxed_semi_weathered_copper", "minecraft:waxed_weathered_copper")
         .put("minecraft:waxed_lightly_weathered_copper", "minecraft:waxed_exposed_copper")
         .put("minecraft:waxed_semi_weathered_cut_copper", "minecraft:waxed_weathered_cut_copper")
         .put("minecraft:waxed_lightly_weathered_cut_copper", "minecraft:waxed_exposed_cut_copper")
         .put("minecraft:waxed_semi_weathered_cut_copper_stairs", "minecraft:waxed_weathered_cut_copper_stairs")
         .put("minecraft:waxed_lightly_weathered_cut_copper_stairs", "minecraft:waxed_exposed_cut_copper_stairs")
         .put("minecraft:waxed_semi_weathered_cut_copper_slab", "minecraft:waxed_weathered_cut_copper_slab")
         .put("minecraft:waxed_lightly_weathered_cut_copper_slab", "minecraft:waxed_exposed_cut_copper_slab")
         .build();
      var0.addFixer(class07906.N(schema134, "Renamed copper block items to new oxidized terms", y(immutablemap)));
      var0.addFixer(class05799.N(schema134, "Renamed copper blocks to new oxidized terms", y(immutablemap)));
      Schema schema135 = var0.addSchema(2691, L);
      ImmutableMap immutablemap1 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      var0.addFixer(class07906.N(schema135, "Rename copper item suffixes", y(immutablemap1)));
      var0.addFixer(class05799.N(schema135, "Rename copper blocks suffixes", y(immutablemap1)));
      Schema schema136 = var0.addSchema(2693, L);
      var0.addFixer(new class03306(schema136, class06962.A, "has_increased_height_already", false));
      Schema schema137 = var0.addSchema(2696, L);
      ImmutableMap immutablemap2 = ImmutableMap.builder()
         .put("minecraft:grimstone", "minecraft:deepslate")
         .put("minecraft:grimstone_slab", "minecraft:cobbled_deepslate_slab")
         .put("minecraft:grimstone_stairs", "minecraft:cobbled_deepslate_stairs")
         .put("minecraft:grimstone_wall", "minecraft:cobbled_deepslate_wall")
         .put("minecraft:polished_grimstone", "minecraft:polished_deepslate")
         .put("minecraft:polished_grimstone_slab", "minecraft:polished_deepslate_slab")
         .put("minecraft:polished_grimstone_stairs", "minecraft:polished_deepslate_stairs")
         .put("minecraft:polished_grimstone_wall", "minecraft:polished_deepslate_wall")
         .put("minecraft:grimstone_tiles", "minecraft:deepslate_tiles")
         .put("minecraft:grimstone_tile_slab", "minecraft:deepslate_tile_slab")
         .put("minecraft:grimstone_tile_stairs", "minecraft:deepslate_tile_stairs")
         .put("minecraft:grimstone_tile_wall", "minecraft:deepslate_tile_wall")
         .put("minecraft:grimstone_bricks", "minecraft:deepslate_bricks")
         .put("minecraft:grimstone_brick_slab", "minecraft:deepslate_brick_slab")
         .put("minecraft:grimstone_brick_stairs", "minecraft:deepslate_brick_stairs")
         .put("minecraft:grimstone_brick_wall", "minecraft:deepslate_brick_wall")
         .put("minecraft:chiseled_grimstone", "minecraft:chiseled_deepslate")
         .build();
      var0.addFixer(class07906.N(schema137, "Renamed grimstone block items to deepslate", y(immutablemap2)));
      var0.addFixer(class05799.N(schema137, "Renamed grimstone blocks to deepslate", y(immutablemap2)));
      Schema schema138 = var0.addSchema(2700, L);
      var0.addFixer(
         class05799.N(
            schema138,
            "Renamed cave vines blocks",
            y(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema schema139 = var0.addSchema(2701, L);
      var0.addFixer(new class02772(schema139));
      Schema schema140 = var0.addSchema(2702, L);
      var0.addFixer(new class02667(schema140));
      Schema schema141 = var0.addSchema(2704, class10432::new);
      var0.addFixer(new class05000(schema141, "Added Goat", class06962.o));
      Schema schema142 = var0.addSchema(2707, class01692::new);
      var0.addFixer(new class05000(schema142, "Added Marker", class06962.o));
      var0.addFixer(new class03306(schema142, class06962.A, "has_increased_height_already", true));
      Schema schema143 = var0.addSchema(2710, L);
      var0.addFixer(new class08176(schema143, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema schema144 = var0.addSchema(2717, L);
      var0.addFixer(
         class07906.N(schema144, "Rename azalea_leaves_flowers", y(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      var0.addFixer(
         class05799.N(
            schema144, "Rename azalea_leaves_flowers items", y(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))
         )
      );
      Schema schema145 = var0.addSchema(2825, L);
      var0.addFixer(new class03306(schema145, class06962.A, "has_increased_height_already", false));
      Schema schema146 = var0.addSchema(2831, class03233::new);
      var0.addFixer(new class03206(schema146));
      Schema schema147 = var0.addSchema(2832, class03310::new);
      var0.addFixer(new class03290(schema147));
      var0.addFixer(new class03316(schema147));
      Schema schema148 = var0.addSchema(2833, L);
      var0.addFixer(new class03293(schema148));
      Schema schema149 = var0.addSchema(2838, L);
      var0.addFixer(new class03623(schema149, "Caves and Cliffs biome renames", class06962.p, y(class04045.N)));
      Schema schema150 = var0.addSchema(2841, L);
      var0.addFixer(new class03018(schema150));
      Schema schema151 = var0.addSchema(2842, class03004::new);
      var0.addFixer(new class03031(schema151));
      Schema schema152 = var0.addSchema(2843, L);
      var0.addFixer(new class03517(schema152));
      var0.addFixer(new class03623(schema152, "Remove Deep Warm Ocean", class06962.p, N("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema schema153 = var0.addSchema(2846, L);
      var0.addFixer(
         new class06000(
            schema153,
            false,
            "Rename some C&C part 2 advancements",
            y(
               ImmutableMap.of(
                  "minecraft:husbandry/play_jukebox_in_meadows",
                  "minecraft:adventure/play_jukebox_in_meadows",
                  "minecraft:adventure/caves_and_cliff",
                  "minecraft:adventure/fall_from_world_height",
                  "minecraft:adventure/ride_strider_in_overworld_lava",
                  "minecraft:nether/ride_strider_in_overworld_lava"
               )
            )
         )
      );
      Schema schema154 = var0.addSchema(2852, L);
      var0.addFixer(new class03293(schema154));
      Schema schema155 = var0.addSchema(2967, L);
      var0.addFixer(new class03536(schema155));
      Schema schema156 = var0.addSchema(2970, L);
      var0.addFixer(new class04415(schema156));
      Schema schema157 = var0.addSchema(3076, class04394::new);
      var0.addFixer(new class05000(schema157, "Added Sculk Catalyst", class06962.G));
      Schema schema158 = var0.addSchema(3077, L);
      var0.addFixer(new class04399(schema158));
      Schema schema159 = var0.addSchema(3078, class04422::new);
      var0.addFixer(new class05000(schema159, "Added Frog", class06962.o));
      var0.addFixer(new class05000(schema159, "Added Tadpole", class06962.o));
      var0.addFixer(new class05000(schema159, "Added Sculk Shrieker", class06962.G));
      Schema schema160 = var0.addSchema(3081, class03985::new);
      var0.addFixer(new class05000(schema160, "Added Warden", class06962.o));
      Schema schema161 = var0.addSchema(3082, class03980::new);
      var0.addFixer(new class05000(schema161, "Added Chest Boat", class06962.o));
      Schema schema162 = var0.addSchema(3083, class03615::new);
      var0.addFixer(new class05000(schema162, "Added Allay", class06962.o));
      Schema schema163 = var0.addSchema(3084, L);
      var0.addFixer(
         new class03623(
            schema163,
            "game_event_renames_3084",
            class06962.V,
            y(
               ImmutableMap.builder()
                  .put("minecraft:block_press", "minecraft:block_activate")
                  .put("minecraft:block_switch", "minecraft:block_activate")
                  .put("minecraft:block_unpress", "minecraft:block_deactivate")
                  .put("minecraft:block_unswitch", "minecraft:block_deactivate")
                  .put("minecraft:drinking_finish", "minecraft:drink")
                  .put("minecraft:elytra_free_fall", "minecraft:elytra_glide")
                  .put("minecraft:entity_damaged", "minecraft:entity_damage")
                  .put("minecraft:entity_dying", "minecraft:entity_die")
                  .put("minecraft:entity_killed", "minecraft:entity_die")
                  .put("minecraft:mob_interact", "minecraft:entity_interact")
                  .put("minecraft:ravager_roar", "minecraft:entity_roar")
                  .put("minecraft:ring_bell", "minecraft:block_change")
                  .put("minecraft:shulker_close", "minecraft:container_close")
                  .put("minecraft:shulker_open", "minecraft:container_open")
                  .put("minecraft:wolf_shaking", "minecraft:entity_shake")
                  .build()
            )
         )
      );
      Schema schema164 = var0.addSchema(3086, L);
      var0.addFixer(
         new class03641(schema164, "Change cat variant type", class06962.o, "minecraft:cat", "CatType", class07536.N(new Int2ObjectOpenHashMap(), var0x -> {
            var0x.defaultReturnValue("minecraft:tabby");
            var0x.put(0, "minecraft:tabby");
            var0x.put(1, "minecraft:black");
            var0x.put(2, "minecraft:red");
            var0x.put(3, "minecraft:siamese");
            var0x.put(4, "minecraft:british");
            var0x.put(5, "minecraft:calico");
            var0x.put(6, "minecraft:persian");
            var0x.put(7, "minecraft:ragdoll");
            var0x.put(8, "minecraft:white");
            var0x.put(9, "minecraft:jellie");
            var0x.put(10, "minecraft:all_black");
         })::get)
      );
      ImmutableMap immutablemap3 = ImmutableMap.builder()
         .put("textures/entity/cat/tabby.png", "minecraft:tabby")
         .put("textures/entity/cat/black.png", "minecraft:black")
         .put("textures/entity/cat/red.png", "minecraft:red")
         .put("textures/entity/cat/siamese.png", "minecraft:siamese")
         .put("textures/entity/cat/british_shorthair.png", "minecraft:british")
         .put("textures/entity/cat/calico.png", "minecraft:calico")
         .put("textures/entity/cat/persian.png", "minecraft:persian")
         .put("textures/entity/cat/ragdoll.png", "minecraft:ragdoll")
         .put("textures/entity/cat/white.png", "minecraft:white")
         .put("textures/entity/cat/jellie.png", "minecraft:jellie")
         .put("textures/entity/cat/all_black.png", "minecraft:all_black")
         .build();
      var0.addFixer(
         new class03625(
            schema164, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", var1x -> (String)immutablemap3.getOrDefault(var1x, var1x)
         )
      );
      Schema schema165 = var0.addSchema(3087, L);
      var0.addFixer(
         new class03641(schema165, "Change frog variant type", class06962.o, "minecraft:frog", "Variant", class07536.N(new Int2ObjectOpenHashMap(), var0x -> {
            var0x.put(0, "minecraft:temperate");
            var0x.put(1, "minecraft:warm");
            var0x.put(2, "minecraft:cold");
         })::get)
      );
      Schema schema166 = var0.addSchema(3090, L);
      var0.addFixer(new class00314(schema166, "EntityPaintingFieldsRenameFix", "minecraft:painting", Map.of("Motive", "variant", "Facing", "facing")));
      Schema schema167 = var0.addSchema(3093, L);
      var0.addFixer(new class03955(schema167));
      Schema schema168 = var0.addSchema(3094, L);
      var0.addFixer(new class04451(schema168));
      Schema schema169 = var0.addSchema(3097, L);
      var0.addFixer(new class03960(schema169));
      var0.addFixer(new class03921(schema169));
      Map map = Map.of("minecraft:british", "minecraft:british_shorthair");
      var0.addFixer(new class03951(schema169, "Rename british shorthair", class06962.o, "minecraft:cat", map));
      var0.addFixer(
         new class03625(
            schema169,
            "Migrate cat variant advancement for british shorthair",
            "minecraft:husbandry/complete_catalogue",
            var1x -> map.getOrDefault(var1x, var1x)
         )
      );
      var0.addFixer(new class03944(schema169, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema schema170 = var0.addSchema(3108, L);
      var0.addFixer(new class03085(schema170));
      Schema schema171 = var0.addSchema(3201, L);
      var0.addFixer(new class02987(schema171));
      Schema schema172 = var0.addSchema(3202, class02988::new);
      var0.addFixer(new class05000(schema172, "Added Hanging Sign", class06962.G));
      Schema schema173 = var0.addSchema(3203, class02964::new);
      var0.addFixer(new class05000(schema173, "Added Camel", class06962.o));
      Schema schema174 = var0.addSchema(3204, class02972::new);
      var0.addFixer(new class05000(schema174, "Added Chiseled Bookshelf", class06962.G));
      Schema schema175 = var0.addSchema(3209, L);
      var0.addFixer(new class06629(schema175, false, "minecraft:pig_spawn_egg"));
      Schema schema176 = var0.addSchema(3214, L);
      var0.addFixer(new class02107(schema176));
      Schema schema177 = var0.addSchema(3319, L);
      var0.addFixer(new class02092(schema177));
      Schema schema178 = var0.addSchema(3322, L);
      var0.addFixer(new class03239(schema178));
      Schema schema179 = var0.addSchema(3325, class03687::new);
      var0.addFixer(new class05000(schema179, "Added displays", class06962.o));
      Schema schema180 = var0.addSchema(3326, class01988::new);
      var0.addFixer(new class05000(schema180, "Added Sniffer", class06962.o));
      Schema schema181 = var0.addSchema(3327, class01957::new);
      var0.addFixer(new class05000(schema181, "Archaeology", class06962.G));
      Schema schema182 = var0.addSchema(3328, class01941::new);
      var0.addFixer(new class05000(schema182, "Added interaction", class06962.o));
      Schema schema183 = var0.addSchema(3438, class03603::new);
      var0.addFixer(class03593.N(schema183, "Rename Suspicious Sand to Brushable Block", N("minecraft:suspicious_sand", "minecraft:brushable_block")));
      var0.addFixer(new class03570(schema183));
      var0.addFixer(
         class07906.N(
            schema183,
            "Pottery shard renaming",
            y(
               ImmutableMap.of(
                  "minecraft:pottery_shard_archer",
                  "minecraft:archer_pottery_shard",
                  "minecraft:pottery_shard_prize",
                  "minecraft:prize_pottery_shard",
                  "minecraft:pottery_shard_arms_up",
                  "minecraft:arms_up_pottery_shard",
                  "minecraft:pottery_shard_skull",
                  "minecraft:skull_pottery_shard"
               )
            )
         )
      );
      var0.addFixer(new class05000(schema183, "Added calibrated sculk sensor", class06962.G));
      Schema schema184 = var0.addSchema(3439, class08339::new);
      var0.addFixer(new class03569(schema184, "Updated sign text format for Signs", "minecraft:sign"));
      Schema schema185 = var0.addSchema(3439, 1, class00006::new);
      var0.addFixer(new class03569(schema185, "Updated sign text format for Hanging Signs", "minecraft:hanging_sign"));
      Schema schema186 = var0.addSchema(3440, L);
      var0.addFixer(new class03623(schema186, "Replace experimental 1.20 overworld", class06962.F, N("minecraft:overworld_update_1_20", "minecraft:overworld")));
      var0.addFixer(new class03601(schema186, "Remove 1.20 feature toggle", Set.of("minecraft:update_1_20")));
      Schema schema187 = var0.addSchema(3447, L);
      var0.addFixer(
         class07906.N(
            schema187,
            "Pottery shard item renaming to Pottery sherd",
            y(
               Stream.of(
                     "minecraft:angler_pottery_shard",
                     "minecraft:archer_pottery_shard",
                     "minecraft:arms_up_pottery_shard",
                     "minecraft:blade_pottery_shard",
                     "minecraft:brewer_pottery_shard",
                     "minecraft:burn_pottery_shard",
                     "minecraft:danger_pottery_shard",
                     "minecraft:explorer_pottery_shard",
                     "minecraft:friend_pottery_shard",
                     "minecraft:heart_pottery_shard",
                     "minecraft:heartbreak_pottery_shard",
                     "minecraft:howl_pottery_shard",
                     "minecraft:miner_pottery_shard",
                     "minecraft:mourner_pottery_shard",
                     "minecraft:plenty_pottery_shard",
                     "minecraft:prize_pottery_shard",
                     "minecraft:sheaf_pottery_shard",
                     "minecraft:shelter_pottery_shard",
                     "minecraft:skull_pottery_shard",
                     "minecraft:snort_pottery_shard"
                  )
                  .collect(Collectors.toMap(Function.identity(), var0x -> var0x.replace("_pottery_shard", "_pottery_sherd")))
            )
         )
      );
      Schema schema188 = var0.addSchema(3448, class03486::new);
      var0.addFixer(new class03491(schema188));
      Schema schema189 = var0.addSchema(3450, L);
      var0.addFixer(
         new class03513(
            schema189,
            "Remove liquid_carvers and heightmap chunk statuses",
            y(Map.of("minecraft:liquid_carvers", "minecraft:carvers", "minecraft:heightmaps", "minecraft:spawn"))
         )
      );
      Schema schema190 = var0.addSchema(3451, L);
      var0.addFixer(new class03500(schema190));
      Schema schema191 = var0.addSchema(3459, L);
      var0.addFixer(new class04165(schema191));
      Schema schema192 = var0.addSchema(3564, L);
      var0.addFixer(new class01856(schema192, "minecraft:sign"));
      Schema schema193 = var0.addSchema(3564, 1, L);
      var0.addFixer(new class01856(schema193, "minecraft:hanging_sign"));
      Schema schema194 = var0.addSchema(3565, L);
      var0.addFixer(new class01889(schema194));
      Schema schema195 = var0.addSchema(3566, L);
      var0.addFixer(new class01877(schema195));
      Schema schema196 = var0.addSchema(3568, L);
      var0.addFixer(new class01633(schema196));
      Schema schema197 = var0.addSchema(3682, class01715::new);
      var0.addFixer(new class05000(schema197, "Added Crafter", class06962.G));
      Schema schema198 = var0.addSchema(3683, class01738::new);
      var0.addFixer(new class01746(schema198));
      Schema schema199 = var0.addSchema(3685, class03105::new);
      var0.addFixer(new class03113(schema199));
      Schema schema200 = var0.addSchema(3689, class04515::new);
      var0.addFixer(new class05000(schema200, "Added Breeze", class06962.o));
      var0.addFixer(new class05000(schema200, "Added Trial Spawner", class06962.G));
      Schema schema201 = var0.addSchema(3692, L);
      UnaryOperator unaryoperator1 = y(Map.of("minecraft:grass", "minecraft:short_grass"));
      var0.addFixer(class05799.N(schema201, "Rename grass block to short_grass", unaryoperator1));
      var0.addFixer(class07906.N(schema201, "Rename grass item to short_grass", unaryoperator1));
      Schema schema202 = var0.addSchema(3799, class03815::new);
      var0.addFixer(new class05000(schema202, "Added Armadillo", class06962.o));
      Schema schema203 = var0.addSchema(3800, L);
      UnaryOperator unaryoperator2 = y(Map.of("minecraft:scute", "minecraft:turtle_scute"));
      var0.addFixer(class07906.N(schema203, "Rename scute item to turtle_scute", unaryoperator2));
      Schema schema204 = var0.addSchema(3803, L);
      var0.addFixer(new class04260(schema204, "Rename sweeping enchant to sweeping_edge", Map.of("minecraft:sweeping", "minecraft:sweeping_edge")));
      Schema schema205 = var0.addSchema(3807, class02863::new);
      var0.addFixer(new class05000(schema205, "Added Vault", class06962.G));
      Schema schema206 = var0.addSchema(3807, 1, L);
      var0.addFixer(new class02286(schema206));
      Schema schema207 = var0.addSchema(3808, class02886::new);
      var0.addFixer(new class02899(schema207, "minecraft:horse", "ArmorItem", true));
      Schema schema208 = var0.addSchema(3808, 1, class02894::new);
      var0.addFixer(new class02899(schema208, "minecraft:llama", "DecorItem", false));
      Schema schema209 = var0.addSchema(3808, 2, class02924::new);
      var0.addFixer(new class02899(schema209, "minecraft:trader_llama", "DecorItem", false));
      Schema schema210 = var0.addSchema(3809, L);
      var0.addFixer(new class02873(schema210));
      Schema schema211 = var0.addSchema(3812, L);
      var0.addFixer(new class02280(schema211));
      Schema schema212 = var0.addSchema(3813, class08370::new);
      var0.addFixer(new class02266(schema212));
      Schema schema213 = var0.addSchema(3814, L);
      var0.addFixer(new class05321(schema213, "Rename jump strength attribute", N("minecraft:horse.jump_strength", "minecraft:generic.jump_strength")));
      Schema schema214 = var0.addSchema(3816, class02851::new);
      var0.addFixer(new class05000(schema214, "Added Bogged", class06962.o));
      Schema schema215 = var0.addSchema(3818, class02852::new);
      var0.addFixer(new class02843(schema215));
      var0.addFixer(new class02821(schema215));
      Schema schema216 = var0.addSchema(3818, 1, L);
      var0.addFixer(new class02828(schema216));
      Schema schema217 = var0.addSchema(3818, 2, L);
      var0.addFixer(new class02832(schema217));
      Schema schema218 = var0.addSchema(3818, 3, class02844::new);
      var0.addFixer(new class06749(schema218, "Inject data component types", class06962.k));
      Schema schema219 = var0.addSchema(3818, 4, class02850::new);
      var0.addFixer(new class02951(schema219));
      Schema schema220 = var0.addSchema(3818, 5, class02912::new);
      var0.addFixer(new class02849(schema220));
      Schema schema221 = var0.addSchema(3818, 6, L);
      var0.addFixer(new class02810(schema221));
      Schema schema222 = var0.addSchema(3820, L);
      var0.addFixer(new class02493(schema222));
      var0.addFixer(new class02486(schema222));
      Schema schema223 = var0.addSchema(3825, class02184::new);
      var0.addFixer(new class02166(schema223));
      var0.addFixer(new class02193(schema223));
      var0.addFixer(new class02161(schema223));
      var0.addFixer(new class05000(schema223, "Added Ominous Item Spawner", class06962.o));
      Schema schema224 = var0.addSchema(3828, L);
      var0.addFixer(new class02658(schema224));
      Schema schema225 = var0.addSchema(3833, L);
      var0.addFixer(new class02929(schema225));
      Schema schema226 = var0.addSchema(3938, class02906::new);
      var0.addFixer(new class02927(schema226));
      Schema schema227 = var0.addSchema(3939, L);
      var0.addFixer(new class03601(schema227, "Remove 1.21 feature toggle", Set.of("minecraft:update_1_21")));
      Schema schema228 = var0.addSchema(3943, L);
      var0.addFixer(new class02218(schema228));
      Schema schema229 = var0.addSchema(3945, L);
      var0.addFixer(new class02210(schema229));
      var0.addFixer(new class02229(schema229));
      Schema schema230 = var0.addSchema(4054, L);
      var0.addFixer(new class02606(schema230));
      Schema schema231 = var0.addSchema(4055, L);
      var0.addFixer(new class02612(schema231));
      Schema schema232 = var0.addSchema(4057, L);
      var0.addFixer(new class02597(schema232));
      Schema schema233 = var0.addSchema(4059, class08274::new);
      var0.addFixer(new class08286(schema233));
      Schema schema234 = var0.addSchema(4061, L);
      var0.addFixer(new class08223(schema234));
      Schema schema235 = var0.addSchema(4064, L);
      var0.addFixer(new class08708(schema235));
      Schema schema236 = var0.addSchema(4067, class00270::new);
      var0.addFixer(new class00254(schema236));
      var0.addFixer(new class03601(schema236, "Remove Bundle experimental feature flag", Set.of("minecraft:bundle")));
      Schema schema237 = var0.addSchema(4068, L);
      var0.addFixer(new class00255(schema237));
      var0.addFixer(new class00241(schema237));
      Schema schema238 = var0.addSchema(4070, class00264::new);
      var0.addFixer(new class05000(schema238, "Added Pale Oak Boat and Pale Oak Chest Boat", class06962.o));
      Schema schema239 = var0.addSchema(4071, class00244::new);
      var0.addFixer(new class05000(schema239, "Added Creaking", class06962.o));
      var0.addFixer(new class05000(schema239, "Added Creaking Heart", class06962.G));
      Schema schema240 = var0.addSchema(4081, L);
      var0.addFixer(new class00300(schema240));
      Schema schema241 = var0.addSchema(4173, L);
      var0.addFixer(new class00314(schema241, "Rename TNT Minecart fuse", "minecraft:tnt_minecart", Map.of("TNTFuse", "fuse")));
      Schema schema242 = var0.addSchema(4175, L);
      var0.addFixer(new class08826(schema242));
      var0.addFixer(new class08807(schema242));
      Schema schema243 = var0.addSchema(4176, L);
      var0.addFixer(new class08847(schema243));
      var0.addFixer(new class08822(schema243));
      Schema schema244 = var0.addSchema(4180, L);
      var0.addFixer(new class03601(schema244, "Remove Winter Drop toggle", Set.of("minecraft:winter_drop")));
      Schema schema245 = var0.addSchema(4181, L);
      var0.addFixer(new class08353(schema245, "minecraft:furnace"));
      var0.addFixer(new class08353(schema245, "minecraft:smoker"));
      var0.addFixer(new class08353(schema245, "minecraft:blast_furnace"));
      Schema schema246 = var0.addSchema(4187, L);
      var0.addFixer(
         new class08371(schema246, "Villager follow range fix undo", "minecraft:villager", "minecraft:follow_range", var0x -> var0x == 48.0 ? 16.0 : var0x)
      );
      var0.addFixer(new class08371(schema246, "Bee follow range fix", "minecraft:bee", "minecraft:follow_range", var0x -> var0x == 48.0 ? 16.0 : var0x));
      var0.addFixer(new class08371(schema246, "Allay follow range fix", "minecraft:allay", "minecraft:follow_range", var0x -> var0x == 48.0 ? 16.0 : var0x));
      var0.addFixer(new class08371(schema246, "Llama follow range fix", "minecraft:llama", "minecraft:follow_range", var0x -> var0x == 40.0 ? 16.0 : var0x));
      var0.addFixer(
         new class08371(schema246, "Piglin Brute follow range fix", "minecraft:piglin_brute", "minecraft:follow_range", var0x -> var0x == 16.0 ? 12.0 : var0x)
      );
      var0.addFixer(new class08371(schema246, "Warden follow range fix", "minecraft:warden", "minecraft:follow_range", var0x -> var0x == 16.0 ? 24.0 : var0x));
      Schema schema247 = var0.addSchema(4290, class08341::new);
      var0.addFixer(new class08365(schema247));
      Schema schema248 = var0.addSchema(4291, L);
      var0.addFixer(new class08369(schema248));
      var0.addFixer(new class08362(schema248));
      Schema schema249 = var0.addSchema(4292, class08357::new);
      var0.addFixer(new class08367(schema249));
      Schema schema250 = var0.addSchema(4293, L);
      var0.addFixer(new class08381(schema250));
      Schema schema251 = var0.addSchema(4294, L);
      var0.addFixer(
         new class08379(
            schema251,
            "CreakingHeartBlockStateFix",
            "minecraft:creaking_heart",
            "active",
            "creaking_heart_state",
            var0x -> var0x.equals("true") ? "awake" : "uprooted"
         )
      );
      Schema schema252 = var0.addSchema(4295, L);
      var0.addFixer(new class04431(schema252));
      Schema schema253 = var0.addSchema(4296, L);
      var0.addFixer(new class08348(schema253));
      Schema schema254 = var0.addSchema(4297, L);
      var0.addFixer(new class08349(schema254));
      Schema schema255 = var0.addSchema(4299, L);
      var0.addFixer(new class08600(schema255));
      Schema schema256 = var0.addSchema(4300, class08602::new);
      var0.addFixer(new class08634(schema256));
      Schema schema257 = var0.addSchema(4301, class08613::new);
      var0.addFixer(new class08632(schema257));
      Schema schema258 = var0.addSchema(4302, class08622::new);
      var0.addFixer(new class05000(schema258, "Added Test and Test Instance Block Entities", class06962.G));
      Schema schema259 = var0.addSchema(4303, L);
      var0.addFixer(new class08624(schema259, class06962.o));
      var0.addFixer(new class08624(schema259, class06962.L));
      Schema schema260 = var0.addSchema(4305, L);
      var0.addFixer(new class08379(schema260, "rename test block mode", "minecraft:test_block", "test_block_mode", "mode", var0x -> var0x));
      Schema schema261 = var0.addSchema(4306, class08552::new);
      var0.addFixer(new class00218(schema261));
      Schema schema262 = var0.addSchema(4307, class08586::new);
      var0.addFixer(new class08554(schema262));
      Schema schema263 = var0.addSchema(4309, L);
      var0.addFixer(new class08573(schema263));
      var0.addFixer(new class08412(schema263));
      Schema schema264 = var0.addSchema(4311, L);
      var0.addFixer(new class06000(schema264, false, "Use lodestone category change", N("minecraft:nether/use_lodestone", "minecraft:adventure/use_lodestone")));
      Schema schema265 = var0.addSchema(4312, class08415::new);
      var0.addFixer(new class08408(schema265));
      Schema schema266 = var0.addSchema(4314, L);
      var0.addFixer(new class08406(schema266));
      Schema schema267 = var0.addSchema(4420, class00033::new);
      var0.addFixer(new class00234(schema267, "AreaEffectCloudCustomParticleFix", class06962.o, "minecraft:area_effect_cloud"));
      Schema schema268 = var0.addSchema(4421, class00026::new);
      var0.addFixer(new class05000(schema268, "Added Happy Ghast", class06962.o));
      Schema schema269 = var0.addSchema(4424, L);
      var0.addFixer(new class03601(schema269, "Remove Locator Bar experimental feature flag", Set.of("minecraft:locator_bar")));
      var0.addFixer(new class06630(schema269, class06962.L, "style", var0x -> var0x.createString("minecraft:default"), "locator_bar_icon"));
      var0.addFixer(new class06630(schema269, class06962.o, "style", var0x -> var0x.createString("minecraft:default"), "locator_bar_icon"));
      Schema schema270 = var0.addSchema(4531, class08992::new);
      var0.addFixer(new class05000(schema270, "Added Copper Golem", class06962.o));
      Schema schema271 = var0.addSchema(4532, class08955::new);
      var0.addFixer(new class05000(schema271, "Added Copper Golem Statue Block Entity", class06962.G));
      Schema schema272 = var0.addSchema(4533, class08989::new);
      var0.addFixer(new class05000(schema272, "Added Shelf", class06962.G));
      Schema schema273 = var0.addSchema(4535, L);
      var0.addFixer(new class08100(schema273));
      Schema schema274 = var0.addSchema(4537, L);
      var0.addFixer(new class03500(schema274));
      Schema schema275 = var0.addSchema(4541, L);
      var0.addFixer(class05799.N(schema275, "Rename chain to iron_chain", N("minecraft:chain", "minecraft:iron_chain")));
      var0.addFixer(class07906.N(schema275, "Rename chain to iron_chain", N("minecraft:chain", "minecraft:iron_chain")));
      Schema schema276 = var0.addSchema(4543, class06624::new);
      var0.addFixer(new class05000(schema276, "Added Mannequin", class06962.o));
      Schema schema277 = var0.addSchema(4544, L);
      var0.addFixer(new class06631(schema277));
      Schema schema278 = var0.addSchema(4548, L);
      var0.addFixer(new class06983(schema278));
      var0.addFixer(new class06981(schema278));
      Schema schema279 = var0.addSchema(4648, class08182::new);
      var0.addFixer(new class05000(schema279, "Added Nautilus and Zombie Nautilus", class06962.o));
      Schema schema280 = var0.addSchema(4649, L);
      var0.addFixer(new class08154(schema280));
      Schema schema281 = var0.addSchema(4650, L);
      var0.addFixer(new class08180(schema281));
      Schema schema282 = var0.addSchema(4651, L);
      var0.addFixer(new class08184(schema282, "cutoutLeaves", "false", "true", "true"));
      var0.addFixer(new class08184(schema282, "weatherRadius", "5", "10", "10"));
      var0.addFixer(new class08184(schema282, "vignette", "false", "true", "true"));
      var0.addFixer(new class08184(schema282, "improvedTransparency", "false", "false", "true"));
      var0.addFixer(new class08189(schema282));
      Schema schema283 = var0.addSchema(4656, class06844::new);
      var0.addFixer(new class05000(schema283, "Added Parched and Camel Husk", class06962.o));
      Schema schema284 = var0.addSchema(4657, L);
      var0.addFixer(new class06814(schema284));
      Schema schema285 = var0.addSchema(4658, L);
      var0.addFixer(new class06852(schema285));
      Schema schema286 = var0.addSchema(4661, L);
      var0.addFixer(new class07584(schema286, false));
   }
}
