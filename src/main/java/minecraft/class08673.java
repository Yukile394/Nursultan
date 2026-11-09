package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.client.rendering.DrawAccessor;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
record class08673(
   GpuBuffer vertexBuffer, int baseVertex, DrawMode mode, int indexCount, RenderPipeline pipeline, class08679 textureSetup, class03255 scissorArea
) implements DrawAccessor {

   public DrawMode L() {
      return this.mode;
   }

   @Nullable
   public class03255 M() {
      return this.scissorArea;
   }

   class08673(
      GpuBuffer vertexBuffer, int baseVertex, DrawMode mode, int indexCount, RenderPipeline pipeline, class08679 textureSetup, @Nullable class03255 scissorArea
   ) {
      super();
      this.vertexBuffer = vertexBuffer;
      this.baseVertex = baseVertex;
      this.mode = mode;
      this.indexCount = indexCount;
      this.pipeline = pipeline;
      this.textureSetup = textureSetup;
      this.scissorArea = scissorArea;
   }

   public RenderPipeline i() {
      return this.pipeline;
   }

   public int u() {
      return this.indexCount;
   }

   public int y() {
      return this.baseVertex;
   }

   public GpuBuffer N() {
      return this.vertexBuffer;
   }

   public class08679 R() {
      return this.textureSetup;
   }
}
