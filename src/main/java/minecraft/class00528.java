package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.Map;

public record class00528(String samplerName, class08918 texture, int width, int height, boolean bilinear) implements class00542 {
   public class08918 L() {
      return this.texture;
   }

   public class00528(String samplerName, class08918 texture, int width, int height, boolean bilinear) {
      super();
      this.samplerName = samplerName;
      this.texture = texture;
      this.width = width;
      this.height = height;
      this.bilinear = bilinear;
   }

   public int i() {
      return this.height;
   }

   public int u() {
      return this.width;
   }

   @Override
   public boolean y() {
      return this.bilinear;
   }

   @Override
   public GpuTextureView y(Map<class01894, class02452<class08066>> var1) {
      return this.texture.method_71659();
   }

   @Override
   public String N() {
      return this.samplerName;
   }

   @Override
   public void N(class02725 var1, Map<class01894, class02452<class08066>> var2) {
   }
}
