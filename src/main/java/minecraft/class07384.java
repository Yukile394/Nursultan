package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class07384(class07947 player, Optional<class07415> message) {
   public static final MapCodec<class07384> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class07947.N.codec().fieldOf("player").forGetter(class07384::N), class07415.N.optionalFieldOf("message").forGetter(class07384::y))
         .apply(var0, class07384::new)
   );

   public class07384(class07947 player, Optional<class07415> message) {
      this.player = player;
      this.message = message;
   }

   public Optional<class07415> y() {
      return this.message;
   }

   public class07947 N() {
      return this.player;
   }
}
