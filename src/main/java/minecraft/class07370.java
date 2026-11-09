package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class07370(class02142 monsterSpawnLightTest, int monsterSpawnBlockLightLimit) {
   public static final MapCodec<class07370> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class02142.N(0, 15).fieldOf("monster_spawn_light_level").forGetter(class07370::N),
            Codec.intRange(0, 15).fieldOf("monster_spawn_block_light_limit").forGetter(class07370::y)
         )
         .apply(var0, class07370::new)
   );

   public class07370(class02142 monsterSpawnLightTest, int monsterSpawnBlockLightLimit) {
      this.monsterSpawnLightTest = monsterSpawnLightTest;
      this.monsterSpawnBlockLightLimit = monsterSpawnBlockLightLimit;
   }

   public int y() {
      return this.monsterSpawnBlockLightLimit;
   }

   public class02142 N() {
      return this.monsterSpawnLightTest;
   }
}
