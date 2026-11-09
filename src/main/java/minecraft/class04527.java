package minecraft;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.ToDoubleFunction;
import org.jspecify.annotations.Nullable;

public class class04527<T> {
   private final String N;
   private final class02253 y;
   private final DoubleSupplier L;
   private final T u;
   @Nullable
   private Runnable i;
   @Nullable
   private class04522 R;

   public class04527(String var1, class02253 var2, ToDoubleFunction<T> var3, T var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = () -> var3.applyAsDouble(var4);
      this.u = (T)var4;
   }

   public class04530 N() {
      return new class04530(this.N, this.y, this.L, this.i, this.R);
   }

   public class04527<T> N(class04522 var1) {
      this.R = var1;
      return this;
   }

   public class04527<T> N(Consumer<T> var1) {
      this.i = () -> var1.accept(this.u);
      return this;
   }
}
