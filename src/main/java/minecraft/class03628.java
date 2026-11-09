package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03628(class01471 aboveRootProvider, float aboveRootPlacementChance) {
   public static final Codec<class03628> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01471.N.fieldOf("above_root_provider").forGetter(var0x -> var0x.aboveRootProvider),
            Codec.floatRange(0.0F, 1.0F).fieldOf("above_root_placement_chance").forGetter(var0x -> var0x.aboveRootPlacementChance)
         )
         .apply(var0, class03628::new)
   );

   public class03628(class01471 aboveRootProvider, float aboveRootPlacementChance) {
      this.aboveRootProvider = aboveRootProvider;
      this.aboveRootPlacementChance = aboveRootPlacementChance;
   }

   public float y() {
      return this.aboveRootPlacementChance;
   }

   public class01471 N() {
      return this.aboveRootProvider;
   }
}
