package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;

class class08420<K, U, V> extends class08428<K, U, V> {
   private final Map<K, V> L;
   private final int u;
   private final int i;

   class08420(BiFunction<K, U, V> var1, int var2, int var3) {
      super(var1, var2, var3);
      this.L = new HashMap<>(var2);
      this.u = class04995.R(var2, var3);
      int ix = this.u * var3 - var2;
      this.i = var3 - ix;
      if (!N && (this.i <= 0 || this.i > var3)) {
         throw new AssertionError();
      }
   }

   @Override
   protected CompletableFuture<Map<K, V>> N(CompletableFuture<?> var1, class08398<K, U, V> var2) {
      Map map = this.L;
      return var1.thenApply(var1x -> map);
   }

   @Override
   protected CompletableFuture<?> N(class08398<K, U, V> var1, int var2, int var3, Executor var4) {
      int ix = var3 - var2;
      if (!N && ix != this.u && ix != this.u - 1) {
         throw new AssertionError();
      } else {
         return CompletableFuture.runAsync(N(this.L, var2, var3, var1), var4);
      }
   }

   private static <K, U, V> Runnable N(Map<K, V> var0, int var1, int var2, class08398<K, U, V> var3) {
      return () -> {
         for (int ix = var1; ix < var2; ix++) {
            var3.N(ix);
         }

         synchronized (var0) {
            for (int j = var1; j < var2; j++) {
               var3.N(j, var0);
            }
         }
      };
   }

   @Override
   protected int N(int var1) {
      return var1 < this.i ? this.u : this.u - 1;
   }
}
