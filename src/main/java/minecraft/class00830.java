package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00830(Optional<class05196> player, Optional<class00845> item) implements class01425 {
   public static final Codec<class00830> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class00830::N), class00845.N.optionalFieldOf("item").forGetter(class00830::y))
         .apply(var0, class00830::new)
   );

   public class00830(Optional<class05196> player, Optional<class00845> item) {
      this.player = player;
      this.item = item;
   }

   public Optional<class00845> y() {
      return this.item;
   }

   public boolean N(class06584 var1) {
      return !this.item.isPresent() || this.item.get().test(var1);
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class00830> N(class00837 var0) {
      return class06912.U.N(new class00830(Optional.empty(), Optional.of(var0.y())));
   }
}
