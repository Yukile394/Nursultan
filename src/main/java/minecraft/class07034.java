package minecraft;

import java.util.Optional;
import java.util.function.Function;

@FunctionalInterface
public interface class07034<T> extends Function<class03530<T>, Optional<class01225>> {
   default boolean N(class03530<T> var1) {
      return this.apply(var1).isPresent();
   }

   static <T> class07034<T> N() {
      return var0 -> Optional.empty();
   }
}
