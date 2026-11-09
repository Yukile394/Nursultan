package minecraft;

import Nursultan.class10758;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class class07118 implements class02026 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 384;
   private static final int L = 320;
   private static final int u = -64;
   private static final int i = 5;
   private static final Map<class07428, Set<class07078<?>>> R = Map.of(class07428.field_6302, Set.of(class07078.Nz, class07078.Nj, class07078.yX));
   private static final List<class07078<?>> M = Arrays.asList(
      class07078.T,
      class07078.j,
      class07078.v,
      class07078.G,
      class07078.d,
      class07078.o,
      class07078.q,
      class07078.X,
      class07078.p,
      class07078.f,
      class07078.F,
      class07078.A,
      class07078.x,
      class07078.NB,
      class07078.Nm,
      class07078.NP,
      class07078.Nb,
      class07078.Ng,
      class07078.NS,
      class07078.ND,
      class07078.Nr,
      class07078.yN,
      class07078.yy,
      class07078.yB,
      class07078.yU,
      class07078.yW,
      class07078.ym,
      class07078.ys,
      class07078.yG,
      class07078.yk,
      class07078.yV,
      class07078.yH,
      class07078.yp,
      class07078.yA,
      class07078.yF,
      class07078.yS,
      class07078.yr,
      class07078.yx,
      class07078.yD,
      class07078.LN,
      class07078.yh
   );

   public class07118() {
      super();
   }

   private static class06915<class05920> y(class02055<class00891> var0, class00891 var1) {
      class05952[] aclass05952 = class06775.R.N().stream().map(var2x -> {
         class01408 class01408 = class01408.N().N(class06775.R, var2x);
         class07670 class07670 = new class07670(class00869.Ba).N(class01408);
         class05952 class05952 = class00859.N(class00818.N().N(class01427.N().N(var0, var1)), new class07209(var2x.E()));
         return class03496.N(class07670, class05952);
      }).toArray(class05952[]::new);
      return class05920.N(class03494.N(aclass05952));
   }

   private static class07165 y(class07165 var0) {
      var0.N(class03741.y);
      class02016.y().map(class02005::L).forEach(var1 -> var0.N("armor_trimmed_" + var1.N(), class03488.N((class05946<class06521<?>>)var1)));
      return var0;
   }

   private static List<class07078<?>> N(List<class07078<?>> var0, class01905<class07078<?>> var1) {
      ArrayList arraylist = new ArrayList();
      Set set = Set.copyOf(var0);
      Set set1 = set.stream().map(class07078::i).collect(Collectors.toSet());
      SetView setview = Sets.symmetricDifference(R.keySet(), set1);
      if (!setview.isEmpty()) {
         arraylist.add(
            "Found EntityType with MobCategory only in either expected exceptions or kill_all_mobs advancement: "
               + setview.stream().map(Object::toString).sorted().collect(Collectors.joining(", "))
         );
      }

      SetView setview1 = Sets.intersection(R.values().stream().flatMap(Collection::stream).collect(Collectors.toSet()), set);
      if (!setview1.isEmpty()) {
         arraylist.add(
            "Found EntityType in both expected exceptions and kill_all_mobs advancement: "
               + setview1.stream().map(Object::toString).sorted().collect(Collectors.joining(", "))
         );
      }

      Map map = var1.z().map(class03529::N).filter(Predicate.not(set::contains)).collect(Collectors.groupingBy(class07078::i, Collectors.toSet()));
      R.forEach(
         (var2x, var3x) -> {
            SetView setview2 = Sets.difference(map.getOrDefault(var2x, Set.of()), var3x);
            if (!setview2.isEmpty()) {
               arraylist.add(
                  String.format(
                     Locale.ROOT,
                     "Found (new?) EntityType with MobCategory %s which are in neither expected exceptions nor kill_all_mobs advancement: %s",
                     var2x,
                     setview2.stream().map(Object::toString).sorted().collect(Collectors.joining(", "))
                  )
               );
            }
         }
      );
      if (!arraylist.isEmpty()) {
         arraylist.forEach(N::error);
         throw new IllegalStateException("Found inconsistencies with kill_all_mobs advancement");
      } else {
         return var0;
      }
   }

   private static class06915<class04545> N(class00836 var0, Optional<class00821> var1) {
      return class04545.N(Optional.of(class00810.N().N(class00761.L(class00816.L(30.0))).N(class04558.N(var0)).y()), var1);
   }

   private static class07165 N(class02055<class06581> var0, class07165 var1) {
      List list = List.of(
         Pair.of("desert_pyramid", class05947.N(class06273.yU)),
         Pair.of("desert_well", class05947.N(class06273.yz)),
         Pair.of("ocean_ruin_cold", class05947.N(class06273.yP)),
         Pair.of("ocean_ruin_warm", class05947.N(class06273.ym)),
         Pair.of("trail_ruins_rare", class05947.N(class06273.yW)),
         Pair.of("trail_ruins_common", class05947.N(class06273.yE))
      );
      list.forEach(var1x -> var1.N((String)var1x.getFirst(), (class06915<?>)var1x.getSecond()));
      String s = "has_sherd";
      var1.N("has_sherd", class00843.N(class00837.N().N(var0, class01226.yh)));
      var1.N(new class03753(List.of(list.stream().<String>map(Pair::getFirst).toList(), List.of("has_sherd"))));
      return var1;
   }

   private static class07165 N(class07165 var0) {
      var0.N(class03741.N);
      Set set = Set.of(class06570.kW, class06570.kU, class06570.kE, class06570.kM, class06570.ks, class06570.kZ, class06570.kz, class06570.km);
      class02016.y().filter(var1x -> set.contains(var1x.N())).forEach(var1x -> var0.N("armor_trimmed_" + var1x.L().N(), class03488.N(var1x.L())));
      return var0;
   }

   private static class06915<class05920> N(class02055<class00891> var0, class03530<class00891> var1) {
      class05952[] aclass05952 = Stream.of(class07211.values()).map(var2x -> {
         class01408 class01408 = class01408.N().N(class00325.y, var2x.z());
         class01427 class01427 = class01427.N().N(var0, var1).N(class01408);
         class00753 class00753 = var2x.E();
         class05952 class05952xx = class00859.N(class00818.N().N(class01427));
         class05952 class05952x = class00859.N(class00818.N().N(class01427.N().N(var0, class00869.Lp).N(class01408)), new class07209(class00753));
         class05952 class05952xx = class00859.N(class00818.N().N(class01427), new class07209(class00753.method_35862(2)));
         return class03496.N(class05952xx, class05952x, class05952xx);
      }).toArray(class05952[]::new);
      return class05920.N(class03494.N(aclass05952));
   }

   private static class06915<class05920> N(class02055<class00891> var0, class00891 var1) {
      class05952[] aclass05952 = class06775.R.N().stream().map(var1x -> {
         class01408 class01408 = class01408.N().N(class06775.R, var1x);
         class01427 class01427 = class01427.N().N(var0, class00869.Ba).N(class01408);
         return class00859.N(class00818.N().N(class01427), new class07209(var1x.b().E()));
      }).toArray(class05952[]::new);
      return class05920.N(class00851.N(var1), class03494.N(aclass05952));
   }

   public static class03711 N(class03711 var0, Consumer<class03711> var1, class02055<class07078<?>> var2, List<class07078<?>> var3) {
      class03711 class03711 = N(class07165.N(), var2, var3)
         .N(var0)
         .N(
            class06570.To,
            class00392.L("advancements.adventure.kill_a_mob.title"),
            class00392.L("advancements.adventure.kill_a_mob.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(class03741.y)
         .N(var1, "adventure/kill_a_mob");
      N(class07165.N(), var2, var3)
         .N(class03711)
         .N(
            class06570.TH,
            class00392.L("advancements.adventure.kill_all_mobs.title"),
            class00392.L("advancements.adventure.kill_all_mobs.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(100))
         .N(var1, "adventure/kill_all_mobs");
      return class03711;
   }

   @Override
   public void N(class01929 var1, Consumer<class03711> var2) {
      class01921 class01921xxx = var1.y(class04227.I);
      class01921 class01921x = var1.y(class04227.F);
      class01921 class01921xx = var1.y(class04227.Z);
      class03711 class03711xxxxxxxxxxxxx = class07165.N()
         .N(
            class06570.Gt,
            class00392.L("advancements.adventure.root.title"),
            class00392.L("advancements.adventure.root.description"),
            class01894.y("gui/advancements/backgrounds/adventure"),
            class07296.field_1254,
            false,
            false,
            false
         )
         .N(class03741.y)
         .N("killed_something", class00825.y())
         .N("killed_by_something", class00825.u())
         .N(var2, "adventure/root");
      class03711 class03711x = class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class00869.yn,
            class00392.L("advancements.adventure.sleep_in_bed.title"),
            class00392.L("advancements.adventure.sleep_in_bed.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("slept_in_bed", class07682.y())
         .N(var2, "adventure/sleep_in_bed");
      N(var1, var2, class03711x, class03562.L);
      class03711 class03711xx = class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.Ty,
            class00392.L("advancements.adventure.trade.title"),
            class00392.L("advancements.adventure.trade.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("traded", class07677.y())
         .N(var2, "adventure/trade");
      class07165.N()
         .N(class03711xx)
         .N(
            class06570.Ty,
            class00392.L("advancements.adventure.trade_at_world_height.title"),
            class00392.L("advancements.adventure.trade_at_world_height.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("trade_at_world_height", class07677.N(class00810.N().N(class00818.N(class00816.y(319.0)))))
         .N(var2, "adventure/trade_at_world_height");
      class03711 class03711xxx = N(class03711xxxxxxxxxxxxx, var2, class01921xxx, N(M, class01921xxx));
      class03711 class03711xxxx = class07165.N()
         .N(class03711xxx)
         .N(
            class06570.sx,
            class00392.L("advancements.adventure.shoot_arrow.title"),
            class00392.L("advancements.adventure.shoot_arrow.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("shot_arrow", class00857.N(class00764.N().N(class00789.N().N(class03659.N(class03696.z)).N(class00810.N().N(class01921xxx, class01217.M)))))
         .N(var2, "adventure/shoot_arrow");
      class03711 class03711xxxxx = class07165.N()
         .N(class03711xxx)
         .N(
            class06570.db,
            class00392.L("advancements.adventure.throw_trident.title"),
            class00392.L("advancements.adventure.throw_trident.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("shot_trident", class00857.N(class00764.N().N(class00789.N().N(class03659.N(class03696.z)).N(class00810.N().N(class01921xxx, class07078.yo)))))
         .N(var2, "adventure/throw_trident");
      class07165.N()
         .N(class03711xxxxx)
         .N(
            class06570.db,
            class00392.L("advancements.adventure.very_very_frightening.title"),
            class00392.L("advancements.adventure.very_very_frightening.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("struck_villager", class00799.N(class00810.N().N(class01921xxx, class07078.ye)))
         .N(var2, "adventure/very_very_frightening");
      class07165.N()
         .N(class03711xx)
         .N(
            class00869.iK,
            class00392.L("advancements.adventure.summon_iron_golem.title"),
            class00392.L("advancements.adventure.summon_iron_golem.description"),
            null,
            class07296.field_1249,
            true,
            true,
            false
         )
         .N("summoned_golem", class07691.N(class00810.N().N(class01921xxx, class07078.Nn)))
         .N(var2, "adventure/summon_iron_golem");
      class07165.N()
         .N(class03711xxxx)
         .N(
            class06570.sD,
            class00392.L("advancements.adventure.sniper_duel.title"),
            class00392.L("advancements.adventure.sniper_duel.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(50))
         .N(
            "killed_skeleton",
            class00825.N(class00810.N().N(class01921xxx, class07078.ym).N(class00761.N(class00816.y(50.0))), class00789.N().N(class03659.N(class03696.z)))
         )
         .N(var2, "adventure/sniper_duel");
      class07165.N()
         .N(class03711xxx)
         .N(
            class06570.la,
            class00392.L("advancements.adventure.totem_of_undying.title"),
            class00392.L("advancements.adventure.totem_of_undying.description"),
            null,
            class07296.field_1249,
            true,
            true,
            false
         )
         .N("used_totem", class07672.N(class01921x, class06570.la))
         .N(var2, "adventure/totem_of_undying");
      class07165.N()
         .N(class03711xxx)
         .N(
            class06570.le,
            class00392.L("advancements.adventure.spear_many_mobs.title"),
            class00392.L("advancements.adventure.spear_many_mobs.description"),
            null,
            class07296.field_1249,
            true,
            true,
            false
         )
         .N("spear_many_mobs", class07575.N(5))
         .N(var2, "adventure/spear_many_mobs");
      class03711 class03711xxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.dw,
            class00392.L("advancements.adventure.ol_betsy.title"),
            class00392.L("advancements.adventure.ol_betsy.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("shot_crossbow", class07668.N(class01921x, class06570.dw))
         .N(var2, "adventure/ol_betsy");
      class07165.N()
         .N(class03711xxxxxx)
         .N(
            class06570.dw,
            class00392.L("advancements.adventure.whos_the_pillager_now.title"),
            class00392.L("advancements.adventure.whos_the_pillager_now.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("kill_pillager", class00844.N(class01921x, class00810.N().N(class01921xxx, class07078.yy)))
         .N(var2, "adventure/whos_the_pillager_now");
      class07165.N()
         .N(class03711xxxxxx)
         .N(
            class06570.dw,
            class00392.L("advancements.adventure.two_birds_one_arrow.title"),
            class00392.L("advancements.adventure.two_birds_one_arrow.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(65))
         .N("two_birds", class00844.N(class01921x, class00810.N().N(class01921xxx, class07078.ND), class00810.N().N(class01921xxx, class07078.ND)))
         .N(var2, "adventure/two_birds_one_arrow");
      class07165.N()
         .N(class03711xxxxxx)
         .N(
            class06570.dw,
            class00392.L("advancements.adventure.arbalistic.title"),
            class00392.L("advancements.adventure.arbalistic.description"),
            null,
            class07296.field_1250,
            true,
            true,
            true
         )
         .N(class10758.N(85))
         .N("arbalistic", class00844.N(class01921x, class00836.N(5)))
         .N(var2, "adventure/arbalistic");
      class01921 class01921xxx = var1.y(class04227.NF);
      class03711 class03711xxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class04877.N(class01921xxx),
            class00392.L("advancements.adventure.voluntary_exile.title"),
            class00392.L("advancements.adventure.voluntary_exile.description"),
            null,
            class07296.field_1254,
            true,
            true,
            true
         )
         .N("voluntary_exile", class00825.N(class00810.N().N(class01921xxx, class01217.L).N(class06110.N(class01921x, class01921xxx))))
         .N(var2, "adventure/voluntary_exile");
      class07165.N()
         .N(class03711xxxxxxx)
         .N(
            class04877.N(class01921xxx),
            class00392.L("advancements.adventure.hero_of_the_village.title"),
            class00392.L("advancements.adventure.hero_of_the_village.description"),
            null,
            class07296.field_1250,
            true,
            true,
            true
         )
         .N(class10758.N(100))
         .N("hero_of_the_village", class07682.L())
         .N(var2, "adventure/hero_of_the_village");
      class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class00869.TM.B(),
            class00392.L("advancements.adventure.honey_block_slide.title"),
            class00392.L("advancements.adventure.honey_block_slide.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("honey_block_slide", class05891.N(class00869.TM))
         .N(var2, "adventure/honey_block_slide");
      class07165.N()
         .N(class03711xxxx)
         .N(
            class00869.Tu.B(),
            class00392.L("advancements.adventure.bullseye.title"),
            class00392.L("advancements.adventure.bullseye.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(50))
         .N("bullseye", class04943.N(class00836.N(15), Optional.of(class00821.N(class00810.N().N(class00761.N(class00816.y(30.0)))))))
         .N(var2, "adventure/bullseye");
      class07165.N()
         .N(class03711x)
         .N(
            class06570.bB,
            class00392.L("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"),
            class00392.L("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("walk_on_powder_snow_with_leather_boots", class07682.N(class01921xx, class01921x, class00869.ba, class06570.bB))
         .N(var2, "adventure/walk_on_powder_snow_with_leather_boots");
      class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.WF,
            class00392.L("advancements.adventure.lightning_rod_with_villager_no_fire.title"),
            class00392.L("advancements.adventure.lightning_rod_with_villager_no_fire.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("lightning_rod_with_villager_no_fire", N(class00836.N(0), Optional.of(class00810.N().N(class01921xxx, class07078.ye).y())))
         .N(var2, "adventure/lightning_rod_with_villager_no_fire");
      class03711 class03711xxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.vy,
            class00392.L("advancements.adventure.spyglass_at_parrot.title"),
            class00392.L("advancements.adventure.spyglass_at_parrot.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("spyglass_at_parrot", N(class00810.N().N(class01921xxx, class07078.Nx), class00837.N().N(class01921x, class06570.vy)))
         .N(var2, "adventure/spyglass_at_parrot");
      class03711 class03711xxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxx)
         .N(
            class06570.vy,
            class00392.L("advancements.adventure.spyglass_at_ghast.title"),
            class00392.L("advancements.adventure.spyglass_at_ghast.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("spyglass_at_ghast", N(class00810.N().N(class01921xxx, class07078.NB), class00837.N().N(class01921x, class06570.vy)))
         .N(var2, "adventure/spyglass_at_ghast");
      class07165.N()
         .N(class03711x)
         .N(
            class06570.RI,
            class00392.L("advancements.adventure.play_jukebox_in_meadows.title"),
            class00392.L("advancements.adventure.play_jukebox_in_meadows.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "play_jukebox_in_meadows",
            class05920.N(
               class00818.N().N(class03543.N(var1.y(class04227.NA).y(class00795.g))).N(class01427.N().N(class01921xx, class00869.iG)),
               class00837.N().N(class00159.N().N(class02482.m, class02208.N()).y())
            )
         )
         .N(var2, "adventure/play_jukebox_in_meadows");
      class07165.N()
         .N(class03711xxxxxxxxx)
         .N(
            class06570.vy,
            class00392.L("advancements.adventure.spyglass_at_dragon.title"),
            class00392.L("advancements.adventure.spyglass_at_dragon.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("spyglass_at_dragon", N(class00810.N().N(class01921xxx, class07078.f), class00837.N().N(class01921x, class06570.vy)))
         .N(var2, "adventure/spyglass_at_dragon");
      class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.jE,
            class00392.L("advancements.adventure.fall_from_world_height.title"),
            class00392.L("advancements.adventure.fall_from_world_height.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "fall_from_world_height",
            class00811.N(class00810.N().N(class00818.N(class00816.L(-59.0))), class00761.y(class00816.y(379.0)), class00818.N(class00816.y(319.0)))
         )
         .N(var2, "adventure/fall_from_world_height");
      class07165.N()
         .N(class03711xxx)
         .N(
            class00869.bC,
            class00392.L("advancements.adventure.kill_mob_near_sculk_catalyst.title"),
            class00392.L("advancements.adventure.kill_mob_near_sculk_catalyst.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N("kill_mob_near_sculk_catalyst", class00825.L())
         .N(var2, "adventure/kill_mob_near_sculk_catalyst");
      class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class00869.bp,
            class00392.L("advancements.adventure.avoid_vibration.title"),
            class00392.L("advancements.adventure.avoid_vibration.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("avoid_vibration", class07682.u())
         .N(var2, "adventure/avoid_vibration");
      class03711 class03711xxxxxxxxxx = N(class01921x, class07165.N())
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.kN,
            class00392.L("advancements.adventure.salvage_sherd.title"),
            class00392.L("advancements.adventure.salvage_sherd.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(var2, "adventure/salvage_sherd");
      class07165.N()
         .N(class03711xxxxxxxxxx)
         .N(
            class01958.N(new class03490(Optional.empty(), Optional.of(class06570.kI), Optional.empty(), Optional.of(class06570.kY))),
            class00392.L("advancements.adventure.craft_decorated_pot_using_only_sherds.title"),
            class00392.L("advancements.adventure.craft_decorated_pot_using_only_sherds.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "pot_crafted_using_only_sherds",
            class03488.N(
               class05946.N(class04227.yV, class01894.y("decorated_pot")),
               List.of(
                  class00837.N().N(class01921x, class01226.yh),
                  class00837.N().N(class01921x, class01226.yh),
                  class00837.N().N(class01921x, class01226.yh),
                  class00837.N().N(class01921x, class01226.yh)
               )
            )
         )
         .N(var2, "adventure/craft_decorated_pot_using_only_sherds");
      class03711 class03711xxxxxxxxxxx = y(class07165.N())
         .N(class03711xxxxxxxxxxxxx)
         .N(
            new class06584(class06570.ku),
            class00392.L("advancements.adventure.trim_with_any_armor_pattern.title"),
            class00392.L("advancements.adventure.trim_with_any_armor_pattern.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(var2, "adventure/trim_with_any_armor_pattern");
      N(class07165.N())
         .N(class03711xxxxxxxxxxx)
         .N(
            new class06584(class06570.ks),
            class00392.L("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"),
            class00392.L("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(150))
         .N(var2, "adventure/trim_with_all_exclusive_armor_patterns");
      class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.RM,
            class00392.L("advancements.adventure.read_power_from_chiseled_bookshelf.title"),
            class00392.L("advancements.adventure.read_power_from_chiseled_bookshelf.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(class03741.y)
         .N("chiseled_bookshelf", N(class01921xx, class00869.LG))
         .N("comparator", y(class01921xx, class00869.LG))
         .N(var2, "adventure/read_power_of_chiseled_bookshelf");
      class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.sF,
            class00392.L("advancements.adventure.brush_armadillo.title"),
            class00392.L("advancements.adventure.brush_armadillo.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "brush_armadillo",
            class01243.y(class00837.N().N(class01921x, class06570.kN), Optional.of(class00821.N(class00810.N().N(class01921xxx, class07078.M))))
         )
         .N(var2, "adventure/brush_armadillo");
      class03711 class03711xxxxxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class00869.bo,
            class00392.L("advancements.adventure.minecraft_trials_edition.title"),
            class00392.L("advancements.adventure.minecraft_trials_edition.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("minecraft_trials_edition", class07682.N(class00818.y(var1.y(class04227.yj).y(class04433.o))))
         .N(var2, "adventure/minecraft_trials_edition");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.kr,
            class00392.L("advancements.adventure.lighten_up.title"),
            class00392.L("advancements.adventure.lighten_up.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "lighten_up",
            class05920.N(
               class00818.N()
                  .N(
                     class01427.N()
                        .N(class01921xx, class00869.vm, class00869.vW, class00869.vE, class00869.vb, class00869.vT, class00869.vs)
                        .N(class01408.N().N(class03135.L, true))
                  ),
               class00837.N().N(class01921x, class07116.L)
            )
         )
         .N(var2, "adventure/lighten_up");
      class03711 class03711xxxxxxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.Yd,
            class00392.L("advancements.adventure.under_lock_and_key.title"),
            class00392.L("advancements.adventure.under_lock_and_key.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "under_lock_and_key",
            class05920.N(
               class00818.N().N(class01427.N().N(class01921xx, class00869.nF).N(class01408.N().N(class02271.u, false))),
               class00837.N().N(class01921x, class06570.Yd)
            )
         )
         .N(var2, "adventure/under_lock_and_key");
      class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.Yw,
            class00392.L("advancements.adventure.revaulting.title"),
            class00392.L("advancements.adventure.revaulting.description"),
            null,
            class07296.field_1249,
            true,
            true,
            false
         )
         .N(
            "revaulting",
            class05920.N(
               class00818.N().N(class01427.N().N(class01921xx, class00869.nF).N(class01408.N().N(class02271.u, true))),
               class00837.N().N(class01921x, class06570.Yw)
            )
         )
         .N(var2, "adventure/revaulting");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.Gz,
            class00392.L("advancements.adventure.blowback.title"),
            class00392.L("advancements.adventure.blowback.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(40))
         .N(
            "blowback",
            class00825.N(
               class00810.N().N(class01921xxx, class07078.v), class00789.N().N(class03659.N(class03696.z)).N(class00810.N().N(class01921xxx, class07078.n))
            )
         )
         .N(var2, "adventure/blowback");
      class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.vD,
            class00392.L("advancements.adventure.crafters_crafting_crafters.title"),
            class00392.L("advancements.adventure.crafters_crafting_crafters.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("crafter_crafted_crafter", class03488.y(class05946.N(class04227.yV, class01894.y("crafter"))))
         .N(var2, "adventure/crafters_crafting_crafters");
      class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class06570.wU,
            class00392.L("advancements.adventure.use_lodestone.title"),
            class00392.L("advancements.adventure.use_lodestone.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("use_lodestone", class05920.N(class00818.N().N(class01427.N().N(class01921xx, class00869.TT)), class00837.N().N(class01921x, class06570.jJ)))
         .N(var2, "adventure/use_lodestone");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.Gz,
            class00392.L("advancements.adventure.who_needs_rockets.title"),
            class00392.L("advancements.adventure.who_needs_rockets.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("who_needs_rockets", class02187.N(class00761.y(class00816.y(7.0)), class00810.N().N(class01921xxx, class07078.ya)))
         .N(var2, "adventure/who_needs_rockets");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.Gm,
            class00392.L("advancements.adventure.overoverkill.title"),
            class00392.L("advancements.adventure.overoverkill.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(50))
         .N(
            "overoverkill",
            class00857.N(
               class00764.N()
                  .N(class00816.y(100.0))
                  .N(
                     class00789.N()
                        .N(class03659.N(class03696.o))
                        .N(class00810.N().N(class01921xxx, class07078.Ly).N(class06124.N().R(class00837.N().N(class01921x, class06570.Gm))))
                  )
            )
         )
         .N(var2, "adventure/overoverkill");
      class07165.N()
         .N(class03711xxxxxxxxxxxxx)
         .N(
            class00869.Lp,
            class00392.L("advancements.adventure.heart_transplanter.title"),
            class00392.L("advancements.adventure.heart_transplanter.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(class03741.y)
         .N("place_creaking_heart_dormant", class05920.N(class00869.Lp, class06665.yI, class08630.field_55832))
         .N("place_creaking_heart_awake", class05920.N(class00869.Lp, class06665.yI, class08630.field_55833))
         .N("place_pale_oak_log", N(class01921xx, class01210.v))
         .N(var2, "adventure/heart_transplanter");
   }

   private static class06915<class04547> N(class00810 var0, class00837 var1) {
      return class04547.N(class00810.N().N(class01403.N().N(var0).y()), var1);
   }

   protected static class07165 N(class07165 var0, class01929 var1, List<class05946<class00780>> var2) {
      class01921 class01921 = var1.y(class04227.NA);

      for (class05946 class05946 : var2) {
         var0.N(class05946.N().toString(), class07682.N(class00818.N(class01921.y(class05946))));
      }

      return var0;
   }

   private static class07165 N(class07165 var0, class02055<class07078<?>> var1, List<class07078<?>> var2) {
      var2.forEach(var2x -> var0.N(class04206.M.y(var2x).toString(), class00825.N(class00810.N().N(var1, var2x))));
      return var0;
   }

   protected static void N(class01929 var0, Consumer<class03711> var1, class03711 var2, class03562 var3) {
      N(class07165.N(), var0, var3.N().toList())
         .N(var2)
         .N(
            class06570.bl,
            class00392.L("advancements.adventure.adventuring_time.title"),
            class00392.L("advancements.adventure.adventuring_time.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(500))
         .N(var1, "adventure/adventuring_time");
   }
}
