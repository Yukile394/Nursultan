package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class class05401 implements BiConsumer<class01894, class08819> {
   private final Map<class01894, class08819> N = new HashMap<>();

   public class05401() {
      super();
   }

   public void accept(class01894 var1, class08819 var2) {
      if (this.N.put(var1, var2) != null) {
         throw new IllegalStateException("Duplicate model definition for " + var1);
      }
   }

   public CompletableFuture<?> N(class04476 var1, class01997 var2) {
      return class07135.N(var1, Supplier::get, var2::N, this.N);
   }
}
