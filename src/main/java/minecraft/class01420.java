package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

record class01420(Optional<String> minValue, Optional<String> maxValue) implements class01426 {
   public static final Codec<class01420> N = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.STRING.optionalFieldOf("min").forGetter(class01420::N), Codec.STRING.optionalFieldOf("max").forGetter(class01420::y))
         .apply(var0, class01420::new)
   );
   public static final class02362<ByteBuf, class01420> y = class02362.N(
      class02389.N(class02389.s), class01420::N, class02389.N(class02389.s), class01420::y, class01420::new
   );

   private class01420(Optional<String> minValue, Optional<String> maxValue) {
      super();
      this.minValue = minValue;
      this.maxValue = maxValue;
   }

   public Optional<String> y() {
      return this.maxValue;
   }

   public Optional<String> N() {
      return this.minValue;
   }

   @Override
   public <T extends Comparable<T>> boolean N(class00522<?, ?> var1, class08092<T> var2) {
      Comparable comparable = var1.L(var2);
      if (this.minValue.isPresent()) {
         Optional optional = var2.y(this.minValue.get());
         if (optional.isEmpty() || comparable.compareTo((Comparable)optional.get()) < 0) {
            return false;
         }
      }

      if (this.maxValue.isPresent()) {
         Optional optional1 = var2.y(this.maxValue.get());
         if (optional1.isEmpty() || comparable.compareTo((Comparable)optional1.get()) > 0) {
            return false;
         }
      }

      return true;
   }
}
