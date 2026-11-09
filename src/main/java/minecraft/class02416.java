package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.ShapeIndexBuffer;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.irisshaders.iris.mixin.CloudRendererAccessor;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

@Environment(EnvType.CLIENT)
public class class02416 extends class01291<Optional<class02448>> implements AutoCloseable, FabricResourceReloader, CloudRendererAccessor {
   private static final int N = 16;
   private static final int y = 32;
   private static final float L = 12.0F;
   private static final int u = 400;
   private static final float i = 0.6F;
   private static final int R = new Std140SizeCalculator().putVec4().putVec3().putVec3().get();
   private static final Logger M = LogUtils.getLogger();
   private static final class01894 B = class01894.y("textures/environment/clouds.png");
   private static final long Z = 0L;
   private static final int z = 4;
   private static final int U = 3;
   private static final int E = 2;
   private static final int W = 1;
   private static final int m = 0;
   private boolean P = true;
   private int s = Integer.MIN_VALUE;
   private int T = Integer.MIN_VALUE;
   private class02446 b = class02446.field_53061;
   @Nullable
   private class01301 j;
   @Nullable
   private class02448 v;
   private int n = 0;
   private final class00084 t = new class00084(() -> "Cloud UBO", 130, R);
   @Nullable
   private class00084 G;
   private class01894 l;

   private static boolean L(long var0) {
      return (var0 >> 1 & 1L) != 0L;
   }

   public class02416() {
      super();
   }

   @Override
   public void close() {
      this.t.close();
      if (this.G != null) {
         this.G.close();
      }
   }

   private static boolean u(long var0) {
      return (var0 >> 0 & 1L) != 0L;
   }

   public void y() {
      this.t.L();
   }

   private static boolean y(long var0) {
      return (var0 >> 2 & 1L) != 0L;
   }

   private static boolean y(int var0) {
      return class02566.y(var0) < 10;
   }

   private static int N(int var0) {
      byte b0 = 4;
      return ((var0 + 1) * 2 * (var0 + 1) * 2 / 2 * 4 + 54) * 3;
   }

   protected Optional<class02448> y(class01089 var1, class04643 var2) {
      try {
         Optional optional;
         try (
            InputStream inputstream = var1.u(B);
            class08280 class08280 = class08280.N(inputstream);
         ) {
            int ix = class08280.N();
            int jx = class08280.y();
            long[] along = new long[ix * jx];

            for (int k = 0; k < jx; k++) {
               for (int lx = 0; lx < ix; lx++) {
                  int i1 = class08280.N(lx, k);
                  if (y(i1)) {
                     along[lx + k * ix] = 0L;
                  } else {
                     boolean flag = y(class08280.N(lx, Math.floorMod(k - 1, jx)));
                     boolean flag1 = y(class08280.N(Math.floorMod(lx + 1, jx), k));
                     boolean flag2 = y(class08280.N(lx, Math.floorMod(k + 1, jx)));
                     boolean flag3 = y(class08280.N(Math.floorMod(lx - 1, jx), k));
                     along[lx + k * ix] = N(i1, flag, flag1, flag2, flag3);
                  }
               }
            }

            optional = Optional.of(new class02448(along, ix, jx));
         }

         return optional;
      } catch (IOException ioexception) {
         M.error("Failed to load cloud texture", ioexception);
         return Optional.empty();
      }
   }

   private static int N(long var0, int var2, long var3, @Nullable class02446 var5, int var6, int var7) {
      int ix = var2;
      if (var5 != class02446.field_53062) {
         N(var0, var2, var6, var7, class07211.field_11036, 0);
         ix = var2 + 1;
      }

      if (var5 != class02446.field_53060) {
         N(var0, ix, var6, var7, class07211.field_11033, 0);
         ix++;
      }

      if (N(var3) && var7 > 0) {
         N(var0, ix, var6, var7, class07211.field_11043, 0);
         ix++;
      }

      if (L(var3) && var7 < 0) {
         N(var0, ix, var6, var7, class07211.field_11035, 0);
         ix++;
      }

      if (u(var3) && var6 > 0) {
         N(var0, ix, var6, var7, class07211.field_11039, 0);
         ix++;
      }

      if (y(var3) && var6 < 0) {
         N(var0, ix, var6, var7, class07211.field_11034, 0);
         ix++;
      }

      return ix;
   }

   protected void N(Optional<class02448> var1, class01089 var2, class04643 var3) {
      this.v = (class02448)var1.orElse(null);
      this.P = true;
   }

   private static void N(long var0, long var2, int var4, int var5, class07211 var6, int var7) {
      int ix = var6.L() | var7;
      ix |= (var4 & 1) << 7;
      ix |= (var5 & 1) << 6;
      long jx = var0 + var2 * 3L;
      MemoryUtil.memPutByte(jx, (byte)(var4 >> 1));
      MemoryUtil.memPutByte(jx + 1L, (byte)(var5 >> 1));
      MemoryUtil.memPutByte(jx + 2L, (byte)ix);
   }

