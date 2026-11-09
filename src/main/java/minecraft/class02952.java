package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.Predicate;

public record class02952(Optional<class02835> shape, Optional<Boolean> twinkle, Optional<Boolean> trail) implements Predicate<class02827> {
   public static final Codec<class02952> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class02835.field_49322.optionalFieldOf("shape").forGetter(class02952::N),
            Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(class02952::y),
            Codec.BOOL.optionalFieldOf("has_trail").forGetter(class02952::L)
         )
         .apply(var0, class02952::new)
   );

   public Optional<Boolean> L() {
      return this.trail;
   }

   public class02952(Optional<class02835> shape, Optional<Boolean> twinkle, Optional<Boolean> trail) {
      super();
      this.shape = shape;
      this.twinkle = twinkle;
      this.trail = trail;
   }

   public Optional<Boolean> y() {
      return this.twinkle;
   }

   public Optional<class02835> N() {
      return this.shape;
   }

   public boolean test(class02827 var1) {
      if (this.shape.isPresent() && this.shape.get() != var1.N()) {
         return false;
      } else {
         return this.twinkle.isPresent() && this.twinkle.get() != var1.i() ? false : !this.trail.isPresent() || this.trail.get() == var1.u();
      }
   }
}
