package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

class class04374<R> implements class04352<R> {
   @Override
   public Optional<R> L(R var1) {
      if (!this.L) {
         return Optional.empty();
      } else {
         int i = this.N.applyAsInt(var1);
         return Optional.of((R)this.y.apply(this.u.u(i - 1).orElse(i)));
      }
   }

   class04374(class04372 var1, ToIntFunction var2, IntFunction var3, boolean var4) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Override
   public Optional<R> u(R var1) {
      return this.u.u(this.N.applyAsInt(var1)).map(this.y::apply);
   }

   @Override
   public Codec<R> y() {
      return this.u.y().xmap(this.y::apply, this.N::applyAsInt);
   }

   @Override
   public Optional<R> y(R var1) {
      if (!this.L) {
         return Optional.empty();
      } else {
         int i = this.N.applyAsInt(var1);
         return Optional.of((R)this.y.apply(this.u.u(i + 1).orElse(i)));
      }
   }

   @Override
   public R N(double var1) {
      return (R)this.y.apply(this.u.N(var1));
   }

   @Override
   public double N(R var1) {
      return this.u.N(this.N.applyAsInt(var1));
   }
}