   private static int N(long var0, int var2, int var3, int var4) {
      N(var0, var2, var3, var4, class07211.field_11033, N);
      N(var0, var2 + 1, var3, var4, class07211.field_11036, N);
      N(var0, var2 + 2, var3, var4, class07211.field_11043, N);
      N(var0, var2 + 3, var3, var4, class07211.field_11035, N);
      N(var0, var2 + 4, var3, var4, class07211.field_11039, N);
      N(var0, var2 + 5, var3, var4, class07211.field_11034, N);
      return var2 + 6;
   }

   private static int N(long var0, int var2, int var3, int var4, @Nullable class02446 var5, boolean var6, int var7, int var8, long[] var9, int var10, int var11) {
      int ix = Math.floorMod(var7 + var3, var10);
      int jx = Math.floorMod(var8 + var4, var11);
      long k = var9[ix + jx * var10];
      if (k == 0L) {
         return var2;
      } else {
         int lx;
         if (var6) {
            lx = N(var0, var2, k, var5, var3, var4);
            if (N(var3, var4) <= 1) {
               lx = N(var0, lx, var3, var4);
            }
         } else {
            N(var0, var2, var3, var4, class07211.field_11033, y);
            lx = var2 + 1;
         }

         return lx;
      }
   }

   private static int N(int var0, int var1) {
      return Math.abs(var0) + Math.abs(var1);
   }

   private void N(class02446 var1, ByteBuffer var2, int var3, int var4, boolean var5, int var6) {
      if (this.v != null) {
         long[] along = this.v.N();
         int ix = this.v.y();
         int jx = this.v.L();
         long k = MemoryUtil.memAddress(var2);
         int lx = var2.position() / 3;

         for (int i1 = 0; i1 <= 2 * var6; i1++) {
            for (int j1 = -i1; j1 <= i1; j1++) {
               int k1 = i1 - Math.abs(j1);
               if (k1 >= 0 && k1 <= var6 && j1 * j1 + k1 * k1 <= var6 * var6) {
                  if (k1 != 0) {
                     lx = N(k, lx, j1, -k1, var1, var5, var3, var4, along, ix, jx);
                  }

                  lx = N(k, lx, j1, k1, var1, var5, var3, var4, along, ix, jx);
               }
            }
         }

         var2.position(lx * 3);
      }
   }

   private void N(class02446 var1, ByteBuffer var2, int var3, int var4, long var5) {
      if (var1 != class02446.field_53062) {
         this.N(var2, var3, var4, class07211.field_11036, 0);
      }

      if (var1 != class02446.field_53060) {
         this.N(var2, var3, var4, class07211.field_11033, 0);
      }

      if (N(var5) && var4 > 0) {
         this.N(var2, var3, var4, class07211.field_11043, 0);
      }

      if (L(var5) && var4 < 0) {
         this.N(var2, var3, var4, class07211.field_11035, 0);
      }

      if (u(var5) && var3 > 0) {
         this.N(var2, var3, var4, class07211.field_11039, 0);
      }

      if (y(var5) && var3 < 0) {
         this.N(var2, var3, var4, class07211.field_11034, 0);
      }

      if (Math.abs(var3) <= 1 && Math.abs(var4) <= 1) {
         for (class07211 class07211 : class07211.values()) {
            this.N(var2, var3, var4, class07211, 16);
         }
      }
   }

   private void N(ByteBuffer var1, int var2, int var3, class07211 var4, int var5) {
      int ix = var4.L() | var5;
      ix |= (var2 & 1) << 7;
      ix |= (var3 & 1) << 6;
      var1.put((byte)(var2 >> 1)).put((byte)(var3 >> 1)).put((byte)ix);
   }

   private void N(ByteBuffer var1, int var2, int var3) {
      this.N(var1, var2, var3, class07211.field_11033, 32);
   }

   private void N(class02446 var1, ByteBuffer var2, int var3, int var4, boolean var5, int var6, int var7, int var8, int var9, long[] var10) {
      int ix = Math.floorMod(var3 + var6, var7);
      int jx = Math.floorMod(var4 + var8, var9);
      long k = var10[ix + jx * var7];
      if (k != 0L) {
         if (var5) {
            this.N(var1, var2, var6, var8, k);
         } else {
            this.N(var2, var6, var8);
         }
      }
   }

