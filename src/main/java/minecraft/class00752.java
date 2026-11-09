package minecraft;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public interface class00752<T> {
   Stream<class03552<T>> L();

   boolean y();

   static <T> class00752<T> N() {
      return new class00728<>();
   }

   void N(BiConsumer<? super class03530<T>, ? super class03552<T>> var1);

   Optional<class03552<T>> N(class03530<T> var1);

   static <T> class00752<T> N(Map<class03530<T>, class03552<T>> var0) {
      return new class00735<>(var0);
   }
}
