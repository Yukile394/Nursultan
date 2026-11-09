package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import net.caffeinemc.mods.lithium.mixin.world.chunk_access.GenerationChunkHolderAccessor;
import org.jspecify.annotations.Nullable;

public abstract class class02236 implements GenerationChunkHolderAccessor {
   private static final List<class00549> N = class00549.N();
   private static final class02818<class08050> i = class02818.N("Not done yet");
   public static final class02818<class08050> y = class02818.N("Unloaded chunk");
   public static final CompletableFuture<class02818<class08050>> L = CompletableFuture.completedFuture(y);
   protected final class07321 u;
   @Nullable
   private volatile class00549 R;
   private final AtomicReference<class00549> M = new AtomicReference<>();
   private final AtomicReferenceArray<CompletableFuture<class02818<class08050>>> B = new AtomicReferenceArray<>(N.size());
   private final AtomicReference<class02217> Z = new AtomicReference<>();
   private final AtomicInteger z = new AtomicInteger();
   private volatile CompletableFuture<Void> U = CompletableFuture.completedFuture(null);

   private CompletableFuture<class02818<class08050>> L(class00549 var1) {
      if (this.R(var1)) {
         return L;
      } else {
         int ix = var1.y();
         CompletableFuture<class02818<class08050>> completablefuture = this.B.get(ix);

         while (completablefuture == null) {
            CompletableFuture completablefuture1 = new CompletableFuture();
            completablefuture = this.B.compareAndExchange(ix, null, completablefuture1);
            if (completablefuture == null) {
               if (this.R(var1)) {
                  this.N(ix, completablefuture1);
                  return L;
               }

               return completablefuture1;
            }
         }

         return completablefuture;
      }
   }

   public void P() {
      CompletableFuture<Void> completablefuture = this.U;
      int ix = this.z.decrementAndGet();
      if (ix == 0) {
         completablefuture.complete(null);
      }

      if (ix < 0) {
         throw new IllegalStateException("More releases than claims. Count: " + ix);
      }
   }

   @Nullable
   public class00549 T() {
      CompletableFuture<class02818<class08050>> completablefuture = this.B.get(class00549.L.y());
      class08050 class08050 = completablefuture == null ? null : completablefuture.getNow(i).y(null);
      return class08050 == null ? null : class08050.E();
   }

   public class02236(class07321 var1) {
      super();
      this.u = var1;
      if (!var1.N()) {
         throw new IllegalStateException("Trying to create chunk out of reasonable bounds: " + var1);
      }
   }

   private boolean i(class00549 var1) {
      class00549 class00549x = var1 == class00549.L ? null : var1.L();
      class00549 class00549x = this.M.compareAndExchange(class00549x, var1);
      if (class00549x == class00549x) {
         return true;
      } else if (class00549x != null && !var1.y(class00549x)) {
         return false;
      } else {
         throw new IllegalStateException("Unexpected last startedWork status: " + class00549x + " while trying to start: " + var1);
      }
   }

   public class07321 b() {
      return this.u;
   }

   @Nullable
   public class08050 s() {
      class00549 class00549 = this.M.get();
      if (class00549 == null) {
         return null;
      } else {
         class08050 class08050 = this.N(class00549);
         return class08050 != null ? class08050 : this.N(class00549.L());
      }
   }

   @Nullable
   public class00549 n() {
      class00549 class00549 = this.M.get();
      if (class00549 == null) {
         return null;
      } else {
         return this.N(class00549) != null ? class00549 : class00549.L();
      }
   }

   public void m() {
      if (this.z.getAndIncrement() == 0) {
         this.U = new CompletableFuture<>();
         this.y(this.U);
      }
   }

   public List<Pair<class00549, CompletableFuture<class02818<class08050>>>> v() {
      ArrayList arraylist = new ArrayList();

      for (int ix = 0; ix < N.size(); ix++) {
         arraylist.add(Pair.of(N.get(ix), this.B.get(ix)));
      }

      return arraylist;
   }

   public class04763 j() {
      return class03469.L(this.z());
   }

   public abstract int U();

   public abstract int z();

   @Nullable
   private class00549 u(@Nullable class00549 var1) {
      if (var1 == null) {
         return null;
      } else {
         class00549 class00549x = var1;

         for (class00549 class00549x = this.M.get(); class00549x == null || class00549x.y(class00549x); class00549x = class00549x.L()) {
            if (this.B.get(class00549x.y()) != null) {
               return class00549x;
            }

            if (class00549x == class00549.L) {
               break;
            }
         }

         return null;
      }
   }

