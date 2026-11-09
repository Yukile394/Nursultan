package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.Set;

public record class01405(Optional<Long> period, class05338 value) implements class05957 {
   public static final MapCodec<class01405> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.LONG.optionalFieldOf("period").forGetter(class01405::L), class05338.N.fieldOf("value").forGetter(class01405::u))
         .apply(var0, class01405::new)
   );

   public Optional<Long> L() {
      return this.period;
   }

   public class01405(Optional<Long> period, class05338 value) {
      super();
      this.period = period;
      this.value = value;
   }

   public class05338 u() {
      return this.value;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.value.N();
   }

   public boolean test(class05908 var1) {
      long i = var1.u().method_8532();
      if (this.period.isPresent()) {
         i %= this.period.get();
      }

      return this.value.y(var1, (int)i);
   }

   @Override
   public class05955 N() {
      return class07693.T;
   }

   public static class01397 N(class05338 var0) {
      return new class01397(var0);
   }
}
