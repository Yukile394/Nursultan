package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

class class05454 implements class05477 {
   class05454() {
      super();
   }

   @Override
   public CompletableFuture<class06068> N(String var1) {
      return CompletableFuture.completedFuture(class06068.N(var1));
   }

   @Override
   public CompletableFuture<List<class06068>> N(List<String> var1) {
      return CompletableFuture.completedFuture(var1.stream().map(class06068::N).collect(ImmutableList.toImmutableList()));
   }
}