   protected abstract void y(CompletableFuture<?> var1);

   @Nullable
   public class08050 y(class00549 var1) {
      return this.R(var1) ? null : this.N(var1);
   }

   protected void N(class06265 var1) {
      class00549 class00549x = this.R;
      class00549 class00549x = class03469.N(this.z());
      this.R = class00549x;
      if (class00549x != null && (class00549x == null || class00549x.u(class00549x))) {
         this.N(class00549x, class00549x);
         if (this.Z.get() != null) {
            this.N(var1, this.u(class00549x));
         }
      }
   }

   public CompletableFuture<class02818<class08050>> N(class00549 var1, class06265 var2) {
      if (this.R(var1)) {
         return L;
      } else {
         CompletableFuture<class02818<class08050>> completablefuture = this.L(var1);
         if (completablefuture.isDone()) {
            return completablefuture;
         } else {
            class02217 class02217 = this.Z.get();
            if (class02217 == null || var1.y(class02217.N)) {
               this.N(var2, var1);
            }

            return completablefuture;
         }
      }
   }

   CompletableFuture<class02818<class08050>> N(class02237 var1, class02228 var2, class02248<class02236> var3) {
      if (this.R(var1.N())) {
         return L;
      } else {
         return this.i(var1.N()) ? var2.N(this, var1, var3).handle((var2x, var3x) -> {
            if (var3x != null) {
               class07080 class07080 = class07080.N(var3x, "Exception chunk generation/loading");
               class02796.N(new class07878(class07080));
            } else {
               this.N(var1.N(), var2x);
            }

            return class02818.N(var2x);
         }) : this.L(var1.N());
      }
   }

   private void N(class06265 var1, @Nullable class00549 var2) {
      class02217 class02217x;
      if (var2 != null) {
         class02217x = var1.N(var2, this.b());
      } else {
         class02217x = null;
      }

      class02217 class02217x = this.Z.getAndSet(class02217x);
      if (class02217x != null) {
         class02217x.y();
      }
   }

   private void N(@Nullable class00549 var1, class00549 var2) {
      int ix = var1 == null ? 0 : var1.y() + 1;
      int j = var2.y();

      for (int k = ix; k <= j; k++) {
         CompletableFuture<class02818<class08050>> completablefuture = this.B.get(k);
         if (completablefuture != null) {
            this.N(k, completablefuture);
         }
      }
   }

   private void N(int var1, CompletableFuture<class02818<class08050>> var2) {
      if (var2.complete(y) && !this.B.compareAndSet(var1, var2, null)) {
         throw new IllegalStateException("Nothing else should replace the future here");
      }
   }

   private void N(class00549 var1, class08050 var2) {
      class02818 class02818 = class02818.N(var2);
      int ix = var1.y();

      while (true) {
         CompletableFuture<class02818<class08050>> completablefuture = this.B.get(ix);
         if (completablefuture == null) {
            if (this.B.compareAndSet(ix, null, CompletableFuture.completedFuture(class02818))) {
               return;
            }
         } else {
            if (completablefuture.complete(class02818)) {
               return;
            }

            if (completablefuture.getNow(i).N()) {
               throw new IllegalStateException("Trying to complete a future but found it to be completed successfully already");
            }

            Thread.yield();
         }
      }
   }

   public void N(class00548 var1) {
      CompletableFuture completablefuture = CompletableFuture.completedFuture(class02818.N(var1));

      for (int ix = 0; ix < this.B.length() - 1; ix++) {
         CompletableFuture<class02818<class08050>> completablefuture1 = this.B.get(ix);
         Objects.requireNonNull(completablefuture1);
         class08050 class08050 = completablefuture1.getNow(i).y(null);
         if (!(class08050 instanceof class07361)) {
            throw new IllegalStateException("Trying to replace a ProtoChunk, but found " + class08050);
         }

         if (!this.B.compareAndSet(ix, completablefuture1, completablefuture)) {
            throw new IllegalStateException("Future changed by other thread while trying to replace it");
         }
      }
   }

   void N(class02217 var1) {
      this.Z.compareAndSet(var1, null);
   }

   @Nullable
   public class08050 N(class00549 var1) {
      CompletableFuture<class02818<class08050>> completablefuture = this.B.get(var1.y());
      return completablefuture == null ? null : completablefuture.getNow(i).y(null);
   }

   private boolean R(class00549 var1) {
      class00549 class00549 = this.R;
      return class00549 == null || var1.y(class00549);
   }
}
