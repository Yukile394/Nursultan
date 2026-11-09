package minecraft;

import Nursultan.class09078;
import Nursultan.class09317;
import Nursultan.class10203;
import Nursultan.class10991;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class12027;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.RenderEvent;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.mixin.optimizations.beacon_beam_rendering.LevelRendererAccessor;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices;
import net.caffeinemc.mods.sodium.client.render.viewport.Viewport;
import net.caffeinemc.mods.sodium.client.util.FlawlessFrames;
import net.caffeinemc.mods.sodium.client.world.LevelRendererExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.InvalidateRenderStateCallback;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.AfterBlockOutlineExtraction;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.AfterEntities;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BeforeBlockOutline;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BeforeEntities;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.BeforeTranslucent;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.DebugRender;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.EndExtraction;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.EndMain;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents.StartMain;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.client.rendering.world.WorldExtractionContextImpl;
import net.fabricmc.fabric.impl.client.rendering.world.WorldRenderContextImpl;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.UpdateChecker.BetaInfo;
import net.irisshaders.iris.api.v0.IrisApi;
import net.irisshaders.iris.compat.dh.DHCompat;
import net.irisshaders.iris.fantastic.ParticleRenderingPhase;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.layer.IsOutlineRenderStateShard;
import net.irisshaders.iris.layer.OuterWrappedRenderType;
import net.irisshaders.iris.pathways.HandRenderer;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.shaderpack.properties.ParticleRenderingSettings;
import net.irisshaders.iris.shadows.CullingDataCache;
import net.irisshaders.iris.shadows.frustum.fallback.NonCullingFrustum;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.uniforms.IrisTimeUniforms;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import page.langeweile.ok_zoomer.utils.ZoomUtils;
import page.langeweile.ok_zoomer.zoom.Zoom;

