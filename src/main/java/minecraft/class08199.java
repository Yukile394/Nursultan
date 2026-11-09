package minecraft;

import Nursultan.class10884;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

public interface class08199<R extends Runnable> extends AutoCloseable {
   @Override
   default void close() {
   }

   R y(Runnable var1);

   static class08199<Runnable> N(String var0, Executor var1) {
      return new class10884(var0, var1);
   }

   default <Source> CompletableFuture<Source> N_87(Consumer<CompletableFuture<Source>> var1) {
      CompletableFuture completablefuture = new CompletableFuture();
      this.N(this.y(() -> var1.accept(completablefuture)));
      return completablefuture;
   }

   void N(R var1);

   String as_();
}
