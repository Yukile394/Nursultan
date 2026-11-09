package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01812(class03649 stateProvider, class04025 target, class02142 radius, int halfHeight) implements class06386 {
   public static final Codec<class01812> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03649.N.fieldOf("state_provider").forGetter(class01812::N),
            class04025.y.fieldOf("target").forGetter(class01812::y),
            class02142.N(0, 8).fieldOf("radius").forGetter(class01812::L),
            Codec.intRange(0, 4).fieldOf("half_height").forGetter(class01812::i)
         )
         .apply(var0, class01812::new)
   );

   public class02142 L() {
      return this.radius;
   }

   public class01812(class03649 stateProvider, class04025 target, class02142 radius, int halfHeight) {
      super();
      this.stateProvider = stateProvider;
      this.target = target;
      this.radius = radius;
      this.halfHeight = halfHeight;
   }

   public int i() {
      return this.halfHeight;
   }

   public class04025 y() {
      return this.target;
   }

   public class03649 N() {
      return this.stateProvider;
   }
}
