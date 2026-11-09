package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02191(class03543<class00891> blocks, Optional<Float> speed, Optional<Boolean> correctForDrops) {
   public static final Codec<class02191> u = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03541.N(class04227.Z).fieldOf("blocks").forGetter(class02191::N),
            class06338.t.optionalFieldOf("speed").forGetter(class02191::y),
            Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(class02191::L)
         )
         .apply(var0, class02191::new)
   );
   public static final class02362<class04247, class02191> i = class02362.N(
      class02389.L(class04227.Z),
      class02191::N,
      class02389.E.N_33(class02389::N),
      class02191::y,
      class02389.y.N_33(class02389::N),
      class02191::L,
      class02191::new
   );

   public Optional<Boolean> L() {
      return this.correctForDrops;
   }

   public class02191(class03543<class00891> blocks, Optional<Float> speed, Optional<Boolean> correctForDrops) {
      this.blocks = blocks;
      this.speed = speed;
      this.correctForDrops = correctForDrops;
   }

   public Optional<Float> y() {
      return this.speed;
   }

   public static class02191 y(class03543<class00891> var0, float var1) {
      return new class02191(var0, Optional.of(var1), Optional.empty());
   }

   public class03543<class00891> N() {
      return this.blocks;
   }

   public static class02191 N(class03543<class00891> var0, float var1) {
      return new class02191(var0, Optional.of(var1), Optional.of(true));
   }

   public static class02191 N(class03543<class00891> var0) {
      return new class02191(var0, Optional.empty(), Optional.of(false));
   }
}
