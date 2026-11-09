package minecraft;

import Nursultan.class09372;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.world.chunk.ChunkStatusTracker;
import net.caffeinemc.mods.lithium.common.world.chunk.heightmap.CombinedHeightmapUpdate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.Load;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents.Unload;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSync;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class00570 extends class08050 implements class05474, class06960, AttachmentTargetImpl {
   public static final Logger W = LogUtils.getLogger();
   private static final class01099 P = new class00562();
   private Map<class07209, class00553> s = Maps.newHashMap();
   private boolean T;
   public final class07299 m;
   @Nullable
   private Supplier<class04763> b;
   @Nullable
   private class00571 j;
   private Int2ObjectMap<class01166> v;
   private final class04310<class00891> n;
   private final class04310<class04651> t;
   private class00568 G;
   private static final class00500 l = class00869.N.W();
   private static final class04688 d = class04684.N.M();

   @Override
   public boolean L(int var1) {
      return this.m.L(var1);
   }

   private <T extends class00394> void L(T var1) {
      class01118 class01118 = var1.w().N(this.m, var1.O());
      if (class01118 == null) {
         this.B(var1.d());
      } else {
         this.s.compute(var1.d(), (var3x, var4) -> {
            class01099 class01099 = this.N(var1, class01118);
            if (var4 != null) {
               this.N(var1, class01118, var3x, var4, null);
               var4.N(class01099);
               return (class00553)var4;
            } else if (this.V()) {
               class00553 class00553 = new class00553(class01099);
               class07299 class07299 = this.m;
               this.N(var1, class01118, var3x, var4, null, class00553);
               class07299.method_31594(class00553);
               return class00553;
            } else {
               return null;
            }
         });
      }
   }

   public void L(class04782 var1) {
      var1.method_14196().N(this.L);
      var1.method_14179().N(this.L);
   }

   @Nullable
   private class00394 M(class07209 var1) {
      class00500 class00500 = this.method_8320(var1);
      return !class00500.k() ? null : ((class07190)class00500.i()).N(var1, class00500);
   }

   @Override
   public class04327<class00891> P() {
      return this.n;
   }

   public void K() {
      this.z.values().forEach(var1 -> {
         if (this.m instanceof class04782 class04782) {
            this.y(var1, class04782);
         }

         this.m.method_71970(var1);
         this.L(var1);
      });
   }

   @Override
   public int method_31607() {
      return this.m.method_31607();
   }

   @Override
   public class00500 method_8320(class07209 var1) {
      int i = var1.method_10263();
      int jx = var1.method_10264();
      int k = var1.method_10260();
      int lx = this.method_31602(jx);
      class00554[] aclass00554 = this.u();
      if (lx >= 0 && lx < aclass00554.length) {
         class00554 class00554 = aclass00554[lx];
         if (!class00554.L()) {
            return class00554.N(i & 15, jx & 15, k & 15);
         }
      }

      return l;
   }

   @Override
   public class04688 method_8316(class07209 var1) {
      return this.N(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   public class00570(
      class07299 var1,
      class07321 var2,
      class07371 var3,
      class04310<class00891> var4,
      class04310<class04651> var5,
      long var6,
      @Nullable class00554[] var8,
      @Nullable class00571 var9,
      @Nullable class03032 var10
   ) {
      super(var2, var3, var1, var1.method_74142(), var6, var8, var10);
      this.N(var1, var2, var3, var4, var5, var6, var8, var9, var10, null);
      this.G = var0 -> {};
      this.m = var1;
      this.v = new Int2ObjectOpenHashMap();
      this.N(null);

      for (class07830 class07830 : class07830.values()) {
         if (class00549.m.i().contains(class07830)) {
            this.M.put(class07830, new class07841(this, class07830));
         }
      }

      this.j = var9;
      this.n = var4;
      this.t = var5;
   }

   public class00570(class04782 var1, class07361 var2, @Nullable class00571 var3) {
      this(var1, var2.R(), var2.b(), var2.K(), var2.V(), var2.n(), var2.u(), var3, var2.v());
      if (!Collections.disjoint(var2.Z.keySet(), var2.z.keySet())) {
         W.error("Chunk at {} contains duplicated block entities", var2.R());
      }

      for (class00394 class00394 : var2.J().values()) {
         this.N(class00394);
      }

      this.Z.putAll(var2.q());

      for (int i = 0; i < var2.m().length; i++) {
         this.y[i] = var2.m()[i];
      }

      this.N_86(var2.M());
      this.y(var2.B());

      for (Entry entry : var2.i()) {
         if (class00549.m.i().contains(entry.getKey())) {
            this.N((class07830)entry.getKey(), ((class07841)entry.getValue()).N());
         }
      }

      this.B = var2.B;
      this.N(var2.t());
      this.Z();
      this.N(var1, var2, var3, null);
   }

   public class00570(class07299 var1, class07321 var2) {
      this(var1, var2, class07371.N, new class04310<>(), new class04310<>(), 0L, null, null, null);
   }

   static {
      ChunkStatusTracker.registerLoadCallback((var0, var1) -> var0.lithium$getData().gameEventDispatchers().addChunk(var1.R().y(), var1.v));
      ChunkStatusTracker.registerUnloadCallback((var0, var1) -> var0.lithium$getData().gameEventDispatchers().removeChunk(var1.y()));
   }

   private void B(class07209 var1) {
      class00553 class00553 = this.s.remove(var1);
      if (class00553 != null) {
         class00553.N(P);
      }
   }

   public void I() {
      if (this.j != null) {
         this.j.run(this);
         this.j = null;
      }
   }

   public class07299 J() {
      return this.m;
   }

   @Override
   public void Z() {
      boolean flag = this.U();
      super.Z();
      if (!flag) {
         this.G.setUnsaved(this.L);
      }
   }

   private boolean V() {
      return this.T || this.m.method_8608();
   }

   @Override
   public class04327<class04651> s() {
      return this.t;
   }

   public Map<class07209, class00394> o() {
      return this.z;
   }

   public class04763 g() {
      return this.b == null ? class04763.field_44855 : this.b.get();
   }

   public void q() {
      this.z.values().forEach(class00394::r_);
      this.z.clear();
      this.s.values().forEach(var0 -> var0.N(P));
      this.s.clear();
   }

   public void u(long var1) {
      this.n.y(var1);
      this.t.y(var1);
   }

   private void u(int var1) {
      this.v.remove(var1);
      this.N(var1, null);
   }

   public void y(class04782 var1) {
      var1.method_14196().N(this.L, this.n);
      var1.method_14179().N(this.L, this.t);
   }

   private <T extends class00394> void y(T var1, class04782 var2) {
      class00891 class00891 = var1.w().i();
      if (class00891 instanceof class07190) {
         class01187 class01187 = ((class07190)class00891).N(var2, var1);
         if (class01187 != null) {
            this.N(class01296.N(var1.d().method_10264())).N(class01187);
         }
      }
   }

   public void y(class00394 var1) {
      this.N(var1);
      if (this.V()) {
         if (this.m instanceof class04782 class04782) {
            this.y(var1, class04782);
         }

         this.m.method_71970(var1);
         this.L(var1);
      }
   }

   public void y(Supplier<class04763> var1) {
      this.b = var1;
      this.N(var1, null);
   }

   public void y(boolean var1) {
      this.T = var1;
   }

   private Object y(Map var1, Object var2) {
      return var2 != class07830.field_13197 && var2 != class07830.field_13203 && var2 != class07830.field_13200 && var2 != class07830.field_13202
         ? var1.get(var2)
         : null;
   }

   @Override
   public class00549 E() {
      return class00549.m;
   }

   private void N(class04782 var1, class07361 var2, class00571 var3, CallbackInfo var4) {
      AttachmentTargetImpl.transfer(var2, this, false);
   }

   private void N(class00394 var1, CallbackInfo var2, class00394 var3) {
      if (var3 != null) {
         if (this.J() instanceof class04782) {
            ((Unload)ServerBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(var3, (class04782)this.J());
         } else if (this.J() instanceof class03448) {
            ((net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker())
               .onUnload(var3, (class03448)this.J());
         }
      }
   }

   private Object N(Map var1, Object var2) {
      Object object = var1.remove(var2);
      if (object != null) {
         if (this.J() instanceof class04782) {
            ((Unload)ServerBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload((class00394)object, (class04782)this.J());
         } else if (this.J() instanceof class03448) {
            ((net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker())
               .onUnload((class00394)object, (class03448)this.J());
         }
      }

      return object;
   }

   public class04688 N(int var1, int var2, int var3) {
      int i = this.method_31602(var2);
      class00554[] aclass00554 = this.u();
      return i >= 0 && i < aclass00554.length ? aclass00554[i].y(var1 & 15, var2 & 15, var3 & 15) : d;
   }

   private Object N_11(Object var1, class00394 var2) {
      if (var2 != null && var2 != var1) {
         if (this.J() instanceof class04782) {
            ((Load)ServerBlockEntityEvents.BLOCK_ENTITY_LOAD.invoker()).onLoad(var2, (class04782)this.J());
         } else if (this.J() instanceof class03448) {
            ((net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Load)ClientBlockEntityEvents.BLOCK_ENTITY_LOAD.invoker())
               .onLoad(var2, (class03448)this.J());
         }
      }

      return var1;
   }

   private void N(class00394 var1, class01118 var2, class07209 var3, class00553 var4, CallbackInfoReturnable var5, class00553 var6) {
      if (var1 instanceof SleepingBlockEntity) {
         ((SleepingBlockEntity)var1).lithium$setTickWrapper(var6);
      }
   }

   private void N(Supplier var1, CallbackInfo var2) {
      if (var1 != null) {
         class07299 class07299 = this.J();
         if (class07299 instanceof class04782) {
            ChunkStatusTracker.onChunkAccessible((class04782)class07299, this);
         }
      }
   }

   private void N(class07209 var1, class00500 var2, int var3, CallbackInfoReturnable var4, class00394 var5) {
      class00500 class00500 = this.method_8320(var1);
      if (class00500 != var2) {
         var5.L(class00500);
      }
   }

   private void N(int var1, CallbackInfo var2) {
      if (this.v != null && this.v.isEmpty()) {
         this.N(null);
      }
   }

   private void N(class00394 var1, class01118 var2, class07209 var3, class00553 var4, CallbackInfoReturnable var5) {
      if (var1 instanceof SleepingBlockEntity) {
         ((SleepingBlockEntity)var1).lithium$setTickWrapper(var4);
      }
   }

   private boolean N(class07841 var1, int var2, int var3, int var4, class00500 var5) {
      return var1 == null ? false : var1.N(var2, var3, var4, var5);
   }

   private void N(class07209 var1, class00500 var2, int var3, CallbackInfoReturnable var4, int var5, int var6, int var7) {
      class07841 class07841xxx = this.M.get(class07830.field_13197);
      class07841 class07841x = this.M.get(class07830.field_13203);
      class07841 class07841xx = this.M.get(class07830.field_13200);
      class07841 class07841xxx = this.M.get(class07830.field_13202);
      CombinedHeightmapUpdate.updateHeightmaps(class07841xxx, class07841x, class07841xx, class07841xxx, this, var6, var5, var7, var2);
   }

   private void N(class07209 var1, CallbackInfo var2, @Nullable class00394 var3) {
      if (var3 != null) {
         if (this.J() instanceof class04782) {
            ((Unload)ServerBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(var3, (class04782)this.J());
         } else if (this.J() instanceof class03448) {
            ((net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker())
               .onUnload(var3, (class03448)this.J());
         }
      }
   }

   private void N(CallbackInfo var1) {
      if (this.v.isEmpty()) {
         this.v = null;
      }
   }

   public void N(Int2ObjectMap var1) {
      this.J().lithium$getData().gameEventDispatchers().replace(this.R().y(), var1);
      this.v = var1;
   }

   private void N(CallbackInfoReturnable var1) {
      if (this.v == null) {
         this.N(new Int2ObjectOpenHashMap(4));
      }
   }

   private void N(
      class07299 var1,
      class07321 var2,
      class07371 var3,
      class04310 var4,
      class04310 var5,
      long var6,
      class00554[] var8,
      class00571 var9,
      class03032 var10,
      CallbackInfo var11
   ) {
      this.s = new Object2ObjectOpenHashMap();
   }

   private class00394 N(class07190 var1, class07209 var2, class00500 var3) {
      class00500 class00500 = this.method_8320(var2);
      if (var3 == class00500) {
         return var1.N(var2, var3);
      } else {
         return class00500.k() ? ((class07190)class00500.i()).N(var2, class00500) : null;
      }
   }

   @Override
   public void N(class00394 var1) {
      class07209 class07209 = var1.d();
      class00500 class00500x = this.method_8320(class07209);
      if (!class00500x.k()) {
         W.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{var1, class07209, class00500x});
      } else {
         class00500 class00500x = var1.w();
         if (class00500x != class00500x) {
            if (!var1.O().method_20526(class00500x)) {
               W.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{var1, class07209, class00500x});
               return;
            }

            if (class00500x.i() != class00500x.i()) {
               W.warn("Block state mismatch on block entity {} in position {}, {} != {}, updating", new Object[]{var1, class07209, class00500x, class00500x});
            }

            var1.L(class00500x);
         }

         var1.N(this.m);
         var1.Y();
         class00394 class00394 = (class00394)this.N_11(this.z.put(class07209.method_10062(), var1), var1);
         if (class00394 != null && class00394 != var1) {
            class00394.r_();
            this.N(var1, null, class00394);
         }
      }
   }

   @Nullable
   @Override
   public class07001 N(class07209 var1, class01929 var2) {
      class00394 class00394 = this.method_8321(var1);
      if (class00394 != null && !class00394.k()) {
         class07001 class07001 = class00394.y_2(this.m.method_30349());
         class07001.N("keepPacked", false);
         return class07001;
      } else {
         class07001 class07001x = this.Z.get(var1);
         if (class07001x != null) {
            class07001x = class07001x.N();
            class07001x.N("keepPacked", true);
         }

         return class07001x;
      }
   }

   @Override
   public void N(class07209 var1) {
      if (this.V()) {
         class00394 class00394 = this.z.remove(var1);
         if (class00394 != null) {
            if (this.m instanceof class04782 class04782) {
               this.N(class00394, class04782);
               class04782.method_74535().N(var1);
            }

            this.N(var1, null, class00394);
            class00394.r_();
         }
      }

      this.B(var1);
   }

   private <T extends class00394> void N(T var1, class04782 var2) {
      class00891 class00891 = var1.w().i();
      if (class00891 instanceof class07190) {
         class01187 class01187 = ((class07190)class00891).N(var2, var1);
         if (class01187 != null) {
            int i = class01296.N(var1.d().method_10264());
            this.N(i).y(class01187);
         }
      }
   }

   public void N(class00667 var1, Map<class07830, long[]> var2, Consumer<class01806> var3) {
      this.q();
      class00554[] aclass00554 = this.E;
      int i = aclass00554.length;

      for (int jx = 0; jx < i; jx++) {
         aclass00554[jx].N(var1);
      }

      var2.forEach(this::N);
      this.k();

      try (class04495 class04495 = new class04495(this.Q(), W)) {
         var3.accept((var2x, var3x, var4x) -> {
            class00394 class00394 = this.N(var2x, class00531.field_12860);
            if (class00394 != null && var4x != null && class00394.O() == var3x) {
               class00394.y_1(class08308.N(class04495.N_46(class00394.J()), this.m.method_30349(), var4x));
            }
         });
      }
   }

   public void N(class00667 var1) {
      int i = this.E.length;

      for (int jx = 0; jx < i; jx++) {
         this.E[jx].y(var1);
      }
   }

   public void N(class00568 var1) {
      this.G = var1;
      if (this.U()) {
         var1.setUnsaved(this.L);
      }
   }

   @Override
   public class08094 N(long var1) {
      return new class08094(this.n.N(var1), this.t.N(var1));
   }

   @Override
   public class01166 N(int var1) {
      if (this.m instanceof class04782 class04782) {
         this.N(null);
         return (class01166)this.v.computeIfAbsent(var1, var3 -> new class01145(class04782, var1, this::u));
      } else {
         return super.N(var1);
      }
   }

   @Nullable
   @Override
   public class00500 N(class07209 var1, class00500 var2, int var3) {
      int i = var1.method_10264();
      class00554 class00554 = this.y(this.method_31602(i));
      boolean flag = class00554.L();
      if (flag && var2.P()) {
         return null;
      } else {
         int jx = var1.method_10263() & 15;
         int k = i & 15;
         int lx = var1.method_10260() & 15;
         class00500 class00500 = class00554.N(jx, k, lx, var2);
         if (class00500 == var2) {
            return null;
         } else {
            class00891 class00891 = var2.i();
            class07830 class07830 = class07830.field_13197;
            Map<class07830, class07841> map = this.M;
            class07841 class07841xxxx = (class07841)this.y(map, class07830);
            this.N(var1, var2, var3, null, i, jx, lx);
            class07841 class07841x = class07841xxxx;
            this.N(class07841x, jx, i, lx, var2);
            class07830 = class07830.field_13203;
            map = this.M;
            class07841 class07841xx = (class07841)this.y(map, class07830);
            this.N(class07841xx, jx, i, lx, var2);
            class07830 = class07830.field_13200;
            map = this.M;
            class07841 class07841xxx = (class07841)this.y(map, class07830);
            this.N(class07841xxx, jx, i, lx, var2);
            class07830 = class07830.field_13202;
            map = this.M;
            class07841 class07841xxxx = (class07841)this.y(map, class07830);
            this.N(class07841xxxx, jx, i, lx, var2);
            boolean flag1 = class00554.L();
            if (flag != flag1) {
               this.m.method_8398().L().N(var1, flag1);
               this.m.method_8398().N(this.L.B, class01296.N(i), this.L.Z, flag1);
            }

            if (class05015.N(class00500, var2)) {
               class04643 class04643 = class08700.N();
               class04643.N("updateSkyLightSources");
               this.B.N(this, jx, i, lx);
               class04643.y("queueCheckLight");
               this.m.method_8398().L().N(var1);
               class04643.L();
            }

            boolean flag4 = !class00500.N(class00891);
            boolean flag2 = (var3 & 64) != 0;
            boolean flag3 = (var3 & 256) == 0;
            if (flag4 && class00500.k() && !var2.N(class00500)) {
               if (!this.m.method_8608() && flag3) {
                  class00394 class00394x = this.m.method_8321(var1);
                  if (class00394x != null) {
                     class00394x.N(var1, class00500);
                  }
               }

               this.N(var1);
            }

            if ((flag4 || class00891 instanceof class07760) && this.m instanceof class04782 class04782 && ((var3 & 1) != 0 || flag2)) {
               class00500.N(class04782, var1, flag2);
            }

            if (!class00554.N(jx, k, lx).N(class00891)) {
               return null;
            } else {
               if (!this.m.method_8608() && (var3 & 512) == 0) {
                  var2.N(this.m, var1, class00500, flag2);
               }

               if (var2.k()) {
                  class00394 class00394 = this.N(var1, class00531.field_12859);
                  if (class00394 != null && !class00394.y(var2)) {
                     W.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{var1, class00394.O().method_53254().B().N(), var2});
                     this.N(var1);
                     class00394 = null;
                  }

                  if (class00394 == null) {
                     class07190 class07190 = (class07190)class00891;
                     class00394 = this.N(class07190, var1, var2);
                     if (class00394 != null) {
                        this.y(class00394);
                     }
                  } else {
                     class00394.L(var2);
                     this.N(var1, var2, var3, null, class00394);
                     this.L(class00394);
                  }
               }

               this.Z();
               return class00500;
            }
         }
      }
   }

   @Deprecated
   @Override
   public void N(class07049 var1) {
   }

   @Nullable
   public class00394 N(class07209 var1, class00531 var2) {
      class00394 class00394x = this.z.get(var1);
      if (class00394x == null) {
         class07001 class07001 = this.Z.remove(var1);
         if (class07001 != null) {
            class00394 class00394x = this.N(var1, class07001);
            if (class00394x != null) {
               return class00394x;
            }
         }
      }

      if (class00394x == null) {
         if (var2 == class00531.field_12860) {
            class00394x = this.M(var1);
            if (class00394x != null) {
               this.y(class00394x);
            }
         }
      } else if (class00394x.k()) {
         Map<class07209, class00394> map = this.z;
         this.N(map, var1);
         return null;
      }

      return class00394x;
   }

   private <T extends class00394> class01099 N(T var1, class01118<T> var2) {
      return new class09372((T)this, var1, var2);
   }

   public void N(class04782 var1) {
      class07321 class07321 = this.R();

      for (int i = 0; i < this.y.length; i++) {
         ShortList shortlist = this.y[i];
         if (shortlist != null) {
            ShortListIterator shortlistiterator = shortlist.iterator();

            while (shortlistiterator.hasNext()) {
               class07209 class07209x = class07361.N((Short)shortlistiterator.next(), this.method_31604(i), class07321);
               class00500 class00500x = this.method_8320(class07209x);
               class04688 class04688 = class00500x.Y();
               if (!class04688.W()) {
                  class04688.N(var1, class07209x, class00500x);
               }

               if (!(class00500x.i() instanceof class07117)) {
                  class00500 class00500x = class00891.a_(class00500x, var1, class07209x);
                  if (class00500x != class00500x) {
                     var1.method_8652(class07209x, class00500x, 276);
                  }
               }
            }

            shortlist.clear();
         }
      }

      UnmodifiableIterator unmodifiableiterator = ImmutableList.copyOf(this.Z.keySet()).iterator();

      while (unmodifiableiterator.hasNext()) {
         class07209 class07209x = (class07209)unmodifiableiterator.next();
         this.method_8321(class07209x);
      }

      this.Z.clear();
      this.i.N(this);
   }

   @Nullable
   private class00394 N(class07209 var1, class07001 var2) {
      class00500 class00500 = this.method_8320(var1);
      class00394 class00394;
      if ("DUMMY".equals(var2.y("id", ""))) {
         if (class00500.k()) {
            class00394 = ((class07190)class00500.i()).N(var1, class00500);
         } else {
            class00394 = null;
            W.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", var1, class00500);
         }
      } else {
         class00394 = class00394.N(var1, class00500, var2, this.m.method_30349());
      }

      if (class00394 != null) {
         class00394.N(this.m);
         this.y(class00394);
      } else {
         W.warn("Tried to load a block entity for block {} but failed at location {}", class00500, var1);
      }

      return class00394;
   }

   boolean R(class07209 var1) {
      if (!this.m.method_8621().N(var1)) {
         return false;
      } else {
         return !(this.m instanceof class04782 class04782) ? true : this.g().N(class04763.field_44856) && class04782.method_37116(class07321.N(var1));
      }
   }

   public boolean O() {
      return false;
   }

   @Override
   public boolean fabric_shouldTryToSync() {
      return !this.m.method_8608();
   }

   @Override
   public void method_74589(class04782 var1, class06990 var2) {
      if (!this.M().isEmpty()) {
         var2.N(class00429.W, () -> {
            ArrayList arraylist = new ArrayList();

            for (class04932 class04932 : this.M().values()) {
               class05163 class05163 = class04932.N();
               List<class04890> list = class04932.Z();
               ArrayList arraylist1 = new ArrayList(list.size());

               for (int i = 0; i < list.size(); i++) {
                  boolean flag = i == 0;
                  arraylist1.add(new class00426(list.get(i).L(), flag));
               }

               arraylist.add(new class00431(class05163, arraylist1));
            }

            return arraylist;
         });
      }

      var2.N(class00429.E, () -> var1.method_19495().N(this.L));
   }

   public void fabric_syncChange(AttachmentType var1, AttachmentChange var2) {
      class07299 class07299 = this.m;
      if (class07299 instanceof class04782) {
         PlayerLookup.tracking((class04782)class07299, this.R()).forEach(var3 -> {
            if (((AttachmentTypeImpl)var1).syncPredicate().test(this, var3)) {
               AttachmentSync.trySync(var2, var3);
            }
         });
      }
   }

   @Override
   public int method_31604(int var1) {
      return this.m.method_31604(var1);
   }

   @Override
   public int method_31600() {
      return this.m.method_31600();
   }

   @Override
   public boolean method_31606(class07209 var1) {
      return this.m.method_31606(var1);
   }

   @Nullable
   @Override
   public class00394 method_8321(class07209 var1) {
      return this.N(var1, class00531.field_12859);
   }

   @Override
   public int method_32891() {
      return this.m.method_32891();
   }

   @Override
   public int method_32890() {
      return this.m.method_32890();
   }

   @Override
   public int method_31597() {
      return this.m.method_31597();
   }

   @Override
   public boolean method_31601(int var1) {
      return this.m.method_31601(var1);
   }

   @Override
   public int method_31603(int var1) {
      return this.m.method_31603(var1);
   }

   @Override
   public int method_31605() {
      return this.m.method_31605();
   }

   @Override
   public int method_31602(int var1) {
      return this.m.method_31602(var1);
   }

   @Override
   public class01042 fabric_getDynamicRegistryManager() {
      return this.m.method_30349();
   }

   @Override
   public void fabric_computeInitialSyncChanges(class04770 var1, Consumer var2) {
      super.fabric_computeInitialSyncChanges(var1, var2);
      Iterator<class00394> iterator = this.o().values().iterator();

      while (iterator.hasNext()) {
         iterator.next().fabric_computeInitialSyncChanges(var1, var2);
      }
   }
}
