package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;

public abstract class class05054 {
   public static final Codec<class05054> N = class04206.h.T().dispatch(class05054::y, class05052::N);
   protected static final int y = 16;
   protected final OptionalInt L;

   public OptionalInt L() {
      return this.L;
   }

   public class05054(OptionalInt var1) {
      super();
      this.L = var1;
   }

   protected abstract class05052<?> y();

   protected static <S extends class05054> RecordCodecBuilder<S, OptionalInt> N() {
      return Codec.intRange(0, 80)
         .optionalFieldOf("min_clipped_height")
         .xmap(var0 -> var0.map(OptionalInt::of).orElse(OptionalInt.empty()), var0 -> var0.isPresent() ? Optional.of(var0.getAsInt()) : Optional.empty())
         .forGetter(var0 -> var0.L);
   }

   public abstract int N(int var1, int var2);
}
