package minecraft;

import java.util.UUID;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class01103<T extends class01135> implements class01124<T> {
   private final class01131<T> N;
   private final class01129<T> y;

   public class01103(class01131<T> var1, class01129<T> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public <U extends T> void N(class01128<T, U> var1, class04197<U> var2) {
      this.N.N(var1, var2);
   }

   @Override
   public void N(class00734 var1, Consumer<T> var2) {
      this.y.y(var1, class04197.N(var2));
   }

   @Override
   public <U extends T> void N(class01128<T, U> var1, class00734 var2, class04197<U> var3) {
      this.y.N(var1, var2, var3);
   }

   @Override
   public Iterable<T> N() {
      return this.N.N();
   }

   @Nullable
   @Override
   public T N(UUID var1) {
      return this.N.N(var1);
   }

   @Nullable
   @Override
   public T N(int var1) {
      return this.N.N(var1);
   }
}
