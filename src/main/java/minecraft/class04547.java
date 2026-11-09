package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class04547(Optional<class05196> player, Optional<class00845> item) implements class01425 {
   public static final Codec<class04547> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class04547::N), class00845.N.optionalFieldOf("item").forGetter(class04547::y))
         .apply(var0, class04547::new)
   );

   public class04547(Optional<class05196> player, Optional<class00845> item) {
      super();
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

   public static class06915<class04547> N(class00810 var0, class00837 var1) {
      return class06912.h.N(new class04547(Optional.of(class00821.N(var0)), Optional.of(var1.y())));
   }
}
