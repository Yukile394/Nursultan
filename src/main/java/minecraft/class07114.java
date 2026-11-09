package minecraft;

import Nursultan.class10758;
import java.util.Optional;
import java.util.function.Consumer;

public class class07114 implements class02026 {
   public class07114() {
      super();
   }

   @Override
   public void N(class01929 var1, Consumer<class03711> var2) {
      class01921 class01921xx = var1.y(class04227.I);
      class01921 class01921x = var1.y(class04227.F);
      class01921 class01921xx = var1.y(class04227.Z);
      class03711 class03711xxxxxxxxxxxx = class07165.N()
         .N(
            class00869.Eo,
            class00392.L("advancements.nether.root.title"),
            class00392.L("advancements.nether.root.description"),
            class01894.y("gui/advancements/backgrounds/nether"),
            class07296.field_1254,
            false,
            false,
            false
         )
         .N("entered_nether", class00767.N(class07299.field_25180))
         .N(var2, "nether/root");
      class03711 class03711x = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.GZ,
            class00392.L("advancements.nether.return_to_sender.title"),
            class00392.L("advancements.nether.return_to_sender.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(50))
         .N(
            "killed_ghast",
            class00825.N(
               class00810.N().N(class01921xx, class07078.NB), class00789.N().N(class03659.N(class03696.z)).N(class00810.N().N(class01921xx, class07078.NL))
            )
         )
         .N(var2, "nether/return_to_sender");
      class03711 class03711xx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class00869.ML,
            class00392.L("advancements.nether.find_fortress.title"),
            class00392.L("advancements.nether.find_fortress.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("fortress", class07682.N(class00818.y(var1.y(class04227.yj).y(class04433.P))))
         .N(var2, "nether/find_fortress");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.Gt,
            class00392.L("advancements.nether.fast_travel.title"),
            class00392.L("advancements.nether.fast_travel.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(100))
         .N("travelled", class00811.N(class00761.N(class00816.y(7000.0))))
         .N(var2, "nether/fast_travel");
      class07165.N()
         .N(class03711x)
         .N(
            class06570.nE,
            class00392.L("advancements.nether.uneasy_alliance.title"),
            class00392.L("advancements.nether.uneasy_alliance.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(100))
         .N("killed_ghast", class00825.N(class00810.N().N(class01921xx, class07078.NB).N(class00818.N(class07299.field_25179))))
         .N(var2, "nether/uneasy_alliance");
      class03711 class03711xxx = class07165.N()
         .N(class03711xx)
         .N(
            class00869.Bl,
            class00392.L("advancements.nether.get_wither_skull.title"),
            class00392.L("advancements.nether.get_wither_skull.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("wither_skull", class00843.N(class00869.Bl))
         .N(var2, "nether/get_wither_skull");
      class03711 class03711xxxx = class07165.N()
         .N(class03711xxx)
         .N(
            class06570.Gg,
            class00392.L("advancements.nether.summon_wither.title"),
            class00392.L("advancements.nether.summon_wither.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("summoned", class07691.N(class00810.N().N(class01921xx, class07078.yF)))
         .N(var2, "nether/summon_wither");
      class03711 class03711xxxxx = class07165.N()
         .N(class03711xx)
         .N(
            class06570.nU,
            class00392.L("advancements.nether.obtain_blaze_rod.title"),
            class00392.L("advancements.nether.obtain_blaze_rod.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("blaze_rod", class00843.N(class06570.nU))
         .N(var2, "nether/obtain_blaze_rod");
      class03711 class03711xxxxxx = class07165.N()
         .N(class03711xxxx)
         .N(
            class00869.MO,
            class00392.L("advancements.nether.create_beacon.title"),
            class00392.L("advancements.nether.create_beacon.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("beacon", class00779.N(class00836.y(1)))
         .N(var2, "nether/create_beacon");
      class07165.N()
         .N(class03711xxxxxx)
         .N(
            class00869.MO,
            class00392.L("advancements.nether.create_full_beacon.title"),
            class00392.L("advancements.nether.create_full_beacon.description"),
            null,
            class07296.field_1249,
            true,
            true,
            false
         )
         .N("beacon", class00779.N(class00836.N(4)))
         .N(var2, "nether/create_full_beacon");
      class03711 class03711xxxxxxx = class07165.N()
         .N(class03711xxxxx)
         .N(
            class06570.ns,
            class00392.L("advancements.nether.brew_potion.title"),
            class00392.L("advancements.nether.brew_potion.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("potion", class00773.y())
         .N(var2, "nether/brew_potion");
      class03711 class03711xxxxxxxx = class07165.N()
         .N(class03711xxxxxxx)
         .N(
            class06570.jT,
            class00392.L("advancements.nether.all_potions.title"),
            class00392.L("advancements.nether.all_potions.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(100))
         .N(
            "all_effects",
            class00806.N(
               class00814.N()
                  .N(class07047.N)
                  .N(class07047.y)
                  .N(class07047.i)
                  .N(class07047.B)
                  .N(class07047.z)
                  .N(class07047.E)
                  .N(class07047.W)
                  .N(class07047.m)
                  .N(class07047.s)
                  .N(class07047.b)
                  .N(class07047.j)
                  .N(class07047.Y)
                  .N(class07047.U)
                  .N(class07047.e)
                  .N(class07047.H)
                  .N(class07047.K)
                  .N(class07047.V)
            )
         )
         .N(var2, "nether/all_potions");
      class07165.N()
         .N(class03711xxxxxxxx)
         .N(
            class06570.jU,
            class00392.L("advancements.nether.all_effects.title"),
            class00392.L("advancements.nether.all_effects.description"),
            null,
            class07296.field_1250,
            true,
            true,
            true
         )
         .N(class10758.N(1000))
         .N(
            "all_effects",
            class00806.N(
               class00814.N()
                  .N(class07047.N)
                  .N(class07047.y)
                  .N(class07047.i)
                  .N(class07047.B)
                  .N(class07047.z)
                  .N(class07047.E)
                  .N(class07047.W)
                  .N(class07047.m)
                  .N(class07047.s)
                  .N(class07047.b)
                  .N(class07047.j)
                  .N(class07047.v)
                  .N(class07047.L)
                  .N(class07047.u)
                  .N(class07047.d)
                  .N(class07047.l)
                  .N(class07047.t)
                  .N(class07047.T)
                  .N(class07047.Z)
                  .N(class07047.U)
                  .N(class07047.Y)
                  .N(class07047.Q)
                  .N(class07047.O)
                  .N(class07047.P)
                  .N(class07047.g)
                  .N(class07047.I)
                  .N(class07047.J)
                  .N(class07047.e)
                  .N(class07047.H)
                  .N(class07047.K)
                  .N(class07047.V)
                  .N(class07047.o)
                  .N(class07047.q)
                  .N(class07047.c)
            )
         )
         .N(var2, "nether/all_effects");
      class03711 class03711xxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.Ng,
            class00392.L("advancements.nether.obtain_ancient_debris.title"),
            class00392.L("advancements.nether.obtain_ancient_debris.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("ancient_debris", class00843.N(class06570.Ng))
         .N(var2, "nether/obtain_ancient_debris");
      class07165.N()
         .N(class03711xxxxxxxxx)
         .N(
            class06570.bO,
            class00392.L("advancements.nether.netherite_armor.title"),
            class00392.L("advancements.nether.netherite_armor.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(100))
         .N("netherite_armor", class00843.N(class06570.bQ, class06570.bO, class06570.bg, class06570.bI))
         .N(var2, "nether/netherite_armor");
      class03711 class03711xxxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.wE,
            class00392.L("advancements.nether.obtain_crying_obsidian.title"),
            class00392.L("advancements.nether.obtain_crying_obsidian.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("crying_obsidian", class00843.N(class06570.wE))
         .N(var2, "nether/obtain_crying_obsidian");
      class07165.N()
         .N(class03711xxxxxxxxxx)
         .N(
            class06570.wd,
            class00392.L("advancements.nether.charge_respawn_anchor.title"),
            class00392.L("advancements.nether.charge_respawn_anchor.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "charge_respawn_anchor",
            class05920.N(
               class00818.N().N(class01427.N().N(class01921xx, class00869.TE).N(class01408.N().N(class01338.u, 4))),
               class00837.N().N(class01921x, class00869.io)
            )
         )
         .N(var2, "nether/charge_respawn_anchor");
      class03711 class03711xxxxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.sP,
            class00392.L("advancements.nether.ride_strider.title"),
            class00392.L("advancements.nether.ride_strider.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "used_warped_fungus_on_a_stick",
            class00853.N(
               Optional.of(class00821.N(class00810.N().N(class00810.N().N(class01921xx, class07078.yY)))),
               Optional.of(class00837.N().N(class01921x, class06570.sP).y()),
               class00836.L
            )
         )
         .N(var2, "nether/ride_strider");
      class07165.N()
         .N(class03711xxxxxxxxxxx)
         .N(
            class06570.sP,
            class00392.L("advancements.nether.ride_strider_in_overworld_lava.title"),
            class00392.L("advancements.nether.ride_strider_in_overworld_lava.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "ride_entity_distance",
            class00811.N(
               class00810.N().N(class00818.N(class07299.field_25179)).N(class00810.N().N(class01921xx, class07078.yY)), class00761.N(class00816.y(50.0))
            )
         )
         .N(var2, "nether/ride_strider_in_overworld_lava");
      class07118.N(class07165.N(), var1, class03562.y.N().toList())
         .N(class03711xxxxxxxxxxx)
         .N(
            class06570.bI,
            class00392.L("advancements.nether.explore_nether.title"),
            class00392.L("advancements.nether.explore_nether.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(500))
         .N(var2, "nether/explore_nether");
      class03711 class03711xxxxxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class06570.wn,
            class00392.L("advancements.nether.find_bastion.title"),
            class00392.L("advancements.nether.find_bastion.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("bastion", class07682.N(class00818.y(var1.y(class04227.yj).y(class04433.j))))
         .N(var2, "nether/find_bastion");
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(
            class00869.LA,
            class00392.L("advancements.nether.loot_bastion.title"),
            class00392.L("advancements.nether.loot_bastion.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(class03741.y)
         .N("loot_bastion_other", class05947.N(class06273.e))
         .N("loot_bastion_treasure", class05947.N(class06273.V))
         .N("loot_bastion_hoglin_stable", class05947.N(class06273.c))
         .N("loot_bastion_bridge", class05947.N(class06273.H))
         .N(var2, "nether/loot_bastion");
      class05196 class05196 = class05196.N(
         class07700.N(class05919.field_935, class00810.N().N(class06124.N().N(class00837.N().N(class01921x, class01226.NG)))).y().build(),
         class07700.N(class05919.field_935, class00810.N().N(class06124.N().y(class00837.N().N(class01921x, class01226.NG)))).y().build(),
         class07700.N(class05919.field_935, class00810.N().N(class06124.N().L(class00837.N().N(class01921x, class01226.NG)))).y().build(),
         class07700.N(class05919.field_935, class00810.N().N(class06124.N().u(class00837.N().N(class01921x, class01226.NG)))).y().build()
      );
      class07165.N()
         .N(class03711xxxxxxxxxxxx)
         .N(class03741.y)
         .N(
            class06570.TU,
            class00392.L("advancements.nether.distract_piglin.title"),
            class00392.L("advancements.nether.distract_piglin.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(
            "distract_piglin",
            class05202.N(
               class05196,
               Optional.of(class00837.N().N(class01921x, class01226.Nn).y()),
               Optional.of(class00821.N(class00810.N().N(class01921xx, class07078.Nr).N(class00854.N().M(false))))
            )
         )
         .N(
            "distract_piglin_directly",
            class01243.N(
               Optional.of(class05196),
               class00837.N().N(class01921x, class01514.L),
               Optional.of(class00821.N(class00810.N().N(class01921xx, class07078.Nr).N(class00854.N().M(false))))
            )
         )
         .N(var2, "nether/distract_piglin");
   }
}
