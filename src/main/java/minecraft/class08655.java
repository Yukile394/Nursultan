package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import org.jspecify.annotations.Nullable;

record class08655(class02609 mesh, RenderPipeline pipeline, class08679 textureSetup, class03255 scissorArea) implements AutoCloseable {

   public class08679 L() {
      return this.textureSetup;
   }

   class08655(class02609 mesh, RenderPipeline pipeline, class08679 textureSetup, @Nullable class03255 scissorArea) {
      this.mesh = mesh;
      this.pipeline = pipeline;
      this.textureSetup = textureSetup;
      this.scissorArea = scissorArea;
   }

   @Override
   public void close() {
      this.mesh.close();
   }

   @Nullable
   public class03255 u() {
      return this.scissorArea;
   }

   public RenderPipeline y() {
      return this.pipeline;
   }

   public class02609 N() {
      return this.mesh;
   }
}
