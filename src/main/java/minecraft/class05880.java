package minecraft;

import Nursultan.class10543;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface class05880 {
   class05880 N = new class05844();

   default void N_53(BiConsumer<class07299, class07209> var1) {
      this.N((var1x, var2) -> {
         var1.accept(var1x, var2);
         return Optional.empty();
      });
   }

   static class05880 N(class07299 var0, class07209 var1) {
      return new class10543(var0, var1);
   }

   default <T> T N(BiFunction<class07299, class07209, T> var1, T var2) {
      return this.<T>N(var1).orElse((T)var2);
   }

   <T> Optional<T> N(BiFunction<class07299, class07209, T> var1);
}
