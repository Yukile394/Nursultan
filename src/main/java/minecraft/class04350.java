package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;

public enum class04350 implements class04352<Double> {
   field_37875;

   private class04350() {
   }

   @Override
   public Codec<Double> y() {
      return Codec.withAlternative(Codec.doubleRange(0.0, 1.0), Codec.BOOL, var0 -> var0 ? 1.0 : 0.0);
   }

   public double N(Double var1) {
      return var1;
   }

   public Double N(double var1) {
      return var1;
   }

   public Optional<Double> u(Double var1) {
      return var1 >= 0.0 && var1 <= 1.0 ? Optional.of(var1) : Optional.empty();
   }

   public <R> class04352<R> N(DoubleFunction<? extends R> var1, ToDoubleFunction<? super R> var2) {
      return new class04365<>(this, var2, var1);
   }
}
