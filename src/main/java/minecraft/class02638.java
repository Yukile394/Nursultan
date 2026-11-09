package minecraft;

import Nursultan.class09767;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Predicate;

public interface class02638<T, P extends Predicate<T>> extends Predicate<Iterable<T>> {
   static <T, P extends Predicate<T>> class02638<T, P> N(List<P> var0) {
      return (class02638<T, P>)(switch (var0.size()) {
         case 0 -> new class09767();
         case 1 -> new class02656((P)var0.getFirst());
         default -> new class02641(var0);
      });
   }

   @SafeVarargs
   static <T, P extends Predicate<T>> class02638<T, P> N(P... var0) {
      return N(List.of((P[])var0));
   }

   static <T, P extends Predicate<T>> Codec<class02638<T, P>> N(Codec<P> var0) {
      return var0.listOf().xmap(class02638::N, class02638::N);
   }

   List<P> N();
}
