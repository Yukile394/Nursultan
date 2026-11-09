package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class04588(Optional<class05196> player) implements class01425 {
   public static final Codec<class04588> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class04588::N)).apply(var0, class04588::new)
   );

   public class04588(Optional<class05196> player) {
      this.player = player;
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class04588> N(class00810 var0) {
      return class06912.x.N(new class04588(Optional.of(class00821.N(var0))));
   }
}
