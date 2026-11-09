package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.Map;

public record class00572(String samplerName, class01894 targetId, boolean depthBuffer, boolean bilinear) implements class00542 {
   public class01894 L() {
      return this.targetId;
   }

   private class02452<class08066> L(Map<class01894, class02452<class08066>> var1) {
      class02452 class02452 = (class02452)var1.get(this.targetId);
      if (class02452 == null) {
         throw new IllegalStateException("Missing handle for target " + this.targetId);
      } else {
         return class02452;
      }
   }

   public class00572(String samplerName, class01894 targetId, boolean depthBuffer, boolean bilinear) {
      this.samplerName = samplerName;
      this.targetId = targetId;
      this.depthBuffer = depthBuffer;
      this.bilinear = bilinear;
   }

   public boolean u() {
      return this.depthBuffer;
   }

   @Override
   public boolean y() {
      return this.bilinear;
   }

   @Override
   public GpuTextureView y(Map<class01894, class02452<class08066>> var1) {
      class08066 class08066 = this.L(var1).get();
      GpuTextureView gputextureview = this.depthBuffer ? class08066.R() : class08066.u();
      if (gputextureview == null) {
         throw new IllegalStateException("Missing " + (this.depthBuffer ? "depth" : "color") + "texture for target " + this.targetId);
      } else {
         return gputextureview;
      }
   }

   @Override
   public String N() {
      return this.samplerName;
   }

   @Override
   public void N(class02725 var1, Map<class01894, class02452<class08066>> var2) {
      var1.N(this.L(var2));
   }
}
