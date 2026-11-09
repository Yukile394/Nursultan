package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01478(int tries, int xzSpread, int ySpread, class03556<class04336> feature) implements class06386 {
   public static final Codec<class01478> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.b.fieldOf("tries").orElse(128).forGetter(class01478::N),
            class06338.T.fieldOf("xz_spread").orElse(7).forGetter(class01478::y),
            class06338.T.fieldOf("y_spread").orElse(3).forGetter(class01478::L),
            class04336.y.fieldOf("feature").forGetter(class01478::i)
         )
         .apply(var0, class01478::new)
   );

   public int L() {
      return this.ySpread;
   }

   public class01478(int tries, int xzSpread, int ySpread, class03556<class04336> feature) {
      this.tries = tries;
      this.xzSpread = xzSpread;
      this.ySpread = ySpread;
      this.feature = feature;
   }

   public class03556<class04336> i() {
      return this.feature;
   }

   public int y() {
      return this.xzSpread;
   }

   public int N() {
      return this.tries;
   }
}
