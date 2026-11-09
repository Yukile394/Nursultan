package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class class06536 extends class00622 {
   public class06536(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void y(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> class08380.N(var0));
   }

   protected static void N(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.registerSimple(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      HashMap hashmap = Maps.newHashMap();
      y(var1, hashmap, "minecraft:furnace");
      y(var1, hashmap, "minecraft:chest");
      y(var1, hashmap, "minecraft:trapped_chest");
      var1.registerSimple(hashmap, "minecraft:ender_chest");
      var1.register(hashmap, "minecraft:jukebox", var1x -> DSL.optionalFields("RecordItem", class06962.l.in(var1)));
      y(var1, hashmap, "minecraft:dispenser");
      y(var1, hashmap, "minecraft:dropper");
      var1.register(hashmap, "minecraft:sign", () -> class06689.N(var1));
      var1.register(hashmap, "minecraft:mob_spawner", var1x -> class06962.e.in(var1));
      var1.register(hashmap, "minecraft:piston", var1x -> DSL.optionalFields("blockState", class06962.d.in(var1)));
      y(var1, hashmap, "minecraft:brewing_stand");
      var1.register(hashmap, "minecraft:enchanting_table", () -> class08380.y(var1));
      var1.registerSimple(hashmap, "minecraft:end_portal");
      var1.register(hashmap, "minecraft:beacon", () -> class08380.y(var1));
      var1.register(hashmap, "minecraft:skull", () -> DSL.optionalFields("custom_name", class06962.O.in(var1)));
      var1.registerSimple(hashmap, "minecraft:daylight_detector");
      y(var1, hashmap, "minecraft:hopper");
      var1.registerSimple(hashmap, "minecraft:comparator");
      var1.register(hashmap, "minecraft:banner", () -> class08380.y(var1));
      var1.registerSimple(hashmap, "minecraft:structure_block");
      var1.registerSimple(hashmap, "minecraft:end_gateway");
      var1.register(hashmap, "minecraft:command_block", () -> DSL.optionalFields("LastOutput", class06962.O.in(var1)));
      y(var1, hashmap, "minecraft:shulker_box");
      var1.registerSimple(hashmap, "minecraft:bed");
      return hashmap;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      var1.registerType(
         false,
         class06962.N,
         () -> DSL.optionalFields("CustomBossEvents", DSL.compoundList(DSL.optionalFields("Name", class06962.O.in(var1))), class06962.y.in(var1))
      );
      var1.registerType(false, class06962.y, DSL::remainder);
      var1.registerType(false, class06962.a, () -> DSL.constType(N()));
      var1.registerType(
         false,
         class06962.L,
         () -> DSL.optionalFields(
            new Pair[]{
               Pair.of("RootVehicle", DSL.optionalFields("Entity", class06962.J.in(var1))),
               Pair.of("ender_pearls", DSL.list(class06962.J.in(var1))),
               Pair.of("Inventory", DSL.list(class06962.l.in(var1))),
               Pair.of("EnderItems", DSL.list(class06962.l.in(var1))),
               Pair.of("ShoulderEntityLeft", class06962.J.in(var1)),
               Pair.of("ShoulderEntityRight", class06962.J.in(var1)),
               Pair.of("recipeBook", DSL.optionalFields("recipes", DSL.list(class06962.a.in(var1)), "toBeDisplayed", DSL.list(class06962.a.in(var1))))
            }
         )
      );
      var1.registerType(
         false,
         class06962.u,
         () -> DSL.fields(
            "Level",
            DSL.optionalFields(
               "Entities",
               DSL.list(class06962.J.in(var1)),
               "TileEntities",
               DSL.list(DSL.or(class06962.G.in(var1), DSL.remainder())),
               "TileTicks",
               DSL.list(DSL.fields("i", class06962.q.in(var1))),
               "Sections",
               DSL.list(DSL.optionalFields("Palette", DSL.list(class06962.d.in(var1))))
            )
         )
      );
      var1.registerType(true, class06962.G, () -> DSL.optionalFields("components", class06962.k.in(var1), DSL.taggedChoiceLazy("id", N(), var3)));
      var1.registerType(true, class06962.J, () -> DSL.optionalFields("Passengers", DSL.list(class06962.J.in(var1)), class06962.o.in(var1)));
      var1.registerType(
         true,
         class06962.o,
         () -> DSL.and(class06962.g.in(var1), DSL.optionalFields("CustomName", class06962.O.in(var1), DSL.taggedChoiceLazy("id", N(), var2)))
      );
      var1.registerType(
         true, class06962.l, () -> DSL.hook(DSL.optionalFields("id", class06962.K.in(var1), "tag", class06689.y(var1)), class06693.L, HookFunction.IDENTITY)
      );
      var1.registerType(false, class06962.i, () -> DSL.compoundList(DSL.list(class06962.l.in(var1))));
      var1.registerType(false, class06962.R, DSL::remainder);
      var1.registerType(
         false,
         class06962.M,
         () -> DSL.optionalFields(
            "entities",
            DSL.list(DSL.optionalFields("nbt", class06962.J.in(var1))),
            "blocks",
            DSL.list(DSL.optionalFields("nbt", class06962.G.in(var1))),
            "palette",
            DSL.list(class06962.d.in(var1))
         )
      );
      var1.registerType(false, class06962.q, () -> DSL.constType(N()));
      var1.registerType(false, class06962.K, () -> DSL.constType(N()));
      var1.registerType(false, class06962.d, DSL::remainder);
      var1.registerType(false, class06962.w, DSL::remainder);
      Supplier supplier = () -> DSL.compoundList(class06962.K.in(var1), DSL.constType(DSL.intType()));
      var1.registerType(
         false,
         class06962.B,
         () -> DSL.optionalFields(
            "stats",
            DSL.optionalFields(
               new Pair[]{
                  Pair.of("minecraft:mined", DSL.compoundList(class06962.q.in(var1), DSL.constType(DSL.intType()))),
                  Pair.of("minecraft:crafted", (TypeTemplate)supplier.get()),
                  Pair.of("minecraft:used", (TypeTemplate)supplier.get()),
                  Pair.of("minecraft:broken", (TypeTemplate)supplier.get()),
                  Pair.of("minecraft:picked_up", (TypeTemplate)supplier.get()),
                  Pair.of("minecraft:dropped", (TypeTemplate)supplier.get()),
                  Pair.of("minecraft:killed", DSL.compoundList(class06962.I.in(var1), DSL.constType(DSL.intType()))),
                  Pair.of("minecraft:killed_by", DSL.compoundList(class06962.I.in(var1), DSL.constType(DSL.intType()))),
                  Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(N()), DSL.constType(DSL.intType())))
               }
            )
         )
      );
      var1.registerType(false, class06962.Z, DSL::remainder);
      var1.registerType(false, class06962.z, DSL::remainder);
      var1.registerType(
         false, class06962.U, () -> DSL.optionalFields("data", DSL.optionalFields("banners", DSL.list(DSL.optionalFields("Name", class06962.O.in(var1)))))
      );
      var1.registerType(false, class06962.E, DSL::remainder);
      var1.registerType(false, class06962.W, DSL::remainder);
      var1.registerType(false, class06962.m, DSL::remainder);
      var1.registerType(
         false,
         class06962.P,
         () -> DSL.optionalFields(
            "data",
            DSL.optionalFields(
               "Objectives",
               DSL.list(class06962.c.in(var1)),
               "Teams",
               DSL.list(class06962.X.in(var1)),
               "PlayerScores",
               DSL.list(DSL.optionalFields("display", class06962.O.in(var1)))
            )
         )
      );
      var1.registerType(false, class06962.s, DSL::remainder);
      var1.registerType(false, class06962.T, () -> DSL.optionalFields("data", DSL.optionalFields("Features", DSL.compoundList(class06962.H.in(var1)))));
      var1.registerType(false, class06962.b, DSL::remainder);
      var1.registerType(false, class06962.t, DSL::remainder);
      var1.registerType(false, class06962.H, DSL::remainder);
      Map map = class06534.N(var1);
      var1.registerType(
         false,
         class06962.c,
         () -> DSL.hook(
            DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), map), "DisplayName", class06962.O.in(var1)),
            class06534.L,
            class06534.u
         )
      );
      var1.registerType(
         false,
         class06962.X,
         () -> DSL.optionalFields("MemberNamePrefix", class06962.O.in(var1), "MemberNameSuffix", class06962.O.in(var1), "DisplayName", class06962.O.in(var1))
      );
      var1.registerType(
         true,
         class06962.e,
         () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", class06962.J.in(var1))), "SpawnData", class06962.J.in(var1))
      );
      var1.registerType(
         false,
         class06962.j,
         () -> DSL.optionalFields(
            "minecraft:adventure/adventuring_time",
            DSL.optionalFields("criteria", DSL.compoundList(class06962.p.in(var1), DSL.constType(DSL.string()))),
            "minecraft:adventure/kill_a_mob",
            DSL.optionalFields("criteria", DSL.compoundList(class06962.I.in(var1), DSL.constType(DSL.string()))),
            "minecraft:adventure/kill_all_mobs",
            DSL.optionalFields("criteria", DSL.compoundList(class06962.I.in(var1), DSL.constType(DSL.string()))),
            "minecraft:husbandry/bred_all_animals",
            DSL.optionalFields("criteria", DSL.compoundList(class06962.I.in(var1), DSL.constType(DSL.string())))
         )
      );
      var1.registerType(false, class06962.p, () -> DSL.constType(N()));
      var1.registerType(false, class06962.I, () -> DSL.constType(N()));
      var1.registerType(false, class06962.v, DSL::remainder);
      var1.registerType(false, class06962.A, DSL::remainder);
      var1.registerType(false, class06962.n, () -> DSL.optionalFields("Entities", DSL.list(class06962.J.in(var1))));
      var1.registerType(true, class06962.k, DSL::remainder);
      var1.registerType(
         true, class06962.Y, () -> DSL.optionalFields("buy", class06962.l.in(var1), "buyB", class06962.l.in(var1), "sell", class06962.l.in(var1))
      );
      var1.registerType(true, class06962.Q, () -> DSL.constType(DSL.string()));
      var1.registerType(true, class06962.O, () -> DSL.constType(DSL.string()));
      var1.registerType(
         true,
         class06962.g,
         () -> DSL.and(
            DSL.optional(DSL.field("ArmorItems", DSL.list(class06962.l.in(var1)))),
            new TypeTemplate[]{
               DSL.optional(DSL.field("HandItems", DSL.list(class06962.l.in(var1)))),
               DSL.optional(DSL.field("body_armor_item", class06962.l.in(var1))),
               DSL.optional(DSL.field("saddle", class06962.l.in(var1)))
            }
         )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap hashmap = Maps.newHashMap();
      var1.register(hashmap, "minecraft:area_effect_cloud", var1x -> DSL.optionalFields("Particle", class06962.Q.in(var1)));
      N(var1, hashmap, "minecraft:armor_stand");
      var1.register(hashmap, "minecraft:arrow", var1x -> DSL.optionalFields("inBlockState", class06962.d.in(var1)));
      N(var1, hashmap, "minecraft:bat");
      N(var1, hashmap, "minecraft:blaze");
      var1.registerSimple(hashmap, "minecraft:boat");
      N(var1, hashmap, "minecraft:cave_spider");
      var1.register(
         hashmap, "minecraft:chest_minecart", var1x -> DSL.optionalFields("DisplayState", class06962.d.in(var1), "Items", DSL.list(class06962.l.in(var1)))
      );
      N(var1, hashmap, "minecraft:chicken");
      var1.register(
         hashmap, "minecraft:commandblock_minecart", var1x -> DSL.optionalFields("DisplayState", class06962.d.in(var1), "LastOutput", class06962.O.in(var1))
      );
      N(var1, hashmap, "minecraft:cow");
      N(var1, hashmap, "minecraft:creeper");
      var1.register(hashmap, "minecraft:donkey", var1x -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var1)), "SaddleItem", class06962.l.in(var1)));
      var1.registerSimple(hashmap, "minecraft:dragon_fireball");
      var1.registerSimple(hashmap, "minecraft:egg");
      N(var1, hashmap, "minecraft:elder_guardian");
      var1.registerSimple(hashmap, "minecraft:ender_crystal");
      N(var1, hashmap, "minecraft:ender_dragon");
      var1.register(hashmap, "minecraft:enderman", var1x -> DSL.optionalFields("carriedBlockState", class06962.d.in(var1)));
      N(var1, hashmap, "minecraft:endermite");
      var1.registerSimple(hashmap, "minecraft:ender_pearl");
      var1.registerSimple(hashmap, "minecraft:evocation_fangs");
      N(var1, hashmap, "minecraft:evocation_illager");
      var1.registerSimple(hashmap, "minecraft:eye_of_ender_signal");
      var1.register(
         hashmap, "minecraft:falling_block", var1x -> DSL.optionalFields("BlockState", class06962.d.in(var1), "TileEntityData", class06962.G.in(var1))
      );
      var1.registerSimple(hashmap, "minecraft:fireball");
      var1.register(hashmap, "minecraft:fireworks_rocket", var1x -> DSL.optionalFields("FireworksItem", class06962.l.in(var1)));
      var1.register(hashmap, "minecraft:furnace_minecart", var1x -> DSL.optionalFields("DisplayState", class06962.d.in(var1)));
      N(var1, hashmap, "minecraft:ghast");
      N(var1, hashmap, "minecraft:giant");
      N(var1, hashmap, "minecraft:guardian");
      var1.register(
         hashmap, "minecraft:hopper_minecart", var1x -> DSL.optionalFields("DisplayState", class06962.d.in(var1), "Items", DSL.list(class06962.l.in(var1)))
      );
      var1.register(hashmap, "minecraft:horse", var1x -> DSL.optionalFields("ArmorItem", class06962.l.in(var1), "SaddleItem", class06962.l.in(var1)));
      N(var1, hashmap, "minecraft:husk");
      N(var1, hashmap, "minecraft:illusion_illager");
      var1.register(hashmap, "minecraft:item", var1x -> DSL.optionalFields("Item", class06962.l.in(var1)));
      var1.register(hashmap, "minecraft:item_frame", var1x -> DSL.optionalFields("Item", class06962.l.in(var1)));
      var1.registerSimple(hashmap, "minecraft:leash_knot");
      var1.register(
         hashmap,
         "minecraft:llama",
         var1x -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var1)), "SaddleItem", class06962.l.in(var1), "DecorItem", class06962.l.in(var1))
      );
      var1.registerSimple(hashmap, "minecraft:llama_spit");
      N(var1, hashmap, "minecraft:magma_cube");
      var1.register(hashmap, "minecraft:minecart", var1x -> DSL.optionalFields("DisplayState", class06962.d.in(var1)));
      N(var1, hashmap, "minecraft:mooshroom");
      var1.register(hashmap, "minecraft:mule", var1x -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var1)), "SaddleItem", class06962.l.in(var1)));
      N(var1, hashmap, "minecraft:ocelot");
      var1.registerSimple(hashmap, "minecraft:painting");
      N(var1, hashmap, "minecraft:parrot");
      N(var1, hashmap, "minecraft:pig");
      N(var1, hashmap, "minecraft:polar_bear");
      var1.register(hashmap, "minecraft:potion", var1x -> DSL.optionalFields("Potion", class06962.l.in(var1)));
      N(var1, hashmap, "minecraft:rabbit");
      N(var1, hashmap, "minecraft:sheep");
      N(var1, hashmap, "minecraft:shulker");
      var1.registerSimple(hashmap, "minecraft:shulker_bullet");
      N(var1, hashmap, "minecraft:silverfish");
      N(var1, hashmap, "minecraft:skeleton");
      var1.register(hashmap, "minecraft:skeleton_horse", var1x -> DSL.optionalFields("SaddleItem", class06962.l.in(var1)));
      N(var1, hashmap, "minecraft:slime");
      var1.registerSimple(hashmap, "minecraft:small_fireball");
      var1.registerSimple(hashmap, "minecraft:snowball");
      N(var1, hashmap, "minecraft:snowman");
      var1.register(hashmap, "minecraft:spawner_minecart", var1x -> DSL.optionalFields("DisplayState", class06962.d.in(var1), class06962.e.in(var1)));
      var1.register(hashmap, "minecraft:spectral_arrow", var1x -> DSL.optionalFields("inBlockState", class06962.d.in(var1)));
      N(var1, hashmap, "minecraft:spider");
      N(var1, hashmap, "minecraft:squid");
      N(var1, hashmap, "minecraft:stray");
      var1.registerSimple(hashmap, "minecraft:tnt");
      var1.register(hashmap, "minecraft:tnt_minecart", var1x -> DSL.optionalFields("DisplayState", class06962.d.in(var1)));
      N(var1, hashmap, "minecraft:vex");
      var1.register(
         hashmap,
         "minecraft:villager",
         var1x -> DSL.optionalFields("Inventory", DSL.list(class06962.l.in(var1)), "Offers", DSL.optionalFields("Recipes", DSL.list(class06962.Y.in(var1))))
      );
      N(var1, hashmap, "minecraft:villager_golem");
      N(var1, hashmap, "minecraft:vindication_illager");
      N(var1, hashmap, "minecraft:witch");
      N(var1, hashmap, "minecraft:wither");
      N(var1, hashmap, "minecraft:wither_skeleton");
      var1.registerSimple(hashmap, "minecraft:wither_skull");
      N(var1, hashmap, "minecraft:wolf");
      var1.registerSimple(hashmap, "minecraft:xp_bottle");
      var1.registerSimple(hashmap, "minecraft:xp_orb");
      N(var1, hashmap, "minecraft:zombie");
      var1.register(hashmap, "minecraft:zombie_horse", var1x -> DSL.optionalFields("SaddleItem", class06962.l.in(var1)));
      N(var1, hashmap, "minecraft:zombie_pigman");
      var1.register(hashmap, "minecraft:zombie_villager", var1x -> DSL.optionalFields("Offers", DSL.optionalFields("Recipes", DSL.list(class06962.Y.in(var1)))));
      return hashmap;
   }
}