   public void N(int var1, class01301 var2, float var3, class06889 var4, long var5, float var7) {
      if (this.v != null) {
         int ix = class04995.u(((class05630)class06202.Nq().i_7).E().method_41753() * 16 / 12.0F);
         int jx = N(ix);
         if (this.G == null || this.G.y().size() != jx) {
            if (this.G != null) {
               this.G.close();
            }

            this.G = new class00084(() -> "Cloud UTB", 258, jx);
         }

         float f = (float)(var3 - var4.B);
         class02446 class02446;
         if (f + 4.0F < 0.0F) {
            class02446 = class02446.field_53060;
         } else if (f > 0.0F) {
            class02446 = class02446.field_53062;
         } else {
            class02446 = class02446.field_53061;
         }

         float f1 = (float)(var5 % (this.v.y() * 400L)) + var7;
         double d0 = var4.M + f1 * 0.030000001F;
         double d1 = var4.Z + 3.96F;
         double d2 = this.v.y() * 12.0;
         double d3 = this.v.L() * 12.0;
         d0 -= class04995.N(d0 / d2) * d2;
         d1 -= class04995.N(d1 / d3) * d3;
         int k = class04995.N(d0 / 12.0);
         int lx = class04995.N(d1 / 12.0);
         float f2 = (float)(d0 - k * 12.0F);
         float f3 = (float)(d1 - lx * 12.0F);
         boolean flag = var2 == class01301.field_18164;
         RenderPipeline renderpipeline = flag ? class08394.Nn : class08394.Nv;
         if (this.P || k != this.s || lx != this.T || class02446 != this.b || var2 != this.j) {
            this.P = false;
            this.s = k;
            this.T = lx;
            this.b = class02446;
            this.j = var2;
            this.G.L();
            MappedView mappedview = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.G.y(), false, true);

            try {
               this.N(class02446, mappedview.data(), k, lx, flag, ix);
               this.n = mappedview.data().position() / 3;
            } catch (Throwable throwable5) {
               if (mappedview != null) {
                  try {
                     mappedview.close();
                  } catch (Throwable throwable2) {
                     throwable5.addSuppressed(throwable2);
                  }
               }

               throw throwable5;
            }

            if (mappedview != null) {
               mappedview.close();
            }
         }

         if (this.n != 0) {
            MappedView mappedview1 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.t.y(), false, true);

            try {
               Std140Builder.intoBuffer(mappedview1.data()).putVec4(class02566.E(var1)).putVec3(-f2, f, -f3).putVec3(12.0F, 4.0F, 12.0F);
            } catch (Throwable throwable4) {
               if (mappedview1 != null) {
                  try {
                     mappedview1.close();
                  } catch (Throwable throwable1) {
                     throwable4.addSuppressed(throwable1);
                  }
               }

               throw throwable4;
            }

            if (mappedview1 != null) {
               mappedview1.close();
            }

            GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
               .N(RenderSystem.getModelViewMatrix(), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f());
            class08066 class08066x = class06202.Nq().e();
            class08066 class08066x = ((class03063)class06202.Nq().B_2).j();
            ShapeIndexBuffer shapeindexbuffer = RenderSystem.getSequentialBuffer(DrawMode.QUADS);
            GpuBuffer gpubuffer = shapeindexbuffer.getIndexBuffer(6 * this.n);
            GpuTextureView gputextureview;
            GpuTextureView gputextureview1;
            if (class08066x != null) {
               gputextureview = class08066x.u();
               gputextureview1 = class08066x.R();
            } else {
               gputextureview = class08066x.u();
               gputextureview1 = class08066x.R();
            }

            RenderPass renderpass = RenderSystem.getDevice()
               .createCommandEncoder()
               .createRenderPass(() -> "Clouds", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

            try {
               renderpass.setPipeline(renderpipeline);
               RenderSystem.bindDefaultUniforms(renderpass);
               renderpass.setUniform("DynamicTransforms", gpubufferslice);
               renderpass.setIndexBuffer(gpubuffer, shapeindexbuffer.getIndexType());
               renderpass.setUniform("CloudInfo", this.t.y());
               renderpass.setUniform("CloudFaces", this.G.y());
               renderpass.drawIndexed(0, 0, 6 * this.n, 1);
            } catch (Throwable throwable3) {
               if (renderpass != null) {
                  try {
                     renderpass.close();
                  } catch (Throwable throwable) {
                     throwable3.addSuppressed(throwable);
                  }
               }

               throw throwable3;
            }

            if (renderpass != null) {
               renderpass.close();
            }
         }
      }
   }

   private static long N(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      return (long)var0 << 4 | (var1 ? 1 : 0) << 3 | (var2 ? 1 : 0) << 2 | (var3 ? 1 : 0) << 1 | (var4 ? 1 : 0) << 0;
   }

   private static boolean N(long var0) {
      return (var0 >> 3 & 1L) != 0L;
   }

   public void N() {
      this.P = true;
   }

   public class01894 fabric$getId() {
      if (this.l == null) {
         if (this instanceof class08117) {
            this.l = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.l = Client.MODELS;
         } else if (this instanceof class03579) {
            this.l = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.l = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.l = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.l = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.l = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.l = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.l = Client.FONTS;
         } else if (this instanceof class08575) {
            this.l = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.l = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.l = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.l = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.l = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.l = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.l = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.l = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.l = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.l = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.l;
   }
}
