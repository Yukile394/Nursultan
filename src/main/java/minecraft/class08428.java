package minecraft;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;

abstract class class08428<K, U, V> {
   private int N;
   private int L;
   private final CompletableFuture<?>[] u;
   private int i;
   private final class08398<K, U, V> R;

   class08428(BiFunction<K, U, V> var1, int var2, int var3) {
      super();
      this.R = new class08398<>(var1, var2);
      this.u = new CompletableFuture[var3];
   }

   protected abstract CompletableFuture<?> N(class08398<K, U, V> var1, int var2, int var3, Executor var4);

   protected abstract CompletableFuture<Map<K, V>> N(CompletableFuture<?> var1, class08398<K, U, V> var2);

   private int N() {
      return this.L - this.N;
   }

   protected abstract int N(int var1);

   public CompletableFuture<Map<K, V>> N(Map<K, U> var1, Executor var2) {
      var1.forEach((var2x, var3) -> {
         this.R.N(this.L++, (K)var2x, (U)var3);
         if (this.N() == this.N(this.i)) {
            this.u[this.i++] = this.N(this.R, this.N, this.L, var2);
            this.N = this.L;
         }
      });
      if (!y && this.L != this.R.N()) {
         throw new AssertionError();
      } else if (!y && this.N != this.L) {
         throw new AssertionError();
      } else if (!y && this.i != this.u.length) {
         throw new AssertionError();
      } else {
         return this.N(CompletableFuture.allOf(this.u), this.R);
      }
   }
}
