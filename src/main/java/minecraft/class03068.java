package minecraft;

import Nursultan.class10102;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.slf4j.Logger;

@FunctionalInterface
public interface class03068 {
   Logger N = LogUtils.getLogger();

   static class03068 N(Executor var0) {
      return new class10102(var0);
   }

   <T> void N(CompletableFuture<T> var1, Consumer<T> var2);

   default void N(Runnable var1) {
      this.N(CompletableFuture.completedFuture(null), var1x -> var1.run());
   }
}
