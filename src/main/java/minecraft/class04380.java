package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public record class04380<T>(List<T> values, Codec<T> codec) implements class04361<T> {
   public List<T> L() {
      return this.values;
   }

   public class04380(List<T> values, Codec<T> codec) {
      super();
      this.values = values;
      this.codec = codec;
   }

   @Override
   public Optional<T> u(T var1) {
      return this.values.contains(var1) ? Optional.of((T)var1) : Optional.empty();
   }

   @Override
   public Codec<T> y() {
      return this.codec;
   }

   @Override
   public class06363<T> N() {
      return class06363.N(this.values);
   }
}
