package minecraft;

import java.util.Objects;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

class class02356<S, T> implements class08501<S, T>, Supplier<String> {
   private final class02353<T> y;
   @Nullable
   class02324<S, T> N;

   public String get() {
      return "Unbound rule " + this.y;
   }

   public class02356(class02353<T> var1) {
      super();
      this.y = var1;
   }

   @Override
   public class02324<S, T> y() {
      return Objects.requireNonNull(this.N, this);
   }

   @Override
   public class02353<T> N() {
      return this.y;
   }
}
