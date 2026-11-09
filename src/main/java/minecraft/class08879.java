package minecraft;

import Nursultan.class10883;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Supplier;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.CompositeRenderer;
import net.irisshaders.iris.pipeline.IrisPipelines;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.ShaderKey;
import net.irisshaders.iris.vertices.ImmediateState;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08879 implements GpuDevice {
   private static final Logger M = LogUtils.getLogger();
   protected static boolean N = true;
   public static boolean y = true;
   public static boolean L = true;
   public static boolean u = true;
   protected static boolean i = true;
   protected static boolean R = true;
   private final CommandEncoder B;
   @Nullable
   private final class08263 Z;
   private final class08859 z;
   private final int U;
   private final class08882 E;
   private final class07607 W;
   private final Map<RenderPipeline, class08870> m;
   private final Map<class08862, class08238> P;
   private final class08865 s;
   private final class00090 T;
   private final Set<String> b;
   private final int j;
   private final int v;
   private Set n = new HashSet();

   private class08870 L(RenderPipeline var1, class07607 var2) {
      return new class08870(var1, this.y(var1, var2));
   }

   public class08865 L() {
      return this.s;
   }

   public String getVendor() {
      return GlStateManager._getString(7936);
   }

   public class08879(long var1, int var3, boolean var4, class07607 var5, boolean var6) {
      super();
      this.m = new IdentityHashMap<>();
      this.P = new HashMap<>();
      this.b = new HashSet<>();
      GLFW.glfwMakeContextCurrent(var1);
      GLCapabilities glcapabilities = GL.createCapabilities();
      int ix = i();
      GLFW.glfwSetWindowSizeLimits(var1, -1, -1, ix, ix);
      class08741 class08741 = class08741.N(this);
      this.Z = class08263.N(var3, var4, this.b);
      this.z = class08859.N(glcapabilities, var6, this.b);
      this.s = class08865.N(glcapabilities, this.z, this.b);
      this.T = class00090.N(glcapabilities, this.b);
      this.E = class08882.N(glcapabilities, this.b, class08741);
      this.U = ix;
      this.W = var5;
      this.B = new class08495(this);
      this.j = GL11.glGetInteger(35380);
      GL11.glEnable(34895);
      GL11.glEnable(34370);
      if (glcapabilities.GL_EXT_texture_filter_anisotropic) {
         this.v = class04995.y(GL11.glGetFloat(34047));
         this.b.add("GL_EXT_texture_filter_anisotropic");
      } else {
         this.v = 1;
      }
   }

   private static int i() {
      int ix = GlStateManager._getInteger(3379);

      for (int jx = Math.max(32768, ix); jx >= 1024; jx >>= 1) {
         GlStateManager._texImage2D(32868, 0, 6408, jx, jx, 0, 6408, 5121, null);
         if (GlStateManager._getTexLevelParameter(32868, 0, 4096) != 0) {
            return jx;
         }
      }

      int k = Math.max(ix, 1024);
      M.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", k);
      return k;
   }

   public void close() {
      this.clearPipelineCache();
   }

   public class00090 u() {
      return this.T;
   }

   public class08882 y() {
      return this.E;
   }

   private class02255 y(RenderPipeline var1, class07607 var2) {
      class08238 class08238x = this.N(var1.getVertexShader(), ShaderType.VERTEX, var1.getShaderDefines(), var2);
      class08238 class08238x = this.N(var1.getFragmentShader(), ShaderType.FRAGMENT, var1.getShaderDefines(), var2);
      if (class08238x == class08238.N) {
         M.error("Couldn't compile pipeline {}: vertex shader {} was invalid", var1.getLocation(), var1.getVertexShader());
         return class02255.field_57864;
      } else if (class08238x == class08238.N) {
         M.error("Couldn't compile pipeline {}: fragment shader {} was invalid", var1.getLocation(), var1.getFragmentShader());
         return class02255.field_57864;
      } else {
         try {
            class02255 class02255 = class02255.method_62896(class08238x, class08238x, var1.getVertexFormat(), var1.getLocation().toString());
            class02255.method_62900(var1.getUniforms(), var1.getSamplers());
            this.z.N(class02255);
            return class02255;
         } catch (class10883 class10883) {
            M.error("Couldn't compile program for pipeline {}: {}", var1.getLocation(), class10883);
            return class02255.field_57864;
         }
      }
   }

   public String getVersion() {
      return GlStateManager._getString(7938);
   }

   private static class02255 N(IrisRenderingPipeline var0, RenderPipeline var1) {
      ShaderKey shaderkey = IrisPipelines.getPipeline(var0, var1);
      return shaderkey == null ? null : var0.getShaderMap().getShader(shaderkey);
   }

   protected class08870 N(RenderPipeline var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? (class08870)callbackinforeturnable.getReturnValue()
         : this.m.computeIfAbsent(var1, var1x -> this.L(var1x, this.W));
   }

   private void N(RenderPipeline var1, CallbackInfoReturnable var2) {
      if (var1 != CompositeRenderer.COMPOSITE_PIPELINE) {
         if (var1 != class08394.yR && var1 != class08394.yM) {
            if (Iris.getPipelineManager().getPipelineNullable() instanceof IrisRenderingPipeline irisrenderingpipeline
               && irisrenderingpipeline.shouldOverrideShaders()
               && !ImmediateState.bypass) {
               class02255 class02255 = N(irisrenderingpipeline, var1);
               if (class02255 != null) {
                  var2.setReturnValue(new class08870(var1, class02255));
               } else if (this.n.add(var1)) {
                  if (var1.getLocation().y().equals("minecraft")) {
                     Iris.logger.fatal("Missing program " + var1.getLocation() + " in override list. This is likely an Iris bug!!!", new Throwable());
                  } else {
                     Iris.logger
                        .error(
                           "Missing program " + var1.getLocation() + " in override list. This is not a critical problem, but it could lead to weird rendering.",
                           new Throwable()
                        );
                  }
               }
            }
         }
      }
   }

   private class08238 N(class08862 var1, class07607 var2) {
      String sx = var2.get(var1.N(), var1.y());
      if (sx == null) {
         M.error("Couldn't find source for {} shader ({})", var1.y(), var1.N());
         return class08238.N;
      } else {
         String s1 = class02770.N(sx, var1.L());
         int ix = GlStateManager.glCreateShader(GlConst.toGl(var1.y()));
         GlStateManager.glShaderSource(ix, s1);
         GlStateManager.glCompileShader(ix);
         if (GlStateManager.glGetShaderi(ix, 35713) == 0) {
            String s2 = StringUtils.trim(GlStateManager.glGetShaderInfoLog(ix, 32768));
            M.error("Couldn't compile {} shader ({}): {}", new Object[]{var1.y().getName(), var1.N(), s2});
            return class08238.N;
         } else {
            class08238 class08238 = new class08238(ix, var1.N(), var1.y());
            this.z.N(class08238);
            return class08238;
         }
      }
   }

   public class08870 precompilePipeline(RenderPipeline var1, @Nullable class07607 var2) {
      class07607 class07607 = var2 == null ? this.W : var2;
      return this.m.computeIfAbsent(var1, var2x -> this.L(var2x, class07607));
   }

   protected class08238 N(class01894 var1, ShaderType var2, class08227 var3, class07607 var4) {
      class08862 class08862 = new class08862(var1, var2, var3);
      return this.P.computeIfAbsent(class08862, var2x -> this.N(var2x, var4));
   }

   public class08859 N() {
      return this.z;
   }

   public class08188 createSampler(AddressMode var1, AddressMode var2, FilterMode var3, FilterMode var4, int var5, OptionalDouble var6) {
      if (var5 >= 1 && var5 <= this.v) {
         return new class08193(var1, var2, var3, var4, var5, var6);
      } else {
         throw new IllegalArgumentException("maxAnisotropy out of range; must be >= 1 and <= " + this.getMaxSupportedAnisotropy() + ", but was " + var5);
      }
   }

   public GpuBuffer createBuffer(@Nullable Supplier<String> var1, int var2, ByteBuffer var3) {
      if (!var3.hasRemaining()) {
         throw new IllegalArgumentException("Buffer source must not be empty");
      } else {
         GlStateManager.clearGlErrors();
         long ix = var3.remaining();
         class08523 class08523 = this.T.N(this.E, var1, var2, var3);
         int jx = GlStateManager._getError();
         if (jx == 1285) {
            throw new class08391("Could not allocate buffer of " + ix + " for " + var1);
         } else if (jx != 0) {
            throw new IllegalStateException("OpenGL error " + jx);
         } else {
            this.z.N(class08523);
            return class08523;
         }
      }
   }

   public GpuBuffer createBuffer(@Nullable Supplier<String> var1, int var2, long var3) {
      if (var3 <= 0L) {
         throw new IllegalArgumentException("Buffer size must be greater than zero");
      } else {
         GlStateManager.clearGlErrors();
         class08523 class08523 = this.T.N(this.E, var1, var2, var3);
         int ix = GlStateManager._getError();
         if (ix == 1285) {
            throw new class08391("Could not allocate buffer of " + var3 + " for " + var1);
         } else if (ix != 0) {
            throw new IllegalStateException("OpenGL error " + ix);
         } else {
            this.z.N(class08523);
            return class08523;
         }
      }
   }

   public int getMaxTextureSize() {
      return this.U;
   }

   public GpuTextureView createTextureView(GpuTexture var1) {
      return this.createTextureView(var1, 0, var1.getMipLevels());
   }

   public GpuTextureView createTextureView(GpuTexture var1, int var2, int var3) {
      if (var1.isClosed()) {
         throw new IllegalArgumentException("Can't create texture view with closed texture");
      } else if (var2 >= 0 && var2 + var3 <= var1.getMipLevels()) {
         return new class09006((class08893)var1, var2, var3);
      } else {
         throw new IllegalArgumentException(
            var3 + " mip levels starting from " + var2 + " would be out of range for texture with only " + var1.getMipLevels() + " mip levels"
         );
      }
   }

   public GpuTexture createTexture(@Nullable Supplier<String> var1, int var2, TextureFormat var3, int var4, int var5, int var6, int var7) {
      return this.createTexture(this.z.y() && var1 != null ? (String)var1.get() : null, var2, var3, var4, var5, var6, var7);
   }

   public GpuTexture createTexture(@Nullable String var1, int var2, TextureFormat var3, int var4, int var5, int var6, int var7) {
      if (var7 < 1) {
         throw new IllegalArgumentException("mipLevels must be at least 1");
      } else if (var6 < 1) {
         throw new IllegalArgumentException("depthOrLayers must be at least 1");
      } else {
         boolean flag = (var2 & 16) != 0;
         if (flag) {
            if (var4 != var5) {
               throw new IllegalArgumentException("Cubemap compatible textures must be square, but size is " + var4 + "x" + var5);
            }

            if (var6 % 6 != 0) {
               throw new IllegalArgumentException("Cubemap compatible textures must have a layer count with a multiple of 6, was " + var6);
            }

            if (var6 > 6) {
               throw new UnsupportedOperationException("Array textures are not yet supported");
            }
         } else if (var6 > 1) {
            throw new UnsupportedOperationException("Array or 3D textures are not yet supported");
         }

         GlStateManager.clearGlErrors();
         int ix = GlStateManager._genTexture();
         if (var1 == null) {
            var1 = String.valueOf(ix);
         }

         char c0;
         if (flag) {
            GL11.glBindTexture(34067, ix);
            c0 = '蔓';
         } else {
            GlStateManager._bindTexture(ix);
            c0 = 3553;
         }

         GlStateManager._texParameter(c0, 33085, var7 - 1);
         GlStateManager._texParameter(c0, 33082, 0);
         GlStateManager._texParameter(c0, 33083, var7 - 1);
         if (var3.hasDepthAspect()) {
            GlStateManager._texParameter(c0, 34892, 0);
         }

         if (flag) {
            for (int jx : GlConst.CUBEMAP_TARGETS) {
               for (int k = 0; k < var7; k++) {
                  GlStateManager._texImage2D(
                     jx, k, GlConst.toGlInternalId(var3), var4 >> k, var5 >> k, 0, GlConst.toGlExternalId(var3), GlConst.toGlType(var3), null
                  );
               }
            }
         } else {
            for (int l = 0; l < var7; l++) {
               GlStateManager._texImage2D(
                  c0, l, GlConst.toGlInternalId(var3), var4 >> l, var5 >> l, 0, GlConst.toGlExternalId(var3), GlConst.toGlType(var3), null
               );
            }
         }

         int i1 = GlStateManager._getError();
         if (i1 == 1285) {
            throw new class08391("Could not allocate texture of " + var4 + "x" + var5 + " for " + var1);
         } else if (i1 != 0) {
            throw new IllegalStateException("OpenGL error " + i1);
         } else {
            class08893 class08893 = new class08893(var2, var1, var3, var4, var5, var6, var7, ix);
            this.z.N(class08893);
            return class08893;
         }
      }
   }

   private static void R() {
      int ix = GlStateManager.glCreateShader(35633);
      int jx = GlStateManager.glCreateProgram();
      GlStateManager.glAttachShader(jx, ix);
      GlStateManager.glDeleteShader(ix);
      GlStateManager.glDeleteProgram(jx);
   }

   public List<String> getEnabledExtensions() {
      return new ArrayList<>(this.b);
   }

   public void clearPipelineCache() {
      for (class08870 class08870 : this.m.values()) {
         if (class08870.y() != class02255.field_57864) {
            class08870.y().close();
         }
      }

      this.m.clear();

      for (class08238 class08238 : this.P.values()) {
         if (class08238 != class08238.N) {
            class08238.close();
         }
      }

      this.P.clear();
      String sx = GlStateManager._getString(7937);
      if (sx.contains("AMD")) {
         R();
      }
   }

   public boolean isDebuggingEnabled() {
      return this.Z != null;
   }

   public String getImplementationInformation() {
      return GLFW.glfwGetCurrentContext() == 0L
         ? "NO CONTEXT"
         : GlStateManager._getString(7937) + " GL version " + GlStateManager._getString(7938) + ", " + GlStateManager._getString(7936);
   }

   public List<String> getLastDebugMessages() {
      return this.Z == null ? Collections.emptyList() : this.Z.N();
   }

   public int getUniformOffsetAlignment() {
      return this.j;
   }

   public CommandEncoder createCommandEncoder() {
      return this.B;
   }

   public String getBackendName() {
      return "OpenGL";
   }

   public String getRenderer() {
      return GlStateManager._getString(7937);
   }

   public int getMaxSupportedAnisotropy() {
      return this.v;
   }
}
