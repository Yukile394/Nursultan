package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00791(Optional<class05196> player, Optional<class00845> item, class00836 levels) implements class01425 {
   public static final Codec<class00791> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00791::N),
            class00845.N.optionalFieldOf("item").forGetter(class00791::L),
            class00836.u.optionalFieldOf("levels", class00836.L).forGetter(class00791::u)
         )
         .apply(var0, class00791::new)
   );

   public Optional<class00845> L() {
      return this.item;
   }

   public class00791(Optional<class05196> player, Optional<class00845> item, class00836 levels) {
      this.player = player;
      this.item = item;
      this.levels = levels;
   }

   public class00836 u() {
      return this.levels;
   }

   public static class06915<class00791> y() {
      return class06912.z.N(new class00791(Optional.empty(), Optional.empty(), class00836.L));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class06584 var1, int var2) {
      return this.item.isPresent() && !this.item.get().test(var1) ? false : this.levels.u(var2);
   }
}
