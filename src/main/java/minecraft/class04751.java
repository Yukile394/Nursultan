package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.caffeinemc.mods.lithium.common.world.ChunkLoadTricks;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04751 extends class00558 {
   private static final Logger u = LogUtils.getLogger();
   private final class04778 i;
   private final class04782 R;
   final Thread N;
   final class04775 y;
   private final class04752 M;
   public final class06265 L;
   private final class00408 B;
   private final class08593 Z;
   private long z;
   private boolean U;
   private static final int E = 4;
   private final long[] W;
   private final class00549[] m;
   private final class08050[] P;
   private final List<class00570> s;
   private final Set<class04745> T;
   @Nullable
   private class00760 b;
   private long j;
   private final long[] v = new long[4];
   private final class08050[] n = new class08050[4];

   @Override
   public boolean L(int var1, int var2) {
      class04745 class04745 = this.y(new class07321(var1, var2).y());
      int ix = class03469.N(class00549.m);
      return !this.N(class04745, ix);
   }

   public void L(class01624 var1, class07321 var2, int var3) {
      this.Z.y(var1, var2, var3);
   }

   private CompletableFuture<class02818<class08050>> L(int var1, int var2, class00549 var3, boolean var4) {
      class07321 class07321 = new class07321(var1, var2);
      long ix = class07321.y();
      int jx = class03469.N(var3);
      class04745 class04745 = this.y(ix);
      if (var4) {
         this.N(new class01596(class01624.P, jx), class07321);
         if (this.N(class04745, jx)) {
            class04643 class04643 = class08700.N();
            class04643.N("chunkLoad");
            this.Z();
            class04745 = this.y(ix);
            class04643.L();
            if (this.N(class04745, jx)) {
               throw (IllegalStateException)class07536.y(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         }
      }

      return this.N(class04745, jx) ? class02236.L : class04745.N(var3, this.L);
   }

   private class08050 M(int var1, int var2, class00549 var3, boolean var4) {
      long ix = class07321.u(var1, var2);
      int jx = class03469.N(var3);
      class04745 class04745 = this.y(ix);
      class08050 class08050x = ChunkLoadTricks.tryRetrieveCurrentlyLoading(class04745);
      if (class08050x != null) {
         return class08050x;
      } else {
         if (this.N(class04745, jx)) {
            if (!var4) {
               return null;
            }

            this.N(var1, var2, jx);
            this.Z();
            class04745 = this.y(ix);
            if (this.N(class04745, jx)) {
               throw (IllegalStateException)class07536.y(new IllegalStateException("No chunk holder after ticket has been added"));
            }
         } else if (var4 && class04745.lithium$updateLastAccessTime(this.j)) {
            this.N(var1, var2, jx);
         }

         if (!class04745.invokeCannotBeLoaded(var3)) {
            CompletableFuture<class02818<class08050>> completablefuture = (CompletableFuture<class02818<class08050>>)class04745.lithium$getChunkFuturesByStatus()
               .get(var3.y());
            if (completablefuture != null && completablefuture.isDone()) {
               class08050 class08050x = completablefuture.join().y(null);
               if (class08050x != null) {
                  return class08050x;
               }
            }
         }

         CompletableFuture completablefuture1 = class04745.N(var3, this.L);
         if (!completablefuture1.isDone()) {
            this.M.y(completablefuture1::isDone);
         }

         return (class08050)((class02818)completablefuture1.join()).y(null);
      }
   }

   public class07299 i() {
      return this.R;
   }

   public class00408 P() {
      return this.B;
   }

   public class03190 T() {
      return this.L.W();
   }

   public class04751(
      class04782 var1,
      class04785 var2,
      DataFixer var3,
      class01224 var4,
      Executor var5,
      class08088 var6,
      int var7,
      int var8,
      boolean var9,
      class01110 var10,
      Supplier<class00408> var11
   ) {
      super();
      this.U = true;
      this.W = new long[4];
      this.m = new class00549[4];
      this.P = new class08050[4];
      this.s = new ObjectArrayList();
      this.T = new ReferenceOpenHashSet();
      this.R = var1;
      this.M = new class04752(this, var1);
      this.N = Thread.currentThread();
      Path path = var2.N(var1.method_27983()).resolve("data");

      try {
         class06290.L(path);
      } catch (IOException ioexception) {
         u.error("Failed to create dimension data storage directory", ioexception);
      }

      this.B = new class00408(path, var3, var1.method_30349());
      this.Z = this.B.N(class08593.y);
      this.L = new class06265(var1, var2, var3, var4, var5, this.M, this, var6, var10, var11, this.Z, var7, var9);
      this.y = this.L.u();
      this.i = this.L.Z();
      this.i.y(var8);
      this.v();
   }

   public boolean B() {
      return this.M.J();
   }

   boolean Z() {
      boolean flag = this.i.N(this.L);
      boolean flag1 = this.L.R();
      this.L.M();
      if (!flag && !flag1) {
         return false;
      } else {
         this.v();
         return true;
      }
   }

   @Nullable
   public class00760 b() {
      return this.b;
   }

   public class05368 s() {
      return this.L.U();
   }

   private void n() {
      long ix = this.R.N();
      long jx = ix - this.z;
      this.z = ix;
      if (!this.R.method_27982()) {
         class04643 class04643 = class08700.N();
         class04643.N("pollingChunks");
         if (this.R.method_54719().Z()) {
            class04643.N("tickingChunks");
            this.N(class04643, jx);
            class04643.L();
         }

         this.N(class04643);
         class04643.L();
      }
   }

   public boolean m() {
      return this.Z.L();
   }

   private void v() {
      this.N(null);
      Arrays.fill(this.W, class07321.L);
      Arrays.fill(this.m, null);
      Arrays.fill(this.P, null);
   }

   public void j() {
      this.Z.u();
   }

   public class08088 U() {
      return this.L.N();
   }

   @Override
   public void close() throws IOException {
      this.y(true);
      this.B.close();
      this.y.close();
      this.L.close();
   }

   public int z() {
      return this.M.F_();
   }

   @Override
   public LongSet u() {
      return this.Z.i();
   }

   public void y(class07049 var1) {
      this.L.N(var1);
   }

   public void y(class01624 var1, class07321 var2, int var3) {
      this.Z.N(var1, var2, var3);
   }

   @Nullable
   @Override
   public class03482 y(int var1, int var2) {
      long ix = class07321.u(var1, var2);
      class04745 class04745 = this.y(ix);
      return class04745 == null ? null : class04745.N(class00549.U.L());
   }

   @Nullable
   private class04745 y(long var1) {
      return this.L.y(var1);
   }

   public CompletableFuture<class02818<class08050>> y(int var1, int var2, class00549 var3, boolean var4) {
      CompletableFuture<class02818<class08050>> completablefuture;
      if (Thread.currentThread() == this.N) {
         completablefuture = this.L(var1, var2, var3, var4);
         this.M.y(completablefuture::isDone);
      } else {
         completablefuture = CompletableFuture.<CompletableFuture<class02818<class08050>>>supplyAsync(() -> this.L(var1, var2, var3, var4), this.M)
            .thenCompose(var0 -> (CompletionStage<class02818<class08050>>)var0);
      }

      return completablefuture;
   }

   public void y(int var1) {
      this.i.y(var1);
   }

   public void y(class07049 var1, class00381<? super class07280> var2) {
      this.L.N(var1, var2);
   }

   public void y(boolean var1) {
      this.Z();
      this.L.N(var1);
   }

   @Override
   public int y() {
      return this.L.B();
   }

   public class02045 E() {
      return this.L.y();
   }

   @Override
   public void N(BooleanSupplier var1, boolean var2) {
      this.N(var1, var2, null);
      class04643 class04643 = class08700.N();
      class04643.N("purge");
      if (this.R.method_54719().Z() || !var2) {
         this.Z.N(this.L);
      }

      this.Z();
      class04643.y("chunks");
      if (var2) {
         this.n();
         this.L.z();
      }

      class04643.y("unload");
      this.L.N(var1);
      class04643.L();
      this.v();
   }

   private void N(class04643 var1) {
      var1.N("broadcast");

      for (class04745 class04745 : this.T) {
         class00570 class00570 = class04745.u();
         if (class00570 != null) {
            class04745.N(class00570);
         }
      }

      this.T.clear();
      var1.L();
   }

   @Nullable
   @Override
   public class00570 N(int var1, int var2) {
      if (Thread.currentThread() != this.N) {
         return null;
      } else {
         class08700.N().R("getChunkNow");
         long ix = class07321.u(var1, var2);

         for (int jx = 0; jx < 4; jx++) {
            if (ix == this.W[jx] && this.m[jx] == class00549.m) {
               class08050 class08050x = this.P[jx];
               return class08050x instanceof class00570 ? (class00570)class08050x : null;
            }
         }

         class04745 class04745 = this.y(ix);
         if (class04745 == null) {
            return null;
         } else {
            class08050 class08050 = class04745.y(class00549.m);
            if (class08050 != null) {
               this.N(ix, class08050, class00549.m);
               if (class08050 instanceof class00570) {
                  return (class00570)class08050;
               }
            }

            return null;
         }
      }
   }

   private void N(long var1, @Nullable class08050 var3, class00549 var4) {
      for (int ix = 3; ix > 0; ix--) {
         this.W[ix] = this.W[ix - 1];
         this.m[ix] = this.m[ix - 1];
         this.P[ix] = this.P[ix - 1];
      }

      this.W[0] = var1;
      this.m[0] = var4;
      this.P[0] = var3;
   }

   private void N(int var1, int var2, int var3) {
      class07321 class07321 = new class07321(var1, var2);
      this.N(new class01596(class01624.P, var3), class07321);
   }

   private static long N(int var0, int var1, class00549 var2) {
      return var0 & 268435455L | (var1 & 268435455L) << 28 | (long)var2.y() << 56;
   }

   private void N(long var1, class08050 var3) {
      for (int ix = 3; ix > 0; ix--) {
         this.v[ix] = this.v[ix - 1];
         this.n[ix] = this.n[ix - 1];
      }

      this.v[0] = var1;
      this.n[0] = var3;
   }

   private void N(CallbackInfo var1) {
      Arrays.fill(this.v, Long.MAX_VALUE);
      Arrays.fill(this.n, null);
   }

   @Override
   public boolean N(class07321 var1, boolean var2) {
      return this.Z.N(var1, var2);
   }

   public boolean N(long var1) {
      if (!this.R.method_39425(var1)) {
         return false;
      } else {
         class04745 class04745 = this.y(var1);
         return class04745 == null ? false : class04745.N().getNow(class04745.N).N();
      }
   }

   private Iterable N(class04782 var1) {
      return var1.getEntityManager().getCache().lithium$IterateEntitiesInTrackedSections();
   }

   private void N(BooleanSupplier var1, boolean var2, CallbackInfo var3) {
      this.j++;
   }

   @Override
   public class08050 N(int var1, int var2, class00549 var3, boolean var4) {
      if (Thread.currentThread() != this.N) {
         return this.R(var1, var2, var3, var4);
      } else {
         long[] along = this.v;
         long ix = N(var1, var2, var3);

         for (int jx = 0; jx < 4; jx++) {
            if (ix == along[jx]) {
               class08050 class08050x = this.n[jx];
               if (class08050x != null || !var4) {
                  return class08050x;
               }
            }
         }

         class08050 class08050 = this.M(var1, var2, var3, var4);
         if (class08050 != null) {
            this.N(ix, class08050);
         } else if (var4) {
            throw new IllegalStateException("Chunk not there when requested");
         }

         return class08050;
      }
   }

   public void N(class04770 var1) {
      if (!var1.method_31481()) {
         this.L.y(var1);
         if (var1.method_70637()) {
            this.R.method_70636().y(var1);
         }
      }
   }

   public void N(class07049 var1) {
      this.L.y(var1);
   }

   public void N(class07209 var1) {
      int ix = class01296.N(var1.method_10263());
      int jx = class01296.N(var1.method_10260());
      class04745 class04745 = this.y(class07321.u(ix, jx));
      if (class04745 != null && class04745.N(var1)) {
         this.T.add(class04745);
      }
   }

   public void N(class07049 var1, class00381<? super class07280> var2) {
      this.L.y(var1, var2);
   }

   public void N(int var1) {
      this.L.N(var1);
   }

   public CompletableFuture<?> N(class01624 var1, class07321 var2, int var3) {
      if (!var1.y()) {
         throw new IllegalStateException("Ticket type " + var1 + " does not trigger chunk loading");
      } else if (var1.i()) {
         throw new IllegalStateException("Ticket type " + var1 + " can expire before it loads, cannot fetch asynchronously");
      } else {
         this.y(var1, var2, var3);
         this.Z();
         class04745 class04745 = this.y(var2.y());
         Objects.requireNonNull(class04745, "No chunk was scheduled for loading");
         return this.L.N(class04745, var3, var0 -> class00549.m);
      }
   }

   public void N(class01596 var1, class07321 var2) {
      this.Z.N(var1, var2);
   }

   private boolean N(@Nullable class04745 var1, int var2) {
      return var1 == null || var1.z() > var2;
   }

   @Override
   public void N(class00772 var1, class01296 var2) {
      this.M.execute(() -> {
         class04745 class04745 = this.y(var2.E().y());
         if (class04745 != null && class04745.N(var1, var2.y())) {
            this.T.add(class04745);
         }
      });
   }

   public void N(class04745 var1) {
      if (var1.Z()) {
         this.T.add(var1);
      }
   }

   private void N(long var1, Consumer<class00570> var3) {
      class04745 class04745 = this.y(var1);
      if (class04745 != null) {
         class04745.L().getNow(class04745.N).N_36(var3);
      }
   }

   private void N(class00570 var1, long var2, List<class07428> var4, class00760 var5) {
      class07321 class07321 = var1.R();
      var1.y(var2);
      if (this.i.L(class07321.y())) {
         this.R.method_67503(var1);
      }

      if (!var4.isEmpty()) {
         if (this.R.method_67505(class07321)) {
            class00803.N(this.R, var1, var5, var4);
         }
      }
   }

   private void N(class04643 var1, long var2) {
      var1.N("naturalSpawnCount");
      int jx = this.i.N();
      class04782 class04782 = this.R;
      class00760 class00760 = class00803.N(jx, this.N(class04782), this::N, new class03218(this.L));
      this.b = class00760;
      boolean flag = this.R.method_64395().N(class07305.S);
      int ix = this.R.method_64395().N(class07305.X);
      List<class07428> list;
      if (flag) {
         boolean var9 = this.R.N() % 400L == 0L;
         list = class00803.N(class00760, true, this.U, var9);
      } else {
         list = List.of();
      }

      List<class00570> list1 = this.s;

      try {
         var1.y("filteringSpawningChunks");
         this.L.N(list1);
         var1.y("shuffleSpawningChunks");
         class07536.L(list1, this.R.field_9229);
         var1.y("tickSpawningChunks");

         for (class00570 class00570 : list1) {
            this.N(class00570, var2, list, class00760);
         }
      } finally {
         list1.clear();
      }

      var1.y("tickTickingChunks");
      this.L.N(var2x -> this.R.method_18203(var2x, ix));
      if (flag) {
         var1.y("customSpawners");
         this.R.method_29202(this.U);
      }

      var1.L();
   }

   public String N(class07321 var1) {
      return this.L.N(var1);
   }

   @Override
   public String N() {
      return Integer.toString(this.y());
   }

   @Override
   public void N(boolean var1) {
      this.U = var1;
   }

   public class04084 W() {
      return this.L.L();
   }

   private class08050 R(int var1, int var2, class00549 var3, boolean var4) {
      return CompletableFuture.<class08050>supplyAsync(() -> this.N(var1, var2, var3, var4), this.M).join();
   }

   public class04775 L() {
      return this.y;
   }
}
