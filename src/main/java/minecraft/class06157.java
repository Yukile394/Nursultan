package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

class class06157 implements class01080 {
   class06157(class06162 var1, Executor var2, class01081 var3, CompletableFuture var4) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Override
   public <T> CompletableFuture<T> N(T var1) {
      this.N.execute(() -> {
         this.u.y.remove(var1x);
         if (this.u.y.isEmpty()) {
            this.u.N.complete(class06244.field_17274);
         }
      });
      return this.u.N.thenCombine(this.L, (var1x, var2) -> (T)var1);
   }
}
