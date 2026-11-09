package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;

record class00527(String samplerName, GpuTextureView view, class08188 sampler) {

   public class08188 L() {
      return this.sampler;
   }

   class00527(String samplerName, GpuTextureView view, class08188 sampler) {
      super();
      this.samplerName = samplerName;
      this.view = view;
      this.sampler = sampler;
   }

   public GpuTextureView y() {
      return this.view;
   }

   public String N() {
      return this.samplerName;
   }
}
