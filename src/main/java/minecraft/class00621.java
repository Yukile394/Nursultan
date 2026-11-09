package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00621(Optional<class05075> defaultMusic, Optional<class05075> creativeMusic, Optional<class05075> underwaterMusic) {
   public static final class00621 N = new class00621(Optional.empty(), Optional.empty(), Optional.empty());
   public static final class00621 y = new class00621(Optional.of(class09002.M), Optional.of(class09002.y), Optional.empty());
   public static final Codec<class00621> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class05075.N.optionalFieldOf("default").forGetter(class00621::N),
            class05075.N.optionalFieldOf("creative").forGetter(class00621::y),
            class05075.N.optionalFieldOf("underwater").forGetter(class00621::L)
         )
         .apply(var0, class00621::new)
   );

   public Optional<class05075> L() {
      return this.underwaterMusic;
   }

   public class00621(Optional<class05075> defaultMusic, Optional<class05075> creativeMusic, Optional<class05075> underwaterMusic) {
      super();
      this.defaultMusic = defaultMusic;
      this.creativeMusic = creativeMusic;
      this.underwaterMusic = underwaterMusic;
   }

   public class00621(class03556<class04891> var1) {
      this(class09002.N(var1));
   }

   public class00621(class05075 var1) {
      this(Optional.of(var1), Optional.empty(), Optional.empty());
   }

   public Optional<class05075> y() {
      return this.creativeMusic;
   }

   public Optional<class05075> N() {
      return this.defaultMusic;
   }

   public class00621 N(class05075 var1) {
      return new class00621(this.defaultMusic, this.creativeMusic, Optional.of(var1));
   }

   public Optional<class05075> N(boolean var1, boolean var2) {
      if (var2 && this.underwaterMusic.isPresent()) {
         return this.underwaterMusic;
      } else {
         return var1 && this.creativeMusic.isPresent() ? this.creativeMusic : this.defaultMusic;
      }
   }
}
