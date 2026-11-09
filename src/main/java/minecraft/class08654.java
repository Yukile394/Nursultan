package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.jspecify.annotations.Nullable;

public record class08654(Matrix3x2fc pose, class00941 renderable, class03255 scissorArea) implements class08669 {
   public class08654(Matrix3x2fc pose, class00941 renderable, @Nullable class03255 scissorArea) {
      super();
      this.pose = pose;
      this.renderable = renderable;
      this.scissorArea = scissorArea;
   }

   public class00941 y() {
      return this.renderable;
   }

   public Matrix3x2fc N() {
      return this.pose;
   }

   @Nullable
   @Override
   public class03255 comp_4274() {
      return null;
   }

   @Override
   public void method_70917(class01391 var1) {
      this.renderable.N(new Matrix4f().mul(this.pose), var1, 15728880, true);
   }

   @Override
   public RenderPipeline comp_4055() {
      return this.renderable.N();
   }

   @Override
   public class08679 comp_4056() {
      return class08679.y(this.renderable.y(), RenderSystem.getSamplerCache().N(FilterMode.NEAREST));
   }

   @Nullable
   @Override
   public class03255 comp_4069() {
      return this.scissorArea;
   }
}
