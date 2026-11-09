package minecraft;

import java.util.Objects;

public record class00428<T>(class00455<T> subscription, T value) {
   public static final class02362<class04247, class00428<?>> N = class02389.N(class04227.v).y(class00428::N, class00428::N);

   public class00428(class00455<T> subscription, T value) {
      super();
      this.subscription = subscription;
      this.value = (T)value;
   }

   public T y() {
      return this.value;
   }

   public class00455<T> N() {
      return this.subscription;
   }

   private static <T> class02362<? super class04247, class00428<T>> N(class00455<T> var0) {
      return Objects.requireNonNull(var0.y).N_10(var1 -> new class00428<>(var0, var1), class00428::y);
   }
}
