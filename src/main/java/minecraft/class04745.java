package minecraft;

import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.util.BitSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.caffeinemc.mods.lithium.common.world.chunk.ChunkHolderExtended;
import net.caffeinemc.mods.lithium.common.world.chunk.ChunkStatusTracker;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents.LevelTypeChange;
import net.fabricmc.fabric.impl.event.lifecycle.ChunkLevelTypeEventTracker;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04745 extends class02236 implements ChunkHolderExtended, ChunkLevelTypeEventTracker {
   public static final class02818<class00570> N = class02818.N("Unloaded level chunk");
   private static final CompletableFuture<class02818<class00570>> i = CompletableFuture.completedFuture(N);
   private final class05474 R;
   private volatile CompletableFuture<class02818<class00570>> M;
   private volatile CompletableFuture<class02818<class00570>> B;
   private volatile CompletableFuture<class02818<class00570>> Z;
   private int z;
   private int U;
   private int E;
   private boolean W;
   private final ShortSet[] m;
   private final BitSet P;
   private final BitSet s;
   private final class05795 T;
   private final class04767 b;
   private final class04789 j;
   private boolean v;
   private CompletableFuture<?> n;
   private CompletableFuture<?> t;
   private CompletableFuture<?> G;
   private static final class04763[] l = class04763.values();
   private class04763 d = class04763.field_19334;
   private long w;

   private void L(class06265 var1, Executor var2, CallbackInfo var3) {
      if (this.d == class04763.field_44856) {
         ((LevelTypeChange)ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE.invoker())
            .onChunkLevelTypeChange((class04782)this.R, (class00570)this.N(class00549.m), class04763.field_44856, class04763.field_13877);
         this.d = class04763.field_13877;
      }
   }

   public CompletableFuture<class02818<class00570>> L() {
      return this.M;
   }

   public CompletableFuture<?> M() {
      return this.G;
   }

   public class04745(class07321 var1, int var2, class05474 var3, class05795 var4, class04767 var5, class04789 var6) {
      super(var1);
      this.M = i;
      this.B = i;
      this.Z = i;
      this.P = new BitSet();
      this.s = new BitSet();
      this.n = CompletableFuture.completedFuture(null);
      this.t = CompletableFuture.completedFuture(null);
      this.G = CompletableFuture.completedFuture(null);
      this.R = var3;
      this.T = var4;
      this.b = var5;
      this.j = var6;
      this.z = class03469.y + 1;
      this.U = this.z;
      this.E = this.z;
      this.N(var2);
      this.m = new ShortSet[var3.method_32890()];
   }

   public boolean B() {
      return this.G.isDone();
   }

   public boolean Z() {
      return this.W || !this.s.isEmpty() || !this.P.isEmpty();
   }

   @Nullable
   public class00570 i() {
      return !this.t.isDone() ? null : this.u();
   }

   @Override
   public int U() {
      return this.E;
   }

   @Override
   public int z() {
      return this.U;
   }

   @Nullable
   public class00570 u() {
      return this.N().getNow(N).y(null);
   }

   public CompletableFuture<class02818<class00570>> y() {
      return this.Z;
   }

   @Override
   protected void y(CompletableFuture<?> var1) {
      if (this.G.isDone()) {
         this.G = var1;
      } else {
         this.G = this.G.thenCombine(var1, (var0, var1x) -> null);
      }
   }

   private void y(class06265 var1, Executor var2, CallbackInfo var3) {
      if (this.d == class04763.field_44855) {
         ((LevelTypeChange)ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE.invoker())
            .onChunkLevelTypeChange((class04782)this.R, (class00570)this.N(class00549.m), class04763.field_44855, class04763.field_44856);
         this.d = class04763.field_44856;
      }
   }

   private void y(int var1) {
      this.E = var1;
   }

   public boolean E() {
      return this.v;
   }

   private void N(class06265 var1, class04763 var2, CallbackInfo var3) {
      class04763 class04763xx = class03469.L(this.z);
      class04782 class04782 = (class04782)this.R;

      for (int ix = class04763xx.ordinal(); ix > var2.ordinal(); ix--) {
         class04763 class04763x = l[ix];
         class04763 class04763xx = l[ix - 1];
         if (this.d.N(class04763x)) {
            ((LevelTypeChange)ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE.invoker())
               .onChunkLevelTypeChange(class04782, (class00570)this.N(class00549.m), class04763x, class04763xx);
            this.d = class04763xx;
         }
      }
   }

   private void N(class06265 var1, Executor var2, CallbackInfo var3) {
      if (this.N(class00549.m) instanceof class00570 && this.d == class04763.field_19334) {
         ((LevelTypeChange)ServerChunkEvents.CHUNK_LEVEL_TYPE_CHANGE.invoker())
            .onChunkLevelTypeChange((class04782)this.R, (class00570)this.N(class00549.m), class04763.field_19334, class04763.field_44855);
         this.d = class04763.field_44855;
      }
   }

   private void N(class06265 var1, Executor var2, CallbackInfo var3, class04763 var4, class04763 var5) {
      class04782 class04782 = var1.u;
      boolean flag = var5.N(class04763.field_44855);
      boolean flag1 = var4.N(class04763.field_44855);
      if (!flag && flag1) {
         ChunkStatusTracker.onChunkInaccessible(class04782, this.u);
      } else if (!flag1 && this.N(class00549.m) instanceof class00570 class00570) {
         ChunkStatusTracker.onChunkAccessible(class04782, class00570);
      }
   }

   private void N(List<class04770> var1, class07299 var2, class07209 var3) {
      class00394 class00394 = var2.method_8321(var3);
      if (class00394 != null) {
         class00381<class07280> class00381 = class00394.i();
         if (class00381 != null) {
            this.N(var1, class00381);
         }
      }
   }

   private void N(List<class04770> var1, class07299 var2, class07209 var3, class00500 var4) {
      if (var4.k()) {
         this.N(var1, var2, var3);
      }
   }

   public CompletableFuture<class02818<class00570>> N() {
      return this.B;
   }

   public boolean N(class00772 var1, int var2) {
      class08050 class08050 = this.y(class00549.U);
      if (class08050 == null) {
         return false;
      } else {
         class08050.Z();
         if (this.u() == null) {
            return false;
         } else {
            int ix = this.T.u();
            int jx = this.T.i();
            if (var2 >= ix && var2 <= jx) {
               BitSet bitset = var1 == class00772.field_9284 ? this.s : this.P;
               int k = var2 - ix;
               if (!bitset.get(k)) {
                  bitset.set(k);
                  return true;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      }
   }

   public boolean N(class07209 var1) {
      if (this.u() == null) {
         return false;
      } else {
         boolean flag = this.W;
         int ix = this.R.method_31602(var1.method_10264());
         Object object = this.m[ix];
         if (object == null) {
            this.W = true;
            object = new ShortOpenHashSet();
            this.m[ix] = (ShortSet)object;
         }

         object.add(class01296.y(var1));
         return !flag;
      }
   }

   public void N(CompletableFuture<?> var1) {
      if (this.t.isDone()) {
         this.t = var1;
      } else {
         this.t = this.t.thenCombine(var1, (var0, var1x) -> null);
      }
   }

   public void N(class00570 var1) {
      if (this.Z()) {
         class07299 class07299 = var1.J();
         if (!this.s.isEmpty() || !this.P.isEmpty()) {
            List<class04770> list = this.j.N(this.u, true);
            if (!list.isEmpty()) {
               class00504 class00504 = new class00504(var1.R(), this.T, this.s, this.P);
               this.N(list, class00504);
            }

            this.s.clear();
            this.P.clear();
         }

         if (this.W) {
            List<class04770> list1 = this.j.N(this.u, false);

            for (int jx = 0; jx < this.m.length; jx++) {
               ShortSet shortset = this.m[jx];
               if (shortset != null) {
                  this.m[jx] = null;
                  if (!list1.isEmpty()) {
                     int ix = this.R.method_31604(jx);
                     class01296 class01296 = class01296.N(var1.R(), ix);
                     if (shortset.size() == 1) {
                        class07209 class07209 = class01296.M(shortset.iterator().nextShort());
                        class00500 class00500 = class07299.method_8320(class07209);
                        this.N(list1, new class07259(class07209, class00500));
                        this.N(list1, class07299, class07209, class00500);
                     } else {
                        class00554 class00554 = var1.y(jx);
                        class07261 class07261 = new class07261(class01296, shortset, class00554);
                        this.N(list1, class07261);
                        class07261.N((var3x, var4x) -> this.N(list1, class07299, var3x, var4x));
                     }
                  }
               }
            }

            this.W = false;
         }
      }
   }

   protected void N(class06265 var1, Executor var2) {
      class04763 class04763x = class03469.L(this.z);
      class04763 class04763x = class03469.L(this.U);
      boolean flag = class04763x.N(class04763.field_44855);
      boolean flag1 = class04763x.N(class04763.field_44855);
      this.v |= flag1;
      if (!flag && flag1) {
         this.M = var1.L(this);
         this.N(var1, this.M, var2, class04763.field_44855);
         this.y(this.M);
         this.N(var1, var2, null);
      }

      if (flag && !flag1) {
         this.M.complete(N);
         this.M = i;
      }

      boolean flag2 = class04763x.N(class04763.field_44856);
      boolean flag3 = class04763x.N(class04763.field_44856);
      if (!flag2 && flag3) {
         this.B = var1.y(this);
         this.N(var1, this.B, var2, class04763.field_44856);
         this.y(this.B);
         this.y(var1, var2, null);
      }

      if (flag2 && !flag3) {
         this.B.complete(N);
         this.B = i;
      }

      boolean flag4 = class04763x.N(class04763.field_13877);
      boolean flag5 = class04763x.N(class04763.field_13877);
      if (!flag4 && flag5) {
         if (this.Z != i) {
            throw (IllegalStateException)class07536.y(new IllegalStateException());
         }

         this.Z = var1.N(this);
         this.N(var1, this.Z, var2, class04763.field_13877);
         this.y(this.Z);
         this.L(var1, var2, null);
      }

      if (flag4 && !flag5) {
         this.Z.complete(N);
         this.Z = i;
      }

      this.N(var1, var2, null, class04763x, class04763x);
      if (!class04763x.N(class04763x)) {
         this.N(var1, class04763x);
      }

      this.b.method_17209(this.u, this::U, this.U, this::y);
      this.z = this.U;
   }

   private void N(class06265 var1, class04763 var2) {
      this.N(var1, var2, null);
      this.n.cancel(false);
      var1.N(this.u, var2);
   }

   private void N(List<class04770> var1, class00381<?> var2) {
      var1.forEach(var1x -> var1x.field_13987.method_14364(var2));
   }

   public void N(int var1) {
      this.U = var1;
   }

   private void N(class06265 var1, CompletableFuture<class02818<class00570>> var2, Executor var3, class04763 var4) {
      this.n.cancel(false);
      CompletableFuture completablefuture = new CompletableFuture();
      completablefuture.thenRunAsync(() -> var1.N(this.u, var4), var3);
      this.n = completablefuture;
      var2.thenAccept(var1x -> var1x.N_36(var1xx -> completablefuture.complete(null)));
   }

   public void W() {
      this.v = class03469.L(this.U).N(class04763.field_44855);
   }

   public boolean lithium$updateLastAccessTime(long var1) {
      long ix = this.w;
      this.w = var1;
      return ix != var1;
   }

   public CompletableFuture<?> R() {
      return this.t;
   }

   public class04763 fabric_getCurrentEventLevelType() {
      return this.d;
   }

   public void fabric_setCurrentEventLevelType(class04763 var1) {
      this.d = var1;
   }
}
