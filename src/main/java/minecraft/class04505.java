package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public record class04505(
   Set<UUID> detectedPlayers,
   Set<UUID> currentMobs,
   long cooldownEndsAt,
   long nextMobSpawnsAt,
   int totalMobsSpawned,
   Optional<class00808> nextSpawnData,
   Optional<class05946<class05074>> ejectingLootTable
) {
   public static final MapCodec<class04505> B = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01487.y.lenientOptionalFieldOf("registered_players", Set.of()).forGetter(class04505::N),
            class01487.y.lenientOptionalFieldOf("current_mobs", Set.of()).forGetter(class04505::y),
            Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter(class04505::L),
            Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter(class04505::u),
            Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter(class04505::i),
            class00808.y.lenientOptionalFieldOf("spawn_data").forGetter(class04505::R),
            class05074.N.lenientOptionalFieldOf("ejecting_loot_table").forGetter(class04505::M)
         )
         .apply(var0, class04505::new)
   );

   public long L() {
      return this.cooldownEndsAt;
   }

   public Optional<class05946<class05074>> M() {
      return this.ejectingLootTable;
   }

   public class04505(
      Set<UUID> detectedPlayers,
      Set<UUID> currentMobs,
      long cooldownEndsAt,
      long nextMobSpawnsAt,
      int totalMobsSpawned,
      Optional<class00808> nextSpawnData,
      Optional<class05946<class05074>> ejectingLootTable
   ) {
      this.detectedPlayers = detectedPlayers;
      this.currentMobs = currentMobs;
      this.cooldownEndsAt = cooldownEndsAt;
      this.nextMobSpawnsAt = nextMobSpawnsAt;
      this.totalMobsSpawned = totalMobsSpawned;
      this.nextSpawnData = nextSpawnData;
      this.ejectingLootTable = ejectingLootTable;
   }

   public int i() {
      return this.totalMobsSpawned;
   }

   public long u() {
      return this.nextMobSpawnsAt;
   }

   public Set<UUID> y() {
      return this.currentMobs;
   }

   public Set<UUID> N() {
      return this.detectedPlayers;
   }

   public Optional<class00808> R() {
      return this.nextSpawnData;
   }
}
