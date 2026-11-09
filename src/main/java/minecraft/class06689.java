package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.slf4j.Logger;

public class class06689 extends Schema {
   private static final Logger u = LogUtils.getLogger();
   static final Map<String, String> N = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("minecraft:furnace", "Furnace");
      var0.put("minecraft:lit_furnace", "Furnace");
      var0.put("minecraft:chest", "Chest");
      var0.put("minecraft:trapped_chest", "Chest");
      var0.put("minecraft:ender_chest", "EnderChest");
      var0.put("minecraft:jukebox", "RecordPlayer");
      var0.put("minecraft:dispenser", "Trap");
      var0.put("minecraft:dropper", "Dropper");
      var0.put("minecraft:sign", "Sign");
      var0.put("minecraft:mob_spawner", "MobSpawner");
      var0.put("minecraft:noteblock", "Music");
      var0.put("minecraft:brewing_stand", "Cauldron");
      var0.put("minecraft:enhanting_table", "EnchantTable");
      var0.put("minecraft:command_block", "CommandBlock");
      var0.put("minecraft:beacon", "Beacon");
      var0.put("minecraft:skull", "Skull");
      var0.put("minecraft:daylight_detector", "DLDetector");
      var0.put("minecraft:hopper", "Hopper");
      var0.put("minecraft:banner", "Banner");
      var0.put("minecraft:flower_pot", "FlowerPot");
      var0.put("minecraft:repeating_command_block", "CommandBlock");
      var0.put("minecraft:chain_command_block", "CommandBlock");
      var0.put("minecraft:standing_sign", "Sign");
      var0.put("minecraft:wall_sign", "Sign");
      var0.put("minecraft:piston_head", "Piston");
      var0.put("minecraft:daylight_detector_inverted", "DLDetector");
      var0.put("minecraft:unpowered_comparator", "Comparator");
      var0.put("minecraft:powered_comparator", "Comparator");
      var0.put("minecraft:wall_banner", "Banner");
      var0.put("minecraft:standing_banner", "Banner");
      var0.put("minecraft:structure_block", "Structure");
      var0.put("minecraft:end_portal", "Airportal");
      var0.put("minecraft:end_gateway", "EndGateway");
      var0.put("minecraft:shield", "Banner");
   });
   public static final Map<String, String> y = Map.of("minecraft:armor_stand", "ArmorStand", "minecraft:painting", "Painting");
   protected static final HookFunction L = new class06690();

   protected static void L(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var0))));
   }

   public class06689(int var1, Schema var2) {
      super(var1, var2);
   }

   protected static void y(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("DisplayTile", class06962.q.in(var0)));
   }

   public static TypeTemplate y(Schema var0) {
      return DSL.optionalFields(
         new Pair[]{
            Pair.of("EntityTag", class06962.J.in(var0)),
            Pair.of("BlockEntityTag", class06962.G.in(var0)),
            Pair.of("CanDestroy", DSL.list(class06962.q.in(var0))),
            Pair.of("CanPlaceOn", DSL.list(class06962.q.in(var0))),
            Pair.of("Items", DSL.list(class06962.l.in(var0))),
            Pair.of("ChargedProjectiles", DSL.list(class06962.l.in(var0))),
            Pair.of("pages", DSL.list(class06962.O.in(var0))),
            Pair.of("filtered_pages", DSL.compoundList(class06962.O.in(var0))),
            Pair.of("display", DSL.optionalFields("Name", class06962.O.in(var0), "Lore", DSL.list(class06962.O.in(var0))))
         }
      );
   }

   protected static <T> T N(Dynamic<T> var0, Map<String, String> var1, Map<String, String> var2) {
      return (T)var0.update("tag", var3 -> var3.update("BlockEntityTag", var2xx -> {
         String s = var0.get("id").asString().result().map(class00622::N).orElse("minecraft:air");
         if (!"minecraft:air".equals(s)) {
            String s1 = (String)var1.get(s);
            if (s1 != null) {
               return var2xx.set("id", var0.createString(s1));
            }

            u.warn("Unable to resolve BlockEntity for ItemStack: {}", s);
         }

         return var2xx;
      }).update("EntityTag", var2xx -> {
         if (var2xx.get("id").result().isPresent()) {
            return var2xx;
         } else {
            String s = class00622.N(var0.get("id").asString(""));
            String s1 = (String)var2.get(s);
            return s1 != null ? var2xx.set("id", var0.createString(s1)) : var2xx;
         }
      })).getValue();
   }

   protected static void N(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> DSL.optionalFields("inTile", class06962.q.in(var0)));
   }

   public static TypeTemplate N(Schema var0) {
      return DSL.optionalFields(
         new Pair[]{
            Pair.of("Text1", class06962.O.in(var0)),
            Pair.of("Text2", class06962.O.in(var0)),
            Pair.of("Text3", class06962.O.in(var0)),
            Pair.of("Text4", class06962.O.in(var0)),
            Pair.of("FilteredText1", class06962.O.in(var0)),
            Pair.of("FilteredText2", class06962.O.in(var0)),
            Pair.of("FilteredText3", class06962.O.in(var0)),
            Pair.of("FilteredText4", class06962.O.in(var0))
         }
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      HashMap hashmap = Maps.newHashMap();
      L(var1, hashmap, "Furnace");
      L(var1, hashmap, "Chest");
      var1.registerSimple(hashmap, "EnderChest");
      var1.register(hashmap, "RecordPlayer", var1x -> DSL.optionalFields("RecordItem", class06962.l.in(var1)));
      L(var1, hashmap, "Trap");
      L(var1, hashmap, "Dropper");
      var1.register(hashmap, "Sign", () -> N(var1));
      var1.register(hashmap, "MobSpawner", var1x -> class06962.e.in(var1));
      var1.registerSimple(hashmap, "Music");
      var1.registerSimple(hashmap, "Piston");
      L(var1, hashmap, "Cauldron");
      var1.registerSimple(hashmap, "EnchantTable");
      var1.registerSimple(hashmap, "Airportal");
      var1.register(hashmap, "Control", () -> DSL.optionalFields("LastOutput", class06962.O.in(var1)));
      var1.registerSimple(hashmap, "Beacon");
      var1.register(hashmap, "Skull", () -> DSL.optionalFields("custom_name", class06962.O.in(var1)));
      var1.registerSimple(hashmap, "DLDetector");
      L(var1, hashmap, "Hopper");
      var1.registerSimple(hashmap, "Comparator");
      var1.register(hashmap, "FlowerPot", var1x -> DSL.optionalFields("Item", DSL.or(DSL.constType(DSL.intType()), class06962.K.in(var1))));
      var1.register(hashmap, "Banner", () -> DSL.optionalFields("CustomName", class06962.O.in(var1)));
      var1.registerSimple(hashmap, "Structure");
      var1.registerSimple(hashmap, "EndGateway");
      return hashmap;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      var1.registerType(
         false,
         class06962.N,
         () -> DSL.optionalFields("CustomBossEvents", DSL.compoundList(DSL.optionalFields("Name", class06962.O.in(var1))), class06962.y.in(var1))
      );
      var1.registerType(false, class06962.y, DSL::remainder);
      var1.registerType(
         false, class06962.L, () -> DSL.optionalFields("Inventory", DSL.list(class06962.l.in(var1)), "EnderItems", DSL.list(class06962.l.in(var1)))
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
               DSL.list(DSL.fields("i", class06962.q.in(var1)))
            )
         )
      );
      var1.registerType(true, class06962.G, () -> DSL.optionalFields("components", class06962.k.in(var1), DSL.taggedChoiceLazy("id", DSL.string(), var3)));
      var1.registerType(true, class06962.J, () -> DSL.optionalFields("Riding", class06962.J.in(var1), class06962.o.in(var1)));
      var1.registerType(false, class06962.I, () -> DSL.constType(class00622.N()));
      var1.registerType(
         true,
         class06962.o,
         () -> DSL.and(class06962.g.in(var1), DSL.optionalFields("CustomName", DSL.constType(DSL.string()), DSL.taggedChoiceLazy("id", DSL.string(), var2)))
      );
      var1.registerType(
         true,
         class06962.l,
         () -> DSL.hook(DSL.optionalFields("id", DSL.or(DSL.constType(DSL.intType()), class06962.K.in(var1)), "tag", y(var1)), L, HookFunction.IDENTITY)
      );
      var1.registerType(false, class06962.R, DSL::remainder);
      var1.registerType(false, class06962.q, () -> DSL.or(DSL.constType(DSL.intType()), DSL.constType(class00622.N())));
      var1.registerType(false, class06962.K, () -> DSL.constType(class00622.N()));
      var1.registerType(false, class06962.B, DSL::remainder);
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
      var1.registerType(false, class06962.c, DSL::remainder);
      var1.registerType(
         false,
         class06962.X,
         () -> DSL.optionalFields("MemberNamePrefix", class06962.O.in(var1), "MemberNameSuffix", class06962.O.in(var1), "DisplayName", class06962.O.in(var1))
      );
      var1.registerType(true, class06962.e, DSL::remainder);
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
      var1.registerType(false, class06962.d, DSL::remainder);
      var1.registerType(false, class06962.w, DSL::remainder);
      var1.registerType(true, class06962.g, () -> DSL.optional(DSL.field("Equipment", DSL.list(class06962.l.in(var1)))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      HashMap hashmap = Maps.newHashMap();
      var1.register(hashmap, "Item", var1x -> DSL.optionalFields("Item", class06962.l.in(var1)));
      var1.registerSimple(hashmap, "XPOrb");
      N(var1, hashmap, "ThrownEgg");
      var1.registerSimple(hashmap, "LeashKnot");
      var1.registerSimple(hashmap, "Painting");
      var1.register(hashmap, "Arrow", var1x -> DSL.optionalFields("inTile", class06962.q.in(var1)));
      var1.register(hashmap, "TippedArrow", var1x -> DSL.optionalFields("inTile", class06962.q.in(var1)));
      var1.register(hashmap, "SpectralArrow", var1x -> DSL.optionalFields("inTile", class06962.q.in(var1)));
      N(var1, hashmap, "Snowball");
      N(var1, hashmap, "Fireball");
      N(var1, hashmap, "SmallFireball");
      N(var1, hashmap, "ThrownEnderpearl");
      var1.registerSimple(hashmap, "EyeOfEnderSignal");
      var1.register(hashmap, "ThrownPotion", var1x -> DSL.optionalFields("inTile", class06962.q.in(var1), "Potion", class06962.l.in(var1)));
      N(var1, hashmap, "ThrownExpBottle");
      var1.register(hashmap, "ItemFrame", var1x -> DSL.optionalFields("Item", class06962.l.in(var1)));
      N(var1, hashmap, "WitherSkull");
      var1.registerSimple(hashmap, "PrimedTnt");
      var1.register(hashmap, "FallingSand", var1x -> DSL.optionalFields("Block", class06962.q.in(var1), "TileEntityData", class06962.G.in(var1)));
      var1.register(hashmap, "FireworksRocketEntity", var1x -> DSL.optionalFields("FireworksItem", class06962.l.in(var1)));
      var1.registerSimple(hashmap, "Boat");
      var1.register(hashmap, "Minecart", () -> DSL.optionalFields("DisplayTile", class06962.q.in(var1), "Items", DSL.list(class06962.l.in(var1))));
      y(var1, hashmap, "MinecartRideable");
      var1.register(hashmap, "MinecartChest", var1x -> DSL.optionalFields("DisplayTile", class06962.q.in(var1), "Items", DSL.list(class06962.l.in(var1))));
      y(var1, hashmap, "MinecartFurnace");
      y(var1, hashmap, "MinecartTNT");
      var1.register(hashmap, "MinecartSpawner", () -> DSL.optionalFields("DisplayTile", class06962.q.in(var1), class06962.e.in(var1)));
      var1.register(hashmap, "MinecartHopper", var1x -> DSL.optionalFields("DisplayTile", class06962.q.in(var1), "Items", DSL.list(class06962.l.in(var1))));
      var1.register(hashmap, "MinecartCommandBlock", () -> DSL.optionalFields("DisplayTile", class06962.q.in(var1), "LastOutput", class06962.O.in(var1)));
      var1.registerSimple(hashmap, "ArmorStand");
      var1.registerSimple(hashmap, "Creeper");
      var1.registerSimple(hashmap, "Skeleton");
      var1.registerSimple(hashmap, "Spider");
      var1.registerSimple(hashmap, "Giant");
      var1.registerSimple(hashmap, "Zombie");
      var1.registerSimple(hashmap, "Slime");
      var1.registerSimple(hashmap, "Ghast");
      var1.registerSimple(hashmap, "PigZombie");
      var1.register(hashmap, "Enderman", var1x -> DSL.optionalFields("carried", class06962.q.in(var1)));
      var1.registerSimple(hashmap, "CaveSpider");
      var1.registerSimple(hashmap, "Silverfish");
      var1.registerSimple(hashmap, "Blaze");
      var1.registerSimple(hashmap, "LavaSlime");
      var1.registerSimple(hashmap, "EnderDragon");
      var1.registerSimple(hashmap, "WitherBoss");
      var1.registerSimple(hashmap, "Bat");
      var1.registerSimple(hashmap, "Witch");
      var1.registerSimple(hashmap, "Endermite");
      var1.registerSimple(hashmap, "Guardian");
      var1.registerSimple(hashmap, "Pig");
      var1.registerSimple(hashmap, "Sheep");
      var1.registerSimple(hashmap, "Cow");
      var1.registerSimple(hashmap, "Chicken");
      var1.registerSimple(hashmap, "Squid");
      var1.registerSimple(hashmap, "Wolf");
      var1.registerSimple(hashmap, "MushroomCow");
      var1.registerSimple(hashmap, "SnowMan");
      var1.registerSimple(hashmap, "Ozelot");
      var1.registerSimple(hashmap, "VillagerGolem");
      var1.register(
         hashmap,
         "EntityHorse",
         var1x -> DSL.optionalFields("Items", DSL.list(class06962.l.in(var1)), "ArmorItem", class06962.l.in(var1), "SaddleItem", class06962.l.in(var1))
      );
      var1.registerSimple(hashmap, "Rabbit");
      var1.register(
         hashmap,
         "Villager",
         var1x -> DSL.optionalFields("Inventory", DSL.list(class06962.l.in(var1)), "Offers", DSL.optionalFields("Recipes", DSL.list(class06962.Y.in(var1))))
      );
      var1.registerSimple(hashmap, "EnderCrystal");
      var1.register(hashmap, "AreaEffectCloud", var1x -> DSL.optionalFields("Particle", class06962.Q.in(var1)));
      var1.registerSimple(hashmap, "ShulkerBullet");
      var1.registerSimple(hashmap, "DragonFireball");
      var1.registerSimple(hashmap, "Shulker");
      return hashmap;
   }
}
