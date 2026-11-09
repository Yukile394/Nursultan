package minecraft;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;

public class class08404 {
   private static final int N = 16;

   public class08404() {
      super();
   }

   public static <K, U, V> CompletableFuture<Map<K, V>> N(Map<K, U> var0, BiFunction<K, U, V> var1, Executor var2) {
      int i = class07536.M() * 16;
      return N(var0, var1, i, var2);
   }

   public static <K, U, V> CompletableFuture<Map<K, V>> N(Map<K, U> var0, BiFunction<K, U, V> var1, int var2, Executor var3) {
      int i = var0.size();
      if (i == 0) {
         return CompletableFuture.completedFuture(Map.of());
      } else if (i == 1) {
         Entry entry = (Entry)var0.entrySet().iterator().next();
         Object object1 = entry.getKey();
         Object object2 = entry.getValue();
         return CompletableFuture.supplyAsync(() -> {
            Object objectx = var1.apply(object1, object2);
            return objectx != null ? Map.of((K)object1, (V)objectx) : Map.of();
         }, var3);
      } else {
         Object object = i <= var2 ? new class08399(var1, i) : new class08420(var1, i, var2);
         return ((class08428)object).N(var0, var3);
      }
   }
}
