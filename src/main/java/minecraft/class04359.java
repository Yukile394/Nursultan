package minecraft;

import java.util.function.Consumer;
import java.util.function.Function;

interface class04359<T> extends class04352<T>, class04361<T> {
   boolean i();

   @Override
   default Function<class04370<T>, class06478> N(class04355<T> var1, class05630 var2, int var3, int var4, int var5, Consumer<T> var6) {
      return this.i() ? class04361.super.N(var1, var2, var3, var4, var5, var6) : class04352.super.N(var1, var2, var3, var4, var5, var6);
   }
}
