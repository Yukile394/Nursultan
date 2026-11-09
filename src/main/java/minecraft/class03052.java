package minecraft;

import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class class03052 implements class03068, AutoCloseable {
   private static final Logger y = LogUtils.getLogger();
   private CompletableFuture<?> L = CompletableFuture.completedFuture(null);
   private final Executor u;
   private volatile boolean i;

   public class03052(Executor var1) {
      super();
      this.u = var1;
   }

   @Override
   public void close() {
      this.i = true;
   }

   @Override
   public <T> void N(CompletableFuture<T> var1, Consumer<T> var2) {
      this.L = this.L.<T, Object>thenCombine(var1, (var0, var1x) -> var1x).thenAcceptAsync(var2x -> {
         if (!this.i) {
            var2.accept(var2x);
         }
      }, this.u).exceptionally(var0 -> {
         if (var0 instanceof CompletionException completionexception) {
            var0 = completionexception.getCause();
         }

         if (var0 instanceof CancellationException cancellationexception) {
            throw cancellationexception;
         } else {
            y.error("Chain link failed, continuing to next one", var0);
            return null;
         }
      });
   }
}
