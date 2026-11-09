package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00866(Optional<Boolean> isRaining, Optional<Boolean> isThundering) implements class05957 {
   public static final MapCodec<class00866> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(class00866::u), Codec.BOOL.optionalFieldOf("thundering").forGetter(class00866::i))
         .apply(var0, class00866::new)
   );

   public static class00867 L() {
      return new class00867();
   }

   public class00866(Optional<Boolean> isRaining, Optional<Boolean> isThundering) {
      this.isRaining = isRaining;
      this.isThundering = isThundering;
   }

   public Optional<Boolean> i() {
      return this.isThundering;
   }

   public Optional<Boolean> u() {
      return this.isRaining;
   }

   public boolean test(class05908 var1) {
      class04782 class04782 = var1.u();
      return this.isRaining.isPresent() && this.isRaining.get() != class04782.method_8419()
         ? false
         : !this.isThundering.isPresent() || this.isThundering.get() == class04782.method_8546();
   }

   @Override
   public class05955 N() {
      return class07693.P;
   }
}
