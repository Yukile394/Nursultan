package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.stream.Collectors;
import net.caffeinemc.mods.sodium.api.memory.MemoryIntrinsics;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.serializer.VertexSerializerRegistry;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.render.immediate.model.BakedModelEncoder;
import net.caffeinemc.mods.sodium.client.render.vertex.buffer.BufferBuilderExtension;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.BufferBuilderPolygonView;
import net.irisshaders.iris.vertices.ExtendedDataHelper;
import net.irisshaders.iris.vertices.ImmediateState;
import net.irisshaders.iris.vertices.IrisVertexFormats;
import net.irisshaders.iris.vertices.NormI8;
import net.irisshaders.iris.vertices.NormalHelper;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07331 implements class01391, VertexBufferWriter, BufferBuilderExtension {
   private static final int N = 16777215;
   private static final long y = -1L;
   private static final long L = -1L;
   private static final boolean u = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
   private final class02579 i;
   private long R;
   private int M;
   private final VertexFormat B;
   private final DrawMode Z;
   private final boolean z;
   private final boolean U;
   private final int E;
   private final int W;
   private final int[] m;
   private int P;
   private boolean s;
   private final BufferBuilderPolygonView T = new BufferBuilderPolygonView();
   private final Vector3f b = new Vector3f();
   private final long[] j = new long[4];
   private boolean v;
   private boolean n;
   private boolean t;
   private int G;
   private int l = -1;
   private byte d = -1;
   private int w;
   private int k;
   private int Y;

   private void L() {
      if (!this.s) {
         throw new IllegalStateException("Not building!");
      }
   }

   public class07331(class02579 var1, DrawMode var2, VertexFormat var3) {
      super();
      this.R = -1L;
      this.s = true;
      var3 = this.N(var3);
      if (!var3.contains(VertexFormatElement.POSITION)) {
         throw new IllegalArgumentException("Cannot build mesh with no position element");
      } else {
         this.i = var1;
         this.Z = var2;
         this.B = var3;
         this.E = var3.getVertexSize();
         this.W = var3.getElementsMask() & ~VertexFormatElement.POSITION.mask();
         this.m = var3.getOffsetsByElement();
         boolean flag = var3 == class07835.L;
         boolean flag1 = var3 == class07835.y;
         this.z = flag || flag1;
         this.U = flag;
      }
   }

   private long i() {
      this.L();
      this.R();
      if (this.M >= 16777215) {
         throw new IllegalStateException("Trying to write too many vertices (>16777215) into BufferBuilder");
      } else {
         this.M++;
         long ix = this.i.y(this.E);
         this.R = ix;
         return ix;
      }
   }

   @Nullable
   private class02609 u() {
      if (this.M == 0) {
         return null;
      } else {
         class02613 class02613 = this.i.N();
         if (class02613 == null) {
            return null;
         } else {
            int ix = this.Z.getIndexCount(this.M);
            IndexType indextype = IndexType.smallestFor(this.M);
            return new class02609(class02613, new class02583(this.B, this.M, ix, this.Z, indextype));
         }
      }
   }

   private static void y(long var0, int var2) {
      if (u) {
         MemoryUtil.memPutInt(var0, var2);
      } else {
         MemoryUtil.memPutShort(var0, (short)(var2 & 65535));
         MemoryUtil.memPutShort(var0 + 2L, (short)(var2 >> 16 & 65535));
      }
   }

   private void y(CallbackInfo var1) {
      if (this.M != 0 && this.n) {
         this.P = this.P & ~IrisVertexFormats.MID_TEXTURE_ELEMENT.mask();
         this.P = this.P & ~IrisVertexFormats.TANGENT_ELEMENT.mask();
         if (this.t && this.P != (this.P & ~VertexFormatElement.NORMAL.mask())) {
            this.method_22914(0.0F, 1.0F, 0.0F);
         }

         if (this.v) {
            this.v = false;
         } else if (this.Z == DrawMode.QUADS || this.Z == DrawMode.TRIANGLES) {
            this.j[this.G] = this.R - this.i.getPointer();
            this.G++;
            if (this.Z == DrawMode.QUADS && this.G == 4 || this.Z == DrawMode.TRIANGLES && this.G == 3) {
               this.N(this.G);
            }
         }
      }
   }

   public class02609 y() {
      class02609 class02609 = this.N();
      if (class02609 == null) {
         throw new IllegalStateException("BufferBuilder was empty");
      } else {
         return class02609;
      }
   }

   public void push(MemoryStack var1, long var2, int var4, VertexFormat var5) {
      int ix = var4 * this.E;
      long jx = this.i.y(ix);
      if (var5 == this.B) {
         MemoryIntrinsics.copyMemory(var2, jx, ix);
      } else {
         this.N(var2, jx, var4, var5);
      }

      this.M += var4;
      this.R = jx + ix - this.E;
      this.P = 0;
      this.N(null);
   }

   private boolean N(class07331 var1) {
      return this.z && !this.n;
   }

   private VertexFormat N(VertexFormat var1) {
      boolean flag = false;
      this.t = false;
      if ((Boolean)ImmediateState.skipExtension.get() || !ImmediateState.isRenderingLevel || !Iris.isPackInUseQuick()) {
         return var1;
      } else if (var1 == class07835.y || var1 == IrisVertexFormats.TERRAIN) {
         this.n = true;
         flag = true;
         this.t = false;
         return IrisVertexFormats.TERRAIN;
      } else if (var1 == class07835.L || var1 == IrisVertexFormats.ENTITY) {
         this.n = true;
         flag = false;
         this.t = false;
         return IrisVertexFormats.ENTITY;
      } else if (var1 != class07835.U && var1 != IrisVertexFormats.GLYPH) {
         return var1;
      } else {
         this.n = true;
         flag = false;
         this.t = true;
         return IrisVertexFormats.GLYPH;
      }
   }

   @Override
   public void N(class01423 var1, class02022 var2, float[] var3, float var4, float var5, float var6, float var7, int[] var8, int var9) {
      if (WorldRenderingSettings.INSTANCE.shouldUseSeparateAo()) {
         boolean flag = false;
         var3 = new float[var3.length];
         Arrays.fill(var3, 1.0F);
      }

      class01391.super.N(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @Override
   public void N(float var1, float var2, float var3, int var4, float var5, float var6, int var7, int var8, float var9, float var10, float var11) {
      if (this.N(this)) {
         long ix = this.i();
         MemoryUtil.memPutFloat(ix + 0L, var1);
         MemoryUtil.memPutFloat(ix + 4L, var2);
         MemoryUtil.memPutFloat(ix + 8L, var3);
         N(ix + 12L, var4);
         MemoryUtil.memPutFloat(ix + 16L, var5);
         MemoryUtil.memPutFloat(ix + 20L, var6);
         long jx;
         if (this.U) {
            y(ix + 24L, var7);
            jx = ix + 28L;
         } else {
            jx = ix + 24L;
         }

         y(jx + 0L, var8);
         MemoryUtil.memPutByte(jx + 4L, N(var9));
         MemoryUtil.memPutByte(jx + 5L, N(var10));
         MemoryUtil.memPutByte(jx + 6L, N(var11));
      } else {
         class01391.super.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }

   private static byte N(float var0) {
      return (byte)((int)(class04995.N(var0, -1.0F, 1.0F) * 127.0F) & 0xFF);
   }

   private void N(long var1, long var3, int var5, VertexFormat var6) {
      VertexSerializerRegistry.instance().get(var6, this.B).serialize(var1, var3, var5);
   }

   @Override
   public void N(class01423 var1, class02022 var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      if (!this.z) {
         class01391.super.N(var1, var2, var3, var4, var5, var6, var7, var8);
         if (var2.E() != null) {
            SpriteUtil.INSTANCE.markSpriteActive(var2.E());
         }
      } else {
         VertexBufferWriter vertexbufferwriter = VertexBufferWriter.of(this);
         ModelQuadView modelquadview = (ModelQuadView)var2;
         int ix = ColorABGR.pack(var3, var4, var5, var6);
         BakedModelEncoder.writeQuadVertices(vertexbufferwriter, var1, modelquadview, ix, var7, var8, false);
         if (modelquadview.getSprite() != null) {
            SpriteUtil.INSTANCE.markSpriteActive(modelquadview.getSprite());
         }
      }
   }

   private void N(int var1) {
      this.G = 0;
      int ix = this.B.getVertexSize();
      this.T.setup(this.i.getPointer(), this.j, ix, var1);
      float f = 0.0F;
      float f1 = 0.0F;

      for (int jx = 0; jx < var1; jx++) {
         f += this.T.u(jx);
         f1 += this.T.v(jx);
      }

      f /= var1;
      f1 /= var1;
      int j2 = this.m[IrisVertexFormats.MID_TEXTURE_ELEMENT.id()];
      int kx = this.m[VertexFormatElement.NORMAL.id()];
      int lx = this.m[IrisVertexFormats.TANGENT_ELEMENT.id()];
      if (var1 == 3) {
         for (int i1 = 0; i1 < var1; i1++) {
            long j1 = this.i.getPointer() + this.j[i1];
            int l1 = MemoryUtil.memGetInt(j1 + kx);
            int i2 = NormalHelper.computeTangentSmooth(NormI8.unpackX(l1), NormI8.unpackY(l1), NormI8.unpackZ(l1), this.T);
            MemoryUtil.memPutFloat(j1 + j2, f);
            MemoryUtil.memPutFloat(j1 + j2 + 4L, f1);
            MemoryUtil.memPutInt(j1 + lx, i2);
         }
      } else {
         boolean flag = ImmediateState.isRenderingLevel;
         NormalHelper.computeFaceNormal(this.b, this.T);
         int k2 = 0;
         if (flag) {
            k2 = NormI8.pack(this.b.x, this.b.y, this.b.z, 0.0F);
         }

         int k1 = NormalHelper.computeTangent(this.b.x, this.b.y, this.b.z, this.T);

         for (int l2 = 0; l2 < var1; l2++) {
            long i3 = this.i.getPointer() + this.j[l2];
            MemoryUtil.memPutFloat(i3 + j2, f);
            MemoryUtil.memPutFloat(i3 + j2 + 4L, f1);
            if (flag) {
               MemoryUtil.memPutInt(i3 + kx, k2);
            }

            MemoryUtil.memPutInt(i3 + lx, k1);
         }
      }

      Arrays.fill(this.j, 0L);
   }

   private void N(CallbackInfo var1) {
      this.v = true;
   }

   private void N(float var1, float var2, float var3, CallbackInfoReturnable var4) {
      if ((this.P & IrisVertexFormats.MID_BLOCK_ELEMENT.mask()) != 0) {
         long ix = this.N(IrisVertexFormats.MID_BLOCK_ELEMENT);
         MemoryUtil.memPutInt(ix, ExtendedDataHelper.computeMidBlock(var1, var2, var3, this.w, this.k, this.Y));
         byte b0 = -1;
         MemoryUtil.memPutByte(ix + 3L, b0);
      }

      if ((this.P & IrisVertexFormats.ENTITY_ELEMENT.mask()) != 0) {
         long jx = this.N(IrisVertexFormats.ENTITY_ELEMENT);
         MemoryUtil.memPutShort(jx, (short)this.l);
         MemoryUtil.memPutShort(jx + 2L, this.d);
      } else if ((this.P & IrisVertexFormats.ENTITY_ID_ELEMENT.mask()) != 0) {
         long kx = this.N(IrisVertexFormats.ENTITY_ID_ELEMENT);
         MemoryUtil.memPutShort(kx, (short)CapturedRenderingState.INSTANCE.getCurrentRenderedEntity());
         MemoryUtil.memPutShort(kx + 2L, (short)CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity());
         MemoryUtil.memPutShort(kx + 4L, (short)CapturedRenderingState.INSTANCE.getCurrentRenderedItem());
      }
   }

   private static void N(long var0, int var2) {
      int ix = class02566.T(var2);
      MemoryUtil.memPutInt(var0, u ? ix : Integer.reverseBytes(ix));
   }

   private class01391 N(short var1, short var2, VertexFormatElement var3) {
      long ix = this.N(var3);
      if (ix != -1L) {
         MemoryUtil.memPutShort(ix, var1);
         MemoryUtil.memPutShort(ix + 2L, var2);
      }

      return this;
   }

   private long N(VertexFormatElement var1) {
      int ix = this.P;
      int jx = ix & ~var1.mask();
      if (jx == ix) {
         return -1L;
      } else {
         this.P = jx;
         long kx = this.R;
         if (kx == -1L) {
            throw new IllegalArgumentException("Not currently building vertex");
         } else {
            return kx + this.m[var1.id()];
         }
      }
   }

   @Nullable
   public class02609 N() {
      this.L();
      this.R();
      class02609 class02609 = this.u();
      this.s = false;
      this.R = -1L;
      return class02609;
   }

   @Override
   public class01391 method_1336(int var1, int var2, int var3, int var4) {
      long ix = this.N(VertexFormatElement.COLOR);
      if (ix != -1L) {
         MemoryUtil.memPutByte(ix, (byte)var1);
         MemoryUtil.memPutByte(ix + 1L, (byte)var2);
         MemoryUtil.memPutByte(ix + 2L, (byte)var3);
         MemoryUtil.memPutByte(ix + 3L, (byte)var4);
      }

      return this;
   }

   public void sodium$duplicateVertex() {
      if (this.M != 0) {
         long ix = this.i.y(this.E);
         MemoryIntrinsics.copyMemory(ix - this.E, ix, this.E);
         this.M++;
      }
   }

   @Override
   public class01391 method_22922(int var1) {
      long ix = this.N(VertexFormatElement.UV1);
      if (ix != -1L) {
         y(ix, var1);
      }

      return this;
   }

   @Override
   public class01391 method_60803(int var1) {
      long ix = this.N(VertexFormatElement.UV2);
      if (ix != -1L) {
         y(ix, var1);
      }

      return this;
   }

   @Override
   public class01391 method_22913(float var1, float var2) {
      long ix = this.N(VertexFormatElement.UV0);
      if (ix != -1L) {
         MemoryUtil.memPutFloat(ix, var1);
         MemoryUtil.memPutFloat(ix + 4L, var2);
      }

      return this;
   }

   private void R() {
      this.y(null);
      if (this.M != 0) {
         if (this.P != 0) {
            String sx = VertexFormatElement.elementsFromMask(this.P).<CharSequence>map(this.B::getElementName).collect(Collectors.joining(", "));
            throw new IllegalStateException("Missing elements in vertex: " + sx);
         } else {
            if (this.Z == DrawMode.LINES) {
               long ix = this.i.y(this.E);
               MemoryUtil.memCopy(ix - this.E, ix, this.E);
               this.M++;
            }
         }
      }
   }

   public void beginBlock(int var1, byte var2, byte var3, int var4, int var5, int var6) {
      this.l = var1;
      this.d = var2;
      this.w = var4;
      this.k = var5;
      this.Y = var6;
   }

   public void endBlock() {
      this.l = -1;
      this.d = -1;
      this.w = 0;
      this.k = 0;
      this.Y = 0;
   }

   @Override
   public class01391 method_22912(float var1, float var2, float var3) {
      long ix = this.i() + this.m[VertexFormatElement.POSITION.id()];
      this.P = this.W;
      MemoryUtil.memPutFloat(ix, var1);
      MemoryUtil.memPutFloat(ix + 4L, var2);
      MemoryUtil.memPutFloat(ix + 8L, var3);
      this.N(var1, var2, var3, null);
      return this;
   }

   @Override
   public class01391 method_39415(int var1) {
      long ix = this.N(VertexFormatElement.COLOR);
      if (ix != -1L) {
         N(ix, var1);
      }

      return this;
   }

   @Override
   public class01391 method_22914(float var1, float var2, float var3) {
      long ix = this.N(VertexFormatElement.NORMAL);
      if (ix != -1L) {
         MemoryUtil.memPutByte(ix, N(var1));
         MemoryUtil.memPutByte(ix + 1L, N(var2));
         MemoryUtil.memPutByte(ix + 2L, N(var3));
      }

      return this;
   }

   @Override
   public class01391 method_60796(int var1, int var2) {
      return this.N((short)var1, (short)var2, VertexFormatElement.UV1);
   }

   @Override
   public class01391 method_22921(int var1, int var2) {
      return this.N((short)var1, (short)var2, VertexFormatElement.UV2);
   }

   @Override
   public class01391 method_75298(float var1) {
      long ix = this.N(VertexFormatElement.LINE_WIDTH);
      if (ix != -1L) {
         MemoryUtil.memPutFloat(ix, var1);
      }

      return this;
   }
}
