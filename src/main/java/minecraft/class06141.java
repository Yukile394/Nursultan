package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface class06141 extends class01081 {
   void method_14491(class01089 var1);

   @Override
   default CompletableFuture<Void> method_25931(class01073 var1, Executor var2, class01080 var3, Executor var4) {
      class01089 class01089 = var1.N();
      return var3.N(class06244.field_17274).thenRunAsync(() -> {
         class04643 class04643 = class08700.N();
         class04643.N("listener");
         this.method_14491(class01089);
         class04643.L();
      }, var4);
   }
}
