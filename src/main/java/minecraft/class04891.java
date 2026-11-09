package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record class04891(class01894 location, Optional<Float> fixedRange) {
   public static final Codec<class04891> N = RecordCodecBuilder.create(
      var0 -> var0.group(class01894.N.fieldOf("sound_id").forGetter(class04891::N), Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(class04891::y))
         .apply(var0, class04891::N)
   );
   public static final Codec<class03556<class04891>> y = class01281.N(class04227.NG, N);
   public static final class02362<ByteBuf, class04891> L = class02362.N(
      class01894.y, class04891::N, class02389.E.N_33(class02389::N), class04891::y, class04891::N
   );
   public static final class02362<class04247, class03556<class04891>> u = class02389.N(class04227.NG, L);

   public class04891(class01894 location, Optional<Float> fixedRange) {
      super();
      this.location = location;
      this.fixedRange = fixedRange;
   }

   public Optional<Float> y() {
      return this.fixedRange;
   }

   public static class04891 N(class01894 var0) {
      return new class04891(var0, Optional.empty());
   }

   public static class04891 N(class01894 var0, float var1) {
      return new class04891(var0, Optional.of(var1));
   }

   public float N(float var1) {
      return this.fixedRange.orElse(var1 > 1.0F ? 16.0F * var1 : 16.0F);
   }

   private static class04891 N(class01894 var0, Optional<Float> var1) {
      return var1.<class04891>map(var1x -> N(var0, var1x.floatValue())).orElseGet(() -> N(var0));
   }

   public class01894 N() {
      return this.location;
   }
}
