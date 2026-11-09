package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import org.jspecify.annotations.Nullable;

public abstract class class08672<T extends class08647> implements AutoCloseable {
   protected final class01422 N;
   @Nullable
   private GpuTexture y;
   @Nullable
   private GpuTextureView L;
   @Nullable
   private GpuTexture u;
   @Nullable
   private GpuTextureView i;
   private final class00056 R = new class00056("PIP - " + this.getClass().getSimpleName(), -1000.0F, 1000.0F, true);

   protected class08672(class01422 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void close() {
      if (this.y != null) {
         this.y.close();
      }

      if (this.L != null) {
         this.L.close();
      }

      if (this.u != null) {
         this.u.close();
      }

      if (this.i != null) {
         this.i.close();
      }

      this.R.close();
   }

   protected abstract String y();

   protected abstract void N(T var1, class01421 var2);

   public void N(T var1, class08651 var2, int var3) {
      int ix = (var1.M() - var1.i()) * var3;
      int j = (var1.B() - var1.R()) * var3;
      boolean flag = this.y == null || this.y.getWidth(0) != ix || this.y.getHeight(0) != j;
      if (!flag && this.N((T)var1)) {
         this.N((T)var1, var2);
      } else {
         this.N(flag, ix, j);
         RenderSystem.outputColorTextureOverride = this.L;
         RenderSystem.outputDepthTextureOverride = this.i;
         class01421 class01421 = new class01421();
         class01421.N(ix / 2.0F, this.N(j, var3), 0.0F);
         float f = var3 * var1.N();
         class01421.y(f, f, -f);
         this.N((T)var1, class01421);
         this.N.u();
         RenderSystem.outputColorTextureOverride = null;
         RenderSystem.outputDepthTextureOverride = null;
         this.N((T)var1, var2);
      }
   }

   private void N(boolean var1, int var2, int var3) {
      if (this.y != null && var1) {
         this.y.close();
         this.y = null;
         this.L.close();
         this.L = null;
         this.u.close();
         this.u = null;
         this.i.close();
         this.i = null;
      }

      GpuDevice gpudevice = RenderSystem.getDevice();
      if (this.y == null) {
         this.y = gpudevice.createTexture(() -> "UI " + this.y() + " texture", 12, TextureFormat.RGBA8, var2, var3, 1, 1);
         this.L = gpudevice.createTextureView(this.y);
         this.u = gpudevice.createTexture(() -> "UI " + this.y() + " depth texture", 8, TextureFormat.DEPTH32, var2, var3, 1, 1);
         this.i = gpudevice.createTextureView(this.u);
      }

      gpudevice.createCommandEncoder().clearColorAndDepthTextures(this.y, 0, this.u, 1.0);
      RenderSystem.setProjectionMatrix(this.R.y(var2, var3), class00312.field_54954);
   }

   protected boolean N(T var1) {
      return false;
   }

   protected float N(int var1, int var2) {
      return var1;
   }

   protected void N(T var1, class08651 var2) {
      var2.N(
         new class08661(
            class08394.Np,
            class08679.N(this.L, RenderSystem.getSamplerCache().y(FilterMode.NEAREST)),
            var1.E(),
            var1.i(),
            var1.R(),
            var1.M(),
            var1.B(),
            0.0F,
            1.0F,
            1.0F,
            0.0F,
            -1,
            var1.Z(),
            null
         )
      );
   }

   public abstract Class<T> N();
}
