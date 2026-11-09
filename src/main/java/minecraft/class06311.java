package minecraft;

import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class06311 {
   @Nullable
   class06297 N;
   private boolean L;

   public class06311(class06323 var1, class06297 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public void y() {
      this.L = true;
      this.y.N.N(this.N);
      this.N = null;
   }

   public boolean N() {
      return this.L;
   }

   public void N(Consumer<class06297> var1) {
      this.y.y.execute(() -> {
         if (this.N != null) {
            var1.accept(this.N);
         }
      });
   }
}
