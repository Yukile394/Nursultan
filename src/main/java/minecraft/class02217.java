package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class class02217 {
   private final class02228 y;
   private final class07321 L;
   @Nullable
   private class00549 u = null;
   public final class00549 N;
   private volatile boolean i;
   private final List<CompletableFuture<class02818<class08050>>> R = new ArrayList<>();
   private final class02248<class02236> M;
   private boolean B;

   public class02236 L() {
      return this.M.N(this.L.B, this.L.Z);
   }

   @Nullable
   private CompletableFuture<?> M() {
      while (!this.R.isEmpty()) {
         CompletableFuture<class02818<class08050>> completablefuture = this.R.getLast();
         class02818<class08050> class02818 = completablefuture.getNow(null);
         if (class02818 == null) {
            return completablefuture;
         }

         this.R.removeLast();
         if (!class02818.N()) {
            this.y();
         }
      }

      return null;
   }

   private class02217(class02228 var1, class00549 var2, class07321 var3, class02248<class02236> var4) {
      super();
      this.y = var1;
      this.N = var2;
      this.L = var3;
      this.M = var4;
   }

   private void i() {
      this.M.N(this.L.B, this.L.Z).N(this);
      this.M.N(this.y::N);
   }

   private void u() {
      class00549 class00549;
      if (this.u == null) {
         class00549 = class00549.L;
      } else if (!this.B && this.u == class00549.L && !this.R()) {
         this.B = true;
         class00549 = class00549.L;
      } else {
         class00549 = class00549.N().get(this.u.y() + 1);
      }

      this.N(class00549, this.B);
      this.u = class00549;
   }

   private int y(class00549 var1, boolean var2) {
      return (var2 ? class02238.N : class02238.y).N(this.N).N(var1);
   }

   public void y() {
      this.i = true;
   }

   private boolean N(class00549 var1, boolean var2, class02236 var3) {
      class00549 class00549 = var3.T();
      boolean flag = class00549 != null && var1.y(class00549);
      class02238 class02238 = flag ? class02238.N : class02238.y;
      if (flag && !var2) {
         throw new IllegalStateException("Can't load chunk, but didn't expect to need to generate");
      } else {
         CompletableFuture<class02818<class08050>> completablefuture = var3.N(class02238.N(var1), this.y, this.M);
         class02818<class08050> class02818 = completablefuture.getNow(null);
         if (class02818 == null) {
            this.R.add(completablefuture);
            return true;
         } else if (class02818.N()) {
            return true;
         } else {
            this.y();
            return false;
         }
      }
   }

   private void N(class00549 var1, boolean var2) {
      try (class08694 class08694 = class08700.N().i("scheduleLayer")) {
         class08694.N(var1::R);
         int ix = this.y(var1, var2);

         for (int j = this.L.B - ix; j <= this.L.B + ix; j++) {
            for (int k = this.L.Z - ix; k <= this.L.Z + ix; k++) {
               class02236 class02236 = this.M.N(j, k);
               if (this.i || !this.N(var1, var2, class02236)) {
                  return;
               }
            }
         }
      }
   }

   public static class02217 N(class02228 var0, class00549 var1, class07321 var2) {
      int ix = class02238.N.N(var1).N(class00549.L);
      class02248 class02248 = class02248.N(var2.B, var2.Z, ix, (var1x, var2x) -> var0.i(class07321.u(var1x, var2x)));
      return new class02217(var0, var1, var2, class02248);
   }

   @Nullable
   public CompletableFuture<?> N() {
      while (true) {
         CompletableFuture<?> completablefuture = this.M();
         if (completablefuture != null) {
            return completablefuture;
         }

         if (this.i || this.u == this.N) {
            this.i();
            return null;
         }

         this.u();
      }
   }

   private boolean R() {
      if (this.N == class00549.L) {
         return true;
      } else {
         class00549 class00549xx = this.M.N(this.L.B, this.L.Z).T();
         if (class00549xx != null && !class00549xx.u(this.N)) {
            class02209 class02209 = class02238.y.N(this.N).L();
            int ix = class02209.L();

            for (int j = this.L.B - ix; j <= this.L.B + ix; j++) {
               for (int k = this.L.Z - ix; k <= this.L.Z + ix; k++) {
                  int l = this.L.R(j, k);
                  class00549 class00549x = class02209.N(l);
                  class00549 class00549xx = this.M.N(j, k).T();
                  if (class00549xx == null || class00549xx.u(class00549x)) {
                     return false;
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
