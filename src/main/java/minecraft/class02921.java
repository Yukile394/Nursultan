package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02921(Optional<class02648<class02827, class02952>> explosions, class00836 flightDuration) implements class02465<class02813> {
   public static final Codec<class02921> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class02648.N(class02952.N).optionalFieldOf("explosions").forGetter(class02921::N),
            class00836.u.optionalFieldOf("flight_duration", class00836.L).forGetter(class02921::L)
         )
         .apply(var0, class02921::new)
   );

   public class00836 L() {
      return this.flightDuration;
   }

   public class02921(Optional<class02648<class02827, class02952>> explosions, class00836 flightDuration) {
      this.explosions = explosions;
      this.flightDuration = flightDuration;
   }

   @Override
   public class02477<class02813> y() {
      return class02484.NT;
   }

   public boolean N(class02813 var1) {
      return this.explosions.isPresent() && !this.explosions.get().test((Iterable<class02827>)var1.y()) ? false : this.flightDuration.u(var1.N());
   }

   public Optional<class02648<class02827, class02952>> N() {
      return this.explosions;
   }
}
