package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Map.Entry;
import org.lwjgl.system.MemoryStack;

public class class00555 implements AutoCloseable {
   private static final int N = new Std140SizeCalculator().putVec2().get();
   private final String y;
   private final RenderPipeline L;
   private final class01894 u;
   private final Map<String, GpuBuffer> i = new HashMap<>();
   private final class00084 R;
   private final List<class00542> M;

   public class00555(RenderPipeline var1, class01894 var2, Map<String, List<class00069>> var3, List<class00542> var4) {
      super();
      this.L = var1;
      this.y = var1.getLocation().toString();
      this.u = var2;
      this.M = var4;

      for (Entry entry : var3.entrySet()) {
         List list = (List)entry.getValue();
         if (!list.isEmpty()) {
            Std140SizeCalculator std140sizecalculator = new Std140SizeCalculator();

            for (class00069 class00069 : list) {
               class00069.N(std140sizecalculator);
            }

            int ix = std140sizecalculator.get();
            MemoryStack memorystack = MemoryStack.stackPush();

            try {
               Std140Builder std140builder = Std140Builder.onStack(memorystack, ix);
               Iterator iterator = list.iterator();

               while (iterator.hasNext()) {
                  ((class00069)iterator.next()).N(std140builder);
               }

               this.i
                  .put((String)entry.getKey(), RenderSystem.getDevice().createBuffer(() -> this.y + " / " + (String)entry.getKey(), 128, std140builder.get()));
            } catch (Throwable throwable1) {
               if (memorystack != null) {
                  try {
                     memorystack.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (memorystack != null) {
               memorystack.close();
            }
         }
      }

      this.R = new class00084(() -> this.y + " SamplerInfo", 130, (var4.size() + 1) * N);
   }

   @Override
   public void close() {
      Iterator<GpuBuffer> iterator = this.i.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().close();
      }

      this.R.close();
   }

   public void N(class02734 var1, Map<class01894, class02452<class08066>> var2, GpuBufferSlice var3) {
      class02725 class02725 = var1.N(this.y);
      Iterator<class00542> iterator = this.M.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(class02725, var2);
      }

      class02452 class02452 = var2.computeIfPresent(this.u, (var1x, var2x) -> class02725.y(var2x));
      if (class02452 == null) {
         throw new IllegalStateException("Missing handle for target " + this.u);
      } else {
         class02725.N(
            () -> {
               class08066 class08066 = (class08066)class02452.get();
               RenderSystem.backupProjectionMatrix();
               RenderSystem.setProjectionMatrix(var3, class00312.field_54954);
               CommandEncoder commandencoder = RenderSystem.getDevice().createCommandEncoder();
               class08178 class08178 = RenderSystem.getSamplerCache();
               List list = this.M
                  .stream()
                  .map(var2xx -> new class00527(var2xx.N(), var2xx.y(var2), class08178.N(var2xx.y() ? FilterMode.LINEAR : FilterMode.NEAREST)))
                  .toList();
               MappedView var8 = commandencoder.mapBuffer(this.R.y(), false, true);

               try {
                  Std140Builder var9 = Std140Builder.intoBuffer(var8.data());
                  var9.putVec2(class08066.N, class08066.y);

                  for (class00527 class00527x : list) {
                     var9.putVec2(class00527x.y().getWidth(0), class00527x.y().getHeight(0));
                  }
               } catch (Throwable throwable3) {
                  if (var8 != null) {
                     try {
                        var8.close();
                     } catch (Throwable throwable1) {
                        throwable3.addSuppressed(throwable1);
                     }
                  }

                  throw throwable3;
               }

               if (var8 != null) {
                  var8.close();
               }

               RenderPass renderpass = commandencoder.createRenderPass(
                  () -> "Post pass " + this.y, class08066.u(), OptionalInt.empty(), class08066.u ? class08066.R() : null, OptionalDouble.empty()
               );

               try {
                  renderpass.setPipeline(this.L);
                  RenderSystem.bindDefaultUniforms(renderpass);
                  renderpass.setUniform("SamplerInfo", this.R.y());

                  for (Entry entry : this.i.entrySet()) {
                     renderpass.setUniform((String)entry.getKey(), (GpuBuffer)entry.getValue());
                  }

                  for (class00527 class00527 : list) {
                     renderpass.bindTexture(class00527.N() + "Sampler", class00527.y(), class00527.L());
                  }

                  renderpass.draw(0, 3);
               } catch (Throwable throwable2) {
                  if (renderpass != null) {
                     try {
                        renderpass.close();
                     } catch (Throwable throwable) {
                        throwable2.addSuppressed(throwable);
                     }
                  }

                  throw throwable2;
               }

               if (renderpass != null) {
                  renderpass.close();
               }

               this.R.L();
               RenderSystem.restoreProjectionMatrix();

               for (class00542 class00542 : this.M) {
                  class00542.N(var2);
               }
            }
         );
      }
   }
}
