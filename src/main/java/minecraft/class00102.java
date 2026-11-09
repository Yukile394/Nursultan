package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00102(Optional<Integer> maxLines, Optional<Integer> height) {
   public static final int N = 512;
   public static final Codec<class00102> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.b.optionalFieldOf("max_lines").forGetter(class00102::N), class06338.N(1, 512).optionalFieldOf("height").forGetter(class00102::y)
         )
         .apply(var0, class00102::new)
   );

   public class00102(Optional<Integer> maxLines, Optional<Integer> height) {
      super();
      this.maxLines = maxLines;
      this.height = height;
   }

   public Optional<Integer> y() {
      return this.height;
   }

   public Optional<Integer> N() {
      return this.maxLines;
   }
}
