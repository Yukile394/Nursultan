package minecraft;

import java.util.Arrays;
import java.util.function.Function;

public interface class08967<T extends class08967<T>> {
   T N();

   default <E> T N(E[] var1, Function<E, class08137> var2) {
      return this.N(Arrays.asList(var1), var2);
   }

   default <E> T N(Iterable<E> var1, Function<E, class08137> var2) {
      class08967 class08967 = this.N();

      for (Object object : var1) {
         class08967 = class08967.N((class08137)var2.apply(object));
      }

      return (T)class08967;
   }

   T N(class08137 var1);
}
