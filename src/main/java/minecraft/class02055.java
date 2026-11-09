package minecraft;

import java.util.Optional;

public interface class02055<T> {
   default class03552<T> y(class03530<T> var1) {
      return this.N(var1).orElseThrow(() -> new IllegalStateException("Missing tag " + var1));
   }

   default class03529<T> y(class05946<T> var1) {
      return this.N(var1).orElseThrow(() -> new IllegalStateException("Missing element " + var1));
   }

   Optional<class03529<T>> N(class05946<T> var1);

   default Optional<class03556<T>> N(class03530<T> var1, class06069 var2) {
      return this.N(var1).flatMap(var1x -> var1x.N(var2));
   }

   Optional<class03552<T>> N(class03530<T> var1);
}
