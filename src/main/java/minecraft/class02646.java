package minecraft;

import Nursultan.class09766;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public interface class02646<T, P extends Predicate<T>> extends Predicate<Iterable<T>> {
   static <T, P extends Predicate<T>> class02646<T, P> N(List<class02620<T, P>> var0) {
      return (class02646<T, P>)(switch (var0.size()) {
         case 0 -> new class09766();
         case 1 -> new class02664((class02620<T, P>)var0.getFirst());
         default -> new class02633(var0);
      });
   }

   @SafeVarargs
   static <T, P extends Predicate<T>> class02646<T, P> N(class02620<T, P>... var0) {
      return N(List.of(var0));
   }

   static <T, P extends Predicate<T>> Codec<class02646<T, P>> N(Codec<P> var0) {
      return class02620.N(var0).listOf().xmap(class02646::N, class02646::N);
   }

   List<class02620<T, P>> N();
}
