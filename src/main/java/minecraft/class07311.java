package minecraft;

import Nursultan.class11105;
import baritone.utils.accessor.IRenderType;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.ShapeIndexBuffer;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Map.Entry;
import java.util.function.Consumer;
import net.irisshaders.iris.mixin.rendertype.RenderTypeAccessor;
import net.irisshaders.iris.mixinterface.RenderTypeInterface;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class class07311 implements class11105, IRenderType, RenderTypeAccessor, RenderTypeInterface {
   private static final int field_64012 = 1048576;
   public static final int field_64008 = 4194304;
   public static final int field_64009 = 786432;
   public static final int field_64010 = 1536;
   private final class06828 field_64013;
   private final Optional<class07311> field_64014;
   public final String field_64011;

   public class07311(String var1, class06828 var2) {
      super();
      this.field_64011 = var1;
      this.field_64013 = var2;
      this.field_64014 = var2.i == class06823.field_21855
         ? var2.y.values().stream().findFirst().map(var1x -> class06851.N.apply(var1x.N(), var2.N.isCull()))
         : Optional.empty();
   }

   @Override
   public String toString() {
      return "RenderType[" + this.field_64011 + ":" + this.field_64013 + "]";
   }

   public static class07311 method_75940(String var0, class06828 var1) {
      return new class07311(var0, var1);
   }

   public void method_60895(class02609 var1) {
      Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
      Consumer consumer = this.field_64013.U.N();
      if (consumer != null) {
         matrix4fstack.pushMatrix();
         consumer.accept(matrix4fstack);
      }

      GpuBufferSlice gpubufferslice = RenderSystem.getDynamicUniforms()
         .N(RenderSystem.getModelViewMatrix(), new Vector4f(1.0F, 1.0F, 1.0F, 1.0F), new Vector3f(), this.field_64013.L.N());
      Map map = this.field_64013.N();
      class02609 class02609 = var1;

      try {
         GpuBuffer gpubuffer = this.field_64013.N.getVertexFormat().uploadImmediateVertexBuffer(var1.N());
         GpuBuffer gpubuffer1;
         IndexType indextype;
         if (var1.y() == null) {
            ShapeIndexBuffer shapeindexbuffer = RenderSystem.getSequentialBuffer(var1.L().u());
            gpubuffer1 = shapeindexbuffer.getIndexBuffer(var1.L().L());
            indextype = shapeindexbuffer.getIndexType();
         } else {
            gpubuffer1 = this.field_64013.N.getVertexFormat().uploadImmediateIndexBuffer(var1.y());
            indextype = var1.L().i();
         }

         class08066 class08066 = this.field_64013.u.N();
         GpuTextureView gputextureview = RenderSystem.outputColorTextureOverride != null ? RenderSystem.outputColorTextureOverride : class08066.u();
         GpuTextureView gputextureview1 = class08066.u
            ? (RenderSystem.outputDepthTextureOverride != null ? RenderSystem.outputDepthTextureOverride : class08066.R())
            : null;
         RenderPass renderpass = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "Immediate draw for " + this.field_64011, gputextureview, OptionalInt.empty(), gputextureview1, OptionalDouble.empty());

         try {
            renderpass.setPipeline(this.field_64013.N);
            class08681 class08681 = RenderSystem.getScissorStateForRenderTypeDraws();
            if (class08681.y()) {
               renderpass.enableScissor(class08681.L(), class08681.u(), class08681.i(), class08681.R());
            }

            RenderSystem.bindDefaultUniforms(renderpass);
            renderpass.setUniform("DynamicTransforms", gpubufferslice);
            renderpass.setVertexBuffer(0, gpubuffer);

            for (Entry entry : map.entrySet()) {
               renderpass.bindTexture((String)entry.getKey(), ((class06830)entry.getValue()).N(), ((class06830)entry.getValue()).y());
            }

            renderpass.setIndexBuffer(gpubuffer1, indextype);
            renderpass.drawIndexed(0, 0, var1.L().L(), 1);
         } catch (Throwable throwable2) {
            if (renderpass != null) {
               try {
                  renderpass.close();
               } catch (Throwable throwable1) {
                  throwable2.addSuppressed(throwable1);
               }
            }

            throw throwable2;
         }

         if (renderpass != null) {
            renderpass.close();
         }
      } catch (Throwable throwable3) {
         if (var1 != null) {
            try {
               class02609.close();
            } catch (Throwable throwable) {
               throwable3.addSuppressed(throwable);
            }
         }

         throw throwable3;
      }

      if (var1 != null) {
         var1.close();
      }

      if (consumer != null) {
         matrix4fstack.popMatrix();
      }
   }

   public RenderPipeline method_73243() {
      return this.field_64013.N;
   }

   public VertexFormat method_23031() {
      return this.field_64013.N.getVertexFormat();
   }

   public boolean method_23037() {
      return this.field_64013.B;
   }

   public class07311 createRenderType(String var1, class06828 var2) {
      return method_75940(var1, var2);
   }

   public Optional<class07311> method_23289() {
      return this.field_64014;
   }

   public boolean method_24295() {
      return this.field_64013.i == class06823.field_21854;
   }

   public RenderPipeline iris$getPipeline() {
      return this.field_64013.N;
   }

   public boolean method_43332() {
      return !this.method_23033().shareVertices;
   }

   public boolean method_60894() {
      return this.field_64013.Z;
   }

   public int method_22722() {
      return this.field_64013.z;
   }

   public DrawMode method_23033() {
      return this.field_64013.N.getVertexFormatMode();
   }

   public class08066 iris$getRenderTarget() {
      return this.field_64013.u.N();
   }
}
