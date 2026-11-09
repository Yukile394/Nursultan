package minecraft;

import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

class class04850 implements Supplier<class07948> {
   final class00947 N;
   @Nullable
   private class07948 L;

   class04850(class04864 var1, class00947 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public class07948 get() {
      if (this.L == null) {
         this.L = this.N.N(this.y.y);
      }

      return this.L;
   }
}
