package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class04513(
   int spawnRange,
   float totalMobs,
   float simultaneousMobs,
   float totalMobsAddedPerPlayer,
   float simultaneousMobsAddedPerPlayer,
   int ticksBetweenSpawn,
   class04540<class00808> spawnPotentialsDefinition,
   class04540<class05946<class05074>> lootTablesToEject,
   class05946<class05074> itemsToDropWhenOminous
) {
   public static final class04513 N = y().N();
   public static final Codec<class04513> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.intRange(1, 128).optionalFieldOf("spawn_range", N.spawnRange).forGetter(class04513::L),
            Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs", N.totalMobs).forGetter(class04513::u),
            Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", N.simultaneousMobs).forGetter(class04513::i),
            Codec.floatRange(0.0F, Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", N.totalMobsAddedPerPlayer).forGetter(class04513::R),
            Codec.floatRange(0.0F, Float.MAX_VALUE)
               .optionalFieldOf("simultaneous_mobs_added_per_player", N.simultaneousMobsAddedPerPlayer)
               .forGetter(class04513::M),
            Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", N.ticksBetweenSpawn).forGetter(class04513::B),
            class00808.L.optionalFieldOf("spawn_potentials", class04540.N()).forGetter(class04513::Z),
            class04540.N(class05074.N).optionalFieldOf("loot_tables_to_eject", N.lootTablesToEject).forGetter(class04513::z),
            class05074.N.optionalFieldOf("items_to_drop_when_ominous", N.itemsToDropWhenOminous).forGetter(class04513::U)
         )
         .apply(var0, class04513::new)
   );
   public static final Codec<class03556<class04513>> L = class01281.N(class04227.yl, y);

   public int L() {
      return this.spawnRange;
   }

   public float M() {
      return this.simultaneousMobsAddedPerPlayer;
   }

   public class04513(
      int spawnRange,
      float totalMobs,
      float simultaneousMobs,
      float totalMobsAddedPerPlayer,
      float simultaneousMobsAddedPerPlayer,
      int ticksBetweenSpawn,
      class04540<class00808> spawnPotentialsDefinition,
      class04540<class05946<class05074>> lootTablesToEject,
      class05946<class05074> itemsToDropWhenOminous
   ) {
      super();
      this.spawnRange = spawnRange;
      this.totalMobs = totalMobs;
      this.simultaneousMobs = simultaneousMobs;
      this.totalMobsAddedPerPlayer = totalMobsAddedPerPlayer;
      this.simultaneousMobsAddedPerPlayer = simultaneousMobsAddedPerPlayer;
      this.ticksBetweenSpawn = ticksBetweenSpawn;
      this.spawnPotentialsDefinition = spawnPotentialsDefinition;
      this.lootTablesToEject = lootTablesToEject;
      this.itemsToDropWhenOminous = itemsToDropWhenOminous;
   }

   public int B() {
      return this.ticksBetweenSpawn;
   }

   public class04540<class00808> Z() {
      return this.spawnPotentialsDefinition;
   }

   public float i() {
      return this.simultaneousMobs;
   }

   public class05946<class05074> U() {
      return this.itemsToDropWhenOminous;
   }

   public class04540<class05946<class05074>> z() {
      return this.lootTablesToEject;
   }

   public float u() {
      return this.totalMobs;
   }

   public int y(int var1) {
      return (int)Math.floor(this.simultaneousMobs + this.simultaneousMobsAddedPerPlayer * var1);
   }

   public static class04483 y() {
      return new class04483();
   }

   public class04513 N(class07078<?> var1) {
      class07001 class07001 = new class07001();
      class07001.N_67("id", class04206.M.y(var1).toString());
      class00808 class00808 = new class00808(class07001, Optional.empty(), Optional.empty());
      return new class04513(
         this.spawnRange,
         this.totalMobs,
         this.simultaneousMobs,
         this.totalMobsAddedPerPlayer,
         this.simultaneousMobsAddedPerPlayer,
         this.ticksBetweenSpawn,
         class04540.N(class00808),
         this.lootTablesToEject,
         this.itemsToDropWhenOminous
      );
   }

   public long N() {
      return 160L;
   }

   public int N(int var1) {
      return (int)Math.floor(this.totalMobs + this.totalMobsAddedPerPlayer * var1);
   }

   public float R() {
      return this.totalMobsAddedPerPlayer;
   }
}
