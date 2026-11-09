package minecraft;

import Nursultan.class10954;
import Nursultan.class11339;
import Nursultan.class11938;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.ShapeIndexBuffer;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.GuiRendererExtensions;
import net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRegistryImpl;
import net.fabricmc.fabric.impl.client.rendering.SpecialGuiElementRendererPool;
import net.fabricmc.fabric.mixin.client.rendering.DrawAccessor;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class08659 implements AutoCloseable, GuiRendererExtensions {
   private static final Logger M = LogUtils.getLogger();
   private static final float B = 10000.0F;
   public static final float N = 0.0F;
   private static final float Z = 1000.0F;
   public static final int y = 1000;
   public static final int L = -1000;
   public static final int u = 16;
   private static final int z = 512;
   private static final int U = RenderSystem.getDevice().getMaxTextureSize();
   public static final int i = 0;
   private static final Comparator<class03255> E = Comparator.nullsFirst(
      Comparator.<class03255, Integer>comparing(class03255::y).thenComparing(class03255::L).thenComparing(class03255::u).thenComparing(class03255::i)
   );
   private static final Comparator<class08679> W = Comparator.nullsFirst(Comparator.comparing(class08679::y));
   private static final Comparator<class08669> m = Comparator.comparing(class08669::comp_4069, E)
      .thenComparing(class08669::comp_4055, Comparator.comparing(RenderPipeline::getSortKey))
      .thenComparing(class08669::comp_4056, W);
   private final Map<Object, class11339> P;
   private final Map<Object, class08766> s;
   final class08651 R;
   private final List<class08673> T;
   private final List<class08655> b;
   private final class02579 j;
   private final Map<VertexFormat, class00084> v;
   private int n;
   private final class00056 t;
   private final class00056 G;
   private final class01422 l;
   private final class01237 d;
   private final class08133 w;
   private Map<Class<? extends class08647>, class08672<?>> k;
   @Nullable
   private GpuTexture Y;
   @Nullable
   private GpuTextureView Q;
   @Nullable
   private GpuTexture O;
   @Nullable
   private GpuTextureView g;
   private int I;
   private int J;
   private int o;
   private int q;
   @Nullable
   private class03255 K;
   @Nullable
   private RenderPipeline V;
   @Nullable
   private class08679 e;
   @Nullable
   private class07331 H;
   private boolean c = false;
   private final Map X = new HashMap();
   private class01237 a = null;

   private void L() {
      this.l.u();
      this.R();
      this.i();
      this.u();
      this.R.N(m);
      this.N(class08677.field_60316);
      this.n = this.b.size();
      this.N(class08677.field_60317);
      this.Z();
   }

   private GpuBufferSlice L(GpuBufferSlice var1) {
      class10954 class10954 = class10954.N(var1);
      class11938.L().L(class10954);
      return class10954.N();
   }

   private void L(CallbackInfo var1) {
      this.X.values().forEach(SpecialGuiElementRendererPool::close);
   }

   private int M() {
      int ix = class06202.Nq().Nt().j();
      if (ix != this.o) {
         this.B();
         Iterator<class08766> iterator = this.s.values().iterator();

         while (iterator.hasNext()) {
            iterator.next().i();
         }

         this.o = ix;
      }

      return ix;
   }

   public class08659(class08651 var1, class01422 var2, class01237 var3, class08133 var4, List<class08672<?>> var5) {
      super();
      this.P = new Object2ObjectOpenHashMap();
      this.s = new Object2ObjectOpenHashMap();
      this.T = new ArrayList<>();
      this.b = new ArrayList<>();
      this.j = new class02579(786432);
      this.v = new Object2ObjectOpenHashMap();
      this.n = Integer.MAX_VALUE;
      this.t = new class00056("gui", 1000.0F, 11000.0F, true);
      this.G = new class00056("items", -1000.0F, 1000.0F, true);
      this.K = null;
      this.V = null;
      this.e = null;
      this.H = null;
      this.R = var1;
      this.l = var2;
      this.d = var3;
      this.w = var4;
      Builder builder = ImmutableMap.builder();

      for (class08672 class08672 : var5) {
         builder.put(class08672.N(), class08672);
      }

      this.k = builder.buildOrThrow();
      this.N(var1, var2, var3, var4, var5, null);
   }

   private void B() {
      this.I = 0;
      this.J = 0;
      this.P.clear();
      if (this.Y != null) {
         this.Y.close();
         this.Y = null;
      }

      if (this.Q != null) {
         this.Q.close();
         this.Q = null;
      }

      if (this.O != null) {
         this.O.close();
         this.O = null;
      }

      if (this.g != null) {
         this.g.close();
         this.g = null;
      }
   }

   private void Z() {
      this.z();
      CommandEncoder commandencoder = RenderSystem.getDevice().createCommandEncoder();
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();

      for (class08655 class08655 : this.b) {
         class02609 class02609 = class08655.N();
         class02583 class02583 = class02609.L();
         VertexFormat vertexformat = class02583.N();
         class00084 class00084 = this.v.get(vertexformat);
         if (!object2intopenhashmap.containsKey(vertexformat)) {
            object2intopenhashmap.put(vertexformat, 0);
         }

         ByteBuffer bytebuffer = class02609.N();
         int ix = bytebuffer.remaining();
         int jx = object2intopenhashmap.getInt(vertexformat);
         MappedView mappedview = commandencoder.mapBuffer(class00084.y().slice(jx, ix), false, true);

         try {
            MemoryUtil.memCopy(bytebuffer, mappedview.data());
         } catch (Throwable throwable1) {
            if (mappedview != null) {
               try {
                  mappedview.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (mappedview != null) {
            mappedview.close();
         }

         object2intopenhashmap.put(vertexformat, jx + ix);
         this.T
            .add(
               new class08673(class00084.y(), jx / vertexformat.getVertexSize(), class02583.u(), class02583.L(), class08655.y(), class08655.L(), class08655.u())
            );
         class08655.close();
      }
   }

   private void i() {
      if (!this.R.u().isEmpty()) {
         int ix = this.M();
         int jx = 16 * ix;
         int kx = this.y(jx);
         if (this.Y == null) {
            this.N(kx);
         }

         RenderSystem.outputColorTextureOverride = this.Q;
         RenderSystem.outputDepthTextureOverride = this.g;
         RenderSystem.setProjectionMatrix(this.G.y(kx, kx), class00312.field_54954);
         ((class03386)class06202.Nq().i_5).v().N(class01540.field_60027);
         class01421 class01421 = new class01421();
         MutableBoolean mutableboolean = new MutableBoolean(false);
         MutableBoolean mutableboolean1 = new MutableBoolean(false);
         this.R.N(var6x -> {
            if (var6x.M() != null) {
               mutableboolean1.setTrue();
            } else {
               class08763 class08763 = var6x.L();
               class11339 class11339 = this.P.get(class08763.Z());
               if (class11339 == null || class08763.u() && class11339.i != this.q) {
                  if (this.I + jx > kx) {
                     this.I = 0;
                     this.J += jx;
                  }

                  boolean flag = class08763.u() && class11339 != null;
                  if (!flag && this.J + jx > kx) {
                     if (mutableboolean.isFalse()) {
                        M.warn("Trying to render too many items in GUI at the same time. Skipping some of them.");
                        mutableboolean.setTrue();
                     }
                  } else {
                     int lx = flag ? class11339.N : this.I;
                     int i1 = flag ? class11339.y : this.J;
                     if (flag) {
                        RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(this.Y, 0, this.O, 1.0, lx, kx - i1 - jx, jx, jx);
                     }

                     this.N(class08763, class01421, lx, i1, jx);
                     float f = (float)lx / kx;
                     float f1 = (float)(kx - i1) / kx;
                     this.N(var6x, f, f1, jx, kx);
                     if (flag) {
                        class11339.i = this.q;
                     } else {
                        this.P.put(var6x.L().Z(), new class11339(this.I, this.J, f, f1, this.q));
                        this.I += jx;
                     }
                  }
               } else {
                  this.N(var6x, class11339.L, class11339.u, jx, kx);
               }
            }
         });
         RenderSystem.outputColorTextureOverride = null;
         RenderSystem.outputDepthTextureOverride = null;
         if (mutableboolean1.booleanValue()) {
            this.R.N(var2x -> {
               if (var2x.M() != null) {
                  class08763 class08763 = var2x.L();
                  class08766 class08766 = this.s.computeIfAbsent(class08763.Z(), var1xx -> new class08766(this.l));
                  class03255 class03255 = var2x.M();
                  class08778 class08778 = new class08778(var2x, class03255.u(), class03255.y(), class03255.i(), class03255.L());
                  class08766.N(class08778, this.R, ix);
               }
            });
         }
      }
   }

   private Object2IntMap<VertexFormat> U() {
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();
      Iterator<class08655> iterator = this.b.iterator();

      while (iterator.hasNext()) {
         class02583 class02583 = iterator.next().N().L();
         VertexFormat vertexformat = class02583.N();
         if (!object2intopenhashmap.containsKey(vertexformat)) {
            object2intopenhashmap.put(vertexformat, 0);
         }

         object2intopenhashmap.put(vertexformat, object2intopenhashmap.getInt(vertexformat) + class02583.y() * vertexformat.getVertexSize());
      }

      return object2intopenhashmap;
   }

   @Override
   public void close() {
      this.j.close();
      if (this.Y != null) {
         this.Y.close();
      }

      if (this.Q != null) {
         this.Q.close();
      }

      if (this.O != null) {
         this.O.close();
      }

      if (this.g != null) {
         this.g.close();
      }

      this.k.values().forEach(class08672::close);
      this.t.close();
      this.G.close();
      Iterator<class00084> iterator = this.v.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().close();
      }

      this.s.values().forEach(class08672::close);
      this.L(null);
   }

   private void z() {
      ObjectIterator<Entry<VertexFormat>> objectiterator = this.U().object2IntEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         VertexFormat vertexformat = (VertexFormat)entry.getKey();
         int ix = entry.getIntValue();
         class00084 class00084 = this.v.get(vertexformat);
         if (class00084 == null || class00084.N() < ix) {
            if (class00084 != null) {
               class00084.close();
            }

            this.v.put(vertexformat, new class00084(() -> "GUI vertex buffer for " + vertexformat, 34, ix));
         }
      }
   }

   private void u() {
      this.R.y(var1 -> {
         Matrix3x2fc matrix3x2fc = var1.L;
         class03255 class03255 = var1.z;
         var1.N().N(new class08646(this, matrix3x2fc, class03255));
      });
   }

   private int y(int var1) {
      Set<Object> set = this.R.u();
      int ix;
      if (this.P.isEmpty()) {
         ix = set.size();
      } else {
         ix = this.P.size();

         for (Object object : set) {
            if (!this.P.containsKey(object)) {
               ix++;
            }
         }
      }

      if (this.Y != null) {
         int jx = this.Y.getWidth(0) / var1;
         int lx = jx * jx;
         if (ix < lx) {
            return this.Y.getWidth(0);
         }

         this.B();
      }

      int kx = set.size();
      int i1 = class04995.u(kx + kx / 2);
      return Math.clamp((long)class04995.L(i1 * var1), 512, U);
   }

   private void y(GpuBufferSlice var1) {
      if (!this.T.isEmpty()) {
         class06202 class06202 = class06202.Nq();
         class08844 class08844 = class06202.Nt();
         RenderSystem.setProjectionMatrix(
            this.L(this.t.y((float)class08844.U() / class08844.j(), (float)class08844.E() / class08844.j())), class00312.field_54954
         );
         class08066 class08066 = class06202.e();
         int ix = 0;

         for (class08673 class08673 : this.T) {
            if (class08673.u() > ix) {
               ix = class08673.u();
            }
         }

         ShapeIndexBuffer shapeindexbuffer = RenderSystem.getSequentialBuffer(DrawMode.QUADS);
         GpuBuffer gpubuffer = shapeindexbuffer.getIndexBuffer(ix);
         IndexType indextype = shapeindexbuffer.getIndexType();
         GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
            .N(new Matrix4f().setTranslation(0.0F, 0.0F, -11000.0F), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f());
         if (this.n > 0) {
            this.N(() -> "GUI before blur", class08066, var1, gpubufferslice, gpubuffer, indextype, 0, Math.min(this.n, this.T.size()));
         }

         if (this.T.size() > this.n) {
            RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(class08066.i(), 1.0);
            ((class03386)class06202.i_5).Z();
            this.N(() -> "GUI after blur", class08066, var1, gpubufferslice, gpubuffer, indextype, this.n, this.T.size());
         }
      }
   }

   private void y() {
      Iterator<java.util.Map.Entry<Object, class08766>> iterator = this.s.entrySet().iterator();

      while (iterator.hasNext()) {
         class08766 class08766 = iterator.next().getValue();
         if (!class08766.L()) {
            class08766.close();
            iterator.remove();
         } else {
            class08766.u();
         }
      }
   }

   private void y(CallbackInfo var1) {
      this.X.values().forEach(SpecialGuiElementRendererPool::cleanUpUnusedRenderers);
   }

   private void N(RenderPass var1, GpuBuffer var2, IndexType var3, Operation var4, DrawAccessor var5) {
      RenderPipeline renderpipeline = var5.fabric$pipeline();
      if (renderpipeline.usePipelineDrawModeForGui() && renderpipeline.getVertexFormatMode() != DrawMode.QUADS) {
         ShapeIndexBuffer shapeindexbuffer = RenderSystem.getSequentialBuffer(renderpipeline.getVertexFormatMode());
         var2 = shapeindexbuffer.getIndexBuffer(var5.fabric$indexCount());
         var3 = shapeindexbuffer.getIndexType();
      }

      var4.call(new Object[]{var1, var2, var3});
   }

   private boolean N(boolean var1, RenderPipeline var2) {
      return var1 || var2.getVertexFormatMode().shareVertices;
   }

   private class08672 N(class08672 var1, class08647 var2) {
      return var1 != null && this.c
         ? this.X
            .computeIfAbsent(var1.N(), var0 -> new SpecialGuiElementRendererPool())
            .substitute(var1, var2, class06202.Nq(), this.l, Objects.requireNonNull(this.a, "renderDispatcher"))
         : var1;
   }

   private void N(CallbackInfo var1) {
      this.X.values().forEach(SpecialGuiElementRendererPool::newFrame);
   }

   private void N(class08651 var1, class01422 var2, class01237 var3, class08133 var4, List var5, CallbackInfo var6) {
      this.k = new IdentityHashMap<>(this.k);
   }

   private void N(class08669 var1) {
      RenderPipeline renderpipeline = var1.comp_4055();
      class08679 class08679 = var1.comp_4056();
      class03255 class03255 = var1.comp_4069();
      if (renderpipeline != this.V || this.N(this.N(class03255, this.K), renderpipeline) || !class08679.equals(this.e)) {
         if (this.H != null) {
            this.N(this.H, this.V, this.e, this.K);
         }

         this.H = this.N(renderpipeline);
         this.V = renderpipeline;
         this.e = class08679;
         this.K = class03255;
      }

      var1.method_70917(this.H);
   }

   private <T extends class08647> void N(T var1, int var2) {
      class08672<?> class08672 = this.k.get(var1.getClass());
      class08672 = this.N(class08672, var1);
      if (class08672 != null) {
         ((class08672<class08647>)class08672).N(var1, this.R, var2);
      }
   }

   private void N(class08763 var1, class01421 var2, int var3, int var4, int var5) {
      var2.N();
      var2.N(var3 + var5 / 2.0F, var4 + var5 / 2.0F, 0.0F);
      var2.y(var5, -var5, var5);
      if (!var1.R()) {
         ((class03386)class06202.Nq().i_5).v().N(class01540.field_60026);
      } else {
         ((class03386)class06202.Nq().i_5).v().N(class01540.field_60027);
      }

      RenderSystem.enableScissorForRenderTypeDraws(var3, this.Y.getHeight(0) - var4 - var5, var5, var5);
      var1.N(var2, this.d, 15728880, class01384.u, 0);
      this.w.N();
      this.l.u();
      RenderSystem.disableScissorForRenderTypeDraws();
      var2.y();
   }

   private void N(class08650 var1, float var2, float var3, int var4, int var5) {
      float f = var2 + (float)var4 / var5;
      float f1 = var3 + (float)(-var4) / var5;
      this.R
         .N(
            new class08661(
               class08394.Np,
               class08679.N(this.Q, RenderSystem.getSamplerCache().y(FilterMode.NEAREST)),
               var1.y(),
               var1.u(),
               var1.i(),
               var1.u() + 16,
               var1.i() + 16,
               var2,
               f,
               var3,
               f1,
               -1,
               var1.R(),
               null
            )
         );
   }

   public void N() {
      this.q++;
   }

   public void N(GpuBufferSlice var1) {
      this.L();
      this.y(var1);
      Iterator<class00084> iterator = this.v.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().L();
      }

      this.T.clear();
      this.b.clear();
      this.R.i();
      this.n = Integer.MAX_VALUE;
      this.y();
      if (class07529.l) {
         RenderPipeline.updateSortKeySeed();
         class08679.L();
      }
   }

   private void N(class08677 var1) {
      this.K = null;
      this.V = null;
      this.e = null;
      this.H = null;
      this.R.N(this::N, var1);
      if (this.H != null) {
         this.N(this.H, this.V, this.e, this.K);
      }
   }

   private void N(Supplier<String> var1, class08066 var2, GpuBufferSlice var3, GpuBufferSlice var4, GpuBuffer var5, IndexType var6, int var7, int var8) {
      RenderPass renderpass = RenderSystem.getDevice()
         .createCommandEncoder()
         .createRenderPass(var1, var2.u(), OptionalInt.empty(), var2.u ? var2.R() : null, OptionalDouble.empty());

      try {
         RenderSystem.bindDefaultUniforms(renderpass);
         renderpass.setUniform("Fog", var3);
         renderpass.setUniform("DynamicTransforms", var4);

         for (int ix = var7; ix < var8; ix++) {
            class08673 class08673 = this.T.get(ix);
            this.N(class08673, renderpass, var5, var6);
         }
      } catch (Throwable throwable1) {
         if (renderpass != null) {
            try {
               renderpass.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (renderpass != null) {
         renderpass.close();
      }
   }

   private class07331 N(RenderPipeline var1) {
      return new class07331(this.j, var1.getVertexFormatMode(), var1.getVertexFormat());
   }

   private boolean N(@Nullable class03255 var1, @Nullable class03255 var2) {
      if (var1 == var2) {
         return false;
      } else {
         return var1 != null ? !var1.equals(var2) : true;
      }
   }

   private void N(class03255 var1, RenderPass var2) {
      class08844 class08844 = class06202.Nq().Nt();
      int ix = class08844.E();
      int jx = class08844.j();
      double d0 = var1.u() * jx;
      double d1 = ix - var1.L() * jx;
      double d2 = var1.M() * jx;
      double d3 = var1.B() * jx;
      var2.enableScissor((int)d0, (int)d1, Math.max(0, (int)d2), Math.max(0, (int)d3));
   }

   private void N(class07331 var1, RenderPipeline var2, class08679 var3, @Nullable class03255 var4) {
      class02609 class02609 = var1.N();
      if (class02609 != null) {
         this.b.add(new class08655(class02609, var2, var3, var4));
      }
   }

   private void N(class08673 var1, RenderPass var2, GpuBuffer var3, IndexType var4) {
      RenderPipeline renderpipeline = var1.i();
      var2.setPipeline(renderpipeline);
      var2.setVertexBuffer(0, var1.N());
      class03255 class03255 = var1.M();
      if (class03255 != null) {
         this.N(class03255, var2);
      } else {
         var2.disableScissor();
      }

      if (var1.R().u() != null) {
         var2.bindTexture("Sampler0", var1.R().u(), var1.R().M());
      }

      if (var1.R().i() != null) {
         var2.bindTexture("Sampler1", var1.R().i(), var1.R().B());
      }

      if (var1.R().R() != null) {
         var2.bindTexture("Sampler2", var1.R().R(), var1.R().Z());
      }

      this.N(
         var2,
         var3,
         var4,
         var0 -> {
            WrapOperationRuntime.checkArgumentCount(
               var0, 3, "[com.mojang.blaze3d.systems.RenderPass, com.mojang.blaze3d.buffers.GpuBuffer, com.mojang.blaze3d.vertex.VertexFormat$class_5595]"
            );
            ((RenderPass)var0[0]).setIndexBuffer((GpuBuffer)var0[1], (IndexType)var0[2]);
            return (Void)null;
         },
         var1
      );
      var2.drawIndexed(var1.y(), 0, var1.u(), 1);
   }

   private void N(int var1) {
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.Y = gpudevice.createTexture("UI items atlas", 12, TextureFormat.RGBA8, var1, var1, 1, 1);
      this.Q = gpudevice.createTextureView(this.Y);
      this.O = gpudevice.createTexture("UI items atlas depth", 8, TextureFormat.DEPTH32, var1, var1, 1, 1);
      this.g = gpudevice.createTextureView(this.O);
      gpudevice.createCommandEncoder().clearColorAndDepthTextures(this.Y, 0, this.O, 1.0);
   }

   public void fabric_onReady(class04790 var1) {
      this.a = var1;
      SpecialGuiElementRegistryImpl.onReady(class06202.Nq(), this.l, var1, this.k);
      this.c = true;
   }

   private void R() {
      this.N(null);
      int ix = class06202.Nq().Nt().j();
      this.R.L(var2 -> this.N(var2, ix));
      this.y(null);
   }
}
