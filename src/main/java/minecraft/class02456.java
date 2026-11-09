package minecraft;

import Nursultan.class10203;
import com.mojang.blaze3d.systems.RenderSystem;

public record class02456(int width, int height, boolean useDepth, int clearColor) implements class02418<class08066> {
   public int L() {
      return this.height;
   }

   public class02456(int width, int height, boolean useDepth, int clearColor) {
      super();
      this.width = width;
      this.height = height;
      this.useDepth = useDepth;
      this.clearColor = clearColor;
   }

   public int i() {
      return this.clearColor;
   }

   public boolean u() {
      return this.useDepth;
   }

   public int y() {
      return this.width;
   }

   public void y(class08066 var1) {
      var1.N();
   }

   @Override
   public boolean N(class02418<?> var1) {
      return !(var1 instanceof class02456 class02456)
         ? false
         : this.width == class02456.width && this.height == class02456.height && this.useDepth == class02456.useDepth;
   }

   public void N(class08066 var1) {
      if (this.useDepth) {
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(var1.L(), this.clearColor, var1.i(), 1.0);
      } else {
         RenderSystem.getDevice().createCommandEncoder().clearColorTexture(var1.L(), this.clearColor);
      }
   }

   public class08066 R() {
      return new class10203(null, this.width, this.height, this.useDepth);
   }
}
