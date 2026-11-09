package minecraft;

import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

final class class08772 implements class08733 {
   private final class04782 y;
   private final CompletableFuture<class06889> L;
   private final class07109 u;
   @Nullable
   private CompletableFuture<?> i;
   private final class08742 R;

   class08772(class04782 var1, CompletableFuture<class06889> var2, class07109 var3, class07109 var4) {
      super();
      this.N = var1;
      this.R = new class08742();
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public class08738 y() {
      if (!this.L.isDone()) {
         return null;
      } else {
         class06889 class06889 = this.L.join();
         if (this.i == null) {
            class07321 class07321 = new class07321(class07209.method_49638(class06889));
            this.R.N(this.y, () -> this.i = this.y.method_14178().N(class01624.M, class07321, 3));
            this.N.R.N(class08753.field_61108, this.R.L());
            this.N.R.N(this.y.method_27983(), class07321);
         }

         this.N.R.N(class08753.field_61108, this.R.N(), this.R.L());
         if (!this.i.isDone()) {
            return null;
         } else {
            this.N.R.N(class08753.field_61108);
            return new class08738(this.N, this.y, class06889, this.u);
         }
      }
   }

   public void N() {
      this.L.cancel(false);
   }
}
