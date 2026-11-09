package minecraft;

import Nursultan.class10013;
import Nursultan.class10015;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public interface class02818<T> {
   @Nullable
   T y(@Nullable T var1);

   @Nullable
   String y();

   <E extends Throwable> T y(Supplier<E> var1) throws E;

   <R> class02818<R> N_11(Function<T, R> var1);

   class02818<T> N_36(Consumer<T> var1);

   static <T> class02818<T> N(T var0) {
      return new class10015<>((T)var0);
   }

   static <T> class02818<T> N(String var0) {
      return N(() -> var0);
   }

   static <T> class02818<T> N(Supplier<String> var0) {
      return new class10013<>(var0);
   }

   boolean N();

   @Nullable
   static <R> R N(class02818<? extends R> var0, @Nullable R var1) {
      Object object = var0.y(null);
      return (R)(object != null ? object : var1);
   }
}
