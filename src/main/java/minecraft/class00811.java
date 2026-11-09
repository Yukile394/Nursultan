package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00811(Optional<class05196> player, Optional<class00817> startPosition, Optional<class00761> distance) implements class01425 {
   public static final Codec<class00811> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00811::N),
            class00817.N.optionalFieldOf("start_position").forGetter(class00811::y),
            class00761.N.optionalFieldOf("distance").forGetter(class00811::L)
         )
         .apply(var0, class00811::new)
   );

   public Optional<class00761> L() {
      return this.distance;
   }

   public class00811(Optional<class05196> player, Optional<class00817> startPosition, Optional<class00761> distance) {
      super();
      this.player = player;
      this.startPosition = startPosition;
      this.distance = distance;
   }

   public Optional<class00817> y() {
      return this.startPosition;
   }

   public static class06915<class00811> N(class00761 var0) {
      return class06912.O.N(new class00811(Optional.empty(), Optional.empty(), Optional.of(var0)));
   }

   public static class06915<class00811> N(class00810 var0, class00761 var1, class00818 var2) {
      return class06912.r.N(new class00811(Optional.of(class00821.N(var0)), Optional.of(var2.y()), Optional.of(var1)));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class00811> N(class00810 var0, class00761 var1) {
      return class06912.NN.N(new class00811(Optional.of(class00821.N(var0)), Optional.empty(), Optional.of(var1)));
   }

   public boolean N(class04782 var1, class06889 var2, class06889 var3) {
      return this.startPosition.isPresent() && !this.startPosition.get().N(var1, var2.M, var2.B, var2.Z)
         ? false
         : !this.distance.isPresent() || this.distance.get().N(var2.M, var2.B, var2.Z, var3.M, var3.B, var3.Z);
   }
}
