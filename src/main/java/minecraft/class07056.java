package minecraft;

import org.jspecify.annotations.Nullable;

public record class07056(boolean wasItemInteraction, class06584 heldItemTransformedTo) {
   static class07056 L = new class07056(false, null);
   static class07056 u = new class07056(true, null);

   public class07056(boolean wasItemInteraction, @Nullable class06584 heldItemTransformedTo) {
      this.wasItemInteraction = wasItemInteraction;
      this.heldItemTransformedTo = heldItemTransformedTo;
   }

   @Nullable
   public class06584 y() {
      return this.heldItemTransformedTo;
   }

   public boolean N() {
      return this.wasItemInteraction;
   }
}
