package minecraft;

import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class08694 implements AutoCloseable {
   public static final class08694 N = new class08694(null);
   @Nullable
   private final class04643 y;

   class08694(@Nullable class04643 var1) {
      super();
      this.y = var1;
   }

   @Override
   public void close() {
      if (this.y != null) {
         this.y.L();
      }
   }

   public class08694 N(long var1) {
      if (this.y != null) {
         this.y.N(var1);
      }

      return this;
   }

   public class08694 N(int var1) {
      if (this.y != null) {
         this.y.N(var1);
      }

      return this;
   }

   public class08694 N(String var1) {
      if (this.y != null) {
         this.y.L(var1);
      }

      return this;
   }

   public class08694 N(Supplier<String> var1) {
      if (this.y != null) {
         this.y.L((String)var1.get());
      }

      return this;
   }
}
