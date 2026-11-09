package minecraft;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

interface class04352<T> extends class04344<T> {
   default Optional<T> L(T var1) {
      return Optional.empty();
   }

   default boolean u() {
      return true;
   }

   default Optional<T> y(T var1) {
      return Optional.empty();
   }

   @Override
   default Function<class04370<T>, class06478> N(class04355<T> var1, class05630 var2, int var3, int var4, int var5, Consumer<T> var6) {
      return var7 -> new class04357<>(var2, var3, var4, var5, 20, var7, this, var1, var6, this.u());
   }

   T N(double var1);

   double N(T var1);
}
