package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public interface class00440 {
   <V> CompletableFuture<V> N(Supplier<V> var1);

   CompletableFuture<Void> N(Runnable var1);
}
