package minecraft;

import java.util.Objects;
import java.util.Optional;

public record class00442<T>(class00455<T> subscription, Optional<T> value) {
   public static final class02362<class04247, class00442<?>> N = class02389.N(class04227.v).y(class00442::N, class00442::N);

   public class00442(class00455<T> subscription, Optional<T> value) {
      this.subscription = subscription;
      this.value = value;
   }

   public Optional<T> y() {
      return this.value;
   }

   public class00455<T> N() {
      return this.subscription;
   }

   private static <T> class02362<? super class04247, class00442<T>> N(class00455<T> var0) {
      return class02389.N(Objects.requireNonNull(var0.y)).N_10(var1 -> new class00442(var0, (Optional<T>)var1), class00442::y);
   }
}
