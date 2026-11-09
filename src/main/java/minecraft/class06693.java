package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class class06693 extends class00622 {
   static final Map<String, String> y = ImmutableMap.builder()
      .put("minecraft:armor_stand", "minecraft:armor_stand")
      .put("minecraft:painting", "minecraft:painting")
      .put("minecraft:armadillo_spawn_egg", "minecraft:armadillo")
      .put("minecraft:allay_spawn_egg", "minecraft:allay")
      .put("minecraft:axolotl_spawn_egg", "minecraft:axolotl")
      .put("minecraft:bat_spawn_egg", "minecraft:bat")
      .put("minecraft:bee_spawn_egg", "minecraft:bee")
      .put("minecraft:blaze_spawn_egg", "minecraft:blaze")
      .put("minecraft:bogged_spawn_egg", "minecraft:bogged")
      .put("minecraft:breeze_spawn_egg", "minecraft:breeze")
      .put("minecraft:cat_spawn_egg", "minecraft:cat")
      .put("minecraft:camel_spawn_egg", "minecraft:camel")
      .put("minecraft:cave_spider_spawn_egg", "minecraft:cave_spider")
      .put("minecraft:chicken_spawn_egg", "minecraft:chicken")
      .put("minecraft:cod_spawn_egg", "minecraft:cod")
      .put("minecraft:cow_spawn_egg", "minecraft:cow")
      .put("minecraft:creeper_spawn_egg", "minecraft:creeper")
      .put("minecraft:dolphin_spawn_egg", "minecraft:dolphin")
      .put("minecraft:donkey_spawn_egg", "minecraft:donkey")
      .put("minecraft:drowned_spawn_egg", "minecraft:drowned")
      .put("minecraft:elder_guardian_spawn_egg", "minecraft:elder_guardian")
      .put("minecraft:ender_dragon_spawn_egg", "minecraft:ender_dragon")
      .put("minecraft:enderman_spawn_egg", "minecraft:enderman")
      .put("minecraft:endermite_spawn_egg", "minecraft:endermite")
      .put("minecraft:evoker_spawn_egg", "minecraft:evoker")
      .put("minecraft:fox_spawn_egg", "minecraft:fox")
      .put("minecraft:frog_spawn_egg", "minecraft:frog")
      .put("minecraft:ghast_spawn_egg", "minecraft:ghast")
      .put("minecraft:glow_squid_spawn_egg", "minecraft:glow_squid")
      .put("minecraft:goat_spawn_egg", "minecraft:goat")
      .put("minecraft:guardian_spawn_egg", "minecraft:guardian")
      .put("minecraft:hoglin_spawn_egg", "minecraft:hoglin")
      .put("minecraft:horse_spawn_egg", "minecraft:horse")
      .put("minecraft:husk_spawn_egg", "minecraft:husk")
      .put("minecraft:iron_golem_spawn_egg", "minecraft:iron_golem")
      .put("minecraft:llama_spawn_egg", "minecraft:llama")
      .put("minecraft:magma_cube_spawn_egg", "minecraft:magma_cube")
      .put("minecraft:mooshroom_spawn_egg", "minecraft:mooshroom")
      .put("minecraft:mule_spawn_egg", "minecraft:mule")
      .put("minecraft:ocelot_spawn_egg", "minecraft:ocelot")
      .put("minecraft:panda_spawn_egg", "minecraft:panda")
      .put("minecraft:parrot_spawn_egg", "minecraft:parrot")
      .put("minecraft:phantom_spawn_egg", "minecraft:phantom")
      .put("minecraft:pig_spawn_egg", "minecraft:pig")
      .put("minecraft:piglin_spawn_egg", "minecraft:piglin")
      .put("minecraft:piglin_brute_spawn_egg", "minecraft:piglin_brute")
      .put("minecraft:pillager_spawn_egg", "minecraft:pillager")
      .put("minecraft:polar_bear_spawn_egg", "minecraft:polar_bear")
      .put("minecraft:pufferfish_spawn_egg", "minecraft:pufferfish")
      .put("minecraft:rabbit_spawn_egg", "minecraft:rabbit")
      .put("minecraft:ravager_spawn_egg", "minecraft:ravager")
      .put("minecraft:salmon_spawn_egg", "minecraft:salmon")
      .put("minecraft:sheep_spawn_egg", "minecraft:sheep")
      .put("minecraft:shulker_spawn_egg", "minecraft:shulker")
      .put("minecraft:silverfish_spawn_egg", "minecraft:silverfish")
      .put("minecraft:skeleton_spawn_egg", "minecraft:skeleton")
      .put("minecraft:skeleton_horse_spawn_egg", "minecraft:skeleton_horse")
      .put("minecraft:slime_spawn_egg", "minecraft:slime")
      .put("minecraft:sniffer_spawn_egg", "minecraft:sniffer")
      .put("minecraft:snow_golem_spawn_egg", "minecraft:snow_golem")
      .put("minecraft:spider_spawn_egg", "minecraft:spider")
      .put("minecraft:squid_spawn_egg", "minecraft:squid")
      .put("minecraft:stray_spawn_egg", "minecraft:stray")
      .put("minecraft:strider_spawn_egg", "minecraft:strider")
      .put("minecraft:tadpole_spawn_egg", "minecraft:tadpole")
      .put("minecraft:trader_llama_spawn_egg", "minecraft:trader_llama")
      .put("minecraft:tropical_fish_spawn_egg", "minecraft:tropical_fish")
      .put("minecraft:turtle_spawn_egg", "minecraft:turtle")
      .put("minecraft:vex_spawn_egg", "minecraft:vex")
      .put("minecraft:villager_spawn_egg", "minecraft:villager")
      .put("minecraft:vindicator_spawn_egg", "minecraft:vindicator")
      .put("minecraft:wandering_trader_spawn_egg", "minecraft:wandering_trader")
      .put("minecraft:warden_spawn_egg", "minecraft:warden")
      .put("minecraft:witch_spawn_egg", "minecraft:witch")
      .put("minecraft:wither_spawn_egg", "minecraft:wither")
      .put("minecraft:wither_skeleton_spawn_egg", "minecraft:wither_skeleton")
      .put("minecraft:wolf_spawn_egg", "minecraft:wolf")
      .put("minecraft:zoglin_spawn_egg", "minecraft:zoglin")
      .put("minecraft:zombie_spawn_egg", "minecraft:zombie")
      .put("minecraft:zombie_horse_spawn_egg", "minecraft:zombie_horse")
      .put("minecraft:zombie_villager_spawn_egg", "minecraft:zombie_villager")
      .put("minecraft:zombified_piglin_spawn_egg", "minecraft:zombified_piglin")
      .put("minecraft:item_frame", "minecraft:item_frame")
      .put("minecraft:boat", "minecraft:oak_boat")
      .put("minecraft:oak_boat", "minecraft:oak_boat")
      .put("minecraft:oak_chest_boat", "minecraft:oak_chest_boat")
      .put("minecraft:spruce_boat", "minecraft:spruce_boat")
      .put("minecraft:spruce_chest_boat", "minecraft:spruce_chest_boat")
      .put("minecraft:birch_boat", "minecraft:birch_boat")
      .put("minecraft:birch_chest_boat", "minecraft:birch_chest_boat")
      .put("minecraft:jungle_boat", "minecraft:jungle_boat")
      .put("minecraft:jungle_chest_boat", "minecraft:jungle_chest_boat")
      .put("minecraft:acacia_boat", "minecraft:acacia_boat")
      .put("minecraft:acacia_chest_boat", "minecraft:acacia_chest_boat")
      .put("minecraft:cherry_boat", "minecraft:cherry_boat")
      .put("minecraft:cherry_chest_boat", "minecraft:cherry_chest_boat")
      .put("minecraft:dark_oak_boat", "minecraft:dark_oak_boat")
      .put("minecraft:dark_oak_chest_boat", "minecraft:dark_oak_chest_boat")
      .put("minecraft:mangrove_boat", "minecraft:mangrove_boat")
      .put("minecraft:mangrove_chest_boat", "minecraft:mangrove_chest_boat")
      .put("minecraft:bamboo_raft", "minecraft:bamboo_raft")
      .put("minecraft:bamboo_chest_raft", "minecraft:bamboo_chest_raft")
      .put("minecraft:minecart", "minecraft:minecart")
      .put("minecraft:chest_minecart", "minecraft:chest_minecart")
      .put("minecraft:furnace_minecart", "minecraft:furnace_minecart")
      .put("minecraft:tnt_minecart", "minecraft:tnt_minecart")
      .put("minecraft:hopper_minecart", "minecraft:hopper_minecart")
      .build();
   protected static final HookFunction L = new class06703();

   public class06693(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void y(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("inTile", class06962.q.in(var0)));
   }

   protected static void N(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.registerSimple(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         true,
         class06962.o,
         () -> DSL.and(class06962.g.in(var1), DSL.optionalFields("CustomName", DSL.constType(DSL.string()), DSL.taggedChoiceLazy("id", N(), var2)))
      );
      var1.registerType(
         true, class06962.l, () -> DSL.hook(DSL.optionalFields("id", class06962.K.in(var1), "tag", class06689.y(var1)), L, HookFunction.IDENTITY)
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap hashmap = Maps.newHashMap();
      var1.register(hashmap, "minecraft:area_effect_cloud", var1x -> DSL.optionalFields("Particle", class06962.Q.in(var1)));
      N(var1, hashmap, "minecraft:armor_stand");
      var1.register(hashmap, "minecraft:arrow", var1x -> DSL.optionalFields("inTile", class06962.q.in(var1)));
      N(var1, hashmap, "minecraft:bat");
      N(var1, hashmap, "minecraft:blaze");
      var1.registerSimple(hashmap, "minecraft:boat");
      N(var1, hashmap, "minecraft:cave_spider");
      var1.register(
         hashmap, "minecraft:chest_minecart", var1x -> DSL.optionalFields("DisplayTile", class06962.q.in(var1), "Items", DSL.list(class06962.l.in(var1)))
      );
      N(var1, hashmap, "minecraft:chicken");
      var1.register(
         hashmap, "minecraft:commandblock_minecart", var1x -> DSL.optionalFields("DisplayTile", class06962.q.in(var1), "LastOutput", class06962.O.in(var1))
      );
      N(var1, hashmap, "minecraft:cow");
      N(var1, hashmap, "minecraft:creeper");
      var1.register(hashmap, "minecraft:donkey", var1x -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var1)), "SaddleItem", class06962.l.in(var1)));
      var1.registerSimple(hashmap, "minecraft:dragon_fireball");
      y(var1, hashmap, "minecraft:egg");
      N(var1, hashmap, "minecraft:elder_guardian");
      var1.registerSimple(hashmap, "minecraft:ender_crystal");
      N(var1, hashmap, "minecraft:ender_dragon");
      var1.register(hashmap, "minecraft:enderman", var1x -> DSL.optionalFields("carried", class06962.q.in(var1)));
      N(var1, hashmap, "minecraft:endermite");
      y(var1, hashmap, "minecraft:ender_pearl");
      var1.registerSimple(hashmap, "minecraft:eye_of_ender_signal");
      var1.register(hashmap, "minecraft:falling_block", var1x -> DSL.optionalFields("Block", class06962.q.in(var1), "TileEntityData", class06962.G.in(var1)));
      y(var1, hashmap, "minecraft:fireball");
      var1.register(hashmap, "minecraft:fireworks_rocket", var1x -> DSL.optionalFields("FireworksItem", class06962.l.in(var1)));
      var1.register(hashmap, "minecraft:furnace_minecart", var1x -> DSL.optionalFields("DisplayTile", class06962.q.in(var1)));
      N(var1, hashmap, "minecraft:ghast");
      N(var1, hashmap, "minecraft:giant");
      N(var1, hashmap, "minecraft:guardian");
      var1.register(
         hashmap, "minecraft:hopper_minecart", var1x -> DSL.optionalFields("DisplayTile", class06962.q.in(var1), "Items", DSL.list(class06962.l.in(var1)))
      );
      var1.register(hashmap, "minecraft:horse", var1x -> DSL.optionalFields("ArmorItem", class06962.l.in(var1), "SaddleItem", class06962.l.in(var1)));
      N(var1, hashmap, "minecraft:husk");
      var1.register(hashmap, "minecraft:item", var1x -> DSL.optionalFields("Item", class06962.l.in(var1)));
      var1.register(hashmap, "minecraft:item_frame", var1x -> DSL.optionalFields("Item", class06962.l.in(var1)));
      var1.registerSimple(hashmap, "minecraft:leash_knot");
      N(var1, hashmap, "minecraft:magma_cube");
      var1.register(hashmap, "minecraft:minecart", var1x -> DSL.optionalFields("DisplayTile", class06962.q.in(var1)));
      N(var1, hashmap, "minecraft:mooshroom");
      var1.register(hashmap, "minecraft:mule", var1x -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var1)), "SaddleItem", class06962.l.in(var1)));
      N(var1, hashmap, "minecraft:ocelot");
      var1.registerSimple(hashmap, "minecraft:painting");
      N(var1, hashmap, "minecraft:parrot");
      N(var1, hashmap, "minecraft:pig");
      N(var1, hashmap, "minecraft:polar_bear");
      var1.register(hashmap, "minecraft:potion", var1x -> DSL.optionalFields("Potion", class06962.l.in(var1), "inTile", class06962.q.in(var1)));
      N(var1, hashmap, "minecraft:rabbit");
      N(var1, hashmap, "minecraft:sheep");
      N(var1, hashmap, "minecraft:shulker");
      var1.registerSimple(hashmap, "minecraft:shulker_bullet");
      N(var1, hashmap, "minecraft:silverfish");
      N(var1, hashmap, "minecraft:skeleton");
      var1.register(hashmap, "minecraft:skeleton_horse", var1x -> DSL.optionalFields("SaddleItem", class06962.l.in(var1)));
      N(var1, hashmap, "minecraft:slime");
      y(var1, hashmap, "minecraft:small_fireball");
      y(var1, hashmap, "minecraft:snowball");
      N(var1, hashmap, "minecraft:snowman");
      var1.register(hashmap, "minecraft:spawner_minecart", var1x -> DSL.optionalFields("DisplayTile", class06962.q.in(var1), class06962.e.in(var1)));
      var1.register(hashmap, "minecraft:spectral_arrow", var1x -> DSL.optionalFields("inTile", class06962.q.in(var1)));
      N(var1, hashmap, "minecraft:spider");
      N(var1, hashmap, "minecraft:squid");
      N(var1, hashmap, "minecraft:stray");
      var1.registerSimple(hashmap, "minecraft:tnt");
      var1.register(hashmap, "minecraft:tnt_minecart", var1x -> DSL.optionalFields("DisplayTile", class06962.q.in(var1)));
      var1.register(
         hashmap,
         "minecraft:villager",
         var1x -> DSL.optionalFields("Inventory", DSL.list(class06962.l.in(var1)), "Offers", DSL.optionalFields("Recipes", DSL.list(class06962.Y.in(var1))))
      );
      N(var1, hashmap, "minecraft:villager_golem");
      N(var1, hashmap, "minecraft:witch");
      N(var1, hashmap, "minecraft:wither");
      N(var1, hashmap, "minecraft:wither_skeleton");
      y(var1, hashmap, "minecraft:wither_skull");
      N(var1, hashmap, "minecraft:wolf");
      y(var1, hashmap, "minecraft:xp_bottle");
      var1.registerSimple(hashmap, "minecraft:xp_orb");
      N(var1, hashmap, "minecraft:zombie");
      var1.register(hashmap, "minecraft:zombie_horse", var1x -> DSL.optionalFields("SaddleItem", class06962.l.in(var1)));
      N(var1, hashmap, "minecraft:zombie_pigman");
      var1.register(hashmap, "minecraft:zombie_villager", var1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(class06962.Y.in(var1)))));
      var1.registerSimple(hashmap, "minecraft:evocation_fangs");
      N(var1, hashmap, "minecraft:evocation_illager");
      N(var1, hashmap, "minecraft:illusion_illager");
      var1.register(
         hashmap,
         "minecraft:llama",
         var1x -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var1)), "SaddleItem", class06962.l.in(var1), "DecorItem", class06962.l.in(var1))
      );
      var1.registerSimple(hashmap, "minecraft:llama_spit");
      N(var1, hashmap, "minecraft:vex");
      N(var1, hashmap, "minecraft:vindication_illager");
      return hashmap;
   }
}
