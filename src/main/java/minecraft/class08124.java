package minecraft;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class class08124 {
   final List<class08104> N;
   private final Map<class01894, CompletableFuture<class02008>> L;
   final CompletableFuture<?> y;

   class08124(List<class08104> var1, Map<class01894, CompletableFuture<class02008>> var2, CompletableFuture<?> var3) {
      super();
      this.N = var1;
      this.L = var2;
      this.y = var3;
   }

   public CompletableFuture<class02008> N(class01894 var1) {
      return Objects.requireNonNull(this.L.get(var1));
   }

   public Map<class05913, class08388> N() {
      HashMap hashmap = new HashMap();
      this.N.forEach(var1x -> var1x.N(hashmap));
      return hashmap;
   }
}
