package minecraft;

import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

interface class04372 extends class04352<Integer> {
   int L();

   default Optional<Integer> L(Integer var1) {
      return Optional.of(var1 - 1);
   }

   default double N(Integer var1) {
      if (var1 == this.aA_()) {
         return 0.0;
      } else {
         return var1 == this.L() ? 1.0 : class04995.y(var1.intValue() + 0.5, (double)this.aA_(), this.L() + 1.0, 0.0, 1.0);
      }
   }

   default Integer N(double var1) {
      if (var1 >= 1.0) {
         var1 = 0.99999F;
      }

      return class04995.N(class04995.y(var1, 0.0, 1.0, (double)this.aA_(), this.L() + 1.0));
   }

   default Optional<Integer> y(Integer var1) {
      return Optional.of(var1 + 1);
   }

   default <R> class04352<R> N(IntFunction<? extends R> var1, ToIntFunction<? super R> var2, boolean var3) {
      return new class04374<>(this, var2, var1, var3);
   }

   int aA_();
}
