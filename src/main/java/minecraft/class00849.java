package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class00849(class00836 amplifier, class00836 duration, Optional<Boolean> ambient, Optional<Boolean> visible) {
   public static final Codec<class00849> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00836.u.optionalFieldOf("amplifier", class00836.L).forGetter(class00849::N),
            class00836.u.optionalFieldOf("duration", class00836.L).forGetter(class00849::y),
            Codec.BOOL.optionalFieldOf("ambient").forGetter(class00849::L),
            Codec.BOOL.optionalFieldOf("visible").forGetter(class00849::u)
         )
         .apply(var0, class00849::new)
   );

   public Optional<Boolean> L() {
      return this.ambient;
   }

   public class00849() {
      this(class00836.L, class00836.L, Optional.empty(), Optional.empty());
   }

   public class00849(class00836 amplifier, class00836 duration, Optional<Boolean> ambient, Optional<Boolean> visible) {
      super();
      this.amplifier = amplifier;
      this.duration = duration;
      this.ambient = ambient;
      this.visible = visible;
   }

   public Optional<Boolean> u() {
      return this.visible;
   }

   public class00836 y() {
      return this.duration;
   }

   public class00836 N() {
      return this.amplifier;
   }

   public boolean N(@Nullable class07055 var1) {
      if (var1 == null) {
         return false;
      } else if (!this.amplifier.u(var1.i())) {
         return false;
      } else if (!this.duration.u(var1.u())) {
         return false;
      } else {
         return this.ambient.isPresent() && this.ambient.get() != var1.R() ? false : !this.visible.isPresent() || this.visible.get() == var1.M();
      }
   }
}
