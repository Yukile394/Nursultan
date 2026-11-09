package minecraft;

import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.slf4j.Logger;

public class class06144 extends class06162<class06155> {
   private static final Logger L = LogUtils.getLogger();
   private final Stopwatch u = Stopwatch.createUnstarted();

   private class06144(List<class01081> var1) {
      super(var1);
      this.u.start();
   }

   public static class06164 N(class01089 var0, List<class01081> var1, Executor var2, Executor var3, CompletableFuture<class06244> var4) {
      class06144 class06144 = new class06144(var1);
      class06144.y(
         var2,
         var3,
         var0,
         var1,
         (var1x, var2x, var3x, var4x, var5x) -> {
            AtomicLong atomiclong = new AtomicLong();
            AtomicLong atomiclong1 = new AtomicLong();
            AtomicLong atomiclong2 = new AtomicLong();
            AtomicLong atomiclong3 = new AtomicLong();
            return var3x.method_25931(
                  var1x, N(var4x, atomiclong, atomiclong1, var3x.method_22322()), var2x, N(var5x, atomiclong2, atomiclong3, var3x.method_22322())
               )
               .thenApplyAsync(var5xx -> {
                  L.debug("Finished reloading {}", var3x.method_22322());
                  return new class06155(var3x.method_22322(), atomiclong, atomiclong1, atomiclong2, atomiclong3);
               }, var3);
         },
         var4
      );
      return class06144;
   }

   @Override
   protected CompletableFuture<List<class06155>> N(
      Executor var1, Executor var2, class01089 var3, List<class01081> var4, class06160<class06155> var5, CompletableFuture<?> var6
   ) {
      return super.N(var1, var2, var3, var4, var5, var6).thenApplyAsync(this::N, var2);
   }

   private static Executor N(Executor var0, AtomicLong var1, AtomicLong var2, String var3) {
      return var4 -> var0.execute(() -> {
         class04643 class04643 = class08700.N();
         class04643.N(var3);
         long i = class07536.u();
         var4.run();
         var1.addAndGet(class07536.u() - i);
         var2.incrementAndGet();
         class04643.L();
      });
   }

   private List<class06155> N(List<class06155> var1) {
      this.u.stop();
      long i = 0L;
      L.info("Resource reload finished after {} ms", this.u.elapsed(TimeUnit.MILLISECONDS));

      for (class06155 class06155 : var1) {
         long j = TimeUnit.NANOSECONDS.toMillis(class06155.y().get());
         long k = class06155.L().get();
         long l = TimeUnit.NANOSECONDS.toMillis(class06155.u().get());
         long i1 = class06155.i().get();
         long j1 = j + l;
         long k1 = k + i1;
         String s = class06155.N();
         L.info("{} took approximately {} tasks/{} ms ({} tasks/{} ms preparing, {} tasks/{} ms applying)", new Object[]{s, k1, j1, k, j, i1, l});
         i += l;
      }

      L.info("Total blocking time: {} ms", i);
      return var1;
   }
}
