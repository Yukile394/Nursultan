package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class04268(Optional<class05196> player, Optional<class05196> location) implements class01425 {
   public static final Codec<class04268> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class04268::N), class05196.N.optionalFieldOf("location").forGetter(class04268::y))
         .apply(var0, class04268::new)
   );

   public class04268(Optional<class05196> player, Optional<class05196> location) {
      this.player = player;
      this.location = location;
   }

   public Optional<class05196> y() {
      return this.location;
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      this.location.ifPresent(var1x -> var1.N(var1x, class06925.s, "location"));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class05908 var1) {
      return this.location.isEmpty() || this.location.get().N(var1);
   }
}
