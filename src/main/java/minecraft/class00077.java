package minecraft;

import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

@FunctionalInterface
public interface class00077<T> {
   static <T> class00077<T> N(List<T> var0, Function<T, Stream<String>> var1) {
      if (var0.isEmpty()) {
         return N();
      } else {
         class00067 class00067 = new class00067();

         for (Object object : var0) {
            ((Stream)var1.apply(object)).forEach(var2x -> class00067.N(object, var2x.toLowerCase(Locale.ROOT)));
         }

         class00067.N();
         return class00067::N;
      }
   }

   static <T> class00077<T> N() {
      return var0 -> List.of();
   }

   List<T> method_4810(String var1);
}
