package minecraft;

import com.google.common.base.Stopwatch;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class02045 {
   private static final Logger N = LogUtils.getLogger();
   private final class04084 y;
   private final class00765 L;
   private final long u;
   private final long i;
   private final Map<class04748, List<class03532>> R = new Object2ObjectOpenHashMap();
   private final Map<class03548, CompletableFuture<List<class07321>>> M = new Object2ObjectArrayMap();
   private boolean B;
   private final List<class03556<class04412>> Z;

   public class04084 L() {
      return this.y;
   }

   private class02045(class04084 var1, class00765 var2, long var3, long var5, List<class03556<class04412>> var7) {
      super();
      this.y = var1;
      this.u = var3;
      this.L = var2;
      this.i = var5;
      this.Z = var7;
   }

   private void i() {
      Set<class03556<class00780>> set = this.L.L();
      this.N().forEach(var2 -> {
         class04412 class04412 = var2.N();
         boolean flag = false;

         for (class04419 class04419 : class04412.N()) {
            class04748 class04748 = class04419.N().N();
            if (class04748.y().N().anyMatch(set::contains)) {
               this.R.computeIfAbsent(class04748, var0 -> new ArrayList<>()).add(class04412.y());
               flag = true;
            }
         }

         if (flag && class04412.y() instanceof class03548 class03548) {
            this.M.put(class03548, this.N((class03556<class04412>)var2, class03548));
         }
      });
   }

   public long u() {
      return this.u;
   }

   public void y() {
      if (!this.B) {
         this.i();
         this.B = true;
      }
   }

   public static class02045 N(class04084 var0, long var1, class00765 var3, Stream<class03556<class04412>> var4) {
      List list = var4.filter(var1x -> N((class04412)var1x.N(), var3)).toList();
      return new class02045(var0, var3, var1, 0L, list);
   }

   public List<class03532> N(class03556<class04748> var1) {
      this.y();
      return this.R.getOrDefault(var1.N(), List.of());
   }

   @Nullable
   public List<class07321> N(class03548 var1) {
      this.y();
      CompletableFuture<List<class07321>> completablefuture = this.M.get(var1);
      return completablefuture != null ? completablefuture.join() : null;
   }

   private CompletableFuture<List<class07321>> N(class03556<class04412> var1, class03548 var2) {
      if (var2.L() == 0) {
         return CompletableFuture.completedFuture(List.of());
      } else {
         Stopwatch stopwatch = Stopwatch.createStarted(class07536.i);
         int ix = var2.N();
         int j = var2.L();
         ArrayList arraylist = new ArrayList(j);
         int k = var2.y();
         class03543<class00780> class03543 = var2.u();
         class06069 class06069x = class06069.u();
         class06069x.N(this.i);
         double d0 = class06069x.U() * Math.PI * 2.0;
         int l = 0;
         int i1 = 0;

         for (int j1 = 0; j1 < j; j1++) {
            double d1 = 4 * ix + ix * i1 * 6 + (class06069x.U() - 0.5) * (ix * 2.5);
            int k1 = (int)Math.round(Math.cos(d0) * d1);
            int l1 = (int)Math.round(Math.sin(d0) * d1);
            class06069 class06069x = class06069x.y();
            arraylist.add(
               CompletableFuture.supplyAsync(
                  () -> {
                     Pair<class07209, class03556<class00780>> pair = this.L
                        .N(class01296.N(k1, 8), 0, class01296.N(l1, 8), 112, class03543::N, class06069, this.y.y());
                     if (pair != null) {
                        class07209 class07209 = (class07209)pair.getFirst();
                        return new class07321(class01296.N(class07209.method_10263()), class01296.N(class07209.method_10260()));
                     } else {
                        return new class07321(k1, l1);
                     }
                  },
                  class07536.B().N("structureRings")
               )
            );
            d0 += (Math.PI * 2) / k;
            if (++l == k) {
               i1++;
               l = 0;
               k += 2 * k / (i1 + 1);
               k = Math.min(k, j - j1);
               d0 += class06069x.U() * Math.PI * 2.0;
            }
         }

         return class07536.L(arraylist).thenApply(var2x -> {
            double d0x = stopwatch.stop().elapsed(TimeUnit.MILLISECONDS) / 1000.0;
            N.debug("Calculation for {} took {}s", var1, d0x);
            return (List<class07321>)var2x;
         });
      }
   }

   public List<class03556<class04412>> N() {
      return this.Z;
   }

   public static class02045 N(class04084 var0, long var1, class00765 var3, class01905<class04412> var4) {
      List list = var4.z().filter(var1x -> N((class04412)var1x.N(), var3)).collect(Collectors.toUnmodifiableList());
      return new class02045(var0, var3, var1, var1, list);
   }

   public boolean N(class03556<class04412> var1, int var2, int var3, int var4) {
      class03532 class03532 = ((class04412)var1.N()).y();

      for (int ix = var2 - var4; ix <= var2 + var4; ix++) {
         for (int j = var3 - var4; j <= var3 + var4; j++) {
            if (class03532.y(this, ix, j)) {
               return true;
            }
         }
      }

      return false;
   }

   private static boolean N(class04412 var0, class00765 var1) {
      return var0.N().stream().flatMap(var0x -> var0x.N().N().y().N()).anyMatch(var1.L()::contains);
   }
}
