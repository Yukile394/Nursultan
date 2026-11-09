package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.jtracy.TracyClient;
import java.util.OptionalInt;

public class class08712 implements AutoCloseable {
   private static final int N = 320;
   private static final int y = 180;
   private static final long L = 4L;
   private int u;
   private int i;
   private int R;
   private int M;
   private GpuTexture B;
   private GpuTextureView Z;
   private GpuBuffer z;
   private int U;
   private boolean E;
   private class08692 W = class08692.field_57834;

   public class08712() {
      super();
      this.R = 320;
      this.M = 180;
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.B = gpudevice.createTexture("Tracy Frame Capture", 10, TextureFormat.RGBA8, this.R, this.M, 1, 1);
      this.Z = gpudevice.createTextureView(this.B);
      this.z = gpudevice.createBuffer(() -> "Tracy Frame Capture buffer", 9, this.R * this.M * 4L);
   }

   @Override
   public void close() {
      this.B.close();
      this.Z.close();
      this.z.close();
   }

   public void y() {
      this.U++;
      this.E = false;
      TracyClient.markFrame();
   }

   private void N(int var1, int var2) {
      float f = (float)var1 / var2;
      if (var1 > 320) {
         var1 = 320;
         var2 = (int)(320.0F / f);
      }

      if (var2 > 180) {
         var1 = (int)(180.0F * f);
         var2 = 180;
      }

      var1 = var1 / 4 * 4;
      var2 = var2 / 4 * 4;
      if (this.R != var1 || this.M != var2) {
         this.R = var1;
         this.M = var2;
         GpuDevice gpudevice = RenderSystem.getDevice();
         this.B.close();
         this.B = gpudevice.createTexture("Tracy Frame Capture", 10, TextureFormat.RGBA8, var1, var2, 1, 1);
         this.Z.close();
         this.Z = gpudevice.createTextureView(this.B);
         this.z.close();
         this.z = gpudevice.createBuffer(() -> "Tracy Frame Capture buffer", 9, var1 * var2 * 4L);
      }
   }

   public void N() {
      if (this.W == class08692.field_57836) {
         this.W = class08692.field_57834;
         MappedView mappedview = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.z, true, false);

         try {
            TracyClient.frameImage(mappedview.data(), this.R, this.M, this.U, true);
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
      }
   }

   public void N(class08066 var1) {
      if (this.W == class08692.field_57834 && !this.E && var1.L() != null) {
         this.E = true;
         if (var1.N != this.u || var1.y != this.i) {
            this.u = var1.N;
            this.i = var1.y;
            this.N(this.u, this.i);
         }

         this.W = class08692.field_57835;
         CommandEncoder commandencoder = RenderSystem.getDevice().createCommandEncoder();
         RenderPass renderpass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Tracy blit", this.Z, OptionalInt.empty());

         try {
            renderpass.setPipeline(class08394.Nr);
            renderpass.bindTexture("InSampler", var1.u(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR));
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

         commandencoder.copyTextureToBuffer(this.B, this.z, 0L, () -> this.W = class08692.field_57836, 0);
         this.U = 0;
      }
   }
}
