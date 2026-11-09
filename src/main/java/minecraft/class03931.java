package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.ShapeIndexBuffer;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class class03931 implements AutoCloseable {
   private static final int N = 6;
   private final GpuBuffer y;
   private final class00046 L;
   private final class01894 u;

   public class03931(class01894 var1) {
      super();
      this.u = var1;
      this.L = new class00046("cubemap", 0.05F, 10.0F);
      this.y = N();
   }

   @Override
   public void close() {
      this.y.close();
      this.L.close();
   }

   public void N(class08627 var1) {
      var1.N(this.u, (class08918)(new class08998(this.u)));
   }

   private static GpuBuffer N() {
      GpuBuffer gpubuffer;
      try (class02579 class02579 = class02579.N(class07835.i.getVertexSize() * 4 * 6)) {
         class07331 class07331 = new class07331(class02579, DrawMode.QUADS, class07835.i);
         class07331.method_22912(-1.0F, -1.0F, 1.0F);
         class07331.method_22912(-1.0F, 1.0F, 1.0F);
         class07331.method_22912(1.0F, 1.0F, 1.0F);
         class07331.method_22912(1.0F, -1.0F, 1.0F);
         class07331.method_22912(1.0F, -1.0F, 1.0F);
         class07331.method_22912(1.0F, 1.0F, 1.0F);
         class07331.method_22912(1.0F, 1.0F, -1.0F);
         class07331.method_22912(1.0F, -1.0F, -1.0F);
         class07331.method_22912(1.0F, -1.0F, -1.0F);
         class07331.method_22912(1.0F, 1.0F, -1.0F);
         class07331.method_22912(-1.0F, 1.0F, -1.0F);
         class07331.method_22912(-1.0F, -1.0F, -1.0F);
         class07331.method_22912(-1.0F, -1.0F, -1.0F);
         class07331.method_22912(-1.0F, 1.0F, -1.0F);
         class07331.method_22912(-1.0F, 1.0F, 1.0F);
         class07331.method_22912(-1.0F, -1.0F, 1.0F);
         class07331.method_22912(-1.0F, -1.0F, -1.0F);
         class07331.method_22912(-1.0F, -1.0F, 1.0F);
         class07331.method_22912(1.0F, -1.0F, 1.0F);
         class07331.method_22912(1.0F, -1.0F, -1.0F);
         class07331.method_22912(-1.0F, 1.0F, 1.0F);
         class07331.method_22912(-1.0F, 1.0F, -1.0F);
         class07331.method_22912(1.0F, 1.0F, -1.0F);
         class07331.method_22912(1.0F, 1.0F, 1.0F);

         try (class02609 class02609 = class07331.y()) {
            gpubuffer = RenderSystem.getDevice().createBuffer(() -> "Cube map vertex buffer", 32, class02609.N());
         }
      }

      return gpubuffer;
   }

   public void N(class06202 var1, float var2, float var3) {
      RenderSystem.setProjectionMatrix(this.L.y(var1.Nt().U(), var1.Nt().E(), 85.0F), class00312.field_54953);
      RenderPipeline renderpipeline = class08394.yN;
      class08066 class08066 = class06202.Nq().e();
      GpuTextureView gputextureview = class08066.u();
      GpuTextureView gputextureview1 = class08066.R();
      ShapeIndexBuffer shapeindexbuffer = RenderSystem.getSequentialBuffer(DrawMode.QUADS);
      GpuBuffer gpubuffer = shapeindexbuffer.getIndexBuffer(36);
      Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
      matrix4fstack.pushMatrix();
      matrix4fstack.rotationX((float) Math.PI);
      matrix4fstack.rotateX(var2 * (float) (Math.PI / 180.0));
      matrix4fstack.rotateY(var3 * (float) (Math.PI / 180.0));
      GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
         .N(new Matrix4f(matrix4fstack), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), new Matrix4f());
      matrix4fstack.popMatrix();
      RenderPass renderpass = RenderSystem.getDevice()
         .createCommandEncoder()
         .createRenderPass(() -> "Cubemap", gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

      try {
         renderpass.setPipeline(renderpipeline);
         RenderSystem.bindDefaultUniforms(renderpass);
         renderpass.setVertexBuffer(0, this.y);
         renderpass.setIndexBuffer(gpubuffer, shapeindexbuffer.getIndexType());
         renderpass.setUniform("DynamicTransforms", gpubufferslice);
         class08918 class08918 = var1.NO().y(this.u);
         renderpass.bindTexture("Sampler0", class08918.method_71659(), class08918.method_75484());
         renderpass.drawIndexed(0, 0, 36, 1);
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
   }
}
