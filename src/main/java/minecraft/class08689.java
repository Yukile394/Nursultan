package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class08689(Optional<Integer> colorWhenUndyed) {
   public static final Codec<class08689> N = RecordCodecBuilder.create(
      var0 -> var0.group(class06338.E.optionalFieldOf("color_when_undyed").forGetter(class08689::N)).apply(var0, class08689::new)
   );

   public class08689(Optional<Integer> colorWhenUndyed) {
      this.colorWhenUndyed = colorWhenUndyed;
   }

   public Optional<Integer> N() {
      return this.colorWhenUndyed;
   }
}
