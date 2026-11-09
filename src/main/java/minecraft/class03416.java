package minecraft;

import Nursultan.class10191;
import com.mojang.datafixers.util.Either;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class class03416<T> {
   private final String L;
   private final Callable<T> u;
   private final long i;
   private final class03375 R;
   @Nullable
   private CompletableFuture<class10191<T>> M;
   @Nullable
   class03390<T> N;
   private long B;

   class03416(String var1, Callable<T> var2, long var3, class03375 param5, class03375 var6) {
      super();
      this.y = var1;
      this.B = -1L;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var6;
   }

   void N(long var1) {
      if (this.M != null) {
         class10191 class10191 = this.M.getNow(null);
         if (class10191 == null) {
            return;
         }

         this.M = null;
         long ix = class10191.y();
         class10191.N().ifLeft(var3x -> {
            this.N = new class03390<>((T)var3x, ix);
            this.B = ix + this.i * this.R.N();
         }).ifRight(var3x -> {
            long ixx = this.R.y();
            class03377.N.warn("Failed to process task {}, will repeat after {} cycles", new Object[]{this.L, ixx, var3x});
            this.B = ix + this.i * ixx;
         });
      }

      if (this.B <= var1) {
         this.M = CompletableFuture.supplyAsync(() -> {
            try {
               Object object = this.u.call();
               long j = this.y.u.get(this.y.L);
               return new class10191<>(Either.left(object), j);
            } catch (Exception exception) {
               long ixx = this.y.u.get(this.y.L);
               return new class10191<>(Either.right(exception), ixx);
            }
         }, this.y.y);
      }
   }

   public void N() {
      this.M = null;
      this.N = null;
      this.B = -1L;
   }
}
