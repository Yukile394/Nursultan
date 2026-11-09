package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class06757 extends DataFix {
   private static final Set<String> N = Set.of(
      "dummy",
      "trigger",
      "deathCount",
      "playerKillCount",
      "totalKillCount",
      "health",
      "food",
      "air",
      "armor",
      "xp",
      "level",
      "killedByTeam.aqua",
      "killedByTeam.black",
      "killedByTeam.blue",
      "killedByTeam.dark_aqua",
      "killedByTeam.dark_blue",
      "killedByTeam.dark_gray",
      "killedByTeam.dark_green",
      "killedByTeam.dark_purple",
      "killedByTeam.dark_red",
      "killedByTeam.gold",
      "killedByTeam.gray",
      "killedByTeam.green",
      "killedByTeam.light_purple",
      "killedByTeam.red",
      "killedByTeam.white",
      "killedByTeam.yellow",
      "teamkill.aqua",
      "teamkill.black",
      "teamkill.blue",
      "teamkill.dark_aqua",
      "teamkill.dark_blue",
      "teamkill.dark_gray",
      "teamkill.dark_green",
      "teamkill.dark_purple",
      "teamkill.dark_red",
      "teamkill.gold",
      "teamkill.gray",
      "teamkill.green",
      "teamkill.light_purple",
      "teamkill.red",
      "teamkill.white",
      "teamkill.yellow"
   );
   private static final Set<String> y = ImmutableSet.builder()
      .add("stat.craftItem.minecraft.spawn_egg")
      .add("stat.useItem.minecraft.spawn_egg")
      .add("stat.breakItem.minecraft.spawn_egg")
      .add("stat.pickup.minecraft.spawn_egg")
      .add("stat.drop.minecraft.spawn_egg")
      .build();
   private static final Map<String, String> L = ImmutableMap.builder()
      .put("stat.leaveGame", "minecraft:leave_game")
      .put("stat.playOneMinute", "minecraft:play_one_minute")
      .put("stat.timeSinceDeath", "minecraft:time_since_death")
      .put("stat.sneakTime", "minecraft:sneak_time")
      .put("stat.walkOneCm", "minecraft:walk_one_cm")
      .put("stat.crouchOneCm", "minecraft:crouch_one_cm")
      .put("stat.sprintOneCm", "minecraft:sprint_one_cm")
      .put("stat.swimOneCm", "minecraft:swim_one_cm")
      .put("stat.fallOneCm", "minecraft:fall_one_cm")
      .put("stat.climbOneCm", "minecraft:climb_one_cm")
      .put("stat.flyOneCm", "minecraft:fly_one_cm")
      .put("stat.diveOneCm", "minecraft:dive_one_cm")
      .put("stat.minecartOneCm", "minecraft:minecart_one_cm")
      .put("stat.boatOneCm", "minecraft:boat_one_cm")
      .put("stat.pigOneCm", "minecraft:pig_one_cm")
      .put("stat.horseOneCm", "minecraft:horse_one_cm")
      .put("stat.aviateOneCm", "minecraft:aviate_one_cm")
      .put("stat.jump", "minecraft:jump")
      .put("stat.drop", "minecraft:drop")
      .put("stat.damageDealt", "minecraft:damage_dealt")
      .put("stat.damageTaken", "minecraft:damage_taken")
      .put("stat.deaths", "minecraft:deaths")
      .put("stat.mobKills", "minecraft:mob_kills")
      .put("stat.animalsBred", "minecraft:animals_bred")
      .put("stat.playerKills", "minecraft:player_kills")
      .put("stat.fishCaught", "minecraft:fish_caught")
      .put("stat.talkedToVillager", "minecraft:talked_to_villager")
      .put("stat.tradedWithVillager", "minecraft:traded_with_villager")
      .put("stat.cakeSlicesEaten", "minecraft:eat_cake_slice")
      .put("stat.cauldronFilled", "minecraft:fill_cauldron")
      .put("stat.cauldronUsed", "minecraft:use_cauldron")
      .put("stat.armorCleaned", "minecraft:clean_armor")
      .put("stat.bannerCleaned", "minecraft:clean_banner")
      .put("stat.brewingstandInteraction", "minecraft:interact_with_brewingstand")
      .put("stat.beaconInteraction", "minecraft:interact_with_beacon")
      .put("stat.dropperInspected", "minecraft:inspect_dropper")
      .put("stat.hopperInspected", "minecraft:inspect_hopper")
      .put("stat.dispenserInspected", "minecraft:inspect_dispenser")
      .put("stat.noteblockPlayed", "minecraft:play_noteblock")
      .put("stat.noteblockTuned", "minecraft:tune_noteblock")
      .put("stat.flowerPotted", "minecraft:pot_flower")
      .put("stat.trappedChestTriggered", "minecraft:trigger_trapped_chest")
      .put("stat.enderchestOpened", "minecraft:open_enderchest")
      .put("stat.itemEnchanted", "minecraft:enchant_item")
      .put("stat.recordPlayed", "minecraft:play_record")
      .put("stat.furnaceInteraction", "minecraft:interact_with_furnace")
      .put("stat.craftingTableInteraction", "minecraft:interact_with_crafting_table")
      .put("stat.chestOpened", "minecraft:open_chest")
      .put("stat.sleepInBed", "minecraft:sleep_in_bed")
      .put("stat.shulkerBoxOpened", "minecraft:open_shulker_box")
      .build();
   private static final String u = "stat.mineBlock";
   private static final String i = "minecraft:mined";
   private static final Map<String, String> R = ImmutableMap.builder()
      .put("stat.craftItem", "minecraft:crafted")
      .put("stat.useItem", "minecraft:used")
      .put("stat.breakItem", "minecraft:broken")
      .put("stat.pickup", "minecraft:picked_up")
      .put("stat.drop", "minecraft:dropped")
      .build();
   private static final Map<String, String> M = ImmutableMap.builder()
      .put("stat.entityKilledBy", "minecraft:killed_by")
      .put("stat.killEntity", "minecraft:killed")
      .build();
   private static final Map<String, String> B = ImmutableMap.builder()
      .put("Bat", "minecraft:bat")
      .put("Blaze", "minecraft:blaze")
      .put("CaveSpider", "minecraft:cave_spider")
      .put("Chicken", "minecraft:chicken")
      .put("Cow", "minecraft:cow")
      .put("Creeper", "minecraft:creeper")
      .put("Donkey", "minecraft:donkey")
      .put("ElderGuardian", "minecraft:elder_guardian")
      .put("Enderman", "minecraft:enderman")
      .put("Endermite", "minecraft:endermite")
      .put("EvocationIllager", "minecraft:evocation_illager")
      .put("Ghast", "minecraft:ghast")
      .put("Guardian", "minecraft:guardian")
      .put("Horse", "minecraft:horse")
      .put("Husk", "minecraft:husk")
      .put("Llama", "minecraft:llama")
      .put("LavaSlime", "minecraft:magma_cube")
      .put("MushroomCow", "minecraft:mooshroom")
      .put("Mule", "minecraft:mule")
      .put("Ozelot", "minecraft:ocelot")
      .put("Parrot", "minecraft:parrot")
      .put("Pig", "minecraft:pig")
      .put("PolarBear", "minecraft:polar_bear")
      .put("Rabbit", "minecraft:rabbit")
      .put("Sheep", "minecraft:sheep")
      .put("Shulker", "minecraft:shulker")
      .put("Silverfish", "minecraft:silverfish")
      .put("SkeletonHorse", "minecraft:skeleton_horse")
      .put("Skeleton", "minecraft:skeleton")
      .put("Slime", "minecraft:slime")
      .put("Spider", "minecraft:spider")
      .put("Squid", "minecraft:squid")
      .put("Stray", "minecraft:stray")
      .put("Vex", "minecraft:vex")
      .put("Villager", "minecraft:villager")
      .put("VindicationIllager", "minecraft:vindication_illager")
      .put("Witch", "minecraft:witch")
      .put("WitherSkeleton", "minecraft:wither_skeleton")
      .put("Wolf", "minecraft:wolf")
      .put("ZombieHorse", "minecraft:zombie_horse")
      .put("PigZombie", "minecraft:zombie_pigman")
      .put("ZombieVillager", "minecraft:zombie_villager")
      .put("Zombie", "minecraft:zombie")
      .build();
   private static final String Z = "minecraft:custom";

   private static String L(String var0) {
      return class05803.N(var0);
   }

   public class06757(Schema var1, boolean var2) {
      super(var1, var2);
   }

   @Nullable
   private static String y(String var0) {
      return class06612.N(var0, 0);
   }

   private TypeRewriteRule y() {
      Type<?> type = this.getInputSchema().getType(class06962.c);
      Type<?> type1 = this.getOutputSchema().getType(class06962.c);
      return this.fixTypeEverywhereTyped(
         "ObjectiveStatFix",
         type,
         type1,
         var1x -> {
            Dynamic<?> dynamic = ((Dynamic)var1x.get(DSL.remainderFinder()))
               .update("CriteriaName", var0x -> (Dynamic)DataFixUtils.orElse(var0x.asString().result().map(var0xx -> {
                  if (N.contains(var0xx)) {
                     return (String)var0xx;
                  } else {
                     class06725 class06725 = N(var0xx);
                     return class06725 == null ? "dummy" : class06534.y(class06725.N) + ":" + class06534.y(class06725.y);
                  }
               }).map(var0x::createString), var0x));
            return class07536.N(type1, dynamic);
         }
      );
   }

   private TypeRewriteRule N() {
      Type<?> type = this.getInputSchema().getType(class06962.B);
      Type<?> type1 = this.getOutputSchema().getType(class06962.B);
      return this.fixTypeEverywhereTyped("StatsCounterFix", type, type1, var1x -> {
         Dynamic<?> dynamic = (Dynamic<?>)var1x.get(DSL.remainderFinder());
         HashMap hashmap = Maps.newHashMap();
         Optional<Map<Dynamic<?>, Dynamic<?>>> optional = dynamic.getMapValues().result();
         if (optional.isPresent()) {
            for (Entry entry : optional.get().entrySet()) {
               if (((Dynamic)entry.getValue()).asNumber().result().isPresent()) {
                  class06725 class06725 = N(((Dynamic)entry.getKey()).asString(""));
                  if (class06725 != null) {
                     Dynamic<?> dynamic1 = dynamic.createString(class06725.N());
                     Dynamic dynamic2 = hashmap.computeIfAbsent(dynamic1, var1xx -> dynamic.emptyMap());
                     hashmap.put(dynamic1, dynamic2.set(class06725.y(), (Dynamic)entry.getValue()));
                  }
               }
            }
         }

         return class07536.N(type1, dynamic.emptyMap().set("stats", dynamic.createMap(hashmap)));
      });
   }

   @Nullable
   private static class06725 N(String var0) {
      if (y.contains(var0)) {
         return null;
      } else {
         String s = L.get(var0);
         if (s != null) {
            return new class06725("minecraft:custom", s);
         } else {
            int ix = StringUtils.ordinalIndexOf(var0, ".", 2);
            if (ix < 0) {
               return null;
            } else {
               String s1 = var0.substring(0, ix);
               if ("stat.mineBlock".equals(s1)) {
                  String s6 = L(var0.substring(ix + 1).replace('.', ':'));
                  return new class06725("minecraft:mined", s6);
               } else {
                  String s2 = R.get(s1);
                  if (s2 != null) {
                     String s7 = var0.substring(ix + 1).replace('.', ':');
                     String s8 = y(s7);
                     String s9 = s8 == null ? s7 : s8;
                     return new class06725(s2, s9);
                  } else {
                     String s3 = M.get(s1);
                     if (s3 != null) {
                        String s4 = var0.substring(ix + 1).replace('.', ':');
                        String s5 = B.getOrDefault(s4, s4);
                        return new class06725(s3, s5);
                     } else {
                        return null;
                     }
                  }
               }
            }
         }
      }
   }

   public TypeRewriteRule makeRule() {
      return TypeRewriteRule.seq(this.N(), this.y());
   }
}
