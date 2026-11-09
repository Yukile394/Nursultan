package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public abstract class class01291<T> implements class01081 {
   public class01291() {
      super();
   }

   protected abstract T y(class01089 var1, class04643 var2);

   protected abstract void N(T var1, class01089 var2, class04643 var3);

   @Override
   public final CompletableFuture<Void> method_25931(class01073 var1, Executor var2, class01080 var3, Executor var4) {
      class01089 class01089 = var1.N();
      return CompletableFuture.<T>supplyAsync(() -> this.y(class01089, class08700.N()), var2)
         .thenCompose(var3::N)
         .thenAcceptAsync(var2x -> this.N((T)var2x, class01089, class08700.N()), var4);
   }
}
