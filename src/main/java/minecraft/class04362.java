package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public record class04362<T>(List<T> values, Codec<T> codec) implements class04352<T> {
   @Override
   public Optional<T> L(T var1) {
      int i = class04995.N(this.values.indexOf(var1) - 1, 0, this.values.size() - 1);
      return Optional.of(this.values.get(i));
   }

   public class04362(List<T> values, Codec<T> codec) {
      this.values = values;
      this.codec = codec;
   }

   @Override
   public Optional<T> u(T var1) {
      return this.values.indexOf(var1) > -1 ? Optional.of((T)var1) : Optional.empty();
   }

   @Override
   public Codec<T> y() {
      return this.codec;
   }

   @Override
   public Optional<T> y(T var1) {
      int i = class04995.N(this.values.indexOf(var1) + 1, 0, this.values.size() - 1);
      return Optional.of(this.values.get(i));
   }

   public List<T> N() {
      return this.values;
   }

   @Override
   public T N(double var1) {
      if (var1 >= 1.0) {
         var1 = 0.99999F;
      }

      int i = class04995.N(class04995.y(var1, 0.0, 1.0, 0.0, (double)this.values.size()));
      return this.values.get(class04995.N(i, 0, this.values.size() - 1));
   }

   @Override
   public double N(T var1) {
      if (var1 == this.values.getFirst()) {
         return 0.0;
      } else {
         return var1 == this.values.getLast() ? 1.0 : class04995.y((double)this.values.indexOf(var1), 0.0, (double)(this.values.size() - 1), 0.0, 1.0);
      }
   }
}
