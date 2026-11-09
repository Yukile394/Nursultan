package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public record class04346<T>(Supplier<List<T>> values, Function<T, Optional<T>> validateValue, Codec<T> codec) implements class04361<T> {
   public Supplier<List<T>> L() {
      return this.values;
   }

   public class04346(Supplier<List<T>> values, Function<T, Optional<T>> validateValue, Codec<T> codec) {
      this.values = values;
      this.validateValue = validateValue;
      this.codec = codec;
   }

   public Function<T, Optional<T>> u() {
      return this.validateValue;
   }

   @Override
   public Optional<T> u(T var1) {
      return this.validateValue.apply((T)var1);
   }

   @Override
   public Codec<T> y() {
      return this.codec;
   }

   @Override
   public class06363<T> N() {
      return class06363.N(this.values.get());
   }
}
