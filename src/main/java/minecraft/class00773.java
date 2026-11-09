package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00773(Optional<class05196> player, Optional<class03556<class06525>> potion) implements class01425 {
   public static final Codec<class00773> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class00773::N), class06525.N.optionalFieldOf("potion").forGetter(class00773::L))
         .apply(var0, class00773::new)
   );

   public Optional<class03556<class06525>> L() {
      return this.potion;
   }

   public class00773(Optional<class05196> player, Optional<class03556<class06525>> potion) {
      super();
      this.player = player;
      this.potion = potion;
   }

   public static class06915<class00773> y() {
      return class06912.E.N(new class00773(Optional.empty(), Optional.empty()));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class03556<class06525> var1) {
      return !this.potion.isPresent() || this.potion.get().equals(var1);
   }
}
