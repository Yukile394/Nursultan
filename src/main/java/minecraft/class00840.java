package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00840(Optional<class05196> player, Optional<class00761> distance, class00836 duration) implements class01425 {
   public static final Codec<class00840> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00840::N),
            class00761.N.optionalFieldOf("distance").forGetter(class00840::y),
            class00836.u.optionalFieldOf("duration", class00836.L).forGetter(class00840::L)
         )
         .apply(var0, class00840::new)
   );

   public class00836 L() {
      return this.duration;
   }

   public class00840(Optional<class05196> player, Optional<class00761> distance, class00836 duration) {
      super();
      this.player = player;
      this.distance = distance;
      this.duration = duration;
   }

   public Optional<class00761> y() {
      return this.distance;
   }

   public boolean N(class04770 var1, class06889 var2, int var3) {
      return this.distance.isPresent() && !this.distance.get().N(var2.M, var2.B, var2.Z, var1.method_23317(), var1.method_23318(), var1.method_23321())
         ? false
         : this.duration.u(var3);
   }

   public static class06915<class00840> N(class00761 var0) {
      return class06912.t.N(new class00840(Optional.empty(), Optional.of(var0), class00836.L));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }
}
