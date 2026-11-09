package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;

public record class04758(class03543<class00780> biomes, Map<class07428, class04426> spawnOverrides, class07852 step, class06040 terrainAdaptation) {
   public static final class04758 i = new class04758(class03543.N(), Map.of(), class07852.field_13173, class06040.field_28922);
   public static final MapCodec<class04758> R = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03541.N(class04227.NA).fieldOf("biomes").forGetter(class04758::N),
            Codec.simpleMap(class07428.field_24655, class04426.N, class05033.y(class07428.values())).fieldOf("spawn_overrides").forGetter(class04758::y),
            class07852.field_37680.fieldOf("step").forGetter(class04758::L),
            class06040.field_38433.optionalFieldOf("terrain_adaptation", i.terrainAdaptation).forGetter(class04758::u)
         )
         .apply(var0, class04758::new)
   );

   public class07852 L() {
      return this.step;
   }

   public class04758(class03543<class00780> var1) {
      this(var1, i.spawnOverrides, i.step, i.terrainAdaptation);
   }

   public class04758(class03543<class00780> biomes, Map<class07428, class04426> spawnOverrides, class07852 step, class06040 terrainAdaptation) {
      this.biomes = biomes;
      this.spawnOverrides = spawnOverrides;
      this.step = step;
      this.terrainAdaptation = terrainAdaptation;
   }

   public class06040 u() {
      return this.terrainAdaptation;
   }

   public Map<class07428, class04426> y() {
      return this.spawnOverrides;
   }

   public class03543<class00780> N() {
      return this.biomes;
   }
}
