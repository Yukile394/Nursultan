package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03653(
   class03543<class00891> canGrowThrough,
   class03543<class00891> muddyRootsIn,
   class01471 muddyRootsProvider,
   int maxRootWidth,
   int maxRootLength,
   float randomSkewChance
) {
   public static final Codec<class03653> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03541.N(class04227.Z).fieldOf("can_grow_through").forGetter(var0x -> var0x.canGrowThrough),
            class03541.N(class04227.Z).fieldOf("muddy_roots_in").forGetter(var0x -> var0x.muddyRootsIn),
            class01471.N.fieldOf("muddy_roots_provider").forGetter(var0x -> var0x.muddyRootsProvider),
            Codec.intRange(1, 12).fieldOf("max_root_width").forGetter(var0x -> var0x.maxRootWidth),
            Codec.intRange(1, 64).fieldOf("max_root_length").forGetter(var0x -> var0x.maxRootLength),
            Codec.floatRange(0.0F, 1.0F).fieldOf("random_skew_chance").forGetter(var0x -> var0x.randomSkewChance)
         )
         .apply(var0, class03653::new)
   );

   public class01471 L() {
      return this.muddyRootsProvider;
   }

   public class03653(
      class03543<class00891> canGrowThrough,
      class03543<class00891> muddyRootsIn,
      class01471 muddyRootsProvider,
      int maxRootWidth,
      int maxRootLength,
      float randomSkewChance
   ) {
      super();
      this.canGrowThrough = canGrowThrough;
      this.muddyRootsIn = muddyRootsIn;
      this.muddyRootsProvider = muddyRootsProvider;
      this.maxRootWidth = maxRootWidth;
      this.maxRootLength = maxRootLength;
      this.randomSkewChance = randomSkewChance;
   }

   public int i() {
      return this.maxRootLength;
   }

   public int u() {
      return this.maxRootWidth;
   }

   public class03543<class00891> y() {
      return this.muddyRootsIn;
   }

   public class03543<class00891> N() {
      return this.canGrowThrough;
   }

   public float R() {
      return this.randomSkewChance;
   }
}
