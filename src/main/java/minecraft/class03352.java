package minecraft;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;

class class03352 extends class03354 {
   private final class08777 R;

   public class03352(class03345 var1, class08777 var2) {
      super(var1, true);
      this.i = var1;
      this.R = var2;
   }

   @Override
   protected String y() {
      return "rend_chk_sort";
   }

   @Override
   public void N() {
      this.N.set(true);
   }

   @Override
   public CompletableFuture<class03335> N(class03950 var1) {
      if (this.N.get()) {
         return CompletableFuture.completedFuture(class03335.field_21439);
      } else {
         class02578 class02578 = this.R.u();
         if (class02578 != null && !this.R.N(class08743.field_60926)) {
            long ix = this.i.u;
            class03337 class03337 = this.i.N(class01296.N(ix));
            class08728 class08728 = class08728.N(this.i.R.M, ix);
            if (!this.R.y(class08728) && !class08728.N()) {
               return CompletableFuture.completedFuture(class03335.field_21439);
            } else {
               class02613 class02613 = class02578.N(var1.N(class08743.field_60926), class03337);
               if (class02613 == null) {
                  return CompletableFuture.completedFuture(class03335.field_21439);
               } else if (this.N.get()) {
                  class02613.close();
                  return CompletableFuture.completedFuture(class03335.field_21439);
               } else {
                  return this.i.N(this.R, class02613, class08743.field_60926).handle((var2x, var3x) -> {
                     if (var3x != null && !(var3x instanceof CancellationException) && !(var3x instanceof InterruptedException)) {
                        class06202.Nq().u(class07080.N(var3x, "Rendering section"));
                     }

                     if (this.N.get()) {
                        return class03335.field_21439;
                     } else {
                        this.R.N(class08728);
                        return class03335.field_21438;
                     }
                  });
               }
            }
         } else {
            return CompletableFuture.completedFuture(class03335.field_21439);
         }
      }
   }
}
