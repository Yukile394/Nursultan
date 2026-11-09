package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderPass.RenderObject;
import com.mojang.blaze3d.systems.RenderSystem.ShapeIndexBuffer;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import java.util.EnumMap;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices;
import net.caffeinemc.mods.sodium.client.util.SodiumChunkSection;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class08760 implements SodiumChunkSection {
   private GpuTextureView textureView;
   private EnumMap<class08743, List<RenderObject<GpuBufferSlice[]>>> drawsPerLayer;
   private int maxIndicesRequired;
   private GpuBufferSlice[] chunkSectionInfos;
   private SodiumWorldRenderer i;
   private ChunkRenderMatrices R;
   private double M;
   private double B;
   private double Z;

   public int L() {
      return this.maxIndicesRequired;
   }

   public class08760(GpuTextureView var1, EnumMap<class08743, List<RenderObject<GpuBufferSlice[]>>> var2, int var3, GpuBufferSlice[] var4) {
      super();
      this.textureView = var1;
      this.drawsPerLayer = var2;
      this.maxIndicesRequired = var3;
      this.chunkSectionInfos = var4;
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class08760
            && Objects.equals(this.textureView, ((class08760)var1).textureView)
            && Objects.equals(this.drawsPerLayer, ((class08760)var1).drawsPerLayer)
            && this.maxIndicesRequired == ((class08760)var1).maxIndicesRequired
            && Objects.equals(this.chunkSectionInfos, ((class08760)var1).chunkSectionInfos);
   }

   @Override
   public final String toString() {
      return "class08760[textureView="
         + Objects.toString(this.textureView)
         + ", drawsPerLayer="
         + Objects.toString(this.drawsPerLayer)
         + ", maxIndicesRequired="
         + Integer.toString(this.maxIndicesRequired)
         + ", chunkSectionInfos="
         + Objects.toString(this.chunkSectionInfos)
         + "]";
   }

   @Override
   public final int hashCode() {
      return (((0 * 31 + Objects.hashCode(this.textureView)) * 31 + Objects.hashCode(this.drawsPerLayer)) * 31 + Integer.hashCode(this.maxIndicesRequired))
            * 31
         + Objects.hashCode(this.chunkSectionInfos);
   }

   public GpuBufferSlice[] u() {
      return this.chunkSectionInfos;
   }

   public EnumMap<class08743, List<RenderObject<GpuBufferSlice[]>>> y() {
      return this.drawsPerLayer;
   }

   private void N(class08768 var1, class08188 var2, CallbackInfo var3) {
      if (this.i != null) {
         var3.cancel();
         RenderDevice.enterManagedCode();

         try {
            this.i.drawChunkLayer(var1, this.R, this.M, this.B, this.Z, var2);
         } finally {
            RenderDevice.exitManagedCode();
         }
      }
   }

   public void N(class08768 var1, class08188 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         ShapeIndexBuffer shapeindexbuffer = RenderSystem.getSequentialBuffer(DrawMode.QUADS);
         GpuBuffer gpubuffer = this.maxIndicesRequired == 0 ? null : shapeindexbuffer.getIndexBuffer(this.maxIndicesRequired);
         IndexType indextype = this.maxIndicesRequired == 0 ? null : shapeindexbuffer.getIndexType();
         class08743[] aclass08743 = var1.y();
         class06202 class06202 = class06202.Nq();
         boolean flag = class07529.t && (Boolean)class06202.U_1;
         class08066 class08066 = var1.L();
         RenderPass renderpass = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(() -> "Section layers for " + var1.N(), class08066.u(), OptionalInt.empty(), class08066.R(), OptionalDouble.empty());

         try {
            RenderSystem.bindDefaultUniforms(renderpass);
            renderpass.bindTexture("Sampler2", ((class03386)class06202.i_5).T().N(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR));

            for (class08743 class08743 : aclass08743) {
               List<RenderObject<GpuBufferSlice[]>> list = this.drawsPerLayer.get(class08743);
               if (!list.isEmpty()) {
                  if (class08743 == class08743.field_60926) {
                     list = list.reversed();
                  }

                  renderpass.setPipeline(flag ? class08394.w : class08743.N());
                  renderpass.bindTexture("Sampler0", this.textureView, var2);
                  renderpass.drawMultipleIndexed(list, gpubuffer, indextype, List.of("ChunkSection"), this.chunkSectionInfos);
               }
            }
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

   public GpuTextureView N() {
      return this.textureView;
   }

   public void sodium$setRendering(SodiumWorldRenderer var1, ChunkRenderMatrices var2, double var3, double var5, double var7) {
      this.i = var1;
      this.R = var2;
      this.M = var3;
      this.B = var5;
      this.Z = var7;
   }
}
