package minecraft;

import Nursultan.class10398;
import Nursultan.class10400;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public interface class04468<T> {
   List<T> y(String var1);

   List<T> N(String var1);

   static <T> class04468<T> N(List<T> var0, Function<T, Stream<class01894>> var1) {
      if (var0.isEmpty()) {
         return N();
      } else {
         class00067 class00067x = new class00067();
         class00067 class00067x = new class00067();

         for (Object object : var0) {
            ((Stream)var1.apply(object)).forEach(var3x -> {
               class00067x.N(object, var3x.y().toLowerCase(Locale.ROOT));
               class00067.N(object, var3x.N().toLowerCase(Locale.ROOT));
            });
         }

         class00067x.N();
         class00067x.N();
         return new class10398<>(class00067x, class00067x);
      }
   }

   static <T> class04468<T> N() {
      return new class10400<>();
   }
}
