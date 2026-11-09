package minecraft;

import java.util.Optional;
import java.util.function.Predicate;

@FunctionalInterface
public interface class03160<C extends class06386> {
   static <C extends class06386> class03160<C> N(Predicate<class03158<C>> var0, class03320<C> var1) {
      Optional optional = Optional.of(var1);
      return var2x -> var0.test(var2x) ? optional : Optional.empty();
   }

   static <C extends class06386> Predicate<class03158<C>> N(class07830 var0) {
      return var1 -> var1.N(var0);
   }

   Optional<class03320<C>> createGenerator(class03158<C> var1);
}
