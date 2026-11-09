package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class07679(Optional<class05196> player, class00816 distance) implements class01425 {
   public static final Codec<class07679> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class07679::N), class00816.u.optionalFieldOf("distance", class00816.L).forGetter(class07679::y)
         )
         .apply(var0, class07679::new)
   );

   public class07679(Optional<class05196> player, class00816 distance) {
      super();
      this.player = player;
      this.distance = distance;
   }

   public class00816 y() {
      return this.distance;
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(double var1) {
      return this.distance.i(var1);
   }
}
