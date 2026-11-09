package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;

class class04365<R> implements class04352<R> {
   class04365(class04350 var1, ToDoubleFunction var2, DoubleFunction var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   @Override
   public Optional<R> u(R var1) {
      return this.L.u(this.N.applyAsDouble(var1)).map(this.y::apply);
   }

   @Override
   public Codec<R> y() {
      return this.L.y().xmap(this.y::apply, this.N::applyAsDouble);
   }

   @Override
   public R N(double var1) {
      return (R)this.y.apply(this.L.N(var1));
   }

   @Override
   public double N(R var1) {
      return this.L.N(Double.valueOf(this.N.applyAsDouble(var1)));
   }
}
