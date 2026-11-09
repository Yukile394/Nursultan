package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00853(Optional<class05196> player, Optional<class00845> item, class00836 durability, class00836 delta) implements class01425 {
   public static final Codec<class00853> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00853::N),
            class00845.N.optionalFieldOf("item").forGetter(class00853::y),
            class00836.u.optionalFieldOf("durability", class00836.L).forGetter(class00853::L),
            class00836.u.optionalFieldOf("delta", class00836.L).forGetter(class00853::u)
         )
         .apply(var0, class00853::new)
   );

   public class00836 L() {
      return this.durability;
   }

   public class00853(Optional<class05196> player, Optional<class00845> item, class00836 durability, class00836 delta) {
      this.player = player;
      this.item = item;
      this.durability = durability;
      this.delta = delta;
   }

   public class00836 u() {
      return this.delta;
   }

   public Optional<class00845> y() {
      return this.item;
   }

   public boolean N(class06584 var1, int var2) {
      if (this.item.isPresent() && !this.item.get().test(var1)) {
         return false;
      } else {
         return !this.durability.u(var1.s() - var2) ? false : this.delta.u(var1.P() - var2);
      }
   }

   public static class06915<class00853> N(Optional<class05196> var0, Optional<class00845> var1, class00836 var2) {
      return class06912.n.N(new class00853(var0, var1, var2, class00836.L));
   }

   public static class06915<class00853> N(Optional<class00845> var0, class00836 var1) {
      return N(Optional.empty(), var0, var1);
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }
}
