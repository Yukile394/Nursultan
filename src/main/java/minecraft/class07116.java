package minecraft;

import Nursultan.class10758;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class class07116 implements class02026 {
   public static final List<class07078<?>> N = List.of(
      class07078.NT,
      class07078.H,
      class07078.Ne,
      class07078.yz,
      class07078.J,
      class07078.NV,
      class07078.Nh,
      class07078.Q,
      class07078.yC,
      class07078.Na,
      class07078.yM,
      class07078.NQ,
      class07078.l,
      class07078.NC,
      class07078.Ni,
      class07078.m,
      class07078.NP,
      class07078.yY,
      class07078.NW,
      class07078.z,
      class07078.t,
      class07078.M,
      class07078.NH
   );
   public static final List<class07078<?>> y = List.of(class07078.yK, class07078.NR, class07078.yb);
   private static final class06581[] u = new class06581[]{class06570.vu, class06570.vR, class06570.vM, class06570.vi};
   private static final class06581[] i = new class06581[]{class06570.jv, class06570.jn, class06570.jb, class06570.jj};
   private static final class06581[] R = new class06581[]{
      class06570.sS,
      class06570.TD,
      class06570.bu,
      class06570.bo,
      class06570.bq,
      class06570.bV,
      class06570.be,
      class06570.vu,
      class06570.vi,
      class06570.vR,
      class06570.vM,
      class06570.vB,
      class06570.vZ,
      class06570.vx,
      class06570.nN,
      class06570.ni,
      class06570.nR,
      class06570.nM,
      class06570.nB,
      class06570.nZ,
      class06570.nT,
      class06570.Gb,
      class06570.Gj,
      class06570.Gv,
      class06570.Gn,
      class06570.GG,
      class06570.GI,
      class06570.Gc,
      class06570.GX,
      class06570.Ga,
      class06570.lL,
      class06570.lu,
      class06570.lt,
      class06570.lw,
      class06570.lY,
      class06570.ny,
      class06570.dk,
      class06570.wN,
      class06570.wZ,
      class06570.wy
   };
   public static final class06581[] L = new class06581[]{
      class06570.TT, class06570.TI, class06570.Tk, class06570.Tt, class06570.TV, class06570.Ta, class06570.TC
   };
   private static final Comparator<class03529<?>> M = Comparator.comparing(var0 -> var0.B().N());

   private static class07165 L(class07165 var0, class02055<class06581> var1) {
      for (class06581 class06581 : u) {
         var0.N(class04206.B.y(class06581).N(), class00824.N(Optional.empty(), Optional.empty(), Optional.of(class00837.N().N(var1, class06581).y())));
      }

      return var0;
   }

   public class07116() {
      super();
   }

   private static class07165 y_7(class07165 var0, class02055<class06581> var1) {
      for (class06581 class06581 : i) {
         var0.N(class04206.B.y(class06581).N(), class00830.N(class00837.N().N(var1, class06581)));
      }

      return var0;
   }

   private static class07165 y(class07165 var0, class01905<class02505> var1) {
      N(var1).forEach(var1x -> var0.N(var1x.B().N().toString(), class07669.N(class00810.N().N(class00159.N().N(class02471.N(class02484.NO, var1x)).y()))));
      return var0;
   }

   private static class07165 N_69(class07165 var0, class01905<class03648> var1) {
      N(var1).forEach(var1x -> var0.N(var1x.B().N().toString(), class07669.N(class00810.N().N(class00159.N().N(class02471.N(class02484.ND, var1x)).y()))));
      return var0;
   }

   private static <T> Stream<class03529<T>> N(class01905<T> var0) {
      return (Stream<class03529<T>>)var0.z().sorted(M);
   }

   private static class07165 N(class07165 var0, class02055<class06581> var1) {
      for (class06581 class06581 : R) {
         var0.N(class04206.B.y(class06581).N(), class00786.N(var1, class06581));
      }

      return var0;
   }

   private static class07165 N(class07165 var0, Stream<class07078<?>> var1, class02055<class07078<?>> var2, Stream<class07078<?>> var3) {
      var1.forEach(var2x -> var0.N(class07078.N((class07078<?>)var2x).toString(), class00802.N(class00810.N().N(var2, (class07078<?>)var2x))));
      var3.forEach(
         var2x -> var0.N(
            class07078.N((class07078<?>)var2x).toString(),
            class00802.N(
               Optional.of(class00810.N().N(var2, (class07078<?>)var2x).y()), Optional.of(class00810.N().N(var2, (class07078<?>)var2x).y()), Optional.empty()
            )
         )
      );
      return var0;
   }

   public static class03711 N(
      class03711 var0, Consumer<class03711> var1, class02055<class07078<?>> var2, Stream<class07078<?>> var3, Stream<class07078<?>> var4
   ) {
      return N(class07165.N(), var3, var2, var4)
         .N(var0)
         .N(
            class06570.GG,
            class00392.L("advancements.husbandry.breed_all_animals.title"),
            class00392.L("advancements.husbandry.breed_all_animals.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(100))
         .N(var1, "husbandry/bred_all_animals");
   }

   @Override
   public void N(class01929 var1, Consumer<class03711> var2) {
      class01921 class01921xxxxxx = var1.y(class04227.I);
      class01921 class01921x = var1.y(class04227.F);
      class01921 class01921xx = var1.y(class04227.Z);
      class01921 class01921xxx = var1.y(class04227.yB);
      class01921 class01921xxxx = var1.y(class04227.Nf);
      class01921 class01921xxxxx = var1.y(class04227.yY);
      class01921 class01921xxxxxx = var1.y(class04227.yR);
      class03711 class03711xxxxxxxxxxxx = class07165.N()
         .N(
            class00869.zy,
            class00392.L("advancements.husbandry.root.title"),
            class00392.L("advancements.husbandry.root.description"),
            class01894.y("gui/advancements/backgrounds/husbandry"),
            class07296.field_1254,
            false,
            false,
            false
         )
         .N("consumed_item", class00786.y())
         .N(var2, "husbandry/root");
      class03711 class03711x = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.bL,
            class00392.L("advancements.husbandry.plant_seed.title"),
            class00392.L("advancements.husbandry.plant_seed.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(class03741.y)
         .N("wheat", class05920.N(class00869.Lh))
         .N("pumpkin_stem", class05920.N(class00869.Re))
         .N("melon_stem", class05920.N(class00869.RH))
         .N("beetroots", class05920.N(class00869.Ew))
         .N("nether_wart", class05920.N(class00869.MR))
         .N("torchflower", class05920.N(class00869.EG))
         .N("pitcher_pod", class05920.N(class00869.El))
         .N(var2, "husbandry/plant_seed");
      N(
         class07165.N()
            .N(class03711xxxxxxxxxxxx)
            .N(
               class06570.bL,
               class00392.L("advancements.husbandry.breed_an_animal.title"),
               class00392.L("advancements.husbandry.breed_an_animal.description"),
               null,
               class07296.field_1254,
               true,
               true,
               false
            )
            .N(class03741.y)
            .N("bred", class00802.y())
            .N(var2, "husbandry/breed_an_animal"),
         var2,
         class01921xxxxxx,
         N.stream(),
         y.stream()
      );
      N(class07165.N(), class01921x)
         .N(class03711x)
         .N(
            class06570.sS,
            class00392.L("advancements.husbandry.balanced_diet.title"),
            class00392.L("advancements.husbandry.balanced_diet.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(100))
         .N(var2, "husbandry/balanced_diet");
      class07165.N()
         .N(class03711x)
         .N(
            class06570.TS,
            class00392.L("advancements.husbandry.netherite_hoe.title"),
            class00392.L("advancements.husbandry.netherite_hoe.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(100))
         .N("netherite_hoe", class00843.N(class06570.TS))
         .N(var2, "husbandry/obtain_netherite_hoe");
      class03711 class03711xx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.Gr,
            class00392.L("advancements.husbandry.tame_an_animal.title"),
            class00392.L("advancements.husbandry.tame_an_animal.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("tamed_animal", class07669.y())
         .N(var2, "husbandry/tame_an_animal");
      class03711 class03711xxx = L(class07165.N(), class01921x)
         .N(class03711xxxxxxxxxxxx)
         .N(class03741.y)
         .N(
            class06570.jr,
            class00392.L("advancements.husbandry.fishy_business.title"),
            class00392.L("advancements.husbandry.fishy_business.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(var2, "husbandry/fishy_business");
      class03711 class03711xxxx = y_7(class07165.N(), class01921x)
         .N(class03711xxx)
         .N(class03741.y)
         .N(
            class06570.jb,
            class00392.L("advancements.husbandry.tactical_fishing.title"),
            class00392.L("advancements.husbandry.tactical_fishing.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(var2, "husbandry/tactical_fishing");
      class03711 class03711xxxxx = class07165.N()
         .N(class03711xxxx)
         .N(class03741.y)
         .N(class04206.B.y(class06570.jt).N(), class00830.N(class00837.N().N(class01921x, class06570.jt)))
         .N(
            class06570.jt,
            class00392.L("advancements.husbandry.axolotl_in_a_bucket.title"),
            class00392.L("advancements.husbandry.axolotl_in_a_bucket.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(var2, "husbandry/axolotl_in_a_bucket");
      class07165.N()
         .N(class03711xxxxx)
         .N("kill_axolotl_target", class00806.N(class00810.N().N(class01921xxxxxx, class07078.z)))
         .N(
            class06570.jn,
            class00392.L("advancements.husbandry.kill_axolotl_target.title"),
            class00392.L("advancements.husbandry.kill_axolotl_target.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(var2, "husbandry/kill_axolotl_target");
      N_69(class07165.N(), class01921xxxx)
         .N(class03711xx)
         .N(
            class06570.vu,
            class00392.L("advancements.husbandry.complete_catalogue.title"),
            class00392.L("advancements.husbandry.complete_catalogue.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(50))
         .N(var2, "husbandry/complete_catalogue");
      y(class07165.N(), class01921xxxxx)
         .N(class03711xx)
         .N(
            class06570.vO,
            class00392.L("advancements.husbandry.whole_pack.title"),
            class00392.L("advancements.husbandry.whole_pack.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(50))
         .N(var2, "husbandry/whole_pack");
      class03711 class03711xxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            "safely_harvest_honey",
            class05920.N(class00818.N().N(class01427.N().N(class01921xx, class01210.NC)).N(true), class00837.N().N(class01921x, class06570.nP))
         )
         .N(
            class06570.wZ,
            class00392.L("advancements.husbandry.safely_harvest_honey.title"),
            class00392.L("advancements.husbandry.safely_harvest_honey.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(var2, "husbandry/safely_harvest_honey");
      class03711 class03711xxxxxxx = class07165.N()
         .N(class03711xxxxxx)
         .N(
            class06570.wR,
            class00392.L("advancements.husbandry.wax_on.title"),
            class00392.L("advancements.husbandry.wax_on.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("wax_on", class05920.N(class00818.N().N(class01427.N().N(class01921xx, class02859.N.get().keySet())), class00837.N().N(class01921x, class06570.wR)))
         .N(var2, "husbandry/wax_on");
      class07165.N()
         .N(class03711xxxxxxx)
         .N(
            class06570.Tk,
            class00392.L("advancements.husbandry.wax_off.title"),
            class00392.L("advancements.husbandry.wax_off.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("wax_off", class05920.N(class00818.N().N(class01427.N().N(class01921xx, class02859.y.get().keySet())), class00837.N().N(class01921x, L)))
         .N(var2, "husbandry/wax_off");
      class03711 class03711xxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(class04206.B.y(class06570.jG).N(), class00830.N(class00837.N().N(class01921x, class06570.jG)))
         .N(
            class06570.jG,
            class00392.L("advancements.husbandry.tadpole_in_a_bucket.title"),
            class00392.L("advancements.husbandry.tadpole_in_a_bucket.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(var2, "husbandry/tadpole_in_a_bucket");
      class03711 class03711xxxxxxxxx = N(class01921xxxxxx, class01921x, class01921xxx, class07165.N())
         .N(class03711xxxxxxxx)
         .N(
            class06570.Gr,
            class00392.L("advancements.husbandry.leash_all_frog_variants.title"),
            class00392.L("advancements.husbandry.leash_all_frog_variants.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(var2, "husbandry/leash_all_frog_variants");
      class07165.N()
         .N(class03711xxxxxxxxx)
         .N(
            class06570.wx,
            class00392.L("advancements.husbandry.froglights.title"),
            class00392.L("advancements.husbandry.froglights.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N("froglights", class00843.N(class06570.wS, class06570.wD, class06570.wx))
         .N(var2, "husbandry/froglights");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            "silk_touch_nest",
            class05912.N(
               class00869.Ti,
               class00837.N().N(class00159.N().N(class02482.y, class02474.N(List.of(new class00800(class01921xxxxxx.y(class07314.t), class00836.y(1))))).y()),
               class00836.N(3)
            )
         )
         .N(
            class00869.Ti,
            class00392.L("advancements.husbandry.silk_touch_nest.title"),
            class00392.L("advancements.husbandry.silk_touch_nest.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(var2, "husbandry/silk_touch_nest");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.sb,
            class00392.L("advancements.husbandry.ride_a_boat_with_a_goat.title"),
            class00392.L("advancements.husbandry.ride_a_boat_with_a_goat.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "ride_a_boat_with_a_goat",
            class04588.N(class00810.N().N(class00810.N().N(class01921xxxxxx, class01217.K).y(class00810.N().N(class01921xxxxxx, class07078.NW))))
         )
         .N(var2, "husbandry/ride_a_boat_with_a_goat");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.vU,
            class00392.L("advancements.husbandry.make_a_sign_glow.title"),
            class00392.L("advancements.husbandry.make_a_sign_glow.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("make_a_sign_glow", class05920.N(class00818.N().N(class01427.N().N(class01921xx, class01210.Na)), class00837.N().N(class01921x, class06570.vU)))
         .N(var2, "husbandry/make_a_sign_glow");
      class03711 class03711xxxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.vx,
            class00392.L("advancements.husbandry.allay_deliver_item_to_player.title"),
            class00392.L("advancements.husbandry.allay_deliver_item_to_player.description"),
            null,
            class07296.field_1254,
            true,
            true,
            true
         )
         .N(
            "allay_deliver_item_to_player",
            class05202.N(Optional.empty(), Optional.empty(), Optional.of(class00821.N(class00810.N().N(class01921xxxxxx, class07078.i))))
         )
         .N(var2, "husbandry/allay_deliver_item_to_player");
      class07165.N()
         .N(class03711xxxxxxxxxx)
         .N(
            class06570.mM,
            class00392.L("advancements.husbandry.allay_deliver_cake_to_note_block.title"),
            class00392.L("advancements.husbandry.allay_deliver_cake_to_note_block.description"),
            null,
            class07296.field_1254,
            true,
            true,
            true
         )
         .N(
            "allay_deliver_cake_to_note_block",
            class05920.y(class00818.N().N(class01427.N().N(class01921xx, class00869.yR)), class00837.N().N(class01921x, class06570.vI))
         )
         .N(var2, "husbandry/allay_deliver_cake_to_note_block");
      class03711 class03711xxxxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.Ez,
            class00392.L("advancements.husbandry.obtain_sniffer_egg.title"),
            class00392.L("advancements.husbandry.obtain_sniffer_egg.description"),
            null,
            class07296.field_1254,
            true,
            true,
            true
         )
         .N("obtain_sniffer_egg", class00843.N(class06570.Ez))
         .N(var2, "husbandry/obtain_sniffer_egg");
      class03711 class03711xxxxxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxx)
         .N(
            class06570.ll,
            class00392.L("advancements.husbandry.feed_snifflet.title"),
            class00392.L("advancements.husbandry.feed_snifflet.description"),
            null,
            class07296.field_1254,
            true,
            true,
            true
         )
         .N(
            "feed_snifflet",
            class01243.y(
               class00837.N().N(class01921x, class01226.NY),
               Optional.of(class00821.N(class00810.N().N(class01921xxxxxx, class07078.yb).N(class00854.N().M(true))))
            )
         )
         .N(var2, "husbandry/feed_snifflet");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.ld,
            class00392.L("advancements.husbandry.plant_any_sniffer_seed.title"),
            class00392.L("advancements.husbandry.plant_any_sniffer_seed.description"),
            null,
            class07296.field_1254,
            true,
            true,
            true
         )
         .N(class03741.y)
         .N("torchflower", class05920.N(class00869.EG))
         .N("pitcher_pod", class05920.N(class00869.El))
         .N(var2, "husbandry/plant_any_sniffer_seed");
      class07165.N()
         .N(class03711xx)
         .N(
            class06570.vr,
            class00392.L("advancements.husbandry.remove_wolf_armor.title"),
            class00392.L("advancements.husbandry.remove_wolf_armor.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "remove_wolf_armor",
            class01243.N(class00837.N().N(class01921x, class06570.sA), Optional.of(class00821.N(class00810.N().N(class01921xxxxxx, class07078.yC))))
         )
         .N(var2, "husbandry/remove_wolf_armor");
      class07165.N()
         .N(class03711xx)
         .N(
            class06570.sA,
            class00392.L("advancements.husbandry.repair_wolf_armor.title"),
            class00392.L("advancements.husbandry.repair_wolf_armor.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "repair_wolf_armor",
            class01243.y(
               class00837.N().N(class01921x, class06570.sF),
               Optional.of(
                  class00821.N(
                     class00810.N()
                        .N(class01921xxxxxx, class07078.yC)
                        .N(class06124.N().i(class00837.N().N(class01921x, class06570.sA).N(class00159.N().N(class02471.N(class02484.i, 0)).y())))
                  )
               )
            )
         )
         .N(var2, "husbandry/repair_wolf_armor");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.EU,
            class00392.L("advancements.husbandry.place_dried_ghast_in_water.title"),
            class00392.L("advancements.husbandry.place_dried_ghast_in_water.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("place_dried_ghast_in_water", class05920.N(class00869.mu, class06665.q, true))
         .N(var2, "husbandry/place_dried_ghast_in_water");
   }

   private static class07165 N(class02055<class07078<?>> var0, class02055<class06581> var1, class01905<class04068> var2, class07165 var3) {
      N(var2)
         .forEach(
            var3x -> var3.N(
               var3x.B().N().toString(),
               class01243.y(
                  class00837.N().N(var1, class06570.Gr),
                  Optional.of(class00821.N(class00810.N().N(var0, class07078.NR).N(class00159.N().N(class02471.N(class02484.NA, var3x)).y())))
               )
            )
         );
      return var3;
   }
}
