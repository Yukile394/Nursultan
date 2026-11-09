package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.function.Function;

public record class02826<T>(T raw, Optional<T> filtered) {
   public class02826(T raw, Optional<T> filtered) {
      super();
      this.raw = (T)raw;
      this.filtered = filtered;
   }

   public Optional<T> y() {
      return this.filtered;
   }

   public <U> Optional<class02826<U>> y(Function<T, Optional<U>> var1) {
      Optional optional = (Optional)var1.apply(this.raw);
      if (optional.isEmpty()) {
         return Optional.empty();
      } else if (this.filtered.isPresent()) {
         Optional optional1 = (Optional)var1.apply(this.filtered.get());
         return optional1.isEmpty() ? Optional.empty() : Optional.of((class02826<U>)(new class02826<>(optional.get(), optional1)));
      } else {
         return Optional.of((class02826<U>)(new class02826<>(optional.get(), Optional.empty())));
      }
   }

   public static <B extends ByteBuf, T> class02362<B, class02826<T>> N(class02362<B, T> var0) {
      return class02362.N(var0, class02826::N, var0.N_33(class02389::N), class02826::y, class02826::new);
   }

   public T N() {
      return this.raw;
   }

   public static <T> Codec<class02826<T>> N(Codec<T> var0) {
      Codec codec = RecordCodecBuilder.create(
         var1x -> var1x.group(var0.fieldOf("raw").forGetter(class02826::N), var0.optionalFieldOf("filtered").forGetter(class02826::y))
            .apply(var1x, class02826::new)
      );
      Codec codec1 = var0.xmap(class02826::N, class02826::N);
      return Codec.withAlternative(codec, codec1);
   }

   public <U> class02826<U> N(Function<T, U> var1) {
      return (class02826<U>)(new class02826<>(var1.apply(this.raw), this.filtered.map(var1)));
   }

   public T N(boolean var1) {
      return var1 ? this.filtered.orElse(this.raw) : this.raw;
   }

   public static class02826<String> N(class06068 var0) {
      return new class02826<>(var0.u(), var0.L() ? Optional.of(var0.y()) : Optional.empty());
   }

   public static <T> class02826<T> N(T var0) {
      return new class02826<>(var0, Optional.empty());
   }
}
