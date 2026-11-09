package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class02187(Optional<class05196> player, Optional<class00817> startPosition, Optional<class00761> distance, Optional<class05196> cause)
   implements class01425 {
   public static final Codec<class02187> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class02187::N),
            class00817.N.optionalFieldOf("start_position").forGetter(class02187::y),
            class00761.N.optionalFieldOf("distance").forGetter(class02187::L),
            class00821.y.optionalFieldOf("cause").forGetter(class02187::u)
         )
         .apply(var0, class02187::new)
   );

   public Optional<class00761> L() {
      return this.distance;
   }

   public class02187(Optional<class05196> player, Optional<class00817> startPosition, Optional<class00761> distance, Optional<class05196> cause) {
      this.player = player;
      this.startPosition = startPosition;
      this.distance = distance;
      this.cause = cause;
   }

   public Optional<class05196> u() {
      return this.cause;
   }

   public Optional<class00817> y() {
      return this.startPosition;
   }

   public boolean N(class04782 var1, class06889 var2, class06889 var3, @Nullable class05908 var4) {
      if (this.startPosition.isPresent() && !this.startPosition.get().N(var1, var2.M, var2.B, var2.Z)) {
         return false;
      } else {
         return this.distance.isPresent() && !this.distance.get().N(var2.M, var2.B, var2.Z, var3.M, var3.B, var3.Z)
            ? false
            : !this.cause.isPresent() || var4 != null && this.cause.get().N(var4);
      }
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.u(), "cause");
   }

   public static class06915<class02187> N(class00761 var0, class00810 var1) {
      return class06912.NM.N(new class02187(Optional.empty(), Optional.empty(), Optional.of(var0), Optional.of(class00821.N(var1))));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }
}
