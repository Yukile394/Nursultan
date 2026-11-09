package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class06852 extends DataFix {
   private static Dynamic<?> L(Dynamic<?> var0) {
      return var0.createBoolean(!Boolean.parseBoolean(var0.asString("")));
   }

   public class06852(Schema var1) {
      super(var1, false);
   }

   private static Dynamic<?> y(Dynamic<?> var0) {
      return var0.createBoolean(Boolean.parseBoolean(var0.asString("")));
   }

   private static Dynamic<?> N(Dynamic<?> var0, int var1, int var2) {
      String s = var0.asString("");

      try {
         int i = Integer.parseInt(s);
         return var0.createInt(class04995.N(i, var1, var2));
      } catch (NumberFormatException numberformatexception) {
         return var0;
      }
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      return N(var0, Integer.MIN_VALUE, Integer.MAX_VALUE);
   }

   private static Dynamic<?> N(Dynamic<?> var0, int var1) {
      return N(var0, var1, Integer.MAX_VALUE);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "GameRuleRegistryFix",
         this.getInputSchema().getType(class06962.N),
         var0 -> var0.update(
            DSL.remainderFinder(),
            var0x -> var0x.renameAndFixField(
               "GameRules",
               "game_rules",
               var0xx -> {
                  boolean flag = Boolean.parseBoolean(var0xx.get("doFireTick").asString("true"));
                  boolean flag1 = Boolean.parseBoolean(var0xx.get("allowFireTicksAwayFromPlayer").asString("false"));
                  short short1;
                  if (!flag) {
                     short1 = 0;
                  } else if (!flag1) {
                     short1 = 128;
                  } else {
                     short1 = -1;
                  }

                  if (short1 != 128) {
                     var0xx = var0xx.set("minecraft:fire_spread_radius_around_player", var0xx.createInt(short1));
                  }

                  return var0xx.remove("spawnChunkRadius")
                     .remove("entitiesWithPassengersCanUsePortals")
                     .remove("doFireTick")
                     .remove("allowFireTicksAwayFromPlayer")
                     .renameAndFixField("allowEnteringNetherUsingPortals", "minecraft:allow_entering_nether_using_portals", class06852::y)
                     .renameAndFixField("announceAdvancements", "minecraft:show_advancement_messages", class06852::y)
                     .renameAndFixField("blockExplosionDropDecay", "minecraft:block_explosion_drop_decay", class06852::y)
                     .renameAndFixField("commandBlockOutput", "minecraft:command_block_output", class06852::y)
                     .renameAndFixField("enableCommandBlocks", "minecraft:command_blocks_work", class06852::y)
                     .renameAndFixField("commandBlocksEnabled", "minecraft:command_blocks_work", class06852::y)
                     .renameAndFixField("commandModificationBlockLimit", "minecraft:max_block_modifications", var0xxx -> N(var0xxx, 1))
                     .renameAndFixField("disableElytraMovementCheck", "minecraft:elytra_movement_check", class06852::L)
                     .renameAndFixField("disablePlayerMovementCheck", "minecraft:player_movement_check", class06852::L)
                     .renameAndFixField("disableRaids", "minecraft:raids", class06852::L)
                     .renameAndFixField("doDaylightCycle", "minecraft:advance_time", class06852::y)
                     .renameAndFixField("doEntityDrops", "minecraft:entity_drops", class06852::y)
                     .renameAndFixField("doImmediateRespawn", "minecraft:immediate_respawn", class06852::y)
                     .renameAndFixField("doInsomnia", "minecraft:spawn_phantoms", class06852::y)
                     .renameAndFixField("doLimitedCrafting", "minecraft:limited_crafting", class06852::y)
                     .renameAndFixField("doMobLoot", "minecraft:mob_drops", class06852::y)
                     .renameAndFixField("doMobSpawning", "minecraft:spawn_mobs", class06852::y)
                     .renameAndFixField("doPatrolSpawning", "minecraft:spawn_patrols", class06852::y)
                     .renameAndFixField("doTileDrops", "minecraft:block_drops", class06852::y)
                     .renameAndFixField("doTraderSpawning", "minecraft:spawn_wandering_traders", class06852::y)
                     .renameAndFixField("doVinesSpread", "minecraft:spread_vines", class06852::y)
                     .renameAndFixField("doWardenSpawning", "minecraft:spawn_wardens", class06852::y)
                     .renameAndFixField("doWeatherCycle", "minecraft:advance_weather", class06852::y)
                     .renameAndFixField("drowningDamage", "minecraft:drowning_damage", class06852::y)
                     .renameAndFixField("enderPearlsVanishOnDeath", "minecraft:ender_pearls_vanish_on_death", class06852::y)
                     .renameAndFixField("fallDamage", "minecraft:fall_damage", class06852::y)
                     .renameAndFixField("fireDamage", "minecraft:fire_damage", class06852::y)
                     .renameAndFixField("forgiveDeadPlayers", "minecraft:forgive_dead_players", class06852::y)
                     .renameAndFixField("freezeDamage", "minecraft:freeze_damage", class06852::y)
                     .renameAndFixField("globalSoundEvents", "minecraft:global_sound_events", class06852::y)
                     .renameAndFixField("keepInventory", "minecraft:keep_inventory", class06852::y)
                     .renameAndFixField("lavaSourceConversion", "minecraft:lava_source_conversion", class06852::y)
                     .renameAndFixField("locatorBar", "minecraft:locator_bar", class06852::y)
                     .renameAndFixField("logAdminCommands", "minecraft:log_admin_commands", class06852::y)
                     .renameAndFixField("maxCommandChainLength", "minecraft:max_command_sequence_length", var0xxx -> N(var0xxx, 0))
                     .renameAndFixField("maxCommandForkCount", "minecraft:max_command_forks", var0xxx -> N(var0xxx, 0))
                     .renameAndFixField("maxEntityCramming", "minecraft:max_entity_cramming", var0xxx -> N(var0xxx, 0))
                     .renameAndFixField("minecartMaxSpeed", "minecraft:max_minecart_speed", class06852::N)
                     .renameAndFixField("mobExplosionDropDecay", "minecraft:mob_explosion_drop_decay", class06852::y)
                     .renameAndFixField("mobGriefing", "minecraft:mob_griefing", class06852::y)
                     .renameAndFixField("naturalRegeneration", "minecraft:natural_health_regeneration", class06852::y)
                     .renameAndFixField("playersNetherPortalCreativeDelay", "minecraft:players_nether_portal_creative_delay", var0xxx -> N(var0xxx, 0))
                     .renameAndFixField("playersNetherPortalDefaultDelay", "minecraft:players_nether_portal_default_delay", var0xxx -> N(var0xxx, 0))
                     .renameAndFixField("playersSleepingPercentage", "minecraft:players_sleeping_percentage", var0xxx -> N(var0xxx, 0))
                     .renameAndFixField("projectilesCanBreakBlocks", "minecraft:projectiles_can_break_blocks", class06852::y)
                     .renameAndFixField("pvp", "minecraft:pvp", class06852::y)
                     .renameAndFixField("randomTickSpeed", "minecraft:random_tick_speed", var0xxx -> N(var0xxx, 0))
                     .renameAndFixField("reducedDebugInfo", "minecraft:reduced_debug_info", class06852::y)
                     .renameAndFixField("sendCommandFeedback", "minecraft:send_command_feedback", class06852::y)
                     .renameAndFixField("showDeathMessages", "minecraft:show_death_messages", class06852::y)
                     .renameAndFixField("snowAccumulationHeight", "minecraft:max_snow_accumulation_height", var0xxx -> N(var0xxx, 0, 8))
                     .renameAndFixField("spawnMonsters", "minecraft:spawn_monsters", class06852::y)
                     .renameAndFixField("spawnRadius", "minecraft:respawn_radius", class06852::N)
                     .renameAndFixField("spawnerBlocksEnabled", "minecraft:spawner_blocks_work", class06852::y)
                     .renameAndFixField("spectatorsGenerateChunks", "minecraft:spectators_generate_chunks", class06852::y)
                     .renameAndFixField("tntExplodes", "minecraft:tnt_explodes", class06852::y)
                     .renameAndFixField("tntExplosionDropDecay", "minecraft:tnt_explosion_drop_decay", class06852::y)
                     .renameAndFixField("universalAnger", "minecraft:universal_anger", class06852::y)
                     .renameAndFixField("waterSourceConversion", "minecraft:water_source_conversion", class06852::y);
               }
            )
         )
      );
   }
}
