package minecraft;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

record class08104(class08119 entry, CompletableFuture<class02008> preparations) {

   class08104(class08119 entry, CompletableFuture<class02008> preparations) {
      super();
      this.entry = entry;
      this.preparations = preparations;
   }

   public CompletableFuture<class02008> y() {
      return this.preparations;
   }

   public class08119 N() {
      return this.entry;
   }

   public void N(Map<class05913, class08388> var1) {
      class02008 class02008 = this.preparations.join();
      this.entry.N().N(class02008);
      class02008.i().forEach((var2x, var3) -> var1.put(new class05913(this.entry.y().N(), var2x), var3));
   }
}