@Environment(EnvType.CLIENT)
public class class03063
   implements class06141,
   AutoCloseable,
   LevelRendererAccessor,
   LevelRendererExtension,
   FabricResourceReloader,
   net.irisshaders.iris.mixin.LevelRendererAccessor,
   CullingDataCache {
   private static final class01894 U = class01894.y("transparency");
   private static final class01894 E = class01894.y("entity_outline");
   public static final int N = 16;
   public static final int y = 8;
   public static final int L = 32;
   private static final int W = 15;
   private static final float m = 0.3F;
   private final class06202 P;
   private final class01781 s;
   private final class03579 T;
   public class01386 u;
   @Nullable
   private class02409 b;
   private final class02416 j;
   private final class02410 v;
   private final class02425 n;
   private final class00987 t;
   public final class01861 i;
   public final class05509 R;
   @Nullable
   private class03448 G;
   private final class01886 l;
   private ObjectArrayList<class03345> d;
   private final ObjectArrayList<class03345> w;
   @Nullable
   private class02959 k;
   private int Y;
   private final Int2ObjectMap<class04755> Q;
   private final Long2ObjectMap<SortedSet<class04755>> O;
   @Nullable
   private class08066 g;
   public final class02437 M;
   private int I;
   private int J;
   private int o;
   private double q;
   private double K;
   private double V;
   private double e;
   private double H;
   @Nullable
   private class03365 c;
   private int X;
   private boolean a;
   @Nullable
   private class01383 p;
   @Nullable
   private class07209 F;
   private int A;
   public final class05932 B;
   public final class04790 Z;
   public final class08133 z;
   @Nullable
   private class08188 f;
   private final class06739 C;
   private class03074 S;
   private final WorldRenderContextImpl x = new WorldRenderContextImpl();
   private final WorldExtractionContextImpl D = new WorldExtractionContextImpl();
   private class01894 h;
   private static final String r = "Lcom/mojang/blaze3d/systems/RenderSystem;clear(IZ)V";
   private static final String NN = "Lnet/minecraft/client/renderer/LevelRenderer;renderSky(Lcom/mojang/blaze3d/vertex/PoseStack;Lorg/joml/Matrix4f;FLnet/minecraft/client/Camera;ZLjava/lang/Runnable;)V";
   private static final String Ny = "Lnet/minecraft/client/renderer/LevelRenderer;renderClouds(Lcom/mojang/blaze3d/vertex/PoseStack;Lorg/joml/Matrix4f;FDDD)V";
   private static final String NL = "Lnet/minecraft/client/renderer/LevelRenderer;renderSnowAndRain(Lnet/minecraft/client/renderer/LightTexture;FDDD)V";
   private WorldRenderingPipeline Nu;
   private boolean Ni;
   private boolean NR;
   private static final ObjectArrayList NM = new ObjectArrayList();
   private ObjectArrayList NB = new ObjectArrayList(69696);
   private double NZ;
   private double Nz;
   private double NU;
   private double NE;
   private double NW;
   private static final EnumMap Nm;
   private SodiumWorldRenderer NP;
   private ChunkRenderMatrices Ns;

   public boolean w() {
      return this.NP.isTerrainRenderComplete();
   }

   protected boolean L() {
      return !((class03386)this.P.i_5).R() && this.g != null && (class04453)this.P.T_4 != null;
   }

   private void L(CallbackInfo var1) {
      ((DebugRender)WorldRenderEvents.BEFORE_DEBUG_RENDER.invoker()).beforeDebugRender(this.x);
   }

   private void L(CallbackInfoReturnable var1) {
      class08066 class08066 = class09078.N();
      if (class08066 != null) {
         var1.setReturnValue(class08066);
      }
   }

   private void L(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
         class01421 class01421 = new class01421();
         class01421.N(var5);
         ibaritone.getGameEventHandler().onRenderPass(new RenderEvent(var2.N(false), class01421, var6));
      }
   }

   private class01383 L(class01383 var1) {
      this.D.setFrustum(var1);
      return var1;
   }

   private void L(class05363 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("populateSectionsToCompile");
      class03176 class03176 = new class03176();
      class07209 class07209 = var1.u();
      ArrayList arraylist = Lists.newArrayList();
      long ix = class04995.N(((class05630)this.P.i_7).b().method_41753() * 1000.0);
      ObjectListIterator<class03345> objectlistiterator = this.d.iterator();

      while (objectlistiterator.hasNext()) {
         class03345 class03345x = (class03345)objectlistiterator.next();
         if (class03345x.Z() && (class03345x.u() != class08777.N || class03345x.y())) {
            boolean flag = class01296.N(class03345x.M()).U().method_10262(class07209) < 768.0;
            boolean flag1 = false;
            if (((class05630)this.P.i_7).j().method_41753() == class01825.field_34790) {
               flag1 = flag || class03345x.z();
            } else if (((class05630)this.P.i_7).j().method_41753() == class01825.field_34789) {
               flag1 = class03345x.z();
            }

            if (!flag && !class03345x.N()) {
               class03345x.y(ix);
            } else {
               class03345x.y(0L);
            }

            class03345x.N(false);
            if (flag1) {
               class04643.N("compileSectionSynchronously");
               this.c.N(class03345x, class03176);
               class03345x.B();
               class04643.L();
            } else {
               arraylist.add(class03345x);
            }
         }
      }

      class04643.y("uploadSectionMeshes");
      this.c.N();
      class04643.y("scheduleAsyncCompile");

      for (class03345 class03345 : arraylist) {
         class03345.y(class03176);
         class03345.B();
      }

      class04643.y("scheduleTranslucentResort");
      this.N(var1.y());
      class04643.L();
   }

   public double M() {
      return this.X;
   }

   private static void M(CallbackInfo var0) {
      Iris.getPipelineManager().getPipeline().ifPresent(var0x -> var0x.setPhase(WorldRenderingPhase.CUSTOM_SKY));
   }

   private void M(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      this.Nu.renderShadows(this, var4, this.B.N);
   }

   private void P(CallbackInfo var1) {
      this.Nu.setPhase(WorldRenderingPhase.NONE);
   }

   @Nullable
   public class08066 P() {
      return this.M.E != null ? this.M.E.get() : null;
   }

   private FilterMode K() {
      return SodiumClientMod.options().quality.pixelFilteringMode;
   }

   @Nullable
   public class08066 T() {
      return this.M.m != null ? this.M.m.get() : null;
   }

   private void T(CallbackInfo var1) {
      this.J();
   }

   private void Q() {
      this.d.clear();
      this.w.clear();
   }

   public class03063(class06202 var1, class01781 var2, class03579 var3, class01386 var4, class05932 var5, class08133 var6) {
      super();
      this.j = new class02416();
      this.v = new class02410();
      this.n = new class02425();
      this.t = new class00987();
      this.i = new class01861();
      this.R = new class05509();
      this.l = new class01886();
      this.d = new ObjectArrayList(10000);
      this.w = new ObjectArrayList(50);
      this.Q = new Int2ObjectOpenHashMap();
      this.O = new Long2ObjectOpenHashMap();
      this.M = new class02437();
      this.I = Integer.MIN_VALUE;
      this.J = Integer.MIN_VALUE;
      this.o = Integer.MIN_VALUE;
      this.q = Double.MIN_VALUE;
      this.K = Double.MIN_VALUE;
      this.V = Double.MIN_VALUE;
      this.e = Double.MIN_VALUE;
      this.H = Double.MIN_VALUE;
      this.X = -1;
      this.C = new class06739();
      this.S = new class03074(new class06732(), new class06732());
      this.P = var1;
      this.s = var2;
      this.T = var3;
      this.u = var4;
      this.Z = var6.L();
      this.B = var5;
      this.z = var6;
      this.N(var1, var2, var3, var4, var5, var6, null);
   }

   private void B(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      class09317.N().N(var6, var5, var2);
   }

   public void B() {
      if (this.f != null) {
         this.f.close();
      }

      this.f = null;
   }

   private static void B(CallbackInfo var0) {
      Iris.getPipelineManager().getPipeline().ifPresent(var0x -> var0x.setPhase(WorldRenderingPhase.NONE));
   }

   private void J() {
      class05630 class05630 = (class05630)class06202.Nq().i_7;
      if (Iris.getIrisConfig().areShadersEnabled()) {
         if (class05630.s().method_41753()) {
            class05630.s().method_41748(false);
            class05630.Z().method_41748(class01241.field_63461);
         }
      }
   }

   private void Z(CallbackInfo var1) {
      this.Nu.setPhase(WorldRenderingPhase.CLOUDS);
   }

   private void Z(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      if (class06202.C()) {
         class11925.L(this.P.e());
      }
   }

   @Nullable
   public String Z() {
      return this.G == null ? null : "E: " + this.B.y.size() + "/" + this.G.z() + ", SD: " + this.G.P();
   }

   private void i(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      DHCompat.checkFrame();
      IrisTimeUniforms.updateTime();
      CapturedRenderingState.INSTANCE.setGbufferModelView(var5);
      CapturedRenderingState.INSTANCE.setGbufferProjection(var6);
      float fx = var2.N(false);
      CapturedRenderingState.INSTANCE.setTickDelta(fx);
      if (this.j.getTexture() != null) {
         CapturedRenderingState.INSTANCE.setCloudTime(((float)(this.G.N() % (this.j.getTexture().y() * 400)) + fx) * 0.03F);
      } else {
         CapturedRenderingState.INSTANCE.setCloudTime(0.0F);
      }

      this.Nu = Iris.getPipelineManager().preparePipeline(Iris.getCurrentDimension());
      this.NR = this.Nu.shouldDisableFrustumCulling();
      this.Nu.beginLevelRendering();
      this.Nu.setPhase(WorldRenderingPhase.NONE);
      IrisRenderSystem.backupAndDisableCullingState(this.Nu.shouldDisableOcclusionCulling());
      if (Iris.shouldActivateWireframe() && this.P.q()) {
         IrisRenderSystem.setPolygonMode(6913);
      }
   }

   @Nullable
   public class03365 i() {
      return this.c;
   }

   private void i(CallbackInfo var1) {
      ((EndMain)WorldRenderEvents.END_MAIN.invoker()).endMain(this.x);
   }

   private void b(CallbackInfo var1) {
      this.J();
   }

   @Nullable
   public class08066 b() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.L(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class08066)callbackinforeturnable.getReturnValue();
      } else {
         return this.M.P != null ? this.M.P.get() : null;
      }
   }

   @Nullable
   public class08066 s() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class08066)callbackinforeturnable.getReturnValue();
      } else {
         return this.M.W != null ? this.M.W.get() : null;
      }
   }

   private static void s(CallbackInfo var0) {
      if (Iris.getCurrentPack().isEmpty()) {
         class05363 class05363 = ((class03386)class06202.Nq().i_5).s();
         class06889 class06889 = class05363.y();
         class07049 class07049 = class05363.B();
         boolean flag = class05363.W() != class04798.field_27888;
         boolean flag1 = ((class03063)class06202.Nq().B_2).invokeDoesMobEffectBlockSky(class05363);
         boolean flag2 = ((class01056)class06202.Nq().i_6).U().u();
         if (flag || flag1 || flag2) {
            var0.cancel();
         }
      }
   }

   public class01886 n() {
      return this.l;
   }

   public class06734 l() {
      return class06724.N(this.C);
   }

   public int d() {
      return this.NP.getVisibleChunkCount();
   }

   @Nullable
   public class08066 m() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class08066)callbackinforeturnable.getReturnValue();
      } else {
         return this.M.T != null ? this.M.T.get() : null;
      }
   }

   private void m(CallbackInfo var1) {
      this.Nu.setPhase(WorldRenderingPhase.DEBUG);
   }

   private void o() {
      ObjectArrayList<class03345> objectarraylist = this.d;
      this.d = this.NB;
      this.NB = objectarraylist;
      double d0 = this.e;
      this.e = this.NE;
      this.NE = d0;
      d0 = this.H;
      this.H = this.NW;
      this.NW = d0;
   }

   public String k() {
      return this.NP.getChunksDebugString();
   }

   @Nullable
   public class01383 t() {
      return this.p;
   }

   private void g() {
      class06732 class06732x = new class06732();
      class06732 class06732x = new class06732();
      this.C.N(this.P.z());
      class08337 class08337 = this.P.Na();
      if (class08337 != null) {
         this.C.N(class08337.G());
      }

      long ix = class07536.L();

      for (class06748 class06748 : this.C.N()) {
         class06748.i().N(class06748.L() ? class06732x : class06732x, class06748.N(ix));
      }

      this.S = new class03074(class06732x, class06732x);
   }

   public ObjectArrayList<class03345> v() {
      return this.d;
   }

   private void v(CallbackInfo var1) {
      RenderDevice.enterManagedCode();

      try {
         this.NP.reload();
      } finally {
         RenderDevice.exitManagedCode();
      }
   }

   @Nullable
   public class08066 j() {
      return this.M.s != null ? this.M.s.get() : null;
   }

   private void j(CallbackInfo var1) {
      this.NP.scheduleTerrainUpdate();
   }

   private ParticleRenderingSettings q() {
      return Iris.getPipelineManager()
         .getPipeline()
         .<ParticleRenderingSettings>map(WorldRenderingPipeline::getParticleRenderingSettings)
         .orElse(ParticleRenderingSettings.MIXED);
   }

   private void U(CallbackInfo var1) {
      this.Nu.setPhase(WorldRenderingPhase.RAIN_SNOW);
   }

   public void U() {
      this.a = true;
   }

   @Override
   public void close() {
      if (this.g != null) {
         this.g.N();
      }

      if (this.b != null) {
         this.b.close();
      }

      if (this.f != null) {
         this.f.close();
      }

      this.j.close();
   }

   public void z() {
      this.j.y();
   }

   private void z(CallbackInfo var1) {
      this.Nu.setPhase(WorldRenderingPhase.NONE);
   }

   private void z(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      this.Ns = new ChunkRenderMatrices(var6, var5);
      this.NP.updateFogColor(var9);
   }

   public void u() {
      this.R(null);
      this.b(null);
      if (this.G == null) {
         this.v(null);
      } else {
         this.G.Z();
         if (this.c == null) {
            this.c = new class03365(this.G, this, class07536.B(), this.u, this.P.yU(), this.P.K());
         } else {
            this.c.N(this.G);
         }

         this.j.N();
         class05885.N(((class05630)this.P.i_7).m().method_41753());
         class07131.N(((class05630)this.P.i_7).m().method_41753());
         this.X = ((class05630)this.P.i_7).Nh();
         if (this.k != null) {
            this.k.N();
         }

         this.c.y();
         class05630 class05630 = (class05630)this.P.i_7;
         this.k = new class02959(this.c, this.G, this.N(class05630), this);
         this.l.N(this.k);
         this.Q();
         class05363 class05363 = ((class03386)this.P.i_5).s();
         this.k.N(class01296.N(class05363.y()));
         this.v(null);
      }
   }

   private void u(CallbackInfo var1) {
      ((BeforeTranslucent)WorldRenderEvents.BEFORE_TRANSLUCENT.invoker()).beforeTranslucent(this.x);
   }

   private void u(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      this.D.prepare((class03386)this.P.i_5, this, this.B, this.G, var2, var3, var4, var5, var7);
   }

   private void y(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      ImmediateState.isRenderingLevel = false;
   }

   private void y(class02734 var1, GpuBufferSlice var2) {
      int ix = ((class05630)this.P.i_7).Nh() * 16;
      float fx = ((class03386)this.P.i_5).E();
      class02725 class02725 = var1.N("weather");
      if (this.M.P != null) {
         this.M.P = class02725.y(this.M.P);
      } else {
         this.M.U = class02725.y(this.M.U);
      }

      class02725.N(() -> {
         this.U(null);
         RenderSystem.setShaderFog(var2);
         class01422 class01422 = this.u.L();
         class06959 class06959 = this.B.N;
         this.n.N(class01422, class06959.y, this.B.M);
         class02410 class02410 = this.v;
         class06969 class06969 = this.B.B;
         class06889 class06889 = class06959.y;
         double d0 = ix;
         double d1 = fx;
         this.E(null);
         class02410.N(class06969, class06889, d0, d1);
         class01422.u();
         this.W(null);
      });
   }

   private boolean y(boolean var1) {
      return var1 || class11938.u().NR().U();
   }

   private void y(CallbackInfoReturnable var1) {
      class08066 class08066 = class09078.N();
      if (class08066 != null) {
         var1.setReturnValue(class08066);
      }
   }

   public void y() {
      if (this.L()) {
         this.g.N(this.P.e().u());
      }
   }

   private void y(class08133 var1, Operation var2) {
      ParticleRenderingSettings particlerenderingsettings = this.q();
      this.z
         .getParticleFeatureRenderer()
         .setParticleRenderingPhase(
            particlerenderingsettings == ParticleRenderingSettings.AFTER ? ParticleRenderingPhase.EVERYTHING : ParticleRenderingPhase.TRANSLUCENT
         );
      var2.call(new Object[]{var1});
      this.z.getParticleFeatureRenderer().setParticleRenderingPhase(ParticleRenderingPhase.EVERYTHING);
   }

   private class01421 y(class01421 var1) {
      this.x.setMatrixStack(var1);
      return var1;
   }

   public void y(int var1, int var2, int var3) {
      this.NP.scheduleRebuildForChunks(var1 - 1, var2 - 1, var3 - 1, var1 + 1, var2 + 1, var3 + 1, false);
   }

   private void y(CallbackInfo var1) {
      ((BeforeEntities)WorldRenderEvents.BEFORE_ENTITIES.invoker()).beforeEntities(this.x);
   }

   public void y(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.NP.scheduleRebuildForBlockArea(var1, var2, var3, var4, var5, var6, false);
   }

   private void y(class05363 var1, class05932 var2) {
      var2.i = null;
      class07089 class07089 = (class07089)this.P.M_3;
      if (class07089 instanceof class06183 class06183) {
         if (class06183.N() == class07113.field_1333) {
            this.N(var1, var2, null);
         } else {
            class07209 class07209 = class06183.u();
            class00500 class00500 = this.G.method_8320(class07209);
            if (!class00500.P() && this.G.method_8621().N(class07209)) {
               boolean flag = class05885.N(class00500).u();
               boolean flag1 = ((class05630)this.P.i_7).Y().method_41753();
               class06092 class06092 = class06092.N(var1.B());
               class00494 class00494xxx = class00500.N(this.G, class07209, class06092);
               if (class07529.Q) {
                  class00494 class00494x = class00500.y(this.G, class07209, class06092);
                  class00494 class00494xx = class00500.U();
                  class00494 class00494xxx = class00500.Z(this.G, class07209);
                  var2.i = new class06973(class07209, flag, flag1, class00494xxx, class00494x, class00494xx, class00494xxx);
               } else {
                  var2.i = new class06973(class07209, flag, flag1, class00494xxx);
               }
            }

            this.N(var1, var2, null);
         }
      } else {
         this.N(var1, var2, null);
      }
   }

   private boolean y(class05363 var1) {
      return !(var1.B() instanceof class07438 class07438) ? false : class07438.method_6059(class07047.P) || class07438.method_6059(class07047.J);
   }

   private void y(class01383 var1) {
      if (!class06202.Nq().E_()) {
         throw new IllegalStateException("applyFrustum called from wrong thread: " + Thread.currentThread().getName());
      } else {
         this.Q();
         this.l.N(var1, this.d, this.w);
      }
   }

   public void E() {
      this.p = null;
   }

   private void E(CallbackInfo var1) {
      this.Nu.setPhase(WorldRenderingPhase.WORLD_BORDER);
   }

   private void N(class02734 var1, GpuBufferSlice var2, CallbackInfo var3) {
      if (this.q() == ParticleRenderingSettings.BEFORE) {
         var3.cancel();
      }
   }

   private void N(CallbackInfo var1, Matrix4f var2) {
      this.Nu.beginHand();
      HandRenderer.INSTANCE.renderSolid(var2, class06202.Nq().NK().N(true), ((class03386)class06202.Nq().i_5).s(), (class03386)class06202.Nq().i_5, this.Nu);
      class08700.N().y("iris_pre_translucent");
      this.Nu.beginTranslucents();
   }

   public static class01383 N(class01383 var0) {
      return new class01383(var0).method_38557(8);
   }

   private boolean N(class03063 var1, class05363 var2, class01383 var3, boolean var4) {
      WorldRenderingPipeline worldrenderingpipeline = Iris.getPipelineManager().getPipelineNullable();
      return worldrenderingpipeline instanceof IrisRenderingPipeline ? !((IrisRenderingPipeline)worldrenderingpipeline).skipAllRendering() : true;
   }

   private Iterable N(class03448 var1, Operation var2) {
      WorldRenderingPipeline worldrenderingpipeline = Iris.getPipelineManager().getPipelineNullable();
      return (Iterable)(worldrenderingpipeline instanceof IrisRenderingPipeline && ((IrisRenderingPipeline)worldrenderingpipeline).skipAllRendering()
         ? Collections.emptyList()
         : (Iterable)var2.call(new Object[]{var1}));
   }

   private boolean N(class08760 var1, class08768 var2, class08188 var3) {
      WorldRenderingPipeline worldrenderingpipeline = Iris.getPipelineManager().getPipelineNullable();
      return worldrenderingpipeline instanceof IrisRenderingPipeline ? !((IrisRenderingPipeline)worldrenderingpipeline).skipAllRendering() : true;
   }

   private void N(class08133 var1, Operation var2) {
      ParticleRenderingSettings particlerenderingsettings = this.q();
      if (particlerenderingsettings == ParticleRenderingSettings.AFTER) {
         var2.call(new Object[]{var1});
      } else {
         this.t.N(this.Z, this.B.N);
         this.z
            .getParticleFeatureRenderer()
            .setParticleRenderingPhase(
               particlerenderingsettings == ParticleRenderingSettings.BEFORE ? ParticleRenderingPhase.EVERYTHING : ParticleRenderingPhase.OPAQUE
            );
         var2.call(new Object[]{var1});
         this.z.getParticleFeatureRenderer().setParticleRenderingPhase(ParticleRenderingPhase.EVERYTHING);
         if (particlerenderingsettings == ParticleRenderingSettings.BEFORE) {
            this.t.N();
         }
      }
   }

   private void N(
      class02734 var1,
      class01383 var2,
      Matrix4f var3,
      GpuBufferSlice var4,
      boolean var5,
      class05932 var6,
      class02233 var7,
      class04643 var8,
      CallbackInfo var9,
      class02725 var10
   ) {
      if (this.q() == ParticleRenderingSettings.BEFORE && this.M.m != null) {
         this.M.m = var10.y(this.M.m);
      }
   }

   private void N(CommandEncoder var1, GpuTexture var2, double var3, Operation var5) {
      if (!IrisApi.getInstance().isShaderPackInUse()) {
         var5.call(new Object[]{var1, var2, var3});
      }
   }

   private void N(class05363 var1, float var2, class05932 var3, CallbackInfo var4) {
      var4.cancel();
      this.NP.extractBlockEntities(var1, var2, this.O, var3);
   }

   public boolean N(class07209 var1) {
      return this.NP.isSectionReady(var1.method_10263() >> 4, var1.method_10264() >> 4, var1.method_10260() >> 4);
   }

   private void N(int var1, int var2, int var3, boolean var4) {
      this.NP.scheduleRebuildForChunk(var1, var2, var3, var4);
   }

   private void N(class07209 var1, boolean var2) {
      this.NP
         .scheduleRebuildForBlockArea(
            var1.method_10263() - 1,
            var1.method_10264() - 1,
            var1.method_10260() - 1,
            var1.method_10263() + 1,
            var1.method_10264() + 1,
            var1.method_10260() + 1,
            var2
         );
   }

   private void N(class05363 var1, class01383 var2, boolean var3) {
      Viewport viewport = var2.sodium$createViewport();
      boolean flag = FlawlessFrames.isActive();
      int ix = class01296.N(var1.y().N());
      int jx = class01296.N(var1.y().y());
      int kx = class01296.N(var1.y().L());
      if (this.I != ix || this.J != jx || this.o != kx) {
         this.I = ix;
         this.J = jx;
         this.o = kx;
         this.v.N();
      }

      RenderDevice.enterManagedCode();

      try {
         this.NP.setupTerrain(var1, viewport, ((class03386)this.P.i_5).sodium$getFogParameters(), var3, flag, this.Ns);
      } finally {
         RenderDevice.exitManagedCode();
      }

      this.N(var1, var2, var3, null);
   }

   private class08760 N(Matrix4fc var1, double var2, double var4, double var6) {
      class08760 class08760 = new class08760(this.P.NO().y(class08626.N).method_71659(), Nm, -1, new GpuBufferSlice[0]);
      class08760.sodium$setRendering(this.NP, this.Ns, var2, var4, var6);
      return class08760;
   }

   private void N(class01422 var1, class01421 var2, boolean var3, class05932 var4, CallbackInfo var5) {
      if (!((BeforeBlockOutline)WorldRenderEvents.BEFORE_BLOCK_OUTLINE.invoker()).beforeBlockOutline(this.x, this.x.worldState().i)) {
         var1.L();
         var5.cancel();
      }
   }

   public void N() {
      if (this.g != null) {
         this.g.N();
      }

      this.g = new class10203("Entity Outline", this.P.Nt().U(), this.P.Nt().E(), true);
   }

   private void N(class05363 var1, class01383 var2, boolean var3, CallbackInfo var4) {
   }

   private void N(class02416 var1, int var2, class01301 var3, float var4, class06889 var5, long var6, float var8) {
      var1.N(var2, var3, SodiumExtraClientMod.options().extraSettings.cloudHeight, var5, var6, var8);
   }

   public void N(Consumer var1, CallbackInfo var2) {
      var2.cancel();
      this.NP.iterateVisibleBlockEntities(var1);
   }

   private void N(CallbackInfoReturnable var1) {
      class08066 class08066 = class09078.N();
      if (class08066 != null) {
         var1.setReturnValue(class08066);
      }
   }

   public void N(int var1, int var2) {
      this.W();
      if (this.g != null) {
         this.g.N(var1, var2);
      }
   }

   private void N(
      GpuBufferSlice var1,
      class05932 var2,
      class04643 var3,
      Matrix4f var4,
      class02452 var5,
      class02452 var6,
      boolean var7,
      class02452 var8,
      class02452 var9,
      CallbackInfo var10
   ) {
      if (class06202.C()) {
         class11925.u((class08066)var5.get());
      }
   }

   private void N(class02734 var1, class05363 var2, GpuBufferSlice var3, CallbackInfo var4) {
      if (class11938.u().NR().U()) {
         class02725 class02725 = var1.N("sky");
         this.M.U = class02725.y(this.M.U);
         class02725.N(() -> {
            RenderSystem.setShaderFog(var3);

            try (class12027 class12027 = class12027.y()) {
               class11938.L().L(class09317.N());
            }
         });
         var4.cancel();
      }
   }

   private boolean N(class04453 var1) {
      class10991 class10991 = class10991.y(var1.method_7325());
      class11938.L().L(class10991);
      return class10991.N();
   }

   private void N(class00987 var1, class04790 var2, class06959 var3) {
      if (this.q() == ParticleRenderingSettings.MIXED) {
         var1.submitWithoutItems(var2, var3);
      } else {
         var1.N(var2, var3);
      }
   }

   public void N(@Nullable class03448 var1) {
      this.I = Integer.MIN_VALUE;
      this.J = Integer.MIN_VALUE;
      this.o = Integer.MIN_VALUE;
      this.G = var1;
      if (var1 != null) {
         this.u();
      } else {
         this.s.N();
         if (this.k != null) {
            this.k.N();
            this.k = null;
         }

         if (this.c != null) {
            this.c.u();
         }

         this.c = null;
         this.l.N(null);
         this.Q();
      }

      this.R.N();
      this.N(var1, null);
   }

   private void N(class03448 var1, CallbackInfo var2) {
      RenderDevice.enterManagedCode();

      try {
         this.NP.setLevel(var1);
      } finally {
         RenderDevice.exitManagedCode();
      }
   }

   private void N(class06202 var1, class01781 var2, class03579 var3, class01386 var4, class05932 var5, class08133 var6, CallbackInfo var7) {
      this.NP = new SodiumWorldRenderer(var1);
   }

   private int N(class05630 var1) {
      return 0;
   }

   private double N(double var1) {
      return !ZoomUtils.canSeeDistantEntities() ? var1 : var1 * Math.max(1.0, Zoom.isZooming() ? Zoom.getZoomDivisor() : 1.0);
   }

   public static int N(class03082 var0, class07295 var1, class00500 var2, class07209 var3) {
      if (var2.y(var1, var3)) {
         return 15728880;
      } else {
         int ix = var0.packedBrightness(var1, var3);
         int jx = class03042.N(ix);
         int kx = var2.m();
         if (jx < kx) {
            int lx = class03042.y(ix);
            return class03042.N(kx, lx);
         } else {
            return ix;
         }
      }
   }

   private void N(class05363 var1, float var2, class05932 var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class06889 class06889 = var1.y();
         double d0 = class06889.N();
         double d1 = class06889.y();
         double d2 = class06889.L();
         class01421 class01421 = new class01421();
         ObjectListIterator objectlistiterator = this.d.iterator();

         while (objectlistiterator.hasNext()) {
            class03345 class03345 = (class03345)objectlistiterator.next();
            List<class00394> list = class03345.u().y();
            if (!list.isEmpty() && !(class03345.N(class07536.L()) < 0.3F)) {
               for (class00394 class00394x : list) {
                  class07209 class07209 = class00394x.d();
                  SortedSet<class04755> sortedset = (SortedSet<class04755>)this.O.get(class07209.method_10063());
                  class08141 class08141;
                  if (sortedset != null && !sortedset.isEmpty()) {
                     class01421.N();
                     class01421.N(class07209.method_10263() - d0, class07209.method_10264() - d1, class07209.method_10260() - d2);
                     class08141 = new class08141(sortedset.last().L(), class01421.L());
                     class01421.y();
                  } else {
                     class08141 = null;
                  }

                  class00985 class00985x = this.T.N(class00394x, var2, class08141);
                  if (class00985x != null) {
                     var3.L.add(class00985x);
                  }
               }
            }
         }

         Iterator iterator = this.G.L().iterator();

         while (iterator.hasNext()) {
            class00394 class00394 = (class00394)iterator.next();
            if (class00394.k()) {
               iterator.remove();
            } else {
               class00985 class00985 = this.T.N(class00394, var2, null);
               if (class00985 != null) {
                  var3.L.add(class00985);
               }
            }
         }
      }
   }

   private void N(class01421 var1, class05932 var2, class01237 var3) {
      class06889 class06889 = var2.N.y;
      double d0 = class06889.N();
      double d1 = class06889.y();
      double d2 = class06889.L();

      for (class08800 class08800 : var2.y) {
         if (!var2.u) {
            class08800.l = 0;
         }

         this.s.N(class08800, var2.N, class08800.E - d0, class08800.W - d1, class08800.m - d2, var1, var3);
      }
   }

   private void N(class01421 var1, class01422 var2, class05932 var3) {
      class06889 class06889 = var3.N.y;
      double d0 = class06889.N();
      double d1 = class06889.y();
      double d2 = class06889.L();

      for (class06964 class06964 : var3.R) {
         var1.N();
         class07209 class07209 = class06964.y;
         var1.N(class07209.method_10263() - d0, class07209.method_10264() - d1, class07209.method_10260() - d2);
         class01423 class01423 = var1.L();
         class01390 class01390 = new class01390(var2.method_73477(class08874.m.get(class06964.R)), class01423, 1.0F);
         this.P.yU().N(class06964.L, class07209, class06964, var1, class01390);
         var1.y();
      }
   }

   public void N(long var1) {
      class03345 class03345 = this.k.N(var1);
      if (class03345 != null) {
         this.l.N(class03345);
         class03345.N(true);
      }
   }

   public void N(int var1, class07209 var2, int var3) {
      if (var3 >= 0 && var3 < 10) {
         class04755 class04755 = (class04755)this.Q.get(var1);
         if (class04755 != null) {
            this.N(class04755);
         }

         if (class04755 == null
            || class04755.y().method_10263() != var2.method_10263()
            || class04755.y().method_10264() != var2.method_10264()
            || class04755.y().method_10260() != var2.method_10260()) {
            class04755 = new class04755(var1, var2);
            this.Q.put(var1, class04755);
         }

         class04755.N(var3);
         class04755.y(this.Y);
         ((SortedSet)this.O.computeIfAbsent(class04755.y().method_10063(), var0 -> Sets.newTreeSet())).add(class04755);
      } else {
         class04755 class04755x = (class04755)this.Q.remove(var1);
         if (class04755x != null) {
            this.N(class04755x);
         }
      }
   }

   public void N(class07321 var1) {
      this.l.N(var1);
   }

   public static int N(class07295 var0, class07209 var1) {
      return N(class03082.N, var0, var0.method_8320(var1), var1);
   }

   private void N(class06889 var1) {
      if (!this.d.isEmpty()) {
         class07209 class07209 = class07209.method_49638(var1);
         boolean flag = !class07209.equals(this.F);
         class08728 class08728 = new class08728();
         ObjectListIterator<class03345> objectlistiterator = this.w.iterator();

         while (objectlistiterator.hasNext()) {
            class03345 class03345 = (class03345)objectlistiterator.next();
            this.N(class03345, class08728, var1, flag, true);
         }

         this.A = this.A % this.d.size();
         int ix = Math.max(this.d.size() / 8, 15);

         while (ix-- > 0) {
            int jx = this.A++ % this.d.size();
            this.N((class03345)this.d.get(jx), class08728, var1, flag, false);
         }

         this.F = class07209;
      }
   }

   private void N(class03345 var1, class08728 var2, class06889 var3, boolean var4, boolean var5) {
      var2.y(var3, var1.M());
      boolean flag = var1.u().y(var2);
      if ((var4 && (var2.N() || var5) || flag) && !var1.E() && var1.U()) {
         var1.N(this.c);
      }
   }

   public void N(class05363 var1) {
      if (this.G.method_54719().Z()) {
         this.Y++;
      }

      this.n.N(this.G, var1, this.Y, ((class05630)this.P.i_7).NK().method_41753(), ((class05630)this.P.i_7).W().method_41753());
      this.O();
   }

   private void N(class04755 var1) {
      long ix = var1.y().method_10063();
      Set<class04755> set = (Set<class04755>)this.O.get(ix);
      set.remove(var1);
      if (set.isEmpty()) {
         this.O.remove(ix);
      }
   }

   private class08800 N(class07049 var1, float var2) {
      return this.s.y(var1, var2);
   }

   private void N(class01421 var1) {
      if (!var1.u()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   private void N(class01422 var1, class01421 var2, boolean var3, class05932 var4) {
      class06973 class06973 = var4.i;
      if (class06973 != null) {
         if (class06973.y() == var3) {
            class06959 class06959 = var4.N;
            CallbackInfo callbackinfo = new CallbackInfo("", true);
            this.N(var1, var2, var3, var4, callbackinfo);
            if (!callbackinfo.isCancelled()) {
               class06889 class06889 = class06959.y;
               if (class06973.L()) {
                  class07311 class07311x = class06851.v();
                  class01391 class01391x = var1.method_73477(this.N(class07311x));
                  this.N(var2, class01391x, class06889.M, class06889.B, class06889.Z, class06973, -16777216, 7.0F);
               }

               class07311 class07311 = class06851.b();
               class01391 class01391 = var1.method_73477(this.N(class07311));
               int ix = class06973.L() ? -11010079 : class02566.z(102);
               this.N(var2, class01391, class06889.M, class06889.B, class06889.Z, class06973, ix, this.P.Nt().t());
               var1.L();
            }
         }
      }
   }

   public void N(class07290 var1, class07209 var2, class00500 var3, class00500 var4, int var5) {
      this.N(var2, (var5 & 8) != 0);
   }

   public void N(class07209 var1, class00500 var2, class00500 var3) {
      if (this.P.D().N(var2, var3)) {
         this.y(var1.method_10263(), var1.method_10264(), var1.method_10260(), var1.method_10263(), var1.method_10264(), var1.method_10260());
      }
   }

   public void N(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int ix = var3; ix <= var6; ix++) {
         for (int jx = var1; jx <= var4; jx++) {
            for (int kx = var2; kx <= var5; kx++) {
               this.N(jx, kx, ix);
            }
         }
      }
   }

   public void N(int var1, int var2, int var3) {
      this.N(var1, var2, var3, false);
   }

   private void N(class01421 var1, class01391 var2, double var3, double var5, double var7, class06973 var9, int var10, float var11) {
      class07209 class07209 = var9.N();
      if (class07529.Q) {
         class02438.N(
            var1,
            var2,
            var9.u(),
            class07209.method_10263() - var3,
            class07209.method_10264() - var5,
            class07209.method_10260() - var7,
            class02566.N(1.0F, 1.0F, 1.0F, 1.0F),
            var11
         );
         if (var9.i() != null) {
            class02438.N(
               var1,
               var2,
               var9.i(),
               class07209.method_10263() - var3,
               class07209.method_10264() - var5,
               class07209.method_10260() - var7,
               class02566.N(0.4F, 0.0F, 0.0F, 0.0F),
               var11
            );
         }

         if (var9.R() != null) {
            class02438.N(
               var1,
               var2,
               var9.R(),
               class07209.method_10263() - var3,
               class07209.method_10264() - var5,
               class07209.method_10260() - var7,
               class02566.N(0.4F, 0.0F, 1.0F, 0.0F),
               var11
            );
         }

         if (var9.M() != null) {
            class02438.N(
               var1,
               var2,
               var9.M(),
               class07209.method_10263() - var3,
               class07209.method_10264() - var5,
               class07209.method_10260() - var7,
               class02566.N(0.4F, 0.0F, 0.0F, 1.0F),
               var11
            );
         }
      } else {
         class02438.N(var1, var2, var9.u(), class07209.method_10263() - var3, class07209.method_10264() - var5, class07209.method_10260() - var7, var10, var11);
      }
   }

   private void N(class01421 var1, class05932 var2, class04790 var3) {
      class06889 class06889 = var2.N.y;
      double d0 = class06889.N();
      double d1 = class06889.y();
      double d2 = class06889.L();

      for (class00985 class00985 : var2.L) {
         class07209 class07209 = class00985.R;
         var1.N();
         var1.N(class07209.method_10263() - d0, class07209.method_10264() - d1, class07209.method_10260() - d2);
         this.T.N(class00985, var1, var3, var2.N);
         var1.y();
      }
   }

   private void N(class02734 var1, class05363 var2, GpuBufferSlice var3) {
      class04798 class04798 = var2.W();
      if (class04798 != class04798.field_27887 && class04798 != class04798.field_27885 && !this.y(var2)) {
         class06971 class06971 = this.B.Z;
         if (class06971.N != class07360.field_64385) {
            class02409 class02409 = this.b;
            if (class02409 != null) {
               CallbackInfo callbackinfo = new CallbackInfo("", true);
               this.N(var1, var2, var3, callbackinfo);
               if (!callbackinfo.isCancelled()) {
                  class02725 class02725 = var1.N("sky");
                  this.M.U = class02725.y(this.M.U);
                  class02725.N(() -> {
                     M(null);
                     CallbackInfo callbackinfox = new CallbackInfo("", true);
                     s(callbackinfox);
                     if (!callbackinfox.isCancelled()) {
                        RenderSystem.setShaderFog(var3);
                        if (class06971.N == class07360.field_64387) {
                           class02409.y();
                           if (class06971.U > 1.0E-5F) {
                              class01421 class01421 = new class01421();
                              class02409.N(class01421, class06971.U, class06971.E, class06971.W);
                           }

                           B(null);
                        } else {
                           class01421 class01421x = new class01421();
                           class02409.N(class06971.z);
                           class02409.N(class01421x, class06971.L, class06971.B);
                           class02409.N(class01421x, class06971.L, class06971.u, class06971.i, class06971.Z, class06971.R, class06971.M);
                           if (class06971.y) {
                              class02409.N();
                           }

                           B(null);
                        }
                     }
                  });
               }
            }
         }
      }
   }

   public void N(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10
   ) {
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
      this.u(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
      this.i(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
      this.B(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
      var10 = this.y(var10);
      float fx = var2.N(false);
      this.B.z = this.G.N();
      this.T.N(var4);
      this.s.N(var4, (class07049)this.P.M_2);
      class04643 class04643 = class08700.N();
      class04643.N("populateLightUpdates");
      this.G.i();
      class04643.y("runLightUpdates");
      this.G.method_8398().L().N();
      class04643.y("prepareCullFrustum");
      class06889 class06889 = var4.y();
      class01383 class01383x = this.L(this.N(var5, var7, class06889));
      this.M(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
      class01383 class01383x = class01383x;
      class04643.y("cullTerrain");
      class04453 class04453 = (class04453)this.P.T_4;
      boolean flag1 = this.N(class04453);
      this.z(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
      boolean flag = flag1;
      if (this.N(this, var4, class01383x, flag)) {
         this.N(var4, class01383x, flag);
      }

      class04643.y("compileSections");
      this.L(var4);
      class04643.y("extract");
      class04643.N("entities");
      this.N(var4, class01383x, var2, this.B);
      class04643.y("blockEntities");
      this.N(var4, fx, this.B);
      class04643.y("blockOutline");
      this.y(var4, this.B);
      class04643.y("blockBreaking");
      this.N(var4, this.B);
      class04643.y("weather");
      this.n.N(this.G, this.Y, fx, class06889, this.B.M);
      class04643.y("sky");
      this.b.N(this.G, fx, var4, this.B.Z);
      class04643.y("border");
      class02410 class02410 = this.v;
      class08057 class08057 = this.G.method_8621();
      double d3 = ((class05630)this.P.i_7).Nh() * 16;
      class06969 class06969 = this.B.B;
      double d0 = d3;
      class08057 class08057x = class08057;
      class02410 class02410x = class02410;
      this.N(
         class02410x,
         class08057x,
         fx,
         class06889,
         d0,
         class06969,
         var0 -> {
            WrapOperationRuntime.checkArgumentCount(
               var0, 6, "[net.minecraft.class_9978, net.minecraft.class_2784, float, net.minecraft.class_243, double, net.minecraft.class_12078]"
            );
            ((class02410)var0[0]).N((class08057)var0[1], (Float)var0[2], (class06889)var0[3], (Double)var0[4], (class06969)var0[5]);
            return (Void)null;
         }
      );
      class04643.L();
      class04643.y("debug");
      class01861 class01861 = this.i;
      double d2 = class06889.M;
      double d1 = class06889.B;
      d3 = class06889.Z;
      float f2 = var2.N(false);
      this.L(null);
      class01861.N(class01383x, d2, d1, d3, f2);
      this.R.y();
      class04643.y("setupFrameGraph");
      Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
      matrix4fstack.pushMatrix();
      matrix4fstack.mul(var5);
      class02734 class02734 = new class02734();
      this.M.U = class02734.N("main", this.P.e());
      int ix = this.P.e().N;
      int jx = this.P.e().y;
      class02456 class02456 = new class02456(ix, jx, true, 0);
      class08086 class08086x = this.Y();
      if (class08086x != null) {
         this.M.E = class02734.N("translucent", class02456);
         this.M.W = class02734.N("item_entity", class02456);
         this.M.m = class02734.N("particles", class02456);
         this.M.P = class02734.N("weather", class02456);
         this.M.s = class02734.N("clouds", class02456);
      }

      if (this.g != null) {
         this.M.T = class02734.N("entity_outline", this.g);
      }

      class02725 class02725 = class02734.N("clear");
      this.M.U = class02725.y(this.M.U);
      class02725.N(
         () -> {
            class08066 class08066 = this.P.e();
            RenderSystem.getDevice()
               .createCommandEncoder()
               .clearColorAndDepthTextures(class08066.L(), class02566.N(0.0F, var9.x, var9.y, var9.z), class08066.i(), 1.0);
         }
      );
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null, class02734, class02725);
      if (var10) {
         this.N(class02734, var4, var8);
      }

      this.N(class02734, class01383x, var5, var8, var3, this.B, var2, class04643);
      class08086 class08086x = this.P.ym().N(E, class02437.Z);
      if (this.B.u && class08086x != null) {
         class08086x.N(class02734, ix, jx, this.M);
      }

      ((class04410)this.P.i_0).N(this.t, new class01383(class01383x).method_74403(-3.0F), var4, fx);
      this.N(class02734, var8);
      class01301 class01301 = ((class05630)this.P.i_7).Nf();
      if (class01301 != class01301.field_18162) {
         int kx = var4.U().N(class00608.U, fx);
         if (class02566.y(kx) > 0) {
            float f1 = var4.U().N(class00608.E, fx);
            this.N(class02734, class01301, this.B.N.y, this.B.z, fx, kx, f1);
         }
      }

      this.y(class02734, var8);
      if (class08086x != null) {
         class08086x.N(class02734, ix, jx, this.M);
      }

      this.N(class02734, this.B.N, var8, var5);
      class04643.y("executeFrameGraph");
      class02734.N(var1, new class03071(this, class04643));
      this.M.N();
      this.R(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
      matrix4fstack.popMatrix();
      class04643.L();
      this.B.N();
      this.y(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
      this.L(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
      this.Z(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
   }

   private boolean N(boolean var1) {
      return false;
   }

   private void N(class02734 var1, class01383 var2, Matrix4f var3, GpuBufferSlice var4, boolean var5, class05932 var6, class02233 var7, class04643 var8) {
      class02725 class02725 = var1.N("main");
      this.M.U = class02725.y(this.M.U);
      if (this.M.E != null) {
         this.M.E = class02725.y(this.M.E);
      }

      if (this.M.W != null) {
         this.M.W = class02725.y(this.M.W);
      }

      if (this.M.P != null) {
         this.M.P = class02725.y(this.M.P);
      }

      this.N(var1, var2, var3, var4, var5, var6, var7, var8, null, class02725);
      if (var6.u && this.M.T != null) {
         this.M.T = class02725.y(this.M.T);
      }

      class02452<class08066> class02452 = this.M.U;
      class02452<class08066> class02452x = this.M.E;
      class02452<class08066> class02452xx = this.M.W;
      class02452<class08066> class02452xxx = this.M.T;
      class02725.N(
         () -> {
            RenderSystem.setShaderFog(var4);
            class06889 class06889 = var6.N.y;
            double d0 = class06889.N();
            double d1 = class06889.y();
            double d2 = class06889.L();
            var8.N("terrain");
            if (this.f == null) {
               int ix = ((class05630)this.P.i_7).c().method_41753() == class06532.field_64665 ? ((class05630)this.P.i_7).H() : 1;
               this.f = RenderSystem.getDevice()
                  .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, this.K(), this.K(), ix, OptionalDouble.empty());
            }

            class08760 class08760 = this.N(this.N(var3, d0, d1, d2));
            class08768 class08768 = class08768.field_61022;
            class08188 class08188x = this.f;
            this.N(null);
            class08188 class08188x = class08188x;
            class08768 class08768x = class08768;
            if (this.N(class08760, class08768x, class08188x)) {
               this.N(class08760, class08768x, class08188x, var0 -> {
                  WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_11532, net.minecraft.class_11531, net.minecraft.class_12137]");
                  ((class08760)var0[0]).N((class08768)var0[1], (class08188)var0[2]);
                  return (Void)null;
               });
            }

            ((class03386)this.P.i_5).v().N(class01540.field_60025);
            if (class02452 != null) {
               class02452.get().N(this.P.e());
            }

            if (this.L() && class02452 != null) {
               class08066 class08066 = class02452.get();
               RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(class08066.L(), 0, class08066.i(), 1.0);
            }

            class01421 class01421 = this.y(new class01421());
            class01422 class01422 = this.u.L();
            class01422 class01422x = this.u.u();
            this.y(null);
            var8.y("submitEntities");
            this.N(class01421, var6, (class01237)this.Z);
            var8.y("submitBlockEntities");
            this.N(class01421, var6, this.Z);
            var8.y("renderFeatures");
            class08133 class08133 = this.z;
            this.N(class08133, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_11684]");
               ((class08133)var0[0]).N();
               return (Void)null;
            });
            class01422.L();
            this.N(class01421);
            class01422.N(class06851.N());
            class01422.N(class06851.s());
            class01422.N(class06851.T());
            class01422.N(class05911.B());
            class01422.N(class05911.Z());
            class01422.N(class05911.L());
            class01422.N(class05911.u());
            class01422.N(class05911.i());
            class01422.N(class05911.R());
            class01422.N(class05911.M());
            class01434 class01434 = this.u.i();
            this.N(class01434, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_4618]");
               ((class01434)var0[0]).N();
               return (Void)null;
            });
            if (var5) {
               this.N(class01422, class01421, false, var6);
            }

            var8.L();
            this.g();
            this.S.N().N(class01421, class01422, var6.N, var3);
            class01422.L();
            this.N(class01421);
            class01422.N(class05911.z());
            class01422.N(class05911.N());
            class01422.N(class05911.y());
            class01422.N(class06851.R());
            class01422.N(class06851.B());
            class01422.N(class06851.M());
            class01422.N(class06851.Z());
            var8.N("destroyProgress");
            this.N(class01421, class01422x, var6);
            class01422x.u();
            var8.L();
            this.N(class01421);
            class01422.N(class06851.i());
            this.N(null, var3);
            class01422.u();
            if (class02452 != null) {
               class02452.get().N(class02452.get());
            }

            this.u(null);
            var8.N("translucent");
            class08188x = this.f;
            class08768x = class08768.field_61023;
            if (this.N(class08760, class08768x, class08188x)) {
               this.N(class08760, class08768x, class08188x, var0 -> {
                  WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_11532, net.minecraft.class_11531, net.minecraft.class_12137]");
                  ((class08760)var0[0]).N((class08768)var0[1], (class08188)var0[2]);
                  return (Void)null;
               });
            }

            var8.y("string");
            class08188x = this.f;
            class08768x = class08768.field_61024;
            if (this.N(class08760, class08768x, class08188x)) {
               this.N(class08760, class08768x, class08188x, var0 -> {
                  WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_11532, net.minecraft.class_11531, net.minecraft.class_12137]");
                  ((class08760)var0[0]).N((class08768)var0[1], (class08188)var0[2]);
                  return (Void)null;
               });
            }

            if (var5) {
               this.N(class01422, class01421, true, var6);
            }

            this.i(null);
            class01422.u();
            var8.L();
            this.N(var4, var6, var8, var3, class02452, class02452, var5, class02452, class02452, null);
         }
      );
   }

   private void N(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11,
      class02734 var12,
      class02725 var13
   ) {
      class02725 class02725 = var12.N("iris_setup");
      this.M.U = class02725.y(this.M.U);
      class02725.N(var13);
      class02725.N(() -> {
         GpuBufferSlice gpubufferslice = RenderSystem.getShaderFog();
         this.Nu.onBeginClear();
         RenderSystem.setShaderFog(gpubufferslice);
      });
   }

   private void N(Matrix4f var1, Matrix4f var2, class06889 var3, CallbackInfoReturnable var4) {
      if (this.NR) {
         NonCullingFrustum noncullingfrustum = new NonCullingFrustum();
         noncullingfrustum.method_23088(var3.M, var3.B, var3.Z);
         var4.setReturnValue(noncullingfrustum);
      }
   }

   private void N(class02734 var1, GpuBufferSlice var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class02725 class02725 = var1.N("particles");
         if (this.M.m != null) {
            this.M.m = class02725.y(this.M.m);
            class02725.N(this.M.U);
         } else {
            this.M.U = class02725.y(this.M.U);
         }

         class02452<class08066> class02452 = this.M.U;
         class02452<class08066> class02452x = this.M.m;
         class02725.N(() -> {
            RenderSystem.setShaderFog(var2);
            if (class02452 != null) {
               class02452.get().N(class02452.get());
            }

            class06959 class06959 = this.B.N;
            class04790 class04790 = this.Z;
            class00987 class00987 = this.t;
            this.N(class00987, class04790, class06959);
            class08133 class08133 = this.z;
            this.y(class08133, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_11684]");
               ((class08133)var0[0]).N();
               return (Void)null;
            });
            this.t.N();
         });
      }
   }

   private class07311 N(class07311 var1) {
      return new OuterWrappedRenderType("iris:is_outline", var1, IsOutlineRenderStateShard.INSTANCE);
   }

   private void N(class05363 var1, class05932 var2) {
      class06889 class06889 = var1.y();
      double d0 = class06889.N();
      double d1 = class06889.y();
      double d2 = class06889.L();
      var2.R.clear();
      ObjectIterator<Entry<SortedSet<class04755>>> objectiterator = this.O.long2ObjectEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         class07209 class07209 = class07209.method_10092(entry.getLongKey());
         if (!(class07209.method_10268(d0, d1, d2) > 1024.0)) {
            SortedSet<class04755> sortedset = (SortedSet<class04755>)entry.getValue();
            if (sortedset != null && !sortedset.isEmpty()) {
               int ix = sortedset.last().L();
               var2.R.add(new class06964(this.G, class07209, ix));
            }
         }
      }
   }

   private void N(class08760 var1, class08768 var2, class08188 var3, Operation var4) {
      this.Nu.setPhase(WorldRenderingPhase.fromTerrainRenderType(var2));
      var4.call(new Object[]{var1, var2, var3});
      this.Nu.setPhase(WorldRenderingPhase.NONE);
   }

   public void N(class03345 var1) {
      this.l.N(var1);
   }

   public final class01383 N(Matrix4f var1, Matrix4f var2, class06889 var3) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class01383)callbackinforeturnable.getReturnValue();
      } else {
         class01383 class01383;
         if (this.p != null && !this.a) {
            class01383 = this.p;
         } else {
            class01383 = new class01383(var1, var2);
            class01383.method_23088(var3.N(), var3.y(), var3.L());
         }

         if (this.a) {
            this.p = class01383;
            this.a = false;
         }

         return class01383;
      }
   }

   private void N(class02410 var1, class08057 var2, float var3, class06889 var4, double var5, class06969 var7, Operation var8) {
      var8.call(new Object[]{var1, var2, var3, var4, var5, var7});
      ((EndExtraction)WorldRenderEvents.END_EXTRACTION.invoker()).endExtraction(this.D);
   }

   private class08760 N(class08760 var1) {
      this.x.prepare((class03386)this.P.i_5, this, this.B, var1, this.Z, this.u.L());
      return var1;
   }

   private void N(class02734 var1, class06959 var2, GpuBufferSlice var3, Matrix4f var4) {
      class02725 class02725 = var1.N("late_debug");
      this.M.U = class02725.y(this.M.U);
      if (this.M.W != null) {
         this.M.W = class02725.y(this.M.W);
      }

      class02452<class08066> class02452 = this.M.U;
      class02725.N(() -> {
         RenderSystem.setShaderFog(var3);
         class01421 class01421 = new class01421();
         class01422 class01422 = this.u.L();
         RenderSystem.outputColorTextureOverride = class02452.get().u();
         RenderSystem.outputDepthTextureOverride = class02452.get().R();
         if (!this.S.y().N()) {
            class08066 class08066 = class06202.Nq().e();
            CommandEncoder commandencoder1 = RenderSystem.getDevice().createCommandEncoder();
            GpuTexture gputexture1 = class08066.i();
            double d0 = 1.0;
            GpuTexture gputexture = gputexture1;
            CommandEncoder commandencoder = commandencoder1;
            this.N(commandencoder, gputexture, d0, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[com.mojang.blaze3d.systems.CommandEncoder, com.mojang.blaze3d.textures.GpuTexture, double]");
               ((CommandEncoder)var0[0]).clearDepthTexture((GpuTexture)var0[1], (Double)var0[2]);
               return (Void)null;
            });
            this.S.y().N(class01421, class01422, var2, var4);
            class01422.L();
         }

         RenderSystem.outputColorTextureOverride = null;
         RenderSystem.outputDepthTextureOverride = null;
         this.N(class01421);
      });
   }

   private void N(class05363 var1, class05932 var2, CallbackInfo var3) {
      ((AfterBlockOutlineExtraction)WorldRenderEvents.AFTER_BLOCK_OUTLINE_EXTRACTION.invoker()).afterBlockOutlineExtraction(this.D, (class07089)this.P.M_3);
   }

   private void N(class05363 var1, class01383 var2, class02233 var3, class05932 var4) {
      class06889 class06889 = var1.y();
      double d0 = class06889.N();
      double d1 = class06889.y();
      double d2 = class06889.L();
      class03106 class03106 = ((class03448)this.P.T_3).method_54719();
      boolean flag = this.L();
      double d3 = class04995.N(((class05630)this.P.i_7).Nh() / 8.0, 1.0, 2.5) * ((class05630)this.P.i_7).M().method_41753();
      class07049.method_5840(this.N(d3));
      class03448 class03448 = this.G;

      for (class07049 class07049 : this.N(class03448, (Operation)(var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_638]");
         return ((class03448)var0[0]).M();
      }))) {
         if (this.s.N(class07049, var2, d0, d1, d2) || class07049.method_5821((class04453)this.P.T_4)) {
            class07209 class07209 = class07049.method_24515();
            if ((this.G.method_31601(class07209.method_10264()) || this.N(class07209))
               && (class07049 != var1.B() || var1.z() || var1.B() instanceof class07438 && ((class07438)var1.B()).method_6113())
               && (!(class07049 instanceof class04453) || var1.B() == class07049)) {
               if (class07049.field_6012 == 0) {
                  class07049.field_6038 = class07049.method_23317();
                  class07049.field_5971 = class07049.method_23318();
                  class07049.field_5989 = class07049.method_23321();
               }

               float fx = var3.N(!class03106.N(class07049));
               class08800 class08800 = this.N(class07049, fx);
               var4.y.add(class08800);
               if (class08800.y() && flag) {
                  var4.u = true;
               }
            }
         }
      }
   }

   private void N(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      ImmediateState.isRenderingLevel = true;
   }

   private void N(CallbackInfo var1) {
      ((StartMain)WorldRenderEvents.START_MAIN.invoker()).startMain(this.x);
   }

   private void N(class02734 var1, class01301 var2, class06889 var3, long var4, float var6, int var7, float var8) {
      class02725 class02725 = var1.N("clouds");
      if (this.M.s != null) {
         this.M.s = class02725.y(this.M.s);
      } else {
         this.M.U = class02725.y(this.M.U);
      }

      class02725.N(() -> {
         this.Z(null);
         class02416 class02416 = this.j;
         this.N(class02416, var7, var2, var8, var3, var4, var6);
         this.z(null);
      });
   }

   private void N(class01434 var1, Operation var2) {
      var2.call(new Object[]{var1});
      ((AfterEntities)WorldRenderEvents.AFTER_ENTITIES.invoker()).afterEntities(this.x);
   }

   @Override
   public void method_14491(class01089 var1) {
      this.T(null);
      this.N();
      if (this.b != null) {
         this.b.close();
      }

      this.b = new class02409(this.P.NO(), this.P.yW());
   }

   public class01894 fabric$getId() {
      if (this.h == null) {
         if (this instanceof class08117) {
            this.h = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.h = Client.MODELS;
         } else if (this instanceof class03579) {
            this.h = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.h = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.h = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.h = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.h = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.h = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.h = Client.FONTS;
         } else if (this instanceof class08575) {
            this.h = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.h = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.h = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.h = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.h = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.h = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.h = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.h = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.h = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.h = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.h;
   }

   public void W() {
      this.l.N();
      this.j.N();
      this.j(null);
   }

   private void W(CallbackInfo var1) {
      this.Nu.setPhase(WorldRenderingPhase.NONE);
   }

   private void R(
      class02762 var1,
      class02233 var2,
      boolean var3,
      class05363 var4,
      Matrix4f var5,
      Matrix4f var6,
      Matrix4f var7,
      GpuBufferSlice var8,
      Vector4f var9,
      boolean var10,
      CallbackInfo var11
   ) {
      HandRenderer.INSTANCE.renderTranslucent(var5, var2.N(true), var4, (class03386)this.P.i_5, this.Nu);
      class08700.N().y("iris_final");
      if (Iris.shouldActivateWireframe() && this.P.q()) {
         IrisRenderSystem.setPolygonMode(6914);
      }

      this.Nu.finalizeLevelRendering();
      this.Nu = null;
      if (!this.Ni) {
         this.Ni = true;
         Iris.getUpdateChecker()
            .getBetaInfo()
            .ifPresent(
               var0 -> ((class01056)class06202.Nq().i_6)
                  .i()
                  .N(class00392.y("A new beta is out for Iris " + var0.betaTag + ". Please redownload it.").N(class06541.field_1067, class06541.field_1061))
            );
      }

      IrisRenderSystem.restoreCullingState();
   }

   public double R() {
      return this.k == null ? 0.0 : this.k.R.length;
   }

   private void R(CallbackInfo var1) {
      ((InvalidateRenderStateCallback)InvalidateRenderStateCallback.EVENT.invoker()).onInvalidate();
   }

   private void O() {
      if (this.Y % 20 == 0) {
         ObjectIterator<class04755> objectiterator = this.Q.values().iterator();

         while (objectiterator.hasNext()) {
            class04755 class04755 = (class04755)objectiterator.next();
            int ix = class04755.u();
            if (this.Y - ix > 400) {
               objectiterator.remove();
               this.N(class04755);
            }
         }
      }
   }

   public class02416 G() {
      return this.j;
   }

   @Nullable
   private class08086 Y() {
      if (!class06202.C()) {
         return null;
      } else {
         class08086 class08086 = this.P.ym().N(U, class02437.z);
         if (class08086 == null) {
            ((class05630)this.P.i_7).s().method_41748(false);
            ((class05630)this.P.i_7).Np();
         }

         return class08086;
      }
   }

   public void saveState() {
      this.o();
   }

   public ChunkRenderMatrices sodium$getMatrices() {
      return this.Ns;
   }

   public void restoreState() {
      this.o();
   }

   public void sodium$setMatrices(ChunkRenderMatrices var1) {
      this.Ns = var1;
   }

   public SodiumWorldRenderer sodium$getWorldRenderer() {
      return this.NP;
   }
}
