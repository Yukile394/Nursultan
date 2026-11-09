package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;

public record class06830(GpuTextureView textureView, class08188 sampler) {
   public class06830(GpuTextureView textureView, class08188 sampler) {
      this.textureView = textureView;
      this.sampler = sampler;
   }

   public class08188 y() {
      return this.sampler;
   }

   public GpuTextureView N() {
      return this.textureView;
   }
}
