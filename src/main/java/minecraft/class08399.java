package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;

class class08399<K, U, V> extends class08428<K, U, V> {
   class08399(BiFunction<K, U, V> var1, int var2) {
      super(var1, var2, var2);
   }

   @Override
   protected CompletableFuture<Map<K, V>> N(CompletableFuture<?> var1, class08398<K, U, V> var2) {
      return var1.thenApply(var1x -> {
         HashMap hashmap = new HashMap(var2.N());

         for (int i = 0; i < var2.N(); i++) {
            var2.N(i, hashmap);
         }

         return hashmap;
      });
   }

   @Override
   protected int N(int var1) {
      return 1;
   }

   @Override
   protected CompletableFuture<?> N(class08398<K, U, V> var1, int var2, int var3, Executor var4) {
      if (!N && var2 + 1 != var3) {
         throw new AssertionError();
      } else {
         return CompletableFuture.runAsync(() -> var1.N(var2), var4);
      }
   }
}
