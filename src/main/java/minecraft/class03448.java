package minecraft;

import Nursultan.class09326;
import Nursultan.class11371;
import Nursultan.class11396;
import Nursultan.class11938;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.features.world.disable_sequencing.PendingUpdateManager1_18_2;
import com.viaversion.viafabricplus.injection.access.world.always_tick_entities.IEntity;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BooleanSupplier;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import net.caffeinemc.mods.lithium.common.client.ClientWorldAccessor;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTracker;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder;
import net.caffeinemc.mods.sodium.client.world.BiomeSeedProvider;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.EndWorldTick;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.StartWorldTick;
import net.fabricmc.fabric.impl.client.rendering.ColorResolverRegistryImpl;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class03448 extends class07299 implements class08542<class03448>, ClientWorldAccessor, ChunkTrackerHolder, BiomeSeedProvider {
   private static final Logger M = LogUtils.getLogger();
   public static final class00392 N = class00392.L("multiplayer.status.quitting");
   private static final double B = 0.05;
   private static final int Z = 10;
   private static final int z = 1000;
   final class01139 y;
   private final class01115<class07049> U;
   private final class01683 E;
   private final class03063 W;
   private final class02417 m;
   public final class03427 L;
   private final class03106 P;
   @Nullable
   private final class00917 s;
   private final class06202 T;
   final List<class04477> u;
   final List<class00695> i;
   private final Map<class02265, class07769> b;
   private int j;
   private final Object2ObjectArrayMap<class03202, class05917> v;
   private final class01688 n;
   private final Deque<Runnable> t;
   private int G;
   private class01909 l;
   private final Set<class00394> d;
   private final class00933 w;
   private final class08057 k;
   private final class00616 Y;
   private final int Q;
   private boolean O;
   private static final Set<class06581> g = Set.of(class06570.Zn, class06570.Zt);
   private final Reference2ReferenceMap I = ColorResolverRegistryImpl.createCustomCacheMap(var1x -> new class05917(var2x -> this.N(var2x, var1x)));
   private class09326 J;
   private long o;
   private final ChunkTracker q = new ChunkTracker();

   private void L(CallbackInfo var1) {
      ObjectIterator objectiterator = this.I.values().iterator();

      while (objectiterator.hasNext()) {
         ((class05917)objectiterator.next()).N();
      }
   }

   public Set<class00394> L() {
      return this.d;
   }

   public void L(class07049 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.y(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         var1.method_22862();
         var1.field_6012++;
         class08700.N().N(() -> class04206.M.y(var1.method_5864()).toString());
         var1.method_5773();
         class08700.N().L();

         for (class07049 class07049 : this.N(var1, (Operation)(var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_1297]");
            return ((class07049)var0[0]).method_5685();
         }))) {
            this.N(var1, class07049);
         }
      }
   }

   public Iterable<class07049> M() {
      return this.method_31592().N();
   }

   private void M(class07049 var1) {
      IEntity ientity = var1;
      int ix = class04995.N(var1.method_23317() / 16.0);
      int jx = class04995.N(var1.method_23321() / 16.0);
      if ((!ientity.viaFabricPlus$isInLoadedChunkAndShouldTick() || var1.method_31476().B != ix || var1.method_31476().Z != jx)
         && !this.method_8497(ix, jx).O()) {
         ientity.viaFabricPlus$setInLoadedChunkAndShouldTick(true);
      }
   }

   public int P() {
      return this.G;
   }

   @Nullable
   private class00891 T() {
      if (((class03443)this.T.T_2).U() == class07282.field_9220) {
         class06581 class06581 = ((class04453)this.T.T_4).method_6047().B();
         if (g.contains(class06581) && class06581 instanceof class06918) {
            return ((class06918)class06581).L();
         }
      }

      return null;
   }

   @Override
   public void method_32888(class03556<class01194> var1, class06889 var2, class01164 var3) {
   }

   @Override
   public class08057 method_8621() {
      return this.k;
   }

   @Override
   public class05042 method_74854() {
      return this.field_9232.N();
   }

   @Override
   public class00616 method_75728() {
      return this.Y;
   }

   @Override
   public void method_8406(class07126 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.N(var1, var1.method_10295().method_10299(), false, var2, var4, var6, var8, var10, var12);
   }

   @Override
   public class06683 method_8428() {
      return this.E.l();
   }

   @Override
   public List<class04477> method_18456() {
      return this.u;
   }

   public class03448(
      class01683 var1,
      class03427 var2,
      class05946<class07299> var3,
      class03556<class07376> var4,
      int var5,
      int var6,
      class03063 var7,
      boolean var8,
      long var9,
      int var11
   ) {
      super(var2, var3, var1.j(), var4, true, var8, var9, 1000000);
      this.y = new class01139();
      this.U = new class01115<>(class07049.class, new class03455(this));
      this.T = class06202.Nq();
      this.u = Lists.newArrayList();
      this.i = Lists.newArrayList();
      this.b = Maps.newHashMap();
      this.v = class07536.N(new Object2ObjectArrayMap(3), var1x -> {
         var1x.put(class06229.N, new class05917(var1xx -> this.N(var1xx, class06229.N)));
         var1x.put(class06229.y, new class05917(var1xx -> this.N(var1xx, class06229.y)));
         var1x.put(class06229.L, new class05917(var1xx -> this.N(var1xx, class06229.L)));
         var1x.put(class06229.u, new class05917(var1xx -> this.N(var1xx, class06229.u)));
      });
      this.t = Queues.newArrayDeque();
      this.l = new class01909();
      this.d = new ReferenceOpenHashSet();
      this.w = new class00933();
      this.k = new class08057();
      this.E = var1;
      this.n = new class01688(this, var5);
      this.P = new class03106();
      this.L = var2;
      this.W = var7;
      this.Q = var11;
      this.m = new class02417(this.T, this);
      this.s = ((class07376)var4.N()).L() ? new class00917() : null;
      this.method_27873(class05042.N(var3, new class07209(8, 64, 8), 0.0F, 0.0F));
      this.G = var6;
      this.Y = this.N(class00616.N()).N();
      this.method_8533();
      if (this.method_63020()) {
         this.method_8543();
      }

      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, null);
      this.u(null);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public void B() {
      this.y(null);
      this.y.N(var1 -> {
         if (!var1.method_31481() && !var1.method_5765() && !this.P.N(var1)) {
            this.method_18472(this::L, var1);
         }
      });
      this.N(null);
   }

   public void Z() {
      this.v.forEach((var0, var1) -> var1.N());
      this.L(null);
   }

   public void i() {
      int ix = this.t.size();
      int jx = ix < 1000 ? Math.max(10, ix / 10) : ix;

      for (int kx = 0; kx < jx; kx++) {
         Runnable runnable = this.t.poll();
         if (runnable == null) {
            break;
         }

         runnable.run();
      }
   }

   private int b() {
      return ((class05630)this.T.i_7).y().method_41753() ? 0 : this.j;
   }

   private void s() {
      this.L.N(this.L.y() + 1L);
      if (this.O) {
         this.L.y(this.L.L() + 1L);
      }
   }

   protected Map<class02265, class07769> m() {
      return ImmutableMap.copyOf(this.b);
   }

   public class01688 method_8398() {
      return this.n;
   }

   public int z() {
      return this.U.y();
   }

   private void u(CallbackInfo var1) {
      if (DebugSettings.INSTANCE.disableSequencing.isEnabled()) {
         this.l = new PendingUpdateManager1_18_2();
      }
   }

   class01909 u() {
      return this.l;
   }

   public void u(class07049 var1) {
      this.N(var1.method_5628(), class07062.field_26999);
      this.U.N(var1);
      this.N(var1, null);
   }

   public void y(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.W.N(var1, var2, var3, var4, var5, var6);
   }

   public void y(int var1) {
      this.G = var1;
   }

   public void y(int var1, int var2, int var3) {
      this.W.y(var1, var2, var3);
   }

   private void y(
      double var1, double var3, double var5, class04891 var7, class04911 var8, float var9, float var10, boolean var11, long var12, CallbackInfo var14
   ) {
      if (this.J.y()) {
         var14.cancel();
      }
   }

   private boolean y(boolean var1) {
      return WorldRenderingSettings.INSTANCE.shouldDisableDirectionalShading() ? false : var1;
   }

   private void y(class07049 var1, CallbackInfo var2) {
      IEntity ientity = var1;
      if (!ientity.viaFabricPlus$isInLoadedChunkAndShouldTick() && !var1.method_7325()) {
         var1.method_22862();
         this.M(var1);
         if (ientity.viaFabricPlus$isInLoadedChunkAndShouldTick()) {
            for (class07049 class07049 : var1.method_5685()) {
               this.N(var1, class07049);
            }
         }

         var2.cancel();
      }
   }

   public boolean y(class07049 var1) {
      return this.y.L(var1);
   }

   private void y(CallbackInfo var1) {
      ((StartWorldTick)ClientTickEvents.START_WORLD_TICK.invoker()).onStartTick(this);
   }

   public List<class00695> method_65097() {
      return this.i;
   }

   @Override
   public void N(class08546<class03448, ?> var1) {
      this.E.N(var1);
   }

   private void N(class00570 var1, CallbackInfo var2) {
      class07321 class07321 = var1.R();
      this.q.onChunkStatusRemoved(class07321.B, class07321.Z, 3);
   }

   private void N(
      class01683 var1,
      class03427 var2,
      class05946 var3,
      class03556 var4,
      int var5,
      int var6,
      class03063 var7,
      boolean var8,
      long var9,
      int var11,
      CallbackInfo var12
   ) {
      this.o = var9;
   }

   public void N(class06889 var1, float var2, int var3, class04540<class00931> var4) {
      this.w.N(var1, var2, var3, var4);
   }

   private class00040 N(class04891 var1, class04911 var2, float var3, float var4, class06069 var5, double var6, double var8, double var10, Operation var12) {
      this.J = class09326.N(var1, var2, var3, var4, var6, var8, var10);
      class11938.L().L(this.J);
      return (class00040)var12.call(new Object[]{this.J.Z(), this.J.L(), this.J.R(), this.J.i(), var5, this.J.M(), this.J.u(), this.J.B()});
   }

   private void N(class07049 var1, class07049 var2, CallbackInfo var3) {
      IEntity ientity = var2;
      if (!ientity.viaFabricPlus$isInLoadedChunkAndShouldTick()) {
         if (!var2.method_31481() && var2.method_5854() == var1) {
            if (var2 instanceof class08036 || this.y.L(var2)) {
               var2.method_22862();
               this.M(var2);
               if (ientity.viaFabricPlus$isInLoadedChunkAndShouldTick()) {
                  for (class07049 class07049 : var2.method_5685()) {
                     this.N(var2, class07049);
                  }
               }
            }
         } else {
            var2.method_5848();
         }

         var3.cancel();
      }
   }

   private List N(class07049 var1, Operation var2) {
      this.M(var1);
      return var1.viaFabricPlus$isInLoadedChunkAndShouldTick() ? (List)var2.call(new Object[]{var1}) : List.of();
   }

   public int N(class07209 var1, class03202 var2) {
      int ix = ((class05630)class06202.Nq().i_7).a().method_41753();
      if (ix == 0) {
         return var2.getColor(this.i(var1).N(), var1.method_10263(), var1.method_10260());
      } else {
         int jx = (ix * 2 + 1) * (ix * 2 + 1);
         int kx = 0;
         int lx = 0;
         int i1 = 0;
         class06153 class06153 = new class06153(
            var1.method_10263() - ix, var1.method_10264(), var1.method_10260() - ix, var1.method_10263() + ix, var1.method_10264(), var1.method_10260() + ix
         );
         class07218 class07218 = new class07218();

         while (class06153.N()) {
            class07218.N(class06153.y(), class06153.L(), class06153.u());
            int j1 = var2.getColor(this.i(class07218).N(), class07218.method_10263(), class07218.method_10260());
            kx += (j1 & 0xFF0000) >> 16;
            lx += (j1 & 0xFF00) >> 8;
            i1 += j1 & 0xFF;
         }

         return (kx / jx & 0xFF) << 16 | (lx / jx & 0xFF) << 8 | i1 / jx & 0xFF;
      }
   }

   public void N(class07209 var1, class07211 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class00500 class00500 = this.method_8320(var1);
         if (class00500.b() != class06898.field_11455 && class00500.g()) {
            int ix = var1.method_10263();
            int jx = var1.method_10264();
            int kx = var1.method_10260();
            float f = 0.1F;
            class00734 class00734 = class00500.R(this, var1).method_1107();
            double d0 = ix + this.field_9229.U() * (class00734.u - class00734.N - 0.2F) + 0.1F + class00734.N;
            double d1 = jx + this.field_9229.U() * (class00734.i - class00734.y - 0.2F) + 0.1F + class00734.y;
            double d2 = kx + this.field_9229.U() * (class00734.R - class00734.L - 0.2F) + 0.1F + class00734.L;
            if (var2 == class07211.field_11033) {
               d1 = jx + class00734.y - 0.1F;
            }

            if (var2 == class07211.field_11036) {
               d1 = jx + class00734.i + 0.1F;
            }

            if (var2 == class07211.field_11043) {
               d2 = kx + class00734.L - 0.1F;
            }

            if (var2 == class07211.field_11035) {
               d2 = kx + class00734.R + 0.1F;
            }

            if (var2 == class07211.field_11039) {
               d0 = ix + class00734.N - 0.1F;
            }

            if (var2 == class07211.field_11034) {
               d0 = ix + class00734.u + 0.1F;
            }

            ((class04410)this.T.i_0).N(new class03989(this, d0, d1, d2, 0.0, 0.0, 0.0, class00500, var1).method_3075(0.2F).method_3087(0.6F));
         }
      }
   }

   protected void N(Map<class02265, class07769> var1) {
      this.b.putAll(var1);
   }

   public void N(class07209 var1, class00500 var2, CallbackInfo var3) {
      if (!SodiumExtraClientMod.options().particleSettings.particles || !SodiumExtraClientMod.options().particleSettings.blockBreak) {
         var3.cancel();
      }
   }

   public void N(class07209 var1, class07211 var2, CallbackInfo var3) {
      if (!SodiumExtraClientMod.options().particleSettings.particles || !SodiumExtraClientMod.options().particleSettings.blockBreaking) {
         var3.cancel();
      }
   }

   private void N(class07321 var1, CallbackInfo var2) {
      ObjectIterator objectiterator = this.I.values().iterator();

      while (objectiterator.hasNext()) {
         ((class05917)objectiterator.next()).N(var1.B, var1.Z);
      }
   }

   private Object N(Object var1, class07209 var2, class03202 var3) {
      if (var1 == null) {
         var1 = this.I.get(var3);
         if (var1 == null) {
            throw new UnsupportedOperationException("ClientWorld.getColor called with unregistered ColorResolver " + var3);
         }
      }

      return var1;
   }

   public void N(CallbackInfo var1) {
      ((EndWorldTick)ClientTickEvents.END_WORLD_TICK.invoker()).onEndTick(this);
   }

   private void N(
      double var1, double var3, double var5, class04891 var7, class04911 var8, float var9, float var10, boolean var11, long var12, CallbackInfo var14
   ) {
      if (this.J.y()) {
         var14.cancel();
      }
   }

   private void N(class07049 var1, CallbackInfo var2) {
      class11371 class11371 = class11371.N(var1);
      class11938.L().L(class11371);
   }

   private void N(int var1, class07062 var2, CallbackInfo var3, class07049 var4) {
      class11396 class11396 = class11396.N(var4);
      class11938.L().L(class11396);
   }

   private void N(class07049 var1, class07049 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (var2.method_31481() || var2.method_5854() != var1) {
            var2.method_5848();
         } else if (var2 instanceof class08036 || this.y.L(var2)) {
            var2.method_22862();
            var2.field_6012++;
            var2.method_5842();

            for (class07049 class07049 : var2.method_5685()) {
               this.N(var2, class07049);
            }
         }
      }
   }

   public void N(long var1, long var3, boolean var5) {
      this.L.N(var1);
      this.L.y(var3);
      this.O = var5;
   }

   public void N(int var1, int var2, int var3) {
      byte b0 = 32;
      class06069 class06069 = class06069.u();
      class00891 class00891 = this.T();
      class07218 class07218 = new class07218();

      for (int ix = 0; ix < 667; ix++) {
         this.N(var1, var2, var3, 16, class06069, class00891, class07218);
         this.N(var1, var2, var3, 32, class06069, class00891, class07218);
      }
   }

   public void N(int var1, int var2, int var3, int var4, class06069 var5, @Nullable class00891 var6, class07218 var7) {
      int ix = var1 + this.field_9229.y(var4) - this.field_9229.y(var4);
      int jx = var2 + this.field_9229.y(var4) - this.field_9229.y(var4);
      int kx = var3 + this.field_9229.y(var4) - this.field_9229.y(var4);
      var7.N(ix, jx, kx);
      class00500 class00500 = this.method_8320(var7);
      class00500.i().N_20(class00500, this, var7, var5);
      class04688 class04688 = this.method_8316(var7);
      if (!class04688.W()) {
         class04688.N(this, var7, var5);
         class07126 var13 = class04688.Z();
         if (var13 != null && this.field_9229.y(10) == 0) {
            boolean flag = class00500.L(this, var7, class07211.field_11033);
            class07209 class07209 = var7.method_10074();
            this.N(class07209, this.method_8320(class07209), var13, flag);
         }
      }

      if (var6 == class00500.i()) {
         this.method_8406(new class07105(class07107.L, class00500), ix + 0.5, jx + 0.5, kx + 0.5, 0.0, 0.0, 0.0);
      }

      if (!class00500.W(this, var7)) {
         for (class06024 class06024 : this.method_75728().N(class00608.n, var7)) {
            if (class06024.N(this.field_9229)) {
               this.method_8406(
                  class06024.N(),
                  var7.method_10263() + this.field_9229.U(),
                  var7.method_10264() + this.field_9229.U(),
                  var7.method_10260() + this.field_9229.U(),
                  0.0,
                  0.0,
                  0.0
               );
            }
         }
      }
   }

   public void N(BooleanSupplier var1) {
      this.method_8533();
      if (this.method_54719().Z()) {
         this.method_8621().j();
         this.s();
      }

      if (this.j > 0) {
         this.method_8509(this.j - 1);
      }

      if (this.s != null) {
         this.s.N(this.N());
         if (this.s.L() && !((class05096)this.T.v_3 instanceof class04606)) {
            this.T.Nr().N(new class00918(class04909.IG, class04911.field_15252, this.field_9229, ((class03386)this.T.i_5).s(), this.s.N(), this.s.y()), 30);
         }
      }

      this.w.N(this);

      try (class08694 class08694 = class08700.N().i("blocks")) {
         this.n.N(var1, true);
      }

      class01834.M.N(this.T.Nx());
      this.method_75728().y();
   }

   private void N(class07209 var1, class00500 var2, class07126 var3, boolean var4) {
      if (var2.Y().W()) {
         class00494 class00494 = var2.M(this, var1);
         if (class00494.method_1105(class07185.field_11052) < 1.0) {
            if (var4) {
               this.N(var1.method_10263(), var1.method_10263() + 1, var1.method_10260(), var1.method_10260() + 1, var1.method_10264() + 1 - 0.05, var3);
            }
         } else if (!var2.N(class01210.Ng)) {
            double d0 = class00494.method_1091(class07185.field_11052);
            if (d0 > 0.0) {
               this.N(var1, var3, class00494, var1.method_10264() + d0 - 0.05);
            } else {
               class07209 class07209 = var1.method_10074();
               class00500 class00500 = this.method_8320(class07209);
               if (class00500.M(this, class07209).method_1105(class07185.field_11052) < 1.0 && class00500.Y().W()) {
                  this.N(var1, var3, class00494, var1.method_10264() - 0.05);
               }
            }
         }
      }
   }

   public void N(long var1) {
      this.W.N(var1);
   }

   public void N(class07321 var1) {
      this.v.forEach((var1x, var2) -> var2.N(var1.B, var1.Z));
      this.U.N(var1);
      this.N(var1, null);
   }

   @Override
   public boolean N(int var1, int var2) {
      return true;
   }

   public void N(int var1, class07062 var2) {
      class07049 class07049 = this.method_31592().N(var1);
      if (class07049 != null) {
         class07049.method_31745(var2);
         this.N(var1, var2, null, class07049);
         class07049.method_36209();
      }
   }

   public void N(class02265 var1, class07769 var2) {
      this.b.put(var1, var2);
   }

   public void N(class00392 var1) {
      this.E.M().method_10747(var1);
   }

   public void N(class00570 var1) {
      this.N(var1, null);
      var1.q();
      this.n.L().N(var1.R(), false);
      this.U.y(var1.R());
   }

   private class01315 N(boolean var1) {
      class01315 class01315 = ((class05630)this.T.i_7).NK().method_41753();
      if (var1 && class01315 == class01315.field_18199 && this.field_9229.y(10) == 0) {
         class01315 = class01315.field_18198;
      }

      if (class01315 == class01315.field_18198 && this.field_9229.y(3) == 0) {
         class01315 = class01315.field_18199;
      }

      return class01315;
   }

   private void N(double var1, double var3, double var5, class04891 var7, class04911 var8, float var9, float var10, boolean var11, long var12) {
      double d0 = ((class03386)this.T.i_5).s().y().L(var1, var3, var5);
      class06069 class06069 = class06069.y(var12);
      class00040 class00040 = this.N(
         var7,
         var8,
         var9,
         var10,
         class06069,
         var1,
         var3,
         var5,
         var0 -> {
            WrapOperationRuntime.checkArgumentCount(
               var0, 8, "[net.minecraft.class_3414, net.minecraft.class_3419, float, float, net.minecraft.class_5819, double, double, double]"
            );
            return new class00040(
               (class04891)var0[0], (class04911)var0[1], (Float)var0[2], (Float)var0[3], (class06069)var0[4], (Double)var0[5], (Double)var0[6], (Double)var0[7]
            );
         }
      );
      Object object1 = null;
      Object object = null;
      class00040 class00040x = class00040;
      if (var11 && d0 > 100.0) {
         double d1 = Math.sqrt(d0) / 40.0;
         class09033 class09033 = this.T.Nr();
         int ix = (int)(d1 * 20.0);
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.y(var1, var3, var5, var7, var8, var9, var10, var11, var12, callbackinfo1);
         if (callbackinfo1.isCancelled()) {
            return;
         }

         class09033.N(class00040x, ix);
      } else {
         class09033 class09033x = this.T.Nr();
         CallbackInfo callbackinfo = new CallbackInfo("", true);
         this.N(var1, var3, var5, var7, var8, var9, var10, var11, var12, callbackinfo);
         if (callbackinfo.isCancelled()) {
            return;
         }

         class09033x.N(class00040x);
      }
   }

   private void N(double var1, double var3, double var5, double var7, double var9, class07126 var11) {
      this.method_8406(var11, class04995.u(this.field_9229.U(), var1, var3), var9, class04995.u(this.field_9229.U(), var5, var7), 0.0, 0.0, 0.0);
   }

   public void N(int var1) {
      if (class07529.C) {
         M.debug("ACK {}", var1);
      }

      this.l.method_41938(var1, this);
   }

   public void N(class07209 var1, class00500 var2, int var3) {
      if (!this.l.method_41940(var1, var2)) {
         super.method_30092(var1, var2, var3, 512);
      }
   }

   private void N(class07209 var1, class07126 var2, class00494 var3, double var4) {
      this.N(
         var1.method_10263() + var3.method_1091(class07185.field_11048),
         var1.method_10263() + var3.method_1105(class07185.field_11048),
         var1.method_10260() + var3.method_1091(class07185.field_11051),
         var1.method_10260() + var3.method_1105(class07185.field_11051),
         var4,
         var2
      );
   }

   public void N(Runnable var1) {
      this.t.add(var1);
   }

   public void N(class07209 var1, class00500 var2, class06889 var3) {
      if (this.method_8320(var1) != var2) {
         this.method_8652(var1, var2, 19);
         class04453 class04453 = (class04453)this.T.T_4;
         if (this == class04453.method_73183() && class04453.method_30632(var1, var2)) {
            class04453.method_30634(var3.M, var3.B, var3.Z);
         }
      }
   }

   private void N(class07126 var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      try {
         class05363 class05363 = ((class03386)this.T.i_5).s();
         class01315 class01315 = this.N(var3);
         if (var2) {
            ((class04410)this.T.i_0).N(var1, var4, var6, var8, var10, var12, var14);
         } else if (!(class05363.y().L(var4, var6, var8) > 1024.0)) {
            if (class01315 != class01315.field_18199) {
               ((class04410)this.T.i_0).N(var1, var4, var6, var8, var10, var12, var14);
            }
         }
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Exception while adding particle");
         class07074 class07074 = class07080.N("Particle being added");
         class07074.N("ID", class04206.z.y(var1.method_10295()));
         class07074.N("Parameters", () -> class07107.yE.encodeStart(this.method_30349().N(class07713.N), var1).toString());
         class07074.N("Position", () -> class07074.N(this, var4, var6, var8));
         throw new class07878(class07080);
      }
   }

   private class00594 N(class00594 var1) {
      var1.N(this);
      int ix = class02566.N(204, 204, 255);
      var1.N(class00608.Z, (var2x, var3) -> this.b() > 0 ? class02566.N(0.22F, var2x, ix) : var2x);
      var1.N(class00608.j, (var1x, var2x) -> this.b() > 0 ? 1.0F : var1x);
      return var1;
   }

   public ChunkTracker sodium$getTracker() {
      return Objects.requireNonNull(this.q);
   }

   public class03427 method_8401() {
      return this.L;
   }

   @Nullable
   public class00917 R() {
      return this.s;
   }

   @Override
   public class03106 method_54719() {
      return this.P;
   }

   @Override
   public class03556<class00780> method_22387(int var1, int var2, int var3) {
      return this.method_30349().L(class04227.NA).y(class00795.y);
   }

   @Override
   public int method_8615() {
      return this.Q;
   }

   @Override
   public void method_8465(
      @Nullable class07049 var1, double var2, double var4, double var6, class03556<class04891> var8, class04911 var9, float var10, float var11, long var12
   ) {
      if (var1 == (class04453)this.T.T_4) {
         this.N(var2, var4, var6, (class04891)var8.N(), var9, var10, var11, false, var12);
      }
   }

   @Override
   public void method_8517(int var1, class07209 var2, int var3) {
      this.W.N(var1, var2, var3);
   }

   @Override
   public void method_8413(class07209 var1, class00500 var2, class00500 var3, int var4) {
      this.W.N(this, var1, var2, var3, var4);
   }

   @Override
   protected class01124<class07049> method_31592() {
      return this.U.N();
   }

   @Override
   public void method_8449(@Nullable class07049 var1, class07049 var2, class03556<class04891> var3, class04911 var4, float var5, float var6, long var7) {
      if (var1 == (class04453)this.T.T_4) {
         this.T.Nr().N((class00044)(new class00013((class04891)var3.N(), var4, var5, var6, var2, var7)));
      }
   }

   @Override
   public void method_8444(@Nullable class07049 var1, int var2, class07209 var3, int var4) {
      try {
         this.m.y(var2, var3, var4);
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Playing level event");
         class07074 class07074 = class07080.N("Level event being played");
         class07074.N("Block coordinates", class07074.N(this, var3));
         class07074.N("Event source", var1);
         class07074.N("Event type", var2);
         class07074.N("Event data", var4);
         throw new class07878(class07080);
      }
   }

   @Override
   public void method_8454(
      @Nullable class07049 var1,
      @Nullable class07072 var2,
      @Nullable class01284 var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      class07328 var12,
      class07126 var13,
      class07126 var14,
      class04540<class00931> var15,
      class03556<class04891> var16
   ) {
   }

   @Override
   public void method_8474(int var1, class07209 var2, int var3) {
      this.m.N(var1, var2, var3);
   }

   @Nullable
   @Override
   public class07769 method_17891(class02265 var1) {
      return this.b.get(var1);
   }

   @Nullable
   @Override
   public class07049 method_8469(int var1) {
      return this.method_31592().N(var1);
   }

   @Override
   public void method_27873(class05042 var1) {
      this.field_9232.N(this.method_74891(var1));
   }

   @Override
   public class07074 method_8538(class07080 var1) {
      class07074 class07074 = super.method_8538(var1);
      class07074.N("Server brand", () -> ((class01683)((class04453)this.T.T_4).y_0).V());
      class07074.N("Server type", () -> this.T.Na() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      class07074.N("Tracked entity count", () -> String.valueOf(this.z()));
      return class07074;
   }

   @Override
   public float method_24852(class07211 var1, boolean var2) {
      var2 = this.y(var2);
      class07334 class07334 = this.method_8597().P();
      if (!var2) {
         return class07334 == class07334.field_64381 ? 0.9F : 1.0F;
      } else {
         return switch (var1) {
            case field_11033 -> class07334 == class07334.field_64381 ? 0.9F : 0.5F;
            case field_11036 -> class07334 == class07334.field_64381 ? 0.9F : 1.0F;
            case field_11043, field_11035 -> 0.8F;
            case field_11039, field_11034 -> 0.6F;
         };
      }
   }

   @Override
   public String method_31419() {
      return "Chunks[C] W: " + this.n.N() + " E: " + this.U.L();
   }

   @Override
   public class04298<class00891> method_8397() {
      return class04295.y();
   }

   @Override
   public class06511 method_59547() {
      return this.E.d();
   }

   @Override
   public class00272 method_8433() {
      return this.E.R();
   }

   @Override
   public class03767 method_45162() {
      return this.E.G();
   }

   @Override
   public void method_71970(class00394 var1) {
      class03358 class03358 = this.T.K().N(var1);
      if (class03358 != null && class03358.t_()) {
         this.d.add(var1);
      }
   }

   @Override
   public class02755 method_61269() {
      return this.E.w();
   }

   @Override
   public class04298<class04651> method_8405() {
      return class04295.y();
   }

   @Override
   public boolean method_30092(class07209 var1, class00500 var2, int var3, int var4) {
      if (this.l.method_41943()) {
         class00500 class00500 = this.method_8320(var1);
         boolean flag = super.method_30092(var1, var2, var3, var4);
         if (flag) {
            this.l.method_41941(var1, class00500, (class04453)this.T.T_4);
         }

         return flag;
      } else {
         return super.method_30092(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_16109(class07209 var1, class00500 var2, class00500 var3) {
      this.W.N(var1, var2, var3);
   }

   @Override
   public void method_67392(class04891 var1, class04911 var2, float var3, float var4) {
      if ((class04453)this.T.T_4 != null) {
         this.T.Nr().N((class00044)(new class00013(var1, var2, var3, var4, (class04453)this.T.T_4, this.field_9229.B())));
      }
   }

   @Override
   public void method_8486(double var1, double var3, double var5, class04891 var7, class04911 var8, float var9, float var10, boolean var11) {
      this.N(var1, var3, var5, var7, var8, var9, var10, var11, this.field_9229.B());
   }

   @Override
   public void method_55116(class07049 var1, class04891 var2, class04911 var3, float var4, float var5) {
      this.T.Nr().N((class00044)(new class00013(var2, var3, var4, var5, var1, this.field_9229.B())));
   }

   @Override
   public void method_31595(class07209 var1, class00500 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (!var2.P() && var2.g()) {
            class00494 class00494 = var2.R(this, var1);
            double d0 = 0.25;
            class00494.method_1089(
               (var3x, var5, var7, var9, var11, var13) -> {
                  double d0x = Math.min(1.0, var9 - var3x);
                  double d1 = Math.min(1.0, var11 - var5);
                  double d2 = Math.min(1.0, var13 - var7);
                  int ix = Math.max(2, class04995.L(d0x / 0.25));
                  int jx = Math.max(2, class04995.L(d1 / 0.25));
                  int kx = Math.max(2, class04995.L(d2 / 0.25));

                  for (int lx = 0; lx < ix; lx++) {
                     for (int i1 = 0; i1 < jx; i1++) {
                        for (int j1 = 0; j1 < kx; j1++) {
                           double d3 = (lx + 0.5) / ix;
                           double d4 = (i1 + 0.5) / jx;
                           double d5 = (j1 + 0.5) / kx;
                           double d6 = d3 * d0x + var3x;
                           double d7 = d4 * d1 + var5;
                           double d8 = d5 * d2 + var7;
                           ((class04410)this.T.i_0)
                              .N(
                                 new class03989(
                                    this,
                                    var1.method_10263() + d6,
                                    var1.method_10264() + d7,
                                    var1.method_10260() + d8,
                                    d3 - 0.5,
                                    d4 - 0.5,
                                    d5 - 0.5,
                                    var2,
                                    var1
                                 )
                              );
                        }
                     }
                  }
               }
            );
         }
      }
   }

   @Override
   public boolean method_38989(class07049 var1) {
      return var1.method_31476().N(((class04453)this.T.T_4).method_31476()) <= this.G;
   }

   @Override
   public List<class07049> method_66349(class07049 var1, class00734 var2) {
      class04453 class04453 = (class04453)this.T.T_4;
      return class04453 != null && class04453 != var1 && class04453.method_5829().L(var2) && class07042.N(var1).test(class04453)
         ? List.of(class04453)
         : List.of();
   }

   @Override
   public void method_8466(class07126 var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      this.N(var1, var1.method_10295().method_10299() || var2, var3, var4, var6, var8, var10, var12, var14);
   }

   @Override
   public void method_17452(class07126 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.N(var1, var1.method_10295().method_10299() || var2, true, var3, var5, var7, var9, var11, var13);
   }

   @Override
   public void method_8494(class07126 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.N(var1, false, true, var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method_8547(double var1, double var3, double var5, double var7, double var9, double var11, List<class02827> var13) {
      if (var13.isEmpty()) {
         for (int ix = 0; ix < this.field_9229.y(3) + 2; ix++) {
            this.method_8406(class07107.NR, var1, var3, var5, this.field_9229.E() * 0.05, 0.005, this.field_9229.E() * 0.05);
         }
      } else {
         ((class04410)this.T.i_0).N(new class04303(this, var1, var3, var5, var7, var9, var11, (class04410)this.T.i_0, var13));
      }
   }

   @Override
   public void method_8509(int var1) {
      this.j = var1;
   }

   @Override
   public int method_67233(class07209 var1) {
      return class06202.Nq().d().N(this.method_8320(var1), this, var1, 0);
   }

   @Override
   public void method_8522(class00381<?> var1) {
      this.E.N(var1);
   }

   @Override
   public int method_23752(class07209 var1, class03202 var2) {
      return ((class05917)this.N(this.v.get(var2), var1, var2)).N(var1);
   }

   public long sodium$getBiomeZoomSeed() {
      return this.o;
   }

   public class01115 lithium$getEntityManager() {
      return this.U;
   }
}
