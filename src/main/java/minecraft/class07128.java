package minecraft;

import java.util.function.Consumer;

public class class07128 implements class02026 {
   public class07128() {
      super();
   }

   @Override
   public void N(class01929 var1, Consumer<class03711> var2) {
      class01921 class01921 = var1.y(class04227.F);
      class03711 class03711xxxxxxxxxx = class07165.N()
         .N(
            class00869.Z,
            class00392.L("advancements.story.root.title"),
            class00392.L("advancements.story.root.description"),
            class01894.y("gui/advancements/backgrounds/stone"),
            class07296.field_1254,
            false,
            false,
            false
         )
         .N("crafting_table", class00843.N(class00869.LD))
         .N(var2, "story/root");
      class03711 class03711x = class07165.N()
         .N(class03711xxxxxxxxxx)
         .N(
            class06570.Ts,
            class00392.L("advancements.story.mine_stone.title"),
            class00392.L("advancements.story.mine_stone.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("get_stone", class00843.N(class00837.N().N(class01921, class01226.yG)))
         .N(var2, "story/mine_stone");
      class03711 class03711xx = class07165.N()
         .N(class03711x)
         .N(
            class06570.Tw,
            class00392.L("advancements.story.upgrade_tools.title"),
            class00392.L("advancements.story.upgrade_tools.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("stone_pickaxe", class00843.N(class06570.Tw))
         .N(var2, "story/upgrade_tools");
      class03711 class03711xxx = class07165.N()
         .N(class03711xx)
         .N(
            class06570.TM,
            class00392.L("advancements.story.smelt_iron.title"),
            class00392.L("advancements.story.smelt_iron.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("iron", class00843.N(class06570.TM))
         .N(var2, "story/smelt_iron");
      class03711 class03711xxxx = class07165.N()
         .N(class03711xxx)
         .N(
            class06570.TK,
            class00392.L("advancements.story.iron_tools.title"),
            class00392.L("advancements.story.iron_tools.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("iron_pickaxe", class00843.N(class06570.TK))
         .N(var2, "story/iron_tools");
      class03711 class03711xxxxx = class07165.N()
         .N(class03711xxxx)
         .N(
            class06570.TN,
            class00392.L("advancements.story.mine_diamond.title"),
            class00392.L("advancements.story.mine_diamond.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("diamond", class00843.N(class06570.TN))
         .N(var2, "story/mine_diamond");
      class03711 class03711xxxxxx = class07165.N()
         .N(class03711xxx)
         .N(
            class06570.jW,
            class00392.L("advancements.story.lava_bucket.title"),
            class00392.L("advancements.story.lava_bucket.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("lava_bucket", class00843.N(class06570.jW))
         .N(var2, "story/lava_bucket");
      class03711 class03711xxxxxxx = class07165.N()
         .N(class03711xxx)
         .N(
            class06570.bb,
            class00392.L("advancements.story.obtain_armor.title"),
            class00392.L("advancements.story.obtain_armor.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(class03741.y)
         .N("iron_helmet", class00843.N(class06570.bT))
         .N("iron_chestplate", class00843.N(class06570.bb))
         .N("iron_leggings", class00843.N(class06570.bj))
         .N("iron_boots", class00843.N(class06570.bv))
         .N(var2, "story/obtain_armor");
      class07165.N()
         .N(class03711xxxxx)
         .N(
            class06570.Gq,
            class00392.L("advancements.story.enchant_item.title"),
            class00392.L("advancements.story.enchant_item.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("enchanted_item", class00791.y())
         .N(var2, "story/enchant_item");
      class03711 class03711xxxxxxxx = class07165.N()
         .N(class03711xxxxxx)
         .N(
            class00869.LV,
            class00392.L("advancements.story.form_obsidian.title"),
            class00392.L("advancements.story.form_obsidian.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("obsidian", class00843.N(class00869.LV))
         .N(var2, "story/form_obsidian");
      class07165.N()
         .N(class03711xxxxxxx)
         .N(
            class06570.lo,
            class00392.L("advancements.story.deflect_arrow.title"),
            class00392.L("advancements.story.deflect_arrow.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("deflected_projectile", class00826.N(class00764.N().N(class00789.N().N(class03659.N(class03696.z))).N(true)))
         .N(var2, "story/deflect_arrow");
      class07165.N()
         .N(class03711xxxxx)
         .N(
            class06570.bt,
            class00392.L("advancements.story.shiny_gear.title"),
            class00392.L("advancements.story.shiny_gear.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N(class03741.y)
         .N("diamond_helmet", class00843.N(class06570.bn))
         .N("diamond_chestplate", class00843.N(class06570.bt))
         .N("diamond_leggings", class00843.N(class06570.bG))
         .N("diamond_boots", class00843.N(class06570.bl))
         .N(var2, "story/shiny_gear");
      class03711 class03711xxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxx)
         .N(
            class06570.sf,
            class00392.L("advancements.story.enter_the_nether.title"),
            class00392.L("advancements.story.enter_the_nether.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("entered_nether", class00767.N(class07299.field_25180))
         .N(var2, "story/enter_the_nether");
      class07165.N()
         .N(class03711xxxxxxxxx)
         .N(
            class06570.bV,
            class00392.L("advancements.story.cure_zombie_villager.title"),
            class00392.L("advancements.story.cure_zombie_villager.description"),
            null,
            class07296.field_1249,
            true,
            true,
            false
         )
         .N("cured_zombie", class00784.y())
         .N(var2, "story/cure_zombie_villager");
      class03711 class03711xxxxxxxxxx = class07165.N()
         .N(class03711xxxxxxxxx)
         .N(
            class06570.nG,
            class00392.L("advancements.story.follow_ender_eye.title"),
            class00392.L("advancements.story.follow_ender_eye.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("in_stronghold", class07682.N(class00818.y(var1.y(class04227.yj).y(class04433.U))))
         .N(var2, "story/follow_ender_eye");
      class07165.N()
         .N(class03711xxxxxxxxxx)
         .N(
            class00869.MP,
            class00392.L("advancements.story.enter_the_end.title"),
            class00392.L("advancements.story.enter_the_end.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("entered_end", class00767.N(class07299.field_25181))
         .N(var2, "story/enter_the_end");
   }
}
