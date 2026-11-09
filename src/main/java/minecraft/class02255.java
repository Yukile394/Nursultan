package minecraft;

import Nursultan.class10883;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline.UniformDescription;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.compat.SkipList;
import net.irisshaders.iris.gl.blending.DepthColorStorage;
import net.irisshaders.iris.mixinterface.ShaderInstanceInterface;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.ShaderRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.ExtendedShader;
import net.irisshaders.iris.pipeline.programs.FallbackShader;
import net.irisshaders.iris.pipeline.programs.IrisProgram;
import net.irisshaders.iris.shadows.ShadowRenderer;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GL31C;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02255 implements AutoCloseable, ShaderInstanceInterface {
   private static final Logger field_58041 = LogUtils.getLogger();
   public static Set<String> field_57863 = Sets.newHashSet(new String[]{"Projection", "Lighting", "Fog", "Globals"});
   public static class02255 field_57864 = new class02255(-1, "invalid");
   public final Map<String, class07345> field_53841 = new HashMap<>();
   private final int field_29493;
   private final String field_57865;
   private static final ImmutableSet ATTRIBUTE_LIST = ImmutableSet.of("Position", "Color", "Normal", "UV0", "UV1", "UV2", new String[0]);
   private static class02255 lastAppliedShader;
   private MethodHandle shouldSkip;

   public class02255(int var1, String var2) {
      super();
      this.field_29493 = var1;
      this.field_57865 = var2;
   }

   @Override
   public String toString() {
      return this.field_57865;
   }

   @Override
   public void close() {
      this.field_53841.values().forEach(class07345::close);
      GlStateManager.glDeleteProgram(this.field_29493);
   }

   private int redirect$bem000$iris$changeIndex(int var1, CharSequence var2) {
      return this instanceof IrisProgram ? ((IrisProgram)this).iris$getBlockIndex(var1, var2) : GL31C.glGetUniformBlockIndex(var1, var2);
   }

   private void redirect$bem000$iris$silence(Logger var1, String var2, Object var3, Object var4) {
      if (!this.isKnownShader()) {
         var1.warn(var2, var3, var4);
      }
   }

   private static boolean shouldOverrideShaders() {
      WorldRenderingPipeline worldrenderingpipeline = Iris.getPipelineManager().getPipelineNullable();
      return worldrenderingpipeline instanceof ShaderRenderingPipeline ? ((ShaderRenderingPipeline)worldrenderingpipeline).shouldOverrideShaders() : false;
   }

   private void iris$unlockDepthColorState(CallbackInfo var1) {
      if (!this.iris$shouldSkipThis()) {
         if (!this.isKnownShader() && shouldOverrideShaders() && Iris.getPipelineManager().getPipelineNullable() instanceof IrisRenderingPipeline) {
            class06202.Nq().e().iris$bindFramebuffer();
         }
      } else {
         DepthColorStorage.unlockDepthColor();
      }
   }

   public boolean iris$shouldSkipThis() {
      if (Iris.getIrisConfig().shouldAllowUnknownShaders()) {
         if (ShadowRenderer.ACTIVE) {
            return true;
         } else if (!shouldOverrideShaders()) {
            return false;
         } else if (this.shouldSkip == SkipList.NONE) {
            return false;
         } else if (this.shouldSkip == SkipList.ALWAYS) {
            return true;
         } else {
            try {
               return (boolean)this.shouldSkip.invoke((class02255)this);
            } catch (Throwable throwable) {
               throw new RuntimeException(throwable);
            }
         }
      } else {
         return !(this instanceof ExtendedShader) && !(this instanceof FallbackShader) && shouldOverrideShaders();
      }
   }

   public void method_62900(List<UniformDescription> var1, List<String> var2) {
      int i = 0;
      int j = 0;

      for (UniformDescription uniformdescription : var1) {
         String s = uniformdescription.name();

         Object object2 = switch (uniformdescription.type()) {
            case field_60031 -> {
               int l2 = this.field_29493;
               int j2 = this.redirect$bem000$iris$changeIndex(l2, s);
               if (j2 == -1) {
                  yield null;
               } else {
                  int k2 = i++;
                  GL31.glUniformBlockBinding(this.field_29493, j2, k2);
                  yield new class07332(k2);
               }
            }
            case field_60032 -> {
               int k = GlStateManager._glGetUniformLocation(this.field_29493, s);
               if (k == -1) {
                  String s2 = this.field_57865;
                  String s1 = "{} shader program does not use utb {} defined in the pipeline. This might be a bug.";
                  Logger logger = field_58041;
                  this.redirect$bem000$iris$silence(logger, s1, s2, s);
                  yield null;
               } else {
                  int l = j++;
                  yield new class07353(k, l, Objects.requireNonNull(uniformdescription.textureFormat()));
               }
            }
         };

         Object object = object1;
         if (object != null) {
            this.field_53841.put(s, (class07345)object);
         }
      }

      for (String s4 : var2) {
         int k1 = GlStateManager._glGetUniformLocation(this.field_29493, s4);
         if (k1 == -1) {
            String s8 = this.field_57865;
            String s6 = "{} shader program does not use sampler {} defined in the pipeline. This might be a bug.";
            Logger logger1 = field_58041;
            this.redirect$bem000$iris$silence(logger1, s6, s8, s4);
         } else {
            int l1 = j++;
            this.field_53841.put(s4, new class07341(k1, l1));
         }
      }

      int i1 = GlStateManager.glGetProgrami(this.field_29493, 35382);

      for (int j1 = 0; j1 < i1; j1++) {
         String s5 = GL31.glGetActiveUniformBlockName(this.field_29493, j1);
         if (!this.field_53841.containsKey(s5)) {
            if (!var2.contains(s5) && field_57863.contains(s5)) {
               int i2 = i++;
               GL31.glUniformBlockBinding(this.field_29493, j1, i2);
               this.field_53841.put(s5, new class07332(i2));
            } else {
               String s3 = this.field_57865;
               String s7 = "Found unknown and unsupported uniform {} in {}";
               Logger logger2 = field_58041;
               this.redirect$bem000$iris$silence(logger2, s7, s5, s3);
            }
         }
      }
   }

   @Nullable
   public class07345 method_34582(String var1) {
      RenderSystem.assertOnRenderThread();
      return this.field_53841.get(var1);
   }

   public Map<String, class07345> method_68406() {
      return this.field_53841;
   }

   public static class02255 method_62896(class08238 var0, class08238 var1, VertexFormat var2, String var3) throws class10883 {
      int i = GlStateManager.glCreateProgram();
      if (i <= 0) {
         throw new class10883("Could not create shader program (returned program ID " + i + ")");
      } else {
         int j = 0;

         for (String s : var2.getElementAttributeNames()) {
            GlStateManager._glBindAttribLocation(i, j, s);
            j++;
         }

         GlStateManager.glAttachShader(i, var0.y());
         GlStateManager.glAttachShader(i, var1.y());
         GlStateManager.glLinkProgram(i);
         int k = GlStateManager.glGetProgrami(i, 35714);
         String s1 = GlStateManager.glGetProgramInfoLog(i, 32768);
         if (k != 0 && !s1.contains("Failed for unknown reason")) {
            if (!s1.isEmpty()) {
               field_58041.info("Info log when linking program containing VS {} and FS {}. Log output: {}", new Object[]{var0.N(), var1.N(), s1});
            }

            return new class02255(i, var3);
         } else {
            throw new class10883("Error encountered when linking program containing VS " + var0.N() + " and FS " + var1.N() + ". Log output: " + s1);
         }
      }
   }

   private boolean isKnownShader() {
      return this instanceof ExtendedShader || this instanceof FallbackShader;
   }

   public void setShouldSkip(MethodHandle var1) {
      this.shouldSkip = var1;
   }

   private void onTail(CallbackInfo var1) {
      if (!this.iris$shouldSkipThis()) {
         if (!this.isKnownShader() && shouldOverrideShaders()) {
            WorldRenderingPipeline worldrenderingpipeline = Iris.getPipelineManager().getPipelineNullable();
            if (worldrenderingpipeline instanceof IrisRenderingPipeline && !ShadowRenderer.ACTIVE) {
               ((IrisRenderingPipeline)worldrenderingpipeline).bindDefault();
            }
         }
      } else {
         if (ImmediateState.isRenderingLevel && !this.isKnownShader()) {
            DepthColorStorage.disableDepthColor();
         } else {
            DepthColorStorage.unlockDepthColor();
         }
      }
   }

   public String method_68404() {
      return this.field_57865;
   }

   public int method_1270() {
      return this.field_29493;
   }

   static {
      SkipList.shouldSkipList.put(ExtendedShader.class, SkipList.NONE);
      SkipList.shouldSkipList.put(FallbackShader.class, SkipList.NONE);
   }
}
