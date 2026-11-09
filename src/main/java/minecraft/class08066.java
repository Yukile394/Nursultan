package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.util.OptionalInt;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixinterface.RenderTargetInterface;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.targets.Blaze3dRenderTargetExt;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class08066 implements RenderTargetInterface, Blaze3dRenderTargetExt {
   private static int Z = 0;
   public int N;
   public int y;
   protected final String L;
   public final boolean u;
   @Nullable
   protected GpuTexture i;
   @Nullable
   protected GpuTextureView R;
   @Nullable
   protected GpuTexture M;
   @Nullable
   protected GpuTextureView B;
   private int z;
   private int U;

   @Nullable
   public GpuTexture L() {
      return this.i;
   }

   public class08066(@Nullable String var1, boolean var2) {
      super();
      this.L = var1 == null ? "FBO " + Z++ : var1;
      this.u = var2;
   }

   @Nullable
   public GpuTexture i() {
      return this.M;
   }

   @Nullable
   public GpuTextureView u() {
      return this.R;
   }

   public void y() {
      if (this.i == null) {
         throw new IllegalStateException("Can't blit to screen, color texture doesn't exist yet");
      } else {
         RenderSystem.getDevice().createCommandEncoder().presentTexture(this.R);
      }
   }

   public void y(int var1, int var2) {
      RenderSystem.assertOnRenderThread();
      GpuDevice gpudevice = RenderSystem.getDevice();
      int ix = gpudevice.getMaxTextureSize();
      if (var1 > 0 && var1 <= ix && var2 > 0 && var2 <= ix) {
         this.N = var1;
         this.y = var2;
         if (this.u) {
            this.M = gpudevice.createTexture(() -> this.L + " / Depth", 15, TextureFormat.DEPTH32, var1, var2, 1, 1);
            this.B = gpudevice.createTextureView(this.M);
         }

         this.i = gpudevice.createTexture(() -> this.L + " / Color", 15, TextureFormat.RGBA8, var1, var2, 1, 1);
         this.R = gpudevice.createTextureView(this.i);
      } else {
         throw new IllegalArgumentException("Window " + var1 + "x" + var2 + " size out of bounds (max. size: " + ix + ")");
      }
   }

   private void N(boolean var1, CallbackInfo var2) {
      boolean flag = this == class06202.Nq().e();
      Iris.getPipelineManager().getPipeline().ifPresent(var1x -> var1x.setIsMainBound(flag));
   }

   private void N(CallbackInfo var1) {
      this.z++;
      this.U++;
   }

   public void N(int var1, int var2) {
      RenderSystem.assertOnRenderThread();
      this.N();
      this.y(var1, var2);
   }

   public void N() {
      this.N(null);
      RenderSystem.assertOnRenderThread();
      if (this.M != null) {
         this.M.close();
         this.M = null;
      }

      if (this.B != null) {
         this.B.close();
         this.B = null;
      }

      if (this.i != null) {
         this.i.close();
         this.i = null;
      }

      if (this.R != null) {
         this.R.close();
         this.R = null;
      }
   }

   public void N(class08066 var1) {
      RenderSystem.assertOnRenderThread();
      if (this.M == null) {
         throw new IllegalStateException("Trying to copy depth texture to a RenderTarget without a depth texture");
      } else if (var1.M == null) {
         throw new IllegalStateException("Trying to copy depth texture from a RenderTarget without a depth texture");
      } else {
         RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(var1.M, this.M, 0, 0, 0, 0, 0, this.N, this.y);
      }
   }

   public void N(GpuTextureView var1) {
      RenderSystem.assertOnRenderThread();
      RenderPass renderpass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Blit render target", var1, OptionalInt.empty());

      try {
         renderpass.setPipeline(class08394.Nh);
         RenderSystem.bindDefaultUniforms(renderpass);
         renderpass.bindTexture("InSampler", this.R, RenderSystem.getSamplerCache().N(FilterMode.NEAREST));
         renderpass.draw(0, 3);
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

   @Nullable
   public GpuTextureView R() {
      return this.B;
   }

   public int iris$getDepthBufferVersion() {
      return this.z;
   }

   public void iris$bindFramebuffer() {
      GlStateManager._glBindFramebuffer(36160, ((class08893)this.i).N(((class08879)RenderSystem.getDevice()).y(), this.M));
   }

   public int iris$getColorBufferVersion() {
      return this.U;
   }
}
