package minecraft;

import java.util.function.Consumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public interface class03276 {
   int N = 4096;

   static <T extends class00638, P extends class03260<? super T>> class03276 N(
      class02897<P> var0, Function<Iterable<class00381<? super T>>, P> var1, class03242<? super T> var2
   ) {
      return new class03253(var0, var2, var1);
   }

   void N(class00381<?> var1, Consumer<class00381<?>> var2);

   @Nullable
   class03257 N(class00381<?> var1);
}
