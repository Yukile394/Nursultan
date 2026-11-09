package minecraft;

import java.util.concurrent.CompletableFuture;

public interface class06164 {
   default boolean L() {
      return this.N().isDone();
   }

   default void u() {
      CompletableFuture<?> completablefuture = this.N();
      if (completablefuture.isCompletedExceptionally()) {
         completablefuture.join();
      }
   }

   float y();

   CompletableFuture<?> N();
}
