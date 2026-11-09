package minecraft;

import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

record class03062(class04469 signature, BooleanSupplier handler) {
   public BooleanSupplier L() {
      return this.handler;
   }

   class03062(@Nullable class04469 signature, BooleanSupplier handler) {
      this.signature = signature;
      this.handler = handler;
   }

   @Nullable
   public class04469 y() {
      return this.signature;
   }

   public boolean N() {
      return this.handler.getAsBoolean();
   }
}
