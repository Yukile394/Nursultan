package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@FunctionalInterface
public interface class01081 {
   CompletableFuture<Void> method_25931(class01073 var1, Executor var2, class01080 var3, Executor var4);

   default String method_22322() {
      return this.getClass().getSimpleName();
   }

   default void prepareSharedState(class01073 var1) {
   }
}
