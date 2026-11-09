package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class class00468 implements class00440 {
   private final class05623 N;

   public class00468(class05623 var1) {
      super();
      this.N = var1;
   }

   @Override
   public <V> CompletableFuture<V> N(Supplier<V> var1) {
      return this.N.N(var1);
   }

   @Override
   public CompletableFuture<Void> N(Runnable var1) {
      return this.N.u(var1);
   }
}
