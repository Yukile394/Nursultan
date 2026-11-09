package minecraft;

import org.jspecify.annotations.Nullable;

public class class06734 implements AutoCloseable {
   @Nullable
   private final class06728 N = class06724.N.get();
   private boolean y;

   class06734() {
      super();
   }

   @Override
   public void close() {
      if (!this.y) {
         this.y = true;
         class06724.N.set(this.N);
      }
   }
}
