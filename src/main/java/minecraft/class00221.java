package minecraft;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

class class00221 implements class03802 {
   class00221(class00232 var1, class03802 var2, UUID var3, CompletableFuture var4) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Override
   public void N(UUID var1, class03849 var2) {
      this.N.N(var1, var2);
   }

   @Override
   public void N(UUID var1, class03824 var2) {
      if (this.y.equals(var1)) {
         this.u.u = this.N;
         if (var2 == class03824.field_47624) {
            this.L.complete(null);
         } else {
            this.L.completeExceptionally(new IllegalStateException("Failed to apply pack " + var1 + ", reason: " + var2));
         }
      }

      this.N.N(var1, var2);
   }
}
